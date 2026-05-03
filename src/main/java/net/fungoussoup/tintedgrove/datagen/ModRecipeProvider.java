package net.fungoussoup.tintedgrove.datagen;

import net.fungoussoup.tintedgrove.TintedGrove;
import net.fungoussoup.tintedgrove.block.ModBlocks;
import net.fungoussoup.tintedgrove.item.ModItems;
import net.fungoussoup.tintedgrove.util.TintedColor;
import net.fungoussoup.tintedgrove.util.TintedFlowerType;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> woodSmeltables = new ArrayList<>();

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TINTER.get(), 1)
                .requires(Items.WHITE_DYE)
                .unlockedBy("has_white_dye", has(Items.WHITE_DYE)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PALE_ORANGE.get(), 2)
                .requires(ModItems.TINTER)
                .requires(Items.ORANGE_DYE)
                .unlockedBy("has_tinter", has(ModItems.TINTER)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PALE_MAGENTA.get(), 2)
                .requires(ModItems.TINTER)
                .requires(Items.MAGENTA_DYE)
                .unlockedBy("has_tinter", has(ModItems.TINTER)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PALE_LIGHT_BLUE.get(), 2)
                .requires(ModItems.TINTER)
                .requires(Items.LIGHT_BLUE_DYE)
                .unlockedBy("has_tinter", has(ModItems.TINTER)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PALE_YELLOW.get(), 2)
                .requires(ModItems.TINTER)
                .requires(Items.YELLOW_DYE)
                .unlockedBy("has_tinter", has(ModItems.TINTER)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PALE_LIME.get(), 2)
                .requires(ModItems.TINTER)
                .requires(Items.LIME_DYE)
                .unlockedBy("has_tinter", has(ModItems.TINTER)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PALE_PINK.get(), 2)
                .requires(ModItems.TINTER)
                .requires(Items.PINK_DYE)
                .unlockedBy("has_tinter", has(ModItems.TINTER)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PALE_CYAN.get(), 2)
                .requires(ModItems.TINTER)
                .requires(Items.CYAN_DYE)
                .unlockedBy("has_tinter", has(ModItems.TINTER)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PALE_PURPLE.get(), 2)
                .requires(ModItems.TINTER)
                .requires(Items.PURPLE_DYE)
                .unlockedBy("has_tinter", has(ModItems.TINTER)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PALE_BLUE.get(), 2)
                .requires(ModItems.TINTER)
                .requires(Items.BLUE_DYE)
                .unlockedBy("has_tinter", has(ModItems.TINTER)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PALE_BROWN.get(), 2)
                .requires(ModItems.TINTER)
                .requires(Items.BROWN_DYE)
                .unlockedBy("has_tinter", has(ModItems.TINTER)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PALE_GREEN.get(), 2)
                .requires(ModItems.TINTER)
                .requires(Items.GREEN_DYE)
                .unlockedBy("has_tinter", has(ModItems.TINTER)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PALE_RED.get(), 2)
                .requires(ModItems.TINTER)
                .requires(Items.RED_DYE)
                .unlockedBy("has_tinter", has(ModItems.TINTER)).save(recipeOutput);

        for (TintedColor color : TintedColor.values()) {
            woodSmeltables.add(ModBlocks.getLog(color));
            woodSmeltables.add(ModBlocks.getWood(color));
            woodSmeltables.add(ModBlocks.getStrippedLog(color));
            woodSmeltables.add(ModBlocks.getStrippedWood(color));
        }

        oreSmelting(recipeOutput, woodSmeltables, RecipeCategory.MISC, Items.CHARCOAL, 0.25f, 200, "charcoal");

        for (TintedColor color : TintedColor.values()) {
            buildWoodSetRecipes(recipeOutput, color);
            buildSaplingRecipe(recipeOutput, color);
            buildFlowerRecipes(recipeOutput, color);
        }
    }

    private void buildWoodSetRecipes(RecipeOutput recipeOutput, TintedColor color) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.getWood(color).get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.getLog(color).get())
                .unlockedBy("has_" + color.blockName("log"), has(ModBlocks.getLog(color)))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.getStrippedWood(color).get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.getStrippedLog(color).get())
                .unlockedBy("has_stripped_" + color.blockName("log"), has(ModBlocks.getStrippedLog(color)))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.getPlanks(color).get(), 4)
                .requires(ModBlocks.getLog(color))
                .unlockedBy("has_" + color.blockName("log"), has(ModBlocks.getLog(color)))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.getPlanks(color).get(), 4)
                .requires(ModBlocks.getWood(color))
                .unlockedBy("has_" + color.blockName("wood"), has(ModBlocks.getWood(color)))
                .save(recipeOutput, TintedGrove.MOD_ID + ":" + color.blockName("plank") + "_from_" + color.blockName("wood"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.getPlanks(color).get(), 4)
                .requires(ModBlocks.getStrippedLog(color))
                .unlockedBy("has_" + color.blockName("log"), has(ModBlocks.getLog(color)))
                .save(recipeOutput, TintedGrove.MOD_ID + ":" + color.blockName("plank") + "_from_stripped_" + color.blockName("log"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.getPlanks(color).get(), 4)
                .requires(ModBlocks.getStrippedWood(color))
                .unlockedBy("has_" + color.blockName("wood"), has(ModBlocks.getWood(color)))
                .save(recipeOutput, TintedGrove.MOD_ID + ":" + color.blockName("plank") + "_from_stripped_" + color.blockName("wood"));

        stairBuilder(ModBlocks.getWoodStairs(color).get(), Ingredient.of(ModBlocks.getPlanks(color)))
                .group(color.blockName("wood"))
                .unlockedBy("has_" + color.blockName("wood"), has(ModBlocks.getPlanks(color)))
                .save(recipeOutput);

        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.getWoodSlab(color).get(), ModBlocks.getPlanks(color).get());

        buttonBuilder(ModBlocks.getWoodButton(color).get(), Ingredient.of(ModBlocks.getPlanks(color).get()))
                .group(color.blockName("wood"))
                .unlockedBy("has_" + color.blockName("wood"), has(ModBlocks.getPlanks(color).get()))
                .save(recipeOutput);

        pressurePlate(recipeOutput, ModBlocks.getWoodPressurePlate(color).get(), ModBlocks.getPlanks(color).get());

        fenceBuilder(ModBlocks.getWoodFence(color).get(), Ingredient.of(ModBlocks.getPlanks(color).get()))
                .group(color.blockName("wood"))
                .unlockedBy("has_" + color.blockName("wood"), has(ModBlocks.getPlanks(color).get()))
                .save(recipeOutput);

        fenceGateBuilder(ModBlocks.getWoodFenceGate(color).get(), Ingredient.of(ModBlocks.getPlanks(color).get()))
                .group(color.blockName("wood"))
                .unlockedBy("has_" + color.blockName("wood"), has(ModBlocks.getPlanks(color).get()))
                .save(recipeOutput);

        doorBuilder(ModBlocks.getWoodDoor(color).get(), Ingredient.of(ModBlocks.getPlanks(color).get()))
                .group(color.blockName("wood"))
                .unlockedBy("has_" + color.blockName("wood"), has(ModBlocks.getPlanks(color).get()))
                .save(recipeOutput);

        trapdoorBuilder(ModBlocks.getWoodTrapdoor(color).get(), Ingredient.of(ModBlocks.getPlanks(color).get()))
                .group(color.blockName("wood"))
                .unlockedBy("has_" + color.blockName("wood"), has(ModBlocks.getPlanks(color).get()))
                .save(recipeOutput);
    }



    private void buildSaplingRecipe(RecipeOutput recipeOutput, TintedColor color) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.getSapling(color).get())
                .pattern(" D ")
                .pattern("DSD")
                .pattern(" D ")
                .define('D', getDyeForColor(color))
                .define('S', Blocks.OAK_SAPLING)
                .unlockedBy("has_" + color.getId() + "_dye", has(getDyeForColor(color)))
                .save(recipeOutput);
    }

    private void buildFlowerRecipes(RecipeOutput recipeOutput, TintedColor color) {
        for (TintedFlowerType type : TintedFlowerType.values()) {

            ShapedRecipeBuilder.shaped(
                            RecipeCategory.DECORATIONS,
                            ModBlocks.FLOWERS.get(type).get(color).get()
                    )
                    .pattern(" D ")
                    .pattern("DFD")
                    .pattern(" D ")
                    .define('D', getDyeForColor(color))
                    .define('F', getBaseFlower(type))
                    .unlockedBy("has_" + color.getId() + "_dye", has(getDyeForColor(color)))
                    .save(recipeOutput);
        }
    }

    private Item getDyeForColor(TintedColor color) {
        return switch (color) {
            case WHITE -> Items.WHITE_DYE;
            case ORANGE -> Items.ORANGE_DYE;
            case MAGENTA -> Items.MAGENTA_DYE;
            case LIGHT_BLUE -> Items.LIGHT_BLUE_DYE;
            case YELLOW -> Items.YELLOW_DYE;
            case LIME -> Items.LIME_DYE;
            case PINK -> Items.PINK_DYE;
            case GRAY -> Items.GRAY_DYE;
            case LIGHT_GRAY -> Items.LIGHT_GRAY_DYE;
            case CYAN -> Items.CYAN_DYE;
            case PURPLE -> Items.PURPLE_DYE;
            case BLUE -> Items.BLUE_DYE;
            case BROWN -> Items.BROWN_DYE;
            case GREEN -> Items.GREEN_DYE;
            case RED -> Items.RED_DYE;
            case BLACK -> Items.BLACK_DYE;

            case PALE_ORANGE -> ModItems.PALE_ORANGE.get();
            case PALE_MAGENTA -> ModItems.PALE_MAGENTA.get();
            case PALE_LIGHT_BLUE -> ModItems.PALE_LIGHT_BLUE.get();
            case PALE_YELLOW -> ModItems.PALE_YELLOW.get();
            case PALE_LIME -> ModItems.PALE_LIME.get();
            case PALE_PINK -> ModItems.PALE_PINK.get();
            case PALE_CYAN -> ModItems.PALE_CYAN.get();
            case PALE_PURPLE -> ModItems.PALE_PURPLE.get();
            case PALE_BLUE -> ModItems.PALE_BLUE.get();
            case PALE_BROWN -> ModItems.PALE_BROWN.get();
            case PALE_GREEN -> ModItems.PALE_GREEN.get();
            case PALE_RED -> ModItems.PALE_RED.get();
        };
    }

    private ItemLike getBaseFlower(TintedFlowerType type) {
        return switch (type) {
            case DANDELION -> Blocks.DANDELION;
            case POPPY -> Blocks.POPPY;
            case TULIP -> Blocks.WHITE_TULIP;
            case ORCHID -> Blocks.BLUE_ORCHID;
            case ALLIUM -> Blocks.ALLIUM;
            case AZURE_BLUET -> Blocks.AZURE_BLUET;
            case OXEYE_DAISY -> Blocks.OXEYE_DAISY;
            case CORNFLOWER -> Blocks.CORNFLOWER;
            case LILY_OF_THE_VALLEY -> Blocks.LILY_OF_THE_VALLEY;
        };
    }



    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput,
                                                                       RecipeSerializer<T> pCookingSerializer,
                                                                       AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients,
                                                                       RecipeCategory pCategory,
                                                                       ItemLike pResult,
                                                                       float pExperience,
                                                                       int pCookingTime,
                                                                       String pGroup,
                                                                       String pRecipeName) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime,
                            pCookingSerializer, factory)
                    .group(pGroup)
                    .unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, TintedGrove.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
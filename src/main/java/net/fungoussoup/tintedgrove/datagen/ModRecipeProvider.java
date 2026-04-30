package net.fungoussoup.tintedgrove.datagen;

import net.fungoussoup.tintedgrove.TintedGrove;
import net.fungoussoup.tintedgrove.block.ModBlocks;
import net.fungoussoup.tintedgrove.util.TintedColor;
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

            case PALE_ORANGE -> Items.ORANGE_CONCRETE;
            case PALE_MAGENTA -> Items.MAGENTA_CONCRETE;
            case PALE_LIGHT_BLUE -> Items.LIGHT_BLUE_CONCRETE;
            case PALE_YELLOW -> Items.YELLOW_CONCRETE;
            case PALE_LIME -> Items.LIME_CONCRETE;
            case PALE_PINK -> Items.PINK_CONCRETE;
            case PALE_CYAN -> Items.CYAN_CONCRETE;
            case PALE_PURPLE -> Items.PURPLE_CONCRETE;
            case PALE_BLUE -> Items.BLUE_CONCRETE;
            case PALE_BROWN -> Items.BROWN_CONCRETE;
            case PALE_GREEN -> Items.GREEN_CONCRETE;
            case PALE_RED -> Items.RED_CONCRETE;
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
package net.fungoussoup.tintedgrove.datagen;

import net.fungoussoup.tintedgrove.TintedGrove;
import net.fungoussoup.tintedgrove.block.ModBlocks;
import net.fungoussoup.tintedgrove.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> WOOD_SMELTABLES = List.of(
                ModBlocks.RED_LOG,
                ModBlocks.RED_WOOD,
                ModBlocks.STRIPPED_RED_LOG,
                ModBlocks.STRIPPED_RED_WOOD,

                ModBlocks.BLUE_LOG,
                ModBlocks.BLUE_WOOD,
                ModBlocks.STRIPPED_BLUE_LOG,
                ModBlocks.STRIPPED_BLUE_WOOD,

                ModBlocks.GREEN_LOG,
                ModBlocks.GREEN_WOOD,
                ModBlocks.STRIPPED_GREEN_LOG,
                ModBlocks.STRIPPED_GREEN_WOOD,

                ModBlocks.YELLOW_LOG,
                ModBlocks.YELLOW_WOOD,
                ModBlocks.STRIPPED_YELLOW_LOG,
                ModBlocks.STRIPPED_YELLOW_WOOD,

                ModBlocks.PURPLE_LOG,
                ModBlocks.PURPLE_WOOD,
                ModBlocks.STRIPPED_PURPLE_LOG,
                ModBlocks.STRIPPED_PURPLE_WOOD,

                ModBlocks.CYAN_LOG,
                ModBlocks.CYAN_WOOD,
                ModBlocks.STRIPPED_CYAN_LOG,
                ModBlocks.STRIPPED_CYAN_WOOD,

                ModBlocks.ORANGE_LOG,
                ModBlocks.ORANGE_WOOD,
                ModBlocks.STRIPPED_ORANGE_LOG,
                ModBlocks.STRIPPED_ORANGE_WOOD,

                ModBlocks.LIME_LOG,
                ModBlocks.LIME_WOOD,
                ModBlocks.STRIPPED_LIME_LOG,
                ModBlocks.STRIPPED_LIME_WOOD,

                ModBlocks.PINK_LOG,
                ModBlocks.PINK_WOOD,
                ModBlocks.STRIPPED_PINK_LOG,
                ModBlocks.STRIPPED_PINK_WOOD,

                ModBlocks.BROWN_LOG,
                ModBlocks.BROWN_WOOD,
                ModBlocks.STRIPPED_BROWN_LOG,
                ModBlocks.STRIPPED_BROWN_WOOD,
                
                ModBlocks.BLACK_LOG,
                ModBlocks.BLACK_WOOD,
                ModBlocks.STRIPPED_BLACK_LOG,
                ModBlocks.STRIPPED_BLACK_WOOD,

                ModBlocks.WHITE_LOG,
                ModBlocks.WHITE_WOOD,
                ModBlocks.STRIPPED_WHITE_LOG,
                ModBlocks.STRIPPED_WHITE_WOOD,

                ModBlocks.GRAY_LOG,
                ModBlocks.GRAY_WOOD,
                ModBlocks.STRIPPED_GRAY_LOG,
                ModBlocks.STRIPPED_GRAY_WOOD,

                ModBlocks.LIGHT_GRAY_LOG,
                ModBlocks.LIGHT_GRAY_WOOD,
                ModBlocks.STRIPPED_LIGHT_GRAY_LOG,
                ModBlocks.STRIPPED_LIGHT_GRAY_WOOD,

                ModBlocks.LIGHT_BLUE_LOG,
                ModBlocks.LIGHT_BLUE_WOOD,
                ModBlocks.STRIPPED_LIGHT_BLUE_LOG,
                ModBlocks.STRIPPED_LIGHT_BLUE_WOOD,

                ModBlocks.MAGENTA_LOG,
                ModBlocks.MAGENTA_WOOD,
                ModBlocks.STRIPPED_MAGENTA_LOG,
                ModBlocks.STRIPPED_MAGENTA_WOOD
                );

        oreSmelting(recipeOutput, WOOD_SMELTABLES, RecipeCategory.MISC, Items.CHARCOAL, 0.25f,200,"charcoal");

        // RED

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RED_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.RED_LOG.get())
                .unlockedBy("has_red_log", has(ModBlocks.RED_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_RED_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.STRIPPED_RED_LOG.get())
                .unlockedBy("has_stripped_red_log", has(ModBlocks.STRIPPED_RED_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.RED_PLANK.get(), 4)
                .requires(ModBlocks.RED_LOG)
                .unlockedBy("has_red_log", has(ModBlocks.RED_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.RED_PLANK.get(), 4)
                .requires(ModBlocks.RED_WOOD)
                .unlockedBy("has_red_wood", has(ModBlocks.RED_WOOD)).save(recipeOutput,"tintedgrove:red_plank_from_red_wood");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.RED_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_RED_LOG)
                .unlockedBy("has_red_log", has(ModBlocks.RED_LOG)).save(recipeOutput, "tintedgrove:red_plank_from_stripped_red_log");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.RED_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_RED_WOOD)
                .unlockedBy("has_red_wood", has(ModBlocks.RED_WOOD)).save(recipeOutput,"tintedgrove:red_plank_from_stripped_red_wood");
        stairBuilder(ModBlocks.RED_WOOD_STAIRS.get(), Ingredient.of(ModBlocks.RED_PLANK)).group("red_wood")
                        .unlockedBy("has_red_wood", has(ModBlocks.RED_PLANK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_WOOD_SLAB.get(), ModBlocks.RED_PLANK.get());
        buttonBuilder(ModBlocks.RED_WOOD_BUTTON.get(), Ingredient.of(ModBlocks.RED_PLANK.get())).group("red_wood")
                .unlockedBy("has_red_wood", has(ModBlocks.RED_PLANK.get())).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.RED_WOOD_PRESSURE_PLATE.get(), ModBlocks.RED_PLANK.get());
        fenceBuilder(ModBlocks.RED_WOOD_FENCE.get(), Ingredient.of(ModBlocks.RED_PLANK.get())).group("red_wood")
                .unlockedBy("has_red_wood", has(ModBlocks.RED_PLANK.get())).save(recipeOutput);
        fenceGateBuilder(ModBlocks.RED_WOOD_FENCE_GATE.get(), Ingredient.of(ModBlocks.RED_PLANK.get())).group("red_wood")
                .unlockedBy("has_red_wood", has(ModBlocks.RED_PLANK.get())).save(recipeOutput);
        doorBuilder(ModBlocks.RED_WOOD_DOOR.get(), Ingredient.of(ModBlocks.RED_PLANK.get())).group("red_wood")
                .unlockedBy("has_red_wood", has(ModBlocks.RED_PLANK.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.RED_WOOD_TRAPDOOR.get(), Ingredient.of(ModBlocks.RED_PLANK.get())).group("red_wood")
                .unlockedBy("has_red_wood", has(ModBlocks.RED_PLANK.get())).save(recipeOutput);

        // BLUE

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLUE_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.BLUE_LOG.get())
                .unlockedBy("has_blue_log", has(ModBlocks.BLUE_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_BLUE_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.STRIPPED_BLUE_LOG.get())
                .unlockedBy("has_stripped_blue_log", has(ModBlocks.STRIPPED_BLUE_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.BLUE_PLANK.get(), 4)
                .requires(ModBlocks.BLUE_LOG)
                .unlockedBy("has_blue_log", has(ModBlocks.BLUE_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.BLUE_PLANK.get(), 4)
                .requires(ModBlocks.BLUE_WOOD)
                .unlockedBy("has_blue_wood", has(ModBlocks.BLUE_WOOD)).save(recipeOutput,"tintedgrove:blue_plank_from_blue_wood");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.BLUE_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_BLUE_LOG)
                .unlockedBy("has_blue_log", has(ModBlocks.BLUE_LOG)).save(recipeOutput, "tintedgrove:blue_plank_from_stripped_blue_log");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.BLUE_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_BLUE_WOOD)
                .unlockedBy("has_blue_wood", has(ModBlocks.BLUE_WOOD)).save(recipeOutput,"tintedgrove:blue_plank_from_stripped_blue_wood");
        stairBuilder(ModBlocks.BLUE_WOOD_STAIRS.get(), Ingredient.of(ModBlocks.BLUE_PLANK)).group("blue_wood")
                .unlockedBy("has_blue_wood", has(ModBlocks.BLUE_PLANK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_WOOD_SLAB.get(), ModBlocks.BLUE_PLANK.get());
        buttonBuilder(ModBlocks.BLUE_WOOD_BUTTON.get(), Ingredient.of(ModBlocks.BLUE_PLANK.get())).group("blue_wood")
                .unlockedBy("has_blue_wood", has(ModBlocks.BLUE_PLANK.get())).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.BLUE_WOOD_PRESSURE_PLATE.get(), ModBlocks.BLUE_PLANK.get());
        fenceBuilder(ModBlocks.BLUE_WOOD_FENCE.get(), Ingredient.of(ModBlocks.BLUE_PLANK.get())).group("blue_wood")
                .unlockedBy("has_blue_wood", has(ModBlocks.BLUE_PLANK.get())).save(recipeOutput);
        fenceGateBuilder(ModBlocks.BLUE_WOOD_FENCE_GATE.get(), Ingredient.of(ModBlocks.BLUE_PLANK.get())).group("blue_wood")
                .unlockedBy("has_blue_wood", has(ModBlocks.BLUE_PLANK.get())).save(recipeOutput);
        doorBuilder(ModBlocks.BLUE_WOOD_DOOR.get(), Ingredient.of(ModBlocks.BLUE_PLANK.get())).group("blue_wood")
                .unlockedBy("has_blue_wood", has(ModBlocks.BLUE_PLANK.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.BLUE_WOOD_TRAPDOOR.get(), Ingredient.of(ModBlocks.BLUE_PLANK.get())).group("blue_wood")
                .unlockedBy("has_blue_wood", has(ModBlocks.BLUE_PLANK.get())).save(recipeOutput);

        // GREEN

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GREEN_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.GREEN_LOG.get())
                .unlockedBy("has_green_log", has(ModBlocks.GREEN_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_GREEN_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.STRIPPED_GREEN_LOG.get())
                .unlockedBy("has_stripped_green_log", has(ModBlocks.STRIPPED_GREEN_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.GREEN_PLANK.get(), 4)
                .requires(ModBlocks.GREEN_LOG)
                .unlockedBy("has_green_log", has(ModBlocks.GREEN_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.GREEN_PLANK.get(), 4)
                .requires(ModBlocks.GREEN_WOOD)
                .unlockedBy("has_green_wood", has(ModBlocks.GREEN_WOOD)).save(recipeOutput,"tintedgrove:green_plank_from_green_wood");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.GREEN_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_GREEN_LOG)
                .unlockedBy("has_green_log", has(ModBlocks.GREEN_LOG)).save(recipeOutput, "tintedgrove:green_plank_from_stripped_green_log");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.GREEN_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_GREEN_WOOD)
                .unlockedBy("has_green_wood", has(ModBlocks.GREEN_WOOD)).save(recipeOutput,"tintedgrove:green_plank_from_stripped_green_wood");
        stairBuilder(ModBlocks.GREEN_WOOD_STAIRS.get(), Ingredient.of(ModBlocks.GREEN_PLANK)).group("green_wood")
                .unlockedBy("has_green_wood", has(ModBlocks.GREEN_PLANK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_WOOD_SLAB.get(), ModBlocks.GREEN_PLANK.get());
        buttonBuilder(ModBlocks.GREEN_WOOD_BUTTON.get(), Ingredient.of(ModBlocks.GREEN_PLANK.get())).group("green_wood")
                .unlockedBy("has_green_wood", has(ModBlocks.GREEN_PLANK.get())).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.GREEN_WOOD_PRESSURE_PLATE.get(), ModBlocks.GREEN_PLANK.get());
        fenceBuilder(ModBlocks.GREEN_WOOD_FENCE.get(), Ingredient.of(ModBlocks.GREEN_PLANK.get())).group("green_wood")
                .unlockedBy("has_green_wood", has(ModBlocks.GREEN_PLANK.get())).save(recipeOutput);
        fenceGateBuilder(ModBlocks.GREEN_WOOD_FENCE_GATE.get(), Ingredient.of(ModBlocks.GREEN_PLANK.get())).group("green_wood")
                .unlockedBy("has_green_wood", has(ModBlocks.GREEN_PLANK.get())).save(recipeOutput);
        doorBuilder(ModBlocks.GREEN_WOOD_DOOR.get(), Ingredient.of(ModBlocks.GREEN_PLANK.get())).group("green_wood")
                .unlockedBy("has_green_wood", has(ModBlocks.GREEN_PLANK.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.GREEN_WOOD_TRAPDOOR.get(), Ingredient.of(ModBlocks.GREEN_PLANK.get())).group("green_wood")
                .unlockedBy("has_green_wood", has(ModBlocks.GREEN_PLANK.get())).save(recipeOutput);

        // YELLOW

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.YELLOW_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.YELLOW_LOG.get())
                .unlockedBy("has_yellow_log", has(ModBlocks.YELLOW_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_YELLOW_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.STRIPPED_YELLOW_LOG.get())
                .unlockedBy("has_stripped_yellow_log", has(ModBlocks.STRIPPED_YELLOW_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.YELLOW_PLANK.get(), 4)
                .requires(ModBlocks.YELLOW_LOG)
                .unlockedBy("has_yellow_log", has(ModBlocks.YELLOW_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.YELLOW_PLANK.get(), 4)
                .requires(ModBlocks.YELLOW_WOOD)
                .unlockedBy("has_yellow_wood", has(ModBlocks.YELLOW_WOOD)).save(recipeOutput,"tintedgrove:yellow_plank_from_yellow_wood");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.YELLOW_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_YELLOW_LOG)
                .unlockedBy("has_yellow_log", has(ModBlocks.YELLOW_LOG)).save(recipeOutput, "tintedgrove:yellow_plank_from_stripped_yellow_log");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.YELLOW_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_YELLOW_WOOD)
                .unlockedBy("has_yellow_wood", has(ModBlocks.YELLOW_WOOD)).save(recipeOutput,"tintedgrove:yellow_plank_from_stripped_yellow_wood");
        stairBuilder(ModBlocks.YELLOW_WOOD_STAIRS.get(), Ingredient.of(ModBlocks.YELLOW_PLANK)).group("yellow_wood")
                .unlockedBy("has_yellow_wood", has(ModBlocks.YELLOW_PLANK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_WOOD_SLAB.get(), ModBlocks.YELLOW_PLANK.get());
        buttonBuilder(ModBlocks.YELLOW_WOOD_BUTTON.get(), Ingredient.of(ModBlocks.YELLOW_PLANK.get())).group("yellow_wood")
                .unlockedBy("has_yellow_wood", has(ModBlocks.YELLOW_PLANK.get())).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.YELLOW_WOOD_PRESSURE_PLATE.get(), ModBlocks.YELLOW_PLANK.get());
        fenceBuilder(ModBlocks.YELLOW_WOOD_FENCE.get(), Ingredient.of(ModBlocks.YELLOW_PLANK.get())).group("yellow_wood")
                .unlockedBy("has_yellow_wood", has(ModBlocks.YELLOW_PLANK.get())).save(recipeOutput);
        fenceGateBuilder(ModBlocks.YELLOW_WOOD_FENCE_GATE.get(), Ingredient.of(ModBlocks.YELLOW_PLANK.get())).group("yellow_wood")
                .unlockedBy("has_yellow_wood", has(ModBlocks.YELLOW_PLANK.get())).save(recipeOutput);
        doorBuilder(ModBlocks.YELLOW_WOOD_DOOR.get(), Ingredient.of(ModBlocks.YELLOW_PLANK.get())).group("yellow_wood")
                .unlockedBy("has_yellow_wood", has(ModBlocks.YELLOW_PLANK.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.YELLOW_WOOD_TRAPDOOR.get(), Ingredient.of(ModBlocks.YELLOW_PLANK.get())).group("yellow_wood")
                .unlockedBy("has_yellow_wood", has(ModBlocks.YELLOW_PLANK.get())).save(recipeOutput);

        // PURPLE

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PURPLE_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.PURPLE_LOG.get())
                .unlockedBy("has_purple_log", has(ModBlocks.PURPLE_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_PURPLE_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.STRIPPED_PURPLE_LOG.get())
                .unlockedBy("has_stripped_purple_log", has(ModBlocks.STRIPPED_PURPLE_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PURPLE_PLANK.get(), 4)
                .requires(ModBlocks.PURPLE_LOG)
                .unlockedBy("has_purple_log", has(ModBlocks.PURPLE_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PURPLE_PLANK.get(), 4)
                .requires(ModBlocks.PURPLE_WOOD)
                .unlockedBy("has_purple_wood", has(ModBlocks.PURPLE_WOOD)).save(recipeOutput,"tintedgrove:purple_plank_from_purple_wood");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PURPLE_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_PURPLE_LOG)
                .unlockedBy("has_purple_log", has(ModBlocks.PURPLE_LOG)).save(recipeOutput, "tintedgrove:purple_plank_from_stripped_purple_log");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PURPLE_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_PURPLE_WOOD)
                .unlockedBy("has_purple_wood", has(ModBlocks.PURPLE_WOOD)).save(recipeOutput,"tintedgrove:purple_plank_from_stripped_purple_wood");
        stairBuilder(ModBlocks.PURPLE_WOOD_STAIRS.get(), Ingredient.of(ModBlocks.PURPLE_PLANK)).group("purple_wood")
                .unlockedBy("has_purple_wood", has(ModBlocks.PURPLE_PLANK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_WOOD_SLAB.get(), ModBlocks.PURPLE_PLANK.get());
        buttonBuilder(ModBlocks.PURPLE_WOOD_BUTTON.get(), Ingredient.of(ModBlocks.PURPLE_PLANK.get())).group("purple_wood")
                .unlockedBy("has_purple_wood", has(ModBlocks.PURPLE_PLANK.get())).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.PURPLE_WOOD_PRESSURE_PLATE.get(), ModBlocks.PURPLE_PLANK.get());
        fenceBuilder(ModBlocks.PURPLE_WOOD_FENCE.get(), Ingredient.of(ModBlocks.PURPLE_PLANK.get())).group("purple_wood")
                .unlockedBy("has_purple_wood", has(ModBlocks.PURPLE_PLANK.get())).save(recipeOutput);
        fenceGateBuilder(ModBlocks.PURPLE_WOOD_FENCE_GATE.get(), Ingredient.of(ModBlocks.PURPLE_PLANK.get())).group("purple_wood")
                .unlockedBy("has_purple_wood", has(ModBlocks.PURPLE_PLANK.get())).save(recipeOutput);
        doorBuilder(ModBlocks.PURPLE_WOOD_DOOR.get(), Ingredient.of(ModBlocks.PURPLE_PLANK.get())).group("purple_wood")
                .unlockedBy("has_purple_wood", has(ModBlocks.PURPLE_PLANK.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.PURPLE_WOOD_TRAPDOOR.get(), Ingredient.of(ModBlocks.PURPLE_PLANK.get())).group("purple_wood")
                .unlockedBy("has_purple_wood", has(ModBlocks.PURPLE_PLANK.get())).save(recipeOutput);

        // CYAN

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CYAN_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.CYAN_LOG.get())
                .unlockedBy("has_cyan_log", has(ModBlocks.CYAN_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_CYAN_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.STRIPPED_CYAN_LOG.get())
                .unlockedBy("has_stripped_cyan_log", has(ModBlocks.STRIPPED_CYAN_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.CYAN_PLANK.get(), 4)
                .requires(ModBlocks.CYAN_LOG)
                .unlockedBy("has_cyan_log", has(ModBlocks.CYAN_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.CYAN_PLANK.get(), 4)
                .requires(ModBlocks.CYAN_WOOD)
                .unlockedBy("has_cyan_wood", has(ModBlocks.CYAN_WOOD)).save(recipeOutput,"tintedgrove:cyan_plank_from_cyan_wood");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.CYAN_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_CYAN_LOG)
                .unlockedBy("has_cyan_log", has(ModBlocks.CYAN_LOG)).save(recipeOutput, "tintedgrove:cyan_plank_from_stripped_cyan_log");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.CYAN_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_CYAN_WOOD)
                .unlockedBy("has_cyan_wood", has(ModBlocks.CYAN_WOOD)).save(recipeOutput,"tintedgrove:cyan_plank_from_stripped_cyan_wood");
        stairBuilder(ModBlocks.CYAN_WOOD_STAIRS.get(), Ingredient.of(ModBlocks.CYAN_PLANK)).group("cyan_wood")
                .unlockedBy("has_cyan_wood", has(ModBlocks.CYAN_PLANK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_WOOD_SLAB.get(), ModBlocks.CYAN_PLANK.get());
        buttonBuilder(ModBlocks.CYAN_WOOD_BUTTON.get(), Ingredient.of(ModBlocks.CYAN_PLANK.get())).group("cyan_wood")
                .unlockedBy("has_cyan_wood", has(ModBlocks.CYAN_PLANK.get())).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.CYAN_WOOD_PRESSURE_PLATE.get(), ModBlocks.CYAN_PLANK.get());
        fenceBuilder(ModBlocks.CYAN_WOOD_FENCE.get(), Ingredient.of(ModBlocks.CYAN_PLANK.get())).group("cyan_wood")
                .unlockedBy("has_cyan_wood", has(ModBlocks.CYAN_PLANK.get())).save(recipeOutput);
        fenceGateBuilder(ModBlocks.CYAN_WOOD_FENCE_GATE.get(), Ingredient.of(ModBlocks.CYAN_PLANK.get())).group("cyan_wood")
                .unlockedBy("has_cyan_wood", has(ModBlocks.CYAN_PLANK.get())).save(recipeOutput);
        doorBuilder(ModBlocks.CYAN_WOOD_DOOR.get(), Ingredient.of(ModBlocks.CYAN_PLANK.get())).group("cyan_wood")
                .unlockedBy("has_cyan_wood", has(ModBlocks.CYAN_PLANK.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.CYAN_WOOD_TRAPDOOR.get(), Ingredient.of(ModBlocks.CYAN_PLANK.get())).group("cyan_wood")
                .unlockedBy("has_cyan_wood", has(ModBlocks.CYAN_PLANK.get())).save(recipeOutput);

        // ORANGE

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORANGE_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.ORANGE_LOG.get())
                .unlockedBy("has_orange_log", has(ModBlocks.ORANGE_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_ORANGE_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.STRIPPED_ORANGE_LOG.get())
                .unlockedBy("has_stripped_orange_log", has(ModBlocks.STRIPPED_ORANGE_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.ORANGE_PLANK.get(), 4)
                .requires(ModBlocks.ORANGE_LOG)
                .unlockedBy("has_orange_log", has(ModBlocks.ORANGE_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.ORANGE_PLANK.get(), 4)
                .requires(ModBlocks.ORANGE_WOOD)
                .unlockedBy("has_orange_wood", has(ModBlocks.ORANGE_WOOD)).save(recipeOutput,"tintedgrove:orange_plank_from_orange_wood");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.ORANGE_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_ORANGE_LOG)
                .unlockedBy("has_orange_log", has(ModBlocks.ORANGE_LOG)).save(recipeOutput, "tintedgrove:orange_plank_from_stripped_orange_log");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.ORANGE_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_ORANGE_WOOD)
                .unlockedBy("has_orange_wood", has(ModBlocks.ORANGE_WOOD)).save(recipeOutput,"tintedgrove:orange_plank_from_stripped_orange_wood");
        stairBuilder(ModBlocks.ORANGE_WOOD_STAIRS.get(), Ingredient.of(ModBlocks.ORANGE_PLANK)).group("orange_wood")
                .unlockedBy("has_orange_wood", has(ModBlocks.ORANGE_PLANK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_WOOD_SLAB.get(), ModBlocks.ORANGE_PLANK.get());
        buttonBuilder(ModBlocks.ORANGE_WOOD_BUTTON.get(), Ingredient.of(ModBlocks.ORANGE_PLANK.get())).group("orange_wood")
                .unlockedBy("has_orange_wood", has(ModBlocks.ORANGE_PLANK.get())).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.ORANGE_WOOD_PRESSURE_PLATE.get(), ModBlocks.ORANGE_PLANK.get());
        fenceBuilder(ModBlocks.ORANGE_WOOD_FENCE.get(), Ingredient.of(ModBlocks.ORANGE_PLANK.get())).group("orange_wood")
                .unlockedBy("has_orange_wood", has(ModBlocks.ORANGE_PLANK.get())).save(recipeOutput);
        fenceGateBuilder(ModBlocks.ORANGE_WOOD_FENCE_GATE.get(), Ingredient.of(ModBlocks.ORANGE_PLANK.get())).group("orange_wood")
                .unlockedBy("has_orange_wood", has(ModBlocks.ORANGE_PLANK.get())).save(recipeOutput);
        doorBuilder(ModBlocks.ORANGE_WOOD_DOOR.get(), Ingredient.of(ModBlocks.ORANGE_PLANK.get())).group("orange_wood")
                .unlockedBy("has_orange_wood", has(ModBlocks.ORANGE_PLANK.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.ORANGE_WOOD_TRAPDOOR.get(), Ingredient.of(ModBlocks.ORANGE_PLANK.get())).group("orange_wood")
                .unlockedBy("has_orange_wood", has(ModBlocks.ORANGE_PLANK.get())).save(recipeOutput);

        // LIME

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIME_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.LIME_LOG.get())
                .unlockedBy("has_lime_log", has(ModBlocks.LIME_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_LIME_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.STRIPPED_LIME_LOG.get())
                .unlockedBy("has_stripped_lime_log", has(ModBlocks.STRIPPED_LIME_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.LIME_PLANK.get(), 4)
                .requires(ModBlocks.LIME_LOG)
                .unlockedBy("has_lime_log", has(ModBlocks.LIME_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.LIME_PLANK.get(), 4)
                .requires(ModBlocks.LIME_WOOD)
                .unlockedBy("has_lime_wood", has(ModBlocks.LIME_WOOD)).save(recipeOutput,"tintedgrove:lime_plank_from_lime_wood");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.LIME_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_LIME_LOG)
                .unlockedBy("has_lime_log", has(ModBlocks.LIME_LOG)).save(recipeOutput, "tintedgrove:lime_plank_from_stripped_lime_log");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.LIME_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_LIME_WOOD)
                .unlockedBy("has_lime_wood", has(ModBlocks.LIME_WOOD)).save(recipeOutput,"tintedgrove:lime_plank_from_stripped_lime_wood");
        stairBuilder(ModBlocks.LIME_WOOD_STAIRS.get(), Ingredient.of(ModBlocks.LIME_PLANK)).group("lime_wood")
                .unlockedBy("has_lime_wood", has(ModBlocks.LIME_PLANK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_WOOD_SLAB.get(), ModBlocks.LIME_PLANK.get());
        buttonBuilder(ModBlocks.LIME_WOOD_BUTTON.get(), Ingredient.of(ModBlocks.LIME_PLANK.get())).group("lime_wood")
                .unlockedBy("has_lime_wood", has(ModBlocks.LIME_PLANK.get())).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.LIME_WOOD_PRESSURE_PLATE.get(), ModBlocks.LIME_PLANK.get());
        fenceBuilder(ModBlocks.LIME_WOOD_FENCE.get(), Ingredient.of(ModBlocks.LIME_PLANK.get())).group("lime_wood")
                .unlockedBy("has_lime_wood", has(ModBlocks.LIME_PLANK.get())).save(recipeOutput);
        fenceGateBuilder(ModBlocks.LIME_WOOD_FENCE_GATE.get(), Ingredient.of(ModBlocks.LIME_PLANK.get())).group("lime_wood")
                .unlockedBy("has_lime_wood", has(ModBlocks.LIME_PLANK.get())).save(recipeOutput);
        doorBuilder(ModBlocks.LIME_WOOD_DOOR.get(), Ingredient.of(ModBlocks.LIME_PLANK.get())).group("lime_wood")
                .unlockedBy("has_lime_wood", has(ModBlocks.LIME_PLANK.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.LIME_WOOD_TRAPDOOR.get(), Ingredient.of(ModBlocks.LIME_PLANK.get())).group("lime_wood")
                .unlockedBy("has_lime_wood", has(ModBlocks.LIME_PLANK.get())).save(recipeOutput);

        // PINK

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PINK_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.PINK_LOG.get())
                .unlockedBy("has_pink_log", has(ModBlocks.PINK_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_PINK_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.STRIPPED_PINK_LOG.get())
                .unlockedBy("has_stripped_pink_log", has(ModBlocks.STRIPPED_PINK_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PINK_PLANK.get(), 4)
                .requires(ModBlocks.PINK_LOG)
                .unlockedBy("has_pink_log", has(ModBlocks.PINK_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PINK_PLANK.get(), 4)
                .requires(ModBlocks.PINK_WOOD)
                .unlockedBy("has_pink_wood", has(ModBlocks.PINK_WOOD)).save(recipeOutput,"tintedgrove:pink_plank_from_pink_wood");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PINK_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_PINK_LOG)
                .unlockedBy("has_pink_log", has(ModBlocks.PINK_LOG)).save(recipeOutput, "tintedgrove:pink_plank_from_stripped_pink_log");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PINK_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_PINK_WOOD)
                .unlockedBy("has_pink_wood", has(ModBlocks.PINK_WOOD)).save(recipeOutput,"tintedgrove:pink_plank_from_stripped_pink_wood");
        stairBuilder(ModBlocks.PINK_WOOD_STAIRS.get(), Ingredient.of(ModBlocks.PINK_PLANK)).group("pink_wood")
                .unlockedBy("has_pink_wood", has(ModBlocks.PINK_PLANK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_WOOD_SLAB.get(), ModBlocks.PINK_PLANK.get());
        buttonBuilder(ModBlocks.PINK_WOOD_BUTTON.get(), Ingredient.of(ModBlocks.PINK_PLANK.get())).group("pink_wood")
                .unlockedBy("has_pink_wood", has(ModBlocks.PINK_PLANK.get())).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.PINK_WOOD_PRESSURE_PLATE.get(), ModBlocks.PINK_PLANK.get());
        fenceBuilder(ModBlocks.PINK_WOOD_FENCE.get(), Ingredient.of(ModBlocks.PINK_PLANK.get())).group("pink_wood")
                .unlockedBy("has_pink_wood", has(ModBlocks.PINK_PLANK.get())).save(recipeOutput);
        fenceGateBuilder(ModBlocks.PINK_WOOD_FENCE_GATE.get(), Ingredient.of(ModBlocks.PINK_PLANK.get())).group("pink_wood")
                .unlockedBy("has_pink_wood", has(ModBlocks.PINK_PLANK.get())).save(recipeOutput);
        doorBuilder(ModBlocks.PINK_WOOD_DOOR.get(), Ingredient.of(ModBlocks.PINK_PLANK.get())).group("pink_wood")
                .unlockedBy("has_pink_wood", has(ModBlocks.PINK_PLANK.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.PINK_WOOD_TRAPDOOR.get(), Ingredient.of(ModBlocks.PINK_PLANK.get())).group("pink_wood")
                .unlockedBy("has_pink_wood", has(ModBlocks.PINK_PLANK.get())).save(recipeOutput);

        // BROWN

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BROWN_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.BROWN_LOG.get())
                .unlockedBy("has_brown_log", has(ModBlocks.BROWN_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_BROWN_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.STRIPPED_BROWN_LOG.get())
                .unlockedBy("has_stripped_brown_log", has(ModBlocks.STRIPPED_BROWN_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.BROWN_PLANK.get(), 4)
                .requires(ModBlocks.BROWN_LOG)
                .unlockedBy("has_brown_log", has(ModBlocks.BROWN_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.BROWN_PLANK.get(), 4)
                .requires(ModBlocks.BROWN_WOOD)
                .unlockedBy("has_brown_wood", has(ModBlocks.BROWN_WOOD)).save(recipeOutput,"tintedgrove:brown_plank_from_brown_wood");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.BROWN_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_BROWN_LOG)
                .unlockedBy("has_brown_log", has(ModBlocks.BROWN_LOG)).save(recipeOutput, "tintedgrove:brown_plank_from_stripped_brown_log");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.BROWN_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_BROWN_WOOD)
                .unlockedBy("has_brown_wood", has(ModBlocks.BROWN_WOOD)).save(recipeOutput,"tintedgrove:brown_plank_from_stripped_brown_wood");
        stairBuilder(ModBlocks.BROWN_WOOD_STAIRS.get(), Ingredient.of(ModBlocks.BROWN_PLANK)).group("brown_wood")
                .unlockedBy("has_brown_wood", has(ModBlocks.BROWN_PLANK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_WOOD_SLAB.get(), ModBlocks.BROWN_PLANK.get());
        buttonBuilder(ModBlocks.BROWN_WOOD_BUTTON.get(), Ingredient.of(ModBlocks.BROWN_PLANK.get())).group("brown_wood")
                .unlockedBy("has_brown_wood", has(ModBlocks.BROWN_PLANK.get())).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.BROWN_WOOD_PRESSURE_PLATE.get(), ModBlocks.BROWN_PLANK.get());
        fenceBuilder(ModBlocks.BROWN_WOOD_FENCE.get(), Ingredient.of(ModBlocks.BROWN_PLANK.get())).group("brown_wood")
                .unlockedBy("has_brown_wood", has(ModBlocks.BROWN_PLANK.get())).save(recipeOutput);
        fenceGateBuilder(ModBlocks.BROWN_WOOD_FENCE_GATE.get(), Ingredient.of(ModBlocks.BROWN_PLANK.get())).group("brown_wood")
                .unlockedBy("has_brown_wood", has(ModBlocks.BROWN_PLANK.get())).save(recipeOutput);
        doorBuilder(ModBlocks.BROWN_WOOD_DOOR.get(), Ingredient.of(ModBlocks.BROWN_PLANK.get())).group("brown_wood")
                .unlockedBy("has_brown_wood", has(ModBlocks.BROWN_PLANK.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.BROWN_WOOD_TRAPDOOR.get(), Ingredient.of(ModBlocks.BROWN_PLANK.get())).group("brown_wood")
                .unlockedBy("has_brown_wood", has(ModBlocks.BROWN_PLANK.get())).save(recipeOutput);

        // BLACK

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.BLACK_LOG.get())
                .unlockedBy("has_black_log", has(ModBlocks.BLACK_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_BLACK_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.STRIPPED_BLACK_LOG.get())
                .unlockedBy("has_stripped_black_log", has(ModBlocks.STRIPPED_BLACK_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.BLACK_PLANK.get(), 4)
                .requires(ModBlocks.BLACK_LOG)
                .unlockedBy("has_black_log", has(ModBlocks.BLACK_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.BLACK_PLANK.get(), 4)
                .requires(ModBlocks.BLACK_WOOD)
                .unlockedBy("has_black_wood", has(ModBlocks.BLACK_WOOD)).save(recipeOutput,"tintedgrove:black_plank_from_black_wood");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.BLACK_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_BLACK_LOG)
                .unlockedBy("has_black_log", has(ModBlocks.BLACK_LOG)).save(recipeOutput, "tintedgrove:black_plank_from_stripped_black_log");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.BLACK_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_BLACK_WOOD)
                .unlockedBy("has_black_wood", has(ModBlocks.BLACK_WOOD)).save(recipeOutput,"tintedgrove:black_plank_from_stripped_black_wood");
        stairBuilder(ModBlocks.BLACK_WOOD_STAIRS.get(), Ingredient.of(ModBlocks.BLACK_PLANK)).group("black_wood")
                .unlockedBy("has_black_wood", has(ModBlocks.BLACK_PLANK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_WOOD_SLAB.get(), ModBlocks.BLACK_PLANK.get());
        buttonBuilder(ModBlocks.BLACK_WOOD_BUTTON.get(), Ingredient.of(ModBlocks.BLACK_PLANK.get())).group("black_wood")
                .unlockedBy("has_black_wood", has(ModBlocks.BLACK_PLANK.get())).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.BLACK_WOOD_PRESSURE_PLATE.get(), ModBlocks.BLACK_PLANK.get());
        fenceBuilder(ModBlocks.BLACK_WOOD_FENCE.get(), Ingredient.of(ModBlocks.BLACK_PLANK.get())).group("black_wood")
                .unlockedBy("has_black_wood", has(ModBlocks.BLACK_PLANK.get())).save(recipeOutput);
        fenceGateBuilder(ModBlocks.BLACK_WOOD_FENCE_GATE.get(), Ingredient.of(ModBlocks.BLACK_PLANK.get())).group("black_wood")
                .unlockedBy("has_black_wood", has(ModBlocks.BLACK_PLANK.get())).save(recipeOutput);
        doorBuilder(ModBlocks.BLACK_WOOD_DOOR.get(), Ingredient.of(ModBlocks.BLACK_PLANK.get())).group("black_wood")
                .unlockedBy("has_black_wood", has(ModBlocks.BLACK_PLANK.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.BLACK_WOOD_TRAPDOOR.get(), Ingredient.of(ModBlocks.BLACK_PLANK.get())).group("black_wood")
                .unlockedBy("has_black_wood", has(ModBlocks.BLACK_PLANK.get())).save(recipeOutput);

        // WHITE

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WHITE_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.WHITE_LOG.get())
                .unlockedBy("has_white_log", has(ModBlocks.WHITE_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_WHITE_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.STRIPPED_WHITE_LOG.get())
                .unlockedBy("has_stripped_white_log", has(ModBlocks.STRIPPED_WHITE_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.WHITE_PLANK.get(), 4)
                .requires(ModBlocks.WHITE_LOG)
                .unlockedBy("has_white_log", has(ModBlocks.WHITE_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.WHITE_PLANK.get(), 4)
                .requires(ModBlocks.WHITE_WOOD)
                .unlockedBy("has_white_wood", has(ModBlocks.WHITE_WOOD)).save(recipeOutput,"tintedgrove:white_plank_from_white_wood");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.WHITE_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_WHITE_LOG)
                .unlockedBy("has_white_log", has(ModBlocks.WHITE_LOG)).save(recipeOutput, "tintedgrove:white_plank_from_stripped_white_log");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.WHITE_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_WHITE_WOOD)
                .unlockedBy("has_white_wood", has(ModBlocks.WHITE_WOOD)).save(recipeOutput,"tintedgrove:white_plank_from_stripped_white_wood");
        stairBuilder(ModBlocks.WHITE_WOOD_STAIRS.get(), Ingredient.of(ModBlocks.WHITE_PLANK)).group("white_wood")
                .unlockedBy("has_white_wood", has(ModBlocks.WHITE_PLANK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_WOOD_SLAB.get(), ModBlocks.WHITE_PLANK.get());
        buttonBuilder(ModBlocks.WHITE_WOOD_BUTTON.get(), Ingredient.of(ModBlocks.WHITE_PLANK.get())).group("white_wood")
                .unlockedBy("has_white_wood", has(ModBlocks.WHITE_PLANK.get())).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.WHITE_WOOD_PRESSURE_PLATE.get(), ModBlocks.WHITE_PLANK.get());
        fenceBuilder(ModBlocks.WHITE_WOOD_FENCE.get(), Ingredient.of(ModBlocks.WHITE_PLANK.get())).group("white_wood")
                .unlockedBy("has_white_wood", has(ModBlocks.WHITE_PLANK.get())).save(recipeOutput);
        fenceGateBuilder(ModBlocks.WHITE_WOOD_FENCE_GATE.get(), Ingredient.of(ModBlocks.WHITE_PLANK.get())).group("white_wood")
                .unlockedBy("has_white_wood", has(ModBlocks.WHITE_PLANK.get())).save(recipeOutput);
        doorBuilder(ModBlocks.WHITE_WOOD_DOOR.get(), Ingredient.of(ModBlocks.WHITE_PLANK.get())).group("white_wood")
                .unlockedBy("has_white_wood", has(ModBlocks.WHITE_PLANK.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.WHITE_WOOD_TRAPDOOR.get(), Ingredient.of(ModBlocks.WHITE_PLANK.get())).group("white_wood")
                .unlockedBy("has_white_wood", has(ModBlocks.WHITE_PLANK.get())).save(recipeOutput);

        // GRAY

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GRAY_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.GRAY_LOG.get())
                .unlockedBy("has_gray_log", has(ModBlocks.GRAY_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_GRAY_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.STRIPPED_GRAY_LOG.get())
                .unlockedBy("has_stripped_gray_log", has(ModBlocks.STRIPPED_GRAY_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.GRAY_PLANK.get(), 4)
                .requires(ModBlocks.GRAY_LOG)
                .unlockedBy("has_gray_log", has(ModBlocks.GRAY_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.GRAY_PLANK.get(), 4)
                .requires(ModBlocks.GRAY_WOOD)
                .unlockedBy("has_gray_wood", has(ModBlocks.GRAY_WOOD)).save(recipeOutput,"tintedgrove:gray_plank_from_gray_wood");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.GRAY_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_GRAY_LOG)
                .unlockedBy("has_gray_log", has(ModBlocks.GRAY_LOG)).save(recipeOutput, "tintedgrove:gray_plank_from_stripped_gray_log");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.GRAY_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_GRAY_WOOD)
                .unlockedBy("has_gray_wood", has(ModBlocks.GRAY_WOOD)).save(recipeOutput,"tintedgrove:gray_plank_from_stripped_gray_wood");
        stairBuilder(ModBlocks.GRAY_WOOD_STAIRS.get(), Ingredient.of(ModBlocks.GRAY_PLANK)).group("gray_wood")
                .unlockedBy("has_gray_wood", has(ModBlocks.GRAY_PLANK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_WOOD_SLAB.get(), ModBlocks.GRAY_PLANK.get());
        buttonBuilder(ModBlocks.GRAY_WOOD_BUTTON.get(), Ingredient.of(ModBlocks.GRAY_PLANK.get())).group("gray_wood")
                .unlockedBy("has_gray_wood", has(ModBlocks.GRAY_PLANK.get())).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.GRAY_WOOD_PRESSURE_PLATE.get(), ModBlocks.GRAY_PLANK.get());
        fenceBuilder(ModBlocks.GRAY_WOOD_FENCE.get(), Ingredient.of(ModBlocks.GRAY_PLANK.get())).group("gray_wood")
                .unlockedBy("has_gray_wood", has(ModBlocks.GRAY_PLANK.get())).save(recipeOutput);
        fenceGateBuilder(ModBlocks.GRAY_WOOD_FENCE_GATE.get(), Ingredient.of(ModBlocks.GRAY_PLANK.get())).group("gray_wood")
                .unlockedBy("has_gray_wood", has(ModBlocks.GRAY_PLANK.get())).save(recipeOutput);
        doorBuilder(ModBlocks.GRAY_WOOD_DOOR.get(), Ingredient.of(ModBlocks.GRAY_PLANK.get())).group("gray_wood")
                .unlockedBy("has_gray_wood", has(ModBlocks.GRAY_PLANK.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.GRAY_WOOD_TRAPDOOR.get(), Ingredient.of(ModBlocks.GRAY_PLANK.get())).group("gray_wood")
                .unlockedBy("has_gray_wood", has(ModBlocks.GRAY_PLANK.get())).save(recipeOutput);

        // LIGHT_GRAY

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.LIGHT_GRAY_LOG.get())
                .unlockedBy("has_light_gray_log", has(ModBlocks.LIGHT_GRAY_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_LIGHT_GRAY_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.STRIPPED_LIGHT_GRAY_LOG.get())
                .unlockedBy("has_stripped_light_gray_log", has(ModBlocks.STRIPPED_LIGHT_GRAY_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_PLANK.get(), 4)
                .requires(ModBlocks.LIGHT_GRAY_LOG)
                .unlockedBy("has_light_gray_log", has(ModBlocks.LIGHT_GRAY_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_PLANK.get(), 4)
                .requires(ModBlocks.LIGHT_GRAY_WOOD)
                .unlockedBy("has_light_gray_wood", has(ModBlocks.LIGHT_GRAY_WOOD)).save(recipeOutput,"tintedgrove:light_gray_plank_from_light_gray_wood");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_LIGHT_GRAY_LOG)
                .unlockedBy("has_light_gray_log", has(ModBlocks.LIGHT_GRAY_LOG)).save(recipeOutput, "tintedgrove:light_gray_plank_from_stripped_light_gray_log");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_LIGHT_GRAY_WOOD)
                .unlockedBy("has_light_gray_wood", has(ModBlocks.LIGHT_GRAY_WOOD)).save(recipeOutput,"tintedgrove:light_gray_plank_from_stripped_light_gray_wood");
        stairBuilder(ModBlocks.LIGHT_GRAY_WOOD_STAIRS.get(), Ingredient.of(ModBlocks.LIGHT_GRAY_PLANK)).group("light_gray_wood")
                .unlockedBy("has_light_gray_wood", has(ModBlocks.LIGHT_GRAY_PLANK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_WOOD_SLAB.get(), ModBlocks.LIGHT_GRAY_PLANK.get());
        buttonBuilder(ModBlocks.LIGHT_GRAY_WOOD_BUTTON.get(), Ingredient.of(ModBlocks.LIGHT_GRAY_PLANK.get())).group("light_gray_wood")
                .unlockedBy("has_light_gray_wood", has(ModBlocks.LIGHT_GRAY_PLANK.get())).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.LIGHT_GRAY_WOOD_PRESSURE_PLATE.get(), ModBlocks.LIGHT_GRAY_PLANK.get());
        fenceBuilder(ModBlocks.LIGHT_GRAY_WOOD_FENCE.get(), Ingredient.of(ModBlocks.LIGHT_GRAY_PLANK.get())).group("light_gray_wood")
                .unlockedBy("has_light_gray_wood", has(ModBlocks.LIGHT_GRAY_PLANK.get())).save(recipeOutput);
        fenceGateBuilder(ModBlocks.LIGHT_GRAY_WOOD_FENCE_GATE.get(), Ingredient.of(ModBlocks.LIGHT_GRAY_PLANK.get())).group("light_gray_wood")
                .unlockedBy("has_light_gray_wood", has(ModBlocks.LIGHT_GRAY_PLANK.get())).save(recipeOutput);
        doorBuilder(ModBlocks.LIGHT_GRAY_WOOD_DOOR.get(), Ingredient.of(ModBlocks.LIGHT_GRAY_PLANK.get())).group("light_gray_wood")
                .unlockedBy("has_light_gray_wood", has(ModBlocks.LIGHT_GRAY_PLANK.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.LIGHT_GRAY_WOOD_TRAPDOOR.get(), Ingredient.of(ModBlocks.LIGHT_GRAY_PLANK.get())).group("light_gray_wood")
                .unlockedBy("has_light_gray_wood", has(ModBlocks.LIGHT_GRAY_PLANK.get())).save(recipeOutput);

        // LIGHT_BLUE

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.LIGHT_BLUE_LOG.get())
                .unlockedBy("has_light_blue_log", has(ModBlocks.LIGHT_BLUE_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_LIGHT_BLUE_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.STRIPPED_LIGHT_BLUE_LOG.get())
                .unlockedBy("has_stripped_light_blue_log", has(ModBlocks.STRIPPED_LIGHT_BLUE_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_PLANK.get(), 4)
                .requires(ModBlocks.LIGHT_BLUE_LOG)
                .unlockedBy("has_light_blue_log", has(ModBlocks.LIGHT_BLUE_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_PLANK.get(), 4)
                .requires(ModBlocks.LIGHT_BLUE_WOOD)
                .unlockedBy("has_light_blue_wood", has(ModBlocks.LIGHT_BLUE_WOOD)).save(recipeOutput,"tintedgrove:light_blue_plank_from_blue_wood");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_LIGHT_BLUE_LOG)
                .unlockedBy("has_light_blue_log", has(ModBlocks.LIGHT_BLUE_LOG)).save(recipeOutput, "tintedgrove:light_blue_plank_from_stripped_blue_log");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_LIGHT_BLUE_WOOD)
                .unlockedBy("has_light_blue_wood", has(ModBlocks.LIGHT_BLUE_WOOD)).save(recipeOutput,"tintedgrove:light_blue_plank_from_stripped_blue_wood");
        stairBuilder(ModBlocks.LIGHT_BLUE_WOOD_STAIRS.get(), Ingredient.of(ModBlocks.LIGHT_BLUE_PLANK)).group("light_blue_wood")
                .unlockedBy("has_light_blue_wood", has(ModBlocks.LIGHT_BLUE_PLANK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_WOOD_SLAB.get(), ModBlocks.LIGHT_BLUE_PLANK.get());
        buttonBuilder(ModBlocks.LIGHT_BLUE_WOOD_BUTTON.get(), Ingredient.of(ModBlocks.LIGHT_BLUE_PLANK.get())).group("light_blue_wood")
                .unlockedBy("has_light_blue_wood", has(ModBlocks.LIGHT_BLUE_PLANK.get())).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.LIGHT_BLUE_WOOD_PRESSURE_PLATE.get(), ModBlocks.LIGHT_BLUE_PLANK.get());
        fenceBuilder(ModBlocks.LIGHT_BLUE_WOOD_FENCE.get(), Ingredient.of(ModBlocks.LIGHT_BLUE_PLANK.get())).group("light_blue_wood")
                .unlockedBy("has_light_blue_wood", has(ModBlocks.LIGHT_BLUE_PLANK.get())).save(recipeOutput);
        fenceGateBuilder(ModBlocks.LIGHT_BLUE_WOOD_FENCE_GATE.get(), Ingredient.of(ModBlocks.LIGHT_BLUE_PLANK.get())).group("light_blue_wood")
                .unlockedBy("has_light_blue_wood", has(ModBlocks.LIGHT_BLUE_PLANK.get())).save(recipeOutput);
        doorBuilder(ModBlocks.LIGHT_BLUE_WOOD_DOOR.get(), Ingredient.of(ModBlocks.LIGHT_BLUE_PLANK.get())).group("light_blue_wood")
                .unlockedBy("has_light_blue_wood", has(ModBlocks.LIGHT_BLUE_PLANK.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.LIGHT_BLUE_WOOD_TRAPDOOR.get(), Ingredient.of(ModBlocks.LIGHT_BLUE_PLANK.get())).group("light_blue_wood")
                .unlockedBy("has_light_blue_wood", has(ModBlocks.LIGHT_BLUE_PLANK.get())).save(recipeOutput);

        // MAGENTA

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAGENTA_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.MAGENTA_LOG.get())
                .unlockedBy("has_magenta_log", has(ModBlocks.MAGENTA_LOG)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_MAGENTA_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.STRIPPED_MAGENTA_LOG.get())
                .unlockedBy("has_stripped_magenta_log", has(ModBlocks.STRIPPED_MAGENTA_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.MAGENTA_PLANK.get(), 4)
                .requires(ModBlocks.MAGENTA_LOG)
                .unlockedBy("has_magenta_log", has(ModBlocks.MAGENTA_LOG)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.MAGENTA_PLANK.get(), 4)
                .requires(ModBlocks.MAGENTA_WOOD)
                .unlockedBy("has_magenta_wood", has(ModBlocks.MAGENTA_WOOD)).save(recipeOutput,"tintedgrove:magenta_plank_from_magenta_wood");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.MAGENTA_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_MAGENTA_LOG)
                .unlockedBy("has_magenta_log", has(ModBlocks.MAGENTA_LOG)).save(recipeOutput, "tintedgrove:magenta_plank_from_stripped_magenta_log");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.MAGENTA_PLANK.get(), 4)
                .requires(ModBlocks.STRIPPED_MAGENTA_WOOD)
                .unlockedBy("has_magenta_wood", has(ModBlocks.MAGENTA_WOOD)).save(recipeOutput,"tintedgrove:magenta_plank_from_stripped_magenta_wood");
        stairBuilder(ModBlocks.MAGENTA_WOOD_STAIRS.get(), Ingredient.of(ModBlocks.MAGENTA_PLANK)).group("magenta_wood")
                .unlockedBy("has_magenta_wood", has(ModBlocks.MAGENTA_PLANK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_WOOD_SLAB.get(), ModBlocks.MAGENTA_PLANK.get());
        buttonBuilder(ModBlocks.MAGENTA_WOOD_BUTTON.get(), Ingredient.of(ModBlocks.MAGENTA_PLANK.get())).group("magenta_wood")
                .unlockedBy("has_magenta_wood", has(ModBlocks.MAGENTA_PLANK.get())).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.MAGENTA_WOOD_PRESSURE_PLATE.get(), ModBlocks.MAGENTA_PLANK.get());
        fenceBuilder(ModBlocks.MAGENTA_WOOD_FENCE.get(), Ingredient.of(ModBlocks.MAGENTA_PLANK.get())).group("magenta_wood")
                .unlockedBy("has_magenta_wood", has(ModBlocks.MAGENTA_PLANK.get())).save(recipeOutput);
        fenceGateBuilder(ModBlocks.MAGENTA_WOOD_FENCE_GATE.get(), Ingredient.of(ModBlocks.MAGENTA_PLANK.get())).group("magenta_wood")
                .unlockedBy("has_magenta_wood", has(ModBlocks.MAGENTA_PLANK.get())).save(recipeOutput);
        doorBuilder(ModBlocks.MAGENTA_WOOD_DOOR.get(), Ingredient.of(ModBlocks.MAGENTA_PLANK.get())).group("magenta_wood")
                .unlockedBy("has_magenta_wood", has(ModBlocks.MAGENTA_PLANK.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.MAGENTA_WOOD_TRAPDOOR.get(), Ingredient.of(ModBlocks.MAGENTA_PLANK.get())).group("magenta_wood")
                .unlockedBy("has_magenta_wood", has(ModBlocks.MAGENTA_PLANK.get())).save(recipeOutput);

        // RED - Tree
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RED_SAPLING.get())
                .pattern(" D ")
                .pattern("DSD")
                .pattern(" D ")
                .define('D', Items.RED_DYE)
                .define('S', Blocks.OAK_SAPLING)
                .unlockedBy("has_red_dye", has(Items.RED_DYE)).save(recipeOutput);

        // BLUE - Tree
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLUE_SAPLING.get())
                .pattern(" D ")
                .pattern("DSD")
                .pattern(" D ")
                .define('D', Items.BLUE_DYE)
                .define('S', Blocks.OAK_SAPLING)
                .unlockedBy("has_blue_dye", has(Items.BLUE_DYE)).save(recipeOutput);

        // GREEN - Tree
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GREEN_SAPLING.get())
                .pattern(" D ")
                .pattern("DSD")
                .pattern(" D ")
                .define('D', Items.GREEN_DYE)
                .define('S', Blocks.OAK_SAPLING)
                .unlockedBy("has_green_dye", has(Items.GREEN_DYE)).save(recipeOutput);

        // YELLOW - Tree
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.YELLOW_SAPLING.get())
                .pattern(" D ")
                .pattern("DSD")
                .pattern(" D ")
                .define('D', Items.YELLOW_DYE)
                .define('S', Blocks.OAK_SAPLING)
                .unlockedBy("has_yellow_dye", has(Items.YELLOW_DYE)).save(recipeOutput);

        // PURPLE - Tree
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PURPLE_SAPLING.get())
                .pattern(" D ")
                .pattern("DSD")
                .pattern(" D ")
                .define('D', Items.PURPLE_DYE)
                .define('S', Blocks.OAK_SAPLING)
                .unlockedBy("has_purple_dye", has(Items.PURPLE_DYE)).save(recipeOutput);

        // CYAN - Tree
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CYAN_SAPLING.get())
                .pattern(" D ")
                .pattern("DSD")
                .pattern(" D ")
                .define('D', Items.CYAN_DYE)
                .define('S', Blocks.OAK_SAPLING)
                .unlockedBy("has_cyan_dye", has(Items.CYAN_DYE)).save(recipeOutput);

        // ORANGE - Tree
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORANGE_SAPLING.get())
                .pattern(" D ")
                .pattern("DSD")
                .pattern(" D ")
                .define('D', Items.ORANGE_DYE)
                .define('S', Blocks.OAK_SAPLING)
                .unlockedBy("has_orange_dye", has(Items.ORANGE_DYE)).save(recipeOutput);

        // LIME - Tree
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIME_SAPLING.get())
                .pattern(" D ")
                .pattern("DSD")
                .pattern(" D ")
                .define('D', Items.LIME_DYE)
                .define('S', Blocks.OAK_SAPLING)
                .unlockedBy("has_lime_dye", has(Items.LIME_DYE)).save(recipeOutput);

        // PINK - Tree
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PINK_SAPLING.get())
                .pattern(" D ")
                .pattern("DSD")
                .pattern(" D ")
                .define('D', Items.PINK_DYE)
                .define('S', Blocks.OAK_SAPLING)
                .unlockedBy("has_pink_dye", has(Items.PINK_DYE)).save(recipeOutput);

        // BROWN - Tree
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BROWN_SAPLING.get())
                .pattern(" D ")
                .pattern("DSD")
                .pattern(" D ")
                .define('D', Items.BROWN_DYE)
                .define('S', Blocks.OAK_SAPLING)
                .unlockedBy("has_brown_dye", has(Items.BROWN_DYE)).save(recipeOutput);

        // BLACK - Tree
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_SAPLING.get())
                .pattern(" D ")
                .pattern("DSD")
                .pattern(" D ")
                .define('D', Items.BLACK_DYE)
                .define('S', Blocks.OAK_SAPLING)
                .unlockedBy("has_black_dye", has(Items.BLACK_DYE)).save(recipeOutput);

        // WHITE - Tree
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WHITE_SAPLING.get())
                .pattern(" D ")
                .pattern("DSD")
                .pattern(" D ")
                .define('D', Items.WHITE_DYE)
                .define('S', Blocks.OAK_SAPLING)
                .unlockedBy("has_white_dye", has(Items.WHITE_DYE)).save(recipeOutput);

        // GRAY - Tree
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GRAY_SAPLING.get())
                .pattern(" D ")
                .pattern("DSD")
                .pattern(" D ")
                .define('D', Items.GRAY_DYE)
                .define('S', Blocks.OAK_SAPLING)
                .unlockedBy("has_gray_dye", has(Items.GRAY_DYE)).save(recipeOutput);

        // LIGHT_GRAY - Tree
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_SAPLING.get())
                .pattern(" D ")
                .pattern("DSD")
                .pattern(" D ")
                .define('D', Items.LIGHT_GRAY_DYE)
                .define('S', Blocks.OAK_SAPLING)
                .unlockedBy("has_light_gray_dye", has(Items.LIGHT_GRAY_DYE)).save(recipeOutput);

        // LIGHT_BLUE - Tree
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_SAPLING.get())
                .pattern(" D ")
                .pattern("DSD")
                .pattern(" D ")
                .define('D', Items.LIGHT_BLUE_DYE)
                .define('S', Blocks.OAK_SAPLING)
                .unlockedBy("has_light_blue_dye", has(Items.LIGHT_BLUE_DYE)).save(recipeOutput);

        // MAGENTA - Tree
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAGENTA_SAPLING.get())
                .pattern(" D ")
                .pattern("DSD")
                .pattern(" D ")
                .define('D', Items.MAGENTA_DYE)
                .define('S', Blocks.OAK_SAPLING)
                .unlockedBy("has_magenta_dye", has(Items.MAGENTA_DYE)).save(recipeOutput);

    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, TintedGrove.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}

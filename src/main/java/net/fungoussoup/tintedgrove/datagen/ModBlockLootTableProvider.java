package net.fungoussoup.tintedgrove.datagen;

import net.fungoussoup.tintedgrove.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.RED_LOG.get());
        dropSelf(ModBlocks.RED_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_RED_LOG.get());
        dropSelf(ModBlocks.STRIPPED_RED_WOOD.get());
        dropSelf(ModBlocks.RED_PLANK.get());
        dropSelf(ModBlocks.RED_WOOD_STAIRS.get());
        add(ModBlocks.RED_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.RED_WOOD_SLAB.get()));
        dropSelf(ModBlocks.RED_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.RED_WOOD_BUTTON.get());
        dropSelf(ModBlocks.RED_WOOD_FENCE.get());
        dropSelf(ModBlocks.RED_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.RED_WOOD_TRAPDOOR.get());
        add(ModBlocks.RED_WOOD_DOOR.get(),
                block -> createDoorTable(ModBlocks.RED_WOOD_DOOR.get()));

        dropSelf(ModBlocks.BLUE_LOG.get());
        dropSelf(ModBlocks.BLUE_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_BLUE_LOG.get());
        dropSelf(ModBlocks.STRIPPED_BLUE_WOOD.get());
        dropSelf(ModBlocks.BLUE_PLANK.get());
        dropSelf(ModBlocks.BLUE_WOOD_STAIRS.get());
        add(ModBlocks.BLUE_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BLUE_WOOD_SLAB.get()));
        dropSelf(ModBlocks.BLUE_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.BLUE_WOOD_BUTTON.get());
        dropSelf(ModBlocks.BLUE_WOOD_FENCE.get());
        dropSelf(ModBlocks.BLUE_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.BLUE_WOOD_TRAPDOOR.get());
        add(ModBlocks.BLUE_WOOD_DOOR.get(),
                block -> createDoorTable(ModBlocks.BLUE_WOOD_DOOR.get()));

        dropSelf(ModBlocks.GREEN_LOG.get());
        dropSelf(ModBlocks.GREEN_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_GREEN_LOG.get());
        dropSelf(ModBlocks.STRIPPED_GREEN_WOOD.get());
        dropSelf(ModBlocks.GREEN_PLANK.get());
        dropSelf(ModBlocks.GREEN_WOOD_STAIRS.get());
        add(ModBlocks.GREEN_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GREEN_WOOD_SLAB.get()));
        dropSelf(ModBlocks.GREEN_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.GREEN_WOOD_BUTTON.get());
        dropSelf(ModBlocks.GREEN_WOOD_FENCE.get());
        dropSelf(ModBlocks.GREEN_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.GREEN_WOOD_TRAPDOOR.get());
        add(ModBlocks.GREEN_WOOD_DOOR.get(),
                block -> createDoorTable(ModBlocks.GREEN_WOOD_DOOR.get()));

        dropSelf(ModBlocks.YELLOW_LOG.get());
        dropSelf(ModBlocks.YELLOW_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_YELLOW_LOG.get());
        dropSelf(ModBlocks.STRIPPED_YELLOW_WOOD.get());
        dropSelf(ModBlocks.YELLOW_PLANK.get());
        dropSelf(ModBlocks.YELLOW_WOOD_STAIRS.get());
        add(ModBlocks.YELLOW_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.YELLOW_WOOD_SLAB.get()));
        dropSelf(ModBlocks.YELLOW_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.YELLOW_WOOD_BUTTON.get());
        dropSelf(ModBlocks.YELLOW_WOOD_FENCE.get());
        dropSelf(ModBlocks.YELLOW_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.YELLOW_WOOD_TRAPDOOR.get());
        add(ModBlocks.YELLOW_WOOD_DOOR.get(),
                block -> createDoorTable(ModBlocks.YELLOW_WOOD_DOOR.get()));

        dropSelf(ModBlocks.PURPLE_LOG.get());
        dropSelf(ModBlocks.PURPLE_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_PURPLE_LOG.get());
        dropSelf(ModBlocks.STRIPPED_PURPLE_WOOD.get());
        dropSelf(ModBlocks.PURPLE_PLANK.get());
        dropSelf(ModBlocks.PURPLE_WOOD_STAIRS.get());
        add(ModBlocks.PURPLE_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.PURPLE_WOOD_SLAB.get()));
        dropSelf(ModBlocks.PURPLE_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.PURPLE_WOOD_BUTTON.get());
        dropSelf(ModBlocks.PURPLE_WOOD_FENCE.get());
        dropSelf(ModBlocks.PURPLE_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.PURPLE_WOOD_TRAPDOOR.get());
        add(ModBlocks.PURPLE_WOOD_DOOR.get(),
                block -> createDoorTable(ModBlocks.PURPLE_WOOD_DOOR.get()));

        dropSelf(ModBlocks.CYAN_LOG.get());
        dropSelf(ModBlocks.CYAN_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_CYAN_LOG.get());
        dropSelf(ModBlocks.STRIPPED_CYAN_WOOD.get());
        dropSelf(ModBlocks.CYAN_PLANK.get());
        dropSelf(ModBlocks.CYAN_WOOD_STAIRS.get());
        add(ModBlocks.CYAN_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CYAN_WOOD_SLAB.get()));
        dropSelf(ModBlocks.CYAN_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.CYAN_WOOD_BUTTON.get());
        dropSelf(ModBlocks.CYAN_WOOD_FENCE.get());
        dropSelf(ModBlocks.CYAN_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.CYAN_WOOD_TRAPDOOR.get());
        add(ModBlocks.CYAN_WOOD_DOOR.get(),
                block -> createDoorTable(ModBlocks.CYAN_WOOD_DOOR.get()));

        dropSelf(ModBlocks.ORANGE_LOG.get());
        dropSelf(ModBlocks.ORANGE_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_ORANGE_LOG.get());
        dropSelf(ModBlocks.STRIPPED_ORANGE_WOOD.get());
        dropSelf(ModBlocks.ORANGE_PLANK.get());
        dropSelf(ModBlocks.ORANGE_WOOD_STAIRS.get());
        add(ModBlocks.ORANGE_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ORANGE_WOOD_SLAB.get()));
        dropSelf(ModBlocks.ORANGE_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.ORANGE_WOOD_BUTTON.get());
        dropSelf(ModBlocks.ORANGE_WOOD_FENCE.get());
        dropSelf(ModBlocks.ORANGE_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.ORANGE_WOOD_TRAPDOOR.get());
        add(ModBlocks.ORANGE_WOOD_DOOR.get(),
                block -> createDoorTable(ModBlocks.ORANGE_WOOD_DOOR.get()));

        dropSelf(ModBlocks.LIME_LOG.get());
        dropSelf(ModBlocks.LIME_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_LIME_LOG.get());
        dropSelf(ModBlocks.STRIPPED_LIME_WOOD.get());
        dropSelf(ModBlocks.LIME_PLANK.get());
        dropSelf(ModBlocks.LIME_WOOD_STAIRS.get());
        add(ModBlocks.LIME_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LIME_WOOD_SLAB.get()));
        dropSelf(ModBlocks.LIME_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.LIME_WOOD_BUTTON.get());
        dropSelf(ModBlocks.LIME_WOOD_FENCE.get());
        dropSelf(ModBlocks.LIME_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.LIME_WOOD_TRAPDOOR.get());
        add(ModBlocks.LIME_WOOD_DOOR.get(),
                block -> createDoorTable(ModBlocks.LIME_WOOD_DOOR.get()));

        dropSelf(ModBlocks.PINK_LOG.get());
        dropSelf(ModBlocks.PINK_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_PINK_LOG.get());
        dropSelf(ModBlocks.STRIPPED_PINK_WOOD.get());
        dropSelf(ModBlocks.PINK_PLANK.get());
        dropSelf(ModBlocks.PINK_WOOD_STAIRS.get());
        add(ModBlocks.PINK_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.PINK_WOOD_SLAB.get()));
        dropSelf(ModBlocks.PINK_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.PINK_WOOD_BUTTON.get());
        dropSelf(ModBlocks.PINK_WOOD_FENCE.get());
        dropSelf(ModBlocks.PINK_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.PINK_WOOD_TRAPDOOR.get());
        add(ModBlocks.PINK_WOOD_DOOR.get(),
                block -> createDoorTable(ModBlocks.PINK_WOOD_DOOR.get()));

        dropSelf(ModBlocks.BROWN_LOG.get());
        dropSelf(ModBlocks.BROWN_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_BROWN_LOG.get());
        dropSelf(ModBlocks.STRIPPED_BROWN_WOOD.get());
        dropSelf(ModBlocks.BROWN_PLANK.get());
        dropSelf(ModBlocks.BROWN_WOOD_STAIRS.get());
        add(ModBlocks.BROWN_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BROWN_WOOD_SLAB.get()));
        dropSelf(ModBlocks.BROWN_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.BROWN_WOOD_BUTTON.get());
        dropSelf(ModBlocks.BROWN_WOOD_FENCE.get());
        dropSelf(ModBlocks.BROWN_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.BROWN_WOOD_TRAPDOOR.get());
        add(ModBlocks.BROWN_WOOD_DOOR.get(),
                block -> createDoorTable(ModBlocks.BROWN_WOOD_DOOR.get()));

        dropSelf(ModBlocks.BLACK_LOG.get());
        dropSelf(ModBlocks.BLACK_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_BLACK_LOG.get());
        dropSelf(ModBlocks.STRIPPED_BLACK_WOOD.get());
        dropSelf(ModBlocks.BLACK_PLANK.get());
        dropSelf(ModBlocks.BLACK_WOOD_STAIRS.get());
        add(ModBlocks.BLACK_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BLACK_WOOD_SLAB.get()));
        dropSelf(ModBlocks.BLACK_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.BLACK_WOOD_BUTTON.get());
        dropSelf(ModBlocks.BLACK_WOOD_FENCE.get());
        dropSelf(ModBlocks.BLACK_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.BLACK_WOOD_TRAPDOOR.get());
        add(ModBlocks.BLACK_WOOD_DOOR.get(),
                block -> createDoorTable(ModBlocks.BLACK_WOOD_DOOR.get()));

        dropSelf(ModBlocks.WHITE_LOG.get());
        dropSelf(ModBlocks.WHITE_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_WHITE_LOG.get());
        dropSelf(ModBlocks.STRIPPED_WHITE_WOOD.get());
        dropSelf(ModBlocks.WHITE_PLANK.get());
        dropSelf(ModBlocks.WHITE_WOOD_STAIRS.get());
        add(ModBlocks.WHITE_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WHITE_WOOD_SLAB.get()));
        dropSelf(ModBlocks.WHITE_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.WHITE_WOOD_BUTTON.get());
        dropSelf(ModBlocks.WHITE_WOOD_FENCE.get());
        dropSelf(ModBlocks.WHITE_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.WHITE_WOOD_TRAPDOOR.get());
        add(ModBlocks.WHITE_WOOD_DOOR.get(),
                block -> createDoorTable(ModBlocks.WHITE_WOOD_DOOR.get()));

        dropSelf(ModBlocks.GRAY_LOG.get());
        dropSelf(ModBlocks.GRAY_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_GRAY_LOG.get());
        dropSelf(ModBlocks.STRIPPED_GRAY_WOOD.get());
        dropSelf(ModBlocks.GRAY_PLANK.get());
        dropSelf(ModBlocks.GRAY_WOOD_STAIRS.get());
        add(ModBlocks.GRAY_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GRAY_WOOD_SLAB.get()));
        dropSelf(ModBlocks.GRAY_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.GRAY_WOOD_BUTTON.get());
        dropSelf(ModBlocks.GRAY_WOOD_FENCE.get());
        dropSelf(ModBlocks.GRAY_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.GRAY_WOOD_TRAPDOOR.get());
        add(ModBlocks.GRAY_WOOD_DOOR.get(),
                block -> createDoorTable(ModBlocks.GRAY_WOOD_DOOR.get()));

        dropSelf(ModBlocks.LIGHT_GRAY_LOG.get());
        dropSelf(ModBlocks.LIGHT_GRAY_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_LIGHT_GRAY_LOG.get());
        dropSelf(ModBlocks.STRIPPED_LIGHT_GRAY_WOOD.get());
        dropSelf(ModBlocks.LIGHT_GRAY_PLANK.get());
        dropSelf(ModBlocks.LIGHT_GRAY_WOOD_STAIRS.get());
        add(ModBlocks.LIGHT_GRAY_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LIGHT_GRAY_WOOD_SLAB.get()));
        dropSelf(ModBlocks.LIGHT_GRAY_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.LIGHT_GRAY_WOOD_BUTTON.get());
        dropSelf(ModBlocks.LIGHT_GRAY_WOOD_FENCE.get());
        dropSelf(ModBlocks.LIGHT_GRAY_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.LIGHT_GRAY_WOOD_TRAPDOOR.get());
        add(ModBlocks.LIGHT_GRAY_WOOD_DOOR.get(),
                block -> createDoorTable(ModBlocks.LIGHT_GRAY_WOOD_DOOR.get()));

        dropSelf(ModBlocks.LIGHT_BLUE_LOG.get());
        dropSelf(ModBlocks.LIGHT_BLUE_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_LIGHT_BLUE_LOG.get());
        dropSelf(ModBlocks.STRIPPED_LIGHT_BLUE_WOOD.get());
        dropSelf(ModBlocks.LIGHT_BLUE_PLANK.get());
        dropSelf(ModBlocks.LIGHT_BLUE_WOOD_STAIRS.get());
        add(ModBlocks.LIGHT_BLUE_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LIGHT_BLUE_WOOD_SLAB.get()));
        dropSelf(ModBlocks.LIGHT_BLUE_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.LIGHT_BLUE_WOOD_BUTTON.get());
        dropSelf(ModBlocks.LIGHT_BLUE_WOOD_FENCE.get());
        dropSelf(ModBlocks.LIGHT_BLUE_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.LIGHT_BLUE_WOOD_TRAPDOOR.get());
        add(ModBlocks.LIGHT_BLUE_WOOD_DOOR.get(),
                block -> createDoorTable(ModBlocks.LIGHT_BLUE_WOOD_DOOR.get()));

        dropSelf(ModBlocks.MAGENTA_LOG.get());
        dropSelf(ModBlocks.MAGENTA_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_MAGENTA_LOG.get());
        dropSelf(ModBlocks.STRIPPED_MAGENTA_WOOD.get());
        dropSelf(ModBlocks.MAGENTA_PLANK.get());
        dropSelf(ModBlocks.MAGENTA_WOOD_STAIRS.get());
        add(ModBlocks.MAGENTA_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MAGENTA_WOOD_SLAB.get()));
        dropSelf(ModBlocks.MAGENTA_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.MAGENTA_WOOD_BUTTON.get());
        dropSelf(ModBlocks.MAGENTA_WOOD_FENCE.get());
        dropSelf(ModBlocks.MAGENTA_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.MAGENTA_WOOD_TRAPDOOR.get());
        add(ModBlocks.MAGENTA_WOOD_DOOR.get(),
                block -> createDoorTable(ModBlocks.MAGENTA_WOOD_DOOR.get()));

        dropSelf(ModBlocks.RED_SAPLING.get());
        this.add(ModBlocks.RED_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.RED_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.BLUE_SAPLING.get());
        this.add(ModBlocks.BLUE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.BLUE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.GREEN_SAPLING.get());
        this.add(ModBlocks.GREEN_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.GREEN_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.YELLOW_SAPLING.get());
        this.add(ModBlocks.YELLOW_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.YELLOW_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.PURPLE_SAPLING.get());
        this.add(ModBlocks.PURPLE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.PURPLE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.CYAN_SAPLING.get());
        this.add(ModBlocks.CYAN_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.CYAN_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.ORANGE_SAPLING.get());
        this.add(ModBlocks.ORANGE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.ORANGE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.LIME_SAPLING.get());
        this.add(ModBlocks.LIME_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.LIME_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.PINK_SAPLING.get());
        this.add(ModBlocks.PINK_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.PINK_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.BROWN_SAPLING.get());
        this.add(ModBlocks.BROWN_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.BROWN_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.BLACK_SAPLING.get());
        this.add(ModBlocks.BLACK_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.BLACK_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.WHITE_SAPLING.get());
        this.add(ModBlocks.WHITE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.WHITE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.GRAY_SAPLING.get());
        this.add(ModBlocks.GRAY_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.GRAY_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.LIGHT_GRAY_SAPLING.get());
        this.add(ModBlocks.LIGHT_GRAY_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.LIGHT_GRAY_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.LIGHT_BLUE_SAPLING.get());
        this.add(ModBlocks.LIGHT_BLUE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.LIGHT_BLUE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.MAGENTA_SAPLING.get());
        this.add(ModBlocks.MAGENTA_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.MAGENTA_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}

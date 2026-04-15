package net.fungoussoup.tintedgrove.datagen;

import net.fungoussoup.tintedgrove.block.ModBlocks;
import net.fungoussoup.tintedgrove.util.TintedColor;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        for (TintedColor color : TintedColor.values()) {
            generateWoodSetLoot(color);
            generateTreeLoot(color);
        }
    }

    private void generateWoodSetLoot(TintedColor color) {
        dropSelf(ModBlocks.getLog(color).get());
        dropSelf(ModBlocks.getWood(color).get());
        dropSelf(ModBlocks.getStrippedLog(color).get());
        dropSelf(ModBlocks.getStrippedWood(color).get());
        dropSelf(ModBlocks.getPlanks(color).get());
        dropSelf(ModBlocks.getWoodStairs(color).get());

        add(ModBlocks.getWoodSlab(color).get(),
                block -> createSlabItemTable(ModBlocks.getWoodSlab(color).get()));

        dropSelf(ModBlocks.getWoodPressurePlate(color).get());
        dropSelf(ModBlocks.getWoodButton(color).get());
        dropSelf(ModBlocks.getWoodFence(color).get());
        dropSelf(ModBlocks.getWoodFenceGate(color).get());
        dropSelf(ModBlocks.getWoodTrapdoor(color).get());

        add(ModBlocks.getWoodDoor(color).get(),
                block -> createDoorTable(ModBlocks.getWoodDoor(color).get()));
    }

    private void generateTreeLoot(TintedColor color) {
        dropSelf(ModBlocks.getSapling(color).get());

        add(ModBlocks.getLeaves(color).get(), block ->
                createLeavesDrops(block, ModBlocks.getSapling(color).get(), NORMAL_LEAVES_SAPLING_CHANCES));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
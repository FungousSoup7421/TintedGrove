package net.fungoussoup.tintedgrove.datagen;

import net.fungoussoup.tintedgrove.block.ModBlocks;
import net.fungoussoup.tintedgrove.util.TintedColor;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.FurnaceFuel;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;

import java.util.concurrent.CompletableFuture;

public class ModDataMapProvider extends DataMapProvider {
    protected ModDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather() {
        var builder = this.builder(NeoForgeDataMaps.FURNACE_FUELS);

        for (TintedColor color : TintedColor.values()) {
            builder
                    .add(ModBlocks.getLog(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getWood(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getStrippedLog(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getStrippedWood(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getPlank(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getWoodStairs(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getWoodPressurePlate(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getWoodFence(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getWoodFenceGate(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getWoodTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getWoodSlab(color).getId(), new FurnaceFuel(150), false)
                    .add(ModBlocks.getWoodButton(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getSapling(color).getId(), new FurnaceFuel(100), false);

        }
    }
}
package net.fungoussoup.tintedgrove.datagen;

import net.fungoussoup.tintedgrove.block.ModBlocks;
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
        this.builder(NeoForgeDataMaps.FURNACE_FUELS)
                .add(ModBlocks.RED_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.RED_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_RED_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_RED_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.RED_PLANK.getId(), new FurnaceFuel(300), false)
                
                .add(ModBlocks.BLUE_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.BLUE_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_BLUE_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_BLUE_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.BLUE_PLANK.getId(), new FurnaceFuel(300), false)
                
                .add(ModBlocks.GREEN_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.GREEN_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_GREEN_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_GREEN_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.GREEN_PLANK.getId(), new FurnaceFuel(300), false)
                
                .add(ModBlocks.YELLOW_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.YELLOW_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_YELLOW_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_YELLOW_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.YELLOW_PLANK.getId(), new FurnaceFuel(300), false)
                
                .add(ModBlocks.PURPLE_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.PURPLE_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_PURPLE_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_PURPLE_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.PURPLE_PLANK.getId(), new FurnaceFuel(300), false)
                
                .add(ModBlocks.CYAN_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.CYAN_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_CYAN_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_CYAN_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.CYAN_PLANK.getId(), new FurnaceFuel(300), false)
                
                .add(ModBlocks.ORANGE_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.ORANGE_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_ORANGE_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_ORANGE_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.ORANGE_PLANK.getId(), new FurnaceFuel(300), false)
                
                .add(ModBlocks.LIME_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.LIME_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_LIME_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_LIME_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.LIME_PLANK.getId(), new FurnaceFuel(300), false)
                
                .add(ModBlocks.PINK_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.PINK_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_PINK_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_PINK_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.PINK_PLANK.getId(), new FurnaceFuel(300), false)
                
                .add(ModBlocks.BROWN_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.BROWN_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_BROWN_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_BROWN_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.BROWN_PLANK.getId(), new FurnaceFuel(300), false)
                
                .add(ModBlocks.BLACK_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.BLACK_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_BLACK_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_BLACK_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.BLACK_PLANK.getId(), new FurnaceFuel(300), false)
                
                .add(ModBlocks.WHITE_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.WHITE_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_WHITE_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_WHITE_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.WHITE_PLANK.getId(), new FurnaceFuel(300), false)
                
                .add(ModBlocks.GRAY_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.GRAY_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_GRAY_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_GRAY_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.GRAY_PLANK.getId(), new FurnaceFuel(300), false)
                
                .add(ModBlocks.LIGHT_GRAY_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.LIGHT_GRAY_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_LIGHT_GRAY_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_LIGHT_GRAY_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.LIGHT_GRAY_PLANK.getId(), new FurnaceFuel(300), false)
                
                .add(ModBlocks.LIGHT_BLUE_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.LIGHT_BLUE_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_LIGHT_BLUE_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_LIGHT_BLUE_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.LIGHT_BLUE_PLANK.getId(), new FurnaceFuel(300), false)
                
                .add(ModBlocks.MAGENTA_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.MAGENTA_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_MAGENTA_LOG.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.STRIPPED_MAGENTA_WOOD.getId(), new FurnaceFuel(300), false)
                .add(ModBlocks.MAGENTA_PLANK.getId(), new FurnaceFuel(300), false)

                ;
                
    }
}

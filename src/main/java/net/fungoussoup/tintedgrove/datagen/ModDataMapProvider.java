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
                    .add(ModBlocks.getPlanks(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getWoodStairs(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getWoodPressurePlate(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getWoodFence(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getWoodFenceGate(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getWoodTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getWoodSlab(color).getId(), new FurnaceFuel(150), false)
                    .add(ModBlocks.getWoodButton(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getSapling(color).getId(), new FurnaceFuel(100), false)

                    .add(ModBlocks.getGlassWindowDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getWhiteGlassWindowDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getOrangeGlassWindowDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getMagentaGlassWindowDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getLightBlueGlassWindowDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getYellowGlassWindowDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getLimeGlassWindowDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getPinkGlassWindowDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getGrayGlassWindowDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getLightGrayGlassWindowDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getCyanGlassWindowDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getPurpleGlassWindowDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getBlueGlassWindowDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getBrownGlassWindowDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getGreenGlassWindowDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getRedGlassWindowDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getBlackGlassWindowDoor(color).getId(), new FurnaceFuel(100), false)

                    .add(ModBlocks.getLeftGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getLeftWhiteGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getLeftOrangeGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getLeftMagentaGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getLeftLightBlueGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getLeftYellowGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getLeftLimeGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getLeftPinkGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getLeftGrayGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getLeftLightGrayGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getLeftCyanGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getLeftPurpleGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getLeftBlueGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getLeftBrownGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getLeftGreenGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getLeftRedGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getLeftBlackGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)

                    .add(ModBlocks.getRightGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getRightWhiteGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getRightOrangeGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getRightMagentaGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getRightLightBlueGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getRightYellowGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getRightLimeGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getRightPinkGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getRightGrayGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getRightLightGrayGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getRightCyanGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getRightPurpleGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getRightBlueGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getRightBrownGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getRightGreenGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getRightRedGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)
                    .add(ModBlocks.getRightBlackGlassPanelDoor(color).getId(), new FurnaceFuel(100), false)

            ;

        }
    }
}
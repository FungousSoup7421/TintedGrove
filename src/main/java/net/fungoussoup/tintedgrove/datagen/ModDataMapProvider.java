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
                    .add(ModBlocks.getSmoothTrapdoor(color).getId(), new FurnaceFuel(300), false)
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

                    .add(ModBlocks.getGlassTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getWhiteGlassTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getOrangeGlassTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getMagentaGlassTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getLightBlueGlassTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getYellowGlassTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getLimeGlassTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getPinkGlassTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getGrayGlassTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getLightGrayGlassTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getCyanGlassTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getPurpleGlassTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getBlueGlassTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getBrownGlassTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getGreenGlassTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getRedGlassTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getBlackGlassTrapdoor(color).getId(), new FurnaceFuel(300), false)

                    .add(ModBlocks.getGlassGridTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getWhiteGlassGridTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getOrangeGlassGridTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getMagentaGlassGridTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getLightBlueGlassGridTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getYellowGlassGridTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getLimeGlassGridTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getPinkGlassGridTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getGrayGlassGridTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getLightGrayGlassGridTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getCyanGlassGridTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getPurpleGlassGridTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getBlueGlassGridTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getBrownGlassGridTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getGreenGlassGridTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getRedGlassGridTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getBlackGlassGridTrapdoor(color).getId(), new FurnaceFuel(300), false)

                    .add(ModBlocks.getGlassPanelsTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getWhiteGlassPanelsTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getOrangeGlassPanelsTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getMagentaGlassPanelsTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getLightBlueGlassPanelsTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getYellowGlassPanelsTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getLimeGlassPanelsTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getPinkGlassPanelsTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getGrayGlassPanelsTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getLightGrayGlassPanelsTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getCyanGlassPanelsTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getPurpleGlassPanelsTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getBlueGlassPanelsTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getBrownGlassPanelsTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getGreenGlassPanelsTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getRedGlassPanelsTrapdoor(color).getId(), new FurnaceFuel(300), false)
                    .add(ModBlocks.getBlackGlassPanelsTrapdoor(color).getId(), new FurnaceFuel(300), false)
            ;

        }
    }
}
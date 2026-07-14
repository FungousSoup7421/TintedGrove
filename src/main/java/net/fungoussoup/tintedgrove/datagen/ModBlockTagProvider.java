package net.fungoussoup.tintedgrove.datagen;

import net.fungoussoup.tintedgrove.TintedGrove;
import net.fungoussoup.tintedgrove.block.ModBlocks;
import net.fungoussoup.tintedgrove.util.TintedColor;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output,
                               CompletableFuture<HolderLookup.Provider> lookupProvider,
                               @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TintedGrove.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        for (TintedColor color : TintedColor.values()) {
            addAxeMineable(color);
            addFenceTags(color);
            addBurnableLogs(color);
        }
    }

    private void addAxeMineable(TintedColor color) {
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.getLog(color).get())
                .add(ModBlocks.getWood(color).get())
                .add(ModBlocks.getStrippedWood(color).get())
                .add(ModBlocks.getStrippedLog(color).get())
                .add(ModBlocks.getPlanks(color).get())
                .add(ModBlocks.getWoodStairs(color).get())
                .add(ModBlocks.getWoodSlab(color).get())
                .add(ModBlocks.getWoodButton(color).get())
                .add(ModBlocks.getWoodPressurePlate(color).get())
                .add(ModBlocks.getWoodFence(color).get())
                .add(ModBlocks.getWoodFenceGate(color).get())
                .add(ModBlocks.getWoodDoor(color).get())
                .add(ModBlocks.getWoodTrapdoor(color).get())
                .add(ModBlocks.getSmoothTrapdoor(color).get())

                .add(ModBlocks.getGlassDoor(color).get())
                .add(ModBlocks.getWhiteGlassDoor(color).get())
                .add(ModBlocks.getOrangeGlassDoor(color).get())
                .add(ModBlocks.getMagentaGlassDoor(color).get())
                .add(ModBlocks.getLightBlueGlassDoor(color).get())
                .add(ModBlocks.getYellowGlassDoor(color).get())
                .add(ModBlocks.getLimeGlassDoor(color).get())
                .add(ModBlocks.getPinkGlassDoor(color).get())
                .add(ModBlocks.getGrayGlassDoor(color).get())
                .add(ModBlocks.getLightGrayGlassDoor(color).get())
                .add(ModBlocks.getCyanGlassDoor(color).get())
                .add(ModBlocks.getPurpleGlassDoor(color).get())
                .add(ModBlocks.getBlueGlassDoor(color).get())
                .add(ModBlocks.getBrownGlassDoor(color).get())
                .add(ModBlocks.getGreenGlassDoor(color).get())
                .add(ModBlocks.getRedGlassDoor(color).get())
                .add(ModBlocks.getBlackGlassDoor(color).get())

                .add(ModBlocks.getGlassWindowDoor(color).get())
                .add(ModBlocks.getWhiteGlassWindowDoor(color).get())
                .add(ModBlocks.getOrangeGlassWindowDoor(color).get())
                .add(ModBlocks.getMagentaGlassWindowDoor(color).get())
                .add(ModBlocks.getLightBlueGlassWindowDoor(color).get())
                .add(ModBlocks.getYellowGlassWindowDoor(color).get())
                .add(ModBlocks.getLimeGlassWindowDoor(color).get())
                .add(ModBlocks.getPinkGlassWindowDoor(color).get())
                .add(ModBlocks.getGrayGlassWindowDoor(color).get())
                .add(ModBlocks.getLightGrayGlassWindowDoor(color).get())
                .add(ModBlocks.getCyanGlassWindowDoor(color).get())
                .add(ModBlocks.getPurpleGlassWindowDoor(color).get())
                .add(ModBlocks.getBlueGlassWindowDoor(color).get())
                .add(ModBlocks.getBrownGlassWindowDoor(color).get())
                .add(ModBlocks.getGreenGlassWindowDoor(color).get())
                .add(ModBlocks.getRedGlassWindowDoor(color).get())
                .add(ModBlocks.getBlackGlassWindowDoor(color).get())

                .add(ModBlocks.getLeftGlassPanelDoor(color).get())
                .add(ModBlocks.getLeftWhiteGlassPanelDoor(color).get())
                .add(ModBlocks.getLeftOrangeGlassPanelDoor(color).get())
                .add(ModBlocks.getLeftMagentaGlassPanelDoor(color).get())
                .add(ModBlocks.getLeftLightBlueGlassPanelDoor(color).get())
                .add(ModBlocks.getLeftYellowGlassPanelDoor(color).get())
                .add(ModBlocks.getLeftLimeGlassPanelDoor(color).get())
                .add(ModBlocks.getLeftPinkGlassPanelDoor(color).get())
                .add(ModBlocks.getLeftGrayGlassPanelDoor(color).get())
                .add(ModBlocks.getLeftLightGrayGlassPanelDoor(color).get())
                .add(ModBlocks.getLeftCyanGlassPanelDoor(color).get())
                .add(ModBlocks.getLeftPurpleGlassPanelDoor(color).get())
                .add(ModBlocks.getLeftBlueGlassPanelDoor(color).get())
                .add(ModBlocks.getLeftBrownGlassPanelDoor(color).get())
                .add(ModBlocks.getLeftGreenGlassPanelDoor(color).get())
                .add(ModBlocks.getLeftRedGlassPanelDoor(color).get())
                .add(ModBlocks.getLeftBlackGlassPanelDoor(color).get())

                .add(ModBlocks.getRightGlassPanelDoor(color).get())
                .add(ModBlocks.getRightWhiteGlassPanelDoor(color).get())
                .add(ModBlocks.getRightOrangeGlassPanelDoor(color).get())
                .add(ModBlocks.getRightMagentaGlassPanelDoor(color).get())
                .add(ModBlocks.getRightLightBlueGlassPanelDoor(color).get())
                .add(ModBlocks.getRightYellowGlassPanelDoor(color).get())
                .add(ModBlocks.getRightLimeGlassPanelDoor(color).get())
                .add(ModBlocks.getRightPinkGlassPanelDoor(color).get())
                .add(ModBlocks.getRightGrayGlassPanelDoor(color).get())
                .add(ModBlocks.getRightLightGrayGlassPanelDoor(color).get())
                .add(ModBlocks.getRightCyanGlassPanelDoor(color).get())
                .add(ModBlocks.getRightPurpleGlassPanelDoor(color).get())
                .add(ModBlocks.getRightBlueGlassPanelDoor(color).get())
                .add(ModBlocks.getRightBrownGlassPanelDoor(color).get())
                .add(ModBlocks.getRightGreenGlassPanelDoor(color).get())
                .add(ModBlocks.getRightRedGlassPanelDoor(color).get())
                .add(ModBlocks.getRightBlackGlassPanelDoor(color).get())

                .add(ModBlocks.getGlassTrapdoor(color).get())
                .add(ModBlocks.getWhiteGlassTrapdoor(color).get())
                .add(ModBlocks.getOrangeGlassTrapdoor(color).get())
                .add(ModBlocks.getMagentaGlassTrapdoor(color).get())
                .add(ModBlocks.getLightBlueGlassTrapdoor(color).get())
                .add(ModBlocks.getYellowGlassTrapdoor(color).get())
                .add(ModBlocks.getLimeGlassTrapdoor(color).get())
                .add(ModBlocks.getPinkGlassTrapdoor(color).get())
                .add(ModBlocks.getGrayGlassTrapdoor(color).get())
                .add(ModBlocks.getLightGrayGlassTrapdoor(color).get())
                .add(ModBlocks.getCyanGlassTrapdoor(color).get())
                .add(ModBlocks.getPurpleGlassTrapdoor(color).get())
                .add(ModBlocks.getBlueGlassTrapdoor(color).get())
                .add(ModBlocks.getBrownGlassTrapdoor(color).get())
                .add(ModBlocks.getGreenGlassTrapdoor(color).get())
                .add(ModBlocks.getRedGlassTrapdoor(color).get())
                .add(ModBlocks.getBlackGlassTrapdoor(color).get())

                .add(ModBlocks.getGlassGridTrapdoor(color).get())
                .add(ModBlocks.getWhiteGlassGridTrapdoor(color).get())
                .add(ModBlocks.getOrangeGlassGridTrapdoor(color).get())
                .add(ModBlocks.getMagentaGlassGridTrapdoor(color).get())
                .add(ModBlocks.getLightBlueGlassGridTrapdoor(color).get())
                .add(ModBlocks.getYellowGlassGridTrapdoor(color).get())
                .add(ModBlocks.getLimeGlassGridTrapdoor(color).get())
                .add(ModBlocks.getPinkGlassGridTrapdoor(color).get())
                .add(ModBlocks.getGrayGlassGridTrapdoor(color).get())
                .add(ModBlocks.getLightGrayGlassGridTrapdoor(color).get())
                .add(ModBlocks.getCyanGlassGridTrapdoor(color).get())
                .add(ModBlocks.getPurpleGlassGridTrapdoor(color).get())
                .add(ModBlocks.getBlueGlassGridTrapdoor(color).get())
                .add(ModBlocks.getBrownGlassGridTrapdoor(color).get())
                .add(ModBlocks.getGreenGlassGridTrapdoor(color).get())
                .add(ModBlocks.getRedGlassGridTrapdoor(color).get())
                .add(ModBlocks.getBlackGlassGridTrapdoor(color).get())

                .add(ModBlocks.getGlassPanelsTrapdoor(color).get())
                .add(ModBlocks.getWhiteGlassPanelsTrapdoor(color).get())
                .add(ModBlocks.getOrangeGlassPanelsTrapdoor(color).get())
                .add(ModBlocks.getMagentaGlassPanelsTrapdoor(color).get())
                .add(ModBlocks.getLightBlueGlassPanelsTrapdoor(color).get())
                .add(ModBlocks.getYellowGlassPanelsTrapdoor(color).get())
                .add(ModBlocks.getLimeGlassPanelsTrapdoor(color).get())
                .add(ModBlocks.getPinkGlassPanelsTrapdoor(color).get())
                .add(ModBlocks.getGrayGlassPanelsTrapdoor(color).get())
                .add(ModBlocks.getLightGrayGlassPanelsTrapdoor(color).get())
                .add(ModBlocks.getCyanGlassPanelsTrapdoor(color).get())
                .add(ModBlocks.getPurpleGlassPanelsTrapdoor(color).get())
                .add(ModBlocks.getBlueGlassPanelsTrapdoor(color).get())
                .add(ModBlocks.getBrownGlassPanelsTrapdoor(color).get())
                .add(ModBlocks.getGreenGlassPanelsTrapdoor(color).get())
                .add(ModBlocks.getRedGlassPanelsTrapdoor(color).get())
                .add(ModBlocks.getBlackGlassPanelsTrapdoor(color).get())

        ;
    }

    private void addFenceTags(TintedColor color) {
        tag(BlockTags.FENCES)
                .add(ModBlocks.getWoodFence(color).get());

        tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.getWoodFenceGate(color).get());
    }

    private void addBurnableLogs(TintedColor color) {
        tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.getLog(color).get())
                .add(ModBlocks.getWood(color).get())
                .add(ModBlocks.getStrippedLog(color).get())
                .add(ModBlocks.getStrippedWood(color).get());
    }
}
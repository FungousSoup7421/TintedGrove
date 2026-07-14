package net.fungoussoup.tintedgrove.datagen;

import net.fungoussoup.tintedgrove.block.ModBlocks;
import net.fungoussoup.tintedgrove.util.TintedColor;
import net.fungoussoup.tintedgrove.util.TintedFlowerType;
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
            generateDoorVariantsLoot(color);
            generateTrapdoorVariantsLoot(color);
        }

        for (TintedFlowerType type : TintedFlowerType.values()) {
            for (TintedColor color : TintedColor.values()) {
                Block flower = ModBlocks.FLOWERS.get(type).get(color).get();
                Block potted = ModBlocks.POTTED_FLOWERS.get(type).get(color).get();

                this.dropSelf(flower);
                this.add(potted, createPotFlowerItemTable(ModBlocks.FLOWERS.get(type).get(color)));
            }
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
        dropSelf(ModBlocks.getSmoothTrapdoor(color).get());

        add(ModBlocks.getWoodDoor(color).get(),
                block -> createDoorTable(ModBlocks.getWoodDoor(color).get()));
    }

    private void generateDoorVariantsLoot(TintedColor color) {
        add(ModBlocks.getGlassDoor(color).get(), block -> createDoorTable(ModBlocks.getGlassDoor(color).get()));
        add(ModBlocks.getWhiteGlassDoor(color).get(), block -> createDoorTable(ModBlocks.getWhiteGlassDoor(color).get()));
        add(ModBlocks.getOrangeGlassDoor(color).get(), block -> createDoorTable(ModBlocks.getOrangeGlassDoor(color).get()));
        add(ModBlocks.getMagentaGlassDoor(color).get(), block -> createDoorTable(ModBlocks.getMagentaGlassDoor(color).get()));
        add(ModBlocks.getLightBlueGlassDoor(color).get(), block -> createDoorTable(ModBlocks.getLightBlueGlassDoor(color).get()));
        add(ModBlocks.getYellowGlassDoor(color).get(), block -> createDoorTable(ModBlocks.getYellowGlassDoor(color).get()));
        add(ModBlocks.getLimeGlassDoor(color).get(), block -> createDoorTable(ModBlocks.getLimeGlassDoor(color).get()));
        add(ModBlocks.getPinkGlassDoor(color).get(), block -> createDoorTable(ModBlocks.getPinkGlassDoor(color).get()));
        add(ModBlocks.getGrayGlassDoor(color).get(), block -> createDoorTable(ModBlocks.getGrayGlassDoor(color).get()));
        add(ModBlocks.getLightGrayGlassDoor(color).get(), block -> createDoorTable(ModBlocks.getLightGrayGlassDoor(color).get()));
        add(ModBlocks.getCyanGlassDoor(color).get(), block -> createDoorTable(ModBlocks.getCyanGlassDoor(color).get()));
        add(ModBlocks.getPurpleGlassDoor(color).get(), block -> createDoorTable(ModBlocks.getPurpleGlassDoor(color).get()));
        add(ModBlocks.getBlueGlassDoor(color).get(), block -> createDoorTable(ModBlocks.getBlueGlassDoor(color).get()));
        add(ModBlocks.getBrownGlassDoor(color).get(), block -> createDoorTable(ModBlocks.getBrownGlassDoor(color).get()));
        add(ModBlocks.getGreenGlassDoor(color).get(), block -> createDoorTable(ModBlocks.getGreenGlassDoor(color).get()));
        add(ModBlocks.getRedGlassDoor(color).get(), block -> createDoorTable(ModBlocks.getRedGlassDoor(color).get()));
        add(ModBlocks.getBlackGlassDoor(color).get(), block -> createDoorTable(ModBlocks.getBlackGlassDoor(color).get()));

        add(ModBlocks.getGlassWindowDoor(color).get(), block -> createDoorTable(ModBlocks.getGlassWindowDoor(color).get()));
        add(ModBlocks.getWhiteGlassWindowDoor(color).get(), block -> createDoorTable(ModBlocks.getWhiteGlassWindowDoor(color).get()));
        add(ModBlocks.getOrangeGlassWindowDoor(color).get(), block -> createDoorTable(ModBlocks.getOrangeGlassWindowDoor(color).get()));
        add(ModBlocks.getMagentaGlassWindowDoor(color).get(), block -> createDoorTable(ModBlocks.getMagentaGlassWindowDoor(color).get()));
        add(ModBlocks.getLightBlueGlassWindowDoor(color).get(), block -> createDoorTable(ModBlocks.getLightBlueGlassWindowDoor(color).get()));
        add(ModBlocks.getYellowGlassWindowDoor(color).get(), block -> createDoorTable(ModBlocks.getYellowGlassWindowDoor(color).get()));
        add(ModBlocks.getLimeGlassWindowDoor(color).get(), block -> createDoorTable(ModBlocks.getLimeGlassWindowDoor(color).get()));
        add(ModBlocks.getPinkGlassWindowDoor(color).get(), block -> createDoorTable(ModBlocks.getPinkGlassWindowDoor(color).get()));
        add(ModBlocks.getGrayGlassWindowDoor(color).get(), block -> createDoorTable(ModBlocks.getGrayGlassWindowDoor(color).get()));
        add(ModBlocks.getLightGrayGlassWindowDoor(color).get(), block -> createDoorTable(ModBlocks.getLightGrayGlassWindowDoor(color).get()));
        add(ModBlocks.getCyanGlassWindowDoor(color).get(), block -> createDoorTable(ModBlocks.getCyanGlassWindowDoor(color).get()));
        add(ModBlocks.getPurpleGlassWindowDoor(color).get(), block -> createDoorTable(ModBlocks.getPurpleGlassWindowDoor(color).get()));
        add(ModBlocks.getBlueGlassWindowDoor(color).get(), block -> createDoorTable(ModBlocks.getBlueGlassWindowDoor(color).get()));
        add(ModBlocks.getBrownGlassWindowDoor(color).get(), block -> createDoorTable(ModBlocks.getBrownGlassWindowDoor(color).get()));
        add(ModBlocks.getGreenGlassWindowDoor(color).get(), block -> createDoorTable(ModBlocks.getGreenGlassWindowDoor(color).get()));
        add(ModBlocks.getRedGlassWindowDoor(color).get(), block -> createDoorTable(ModBlocks.getRedGlassWindowDoor(color).get()));
        add(ModBlocks.getBlackGlassWindowDoor(color).get(), block -> createDoorTable(ModBlocks.getBlackGlassWindowDoor(color).get()));

        add(ModBlocks.getLeftGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getLeftGlassPanelDoor(color).get()));
        add(ModBlocks.getLeftWhiteGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getLeftWhiteGlassPanelDoor(color).get()));
        add(ModBlocks.getLeftOrangeGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getLeftOrangeGlassPanelDoor(color).get()));
        add(ModBlocks.getLeftMagentaGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getLeftMagentaGlassPanelDoor(color).get()));
        add(ModBlocks.getLeftLightBlueGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getLeftLightBlueGlassPanelDoor(color).get()));
        add(ModBlocks.getLeftYellowGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getLeftYellowGlassPanelDoor(color).get()));
        add(ModBlocks.getLeftLimeGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getLeftLimeGlassPanelDoor(color).get()));
        add(ModBlocks.getLeftPinkGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getLeftPinkGlassPanelDoor(color).get()));
        add(ModBlocks.getLeftGrayGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getLeftGrayGlassPanelDoor(color).get()));
        add(ModBlocks.getLeftLightGrayGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getLeftLightGrayGlassPanelDoor(color).get()));
        add(ModBlocks.getLeftCyanGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getLeftCyanGlassPanelDoor(color).get()));
        add(ModBlocks.getLeftPurpleGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getLeftPurpleGlassPanelDoor(color).get()));
        add(ModBlocks.getLeftBlueGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getLeftBlueGlassPanelDoor(color).get()));
        add(ModBlocks.getLeftBrownGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getLeftBrownGlassPanelDoor(color).get()));
        add(ModBlocks.getLeftGreenGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getLeftGreenGlassPanelDoor(color).get()));
        add(ModBlocks.getLeftRedGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getLeftRedGlassPanelDoor(color).get()));
        add(ModBlocks.getLeftBlackGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getLeftBlackGlassPanelDoor(color).get()));

        add(ModBlocks.getRightGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getRightGlassPanelDoor(color).get()));
        add(ModBlocks.getRightWhiteGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getRightWhiteGlassPanelDoor(color).get()));
        add(ModBlocks.getRightOrangeGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getRightOrangeGlassPanelDoor(color).get()));
        add(ModBlocks.getRightMagentaGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getRightMagentaGlassPanelDoor(color).get()));
        add(ModBlocks.getRightLightBlueGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getRightLightBlueGlassPanelDoor(color).get()));
        add(ModBlocks.getRightYellowGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getRightYellowGlassPanelDoor(color).get()));
        add(ModBlocks.getRightLimeGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getRightLimeGlassPanelDoor(color).get()));
        add(ModBlocks.getRightPinkGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getRightPinkGlassPanelDoor(color).get()));
        add(ModBlocks.getRightGrayGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getRightGrayGlassPanelDoor(color).get()));
        add(ModBlocks.getRightLightGrayGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getRightLightGrayGlassPanelDoor(color).get()));
        add(ModBlocks.getRightCyanGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getRightCyanGlassPanelDoor(color).get()));
        add(ModBlocks.getRightPurpleGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getRightPurpleGlassPanelDoor(color).get()));
        add(ModBlocks.getRightBlueGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getRightBlueGlassPanelDoor(color).get()));
        add(ModBlocks.getRightBrownGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getRightBrownGlassPanelDoor(color).get()));
        add(ModBlocks.getRightGreenGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getRightGreenGlassPanelDoor(color).get()));
        add(ModBlocks.getRightRedGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getRightRedGlassPanelDoor(color).get()));
        add(ModBlocks.getRightBlackGlassPanelDoor(color).get(), block -> createDoorTable(ModBlocks.getRightBlackGlassPanelDoor(color).get()));
    }

    private void generateTrapdoorVariantsLoot(TintedColor color) {
        dropSelf(ModBlocks.getGlassTrapdoor(color).get());
        dropSelf(ModBlocks.getWhiteGlassTrapdoor(color).get());
        dropSelf(ModBlocks.getOrangeGlassTrapdoor(color).get());
        dropSelf(ModBlocks.getMagentaGlassTrapdoor(color).get());
        dropSelf(ModBlocks.getLightBlueGlassTrapdoor(color).get());
        dropSelf(ModBlocks.getYellowGlassTrapdoor(color).get());
        dropSelf(ModBlocks.getLimeGlassTrapdoor(color).get());
        dropSelf(ModBlocks.getPinkGlassTrapdoor(color).get());
        dropSelf(ModBlocks.getGrayGlassTrapdoor(color).get());
        dropSelf(ModBlocks.getLightGrayGlassTrapdoor(color).get());
        dropSelf(ModBlocks.getCyanGlassTrapdoor(color).get());
        dropSelf(ModBlocks.getPurpleGlassTrapdoor(color).get());
        dropSelf(ModBlocks.getBlueGlassTrapdoor(color).get());
        dropSelf(ModBlocks.getBrownGlassTrapdoor(color).get());
        dropSelf(ModBlocks.getGreenGlassTrapdoor(color).get());
        dropSelf(ModBlocks.getRedGlassTrapdoor(color).get());
        dropSelf(ModBlocks.getBlackGlassTrapdoor(color).get());

        dropSelf(ModBlocks.getGlassGridTrapdoor(color).get());
        dropSelf(ModBlocks.getWhiteGlassGridTrapdoor(color).get());
        dropSelf(ModBlocks.getOrangeGlassGridTrapdoor(color).get());
        dropSelf(ModBlocks.getMagentaGlassGridTrapdoor(color).get());
        dropSelf(ModBlocks.getLightBlueGlassGridTrapdoor(color).get());
        dropSelf(ModBlocks.getYellowGlassGridTrapdoor(color).get());
        dropSelf(ModBlocks.getLimeGlassGridTrapdoor(color).get());
        dropSelf(ModBlocks.getPinkGlassGridTrapdoor(color).get());
        dropSelf(ModBlocks.getGrayGlassGridTrapdoor(color).get());
        dropSelf(ModBlocks.getLightGrayGlassGridTrapdoor(color).get());
        dropSelf(ModBlocks.getCyanGlassGridTrapdoor(color).get());
        dropSelf(ModBlocks.getPurpleGlassGridTrapdoor(color).get());
        dropSelf(ModBlocks.getBlueGlassGridTrapdoor(color).get());
        dropSelf(ModBlocks.getBrownGlassGridTrapdoor(color).get());
        dropSelf(ModBlocks.getGreenGlassGridTrapdoor(color).get());
        dropSelf(ModBlocks.getRedGlassGridTrapdoor(color).get());
        dropSelf(ModBlocks.getBlackGlassGridTrapdoor(color).get());

        dropSelf(ModBlocks.getGlassPanelsTrapdoor(color).get());
        dropSelf(ModBlocks.getWhiteGlassPanelsTrapdoor(color).get());
        dropSelf(ModBlocks.getOrangeGlassPanelsTrapdoor(color).get());
        dropSelf(ModBlocks.getMagentaGlassPanelsTrapdoor(color).get());
        dropSelf(ModBlocks.getLightBlueGlassPanelsTrapdoor(color).get());
        dropSelf(ModBlocks.getYellowGlassPanelsTrapdoor(color).get());
        dropSelf(ModBlocks.getLimeGlassPanelsTrapdoor(color).get());
        dropSelf(ModBlocks.getPinkGlassPanelsTrapdoor(color).get());
        dropSelf(ModBlocks.getGrayGlassPanelsTrapdoor(color).get());
        dropSelf(ModBlocks.getLightGrayGlassPanelsTrapdoor(color).get());
        dropSelf(ModBlocks.getCyanGlassPanelsTrapdoor(color).get());
        dropSelf(ModBlocks.getPurpleGlassPanelsTrapdoor(color).get());
        dropSelf(ModBlocks.getBlueGlassPanelsTrapdoor(color).get());
        dropSelf(ModBlocks.getBrownGlassPanelsTrapdoor(color).get());
        dropSelf(ModBlocks.getGreenGlassPanelsTrapdoor(color).get());
        dropSelf(ModBlocks.getRedGlassPanelsTrapdoor(color).get());
        dropSelf(ModBlocks.getBlackGlassPanelsTrapdoor(color).get());
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
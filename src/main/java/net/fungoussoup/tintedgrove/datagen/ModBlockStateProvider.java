package net.fungoussoup.tintedgrove.datagen;

import net.fungoussoup.tintedgrove.TintedGrove;
import net.fungoussoup.tintedgrove.block.ModBlocks;
import net.fungoussoup.tintedgrove.util.TintedColor;
import net.fungoussoup.tintedgrove.util.TintedFlowerType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TintedGrove.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        for (TintedColor color : TintedColor.values()) {
            registerWoodSet(color);
            registerTreeSet(color);
            registerDoorVariants(color);
        }

        for (TintedFlowerType type : TintedFlowerType.values()) {
            for (TintedColor color : TintedColor.values()) {

                Block flower = ModBlocks.FLOWERS.get(type).get(color).get();
                Block potted = ModBlocks.POTTED_FLOWERS.get(type).get(color).get();

                // Normal flower (cross model)
                simpleBlock(flower,
                        models().cross(
                                BuiltInRegistries.BLOCK.getKey(flower).getPath(),
                                blockTexture(flower)
                        ).renderType("cutout"));

                // Potted flower
                simpleBlock(potted,
                        models().singleTexture(
                                BuiltInRegistries.BLOCK.getKey(potted).getPath(),
                                ResourceLocation.parse("minecraft:block/flower_pot_cross"),
                                "plant",
                                blockTexture(flower)
                        ).renderType("cutout"));
            }
        }
    }

    private void registerWoodSet(TintedColor color) {
        logBlock((RotatedPillarBlock) ModBlocks.getLog(color).get());
        logBlock((RotatedPillarBlock) ModBlocks.getStrippedLog(color).get());

        axisBlock((RotatedPillarBlock) ModBlocks.getWood(color).get(),
                blockTexture(ModBlocks.getLog(color).get()),
                blockTexture(ModBlocks.getLog(color).get()));

        axisBlock((RotatedPillarBlock) ModBlocks.getStrippedWood(color).get(),
                blockTexture(ModBlocks.getStrippedLog(color).get()),
                blockTexture(ModBlocks.getStrippedLog(color).get()));

        blockItem(ModBlocks.getLog(color));
        blockItem(ModBlocks.getWood(color));
        blockItem(ModBlocks.getStrippedLog(color));
        blockItem(ModBlocks.getStrippedWood(color));

        blockWithItem(ModBlocks.getPlanks(color));

        stairsBlock(ModBlocks.getWoodStairs(color).get(), blockTexture(ModBlocks.getPlanks(color).get()));
        slabBlock(ModBlocks.getWoodSlab(color).get(),
                blockTexture(ModBlocks.getPlanks(color).get()),
                blockTexture(ModBlocks.getPlanks(color).get()));

        buttonBlock(ModBlocks.getWoodButton(color).get(), blockTexture(ModBlocks.getPlanks(color).get()));
        pressurePlateBlock(ModBlocks.getWoodPressurePlate(color).get(), blockTexture(ModBlocks.getPlanks(color).get()));
        fenceBlock(ModBlocks.getWoodFence(color).get(), blockTexture(ModBlocks.getPlanks(color).get()));
        fenceGateBlock(ModBlocks.getWoodFenceGate(color).get(), blockTexture(ModBlocks.getPlanks(color).get()));

        doorBlockWithRenderType(
                ModBlocks.getWoodDoor(color).get(),
                modLoc("block/" + color.blockName("wood_door_bottom")),
                modLoc("block/" + color.blockName("wood_door_top")),
                "cutout"
        );

        trapdoorBlockWithRenderType(
                ModBlocks.getWoodTrapdoor(color).get(),
                modLoc("block/" + color.blockName("wood_trapdoor")),
                true,
                "cutout"
        );


        blockItem(ModBlocks.getWoodStairs(color));
        blockItem(ModBlocks.getWoodSlab(color));
        blockItem(ModBlocks.getWoodPressurePlate(color));
        blockItem(ModBlocks.getWoodFenceGate(color));
        blockItem(ModBlocks.getWoodTrapdoor(color), "_bottom");
    }

    private void registerDoorVariants(TintedColor color) {
        doorBlockWithRenderType(ModBlocks.getGlassDoor(color).get(), modLoc("block/" + color.blockName("glass_door_bottom")), modLoc("block/" + color.blockName("glass_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getWhiteGlassDoor(color).get(), modLoc("block/" + color.blockName("white_glass_door_bottom")), modLoc("block/" + color.blockName("white_glass_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getOrangeGlassDoor(color).get(), modLoc("block/" + color.blockName("orange_glass_door_bottom")), modLoc("block/" + color.blockName("orange_glass_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getMagentaGlassDoor(color).get(), modLoc("block/" + color.blockName("magenta_glass_door_bottom")), modLoc("block/" + color.blockName("magenta_glass_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getLightBlueGlassDoor(color).get(), modLoc("block/" + color.blockName("light_blue_glass_door_bottom")), modLoc("block/" + color.blockName("light_blue_glass_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getYellowGlassDoor(color).get(), modLoc("block/" + color.blockName("yellow_glass_door_bottom")), modLoc("block/" + color.blockName("yellow_glass_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getLimeGlassDoor(color).get(), modLoc("block/" + color.blockName("lime_glass_door_bottom")), modLoc("block/" + color.blockName("lime_glass_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getPinkGlassDoor(color).get(), modLoc("block/" + color.blockName("pink_glass_door_bottom")), modLoc("block/" + color.blockName("pink_glass_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getGrayGlassDoor(color).get(), modLoc("block/" + color.blockName("gray_glass_door_bottom")), modLoc("block/" + color.blockName("gray_glass_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getLightGrayGlassDoor(color).get(), modLoc("block/" + color.blockName("light_gray_glass_door_bottom")), modLoc("block/" + color.blockName("light_gray_glass_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getCyanGlassDoor(color).get(), modLoc("block/" + color.blockName("cyan_glass_door_bottom")), modLoc("block/" + color.blockName("cyan_glass_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getPurpleGlassDoor(color).get(), modLoc("block/" + color.blockName("purple_glass_door_bottom")), modLoc("block/" + color.blockName("purple_glass_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getBlueGlassDoor(color).get(), modLoc("block/" + color.blockName("blue_glass_door_bottom")), modLoc("block/" + color.blockName("blue_glass_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getBrownGlassDoor(color).get(), modLoc("block/" + color.blockName("brown_glass_door_bottom")), modLoc("block/" + color.blockName("brown_glass_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getGreenGlassDoor(color).get(), modLoc("block/" + color.blockName("green_glass_door_bottom")), modLoc("block/" + color.blockName("green_glass_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getRedGlassDoor(color).get(), modLoc("block/" + color.blockName("red_glass_door_bottom")), modLoc("block/" + color.blockName("red_glass_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getBlackGlassDoor(color).get(), modLoc("block/" + color.blockName("black_glass_door_bottom")), modLoc("block/" + color.blockName("black_glass_door_top")), "translucent");

        doorBlockWithRenderType(ModBlocks.getGlassWindowDoor(color).get(), modLoc("block/" + color.blockName("glass_window_door_bottom")), modLoc("block/" + color.blockName("glass_window_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getWhiteGlassWindowDoor(color).get(), modLoc("block/" + color.blockName("glass_window_door_bottom")), modLoc("block/" + color.blockName("white_glass_window_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getOrangeGlassWindowDoor(color).get(), modLoc("block/" + color.blockName("glass_window_door_bottom")), modLoc("block/" + color.blockName("orange_glass_window_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getMagentaGlassWindowDoor(color).get(), modLoc("block/" + color.blockName("glass_window_door_bottom")), modLoc("block/" + color.blockName("magenta_glass_window_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getLightBlueGlassWindowDoor(color).get(), modLoc("block/" + color.blockName("glass_window_door_bottom")), modLoc("block/" + color.blockName("light_blue_glass_window_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getYellowGlassWindowDoor(color).get(), modLoc("block/" + color.blockName("glass_window_door_bottom")), modLoc("block/" + color.blockName("yellow_glass_window_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getLimeGlassWindowDoor(color).get(), modLoc("block/" + color.blockName("glass_window_door_bottom")), modLoc("block/" + color.blockName("lime_glass_window_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getPinkGlassWindowDoor(color).get(), modLoc("block/" + color.blockName("glass_window_door_bottom")), modLoc("block/" + color.blockName("pink_glass_window_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getGrayGlassWindowDoor(color).get(), modLoc("block/" + color.blockName("glass_window_door_bottom")), modLoc("block/" + color.blockName("gray_glass_window_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getLightGrayGlassWindowDoor(color).get(), modLoc("block/" + color.blockName("glass_window_door_bottom")), modLoc("block/" + color.blockName("light_gray_glass_window_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getCyanGlassWindowDoor(color).get(), modLoc("block/" + color.blockName("glass_window_door_bottom")), modLoc("block/" + color.blockName("cyan_glass_window_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getPurpleGlassWindowDoor(color).get(), modLoc("block/" + color.blockName("glass_window_door_bottom")), modLoc("block/" + color.blockName("purple_glass_window_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getBlueGlassWindowDoor(color).get(), modLoc("block/" + color.blockName("glass_window_door_bottom")), modLoc("block/" + color.blockName("blue_glass_window_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getBrownGlassWindowDoor(color).get(), modLoc("block/" + color.blockName("glass_window_door_bottom")), modLoc("block/" + color.blockName("brown_glass_window_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getGreenGlassWindowDoor(color).get(), modLoc("block/" + color.blockName("glass_window_door_bottom")), modLoc("block/" + color.blockName("green_glass_window_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getRedGlassWindowDoor(color).get(), modLoc("block/" + color.blockName("glass_window_door_bottom")), modLoc("block/" + color.blockName("red_glass_window_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getBlackGlassWindowDoor(color).get(), modLoc("block/" + color.blockName("glass_window_door_bottom")), modLoc("block/" + color.blockName("black_glass_window_door_top")), "translucent");

        doorBlockWithRenderType(ModBlocks.getLeftGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("left_glass_panel_door_bottom")), modLoc("block/" + color.blockName("left_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getLeftWhiteGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("left_white_glass_panel_door_bottom")), modLoc("block/" + color.blockName("left_white_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getLeftOrangeGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("left_orange_glass_panel_door_bottom")), modLoc("block/" + color.blockName("left_orange_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getLeftMagentaGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("left_magenta_glass_panel_door_bottom")), modLoc("block/" + color.blockName("left_magenta_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getLeftLightBlueGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("left_light_blue_glass_panel_door_bottom")), modLoc("block/" + color.blockName("left_light_blue_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getLeftYellowGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("left_yellow_glass_panel_door_bottom")), modLoc("block/" + color.blockName("left_yellow_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getLeftLimeGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("left_lime_glass_panel_door_bottom")), modLoc("block/" + color.blockName("left_lime_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getLeftPinkGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("left_pink_glass_panel_door_bottom")), modLoc("block/" + color.blockName("left_pink_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getLeftGrayGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("left_gray_glass_panel_door_bottom")), modLoc("block/" + color.blockName("left_gray_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getLeftLightGrayGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("left_light_gray_glass_panel_door_bottom")), modLoc("block/" + color.blockName("left_light_gray_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getLeftCyanGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("left_cyan_glass_panel_door_bottom")), modLoc("block/" + color.blockName("left_cyan_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getLeftPurpleGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("left_purple_glass_panel_door_bottom")), modLoc("block/" + color.blockName("left_purple_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getLeftBlueGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("left_blue_glass_panel_door_bottom")), modLoc("block/" + color.blockName("left_blue_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getLeftBrownGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("left_brown_glass_panel_door_bottom")), modLoc("block/" + color.blockName("left_brown_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getLeftGreenGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("left_green_glass_panel_door_bottom")), modLoc("block/" + color.blockName("left_green_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getLeftRedGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("left_red_glass_panel_door_bottom")), modLoc("block/" + color.blockName("left_red_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getLeftBlackGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("left_black_glass_panel_door_bottom")), modLoc("block/" + color.blockName("left_black_glass_panel_door_top")), "translucent");

        doorBlockWithRenderType(ModBlocks.getRightGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("right_glass_panel_door_bottom")), modLoc("block/" + color.blockName("right_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getRightWhiteGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("right_white_glass_panel_door_bottom")), modLoc("block/" + color.blockName("right_white_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getRightOrangeGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("right_orange_glass_panel_door_bottom")), modLoc("block/" + color.blockName("right_orange_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getRightMagentaGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("right_magenta_glass_panel_door_bottom")), modLoc("block/" + color.blockName("right_magenta_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getRightLightBlueGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("right_light_blue_glass_panel_door_bottom")), modLoc("block/" + color.blockName("right_light_blue_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getRightYellowGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("right_yellow_glass_panel_door_bottom")), modLoc("block/" + color.blockName("right_yellow_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getRightLimeGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("right_lime_glass_panel_door_bottom")), modLoc("block/" + color.blockName("right_lime_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getRightPinkGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("right_pink_glass_panel_door_bottom")), modLoc("block/" + color.blockName("right_pink_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getRightGrayGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("right_gray_glass_panel_door_bottom")), modLoc("block/" + color.blockName("right_gray_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getRightLightGrayGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("right_light_gray_glass_panel_door_bottom")), modLoc("block/" + color.blockName("right_light_gray_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getRightCyanGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("right_cyan_glass_panel_door_bottom")), modLoc("block/" + color.blockName("right_cyan_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getRightPurpleGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("right_purple_glass_panel_door_bottom")), modLoc("block/" + color.blockName("right_purple_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getRightBlueGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("right_blue_glass_panel_door_bottom")), modLoc("block/" + color.blockName("right_blue_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getRightBrownGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("right_brown_glass_panel_door_bottom")), modLoc("block/" + color.blockName("right_brown_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getRightGreenGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("right_green_glass_panel_door_bottom")), modLoc("block/" + color.blockName("right_green_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getRightRedGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("right_red_glass_panel_door_bottom")), modLoc("block/" + color.blockName("right_red_glass_panel_door_top")), "translucent");
        doorBlockWithRenderType(ModBlocks.getRightBlackGlassPanelDoor(color).get(), modLoc("block/" + color.blockName("right_black_glass_panel_door_bottom")), modLoc("block/" + color.blockName("right_black_glass_panel_door_top")), "translucent");
    }

    private void registerTreeSet(TintedColor color) {
        leavesBlock(ModBlocks.getLeaves(color));
        saplingBlock(ModBlocks.getSapling(color));
    }

    private void saplingBlock(DeferredBlock<SaplingBlock> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(
                        BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(),
                        blockTexture(blockRegistryObject.get())
                ).renderType("cutout"));
    }

    private void leavesBlock(DeferredBlock<LeavesBlock> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(
                        BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(),
                        ResourceLocation.parse("minecraft:block/leaves"),
                        "all",
                        blockTexture(blockRegistryObject.get())
                ).renderType("cutout"));
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(),
                new ModelFile.UncheckedModelFile("tintedgrove:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(),
                new ModelFile.UncheckedModelFile("tintedgrove:block/" + deferredBlock.getId().getPath() + appendix));
    }
}
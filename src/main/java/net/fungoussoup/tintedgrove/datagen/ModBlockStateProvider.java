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
            registerTrapdoorVariants(color);
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

        trapdoorBlockWithRenderType(
                ModBlocks.getSmoothTrapdoor(color).get(),
                modLoc("block/" + color.blockName("smooth_trapdoor")),
                true,
                "cutout"
        );


        blockItem(ModBlocks.getWoodStairs(color));
        blockItem(ModBlocks.getWoodSlab(color));
        blockItem(ModBlocks.getWoodPressurePlate(color));
        blockItem(ModBlocks.getWoodFenceGate(color));
        blockItem(ModBlocks.getWoodTrapdoor(color), "_bottom");
        blockItem(ModBlocks.getSmoothTrapdoor(color), "_bottom");
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

    private void registerTrapdoorVariants(TintedColor color) {
        trapdoorBlockWithRenderType(ModBlocks.getGlassTrapdoor(color).get(), modLoc("block/" + color.blockName("glass_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getGlassTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getWhiteGlassTrapdoor(color).get(), modLoc("block/" + color.blockName("white_glass_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getWhiteGlassTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getOrangeGlassTrapdoor(color).get(), modLoc("block/" + color.blockName("orange_glass_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getOrangeGlassTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getMagentaGlassTrapdoor(color).get(), modLoc("block/" + color.blockName("magenta_glass_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getMagentaGlassTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getLightBlueGlassTrapdoor(color).get(), modLoc("block/" + color.blockName("light_blue_glass_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getLightBlueGlassTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getYellowGlassTrapdoor(color).get(), modLoc("block/" + color.blockName("yellow_glass_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getYellowGlassTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getLimeGlassTrapdoor(color).get(), modLoc("block/" + color.blockName("lime_glass_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getLimeGlassTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getPinkGlassTrapdoor(color).get(), modLoc("block/" + color.blockName("pink_glass_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getPinkGlassTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getGrayGlassTrapdoor(color).get(), modLoc("block/" + color.blockName("gray_glass_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getGrayGlassTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getLightGrayGlassTrapdoor(color).get(), modLoc("block/" + color.blockName("light_gray_glass_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getLightGrayGlassTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getCyanGlassTrapdoor(color).get(), modLoc("block/" + color.blockName("cyan_glass_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getCyanGlassTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getPurpleGlassTrapdoor(color).get(), modLoc("block/" + color.blockName("purple_glass_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getPurpleGlassTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getBlueGlassTrapdoor(color).get(), modLoc("block/" + color.blockName("blue_glass_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getBlueGlassTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getBrownGlassTrapdoor(color).get(), modLoc("block/" + color.blockName("brown_glass_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getBrownGlassTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getGreenGlassTrapdoor(color).get(), modLoc("block/" + color.blockName("green_glass_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getGreenGlassTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getRedGlassTrapdoor(color).get(), modLoc("block/" + color.blockName("red_glass_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getRedGlassTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getBlackGlassTrapdoor(color).get(), modLoc("block/" + color.blockName("black_glass_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getBlackGlassTrapdoor(color), "_bottom");

        trapdoorBlockWithRenderType(ModBlocks.getGlassGridTrapdoor(color).get(), modLoc("block/" + color.blockName("glass_grid_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getGlassGridTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getWhiteGlassGridTrapdoor(color).get(), modLoc("block/" + color.blockName("white_glass_grid_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getWhiteGlassGridTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getOrangeGlassGridTrapdoor(color).get(), modLoc("block/" + color.blockName("orange_glass_grid_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getOrangeGlassGridTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getMagentaGlassGridTrapdoor(color).get(), modLoc("block/" + color.blockName("magenta_glass_grid_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getMagentaGlassGridTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getLightBlueGlassGridTrapdoor(color).get(), modLoc("block/" + color.blockName("light_blue_glass_grid_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getLightBlueGlassGridTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getYellowGlassGridTrapdoor(color).get(), modLoc("block/" + color.blockName("yellow_glass_grid_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getYellowGlassGridTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getLimeGlassGridTrapdoor(color).get(), modLoc("block/" + color.blockName("lime_glass_grid_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getLimeGlassGridTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getPinkGlassGridTrapdoor(color).get(), modLoc("block/" + color.blockName("pink_glass_grid_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getPinkGlassGridTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getGrayGlassGridTrapdoor(color).get(), modLoc("block/" + color.blockName("gray_glass_grid_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getGrayGlassGridTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getLightGrayGlassGridTrapdoor(color).get(), modLoc("block/" + color.blockName("light_gray_glass_grid_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getLightGrayGlassGridTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getCyanGlassGridTrapdoor(color).get(), modLoc("block/" + color.blockName("cyan_glass_grid_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getCyanGlassGridTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getPurpleGlassGridTrapdoor(color).get(), modLoc("block/" + color.blockName("purple_glass_grid_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getPurpleGlassGridTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getBlueGlassGridTrapdoor(color).get(), modLoc("block/" + color.blockName("blue_glass_grid_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getBlueGlassGridTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getBrownGlassGridTrapdoor(color).get(), modLoc("block/" + color.blockName("brown_glass_grid_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getBrownGlassGridTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getGreenGlassGridTrapdoor(color).get(), modLoc("block/" + color.blockName("green_glass_grid_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getGreenGlassGridTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getRedGlassGridTrapdoor(color).get(), modLoc("block/" + color.blockName("red_glass_grid_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getRedGlassGridTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getBlackGlassGridTrapdoor(color).get(), modLoc("block/" + color.blockName("black_glass_grid_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getBlackGlassGridTrapdoor(color), "_bottom");

        trapdoorBlockWithRenderType(ModBlocks.getGlassPanelsTrapdoor(color).get(), modLoc("block/" + color.blockName("glass_panels_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getGlassPanelsTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getWhiteGlassPanelsTrapdoor(color).get(), modLoc("block/" + color.blockName("white_glass_panels_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getWhiteGlassPanelsTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getOrangeGlassPanelsTrapdoor(color).get(), modLoc("block/" + color.blockName("orange_glass_panels_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getOrangeGlassPanelsTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getMagentaGlassPanelsTrapdoor(color).get(), modLoc("block/" + color.blockName("magenta_glass_panels_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getMagentaGlassPanelsTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getLightBlueGlassPanelsTrapdoor(color).get(), modLoc("block/" + color.blockName("light_blue_glass_panels_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getLightBlueGlassPanelsTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getYellowGlassPanelsTrapdoor(color).get(), modLoc("block/" + color.blockName("yellow_glass_panels_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getYellowGlassPanelsTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getLimeGlassPanelsTrapdoor(color).get(), modLoc("block/" + color.blockName("lime_glass_panels_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getLimeGlassPanelsTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getPinkGlassPanelsTrapdoor(color).get(), modLoc("block/" + color.blockName("pink_glass_panels_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getPinkGlassPanelsTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getGrayGlassPanelsTrapdoor(color).get(), modLoc("block/" + color.blockName("gray_glass_panels_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getGrayGlassPanelsTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getLightGrayGlassPanelsTrapdoor(color).get(), modLoc("block/" + color.blockName("light_gray_glass_panels_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getLightGrayGlassPanelsTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getCyanGlassPanelsTrapdoor(color).get(), modLoc("block/" + color.blockName("cyan_glass_panels_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getCyanGlassPanelsTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getPurpleGlassPanelsTrapdoor(color).get(), modLoc("block/" + color.blockName("purple_glass_panels_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getPurpleGlassPanelsTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getBlueGlassPanelsTrapdoor(color).get(), modLoc("block/" + color.blockName("blue_glass_panels_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getBlueGlassPanelsTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getBrownGlassPanelsTrapdoor(color).get(), modLoc("block/" + color.blockName("brown_glass_panels_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getBrownGlassPanelsTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getGreenGlassPanelsTrapdoor(color).get(), modLoc("block/" + color.blockName("green_glass_panels_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getGreenGlassPanelsTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getRedGlassPanelsTrapdoor(color).get(), modLoc("block/" + color.blockName("red_glass_panels_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getRedGlassPanelsTrapdoor(color), "_bottom");
        trapdoorBlockWithRenderType(ModBlocks.getBlackGlassPanelsTrapdoor(color).get(), modLoc("block/" + color.blockName("black_glass_panels_trapdoor")), true, "translucent");
        blockItem(ModBlocks.getBlackGlassPanelsTrapdoor(color), "_bottom");
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
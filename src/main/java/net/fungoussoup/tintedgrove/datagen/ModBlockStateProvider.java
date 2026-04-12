package net.fungoussoup.tintedgrove.datagen;

import net.fungoussoup.tintedgrove.TintedGrove;
import net.fungoussoup.tintedgrove.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.RotatedPillarBlock;
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
        
        // RED
        logBlock(((RotatedPillarBlock) ModBlocks.RED_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_RED_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.RED_WOOD.get()), blockTexture(ModBlocks.RED_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.STRIPPED_RED_WOOD.get()), blockTexture(ModBlocks.STRIPPED_RED_LOG.get()));

        blockItem(ModBlocks.RED_LOG);
        blockItem(ModBlocks.RED_WOOD);
        blockItem(ModBlocks.STRIPPED_RED_LOG);
        blockItem(ModBlocks.STRIPPED_RED_WOOD);
        
        blockWithItem(ModBlocks.RED_PLANK);

        stairsBlock(ModBlocks.RED_WOOD_STAIRS.get(), blockTexture(ModBlocks.RED_PLANK.get()));
        slabBlock(ModBlocks.RED_WOOD_SLAB.get(), blockTexture(ModBlocks.RED_PLANK.get()), blockTexture(ModBlocks.RED_PLANK.get()));
        buttonBlock(ModBlocks.RED_WOOD_BUTTON.get(), blockTexture(ModBlocks.RED_PLANK.get()));
        pressurePlateBlock(ModBlocks.RED_WOOD_PRESSURE_PLATE.get(), blockTexture(ModBlocks.RED_PLANK.get()));
        fenceBlock(ModBlocks.RED_WOOD_FENCE.get(), blockTexture(ModBlocks.RED_PLANK.get()));
        fenceGateBlock(ModBlocks.RED_WOOD_FENCE_GATE.get(), blockTexture(ModBlocks.RED_PLANK.get()));

        doorBlockWithRenderType(ModBlocks.RED_WOOD_DOOR.get(), modLoc("block/red_wood_door_bottom"), modLoc("block/red_wood_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.RED_WOOD_TRAPDOOR.get(), modLoc("block/red_wood_trapdoor"), true, "cutout");

        blockItem(ModBlocks.RED_WOOD_STAIRS);
        blockItem(ModBlocks.RED_WOOD_SLAB);
        blockItem(ModBlocks.RED_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.RED_WOOD_FENCE_GATE);
        blockItem(ModBlocks.RED_WOOD_TRAPDOOR, "_bottom");

        //BLUE
        logBlock(((RotatedPillarBlock) ModBlocks.BLUE_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_BLUE_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.BLUE_WOOD.get()), blockTexture(ModBlocks.BLUE_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.STRIPPED_BLUE_WOOD.get()), blockTexture(ModBlocks.STRIPPED_BLUE_LOG.get()));

        blockItem(ModBlocks.BLUE_LOG);
        blockItem(ModBlocks.BLUE_WOOD);
        blockItem(ModBlocks.STRIPPED_BLUE_LOG);
        blockItem(ModBlocks.STRIPPED_BLUE_WOOD);

        blockWithItem(ModBlocks.BLUE_PLANK);

        stairsBlock(ModBlocks.BLUE_WOOD_STAIRS.get(), blockTexture(ModBlocks.BLUE_PLANK.get()));
        slabBlock(ModBlocks.BLUE_WOOD_SLAB.get(), blockTexture(ModBlocks.BLUE_PLANK.get()), blockTexture(ModBlocks.BLUE_PLANK.get()));
        buttonBlock(ModBlocks.BLUE_WOOD_BUTTON.get(), blockTexture(ModBlocks.BLUE_PLANK.get()));
        pressurePlateBlock(ModBlocks.BLUE_WOOD_PRESSURE_PLATE.get(), blockTexture(ModBlocks.BLUE_PLANK.get()));
        fenceBlock(ModBlocks.BLUE_WOOD_FENCE.get(), blockTexture(ModBlocks.BLUE_PLANK.get()));
        fenceGateBlock(ModBlocks.BLUE_WOOD_FENCE_GATE.get(), blockTexture(ModBlocks.BLUE_PLANK.get()));

        doorBlockWithRenderType(ModBlocks.BLUE_WOOD_DOOR.get(), modLoc("block/blue_wood_door_bottom"), modLoc("block/blue_wood_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.BLUE_WOOD_TRAPDOOR.get(), modLoc("block/blue_wood_trapdoor"), true, "cutout");

        blockItem(ModBlocks.BLUE_WOOD_STAIRS);
        blockItem(ModBlocks.BLUE_WOOD_SLAB);
        blockItem(ModBlocks.BLUE_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.BLUE_WOOD_FENCE_GATE);
        blockItem(ModBlocks.BLUE_WOOD_TRAPDOOR, "_bottom");

        //GREEN
        logBlock(((RotatedPillarBlock) ModBlocks.GREEN_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_GREEN_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.GREEN_WOOD.get()), blockTexture(ModBlocks.GREEN_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.STRIPPED_GREEN_WOOD.get()), blockTexture(ModBlocks.STRIPPED_GREEN_LOG.get()));

        blockItem(ModBlocks.GREEN_LOG);
        blockItem(ModBlocks.GREEN_WOOD);
        blockItem(ModBlocks.STRIPPED_GREEN_LOG);
        blockItem(ModBlocks.STRIPPED_GREEN_WOOD);

        blockWithItem(ModBlocks.GREEN_PLANK);

        stairsBlock(ModBlocks.GREEN_WOOD_STAIRS.get(), blockTexture(ModBlocks.GREEN_PLANK.get()));
        slabBlock(ModBlocks.GREEN_WOOD_SLAB.get(), blockTexture(ModBlocks.GREEN_PLANK.get()), blockTexture(ModBlocks.GREEN_PLANK.get()));
        buttonBlock(ModBlocks.GREEN_WOOD_BUTTON.get(), blockTexture(ModBlocks.GREEN_PLANK.get()));
        pressurePlateBlock(ModBlocks.GREEN_WOOD_PRESSURE_PLATE.get(), blockTexture(ModBlocks.GREEN_PLANK.get()));
        fenceBlock(ModBlocks.GREEN_WOOD_FENCE.get(), blockTexture(ModBlocks.GREEN_PLANK.get()));
        fenceGateBlock(ModBlocks.GREEN_WOOD_FENCE_GATE.get(), blockTexture(ModBlocks.GREEN_PLANK.get()));

        doorBlockWithRenderType(ModBlocks.GREEN_WOOD_DOOR.get(), modLoc("block/green_wood_door_bottom"), modLoc("block/green_wood_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.GREEN_WOOD_TRAPDOOR.get(), modLoc("block/green_wood_trapdoor"), true, "cutout");

        blockItem(ModBlocks.GREEN_WOOD_STAIRS);
        blockItem(ModBlocks.GREEN_WOOD_SLAB);
        blockItem(ModBlocks.GREEN_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.GREEN_WOOD_FENCE_GATE);
        blockItem(ModBlocks.GREEN_WOOD_TRAPDOOR, "_bottom");

        //YELLOW
        logBlock(((RotatedPillarBlock) ModBlocks.YELLOW_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_YELLOW_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.YELLOW_WOOD.get()), blockTexture(ModBlocks.YELLOW_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.STRIPPED_YELLOW_WOOD.get()), blockTexture(ModBlocks.STRIPPED_YELLOW_LOG.get()));

        blockItem(ModBlocks.YELLOW_LOG);
        blockItem(ModBlocks.YELLOW_WOOD);
        blockItem(ModBlocks.STRIPPED_YELLOW_LOG);
        blockItem(ModBlocks.STRIPPED_YELLOW_WOOD);

        blockWithItem(ModBlocks.YELLOW_PLANK);

        stairsBlock(ModBlocks.YELLOW_WOOD_STAIRS.get(), blockTexture(ModBlocks.YELLOW_PLANK.get()));
        slabBlock(ModBlocks.YELLOW_WOOD_SLAB.get(), blockTexture(ModBlocks.YELLOW_PLANK.get()), blockTexture(ModBlocks.YELLOW_PLANK.get()));
        buttonBlock(ModBlocks.YELLOW_WOOD_BUTTON.get(), blockTexture(ModBlocks.YELLOW_PLANK.get()));
        pressurePlateBlock(ModBlocks.YELLOW_WOOD_PRESSURE_PLATE.get(), blockTexture(ModBlocks.YELLOW_PLANK.get()));
        fenceBlock(ModBlocks.YELLOW_WOOD_FENCE.get(), blockTexture(ModBlocks.YELLOW_PLANK.get()));
        fenceGateBlock(ModBlocks.YELLOW_WOOD_FENCE_GATE.get(), blockTexture(ModBlocks.YELLOW_PLANK.get()));

        doorBlockWithRenderType(ModBlocks.YELLOW_WOOD_DOOR.get(), modLoc("block/yellow_wood_door_bottom"), modLoc("block/yellow_wood_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.YELLOW_WOOD_TRAPDOOR.get(), modLoc("block/yellow_wood_trapdoor"), true, "cutout");

        blockItem(ModBlocks.YELLOW_WOOD_STAIRS);
        blockItem(ModBlocks.YELLOW_WOOD_SLAB);
        blockItem(ModBlocks.YELLOW_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.YELLOW_WOOD_FENCE_GATE);
        blockItem(ModBlocks.YELLOW_WOOD_TRAPDOOR, "_bottom");

        //PURPLE
        logBlock(((RotatedPillarBlock) ModBlocks.PURPLE_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_PURPLE_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.PURPLE_WOOD.get()), blockTexture(ModBlocks.PURPLE_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.STRIPPED_PURPLE_WOOD.get()), blockTexture(ModBlocks.STRIPPED_PURPLE_LOG.get()));

        blockItem(ModBlocks.PURPLE_LOG);
        blockItem(ModBlocks.PURPLE_WOOD);
        blockItem(ModBlocks.STRIPPED_PURPLE_LOG);
        blockItem(ModBlocks.STRIPPED_PURPLE_WOOD);

        blockWithItem(ModBlocks.PURPLE_PLANK);

        stairsBlock(ModBlocks.PURPLE_WOOD_STAIRS.get(), blockTexture(ModBlocks.PURPLE_PLANK.get()));
        slabBlock(ModBlocks.PURPLE_WOOD_SLAB.get(), blockTexture(ModBlocks.PURPLE_PLANK.get()), blockTexture(ModBlocks.PURPLE_PLANK.get()));
        buttonBlock(ModBlocks.PURPLE_WOOD_BUTTON.get(), blockTexture(ModBlocks.PURPLE_PLANK.get()));
        pressurePlateBlock(ModBlocks.PURPLE_WOOD_PRESSURE_PLATE.get(), blockTexture(ModBlocks.PURPLE_PLANK.get()));
        fenceBlock(ModBlocks.PURPLE_WOOD_FENCE.get(), blockTexture(ModBlocks.PURPLE_PLANK.get()));
        fenceGateBlock(ModBlocks.PURPLE_WOOD_FENCE_GATE.get(), blockTexture(ModBlocks.PURPLE_PLANK.get()));

        doorBlockWithRenderType(ModBlocks.PURPLE_WOOD_DOOR.get(), modLoc("block/purple_wood_door_bottom"), modLoc("block/purple_wood_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.PURPLE_WOOD_TRAPDOOR.get(), modLoc("block/purple_wood_trapdoor"), true, "cutout");

        blockItem(ModBlocks.PURPLE_WOOD_STAIRS);
        blockItem(ModBlocks.PURPLE_WOOD_SLAB);
        blockItem(ModBlocks.PURPLE_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.PURPLE_WOOD_FENCE_GATE);
        blockItem(ModBlocks.PURPLE_WOOD_TRAPDOOR, "_bottom");

        //CYAN
        logBlock(((RotatedPillarBlock) ModBlocks.CYAN_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_CYAN_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.CYAN_WOOD.get()), blockTexture(ModBlocks.CYAN_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.STRIPPED_CYAN_WOOD.get()), blockTexture(ModBlocks.STRIPPED_CYAN_LOG.get()));

        blockItem(ModBlocks.CYAN_LOG);
        blockItem(ModBlocks.CYAN_WOOD);
        blockItem(ModBlocks.STRIPPED_CYAN_LOG);
        blockItem(ModBlocks.STRIPPED_CYAN_WOOD);

        blockWithItem(ModBlocks.CYAN_PLANK);

        stairsBlock(ModBlocks.CYAN_WOOD_STAIRS.get(), blockTexture(ModBlocks.CYAN_PLANK.get()));
        slabBlock(ModBlocks.CYAN_WOOD_SLAB.get(), blockTexture(ModBlocks.CYAN_PLANK.get()), blockTexture(ModBlocks.CYAN_PLANK.get()));
        buttonBlock(ModBlocks.CYAN_WOOD_BUTTON.get(), blockTexture(ModBlocks.CYAN_PLANK.get()));
        pressurePlateBlock(ModBlocks.CYAN_WOOD_PRESSURE_PLATE.get(), blockTexture(ModBlocks.CYAN_PLANK.get()));
        fenceBlock(ModBlocks.CYAN_WOOD_FENCE.get(), blockTexture(ModBlocks.CYAN_PLANK.get()));
        fenceGateBlock(ModBlocks.CYAN_WOOD_FENCE_GATE.get(), blockTexture(ModBlocks.CYAN_PLANK.get()));

        doorBlockWithRenderType(ModBlocks.CYAN_WOOD_DOOR.get(), modLoc("block/cyan_wood_door_bottom"), modLoc("block/cyan_wood_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.CYAN_WOOD_TRAPDOOR.get(), modLoc("block/cyan_wood_trapdoor"), true, "cutout");

        blockItem(ModBlocks.CYAN_WOOD_STAIRS);
        blockItem(ModBlocks.CYAN_WOOD_SLAB);
        blockItem(ModBlocks.CYAN_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.CYAN_WOOD_FENCE_GATE);
        blockItem(ModBlocks.CYAN_WOOD_TRAPDOOR, "_bottom");

        //ORANGE
        logBlock(((RotatedPillarBlock) ModBlocks.ORANGE_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_ORANGE_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.ORANGE_WOOD.get()), blockTexture(ModBlocks.ORANGE_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.STRIPPED_ORANGE_WOOD.get()), blockTexture(ModBlocks.STRIPPED_ORANGE_LOG.get()));

        blockItem(ModBlocks.ORANGE_LOG);
        blockItem(ModBlocks.ORANGE_WOOD);
        blockItem(ModBlocks.STRIPPED_ORANGE_LOG);
        blockItem(ModBlocks.STRIPPED_ORANGE_WOOD);

        blockWithItem(ModBlocks.ORANGE_PLANK);

        stairsBlock(ModBlocks.ORANGE_WOOD_STAIRS.get(), blockTexture(ModBlocks.ORANGE_PLANK.get()));
        slabBlock(ModBlocks.ORANGE_WOOD_SLAB.get(), blockTexture(ModBlocks.ORANGE_PLANK.get()), blockTexture(ModBlocks.ORANGE_PLANK.get()));
        buttonBlock(ModBlocks.ORANGE_WOOD_BUTTON.get(), blockTexture(ModBlocks.ORANGE_PLANK.get()));
        pressurePlateBlock(ModBlocks.ORANGE_WOOD_PRESSURE_PLATE.get(), blockTexture(ModBlocks.ORANGE_PLANK.get()));
        fenceBlock(ModBlocks.ORANGE_WOOD_FENCE.get(), blockTexture(ModBlocks.ORANGE_PLANK.get()));
        fenceGateBlock(ModBlocks.ORANGE_WOOD_FENCE_GATE.get(), blockTexture(ModBlocks.ORANGE_PLANK.get()));

        doorBlockWithRenderType(ModBlocks.ORANGE_WOOD_DOOR.get(), modLoc("block/orange_wood_door_bottom"), modLoc("block/orange_wood_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.ORANGE_WOOD_TRAPDOOR.get(), modLoc("block/orange_wood_trapdoor"), true, "cutout");

        blockItem(ModBlocks.ORANGE_WOOD_STAIRS);
        blockItem(ModBlocks.ORANGE_WOOD_SLAB);
        blockItem(ModBlocks.ORANGE_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.ORANGE_WOOD_FENCE_GATE);
        blockItem(ModBlocks.ORANGE_WOOD_TRAPDOOR, "_bottom");

        //LIME
        logBlock(((RotatedPillarBlock) ModBlocks.LIME_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_LIME_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.LIME_WOOD.get()), blockTexture(ModBlocks.LIME_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.STRIPPED_LIME_WOOD.get()), blockTexture(ModBlocks.STRIPPED_LIME_LOG.get()));

        blockItem(ModBlocks.LIME_LOG);
        blockItem(ModBlocks.LIME_WOOD);
        blockItem(ModBlocks.STRIPPED_LIME_LOG);
        blockItem(ModBlocks.STRIPPED_LIME_WOOD);

        blockWithItem(ModBlocks.LIME_PLANK);

        stairsBlock(ModBlocks.LIME_WOOD_STAIRS.get(), blockTexture(ModBlocks.LIME_PLANK.get()));
        slabBlock(ModBlocks.LIME_WOOD_SLAB.get(), blockTexture(ModBlocks.LIME_PLANK.get()), blockTexture(ModBlocks.LIME_PLANK.get()));
        buttonBlock(ModBlocks.LIME_WOOD_BUTTON.get(), blockTexture(ModBlocks.LIME_PLANK.get()));
        pressurePlateBlock(ModBlocks.LIME_WOOD_PRESSURE_PLATE.get(), blockTexture(ModBlocks.LIME_PLANK.get()));
        fenceBlock(ModBlocks.LIME_WOOD_FENCE.get(), blockTexture(ModBlocks.LIME_PLANK.get()));
        fenceGateBlock(ModBlocks.LIME_WOOD_FENCE_GATE.get(), blockTexture(ModBlocks.LIME_PLANK.get()));

        doorBlockWithRenderType(ModBlocks.LIME_WOOD_DOOR.get(), modLoc("block/lime_wood_door_bottom"), modLoc("block/lime_wood_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.LIME_WOOD_TRAPDOOR.get(), modLoc("block/lime_wood_trapdoor"), true, "cutout");

        blockItem(ModBlocks.LIME_WOOD_STAIRS);
        blockItem(ModBlocks.LIME_WOOD_SLAB);
        blockItem(ModBlocks.LIME_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.LIME_WOOD_FENCE_GATE);
        blockItem(ModBlocks.LIME_WOOD_TRAPDOOR, "_bottom");

        //PINK
        logBlock(((RotatedPillarBlock) ModBlocks.PINK_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_PINK_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.PINK_WOOD.get()), blockTexture(ModBlocks.PINK_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.STRIPPED_PINK_WOOD.get()), blockTexture(ModBlocks.STRIPPED_PINK_LOG.get()));

        blockItem(ModBlocks.PINK_LOG);
        blockItem(ModBlocks.PINK_WOOD);
        blockItem(ModBlocks.STRIPPED_PINK_LOG);
        blockItem(ModBlocks.STRIPPED_PINK_WOOD);

        blockWithItem(ModBlocks.PINK_PLANK);

        stairsBlock(ModBlocks.PINK_WOOD_STAIRS.get(), blockTexture(ModBlocks.PINK_PLANK.get()));
        slabBlock(ModBlocks.PINK_WOOD_SLAB.get(), blockTexture(ModBlocks.PINK_PLANK.get()), blockTexture(ModBlocks.PINK_PLANK.get()));
        buttonBlock(ModBlocks.PINK_WOOD_BUTTON.get(), blockTexture(ModBlocks.PINK_PLANK.get()));
        pressurePlateBlock(ModBlocks.PINK_WOOD_PRESSURE_PLATE.get(), blockTexture(ModBlocks.PINK_PLANK.get()));
        fenceBlock(ModBlocks.PINK_WOOD_FENCE.get(), blockTexture(ModBlocks.PINK_PLANK.get()));
        fenceGateBlock(ModBlocks.PINK_WOOD_FENCE_GATE.get(), blockTexture(ModBlocks.PINK_PLANK.get()));

        doorBlockWithRenderType(ModBlocks.PINK_WOOD_DOOR.get(), modLoc("block/pink_wood_door_bottom"), modLoc("block/pink_wood_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.PINK_WOOD_TRAPDOOR.get(), modLoc("block/pink_wood_trapdoor"), true, "cutout");

        blockItem(ModBlocks.PINK_WOOD_STAIRS);
        blockItem(ModBlocks.PINK_WOOD_SLAB);
        blockItem(ModBlocks.PINK_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.PINK_WOOD_FENCE_GATE);
        blockItem(ModBlocks.PINK_WOOD_TRAPDOOR, "_bottom");

        //BROWN
        logBlock(((RotatedPillarBlock) ModBlocks.BROWN_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_BROWN_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.BROWN_WOOD.get()), blockTexture(ModBlocks.BROWN_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.STRIPPED_BROWN_WOOD.get()), blockTexture(ModBlocks.STRIPPED_BROWN_LOG.get()));

        blockItem(ModBlocks.BROWN_LOG);
        blockItem(ModBlocks.BROWN_WOOD);
        blockItem(ModBlocks.STRIPPED_BROWN_LOG);
        blockItem(ModBlocks.STRIPPED_BROWN_WOOD);

        blockWithItem(ModBlocks.BROWN_PLANK);

        stairsBlock(ModBlocks.BROWN_WOOD_STAIRS.get(), blockTexture(ModBlocks.BROWN_PLANK.get()));
        slabBlock(ModBlocks.BROWN_WOOD_SLAB.get(), blockTexture(ModBlocks.BROWN_PLANK.get()), blockTexture(ModBlocks.BROWN_PLANK.get()));
        buttonBlock(ModBlocks.BROWN_WOOD_BUTTON.get(), blockTexture(ModBlocks.BROWN_PLANK.get()));
        pressurePlateBlock(ModBlocks.BROWN_WOOD_PRESSURE_PLATE.get(), blockTexture(ModBlocks.BROWN_PLANK.get()));
        fenceBlock(ModBlocks.BROWN_WOOD_FENCE.get(), blockTexture(ModBlocks.BROWN_PLANK.get()));
        fenceGateBlock(ModBlocks.BROWN_WOOD_FENCE_GATE.get(), blockTexture(ModBlocks.BROWN_PLANK.get()));

        doorBlockWithRenderType(ModBlocks.BROWN_WOOD_DOOR.get(), modLoc("block/brown_wood_door_bottom"), modLoc("block/brown_wood_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.BROWN_WOOD_TRAPDOOR.get(), modLoc("block/brown_wood_trapdoor"), true, "cutout");

        blockItem(ModBlocks.BROWN_WOOD_STAIRS);
        blockItem(ModBlocks.BROWN_WOOD_SLAB);
        blockItem(ModBlocks.BROWN_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.BROWN_WOOD_FENCE_GATE);
        blockItem(ModBlocks.BROWN_WOOD_TRAPDOOR, "_bottom");

        //BLACK
        logBlock(((RotatedPillarBlock) ModBlocks.BLACK_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_BLACK_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.BLACK_WOOD.get()), blockTexture(ModBlocks.BLACK_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.STRIPPED_BLACK_WOOD.get()), blockTexture(ModBlocks.STRIPPED_BLACK_LOG.get()));

        blockItem(ModBlocks.BLACK_LOG);
        blockItem(ModBlocks.BLACK_WOOD);
        blockItem(ModBlocks.STRIPPED_BLACK_LOG);
        blockItem(ModBlocks.STRIPPED_BLACK_WOOD);

        blockWithItem(ModBlocks.BLACK_PLANK);

        stairsBlock(ModBlocks.BLACK_WOOD_STAIRS.get(), blockTexture(ModBlocks.BLACK_PLANK.get()));
        slabBlock(ModBlocks.BLACK_WOOD_SLAB.get(), blockTexture(ModBlocks.BLACK_PLANK.get()), blockTexture(ModBlocks.BLACK_PLANK.get()));
        buttonBlock(ModBlocks.BLACK_WOOD_BUTTON.get(), blockTexture(ModBlocks.BLACK_PLANK.get()));
        pressurePlateBlock(ModBlocks.BLACK_WOOD_PRESSURE_PLATE.get(), blockTexture(ModBlocks.BLACK_PLANK.get()));
        fenceBlock(ModBlocks.BLACK_WOOD_FENCE.get(), blockTexture(ModBlocks.BLACK_PLANK.get()));
        fenceGateBlock(ModBlocks.BLACK_WOOD_FENCE_GATE.get(), blockTexture(ModBlocks.BLACK_PLANK.get()));

        doorBlockWithRenderType(ModBlocks.BLACK_WOOD_DOOR.get(), modLoc("block/black_wood_door_bottom"), modLoc("block/black_wood_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.BLACK_WOOD_TRAPDOOR.get(), modLoc("block/black_wood_trapdoor"), true, "cutout");

        blockItem(ModBlocks.BLACK_WOOD_STAIRS);
        blockItem(ModBlocks.BLACK_WOOD_SLAB);
        blockItem(ModBlocks.BLACK_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.BLACK_WOOD_FENCE_GATE);
        blockItem(ModBlocks.BLACK_WOOD_TRAPDOOR, "_bottom");

        //WHITE
        logBlock(((RotatedPillarBlock) ModBlocks.WHITE_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_WHITE_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.WHITE_WOOD.get()), blockTexture(ModBlocks.WHITE_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.STRIPPED_WHITE_WOOD.get()), blockTexture(ModBlocks.STRIPPED_WHITE_LOG.get()));

        blockItem(ModBlocks.WHITE_LOG);
        blockItem(ModBlocks.WHITE_WOOD);
        blockItem(ModBlocks.STRIPPED_WHITE_LOG);
        blockItem(ModBlocks.STRIPPED_WHITE_WOOD);

        blockWithItem(ModBlocks.WHITE_PLANK);

        stairsBlock(ModBlocks.WHITE_WOOD_STAIRS.get(), blockTexture(ModBlocks.WHITE_PLANK.get()));
        slabBlock(ModBlocks.WHITE_WOOD_SLAB.get(), blockTexture(ModBlocks.WHITE_PLANK.get()), blockTexture(ModBlocks.WHITE_PLANK.get()));
        buttonBlock(ModBlocks.WHITE_WOOD_BUTTON.get(), blockTexture(ModBlocks.WHITE_PLANK.get()));
        pressurePlateBlock(ModBlocks.WHITE_WOOD_PRESSURE_PLATE.get(), blockTexture(ModBlocks.WHITE_PLANK.get()));
        fenceBlock(ModBlocks.WHITE_WOOD_FENCE.get(), blockTexture(ModBlocks.WHITE_PLANK.get()));
        fenceGateBlock(ModBlocks.WHITE_WOOD_FENCE_GATE.get(), blockTexture(ModBlocks.WHITE_PLANK.get()));

        doorBlockWithRenderType(ModBlocks.WHITE_WOOD_DOOR.get(), modLoc("block/white_wood_door_bottom"), modLoc("block/white_wood_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.WHITE_WOOD_TRAPDOOR.get(), modLoc("block/white_wood_trapdoor"), true, "cutout");

        blockItem(ModBlocks.WHITE_WOOD_STAIRS);
        blockItem(ModBlocks.WHITE_WOOD_SLAB);
        blockItem(ModBlocks.WHITE_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.WHITE_WOOD_FENCE_GATE);
        blockItem(ModBlocks.WHITE_WOOD_TRAPDOOR, "_bottom");

        //GRAY
        logBlock(((RotatedPillarBlock) ModBlocks.GRAY_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_GRAY_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.GRAY_WOOD.get()), blockTexture(ModBlocks.GRAY_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.STRIPPED_GRAY_WOOD.get()), blockTexture(ModBlocks.STRIPPED_GRAY_LOG.get()));

        blockItem(ModBlocks.GRAY_LOG);
        blockItem(ModBlocks.GRAY_WOOD);
        blockItem(ModBlocks.STRIPPED_GRAY_LOG);
        blockItem(ModBlocks.STRIPPED_GRAY_WOOD);

        blockWithItem(ModBlocks.GRAY_PLANK);

        stairsBlock(ModBlocks.GRAY_WOOD_STAIRS.get(), blockTexture(ModBlocks.GRAY_PLANK.get()));
        slabBlock(ModBlocks.GRAY_WOOD_SLAB.get(), blockTexture(ModBlocks.GRAY_PLANK.get()), blockTexture(ModBlocks.GRAY_PLANK.get()));
        buttonBlock(ModBlocks.GRAY_WOOD_BUTTON.get(), blockTexture(ModBlocks.GRAY_PLANK.get()));
        pressurePlateBlock(ModBlocks.GRAY_WOOD_PRESSURE_PLATE.get(), blockTexture(ModBlocks.GRAY_PLANK.get()));
        fenceBlock(ModBlocks.GRAY_WOOD_FENCE.get(), blockTexture(ModBlocks.GRAY_PLANK.get()));
        fenceGateBlock(ModBlocks.GRAY_WOOD_FENCE_GATE.get(), blockTexture(ModBlocks.GRAY_PLANK.get()));

        doorBlockWithRenderType(ModBlocks.GRAY_WOOD_DOOR.get(), modLoc("block/gray_wood_door_bottom"), modLoc("block/gray_wood_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.GRAY_WOOD_TRAPDOOR.get(), modLoc("block/gray_wood_trapdoor"), true, "cutout");

        blockItem(ModBlocks.GRAY_WOOD_STAIRS);
        blockItem(ModBlocks.GRAY_WOOD_SLAB);
        blockItem(ModBlocks.GRAY_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.GRAY_WOOD_FENCE_GATE);
        blockItem(ModBlocks.GRAY_WOOD_TRAPDOOR, "_bottom");

        //LIGHT_GRAY
        logBlock(((RotatedPillarBlock) ModBlocks.LIGHT_GRAY_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_LIGHT_GRAY_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.LIGHT_GRAY_WOOD.get()), blockTexture(ModBlocks.LIGHT_GRAY_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.STRIPPED_LIGHT_GRAY_WOOD.get()), blockTexture(ModBlocks.STRIPPED_LIGHT_GRAY_LOG.get()));

        blockItem(ModBlocks.LIGHT_GRAY_LOG);
        blockItem(ModBlocks.LIGHT_GRAY_WOOD);
        blockItem(ModBlocks.STRIPPED_LIGHT_GRAY_LOG);
        blockItem(ModBlocks.STRIPPED_LIGHT_GRAY_WOOD);

        blockWithItem(ModBlocks.LIGHT_GRAY_PLANK);

        stairsBlock(ModBlocks.LIGHT_GRAY_WOOD_STAIRS.get(), blockTexture(ModBlocks.LIGHT_GRAY_PLANK.get()));
        slabBlock(ModBlocks.LIGHT_GRAY_WOOD_SLAB.get(), blockTexture(ModBlocks.LIGHT_GRAY_PLANK.get()), blockTexture(ModBlocks.LIGHT_GRAY_PLANK.get()));
        buttonBlock(ModBlocks.LIGHT_GRAY_WOOD_BUTTON.get(), blockTexture(ModBlocks.LIGHT_GRAY_PLANK.get()));
        pressurePlateBlock(ModBlocks.LIGHT_GRAY_WOOD_PRESSURE_PLATE.get(), blockTexture(ModBlocks.LIGHT_GRAY_PLANK.get()));
        fenceBlock(ModBlocks.LIGHT_GRAY_WOOD_FENCE.get(), blockTexture(ModBlocks.LIGHT_GRAY_PLANK.get()));
        fenceGateBlock(ModBlocks.LIGHT_GRAY_WOOD_FENCE_GATE.get(), blockTexture(ModBlocks.LIGHT_GRAY_PLANK.get()));

        doorBlockWithRenderType(ModBlocks.LIGHT_GRAY_WOOD_DOOR.get(), modLoc("block/light_gray_wood_door_bottom"), modLoc("block/light_gray_wood_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.LIGHT_GRAY_WOOD_TRAPDOOR.get(), modLoc("block/light_gray_wood_trapdoor"), true, "cutout");

        blockItem(ModBlocks.LIGHT_GRAY_WOOD_STAIRS);
        blockItem(ModBlocks.LIGHT_GRAY_WOOD_SLAB);
        blockItem(ModBlocks.LIGHT_GRAY_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.LIGHT_GRAY_WOOD_FENCE_GATE);
        blockItem(ModBlocks.LIGHT_GRAY_WOOD_TRAPDOOR, "_bottom");

        //LIGHT_BLUE
        logBlock(((RotatedPillarBlock) ModBlocks.LIGHT_BLUE_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_LIGHT_BLUE_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.LIGHT_BLUE_WOOD.get()), blockTexture(ModBlocks.LIGHT_BLUE_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.STRIPPED_LIGHT_BLUE_WOOD.get()), blockTexture(ModBlocks.STRIPPED_LIGHT_BLUE_LOG.get()));

        blockItem(ModBlocks.LIGHT_BLUE_LOG);
        blockItem(ModBlocks.LIGHT_BLUE_WOOD);
        blockItem(ModBlocks.STRIPPED_LIGHT_BLUE_LOG);
        blockItem(ModBlocks.STRIPPED_LIGHT_BLUE_WOOD);

        blockWithItem(ModBlocks.LIGHT_BLUE_PLANK);

        stairsBlock(ModBlocks.LIGHT_BLUE_WOOD_STAIRS.get(), blockTexture(ModBlocks.LIGHT_BLUE_PLANK.get()));
        slabBlock(ModBlocks.LIGHT_BLUE_WOOD_SLAB.get(), blockTexture(ModBlocks.LIGHT_BLUE_PLANK.get()), blockTexture(ModBlocks.LIGHT_BLUE_PLANK.get()));
        buttonBlock(ModBlocks.LIGHT_BLUE_WOOD_BUTTON.get(), blockTexture(ModBlocks.LIGHT_BLUE_PLANK.get()));
        pressurePlateBlock(ModBlocks.LIGHT_BLUE_WOOD_PRESSURE_PLATE.get(), blockTexture(ModBlocks.LIGHT_BLUE_PLANK.get()));
        fenceBlock(ModBlocks.LIGHT_BLUE_WOOD_FENCE.get(), blockTexture(ModBlocks.LIGHT_BLUE_PLANK.get()));
        fenceGateBlock(ModBlocks.LIGHT_BLUE_WOOD_FENCE_GATE.get(), blockTexture(ModBlocks.LIGHT_BLUE_PLANK.get()));

        doorBlockWithRenderType(ModBlocks.LIGHT_BLUE_WOOD_DOOR.get(), modLoc("block/light_blue_wood_door_bottom"), modLoc("block/light_blue_wood_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.LIGHT_BLUE_WOOD_TRAPDOOR.get(), modLoc("block/light_blue_wood_trapdoor"), true, "cutout");

        blockItem(ModBlocks.LIGHT_BLUE_WOOD_STAIRS);
        blockItem(ModBlocks.LIGHT_BLUE_WOOD_SLAB);
        blockItem(ModBlocks.LIGHT_BLUE_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.LIGHT_BLUE_WOOD_FENCE_GATE);
        blockItem(ModBlocks.LIGHT_BLUE_WOOD_TRAPDOOR, "_bottom");

        //MAGENTA
        logBlock(((RotatedPillarBlock) ModBlocks.MAGENTA_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_MAGENTA_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.MAGENTA_WOOD.get()), blockTexture(ModBlocks.MAGENTA_LOG.get()));
        axisBlock(((RotatedPillarBlock)ModBlocks.STRIPPED_MAGENTA_WOOD.get()), blockTexture(ModBlocks.STRIPPED_MAGENTA_LOG.get()));

        blockItem(ModBlocks.MAGENTA_LOG);
        blockItem(ModBlocks.MAGENTA_WOOD);
        blockItem(ModBlocks.STRIPPED_MAGENTA_LOG);
        blockItem(ModBlocks.STRIPPED_MAGENTA_WOOD);

        blockWithItem(ModBlocks.MAGENTA_PLANK);

        stairsBlock(ModBlocks.MAGENTA_WOOD_STAIRS.get(), blockTexture(ModBlocks.MAGENTA_PLANK.get()));
        slabBlock(ModBlocks.MAGENTA_WOOD_SLAB.get(), blockTexture(ModBlocks.MAGENTA_PLANK.get()), blockTexture(ModBlocks.MAGENTA_PLANK.get()));
        buttonBlock(ModBlocks.MAGENTA_WOOD_BUTTON.get(), blockTexture(ModBlocks.MAGENTA_PLANK.get()));
        pressurePlateBlock(ModBlocks.MAGENTA_WOOD_PRESSURE_PLATE.get(), blockTexture(ModBlocks.MAGENTA_PLANK.get()));
        fenceBlock(ModBlocks.MAGENTA_WOOD_FENCE.get(), blockTexture(ModBlocks.MAGENTA_PLANK.get()));
        fenceGateBlock(ModBlocks.MAGENTA_WOOD_FENCE_GATE.get(), blockTexture(ModBlocks.MAGENTA_PLANK.get()));

        doorBlockWithRenderType(ModBlocks.MAGENTA_WOOD_DOOR.get(), modLoc("block/magenta_wood_door_bottom"), modLoc("block/magenta_wood_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.MAGENTA_WOOD_TRAPDOOR.get(), modLoc("block/magenta_wood_trapdoor"), true, "cutout");

        blockItem(ModBlocks.MAGENTA_WOOD_STAIRS);
        blockItem(ModBlocks.MAGENTA_WOOD_SLAB);
        blockItem(ModBlocks.MAGENTA_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.MAGENTA_WOOD_FENCE_GATE);
        blockItem(ModBlocks.MAGENTA_WOOD_TRAPDOOR, "_bottom");

        

    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("tintedgrove:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("tintedgrove:block/" + deferredBlock.getId().getPath() + appendix));
    }
}
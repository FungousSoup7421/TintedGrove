package net.fungoussoup.tintedgrove.block;

import net.fungoussoup.tintedgrove.TintedGrove;
import net.fungoussoup.tintedgrove.block.custom.ModFlammableRotatedPillarBlock;
import net.fungoussoup.tintedgrove.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.awt.*;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(TintedGrove.MOD_ID);
    
    // RED
    
    public static final DeferredBlock<Block> RED_LOG = registerBlock("red_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> RED_WOOD = registerBlock("red_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_RED_LOG = registerBlock("stripped_red_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_RED_WOOD = registerBlock("stripped_red_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> RED_PLANK = registerBlock("red_plank",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));

    public static final DeferredBlock<StairBlock> RED_WOOD_STAIRS = registerBlock("red_wood_stairs",
            () -> new StairBlock(ModBlocks.RED_PLANK.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<SlabBlock> RED_WOOD_SLAB = registerBlock("red_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

    public static final DeferredBlock<PressurePlateBlock> RED_WOOD_PRESSURE_PLATE = registerBlock("red_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<ButtonBlock> RED_WOOD_BUTTON = registerBlock("red_wood_button",
            () -> new ButtonBlock(BlockSetType.OAK, 20, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).noCollission()));

    public static final DeferredBlock<FenceBlock> RED_WOOD_FENCE = registerBlock("red_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> RED_WOOD_FENCE_GATE = registerBlock("red_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));

    public static final DeferredBlock<DoorBlock> RED_WOOD_DOOR = registerBlock("red_wood_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion()));
    public static final DeferredBlock<TrapDoorBlock> RED_WOOD_TRAPDOOR = registerBlock("red_wood_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).noOcclusion()));

    // BLUE
    
    public static final DeferredBlock<Block> BLUE_LOG = registerBlock("blue_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> BLUE_WOOD = registerBlock("blue_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_BLUE_LOG = registerBlock("stripped_blue_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_BLUE_WOOD = registerBlock("stripped_blue_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> BLUE_PLANK = registerBlock("blue_plank",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));

    public static final DeferredBlock<StairBlock> BLUE_WOOD_STAIRS = registerBlock("blue_wood_stairs",
            () -> new StairBlock(ModBlocks.BLUE_PLANK.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<SlabBlock> BLUE_WOOD_SLAB = registerBlock("blue_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

    public static final DeferredBlock<PressurePlateBlock> BLUE_WOOD_PRESSURE_PLATE = registerBlock("blue_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<ButtonBlock> BLUE_WOOD_BUTTON = registerBlock("blue_wood_button",
            () -> new ButtonBlock(BlockSetType.OAK, 20, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).noCollission()));

    public static final DeferredBlock<FenceBlock> BLUE_WOOD_FENCE = registerBlock("blue_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> BLUE_WOOD_FENCE_GATE = registerBlock("blue_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));

    public static final DeferredBlock<DoorBlock> BLUE_WOOD_DOOR = registerBlock("blue_wood_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion()));
    public static final DeferredBlock<TrapDoorBlock> BLUE_WOOD_TRAPDOOR = registerBlock("blue_wood_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).noOcclusion()));
    
    // GREEN
    
    public static final DeferredBlock<Block> GREEN_LOG = registerBlock("green_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> GREEN_WOOD = registerBlock("green_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_GREEN_LOG = registerBlock("stripped_green_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_GREEN_WOOD = registerBlock("stripped_green_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> GREEN_PLANK = registerBlock("green_plank",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));

    public static final DeferredBlock<StairBlock> GREEN_WOOD_STAIRS = registerBlock("green_wood_stairs",
            () -> new StairBlock(ModBlocks.GREEN_PLANK.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<SlabBlock> GREEN_WOOD_SLAB = registerBlock("green_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

    public static final DeferredBlock<PressurePlateBlock> GREEN_WOOD_PRESSURE_PLATE = registerBlock("green_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<ButtonBlock> GREEN_WOOD_BUTTON = registerBlock("green_wood_button",
            () -> new ButtonBlock(BlockSetType.OAK, 20, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).noCollission()));

    public static final DeferredBlock<FenceBlock> GREEN_WOOD_FENCE = registerBlock("green_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> GREEN_WOOD_FENCE_GATE = registerBlock("green_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));

    public static final DeferredBlock<DoorBlock> GREEN_WOOD_DOOR = registerBlock("green_wood_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion()));
    public static final DeferredBlock<TrapDoorBlock> GREEN_WOOD_TRAPDOOR = registerBlock("green_wood_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).noOcclusion()));
    
    // YELLOW
    
    public static final DeferredBlock<Block> YELLOW_LOG = registerBlock("yellow_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> YELLOW_WOOD = registerBlock("yellow_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_YELLOW_LOG = registerBlock("stripped_yellow_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_YELLOW_WOOD = registerBlock("stripped_yellow_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> YELLOW_PLANK = registerBlock("yellow_plank",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));

    public static final DeferredBlock<StairBlock> YELLOW_WOOD_STAIRS = registerBlock("yellow_wood_stairs",
            () -> new StairBlock(ModBlocks.YELLOW_PLANK.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<SlabBlock> YELLOW_WOOD_SLAB = registerBlock("yellow_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

    public static final DeferredBlock<PressurePlateBlock> YELLOW_WOOD_PRESSURE_PLATE = registerBlock("yellow_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<ButtonBlock> YELLOW_WOOD_BUTTON = registerBlock("yellow_wood_button",
            () -> new ButtonBlock(BlockSetType.OAK, 20, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).noCollission()));

    public static final DeferredBlock<FenceBlock> YELLOW_WOOD_FENCE = registerBlock("yellow_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> YELLOW_WOOD_FENCE_GATE = registerBlock("yellow_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));

    public static final DeferredBlock<DoorBlock> YELLOW_WOOD_DOOR = registerBlock("yellow_wood_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion()));
    public static final DeferredBlock<TrapDoorBlock> YELLOW_WOOD_TRAPDOOR = registerBlock("yellow_wood_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).noOcclusion()));
    
    // PURPLE
    
    public static final DeferredBlock<Block> PURPLE_LOG = registerBlock("purple_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> PURPLE_WOOD = registerBlock("purple_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_PURPLE_LOG = registerBlock("stripped_purple_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_PURPLE_WOOD = registerBlock("stripped_purple_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> PURPLE_PLANK = registerBlock("purple_plank",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));

    public static final DeferredBlock<StairBlock> PURPLE_WOOD_STAIRS = registerBlock("purple_wood_stairs",
            () -> new StairBlock(ModBlocks.PURPLE_PLANK.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<SlabBlock> PURPLE_WOOD_SLAB = registerBlock("purple_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

    public static final DeferredBlock<PressurePlateBlock> PURPLE_WOOD_PRESSURE_PLATE = registerBlock("purple_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<ButtonBlock> PURPLE_WOOD_BUTTON = registerBlock("purple_wood_button",
            () -> new ButtonBlock(BlockSetType.OAK, 20, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).noCollission()));

    public static final DeferredBlock<FenceBlock> PURPLE_WOOD_FENCE = registerBlock("purple_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> PURPLE_WOOD_FENCE_GATE = registerBlock("purple_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));

    public static final DeferredBlock<DoorBlock> PURPLE_WOOD_DOOR = registerBlock("purple_wood_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion()));
    public static final DeferredBlock<TrapDoorBlock> PURPLE_WOOD_TRAPDOOR = registerBlock("purple_wood_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).noOcclusion()));
    
    // CYAN
    
    public static final DeferredBlock<Block> CYAN_LOG = registerBlock("cyan_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> CYAN_WOOD = registerBlock("cyan_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_CYAN_LOG = registerBlock("stripped_cyan_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_CYAN_WOOD = registerBlock("stripped_cyan_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> CYAN_PLANK = registerBlock("cyan_plank",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));

    public static final DeferredBlock<StairBlock> CYAN_WOOD_STAIRS = registerBlock("cyan_wood_stairs",
            () -> new StairBlock(ModBlocks.CYAN_PLANK.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<SlabBlock> CYAN_WOOD_SLAB = registerBlock("cyan_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

    public static final DeferredBlock<PressurePlateBlock> CYAN_WOOD_PRESSURE_PLATE = registerBlock("cyan_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<ButtonBlock> CYAN_WOOD_BUTTON = registerBlock("cyan_wood_button",
            () -> new ButtonBlock(BlockSetType.OAK, 20, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).noCollission()));

    public static final DeferredBlock<FenceBlock> CYAN_WOOD_FENCE = registerBlock("cyan_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> CYAN_WOOD_FENCE_GATE = registerBlock("cyan_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));

    public static final DeferredBlock<DoorBlock> CYAN_WOOD_DOOR = registerBlock("cyan_wood_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion()));
    public static final DeferredBlock<TrapDoorBlock> CYAN_WOOD_TRAPDOOR = registerBlock("cyan_wood_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).noOcclusion()));
    
    // ORANGE
    
    public static final DeferredBlock<Block> ORANGE_LOG = registerBlock("orange_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> ORANGE_WOOD = registerBlock("orange_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_ORANGE_LOG = registerBlock("stripped_orange_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_ORANGE_WOOD = registerBlock("stripped_orange_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> ORANGE_PLANK = registerBlock("orange_plank",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));

    public static final DeferredBlock<StairBlock> ORANGE_WOOD_STAIRS = registerBlock("orange_wood_stairs",
            () -> new StairBlock(ModBlocks.ORANGE_PLANK.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<SlabBlock> ORANGE_WOOD_SLAB = registerBlock("orange_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

    public static final DeferredBlock<PressurePlateBlock> ORANGE_WOOD_PRESSURE_PLATE = registerBlock("orange_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<ButtonBlock> ORANGE_WOOD_BUTTON = registerBlock("orange_wood_button",
            () -> new ButtonBlock(BlockSetType.OAK, 20, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).noCollission()));

    public static final DeferredBlock<FenceBlock> ORANGE_WOOD_FENCE = registerBlock("orange_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> ORANGE_WOOD_FENCE_GATE = registerBlock("orange_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));

    public static final DeferredBlock<DoorBlock> ORANGE_WOOD_DOOR = registerBlock("orange_wood_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion()));
    public static final DeferredBlock<TrapDoorBlock> ORANGE_WOOD_TRAPDOOR = registerBlock("orange_wood_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).noOcclusion()));
    
    // LIME
    
    public static final DeferredBlock<Block> LIME_LOG = registerBlock("lime_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> LIME_WOOD = registerBlock("lime_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_LIME_LOG = registerBlock("stripped_lime_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_LIME_WOOD = registerBlock("stripped_lime_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> LIME_PLANK = registerBlock("lime_plank",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));

    public static final DeferredBlock<StairBlock> LIME_WOOD_STAIRS = registerBlock("lime_wood_stairs",
            () -> new StairBlock(ModBlocks.LIME_PLANK.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<SlabBlock> LIME_WOOD_SLAB = registerBlock("lime_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

    public static final DeferredBlock<PressurePlateBlock> LIME_WOOD_PRESSURE_PLATE = registerBlock("lime_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<ButtonBlock> LIME_WOOD_BUTTON = registerBlock("lime_wood_button",
            () -> new ButtonBlock(BlockSetType.OAK, 20, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).noCollission()));

    public static final DeferredBlock<FenceBlock> LIME_WOOD_FENCE = registerBlock("lime_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> LIME_WOOD_FENCE_GATE = registerBlock("lime_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));

    public static final DeferredBlock<DoorBlock> LIME_WOOD_DOOR = registerBlock("lime_wood_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion()));
    public static final DeferredBlock<TrapDoorBlock> LIME_WOOD_TRAPDOOR = registerBlock("lime_wood_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).noOcclusion()));
    
    // PINK
    
    public static final DeferredBlock<Block> PINK_LOG = registerBlock("pink_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> PINK_WOOD = registerBlock("pink_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_PINK_LOG = registerBlock("stripped_pink_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_PINK_WOOD = registerBlock("stripped_pink_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> PINK_PLANK = registerBlock("pink_plank",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));

    public static final DeferredBlock<StairBlock> PINK_WOOD_STAIRS = registerBlock("pink_wood_stairs",
            () -> new StairBlock(ModBlocks.PINK_PLANK.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<SlabBlock> PINK_WOOD_SLAB = registerBlock("pink_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

    public static final DeferredBlock<PressurePlateBlock> PINK_WOOD_PRESSURE_PLATE = registerBlock("pink_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<ButtonBlock> PINK_WOOD_BUTTON = registerBlock("pink_wood_button",
            () -> new ButtonBlock(BlockSetType.OAK, 20, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).noCollission()));

    public static final DeferredBlock<FenceBlock> PINK_WOOD_FENCE = registerBlock("pink_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> PINK_WOOD_FENCE_GATE = registerBlock("pink_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));

    public static final DeferredBlock<DoorBlock> PINK_WOOD_DOOR = registerBlock("pink_wood_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion()));
    public static final DeferredBlock<TrapDoorBlock> PINK_WOOD_TRAPDOOR = registerBlock("pink_wood_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).noOcclusion()));
    
    // BROWN
    
    public static final DeferredBlock<Block> BROWN_LOG = registerBlock("brown_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> BROWN_WOOD = registerBlock("brown_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_BROWN_LOG = registerBlock("stripped_brown_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_BROWN_WOOD = registerBlock("stripped_brown_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> BROWN_PLANK = registerBlock("brown_plank",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));

    public static final DeferredBlock<StairBlock> BROWN_WOOD_STAIRS = registerBlock("brown_wood_stairs",
            () -> new StairBlock(ModBlocks.BROWN_PLANK.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<SlabBlock> BROWN_WOOD_SLAB = registerBlock("brown_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

    public static final DeferredBlock<PressurePlateBlock> BROWN_WOOD_PRESSURE_PLATE = registerBlock("brown_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<ButtonBlock> BROWN_WOOD_BUTTON = registerBlock("brown_wood_button",
            () -> new ButtonBlock(BlockSetType.OAK, 20, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).noCollission()));

    public static final DeferredBlock<FenceBlock> BROWN_WOOD_FENCE = registerBlock("brown_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> BROWN_WOOD_FENCE_GATE = registerBlock("brown_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));

    public static final DeferredBlock<DoorBlock> BROWN_WOOD_DOOR = registerBlock("brown_wood_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion()));
    public static final DeferredBlock<TrapDoorBlock> BROWN_WOOD_TRAPDOOR = registerBlock("brown_wood_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).noOcclusion()));
    
    // BLACK
    
    public static final DeferredBlock<Block> BLACK_LOG = registerBlock("black_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> BLACK_WOOD = registerBlock("black_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_BLACK_LOG = registerBlock("stripped_black_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_BLACK_WOOD = registerBlock("stripped_black_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> BLACK_PLANK = registerBlock("black_plank",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));

    public static final DeferredBlock<StairBlock> BLACK_WOOD_STAIRS = registerBlock("black_wood_stairs",
            () -> new StairBlock(ModBlocks.BLACK_PLANK.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<SlabBlock> BLACK_WOOD_SLAB = registerBlock("black_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

    public static final DeferredBlock<PressurePlateBlock> BLACK_WOOD_PRESSURE_PLATE = registerBlock("black_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<ButtonBlock> BLACK_WOOD_BUTTON = registerBlock("black_wood_button",
            () -> new ButtonBlock(BlockSetType.OAK, 20, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).noCollission()));

    public static final DeferredBlock<FenceBlock> BLACK_WOOD_FENCE = registerBlock("black_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> BLACK_WOOD_FENCE_GATE = registerBlock("black_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));

    public static final DeferredBlock<DoorBlock> BLACK_WOOD_DOOR = registerBlock("black_wood_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion()));
    public static final DeferredBlock<TrapDoorBlock> BLACK_WOOD_TRAPDOOR = registerBlock("black_wood_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).noOcclusion()));
    
    // WHITE
    
    public static final DeferredBlock<Block> WHITE_LOG = registerBlock("white_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> WHITE_WOOD = registerBlock("white_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_WHITE_LOG = registerBlock("stripped_white_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_WHITE_WOOD = registerBlock("stripped_white_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> WHITE_PLANK = registerBlock("white_plank",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));

    public static final DeferredBlock<StairBlock> WHITE_WOOD_STAIRS = registerBlock("white_wood_stairs",
            () -> new StairBlock(ModBlocks.WHITE_PLANK.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<SlabBlock> WHITE_WOOD_SLAB = registerBlock("white_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

    public static final DeferredBlock<PressurePlateBlock> WHITE_WOOD_PRESSURE_PLATE = registerBlock("white_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<ButtonBlock> WHITE_WOOD_BUTTON = registerBlock("white_wood_button",
            () -> new ButtonBlock(BlockSetType.OAK, 20, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).noCollission()));

    public static final DeferredBlock<FenceBlock> WHITE_WOOD_FENCE = registerBlock("white_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> WHITE_WOOD_FENCE_GATE = registerBlock("white_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));

    public static final DeferredBlock<DoorBlock> WHITE_WOOD_DOOR = registerBlock("white_wood_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion()));
    public static final DeferredBlock<TrapDoorBlock> WHITE_WOOD_TRAPDOOR = registerBlock("white_wood_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).noOcclusion()));
    
    // GRAY
    
    public static final DeferredBlock<Block> GRAY_LOG = registerBlock("gray_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> GRAY_WOOD = registerBlock("gray_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_GRAY_LOG = registerBlock("stripped_gray_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_GRAY_WOOD = registerBlock("stripped_gray_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> GRAY_PLANK = registerBlock("gray_plank",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));

    public static final DeferredBlock<StairBlock> GRAY_WOOD_STAIRS = registerBlock("gray_wood_stairs",
            () -> new StairBlock(ModBlocks.GRAY_PLANK.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<SlabBlock> GRAY_WOOD_SLAB = registerBlock("gray_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

    public static final DeferredBlock<PressurePlateBlock> GRAY_WOOD_PRESSURE_PLATE = registerBlock("gray_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<ButtonBlock> GRAY_WOOD_BUTTON = registerBlock("gray_wood_button",
            () -> new ButtonBlock(BlockSetType.OAK, 20, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).noCollission()));

    public static final DeferredBlock<FenceBlock> GRAY_WOOD_FENCE = registerBlock("gray_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> GRAY_WOOD_FENCE_GATE = registerBlock("gray_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));

    public static final DeferredBlock<DoorBlock> GRAY_WOOD_DOOR = registerBlock("gray_wood_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion()));
    public static final DeferredBlock<TrapDoorBlock> GRAY_WOOD_TRAPDOOR = registerBlock("gray_wood_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).noOcclusion()));
    
    // LIGHT_GRAY
    
    public static final DeferredBlock<Block> LIGHT_GRAY_LOG = registerBlock("light_gray_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> LIGHT_GRAY_WOOD = registerBlock("light_gray_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_LIGHT_GRAY_LOG = registerBlock("stripped_light_gray_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_LIGHT_GRAY_WOOD = registerBlock("stripped_light_gray_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> LIGHT_GRAY_PLANK = registerBlock("light_gray_plank",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));

    public static final DeferredBlock<StairBlock> LIGHT_GRAY_WOOD_STAIRS = registerBlock("light_gray_wood_stairs",
            () -> new StairBlock(ModBlocks.LIGHT_GRAY_PLANK.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_WOOD_SLAB = registerBlock("light_gray_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

    public static final DeferredBlock<PressurePlateBlock> LIGHT_GRAY_WOOD_PRESSURE_PLATE = registerBlock("light_gray_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<ButtonBlock> LIGHT_GRAY_WOOD_BUTTON = registerBlock("light_gray_wood_button",
            () -> new ButtonBlock(BlockSetType.OAK, 20, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).noCollission()));

    public static final DeferredBlock<FenceBlock> LIGHT_GRAY_WOOD_FENCE = registerBlock("light_gray_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> LIGHT_GRAY_WOOD_FENCE_GATE = registerBlock("light_gray_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));

    public static final DeferredBlock<DoorBlock> LIGHT_GRAY_WOOD_DOOR = registerBlock("light_gray_wood_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion()));
    public static final DeferredBlock<TrapDoorBlock> LIGHT_GRAY_WOOD_TRAPDOOR = registerBlock("light_gray_wood_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).noOcclusion()));
    
    // LIGHT_BLUE
    
    public static final DeferredBlock<Block> LIGHT_BLUE_LOG = registerBlock("light_blue_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> LIGHT_BLUE_WOOD = registerBlock("light_blue_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_LIGHT_BLUE_LOG = registerBlock("stripped_light_blue_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_LIGHT_BLUE_WOOD = registerBlock("stripped_light_blue_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> LIGHT_BLUE_PLANK = registerBlock("light_blue_plank",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));

    public static final DeferredBlock<StairBlock> LIGHT_BLUE_WOOD_STAIRS = registerBlock("light_blue_wood_stairs",
            () -> new StairBlock(ModBlocks.LIGHT_BLUE_PLANK.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_WOOD_SLAB = registerBlock("light_blue_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

    public static final DeferredBlock<PressurePlateBlock> LIGHT_BLUE_WOOD_PRESSURE_PLATE = registerBlock("light_blue_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<ButtonBlock> LIGHT_BLUE_WOOD_BUTTON = registerBlock("light_blue_wood_button",
            () -> new ButtonBlock(BlockSetType.OAK, 20, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).noCollission()));

    public static final DeferredBlock<FenceBlock> LIGHT_BLUE_WOOD_FENCE = registerBlock("light_blue_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> LIGHT_BLUE_WOOD_FENCE_GATE = registerBlock("light_blue_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));

    public static final DeferredBlock<DoorBlock> LIGHT_BLUE_WOOD_DOOR = registerBlock("light_blue_wood_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion()));
    public static final DeferredBlock<TrapDoorBlock> LIGHT_BLUE_WOOD_TRAPDOOR = registerBlock("light_blue_wood_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).noOcclusion()));
    
    // MAGENTA
    
    public static final DeferredBlock<Block> MAGENTA_LOG = registerBlock("magenta_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> MAGENTA_WOOD = registerBlock("magenta_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> STRIPPED_MAGENTA_LOG = registerBlock("stripped_magenta_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_MAGENTA_WOOD = registerBlock("stripped_magenta_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> MAGENTA_PLANK = registerBlock("magenta_plank",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));

    public static final DeferredBlock<StairBlock> MAGENTA_WOOD_STAIRS = registerBlock("magenta_wood_stairs",
            () -> new StairBlock(ModBlocks.MAGENTA_PLANK.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<SlabBlock> MAGENTA_WOOD_SLAB = registerBlock("magenta_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

    public static final DeferredBlock<PressurePlateBlock> MAGENTA_WOOD_PRESSURE_PLATE = registerBlock("magenta_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<ButtonBlock> MAGENTA_WOOD_BUTTON = registerBlock("magenta_wood_button",
            () -> new ButtonBlock(BlockSetType.OAK, 20, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).noCollission()));

    public static final DeferredBlock<FenceBlock> MAGENTA_WOOD_FENCE = registerBlock("magenta_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> MAGENTA_WOOD_FENCE_GATE = registerBlock("magenta_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));

    public static final DeferredBlock<DoorBlock> MAGENTA_WOOD_DOOR = registerBlock("magenta_wood_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion()));
    public static final DeferredBlock<TrapDoorBlock> MAGENTA_WOOD_TRAPDOOR = registerBlock("magenta_wood_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).noOcclusion()));
    

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

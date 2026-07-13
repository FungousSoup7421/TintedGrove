package net.fungoussoup.tintedgrove.block;

import net.fungoussoup.tintedgrove.TintedGrove;
import net.fungoussoup.tintedgrove.block.custom.ModFlammableRotatedPillarBlock;
import net.fungoussoup.tintedgrove.item.ModItems;
import net.fungoussoup.tintedgrove.util.TintedColor;
import net.fungoussoup.tintedgrove.util.TintedFlowerType;
import net.fungoussoup.tintedgrove.worldgen.tree.ModTreeGrowers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(TintedGrove.MOD_ID);

    public static final Map<TintedColor, DeferredBlock<Block>> LOGS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<Block>> WOODS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<Block>> STRIPPED_LOGS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<Block>> STRIPPED_WOODS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<Block>> PLANKS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<StairBlock>> WOOD_STAIRS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<SlabBlock>> WOOD_SLABS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<PressurePlateBlock>> WOOD_PRESSURE_PLATES = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<ButtonBlock>> WOOD_BUTTONS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<FenceBlock>> WOOD_FENCES = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<FenceGateBlock>> WOOD_FENCE_GATES = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> WOOD_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<TrapDoorBlock>> WOOD_TRAPDOORS = new EnumMap<>(TintedColor.class);

    public static final Map<TintedColor, DeferredBlock<LeavesBlock>> LEAVES = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<SaplingBlock>> SAPLINGS = new EnumMap<>(TintedColor.class);

    public static final Map<TintedFlowerType, Map<TintedColor, DeferredBlock<Block>>> FLOWERS = new EnumMap<>(TintedFlowerType.class);
    public static final Map<TintedFlowerType, Map<TintedColor, DeferredBlock<Block>>> POTTED_FLOWERS = new EnumMap<>(TintedFlowerType.class);

    // DOOR UPDATE
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> GLASS_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> WHITE_GLASS_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> LIGHT_GRAY_GLASS_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> GRAY_GLASS_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> BLACK_GLASS_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> BROWN_GLASS_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> RED_GLASS_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> ORANGE_GLASS_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> YELLOW_GLASS_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> LIME_GLASS_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> GREEN_GLASS_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> CYAN_GLASS_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> LIGHT_BLUE_GLASS_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> BLUE_GLASS_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> PURPLE_GLASS_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> MAGENTA_GLASS_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> PINK_GLASS_DOORS = new EnumMap<>(TintedColor.class);

    public static final Map<TintedColor, DeferredBlock<DoorBlock>> GLASS_WINDOW_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> WHITE_GLASS_WINDOW_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> LIGHT_GRAY_GLASS_WINDOW_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> GRAY_GLASS_WINDOW_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> BLACK_GLASS_WINDOW_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> BROWN_GLASS_WINDOW_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> RED_GLASS_WINDOW_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> ORANGE_GLASS_WINDOW_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> YELLOW_GLASS_WINDOW_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> LIME_GLASS_WINDOW_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> GREEN_GLASS_WINDOW_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> CYAN_GLASS_WINDOW_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> LIGHT_BLUE_GLASS_WINDOW_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> BLUE_GLASS_WINDOW_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> PURPLE_GLASS_WINDOW_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> MAGENTA_GLASS_WINDOW_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> PINK_GLASS_WINDOW_DOORS = new EnumMap<>(TintedColor.class);

    public static final Map<TintedColor, DeferredBlock<DoorBlock>> LEFT_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> LEFT_WHITE_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> LEFT_LIGHT_GRAY_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> LEFT_GRAY_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> LEFT_BLACK_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> LEFT_BROWN_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> LEFT_RED_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> LEFT_ORANGE_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> LEFT_YELLOW_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> LEFT_LIME_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> LEFT_GREEN_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> LEFT_CYAN_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> LEFT_LIGHT_BLUE_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> LEFT_BLUE_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> LEFT_PURPLE_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> LEFT_MAGENTA_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> LEFT_PINK_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);

    public static final Map<TintedColor, DeferredBlock<DoorBlock>> RIGHT_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> RIGHT_WHITE_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> RIGHT_LIGHT_GRAY_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> RIGHT_GRAY_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> RIGHT_BLACK_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> RIGHT_BROWN_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> RIGHT_RED_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> RIGHT_ORANGE_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> RIGHT_YELLOW_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> RIGHT_LIME_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> RIGHT_GREEN_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> RIGHT_CYAN_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> RIGHT_LIGHT_BLUE_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> RIGHT_BLUE_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> RIGHT_PURPLE_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> RIGHT_MAGENTA_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);
    public static final Map<TintedColor, DeferredBlock<DoorBlock>> RIGHT_PINK_GLASS_PANEL_DOORS = new EnumMap<>(TintedColor.class);

    static {
        registerAllWoodSets();
        registerAllFlowers();
    }

//    public static final DeferredBlock<Block> BLUE_DANDELION = registerBlock("blue_dandelion",
//            () -> new FlowerBlock(MobEffects.SATURATION, 8, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
//    public static final DeferredBlock<Block> POTTED_BLUE_DANDELION = BLOCKS.register("potted_blue_dandelion",
//            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), BLUE_DANDELION, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));

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

    public static DeferredBlock<Block> getLog(TintedColor color) {
        return LOGS.get(color);
    }

    public static DeferredBlock<Block> getWood(TintedColor color) {
        return WOODS.get(color);
    }

    public static DeferredBlock<Block> getStrippedLog(TintedColor color) {
        return STRIPPED_LOGS.get(color);
    }

    public static DeferredBlock<Block> getStrippedWood(TintedColor color) {
        return STRIPPED_WOODS.get(color);
    }

    public static DeferredBlock<Block> getPlanks(TintedColor color) {
        return PLANKS.get(color);
    }

    public static DeferredBlock<StairBlock> getWoodStairs(TintedColor color) {
        return WOOD_STAIRS.get(color);
    }

    public static DeferredBlock<SlabBlock> getWoodSlab(TintedColor color) {
        return WOOD_SLABS.get(color);
    }

    public static DeferredBlock<PressurePlateBlock> getWoodPressurePlate(TintedColor color) {
        return WOOD_PRESSURE_PLATES.get(color);
    }

    public static DeferredBlock<ButtonBlock> getWoodButton(TintedColor color) {
        return WOOD_BUTTONS.get(color);
    }

    public static DeferredBlock<FenceBlock> getWoodFence(TintedColor color) {
        return WOOD_FENCES.get(color);
    }

    public static DeferredBlock<FenceGateBlock> getWoodFenceGate(TintedColor color) {
        return WOOD_FENCE_GATES.get(color);
    }

    public static DeferredBlock<DoorBlock> getWoodDoor(TintedColor color) {
        return WOOD_DOORS.get(color);
    }

    public static DeferredBlock<TrapDoorBlock> getWoodTrapdoor(TintedColor color) {
        return WOOD_TRAPDOORS.get(color);
    }

    public static DeferredBlock<LeavesBlock> getLeaves(TintedColor color) {
        return LEAVES.get(color);
    }

    public static DeferredBlock<SaplingBlock> getSapling(TintedColor color) {
        return SAPLINGS.get(color);
    }

    public static DeferredBlock<DoorBlock> getGlassDoor(TintedColor color) {return GLASS_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getWhiteGlassDoor(TintedColor color) {return WHITE_GLASS_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getOrangeGlassDoor(TintedColor color) {return ORANGE_GLASS_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getMagentaGlassDoor(TintedColor color) {return MAGENTA_GLASS_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getLightBlueGlassDoor(TintedColor color) {return LIGHT_BLUE_GLASS_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getYellowGlassDoor(TintedColor color) {return YELLOW_GLASS_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getLimeGlassDoor(TintedColor color) {return LIME_GLASS_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getPinkGlassDoor(TintedColor color) {return PINK_GLASS_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getGrayGlassDoor(TintedColor color) {return GRAY_GLASS_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getLightGrayGlassDoor(TintedColor color) {return LIGHT_GRAY_GLASS_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getCyanGlassDoor(TintedColor color) {return CYAN_GLASS_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getPurpleGlassDoor(TintedColor color) {return PURPLE_GLASS_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getBlueGlassDoor(TintedColor color) {return BLUE_GLASS_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getBrownGlassDoor(TintedColor color) {return BROWN_GLASS_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getGreenGlassDoor(TintedColor color) {return GREEN_GLASS_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getRedGlassDoor(TintedColor color) {return RED_GLASS_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getBlackGlassDoor(TintedColor color) {return BLACK_GLASS_DOORS.get(color);}

    public static DeferredBlock<DoorBlock> getGlassWindowDoor(TintedColor color) {return GLASS_WINDOW_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getWhiteGlassWindowDoor(TintedColor color) {return WHITE_GLASS_WINDOW_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getOrangeGlassWindowDoor(TintedColor color) {return ORANGE_GLASS_WINDOW_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getMagentaGlassWindowDoor(TintedColor color) {return MAGENTA_GLASS_WINDOW_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getLightBlueGlassWindowDoor(TintedColor color) {return LIGHT_BLUE_GLASS_WINDOW_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getYellowGlassWindowDoor(TintedColor color) {return YELLOW_GLASS_WINDOW_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getLimeGlassWindowDoor(TintedColor color) {return LIME_GLASS_WINDOW_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getPinkGlassWindowDoor(TintedColor color) {return PINK_GLASS_WINDOW_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getGrayGlassWindowDoor(TintedColor color) {return GRAY_GLASS_WINDOW_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getLightGrayGlassWindowDoor(TintedColor color) {return LIGHT_GRAY_GLASS_WINDOW_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getCyanGlassWindowDoor(TintedColor color) {return CYAN_GLASS_WINDOW_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getPurpleGlassWindowDoor(TintedColor color) {return PURPLE_GLASS_WINDOW_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getBlueGlassWindowDoor(TintedColor color) {return BLUE_GLASS_WINDOW_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getBrownGlassWindowDoor(TintedColor color) {return BROWN_GLASS_WINDOW_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getGreenGlassWindowDoor(TintedColor color) {return GREEN_GLASS_WINDOW_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getRedGlassWindowDoor(TintedColor color) {return RED_GLASS_WINDOW_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getBlackGlassWindowDoor(TintedColor color) {return BLACK_GLASS_WINDOW_DOORS.get(color);}

    public static DeferredBlock<DoorBlock> getLeftGlassPanelDoor(TintedColor color) {return LEFT_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getLeftWhiteGlassPanelDoor(TintedColor color) {return LEFT_WHITE_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getLeftOrangeGlassPanelDoor(TintedColor color) {return LEFT_ORANGE_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getLeftMagentaGlassPanelDoor(TintedColor color) {return LEFT_MAGENTA_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getLeftLightBlueGlassPanelDoor(TintedColor color) {return LEFT_LIGHT_BLUE_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getLeftYellowGlassPanelDoor(TintedColor color) {return LEFT_YELLOW_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getLeftLimeGlassPanelDoor(TintedColor color) {return LEFT_LIME_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getLeftPinkGlassPanelDoor(TintedColor color) {return LEFT_PINK_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getLeftGrayGlassPanelDoor(TintedColor color) {return LEFT_GRAY_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getLeftLightGrayGlassPanelDoor(TintedColor color) {return LEFT_LIGHT_GRAY_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getLeftCyanGlassPanelDoor(TintedColor color) {return LEFT_CYAN_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getLeftPurpleGlassPanelDoor(TintedColor color) {return LEFT_PURPLE_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getLeftBlueGlassPanelDoor(TintedColor color) {return LEFT_BLUE_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getLeftBrownGlassPanelDoor(TintedColor color) {return LEFT_BROWN_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getLeftGreenGlassPanelDoor(TintedColor color) {return LEFT_GREEN_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getLeftRedGlassPanelDoor(TintedColor color) {return LEFT_RED_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getLeftBlackGlassPanelDoor(TintedColor color) {return LEFT_BLACK_GLASS_PANEL_DOORS.get(color);}

    public static DeferredBlock<DoorBlock> getRightGlassPanelDoor(TintedColor color) {return RIGHT_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getRightWhiteGlassPanelDoor(TintedColor color) {return RIGHT_WHITE_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getRightOrangeGlassPanelDoor(TintedColor color) {return RIGHT_ORANGE_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getRightMagentaGlassPanelDoor(TintedColor color) {return RIGHT_MAGENTA_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getRightLightBlueGlassPanelDoor(TintedColor color) {return RIGHT_LIGHT_BLUE_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getRightYellowGlassPanelDoor(TintedColor color) {return RIGHT_YELLOW_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getRightLimeGlassPanelDoor(TintedColor color) {return RIGHT_LIME_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getRightPinkGlassPanelDoor(TintedColor color) {return RIGHT_PINK_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getRightGrayGlassPanelDoor(TintedColor color) {return RIGHT_GRAY_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getRightLightGrayGlassPanelDoor(TintedColor color) {return RIGHT_LIGHT_GRAY_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getRightCyanGlassPanelDoor(TintedColor color) {return RIGHT_CYAN_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getRightPurpleGlassPanelDoor(TintedColor color) {return RIGHT_PURPLE_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getRightBlueGlassPanelDoor(TintedColor color) {return RIGHT_BLUE_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getRightBrownGlassPanelDoor(TintedColor color) {return RIGHT_BROWN_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getRightGreenGlassPanelDoor(TintedColor color) {return RIGHT_GREEN_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getRightRedGlassPanelDoor(TintedColor color) {return RIGHT_RED_GLASS_PANEL_DOORS.get(color);}
    public static DeferredBlock<DoorBlock> getRightBlackGlassPanelDoor(TintedColor color) {return RIGHT_BLACK_GLASS_PANEL_DOORS.get(color);}

    private static void registerDoorVariants(TintedColor color) {
        GLASS_DOORS.put(color, registerBlock(color.blockName("glass_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        WHITE_GLASS_DOORS.put(color, registerBlock(color.blockName("white_glass_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        ORANGE_GLASS_DOORS.put(color, registerBlock(color.blockName("orange_glass_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        MAGENTA_GLASS_DOORS.put(color, registerBlock(color.blockName("magenta_glass_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        LIGHT_BLUE_GLASS_DOORS.put(color, registerBlock(color.blockName("light_blue_glass_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        YELLOW_GLASS_DOORS.put(color, registerBlock(color.blockName("yellow_glass_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        LIME_GLASS_DOORS.put(color, registerBlock(color.blockName("lime_glass_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        PINK_GLASS_DOORS.put(color, registerBlock(color.blockName("pink_glass_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        GRAY_GLASS_DOORS.put(color, registerBlock(color.blockName("gray_glass_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        LIGHT_GRAY_GLASS_DOORS.put(color, registerBlock(color.blockName("light_gray_glass_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        CYAN_GLASS_DOORS.put(color, registerBlock(color.blockName("cyan_glass_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        PURPLE_GLASS_DOORS.put(color, registerBlock(color.blockName("purple_glass_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        BLUE_GLASS_DOORS.put(color, registerBlock(color.blockName("blue_glass_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        BROWN_GLASS_DOORS.put(color, registerBlock(color.blockName("brown_glass_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        GREEN_GLASS_DOORS.put(color, registerBlock(color.blockName("green_glass_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        RED_GLASS_DOORS.put(color, registerBlock(color.blockName("red_glass_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        BLACK_GLASS_DOORS.put(color, registerBlock(color.blockName("black_glass_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));

        GLASS_WINDOW_DOORS.put(color, registerBlock(color.blockName("glass_window_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        WHITE_GLASS_WINDOW_DOORS.put(color, registerBlock(color.blockName("white_glass_window_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        ORANGE_GLASS_WINDOW_DOORS.put(color, registerBlock(color.blockName("orange_glass_window_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        MAGENTA_GLASS_WINDOW_DOORS.put(color, registerBlock(color.blockName("magenta_glass_window_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        LIGHT_BLUE_GLASS_WINDOW_DOORS.put(color, registerBlock(color.blockName("light_blue_glass_window_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        YELLOW_GLASS_WINDOW_DOORS.put(color, registerBlock(color.blockName("yellow_glass_window_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        LIME_GLASS_WINDOW_DOORS.put(color, registerBlock(color.blockName("lime_glass_window_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        PINK_GLASS_WINDOW_DOORS.put(color, registerBlock(color.blockName("pink_glass_window_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        GRAY_GLASS_WINDOW_DOORS.put(color, registerBlock(color.blockName("gray_glass_window_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        LIGHT_GRAY_GLASS_WINDOW_DOORS.put(color, registerBlock(color.blockName("light_gray_glass_window_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        CYAN_GLASS_WINDOW_DOORS.put(color, registerBlock(color.blockName("cyan_glass_window_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        PURPLE_GLASS_WINDOW_DOORS.put(color, registerBlock(color.blockName("purple_glass_window_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        BLUE_GLASS_WINDOW_DOORS.put(color, registerBlock(color.blockName("blue_glass_window_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        BROWN_GLASS_WINDOW_DOORS.put(color, registerBlock(color.blockName("brown_glass_window_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        GREEN_GLASS_WINDOW_DOORS.put(color, registerBlock(color.blockName("green_glass_window_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        RED_GLASS_WINDOW_DOORS.put(color, registerBlock(color.blockName("red_glass_window_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        BLACK_GLASS_WINDOW_DOORS.put(color, registerBlock(color.blockName("black_glass_window_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));

        LEFT_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("left_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        LEFT_WHITE_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("left_white_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        LEFT_ORANGE_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("left_orange_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        LEFT_MAGENTA_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("left_magenta_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        LEFT_LIGHT_BLUE_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("left_light_blue_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        LEFT_YELLOW_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("left_yellow_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        LEFT_LIME_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("left_lime_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        LEFT_PINK_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("left_pink_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        LEFT_GRAY_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("left_gray_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        LEFT_LIGHT_GRAY_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("left_light_gray_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        LEFT_CYAN_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("left_cyan_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        LEFT_PURPLE_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("left_purple_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        LEFT_BLUE_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("left_blue_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        LEFT_BROWN_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("left_brown_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        LEFT_GREEN_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("left_green_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        LEFT_RED_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("left_red_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        LEFT_BLACK_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("left_black_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));

        RIGHT_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("right_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        RIGHT_WHITE_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("right_white_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        RIGHT_ORANGE_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("right_orange_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        RIGHT_MAGENTA_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("right_magenta_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        RIGHT_LIGHT_BLUE_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("right_light_blue_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        RIGHT_YELLOW_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("right_yellow_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        RIGHT_LIME_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("right_lime_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        RIGHT_PINK_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("right_pink_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        RIGHT_GRAY_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("right_gray_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        RIGHT_LIGHT_GRAY_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("right_light_gray_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        RIGHT_CYAN_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("right_cyan_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        RIGHT_PURPLE_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("right_purple_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        RIGHT_BLUE_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("right_blue_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        RIGHT_BROWN_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("right_brown_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        RIGHT_GREEN_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("right_green_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        RIGHT_RED_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("right_red_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
        RIGHT_BLACK_GLASS_PANEL_DOORS.put(color, registerBlock(color.blockName("right_black_glass_panel_door"), () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));
    }


    private static void registerWoodSet(TintedColor color) {
        LOGS.put(color, registerBlock(color.blockName("log"),
                () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG))));

        WOODS.put(color, registerBlock(color.blockName("wood"),
                () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD))));

        STRIPPED_LOGS.put(color, registerBlock("stripped_" + color.blockName("log"),
                () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG))));

        STRIPPED_WOODS.put(color, registerBlock("stripped_" + color.blockName("wood"),
                () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD))));

        PLANKS.put(color, registerBlock(color.blockName("planks"),
                () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))));

        WOOD_STAIRS.put(color, registerBlock(color.blockName("wood_stairs"),
                () -> new StairBlock(getPlanks(color).get().defaultBlockState(),
                        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS))));

        WOOD_SLABS.put(color, registerBlock(color.blockName("wood_slab"),
                () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB))));

        WOOD_PRESSURE_PLATES.put(color, registerBlock(color.blockName("wood_pressure_plate"),
                () -> new PressurePlateBlock(BlockSetType.OAK,
                        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE))));

        WOOD_BUTTONS.put(color, registerBlock(color.blockName("wood_button"),
                () -> new ButtonBlock(BlockSetType.OAK, 20,
                        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).noCollission())));

        WOOD_FENCES.put(color, registerBlock(color.blockName("wood_fence"),
                () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE))));

        WOOD_FENCE_GATES.put(color, registerBlock(color.blockName("wood_fence_gate"),
                () -> new FenceGateBlock(WoodType.OAK,
                        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE))));

        WOOD_DOORS.put(color, registerBlock(color.blockName("wood_door"),
                () -> new DoorBlock(BlockSetType.OAK,
                        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion())));

        WOOD_TRAPDOORS.put(color, registerBlock(color.blockName("wood_trapdoor"),
                () -> new TrapDoorBlock(BlockSetType.OAK,
                        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).noOcclusion())));

        LEAVES.put(color, registerBlock(color.blockName("leaves"),
                () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)) {
                    @Override
                    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                        return true;
                    }

                    @Override
                    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                        return 60;
                    }

                    @Override
                    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                        return 30;
                    }
        }));

        SAPLINGS.put(color, registerBlock(color.blockName("sapling"),
                () -> new SaplingBlock(
                        ModTreeGrowers.getTreeGrower(color),
                        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING))));
    }

    private static void registerAllWoodSets() {
        for (TintedColor color : TintedColor.values()) {
            registerWoodSet(color);
            registerDoorVariants(color);
        }
    }

    private static void registerAllFlowers() {
        for (TintedFlowerType type : TintedFlowerType.values()) {
            Map<TintedColor, DeferredBlock<Block>> flowerMap = new EnumMap<>(TintedColor.class);
            Map<TintedColor, DeferredBlock<Block>> pottedMap = new EnumMap<>(TintedColor.class);

            for (TintedColor color : TintedColor.values()) {
                String name = color.blockName(type.getName());

                DeferredBlock<Block> flower = registerBlock(name,
                        () -> new FlowerBlock(
                                MobEffects.SATURATION,
                                8,
                                BlockBehaviour.Properties.ofFullCopy(type.getBaseBlock())
                        )
                );

                DeferredBlock<Block> potted = BLOCKS.register("potted_" + name,
                        () -> new FlowerPotBlock(
                                () -> (FlowerPotBlock) Blocks.FLOWER_POT,
                                flower,
                                BlockBehaviour.Properties.ofFullCopy(type.getPottedBase())
                        )
                );

                flowerMap.put(color, flower);
                pottedMap.put(color, potted);
            }

            FLOWERS.put(type, flowerMap);
            POTTED_FLOWERS.put(type, pottedMap);
        }
    }
}

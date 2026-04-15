package net.fungoussoup.tintedgrove.block;

import net.fungoussoup.tintedgrove.TintedGrove;
import net.fungoussoup.tintedgrove.block.custom.ModFlammableRotatedPillarBlock;
import net.fungoussoup.tintedgrove.item.ModItems;
import net.fungoussoup.tintedgrove.util.TintedColor;
import net.fungoussoup.tintedgrove.worldgen.tree.ModTreeGrowers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
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

//    public static final Map<Block, Block> STRIPPABLES = new HashMap<>();
//
//    public static Block getStripped(Block block) {
//        return STRIPPABLES.get(block);
//    }
//
//    private static void registerStrippables() {
//        for (TintedColor color : TintedColor.values()) {
//            STRIPPABLES.put(getLog(color).get(), getStrippedLog(color).get());
//            STRIPPABLES.put(getWood(color).get(), getStrippedWood(color).get());
//        }
//    }

    static {
        registerAllWoodSets();
//        registerStrippables();
    }

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
        }
    }
}

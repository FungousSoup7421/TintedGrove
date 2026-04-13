package net.fungoussoup.tintedgrove.block.custom;

import net.fungoussoup.tintedgrove.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.ItemAbility;
import org.jetbrains.annotations.Nullable;

public class ModFlammableRotatedPillarBlock extends RotatedPillarBlock {
    public ModFlammableRotatedPillarBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ItemAbility itemAbility, boolean simulate) {

        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.RED_LOG)) {
                return ModBlocks.STRIPPED_RED_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }
        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.RED_WOOD)) {
                return ModBlocks.STRIPPED_RED_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.BLUE_LOG)) {
                return ModBlocks.STRIPPED_BLUE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }
        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.BLUE_WOOD)) {
                return ModBlocks.STRIPPED_BLUE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.GREEN_LOG)) {
                return ModBlocks.STRIPPED_GREEN_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }
        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.GREEN_WOOD)) {
                return ModBlocks.STRIPPED_GREEN_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.YELLOW_LOG)) {
                return ModBlocks.STRIPPED_YELLOW_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }
        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.YELLOW_WOOD)) {
                return ModBlocks.STRIPPED_YELLOW_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.PURPLE_LOG)) {
                return ModBlocks.STRIPPED_PURPLE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }
        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.PURPLE_WOOD)) {
                return ModBlocks.STRIPPED_PURPLE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.CYAN_LOG)) {
                return ModBlocks.STRIPPED_CYAN_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }
        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.CYAN_WOOD)) {
                return ModBlocks.STRIPPED_CYAN_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.ORANGE_LOG)) {
                return ModBlocks.STRIPPED_ORANGE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }
        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.ORANGE_WOOD)) {
                return ModBlocks.STRIPPED_ORANGE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.LIME_LOG)) {
                return ModBlocks.STRIPPED_LIME_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }
        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.LIME_WOOD)) {
                return ModBlocks.STRIPPED_LIME_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.PINK_LOG)) {
                return ModBlocks.STRIPPED_PINK_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }
        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.PINK_WOOD)) {
                return ModBlocks.STRIPPED_PINK_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.BROWN_LOG)) {
                return ModBlocks.STRIPPED_BROWN_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }
        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.BROWN_WOOD)) {
                return ModBlocks.STRIPPED_BROWN_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.BLACK_LOG)) {
                return ModBlocks.STRIPPED_BLACK_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }
        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.BLACK_WOOD)) {
                return ModBlocks.STRIPPED_BLACK_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.WHITE_LOG)) {
                return ModBlocks.STRIPPED_WHITE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }
        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.WHITE_WOOD)) {
                return ModBlocks.STRIPPED_WHITE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.GRAY_LOG)) {
                return ModBlocks.STRIPPED_GRAY_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }
        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.GRAY_WOOD)) {
                return ModBlocks.STRIPPED_GRAY_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.LIGHT_GRAY_LOG)) {
                return ModBlocks.STRIPPED_LIGHT_GRAY_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }
        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.LIGHT_GRAY_WOOD)) {
                return ModBlocks.STRIPPED_LIGHT_GRAY_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.LIGHT_BLUE_LOG)) {
                return ModBlocks.STRIPPED_LIGHT_BLUE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }
        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.LIGHT_BLUE_WOOD)) {
                return ModBlocks.STRIPPED_LIGHT_BLUE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.MAGENTA_LOG)) {
                return ModBlocks.STRIPPED_MAGENTA_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }
        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.MAGENTA_WOOD)) {
                return ModBlocks.STRIPPED_MAGENTA_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        return super.getToolModifiedState(state, context, itemAbility, simulate);
    }
}

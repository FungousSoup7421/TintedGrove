package net.fungoussoup.tintedgrove.block.custom;

import net.fungoussoup.tintedgrove.block.ModBlocks;
import net.fungoussoup.tintedgrove.util.TintedColor;
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
            for (TintedColor color : TintedColor.values()) {
                if (state.is(ModBlocks.getLog(color))) {
                    return ModBlocks.getStrippedLog(color).get()
                            .defaultBlockState()
                            .setValue(AXIS, state.getValue(AXIS));
                }

                if (state.is(ModBlocks.getWood(color))) {
                    return ModBlocks.getStrippedWood(color).get()
                            .defaultBlockState()
                            .setValue(AXIS, state.getValue(AXIS));
                }
            }
        }

        return super.getToolModifiedState(state, context, itemAbility, simulate);
    }
}
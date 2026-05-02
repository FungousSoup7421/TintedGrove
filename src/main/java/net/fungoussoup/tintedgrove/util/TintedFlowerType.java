package net.fungoussoup.tintedgrove.util;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public enum TintedFlowerType {
    DANDELION("dandelion", Blocks.DANDELION, Blocks.POTTED_DANDELION),
    POPPY("poppy", Blocks.POPPY, Blocks.POTTED_POPPY);

    private final String name;
    private final Block baseBlock;
    private final Block pottedBase;

    TintedFlowerType(String name, Block baseBlock, Block pottedBase) {
        this.name = name;
        this.baseBlock = baseBlock;
        this.pottedBase = pottedBase;
    }

    public String getName() {
        return name;
    }

    public Block getBaseBlock() {
        return baseBlock;
    }

    public Block getPottedBase() {
        return pottedBase;
    }
}
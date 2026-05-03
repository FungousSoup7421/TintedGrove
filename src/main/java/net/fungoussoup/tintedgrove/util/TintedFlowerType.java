package net.fungoussoup.tintedgrove.util;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public enum TintedFlowerType {
    DANDELION("dandelion", Blocks.DANDELION, Blocks.POTTED_DANDELION),
    POPPY("poppy", Blocks.POPPY, Blocks.POTTED_POPPY),
    TULIP("tulip", Blocks.WHITE_TULIP, Blocks.POTTED_WHITE_TULIP),
    ORCHID("orchid", Blocks.BLUE_ORCHID, Blocks.POTTED_BLUE_ORCHID),
    ALLIUM("allium", Blocks.ALLIUM, Blocks.POTTED_ALLIUM),
    AZURE_BLUET("azure_bluet", Blocks.AZURE_BLUET, Blocks.POTTED_AZURE_BLUET),
    OXEYE_DAISY("oxeye_daisy", Blocks.OXEYE_DAISY, Blocks.POTTED_OXEYE_DAISY),
    CORNFLOWER("cornflower", Blocks.CORNFLOWER, Blocks.POTTED_CORNFLOWER),
    LILY_OF_THE_VALLEY("lily_of_the_valley", Blocks.LILY_OF_THE_VALLEY, Blocks.POTTED_LILY_OF_THE_VALLEY);

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
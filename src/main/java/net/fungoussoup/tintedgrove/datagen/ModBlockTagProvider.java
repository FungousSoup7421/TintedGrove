package net.fungoussoup.tintedgrove.datagen;

import net.fungoussoup.tintedgrove.TintedGrove;
import net.fungoussoup.tintedgrove.block.ModBlocks;
import net.fungoussoup.tintedgrove.util.TintedColor;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output,
                               CompletableFuture<HolderLookup.Provider> lookupProvider,
                               @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TintedGrove.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        for (TintedColor color : TintedColor.values()) {
            addAxeMineable(color);
            addFenceTags(color);
            addBurnableLogs(color);
        }
    }

    private void addAxeMineable(TintedColor color) {
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.getLog(color).get())
                .add(ModBlocks.getWood(color).get())
                .add(ModBlocks.getStrippedWood(color).get())
                .add(ModBlocks.getStrippedLog(color).get())
                .add(ModBlocks.getPlanks(color).get())
                .add(ModBlocks.getWoodStairs(color).get())
                .add(ModBlocks.getWoodSlab(color).get())
                .add(ModBlocks.getWoodButton(color).get())
                .add(ModBlocks.getWoodPressurePlate(color).get())
                .add(ModBlocks.getWoodFence(color).get())
                .add(ModBlocks.getWoodFenceGate(color).get())
                .add(ModBlocks.getWoodDoor(color).get())
                .add(ModBlocks.getWoodTrapdoor(color).get());
    }

    private void addFenceTags(TintedColor color) {
        tag(BlockTags.FENCES)
                .add(ModBlocks.getWoodFence(color).get());

        tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.getWoodFenceGate(color).get());
    }

    private void addBurnableLogs(TintedColor color) {
        tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.getLog(color).get())
                .add(ModBlocks.getWood(color).get())
                .add(ModBlocks.getStrippedLog(color).get())
                .add(ModBlocks.getStrippedWood(color).get());
    }
}
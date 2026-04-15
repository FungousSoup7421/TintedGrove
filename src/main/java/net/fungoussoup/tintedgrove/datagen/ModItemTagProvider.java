package net.fungoussoup.tintedgrove.datagen;

import net.fungoussoup.tintedgrove.TintedGrove;
import net.fungoussoup.tintedgrove.block.ModBlocks;
import net.fungoussoup.tintedgrove.util.TintedColor;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output,
                              CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags,
                              @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, TintedGrove.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        for (TintedColor color : TintedColor.values()) {
            this.tag(ItemTags.LOGS_THAT_BURN)
                    .add(ModBlocks.getLog(color).asItem())
                    .add(ModBlocks.getWood(color).asItem())
                    .add(ModBlocks.getStrippedLog(color).asItem())
                    .add(ModBlocks.getStrippedWood(color).asItem());

            this.tag(ItemTags.PLANKS)
                    .add(ModBlocks.getPlank(color).asItem());
        }
    }
}
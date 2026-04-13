package net.fungoussoup.tintedgrove.datagen;

import net.fungoussoup.tintedgrove.TintedGrove;
import net.fungoussoup.tintedgrove.block.ModBlocks;
import net.fungoussoup.tintedgrove.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, TintedGrove.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.RED_LOG.asItem())
                .add(ModBlocks.RED_WOOD.asItem())
                .add(ModBlocks.BLUE_LOG.asItem())
                .add(ModBlocks.BLUE_WOOD.asItem())
                .add(ModBlocks.GREEN_LOG.asItem())
                .add(ModBlocks.GREEN_WOOD.asItem())
                .add(ModBlocks.YELLOW_LOG.asItem())
                .add(ModBlocks.YELLOW_WOOD.asItem())
                .add(ModBlocks.PURPLE_LOG.asItem())
                .add(ModBlocks.PURPLE_WOOD.asItem())
                .add(ModBlocks.CYAN_LOG.asItem())
                .add(ModBlocks.CYAN_WOOD.asItem())
                .add(ModBlocks.ORANGE_LOG.asItem())
                .add(ModBlocks.ORANGE_WOOD.asItem())
                .add(ModBlocks.LIME_LOG.asItem())
                .add(ModBlocks.LIME_WOOD.asItem())
                .add(ModBlocks.PINK_LOG.asItem())
                .add(ModBlocks.PINK_WOOD.asItem())
                .add(ModBlocks.BROWN_LOG.asItem())
                .add(ModBlocks.BROWN_WOOD.asItem())
                .add(ModBlocks.BLACK_LOG.asItem())
                .add(ModBlocks.BLACK_WOOD.asItem())
                .add(ModBlocks.WHITE_LOG.asItem())
                .add(ModBlocks.WHITE_WOOD.asItem())
                .add(ModBlocks.GRAY_LOG.asItem())
                .add(ModBlocks.GRAY_WOOD.asItem())
                .add(ModBlocks.LIGHT_GRAY_LOG.asItem())
                .add(ModBlocks.LIGHT_GRAY_WOOD.asItem())
                .add(ModBlocks.LIGHT_BLUE_LOG.asItem())
                .add(ModBlocks.LIGHT_BLUE_WOOD.asItem())
                .add(ModBlocks.MAGENTA_LOG.asItem())
                .add(ModBlocks.MAGENTA_WOOD.asItem())

                .add(ModBlocks.STRIPPED_RED_LOG.asItem())
                .add(ModBlocks.STRIPPED_RED_WOOD.asItem())
                .add(ModBlocks.STRIPPED_BLUE_LOG.asItem())
                .add(ModBlocks.STRIPPED_BLUE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_GREEN_LOG.asItem())
                .add(ModBlocks.STRIPPED_GREEN_WOOD.asItem())
                .add(ModBlocks.STRIPPED_YELLOW_LOG.asItem())
                .add(ModBlocks.STRIPPED_YELLOW_WOOD.asItem())
                .add(ModBlocks.STRIPPED_PURPLE_LOG.asItem())
                .add(ModBlocks.STRIPPED_PURPLE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_CYAN_LOG.asItem())
                .add(ModBlocks.STRIPPED_CYAN_WOOD.asItem())
                .add(ModBlocks.STRIPPED_ORANGE_LOG.asItem())
                .add(ModBlocks.STRIPPED_ORANGE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_LIME_LOG.asItem())
                .add(ModBlocks.STRIPPED_LIME_WOOD.asItem())
                .add(ModBlocks.STRIPPED_PINK_LOG.asItem())
                .add(ModBlocks.STRIPPED_PINK_WOOD.asItem())
                .add(ModBlocks.STRIPPED_BROWN_LOG.asItem())
                .add(ModBlocks.STRIPPED_BROWN_WOOD.asItem())
                .add(ModBlocks.STRIPPED_BLACK_LOG.asItem())
                .add(ModBlocks.STRIPPED_BLACK_WOOD.asItem())
                .add(ModBlocks.STRIPPED_WHITE_LOG.asItem())
                .add(ModBlocks.STRIPPED_WHITE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_GRAY_LOG.asItem())
                .add(ModBlocks.STRIPPED_GRAY_WOOD.asItem())
                .add(ModBlocks.STRIPPED_LIGHT_GRAY_LOG.asItem())
                .add(ModBlocks.STRIPPED_LIGHT_GRAY_WOOD.asItem())
                .add(ModBlocks.STRIPPED_LIGHT_BLUE_LOG.asItem())
                .add(ModBlocks.STRIPPED_LIGHT_BLUE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_MAGENTA_LOG.asItem())
                .add(ModBlocks.STRIPPED_MAGENTA_WOOD.asItem())

        ;

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.RED_PLANK.asItem())
                .add(ModBlocks.BLUE_PLANK.asItem())
                .add(ModBlocks.GREEN_PLANK.asItem())
                .add(ModBlocks.YELLOW_PLANK.asItem())
                .add(ModBlocks.PURPLE_PLANK.asItem())
                .add(ModBlocks.CYAN_PLANK.asItem())
                .add(ModBlocks.ORANGE_PLANK.asItem())
                .add(ModBlocks.LIME_PLANK.asItem())
                .add(ModBlocks.PINK_PLANK.asItem())
                .add(ModBlocks.BROWN_PLANK.asItem())
                .add(ModBlocks.BLACK_PLANK.asItem())
                .add(ModBlocks.WHITE_PLANK.asItem())
                .add(ModBlocks.GRAY_PLANK.asItem())
                .add(ModBlocks.LIGHT_GRAY_PLANK.asItem())
                .add(ModBlocks.LIGHT_BLUE_PLANK.asItem())
                .add(ModBlocks.MAGENTA_PLANK.asItem())

                ;
    }
}

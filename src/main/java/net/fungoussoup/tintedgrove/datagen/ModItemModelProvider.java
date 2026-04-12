package net.fungoussoup.tintedgrove.datagen;

import net.fungoussoup.tintedgrove.TintedGrove;
import net.fungoussoup.tintedgrove.block.ModBlocks;
import net.fungoussoup.tintedgrove.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TintedGrove.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.BISMUTH.get());
        basicItem(ModItems.RAW_BISMUTH.get());
        basicItem(ModItems.RUBY.get());

        buttonItem(ModBlocks.RED_WOOD_BUTTON, ModBlocks.RED_PLANK);
        fenceItem(ModBlocks.RED_WOOD_FENCE, ModBlocks.RED_PLANK);
        basicItem(ModBlocks.RED_WOOD_DOOR.asItem());

        buttonItem(ModBlocks.BLUE_WOOD_BUTTON, ModBlocks.BLUE_PLANK);
        fenceItem(ModBlocks.BLUE_WOOD_FENCE, ModBlocks.BLUE_PLANK);
        basicItem(ModBlocks.BLUE_WOOD_DOOR.asItem());

        buttonItem(ModBlocks.GREEN_WOOD_BUTTON, ModBlocks.GREEN_PLANK);
        fenceItem(ModBlocks.GREEN_WOOD_FENCE, ModBlocks.GREEN_PLANK);
        basicItem(ModBlocks.GREEN_WOOD_DOOR.asItem());

        buttonItem(ModBlocks.YELLOW_WOOD_BUTTON, ModBlocks.YELLOW_PLANK);
        fenceItem(ModBlocks.YELLOW_WOOD_FENCE, ModBlocks.YELLOW_PLANK);
        basicItem(ModBlocks.YELLOW_WOOD_DOOR.asItem());

        buttonItem(ModBlocks.PURPLE_WOOD_BUTTON, ModBlocks.PURPLE_PLANK);
        fenceItem(ModBlocks.PURPLE_WOOD_FENCE, ModBlocks.PURPLE_PLANK);
        basicItem(ModBlocks.PURPLE_WOOD_DOOR.asItem());

        buttonItem(ModBlocks.CYAN_WOOD_BUTTON, ModBlocks.CYAN_PLANK);
        fenceItem(ModBlocks.CYAN_WOOD_FENCE, ModBlocks.CYAN_PLANK);
        basicItem(ModBlocks.CYAN_WOOD_DOOR.asItem());

        buttonItem(ModBlocks.ORANGE_WOOD_BUTTON, ModBlocks.ORANGE_PLANK);
        fenceItem(ModBlocks.ORANGE_WOOD_FENCE, ModBlocks.ORANGE_PLANK);
        basicItem(ModBlocks.ORANGE_WOOD_DOOR.asItem());

        buttonItem(ModBlocks.LIME_WOOD_BUTTON, ModBlocks.LIME_PLANK);
        fenceItem(ModBlocks.LIME_WOOD_FENCE, ModBlocks.LIME_PLANK);
        basicItem(ModBlocks.LIME_WOOD_DOOR.asItem());

        buttonItem(ModBlocks.PINK_WOOD_BUTTON, ModBlocks.PINK_PLANK);
        fenceItem(ModBlocks.PINK_WOOD_FENCE, ModBlocks.PINK_PLANK);
        basicItem(ModBlocks.PINK_WOOD_DOOR.asItem());

        buttonItem(ModBlocks.BROWN_WOOD_BUTTON, ModBlocks.BROWN_PLANK);
        fenceItem(ModBlocks.BROWN_WOOD_FENCE, ModBlocks.BROWN_PLANK);
        basicItem(ModBlocks.BROWN_WOOD_DOOR.asItem());

        buttonItem(ModBlocks.BLACK_WOOD_BUTTON, ModBlocks.BLACK_PLANK);
        fenceItem(ModBlocks.BLACK_WOOD_FENCE, ModBlocks.BLACK_PLANK);
        basicItem(ModBlocks.BLACK_WOOD_DOOR.asItem());

        buttonItem(ModBlocks.WHITE_WOOD_BUTTON, ModBlocks.WHITE_PLANK);
        fenceItem(ModBlocks.WHITE_WOOD_FENCE, ModBlocks.WHITE_PLANK);
        basicItem(ModBlocks.WHITE_WOOD_DOOR.asItem());

        buttonItem(ModBlocks.GRAY_WOOD_BUTTON, ModBlocks.GRAY_PLANK);
        fenceItem(ModBlocks.GRAY_WOOD_FENCE, ModBlocks.GRAY_PLANK);
        basicItem(ModBlocks.GRAY_WOOD_DOOR.asItem());

        buttonItem(ModBlocks.LIGHT_GRAY_WOOD_BUTTON, ModBlocks.LIGHT_GRAY_PLANK);
        fenceItem(ModBlocks.LIGHT_GRAY_WOOD_FENCE, ModBlocks.LIGHT_GRAY_PLANK);
        basicItem(ModBlocks.LIGHT_GRAY_WOOD_DOOR.asItem());

        buttonItem(ModBlocks.LIGHT_BLUE_WOOD_BUTTON, ModBlocks.LIGHT_BLUE_PLANK);
        fenceItem(ModBlocks.LIGHT_BLUE_WOOD_FENCE, ModBlocks.LIGHT_BLUE_PLANK);
        basicItem(ModBlocks.LIGHT_BLUE_WOOD_DOOR.asItem());

        buttonItem(ModBlocks.MAGENTA_WOOD_BUTTON, ModBlocks.MAGENTA_PLANK);
        fenceItem(ModBlocks.MAGENTA_WOOD_FENCE, ModBlocks.MAGENTA_PLANK);
        basicItem(ModBlocks.MAGENTA_WOOD_DOOR.asItem());

    }

    public void buttonItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(TintedGrove.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void fenceItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(TintedGrove.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }
}
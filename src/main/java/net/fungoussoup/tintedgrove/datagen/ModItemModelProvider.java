package net.fungoussoup.tintedgrove.datagen;

import net.fungoussoup.tintedgrove.TintedGrove;
import net.fungoussoup.tintedgrove.block.ModBlocks;
import net.fungoussoup.tintedgrove.item.ModItems;
import net.fungoussoup.tintedgrove.util.TintedColor;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TintedGrove.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // basicItem(ModItems.BISMUTH.get());

        for (TintedColor color : TintedColor.values()) {
            buttonItem(ModBlocks.getWoodButton(color), ModBlocks.getPlanks(color));
            fenceItem(ModBlocks.getWoodFence(color), ModBlocks.getPlanks(color));
            basicItem(ModBlocks.getWoodDoor(color).asItem());

            saplingItem(ModBlocks.getSapling(color));
        }
    }

    private ItemModelBuilder saplingItem(DeferredBlock<?> item) {
        return withExistingParent(item.getId().getPath(), "item/generated")
                .texture("layer0",
                        ResourceLocation.fromNamespaceAndPath(TintedGrove.MOD_ID,
                                "block/" + item.getId().getPath()));
    }

    public void buttonItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture",
                        ResourceLocation.fromNamespaceAndPath(TintedGrove.MOD_ID,
                                "block/" + baseBlock.getId().getPath()));
    }

    public void fenceItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",
                        ResourceLocation.fromNamespaceAndPath(TintedGrove.MOD_ID,
                                "block/" + baseBlock.getId().getPath()));
    }
}
package net.fungoussoup.tintedgrove.datagen;

import net.fungoussoup.tintedgrove.TintedGrove;
import net.fungoussoup.tintedgrove.block.ModBlocks;
import net.fungoussoup.tintedgrove.item.ModItems;
import net.fungoussoup.tintedgrove.util.TintedColor;
import net.fungoussoup.tintedgrove.util.TintedFlowerType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TintedGrove.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.TINTER.get());

        basicItem(ModItems.PALE_BLUE.get());
        basicItem(ModItems.PALE_BROWN.get());
        basicItem(ModItems.PALE_CYAN.get());
        basicItem(ModItems.PALE_GREEN.get());
        basicItem(ModItems.PALE_LIME.get());
        basicItem(ModItems.PALE_LIGHT_BLUE.get());
        basicItem(ModItems.PALE_MAGENTA.get());
        basicItem(ModItems.PALE_PINK.get());
        basicItem(ModItems.PALE_PURPLE.get());
        basicItem(ModItems.PALE_ORANGE.get());
        basicItem(ModItems.PALE_RED.get());
        basicItem(ModItems.PALE_YELLOW.get());

        for (TintedFlowerType type : TintedFlowerType.values()) {
            for (TintedColor color : TintedColor.values()) {
                flowerItem(ModBlocks.FLOWERS.get(type).get(color));
            }
        }

        for (TintedColor color : TintedColor.values()) {
            buttonItem(ModBlocks.getWoodButton(color), ModBlocks.getPlanks(color));
            fenceItem(ModBlocks.getWoodFence(color), ModBlocks.getPlanks(color));
            basicItem(ModBlocks.getWoodDoor(color).asItem());

            saplingItem(ModBlocks.getSapling(color));

            basicItem(ModBlocks.getGlassDoor(color).asItem());
            translucentItem(ModBlocks.getWhiteGlassDoor(color).asItem());
            translucentItem(ModBlocks.getOrangeGlassDoor(color).asItem());
            translucentItem(ModBlocks.getMagentaGlassDoor(color).asItem());
            translucentItem(ModBlocks.getLightBlueGlassDoor(color).asItem());
            translucentItem(ModBlocks.getYellowGlassDoor(color).asItem());
            translucentItem(ModBlocks.getLimeGlassDoor(color).asItem());
            translucentItem(ModBlocks.getPinkGlassDoor(color).asItem());
            translucentItem(ModBlocks.getGrayGlassDoor(color).asItem());
            translucentItem(ModBlocks.getLightGrayGlassDoor(color).asItem());
            translucentItem(ModBlocks.getCyanGlassDoor(color).asItem());
            translucentItem(ModBlocks.getPurpleGlassDoor(color).asItem());
            translucentItem(ModBlocks.getBlueGlassDoor(color).asItem());
            translucentItem(ModBlocks.getBrownGlassDoor(color).asItem());
            translucentItem(ModBlocks.getGreenGlassDoor(color).asItem());
            translucentItem(ModBlocks.getRedGlassDoor(color).asItem());
            translucentItem(ModBlocks.getBlackGlassDoor(color).asItem());

            translucentItem(ModBlocks.getGlassWindowDoor(color).asItem());
            translucentItem(ModBlocks.getWhiteGlassWindowDoor(color).asItem());
            translucentItem(ModBlocks.getOrangeGlassWindowDoor(color).asItem());
            translucentItem(ModBlocks.getMagentaGlassWindowDoor(color).asItem());
            translucentItem(ModBlocks.getLightBlueGlassWindowDoor(color).asItem());
            translucentItem(ModBlocks.getYellowGlassWindowDoor(color).asItem());
            translucentItem(ModBlocks.getLimeGlassWindowDoor(color).asItem());
            translucentItem(ModBlocks.getPinkGlassWindowDoor(color).asItem());
            translucentItem(ModBlocks.getGrayGlassWindowDoor(color).asItem());
            translucentItem(ModBlocks.getLightGrayGlassWindowDoor(color).asItem());
            translucentItem(ModBlocks.getCyanGlassWindowDoor(color).asItem());
            translucentItem(ModBlocks.getPurpleGlassWindowDoor(color).asItem());
            translucentItem(ModBlocks.getBlueGlassWindowDoor(color).asItem());
            translucentItem(ModBlocks.getBrownGlassWindowDoor(color).asItem());
            translucentItem(ModBlocks.getGreenGlassWindowDoor(color).asItem());
            translucentItem(ModBlocks.getRedGlassWindowDoor(color).asItem());
            translucentItem(ModBlocks.getBlackGlassWindowDoor(color).asItem());

            translucentItem(ModBlocks.getLeftGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getLeftWhiteGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getLeftOrangeGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getLeftMagentaGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getLeftLightBlueGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getLeftYellowGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getLeftLimeGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getLeftPinkGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getLeftGrayGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getLeftLightGrayGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getLeftCyanGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getLeftPurpleGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getLeftBlueGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getLeftBrownGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getLeftGreenGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getLeftRedGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getLeftBlackGlassPanelDoor(color).asItem());

            translucentItem(ModBlocks.getRightGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getRightWhiteGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getRightOrangeGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getRightMagentaGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getRightLightBlueGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getRightYellowGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getRightLimeGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getRightPinkGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getRightGrayGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getRightLightGrayGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getRightCyanGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getRightPurpleGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getRightBlueGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getRightBrownGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getRightGreenGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getRightRedGlassPanelDoor(color).asItem());
            translucentItem(ModBlocks.getRightBlackGlassPanelDoor(color).asItem());
        }
    }

    private void translucentItem(Item item) {
        ResourceLocation id = BuiltInRegistries.ITEM.getKey(item);

        getBuilder(id.getPath())
                .parent(new ModelFile.UncheckedModelFile("minecraft:item/generated"))
                .renderType("translucent")
                .texture("layer0", modLoc("item/" + id.getPath()));
    }
    
    public void flowerItem(DeferredBlock<Block> block) {
        this.withExistingParent(block.getId().getPath(), mcLoc("item/generated"))
                .texture("layer0", ResourceLocation.fromNamespaceAndPath(TintedGrove.MOD_ID,
                                "block/" + block.getId().getPath()));
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
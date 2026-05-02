package net.fungoussoup.tintedgrove.datagen;

import net.fungoussoup.tintedgrove.TintedGrove;
import net.fungoussoup.tintedgrove.block.ModBlocks;
import net.fungoussoup.tintedgrove.util.TintedColor;
import net.fungoussoup.tintedgrove.util.TintedFlowerType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TintedGrove.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        for (TintedColor color : TintedColor.values()) {
            registerWoodSet(color);
            registerTreeSet(color);
        }

        for (TintedFlowerType type : TintedFlowerType.values()) {
            for (TintedColor color : TintedColor.values()) {

                Block flower = ModBlocks.FLOWERS.get(type).get(color).get();
                Block potted = ModBlocks.POTTED_FLOWERS.get(type).get(color).get();

                // Normal flower (cross model)
                simpleBlock(flower,
                        models().cross(
                                BuiltInRegistries.BLOCK.getKey(flower).getPath(),
                                blockTexture(flower)
                        ).renderType("cutout"));

                // Potted flower
                simpleBlock(potted,
                        models().singleTexture(
                                BuiltInRegistries.BLOCK.getKey(potted).getPath(),
                                ResourceLocation.parse("minecraft:block/flower_pot_cross"),
                                "plant",
                                blockTexture(flower)
                        ).renderType("cutout"));
            }
        }
    }

    private void registerWoodSet(TintedColor color) {
        logBlock((RotatedPillarBlock) ModBlocks.getLog(color).get());
        logBlock((RotatedPillarBlock) ModBlocks.getStrippedLog(color).get());

        axisBlock((RotatedPillarBlock) ModBlocks.getWood(color).get(),
                blockTexture(ModBlocks.getLog(color).get()),
                blockTexture(ModBlocks.getLog(color).get()));

        axisBlock((RotatedPillarBlock) ModBlocks.getStrippedWood(color).get(),
                blockTexture(ModBlocks.getStrippedLog(color).get()),
                blockTexture(ModBlocks.getStrippedLog(color).get()));

        blockItem(ModBlocks.getLog(color));
        blockItem(ModBlocks.getWood(color));
        blockItem(ModBlocks.getStrippedLog(color));
        blockItem(ModBlocks.getStrippedWood(color));

        blockWithItem(ModBlocks.getPlanks(color));

        stairsBlock(ModBlocks.getWoodStairs(color).get(), blockTexture(ModBlocks.getPlanks(color).get()));
        slabBlock(ModBlocks.getWoodSlab(color).get(),
                blockTexture(ModBlocks.getPlanks(color).get()),
                blockTexture(ModBlocks.getPlanks(color).get()));

        buttonBlock(ModBlocks.getWoodButton(color).get(), blockTexture(ModBlocks.getPlanks(color).get()));
        pressurePlateBlock(ModBlocks.getWoodPressurePlate(color).get(), blockTexture(ModBlocks.getPlanks(color).get()));
        fenceBlock(ModBlocks.getWoodFence(color).get(), blockTexture(ModBlocks.getPlanks(color).get()));
        fenceGateBlock(ModBlocks.getWoodFenceGate(color).get(), blockTexture(ModBlocks.getPlanks(color).get()));

        doorBlockWithRenderType(
                ModBlocks.getWoodDoor(color).get(),
                modLoc("block/" + color.blockName("wood_door_bottom")),
                modLoc("block/" + color.blockName("wood_door_top")),
                "cutout"
        );

        trapdoorBlockWithRenderType(
                ModBlocks.getWoodTrapdoor(color).get(),
                modLoc("block/" + color.blockName("wood_trapdoor")),
                true,
                "cutout"
        );

        blockItem(ModBlocks.getWoodStairs(color));
        blockItem(ModBlocks.getWoodSlab(color));
        blockItem(ModBlocks.getWoodPressurePlate(color));
        blockItem(ModBlocks.getWoodFenceGate(color));
        blockItem(ModBlocks.getWoodTrapdoor(color), "_bottom");
    }

    private void registerTreeSet(TintedColor color) {
        leavesBlock(ModBlocks.getLeaves(color));
        saplingBlock(ModBlocks.getSapling(color));
    }

    private void saplingBlock(DeferredBlock<SaplingBlock> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(
                        BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(),
                        blockTexture(blockRegistryObject.get())
                ).renderType("cutout"));
    }

    private void leavesBlock(DeferredBlock<LeavesBlock> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(
                        BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(),
                        ResourceLocation.parse("minecraft:block/leaves"),
                        "all",
                        blockTexture(blockRegistryObject.get())
                ).renderType("cutout"));
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(),
                new ModelFile.UncheckedModelFile("tintedgrove:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(),
                new ModelFile.UncheckedModelFile("tintedgrove:block/" + deferredBlock.getId().getPath() + appendix));
    }
}
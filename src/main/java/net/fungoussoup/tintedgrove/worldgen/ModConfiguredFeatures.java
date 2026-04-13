package net.fungoussoup.tintedgrove.worldgen;

import net.fungoussoup.tintedgrove.TintedGrove;
import net.fungoussoup.tintedgrove.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_WOOD_KEY = registerKey("red_wood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE_WOOD_KEY = registerKey("blue_wood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GREEN_WOOD_KEY = registerKey("green_wood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> YELLOW_WOOD_KEY = registerKey("yellow_wood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_WOOD_KEY = registerKey("purple_wood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CYAN_WOOD_KEY = registerKey("cyan_wood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORANGE_WOOD_KEY = registerKey("orange_wood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LIME_WOOD_KEY = registerKey("lime_wood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_WOOD_KEY = registerKey("pink_wood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BROWN_WOOD_KEY = registerKey("brown_wood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_WOOD_KEY = registerKey("black_wood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_WOOD_KEY = registerKey("white_wood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRAY_WOOD_KEY = registerKey("gray_wood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LIGHT_GRAY_WOOD_KEY = registerKey("light_gray_wood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LIGHT_BLUE_WOOD_KEY = registerKey("light_blue_wood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAGENTA_WOOD_KEY = registerKey("magenta_wood");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {

        register(context, RED_WOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.RED_LOG.get()),
                new StraightTrunkPlacer(4,2,0),
                BlockStateProvider.simple(ModBlocks.RED_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0),3),
                new TwoLayersFeatureSize(1,0,1)).build());

        register(context, BLUE_WOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.BLUE_LOG.get()),
                new StraightTrunkPlacer(4,2,0),
                BlockStateProvider.simple(ModBlocks.BLUE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0),3),
                new TwoLayersFeatureSize(1,0,1)).build());

        register(context, GREEN_WOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.GREEN_LOG.get()),
                new StraightTrunkPlacer(4,2,0),
                BlockStateProvider.simple(ModBlocks.GREEN_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0),3),
                new TwoLayersFeatureSize(1,0,1)).build());

        register(context, YELLOW_WOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.YELLOW_LOG.get()),
                new StraightTrunkPlacer(4,2,0),
                BlockStateProvider.simple(ModBlocks.YELLOW_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0),3),
                new TwoLayersFeatureSize(1,0,1)).build());

        register(context, PURPLE_WOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PURPLE_LOG.get()),
                new StraightTrunkPlacer(4,2,0),
                BlockStateProvider.simple(ModBlocks.PURPLE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0),3),
                new TwoLayersFeatureSize(1,0,1)).build());

        register(context, CYAN_WOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CYAN_LOG.get()),
                new StraightTrunkPlacer(4,2,0),
                BlockStateProvider.simple(ModBlocks.CYAN_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0),3),
                new TwoLayersFeatureSize(1,0,1)).build());

        register(context, ORANGE_WOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.ORANGE_LOG.get()),
                new StraightTrunkPlacer(4,2,0),
                BlockStateProvider.simple(ModBlocks.ORANGE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0),3),
                new TwoLayersFeatureSize(1,0,1)).build());

        register(context, LIME_WOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.LIME_LOG.get()),
                new StraightTrunkPlacer(4,2,0),
                BlockStateProvider.simple(ModBlocks.LIME_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0),3),
                new TwoLayersFeatureSize(1,0,1)).build());

        register(context, PINK_WOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PINK_LOG.get()),
                new StraightTrunkPlacer(4,2,0),
                BlockStateProvider.simple(ModBlocks.PINK_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0),3),
                new TwoLayersFeatureSize(1,0,1)).build());

        register(context, BROWN_WOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.BROWN_LOG.get()),
                new StraightTrunkPlacer(4,2,0),
                BlockStateProvider.simple(ModBlocks.BROWN_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0),3),
                new TwoLayersFeatureSize(1,0,1)).build());

        register(context, BLACK_WOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.BLACK_LOG.get()),
                new StraightTrunkPlacer(4,2,0),
                BlockStateProvider.simple(ModBlocks.BLACK_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0),3),
                new TwoLayersFeatureSize(1,0,1)).build());

        register(context, WHITE_WOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.WHITE_LOG.get()),
                new StraightTrunkPlacer(4,2,0),
                BlockStateProvider.simple(ModBlocks.WHITE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0),3),
                new TwoLayersFeatureSize(1,0,1)).build());

        register(context, GRAY_WOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.GRAY_LOG.get()),
                new StraightTrunkPlacer(4,2,0),
                BlockStateProvider.simple(ModBlocks.GRAY_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0),3),
                new TwoLayersFeatureSize(1,0,1)).build());

        register(context, LIGHT_GRAY_WOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.LIGHT_GRAY_LOG.get()),
                new StraightTrunkPlacer(4,2,0),
                BlockStateProvider.simple(ModBlocks.LIGHT_GRAY_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0),3),
                new TwoLayersFeatureSize(1,0,1)).build());

        register(context, LIGHT_BLUE_WOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.LIGHT_BLUE_LOG.get()),
                new StraightTrunkPlacer(4,2,0),
                BlockStateProvider.simple(ModBlocks.LIGHT_BLUE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0),3),
                new TwoLayersFeatureSize(1,0,1)).build());

        register(context, MAGENTA_WOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.MAGENTA_LOG.get()),
                new StraightTrunkPlacer(4,2,0),
                BlockStateProvider.simple(ModBlocks.MAGENTA_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0),3),
                new TwoLayersFeatureSize(1,0,1)).build());
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(TintedGrove.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}

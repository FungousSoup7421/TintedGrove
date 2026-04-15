package net.fungoussoup.tintedgrove.worldgen;

import net.fungoussoup.tintedgrove.TintedGrove;
import net.fungoussoup.tintedgrove.block.ModBlocks;
import net.fungoussoup.tintedgrove.util.TintedColor;
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

import java.util.EnumMap;
import java.util.Map;

public class ModConfiguredFeatures {

    public static final Map<TintedColor, ResourceKey<ConfiguredFeature<?, ?>>> WOOD_KEYS =
            new EnumMap<>(TintedColor.class);

    static {
        for (TintedColor color : TintedColor.values()) {
            WOOD_KEYS.put(color, registerKey(color.getId() + "_wood"));
        }
    }

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        for (TintedColor color : TintedColor.values()) {
            registerColoredTree(context, color);
        }
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> getWoodKey(TintedColor color) {
        return WOOD_KEYS.get(color);
    }

    private static void registerColoredTree(BootstrapContext<ConfiguredFeature<?, ?>> context, TintedColor color) {
        register(context, getWoodKey(color), Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.getLog(color).get()),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(ModBlocks.getLeaves(color).get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)
        ).build());
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(
                Registries.CONFIGURED_FEATURE,
                ResourceLocation.fromNamespaceAndPath(TintedGrove.MOD_ID, name)
        );
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(
            BootstrapContext<ConfiguredFeature<?, ?>> context,
            ResourceKey<ConfiguredFeature<?, ?>> key,
            F feature,
            FC configuration
    ) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
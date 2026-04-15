package net.fungoussoup.tintedgrove.worldgen.tree;

import net.fungoussoup.tintedgrove.TintedGrove;
import net.fungoussoup.tintedgrove.util.TintedColor;
import net.fungoussoup.tintedgrove.worldgen.ModConfiguredFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import java.util.EnumMap;
import java.util.Map;
import java.util.Optional;

public class ModTreeGrowers {

    public static final Map<TintedColor, TreeGrower> TREE_GROWERS = new EnumMap<>(TintedColor.class);

    static {
        for (TintedColor color : TintedColor.values()) {
            ResourceKey<ConfiguredFeature<?, ?>> key = ModConfiguredFeatures.getWoodKey(color);

            TREE_GROWERS.put(color, new TreeGrower(
                    TintedGrove.MOD_ID + ":" + color.getId() + "_wood",
                    Optional.empty(),
                    Optional.of(key),
                    Optional.empty()
            ));
        }
    }

    public static TreeGrower getTreeGrower(TintedColor color) {
        return TREE_GROWERS.get(color);
    }
}
package net.fungoussoup.tintedgrove.item;

import net.fungoussoup.tintedgrove.TintedGrove;
import net.fungoussoup.tintedgrove.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TintedGrove.MOD_ID);

    public static final Supplier<CreativeModeTab> TINTED_GROVE_TAB = CREATIVE_MODE_TAB.register("tinted_grove_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.CYAN_LOG.get()))
                    .title(Component.translatable("creativetab.tintedgrove.tinted_grove"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.RED_LOG);
                        output.accept(ModBlocks.RED_WOOD);
                        output.accept(ModBlocks.STRIPPED_RED_LOG);
                        output.accept(ModBlocks.STRIPPED_RED_WOOD);
                        output.accept(ModBlocks.RED_PLANK);
                        output.accept(ModBlocks.RED_WOOD_STAIRS);
                        output.accept(ModBlocks.RED_WOOD_SLAB);
                        output.accept(ModBlocks.RED_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.RED_WOOD_BUTTON);
                        output.accept(ModBlocks.RED_WOOD_FENCE);
                        output.accept(ModBlocks.RED_WOOD_FENCE_GATE);
                        output.accept(ModBlocks.RED_WOOD_DOOR);
                        output.accept(ModBlocks.RED_WOOD_TRAPDOOR);

                        output.accept(ModBlocks.BLUE_LOG);
                        output.accept(ModBlocks.BLUE_WOOD);
                        output.accept(ModBlocks.STRIPPED_BLUE_LOG);
                        output.accept(ModBlocks.STRIPPED_BLUE_WOOD);
                        output.accept(ModBlocks.BLUE_PLANK);
                        output.accept(ModBlocks.BLUE_WOOD_STAIRS);
                        output.accept(ModBlocks.BLUE_WOOD_SLAB);
                        output.accept(ModBlocks.BLUE_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.BLUE_WOOD_BUTTON);
                        output.accept(ModBlocks.BLUE_WOOD_FENCE);
                        output.accept(ModBlocks.BLUE_WOOD_FENCE_GATE);
                        output.accept(ModBlocks.BLUE_WOOD_DOOR);
                        output.accept(ModBlocks.BLUE_WOOD_TRAPDOOR);

                        output.accept(ModBlocks.GREEN_LOG);
                        output.accept(ModBlocks.GREEN_WOOD);
                        output.accept(ModBlocks.STRIPPED_GREEN_LOG);
                        output.accept(ModBlocks.STRIPPED_GREEN_WOOD);
                        output.accept(ModBlocks.GREEN_PLANK);
                        output.accept(ModBlocks.GREEN_WOOD_STAIRS);
                        output.accept(ModBlocks.GREEN_WOOD_SLAB);
                        output.accept(ModBlocks.GREEN_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.GREEN_WOOD_BUTTON);
                        output.accept(ModBlocks.GREEN_WOOD_FENCE);
                        output.accept(ModBlocks.GREEN_WOOD_FENCE_GATE);
                        output.accept(ModBlocks.GREEN_WOOD_DOOR);
                        output.accept(ModBlocks.GREEN_WOOD_TRAPDOOR);

                        output.accept(ModBlocks.YELLOW_LOG);
                        output.accept(ModBlocks.YELLOW_WOOD);
                        output.accept(ModBlocks.STRIPPED_YELLOW_LOG);
                        output.accept(ModBlocks.STRIPPED_YELLOW_WOOD);
                        output.accept(ModBlocks.YELLOW_PLANK);
                        output.accept(ModBlocks.YELLOW_WOOD_STAIRS);
                        output.accept(ModBlocks.YELLOW_WOOD_SLAB);
                        output.accept(ModBlocks.YELLOW_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.YELLOW_WOOD_BUTTON);
                        output.accept(ModBlocks.YELLOW_WOOD_FENCE);
                        output.accept(ModBlocks.YELLOW_WOOD_FENCE_GATE);
                        output.accept(ModBlocks.YELLOW_WOOD_DOOR);
                        output.accept(ModBlocks.YELLOW_WOOD_TRAPDOOR);

                        output.accept(ModBlocks.PURPLE_LOG);
                        output.accept(ModBlocks.PURPLE_WOOD);
                        output.accept(ModBlocks.STRIPPED_PURPLE_LOG);
                        output.accept(ModBlocks.STRIPPED_PURPLE_WOOD);
                        output.accept(ModBlocks.PURPLE_PLANK);
                        output.accept(ModBlocks.PURPLE_WOOD_STAIRS);
                        output.accept(ModBlocks.PURPLE_WOOD_SLAB);
                        output.accept(ModBlocks.PURPLE_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.PURPLE_WOOD_BUTTON);
                        output.accept(ModBlocks.PURPLE_WOOD_FENCE);
                        output.accept(ModBlocks.PURPLE_WOOD_FENCE_GATE);
                        output.accept(ModBlocks.PURPLE_WOOD_DOOR);
                        output.accept(ModBlocks.PURPLE_WOOD_TRAPDOOR);

                        output.accept(ModBlocks.CYAN_LOG);
                        output.accept(ModBlocks.CYAN_WOOD);
                        output.accept(ModBlocks.STRIPPED_CYAN_LOG);
                        output.accept(ModBlocks.STRIPPED_CYAN_WOOD);
                        output.accept(ModBlocks.CYAN_PLANK);
                        output.accept(ModBlocks.CYAN_WOOD_STAIRS);
                        output.accept(ModBlocks.CYAN_WOOD_SLAB);
                        output.accept(ModBlocks.CYAN_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.CYAN_WOOD_BUTTON);
                        output.accept(ModBlocks.CYAN_WOOD_FENCE);
                        output.accept(ModBlocks.CYAN_WOOD_FENCE_GATE);
                        output.accept(ModBlocks.CYAN_WOOD_DOOR);
                        output.accept(ModBlocks.CYAN_WOOD_TRAPDOOR);

                        output.accept(ModBlocks.ORANGE_LOG);
                        output.accept(ModBlocks.ORANGE_WOOD);
                        output.accept(ModBlocks.STRIPPED_ORANGE_LOG);
                        output.accept(ModBlocks.STRIPPED_ORANGE_WOOD);
                        output.accept(ModBlocks.ORANGE_PLANK);
                        output.accept(ModBlocks.ORANGE_WOOD_STAIRS);
                        output.accept(ModBlocks.ORANGE_WOOD_SLAB);
                        output.accept(ModBlocks.ORANGE_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.ORANGE_WOOD_BUTTON);
                        output.accept(ModBlocks.ORANGE_WOOD_FENCE);
                        output.accept(ModBlocks.ORANGE_WOOD_FENCE_GATE);
                        output.accept(ModBlocks.ORANGE_WOOD_DOOR);
                        output.accept(ModBlocks.ORANGE_WOOD_TRAPDOOR);

                        output.accept(ModBlocks.LIME_LOG);
                        output.accept(ModBlocks.LIME_WOOD);
                        output.accept(ModBlocks.STRIPPED_LIME_LOG);
                        output.accept(ModBlocks.STRIPPED_LIME_WOOD);
                        output.accept(ModBlocks.LIME_PLANK);
                        output.accept(ModBlocks.LIME_WOOD_STAIRS);
                        output.accept(ModBlocks.LIME_WOOD_SLAB);
                        output.accept(ModBlocks.LIME_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.LIME_WOOD_BUTTON);
                        output.accept(ModBlocks.LIME_WOOD_FENCE);
                        output.accept(ModBlocks.LIME_WOOD_FENCE_GATE);
                        output.accept(ModBlocks.LIME_WOOD_DOOR);
                        output.accept(ModBlocks.LIME_WOOD_TRAPDOOR);

                        output.accept(ModBlocks.PINK_LOG);
                        output.accept(ModBlocks.PINK_WOOD);
                        output.accept(ModBlocks.STRIPPED_PINK_LOG);
                        output.accept(ModBlocks.STRIPPED_PINK_WOOD);
                        output.accept(ModBlocks.PINK_PLANK);
                        output.accept(ModBlocks.PINK_WOOD_STAIRS);
                        output.accept(ModBlocks.PINK_WOOD_SLAB);
                        output.accept(ModBlocks.PINK_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.PINK_WOOD_BUTTON);
                        output.accept(ModBlocks.PINK_WOOD_FENCE);
                        output.accept(ModBlocks.PINK_WOOD_FENCE_GATE);
                        output.accept(ModBlocks.PINK_WOOD_DOOR);
                        output.accept(ModBlocks.PINK_WOOD_TRAPDOOR);

                        output.accept(ModBlocks.BROWN_LOG);
                        output.accept(ModBlocks.BROWN_WOOD);
                        output.accept(ModBlocks.STRIPPED_BROWN_LOG);
                        output.accept(ModBlocks.STRIPPED_BROWN_WOOD);
                        output.accept(ModBlocks.BROWN_PLANK);
                        output.accept(ModBlocks.BROWN_WOOD_STAIRS);
                        output.accept(ModBlocks.BROWN_WOOD_SLAB);
                        output.accept(ModBlocks.BROWN_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.BROWN_WOOD_BUTTON);
                        output.accept(ModBlocks.BROWN_WOOD_FENCE);
                        output.accept(ModBlocks.BROWN_WOOD_FENCE_GATE);
                        output.accept(ModBlocks.BROWN_WOOD_DOOR);
                        output.accept(ModBlocks.BROWN_WOOD_TRAPDOOR);

                        output.accept(ModBlocks.BLACK_LOG);
                        output.accept(ModBlocks.BLACK_WOOD);
                        output.accept(ModBlocks.STRIPPED_BLACK_LOG);
                        output.accept(ModBlocks.STRIPPED_BLACK_WOOD);
                        output.accept(ModBlocks.BLACK_PLANK);
                        output.accept(ModBlocks.BLACK_WOOD_STAIRS);
                        output.accept(ModBlocks.BLACK_WOOD_SLAB);
                        output.accept(ModBlocks.BLACK_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.BLACK_WOOD_BUTTON);
                        output.accept(ModBlocks.BLACK_WOOD_FENCE);
                        output.accept(ModBlocks.BLACK_WOOD_FENCE_GATE);
                        output.accept(ModBlocks.BLACK_WOOD_DOOR);
                        output.accept(ModBlocks.BLACK_WOOD_TRAPDOOR);

                        output.accept(ModBlocks.WHITE_LOG);
                        output.accept(ModBlocks.WHITE_WOOD);
                        output.accept(ModBlocks.STRIPPED_WHITE_LOG);
                        output.accept(ModBlocks.STRIPPED_WHITE_WOOD);
                        output.accept(ModBlocks.WHITE_PLANK);
                        output.accept(ModBlocks.WHITE_WOOD_STAIRS);
                        output.accept(ModBlocks.WHITE_WOOD_SLAB);
                        output.accept(ModBlocks.WHITE_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.WHITE_WOOD_BUTTON);
                        output.accept(ModBlocks.WHITE_WOOD_FENCE);
                        output.accept(ModBlocks.WHITE_WOOD_FENCE_GATE);
                        output.accept(ModBlocks.WHITE_WOOD_DOOR);
                        output.accept(ModBlocks.WHITE_WOOD_TRAPDOOR);

                        output.accept(ModBlocks.GRAY_LOG);
                        output.accept(ModBlocks.GRAY_WOOD);
                        output.accept(ModBlocks.STRIPPED_GRAY_LOG);
                        output.accept(ModBlocks.STRIPPED_GRAY_WOOD);
                        output.accept(ModBlocks.GRAY_PLANK);
                        output.accept(ModBlocks.GRAY_WOOD_STAIRS);
                        output.accept(ModBlocks.GRAY_WOOD_SLAB);
                        output.accept(ModBlocks.GRAY_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.GRAY_WOOD_BUTTON);
                        output.accept(ModBlocks.GRAY_WOOD_FENCE);
                        output.accept(ModBlocks.GRAY_WOOD_FENCE_GATE);
                        output.accept(ModBlocks.GRAY_WOOD_DOOR);
                        output.accept(ModBlocks.GRAY_WOOD_TRAPDOOR);

                        output.accept(ModBlocks.LIGHT_GRAY_LOG);
                        output.accept(ModBlocks.LIGHT_GRAY_WOOD);
                        output.accept(ModBlocks.STRIPPED_LIGHT_GRAY_LOG);
                        output.accept(ModBlocks.STRIPPED_LIGHT_GRAY_WOOD);
                        output.accept(ModBlocks.LIGHT_GRAY_PLANK);
                        output.accept(ModBlocks.LIGHT_GRAY_WOOD_STAIRS);
                        output.accept(ModBlocks.LIGHT_GRAY_WOOD_SLAB);
                        output.accept(ModBlocks.LIGHT_GRAY_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.LIGHT_GRAY_WOOD_BUTTON);
                        output.accept(ModBlocks.LIGHT_GRAY_WOOD_FENCE);
                        output.accept(ModBlocks.LIGHT_GRAY_WOOD_FENCE_GATE);
                        output.accept(ModBlocks.LIGHT_GRAY_WOOD_DOOR);
                        output.accept(ModBlocks.LIGHT_GRAY_WOOD_TRAPDOOR);

                        output.accept(ModBlocks.LIGHT_BLUE_LOG);
                        output.accept(ModBlocks.LIGHT_BLUE_WOOD);
                        output.accept(ModBlocks.STRIPPED_LIGHT_BLUE_LOG);
                        output.accept(ModBlocks.STRIPPED_LIGHT_BLUE_WOOD);
                        output.accept(ModBlocks.LIGHT_BLUE_PLANK);
                        output.accept(ModBlocks.LIGHT_BLUE_WOOD_STAIRS);
                        output.accept(ModBlocks.LIGHT_BLUE_WOOD_SLAB);
                        output.accept(ModBlocks.LIGHT_BLUE_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.LIGHT_BLUE_WOOD_BUTTON);
                        output.accept(ModBlocks.LIGHT_BLUE_WOOD_FENCE);
                        output.accept(ModBlocks.LIGHT_BLUE_WOOD_FENCE_GATE);
                        output.accept(ModBlocks.LIGHT_BLUE_WOOD_DOOR);
                        output.accept(ModBlocks.LIGHT_BLUE_WOOD_TRAPDOOR);

                        output.accept(ModBlocks.MAGENTA_LOG);
                        output.accept(ModBlocks.MAGENTA_WOOD);
                        output.accept(ModBlocks.STRIPPED_MAGENTA_LOG);
                        output.accept(ModBlocks.STRIPPED_MAGENTA_WOOD);
                        output.accept(ModBlocks.MAGENTA_PLANK);
                        output.accept(ModBlocks.MAGENTA_WOOD_STAIRS);
                        output.accept(ModBlocks.MAGENTA_WOOD_SLAB);
                        output.accept(ModBlocks.MAGENTA_WOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.MAGENTA_WOOD_BUTTON);
                        output.accept(ModBlocks.MAGENTA_WOOD_FENCE);
                        output.accept(ModBlocks.MAGENTA_WOOD_FENCE_GATE);
                        output.accept(ModBlocks.MAGENTA_WOOD_DOOR);
                        output.accept(ModBlocks.MAGENTA_WOOD_TRAPDOOR);

                    }).build());

    public static final Supplier<CreativeModeTab> TINTED_GROVE_TREES_TAB = CREATIVE_MODE_TAB.register("tinted_grove_trees_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.CYAN_SAPLING.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(TintedGrove.MOD_ID, "tinted_grove_tab"))
                    .title(Component.translatable("creativetab.tintedgrove.tinted_grove_trees"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.RED_SAPLING);
                        output.accept(ModBlocks.RED_LEAVES);

                        output.accept(ModBlocks.BLUE_SAPLING);
                        output.accept(ModBlocks.BLUE_LEAVES);

                        output.accept(ModBlocks.GREEN_SAPLING);
                        output.accept(ModBlocks.GREEN_LEAVES);

                        output.accept(ModBlocks.YELLOW_SAPLING);
                        output.accept(ModBlocks.YELLOW_LEAVES);

                        output.accept(ModBlocks.PURPLE_SAPLING);
                        output.accept(ModBlocks.PURPLE_LEAVES);

                        output.accept(ModBlocks.CYAN_SAPLING);
                        output.accept(ModBlocks.CYAN_LEAVES);

                        output.accept(ModBlocks.ORANGE_SAPLING);
                        output.accept(ModBlocks.ORANGE_LEAVES);

                        output.accept(ModBlocks.LIME_SAPLING);
                        output.accept(ModBlocks.LIME_LEAVES);

                        output.accept(ModBlocks.PINK_SAPLING);
                        output.accept(ModBlocks.PINK_LEAVES);

                        output.accept(ModBlocks.BROWN_SAPLING);
                        output.accept(ModBlocks.BROWN_LEAVES);

                        output.accept(ModBlocks.BLACK_SAPLING);
                        output.accept(ModBlocks.BLACK_LEAVES);

                        output.accept(ModBlocks.WHITE_SAPLING);
                        output.accept(ModBlocks.WHITE_LEAVES);

                        output.accept(ModBlocks.GRAY_SAPLING);
                        output.accept(ModBlocks.GRAY_LEAVES);

                        output.accept(ModBlocks.LIGHT_GRAY_SAPLING);
                        output.accept(ModBlocks.LIGHT_GRAY_LEAVES);

                        output.accept(ModBlocks.LIGHT_BLUE_SAPLING);
                        output.accept(ModBlocks.LIGHT_BLUE_LEAVES);

                        output.accept(ModBlocks.MAGENTA_SAPLING);
                        output.accept(ModBlocks.MAGENTA_LEAVES);

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}

package net.fungoussoup.tintedgrove.item;

import net.fungoussoup.tintedgrove.TintedGrove;
import net.fungoussoup.tintedgrove.block.ModBlocks;
import net.fungoussoup.tintedgrove.util.TintedColor;
import net.fungoussoup.tintedgrove.util.TintedFlowerType;
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
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.getLog(TintedColor.CYAN).get()))
                    .title(Component.translatable("creativetab.tintedgrove.tinted_grove"))
                    .displayItems((itemDisplayParameters, output) -> {
                        for (TintedColor color : TintedColor.values()) {
                            output.accept(ModBlocks.getLog(color));
                            output.accept(ModBlocks.getWood(color));
                            output.accept(ModBlocks.getStrippedLog(color));
                            output.accept(ModBlocks.getStrippedWood(color));
                            output.accept(ModBlocks.getPlanks(color));
                            output.accept(ModBlocks.getWoodStairs(color));
                            output.accept(ModBlocks.getWoodSlab(color));
                            output.accept(ModBlocks.getWoodPressurePlate(color));
                            output.accept(ModBlocks.getWoodButton(color));
                            output.accept(ModBlocks.getWoodFence(color));
                            output.accept(ModBlocks.getWoodFenceGate(color));
                            output.accept(ModBlocks.getWoodDoor(color));
                            output.accept(ModBlocks.getWoodTrapdoor(color));
                        }
                        output.accept(ModItems.TINTER);

                        output.accept(ModItems.PALE_BLUE);
                        output.accept(ModItems.PALE_BROWN);
                        output.accept(ModItems.PALE_CYAN);
                        output.accept(ModItems.PALE_GREEN);
                        output.accept(ModItems.PALE_LIME);
                        output.accept(ModItems.PALE_LIGHT_BLUE);
                        output.accept(ModItems.PALE_MAGENTA);
                        output.accept(ModItems.PALE_ORANGE);
                        output.accept(ModItems.PALE_PINK);
                        output.accept(ModItems.PALE_PURPLE);
                        output.accept(ModItems.PALE_RED);
                        output.accept(ModItems.PALE_YELLOW);
                    }).build());

    public static final Supplier<CreativeModeTab> TINTED_GROVE_TREES_TAB = CREATIVE_MODE_TAB.register("tinted_grove_trees_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.getSapling(TintedColor.CYAN).get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(TintedGrove.MOD_ID, "tinted_grove_tab"))
                    .title(Component.translatable("creativetab.tintedgrove.tinted_grove_trees"))
                    .displayItems((itemDisplayParameters, output) -> {
                        for (TintedColor color : TintedColor.values()) {
                            output.accept(ModBlocks.getSapling(color));
                            output.accept(ModBlocks.getLeaves(color));
                        }
                    }).build());

    public static final Supplier<CreativeModeTab> TINTED_GROVE_FLOWERS_TAB = CREATIVE_MODE_TAB.register("tinted_grove_flowers_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.FLOWERS.get(TintedFlowerType.DANDELION).get(TintedColor.CYAN)))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(TintedGrove.MOD_ID, "tinted_grove_trees_tab"))
                    .title(Component.translatable("creativetab.tintedgrove.tinted_grove_flowers"))
                    .displayItems((itemDisplayParameters, output) -> {
                        for (TintedFlowerType type : TintedFlowerType.values()) {
                            for (TintedColor color : TintedColor.values()) {
                                output.accept(ModBlocks.FLOWERS.get(type).get(color));
                            }
                        }
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
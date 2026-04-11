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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BLUE_LOG.get()))
                    .title(Component.translatable("creativetab.tintedgrove.tinted_grove"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.RED_LOG);
                        output.accept(ModBlocks.RED_PLANK);
                        output.accept(ModBlocks.BLUE_LOG);
                        output.accept(ModBlocks.BLUE_PLANK);
                    }).build());

//    public static final Supplier<CreativeModeTab> RANDOM_TAB = CREATIVE_MODE_TAB.register("random_tab",
//            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY.get()))
//                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(TintedGrove.MOD_ID, "bismuth_items_tab"))
//                    .title(Component.translatable("creativetab.tintedgrove.random_tab"))
//                    .displayItems((itemDisplayParameters, output) -> {
//                        output.accept(ModItems.RUBY);
//                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}

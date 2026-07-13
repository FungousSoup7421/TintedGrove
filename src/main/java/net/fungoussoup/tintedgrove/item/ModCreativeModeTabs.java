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

    public static final Supplier<CreativeModeTab> GLASS_DOORS_TAB = CREATIVE_MODE_TAB.register("glass_doors_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.getGlassDoor(TintedColor.CYAN).get()))
                    .title(Component.translatable("creativetab.tintedgrove.tinted_grove_glass_doors"))
                    .displayItems((itemDisplayParameters, output) -> {
                        for (TintedColor color : TintedColor.values()) {
                            output.accept(ModBlocks.getGlassDoor(color));
                            output.accept(ModBlocks.getWhiteGlassDoor(color));
                            output.accept(ModBlocks.getOrangeGlassDoor(color));
                            output.accept(ModBlocks.getMagentaGlassDoor(color));
                            output.accept(ModBlocks.getLightBlueGlassDoor(color));
                            output.accept(ModBlocks.getYellowGlassDoor(color));
                            output.accept(ModBlocks.getLimeGlassDoor(color));
                            output.accept(ModBlocks.getPinkGlassDoor(color));
                            output.accept(ModBlocks.getGrayGlassDoor(color));
                            output.accept(ModBlocks.getLightGrayGlassDoor(color));
                            output.accept(ModBlocks.getCyanGlassDoor(color));
                            output.accept(ModBlocks.getPurpleGlassDoor(color));
                            output.accept(ModBlocks.getBlueGlassDoor(color));
                            output.accept(ModBlocks.getBrownGlassDoor(color));
                            output.accept(ModBlocks.getGreenGlassDoor(color));
                            output.accept(ModBlocks.getRedGlassDoor(color));
                            output.accept(ModBlocks.getBlackGlassDoor(color));
                        }
                    }).build());

    public static final Supplier<CreativeModeTab> GLASS_WINDOW_DOORS_TAB = CREATIVE_MODE_TAB.register("glass_window_doors_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.getGlassWindowDoor(TintedColor.CYAN).get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(TintedGrove.MOD_ID, "glass_doors_tab"))
                    .title(Component.translatable("creativetab.tintedgrove.tinted_grove_glass_window_doors"))
                    .displayItems((itemDisplayParameters, output) -> {
                        for (TintedColor color : TintedColor.values()) {
                            output.accept(ModBlocks.getGlassWindowDoor(color));
                            output.accept(ModBlocks.getWhiteGlassWindowDoor(color));
                            output.accept(ModBlocks.getOrangeGlassWindowDoor(color));
                            output.accept(ModBlocks.getMagentaGlassWindowDoor(color));
                            output.accept(ModBlocks.getLightBlueGlassWindowDoor(color));
                            output.accept(ModBlocks.getYellowGlassWindowDoor(color));
                            output.accept(ModBlocks.getLimeGlassWindowDoor(color));
                            output.accept(ModBlocks.getPinkGlassWindowDoor(color));
                            output.accept(ModBlocks.getGrayGlassWindowDoor(color));
                            output.accept(ModBlocks.getLightGrayGlassWindowDoor(color));
                            output.accept(ModBlocks.getCyanGlassWindowDoor(color));
                            output.accept(ModBlocks.getPurpleGlassWindowDoor(color));
                            output.accept(ModBlocks.getBlueGlassWindowDoor(color));
                            output.accept(ModBlocks.getBrownGlassWindowDoor(color));
                            output.accept(ModBlocks.getGreenGlassWindowDoor(color));
                            output.accept(ModBlocks.getRedGlassWindowDoor(color));
                            output.accept(ModBlocks.getBlackGlassWindowDoor(color));
                        }
                    }).build());

    public static final Supplier<CreativeModeTab> LEFT_GLASS_PANEL_DOORS_TAB = CREATIVE_MODE_TAB.register("left_glass_panel_doors_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.getLeftGlassPanelDoor(TintedColor.CYAN).get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(TintedGrove.MOD_ID, "glass_window_doors_tab"))
                    .title(Component.translatable("creativetab.tintedgrove.tinted_grove_left_glass_panel_doors"))
                    .displayItems((itemDisplayParameters, output) -> {
                        for (TintedColor color : TintedColor.values()) {
                            output.accept(ModBlocks.getLeftGlassPanelDoor(color));
                            output.accept(ModBlocks.getLeftWhiteGlassPanelDoor(color));
                            output.accept(ModBlocks.getLeftOrangeGlassPanelDoor(color));
                            output.accept(ModBlocks.getLeftMagentaGlassPanelDoor(color));
                            output.accept(ModBlocks.getLeftLightBlueGlassPanelDoor(color));
                            output.accept(ModBlocks.getLeftYellowGlassPanelDoor(color));
                            output.accept(ModBlocks.getLeftLimeGlassPanelDoor(color));
                            output.accept(ModBlocks.getLeftPinkGlassPanelDoor(color));
                            output.accept(ModBlocks.getLeftGrayGlassPanelDoor(color));
                            output.accept(ModBlocks.getLeftLightGrayGlassPanelDoor(color));
                            output.accept(ModBlocks.getLeftCyanGlassPanelDoor(color));
                            output.accept(ModBlocks.getLeftPurpleGlassPanelDoor(color));
                            output.accept(ModBlocks.getLeftBlueGlassPanelDoor(color));
                            output.accept(ModBlocks.getLeftBrownGlassPanelDoor(color));
                            output.accept(ModBlocks.getLeftGreenGlassPanelDoor(color));
                            output.accept(ModBlocks.getLeftRedGlassPanelDoor(color));
                            output.accept(ModBlocks.getLeftBlackGlassPanelDoor(color));
                        }
                    }).build());

    public static final Supplier<CreativeModeTab> RIGHT_GLASS_PANEL_DOORS_TAB = CREATIVE_MODE_TAB.register("right_glass_panel_doors_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.getRightGlassPanelDoor(TintedColor.CYAN).get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(TintedGrove.MOD_ID, "left_glass_panel_doors_tab"))
                    .title(Component.translatable("creativetab.tintedgrove.tinted_grove_right_glass_panel_doors"))
                    .displayItems((itemDisplayParameters, output) -> {
                        for (TintedColor color : TintedColor.values()) {
                            output.accept(ModBlocks.getRightGlassPanelDoor(color));
                            output.accept(ModBlocks.getRightWhiteGlassPanelDoor(color));
                            output.accept(ModBlocks.getRightOrangeGlassPanelDoor(color));
                            output.accept(ModBlocks.getRightMagentaGlassPanelDoor(color));
                            output.accept(ModBlocks.getRightLightBlueGlassPanelDoor(color));
                            output.accept(ModBlocks.getRightYellowGlassPanelDoor(color));
                            output.accept(ModBlocks.getRightLimeGlassPanelDoor(color));
                            output.accept(ModBlocks.getRightPinkGlassPanelDoor(color));
                            output.accept(ModBlocks.getRightGrayGlassPanelDoor(color));
                            output.accept(ModBlocks.getRightLightGrayGlassPanelDoor(color));
                            output.accept(ModBlocks.getRightCyanGlassPanelDoor(color));
                            output.accept(ModBlocks.getRightPurpleGlassPanelDoor(color));
                            output.accept(ModBlocks.getRightBlueGlassPanelDoor(color));
                            output.accept(ModBlocks.getRightBrownGlassPanelDoor(color));
                            output.accept(ModBlocks.getRightGreenGlassPanelDoor(color));
                            output.accept(ModBlocks.getRightRedGlassPanelDoor(color));
                            output.accept(ModBlocks.getRightBlackGlassPanelDoor(color));
                        }
                    }).build());

    public static final Supplier<CreativeModeTab> TINTED_GROVE_TAB = CREATIVE_MODE_TAB.register("tinted_grove_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.getLog(TintedColor.CYAN).get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(TintedGrove.MOD_ID, "right_glass_panel_doors_tab"))
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
package net.fungoussoup.tintedgrove.item;

import net.fungoussoup.tintedgrove.TintedGrove;
import net.fungoussoup.tintedgrove.util.TintedColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.EnumMap;
import java.util.Map;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TintedGrove.MOD_ID);

    public static final DeferredItem<Item> TINTER = ITEMS.register("tinter",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> PALE_ORANGE = ITEMS.register("pale_orange",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PALE_MAGENTA = ITEMS.register("pale_magenta",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PALE_LIGHT_BLUE = ITEMS.register("pale_light_blue",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PALE_YELLOW = ITEMS.register("pale_yellow",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PALE_LIME = ITEMS.register("pale_lime",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PALE_PINK = ITEMS.register("pale_pink",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PALE_CYAN = ITEMS.register("pale_cyan",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PALE_PURPLE = ITEMS.register("pale_purple",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PALE_BLUE = ITEMS.register("pale_blue",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PALE_BROWN = ITEMS.register("pale_brown",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PALE_GREEN = ITEMS.register("pale_green",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PALE_RED = ITEMS.register("pale_red",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

package net.fungoussoup.tintedgrove.datagen;

import net.fungoussoup.tintedgrove.TintedGrove;
import net.fungoussoup.tintedgrove.block.ModBlocks;
import net.fungoussoup.tintedgrove.util.TintedColor;
import net.fungoussoup.tintedgrove.util.TintedFlowerType;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(net.minecraft.data.PackOutput output) {
        super(output, TintedGrove.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.tintedgrove", "Tinted Grove");

        add("creativetab.tintedgrove.tinted_grove", "Tinted Grove");
        add("creativetab.tintedgrove.tinted_grove_trees", "Tinted Grove Trees");
        add("creativetab.tintedgrove.tinted_grove_flowers", "Tinted Grove Flowers");

        add("item.tintedgrove.tinter", "Tinter");

        add("item.tintedgrove.pale_orange", "Pale Orange Dye");
        add("item.tintedgrove.pale_magenta", "Pale Magenta Dye");
        add("item.tintedgrove.pale_light_blue", "Pale Light Blue Dye");
        add("item.tintedgrove.pale_yellow", "Pale Yellow Dye");
        add("item.tintedgrove.pale_lime", "Pale Lime Dye");
        add("item.tintedgrove.pale_pink", "Pale Pink Dye");
        add("item.tintedgrove.pale_cyan", "Pale Cyan Dye");
        add("item.tintedgrove.pale_purple", "Pale Purple Dye");
        add("item.tintedgrove.pale_blue", "Pale Blue Dye");
        add("item.tintedgrove.pale_brown", "Pale Brown Dye");
        add("item.tintedgrove.pale_green", "Pale Green Dye");
        add("item.tintedgrove.pale_red", "Pale Red Dye");

        for (TintedFlowerType type : TintedFlowerType.values()) {
            for (TintedColor color : TintedColor.values()) {

                String flowerName = color.getDisplayName() + " " + formatName(type.getName());
                String pottedName = "Potted " + flowerName;

                add(ModBlocks.FLOWERS.get(type).get(color).get(), flowerName);
                add(ModBlocks.POTTED_FLOWERS.get(type).get(color).get(), pottedName);
            }
        }

        for (TintedColor color : TintedColor.values()) {
            add(ModBlocks.getLog(color).get(), color.getDisplayName() + " Log");
            add(ModBlocks.getWood(color).get(), color.getDisplayName() + " Wood");
            add(ModBlocks.getStrippedLog(color).get(), "Stripped " + color.getDisplayName() + " Log");
            add(ModBlocks.getStrippedWood(color).get(), "Stripped " + color.getDisplayName() + " Wood");
            add(ModBlocks.getPlanks(color).get(), color.getDisplayName() + " Planks");
            add(ModBlocks.getWoodStairs(color).get(), color.getDisplayName() + " Stairs");
            add(ModBlocks.getWoodSlab(color).get(), color.getDisplayName() + " Slab");
            add(ModBlocks.getWoodPressurePlate(color).get(), color.getDisplayName() + " Pressure Plate");
            add(ModBlocks.getWoodButton(color).get(), color.getDisplayName() + " Button");
            add(ModBlocks.getWoodFence(color).get(), color.getDisplayName() + " Fence");
            add(ModBlocks.getWoodFenceGate(color).get(), color.getDisplayName() + " Fence Gate");
            add(ModBlocks.getWoodDoor(color).get(), color.getDisplayName() + " Door");
            add(ModBlocks.getWoodTrapdoor(color).get(), color.getDisplayName() + " Trapdoor");
            add(ModBlocks.getLeaves(color).get(), color.getDisplayName() + " Leaves");
            add(ModBlocks.getSapling(color).get(), color.getDisplayName() + " Sapling");
        }
    }

    private String formatName(String name) {
        String[] parts = name.split("_");
        StringBuilder result = new StringBuilder();

        for (String part : parts) {
            result.append(Character.toUpperCase(part.charAt(0)))
                    .append(part.substring(1))
                    .append(" ");
        }

        return result.toString().trim();
    }
}
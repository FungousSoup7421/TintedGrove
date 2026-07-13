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

        add("creativetab.tintedgrove.tinted_grove_glass_doors", "Glass Doors");
        add("creativetab.tintedgrove.tinted_grove_glass_window_doors", "Glass Window Doors");
        add("creativetab.tintedgrove.tinted_grove_left_glass_panel_doors", "Left Glass Panel Doors");
        add("creativetab.tintedgrove.tinted_grove_right_glass_panel_doors", "Right Glass Panel Doors");
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

            add(ModBlocks.getGlassDoor(color).get(), color.getDisplayName() + " Glass Door");
            add(ModBlocks.getWhiteGlassDoor(color).get(), color.getDisplayName() + " White Stained Glass Door");
            add(ModBlocks.getOrangeGlassDoor(color).get(), color.getDisplayName() + " Orange Stained Glass Door");
            add(ModBlocks.getMagentaGlassDoor(color).get(), color.getDisplayName() + " Magenta Stained Glass Door");
            add(ModBlocks.getLightBlueGlassDoor(color).get(), color.getDisplayName() + " Light Blue Stained Glass Door");
            add(ModBlocks.getYellowGlassDoor(color).get(), color.getDisplayName() + " Yellow Stained Glass Door");
            add(ModBlocks.getLimeGlassDoor(color).get(), color.getDisplayName() + " Lime Stained Glass Door");
            add(ModBlocks.getPinkGlassDoor(color).get(), color.getDisplayName() + " Pink Stained Glass Door");
            add(ModBlocks.getGrayGlassDoor(color).get(), color.getDisplayName() + " Gray Stained Glass Door");
            add(ModBlocks.getLightGrayGlassDoor(color).get(), color.getDisplayName() + " Light Gray Stained Glass Door");
            add(ModBlocks.getCyanGlassDoor(color).get(), color.getDisplayName() + " Cyan Stained Glass Door");
            add(ModBlocks.getPurpleGlassDoor(color).get(), color.getDisplayName() + " Purple Stained Glass Door");
            add(ModBlocks.getBlueGlassDoor(color).get(), color.getDisplayName() + " Blue Stained Glass Door");
            add(ModBlocks.getBrownGlassDoor(color).get(), color.getDisplayName() + " Brown Stained Glass Door");
            add(ModBlocks.getGreenGlassDoor(color).get(), color.getDisplayName() + " Green Stained Glass Door");
            add(ModBlocks.getRedGlassDoor(color).get(), color.getDisplayName() + " Red Stained Glass Door");
            add(ModBlocks.getBlackGlassDoor(color).get(), color.getDisplayName() + " Black Stained Glass Door");

            add(ModBlocks.getGlassWindowDoor(color).get(), color.getDisplayName() + " Glass Window Door");
            add(ModBlocks.getWhiteGlassWindowDoor(color).get(), color.getDisplayName() + " White Stained Glass Window Door");
            add(ModBlocks.getOrangeGlassWindowDoor(color).get(), color.getDisplayName() + " Orange Stained Glass Window Door");
            add(ModBlocks.getMagentaGlassWindowDoor(color).get(), color.getDisplayName() + " Magenta Stained Glass Window Door");
            add(ModBlocks.getLightBlueGlassWindowDoor(color).get(), color.getDisplayName() + " Light Blue Stained Glass Window Door");
            add(ModBlocks.getYellowGlassWindowDoor(color).get(), color.getDisplayName() + " Yellow Stained Glass Window Door");
            add(ModBlocks.getLimeGlassWindowDoor(color).get(), color.getDisplayName() + " Lime Stained Glass Window Door");
            add(ModBlocks.getPinkGlassWindowDoor(color).get(), color.getDisplayName() + " Pink Stained Glass Window Door");
            add(ModBlocks.getGrayGlassWindowDoor(color).get(), color.getDisplayName() + " Gray Stained Glass Window Door");
            add(ModBlocks.getLightGrayGlassWindowDoor(color).get(), color.getDisplayName() + " Light Gray Stained Glass Window Door");
            add(ModBlocks.getCyanGlassWindowDoor(color).get(), color.getDisplayName() + " Cyan Stained Glass Window Door");
            add(ModBlocks.getPurpleGlassWindowDoor(color).get(), color.getDisplayName() + " Purple Stained Glass Window Door");
            add(ModBlocks.getBlueGlassWindowDoor(color).get(), color.getDisplayName() + " Blue Stained Glass Window Door");
            add(ModBlocks.getBrownGlassWindowDoor(color).get(), color.getDisplayName() + " Brown Stained Glass Window Door");
            add(ModBlocks.getGreenGlassWindowDoor(color).get(), color.getDisplayName() + " Green Stained Glass Window Door");
            add(ModBlocks.getRedGlassWindowDoor(color).get(), color.getDisplayName() + " Red Stained Glass Window Door");
            add(ModBlocks.getBlackGlassWindowDoor(color).get(), color.getDisplayName() + " Black Stained Glass Window Door");

            add(ModBlocks.getLeftGlassPanelDoor(color).get(), color.getDisplayName() + " Left Glass Panel Door");
            add(ModBlocks.getLeftWhiteGlassPanelDoor(color).get(), color.getDisplayName() + " Left White Stained Glass Panel Door");
            add(ModBlocks.getLeftOrangeGlassPanelDoor(color).get(), color.getDisplayName() + " Left Orange Stained Glass Panel Door");
            add(ModBlocks.getLeftMagentaGlassPanelDoor(color).get(), color.getDisplayName() + " Left Magenta Stained Glass Panel Door");
            add(ModBlocks.getLeftLightBlueGlassPanelDoor(color).get(), color.getDisplayName() + " Left Light Blue Stained Glass Panel Door");
            add(ModBlocks.getLeftYellowGlassPanelDoor(color).get(), color.getDisplayName() + " Left Yellow Stained Glass Panel Door");
            add(ModBlocks.getLeftLimeGlassPanelDoor(color).get(), color.getDisplayName() + " Left Lime Stained Glass Panel Door");
            add(ModBlocks.getLeftPinkGlassPanelDoor(color).get(), color.getDisplayName() + " Left Pink Stained Glass Panel Door");
            add(ModBlocks.getLeftGrayGlassPanelDoor(color).get(), color.getDisplayName() + " Left Gray Stained Glass Panel Door");
            add(ModBlocks.getLeftLightGrayGlassPanelDoor(color).get(), color.getDisplayName() + " Left Light Gray Stained Glass Panel Door");
            add(ModBlocks.getLeftCyanGlassPanelDoor(color).get(), color.getDisplayName() + " Left Cyan Stained Glass Panel Door");
            add(ModBlocks.getLeftPurpleGlassPanelDoor(color).get(), color.getDisplayName() + " Left Purple Stained Glass Panel Door");
            add(ModBlocks.getLeftBlueGlassPanelDoor(color).get(), color.getDisplayName() + " Left Blue Stained Glass Panel Door");
            add(ModBlocks.getLeftBrownGlassPanelDoor(color).get(), color.getDisplayName() + " Left Brown Stained Glass Panel Door");
            add(ModBlocks.getLeftGreenGlassPanelDoor(color).get(), color.getDisplayName() + " Left Green Stained Glass Panel Door");
            add(ModBlocks.getLeftRedGlassPanelDoor(color).get(), color.getDisplayName() + " Left Red Stained Glass Panel Door");
            add(ModBlocks.getLeftBlackGlassPanelDoor(color).get(), color.getDisplayName() + " Left Black Stained Glass Panel Door");

            add(ModBlocks.getRightGlassPanelDoor(color).get(), color.getDisplayName() + " Right Glass Panel Door");
            add(ModBlocks.getRightWhiteGlassPanelDoor(color).get(), color.getDisplayName() + " Right White Stained Glass Panel Door");
            add(ModBlocks.getRightOrangeGlassPanelDoor(color).get(), color.getDisplayName() + " Right Orange Stained Glass Panel Door");
            add(ModBlocks.getRightMagentaGlassPanelDoor(color).get(), color.getDisplayName() + " Right Magenta Stained Glass Panel Door");
            add(ModBlocks.getRightLightBlueGlassPanelDoor(color).get(), color.getDisplayName() + " Right Light Blue Stained Glass Panel Door");
            add(ModBlocks.getRightYellowGlassPanelDoor(color).get(), color.getDisplayName() + " Right Yellow Stained Glass Panel Door");
            add(ModBlocks.getRightLimeGlassPanelDoor(color).get(), color.getDisplayName() + " Right Lime Stained Glass Panel Door");
            add(ModBlocks.getRightPinkGlassPanelDoor(color).get(), color.getDisplayName() + " Right Pink Stained Glass Panel Door");
            add(ModBlocks.getRightGrayGlassPanelDoor(color).get(), color.getDisplayName() + " Right Gray Stained Glass Panel Door");
            add(ModBlocks.getRightLightGrayGlassPanelDoor(color).get(), color.getDisplayName() + " Right Light Gray Stained Glass Panel Door");
            add(ModBlocks.getRightCyanGlassPanelDoor(color).get(), color.getDisplayName() + " Right Cyan Stained Glass Panel Door");
            add(ModBlocks.getRightPurpleGlassPanelDoor(color).get(), color.getDisplayName() + " Right Purple Stained Glass Panel Door");
            add(ModBlocks.getRightBlueGlassPanelDoor(color).get(), color.getDisplayName() + " Right Blue Stained Glass Panel Door");
            add(ModBlocks.getRightBrownGlassPanelDoor(color).get(), color.getDisplayName() + " Right Brown Stained Glass Panel Door");
            add(ModBlocks.getRightGreenGlassPanelDoor(color).get(), color.getDisplayName() + " Right Green Stained Glass Panel Door");
            add(ModBlocks.getRightRedGlassPanelDoor(color).get(), color.getDisplayName() + " Right Red Stained Glass Panel Door");
            add(ModBlocks.getRightBlackGlassPanelDoor(color).get(), color.getDisplayName() + " Right Black Stained Glass Panel Door");
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
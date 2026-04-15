package net.fungoussoup.tintedgrove.datagen;

import net.fungoussoup.tintedgrove.TintedGrove;
import net.fungoussoup.tintedgrove.block.ModBlocks;
import net.fungoussoup.tintedgrove.util.TintedColor;
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

        for (TintedColor color : TintedColor.values()) {
            add(ModBlocks.getLog(color).get(), color.getDisplayName() + " Log");
            add(ModBlocks.getWood(color).get(), color.getDisplayName() + " Wood");
            add(ModBlocks.getStrippedLog(color).get(), "Stripped " + color.getDisplayName() + " Log");
            add(ModBlocks.getStrippedWood(color).get(), "Stripped " + color.getDisplayName() + " Wood");
            add(ModBlocks.getPlanks(color).get(), color.getDisplayName() + " Planks");
            add(ModBlocks.getWoodStairs(color).get(), color.getDisplayName() + " Wood Stairs");
            add(ModBlocks.getWoodSlab(color).get(), color.getDisplayName() + " Wood Slab");
            add(ModBlocks.getWoodPressurePlate(color).get(), color.getDisplayName() + " Wood Pressure Plate");
            add(ModBlocks.getWoodButton(color).get(), color.getDisplayName() + " Wood Button");
            add(ModBlocks.getWoodFence(color).get(), color.getDisplayName() + " Wood Fence");
            add(ModBlocks.getWoodFenceGate(color).get(), color.getDisplayName() + " Wood Fence Gate");
            add(ModBlocks.getWoodDoor(color).get(), color.getDisplayName() + " Wood Door");
            add(ModBlocks.getWoodTrapdoor(color).get(), color.getDisplayName() + " Wood Trapdoor");
            add(ModBlocks.getLeaves(color).get(), color.getDisplayName() + " Leaves");
            add(ModBlocks.getSapling(color).get(), color.getDisplayName() + " Sapling");
        }
    }
}
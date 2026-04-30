package net.fungoussoup.tintedgrove.util;

public enum TintedColor {
    WHITE("white", "White"),
    ORANGE("orange", "Orange"),
    MAGENTA("magenta", "Magenta"),
    LIGHT_BLUE("light_blue", "Light Blue"),
    YELLOW("yellow", "Yellow"),
    LIME("lime", "Lime"),
    PINK("pink", "Pink"),
    GRAY("gray", "Gray"),
    LIGHT_GRAY("light_gray", "Light Gray"),
    CYAN("cyan", "Cyan"),
    PURPLE("purple", "Purple"),
    BLUE("blue", "Blue"),
    BROWN("brown", "Brown"),
    GREEN("green", "Green"),
    RED("red", "Red"),
    BLACK("black", "Black"),

    PALE_ORANGE("pale_orange", "Pale Orange"),
    PALE_MAGENTA("pale_magenta", "Pale Magenta"),
    PALE_LIGHT_BLUE("pale_light_blue", "Pale Light Blue"),
    PALE_YELLOW("pale_yellow", "Pale Yellow"),
    PALE_LIME("pale_lime", "Pale Lime"),
    PALE_PINK("pale_pink", "Pale Pink"),
    PALE_CYAN("pale_cyan", "Pale Cyan"),
    PALE_PURPLE("pale_purple", "Pale Purple"),
    PALE_BLUE("pale_blue", "Pale Blue"),
    PALE_BROWN("pale_brown", "Pale Brown"),
    PALE_GREEN("pale_green", "Pale Green"),
    PALE_RED("pale_red", "Pale Red");

    private final String id;
    private final String displayName;

    TintedColor(String id, String displayName) {
        this.id = id;
        this.displayName = displayName;
    }

    public String getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String prefix() {
        return id + "_";
    }

    public String blockName(String baseName) {
        return id + "_" + baseName;
    }

    public String langName(String suffix) {
        return displayName + " " + suffix;
    }
}
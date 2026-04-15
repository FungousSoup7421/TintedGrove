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
    BLACK("black", "Black");

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
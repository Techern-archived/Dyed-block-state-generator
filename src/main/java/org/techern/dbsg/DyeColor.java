package org.techern.dbsg;

/**
 * An enum describing different dye colors
 *
 * @since 0.0.1
 */
public enum DyeColor {

    /**
     * A black {@link DyeColor}
     *
     * @since 0.0.1
     */
    BLACK("black"),

    /**
     * A red {@link DyeColor}
     *
     * @since 0.0.1
     */
    RED("red"),

    /**
     * A green {@link DyeColor}
     *
     * @since 0.0.1
     */
    GREEN("green"),

    /**
     * A brown {@link DyeColor}
     *
     * @since 0.0.1
     */
    BROWN("brown"),

    /**
     * A blue {@link DyeColor}
     *
     * @since 0.0.1
     */
    BLUE("blue"),

    /**
     * A purple {@link DyeColor}
     *
     * @since 0.0.1
     */
    PURPLE("purple"),

    /**
     * A cyan {@link DyeColor}
     *
     * @since 0.0.1
     */
    CYAN("cyan"),

    /**
     * A silver {@link DyeColor}
     *
     * @since 0.0.1
     */
    SILVER("silver"),

    /**
     * A gray {@link DyeColor}
     *
     * @since 0.0.1
     */
    GRAY("gray"),

    /**
     * A pink {@link DyeColor}
     *
     * @since 0.0.1
     */
    PINK("pink"),

    /**
     * A lime {@link DyeColor}
     *
     * @since 0.0.1
     */
    LIME("lime"),

    /**
     * A yellow {@link DyeColor}
     *
     * @since 0.0.1
     */
    YELLOW("yellow"),

    /**
     * A light blue {@link DyeColor}
     *
     * @since 0.0.1
     */
    LIGHT_BLUE("light_blue"),

    /**
     * A magenta {@link DyeColor}
     *
     * @since 0.0.1
     */
    MAGENTA("magenta"),

    /**
     * A orange {@link DyeColor}
     *
     * @since 0.0.1
     */
    ORANGE("orange"),

    /**
     * A white {@link DyeColor}
     *
     * @since 0.0.1
     */
    WHITE("white");

    /**
     * The name of this {@link DyeColor}
     *
     * @since 0.0.1
     */
    private String name;

    /**
     * Gets this {@link DyeColor}'s name
     *
     * @return The name
     * @since 0.0.1
     */
    public String getName() {
        return this.name;
    }

    /**
     * Creates a new {@link DyeColor}
     *
     * @param name The name being used
     * @since 0.0.1
     */
    DyeColor(String name) {
        this.name = name;
    }

}

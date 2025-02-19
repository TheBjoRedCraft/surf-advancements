package dev.slne.surf.advancement.util;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextColor;

public class Colors {
    public static final TextColor PRIMARY = TextColor.color(0x3b92d1);
    public static final TextColor SECONDARY = TextColor.color(0x5b5b5b);
    public static final TextColor INFO = TextColor.color(0x40d1db);
    public static final TextColor SUCCESS = TextColor.color(0x65ff64);
    public static final TextColor WARNING = TextColor.color(0xf9c353);
    public static final TextColor ERROR = TextColor.color(0xee3d51);
    public static final TextColor VARIABLE_KEY = INFO;
    public static final TextColor VARIABLE_VALUE = WARNING;
    public static final NamedTextColor SPACER = NamedTextColor.GRAY;
    public static final NamedTextColor DARK_SPACER = NamedTextColor.DARK_GRAY;
    public static final TextColor PREFIX_COLOR = PRIMARY;

    public static final Component PREFIX = Component.text(">> ", DARK_SPACER)
            .append(Component.text("SA", PREFIX_COLOR))
            .append(Component.text(" | ", DARK_SPACER));

    public static final NamedTextColor BLACK = NamedTextColor.BLACK;
    public static final NamedTextColor DARK_BLUE = NamedTextColor.DARK_BLUE;
    public static final NamedTextColor DARK_GREEN = NamedTextColor.DARK_GREEN;
    public static final NamedTextColor DARK_AQUA = NamedTextColor.DARK_AQUA;
    public static final NamedTextColor DARK_RED = NamedTextColor.DARK_RED;
    public static final NamedTextColor DARK_PURPLE = NamedTextColor.DARK_PURPLE;
    public static final NamedTextColor GOLD = NamedTextColor.GOLD;
    public static final NamedTextColor GRAY = NamedTextColor.GRAY;
    public static final NamedTextColor DARK_GRAY = NamedTextColor.DARK_GRAY;
    public static final NamedTextColor BLUE = NamedTextColor.BLUE;
    public static final NamedTextColor GREEN = NamedTextColor.GREEN;
    public static final NamedTextColor AQUA = NamedTextColor.AQUA;
    public static final NamedTextColor RED = NamedTextColor.RED;
    public static final NamedTextColor LIGHT_PURPLE = NamedTextColor.LIGHT_PURPLE;
    public static final NamedTextColor YELLOW = NamedTextColor.YELLOW;
    public static final NamedTextColor WHITE = NamedTextColor.WHITE;
}

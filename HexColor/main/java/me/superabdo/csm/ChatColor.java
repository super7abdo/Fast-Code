package me.superabdo.csm;

import org.bukkit.entity.Player;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChatColor {


    private static final Pattern pattern = Pattern.compile("(?<!\\\\)(#[a-fA-F0-9]{6})");

    public ChatColor() {
        throw new RuntimeException("Utils class should not be instantiated!");
    }


    public static String Hex(Player player, String message) {
        Matcher matcher = pattern.matcher(message);

        while (matcher.find()) {
            String color = message.substring(matcher.start(), matcher.end());
            message = message.replace(color, "" + net.md_5.bungee.api.ChatColor.of(color));
        }
        return message;
    }

    public static String colorize(Player player, String message) {
        message = org.bukkit.ChatColor.translateAlternateColorCodes('&', message);

        return message;
    }

}

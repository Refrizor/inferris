package me.refriz.lobby;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Itemdata {

    private static final ItemStack games = new ItemStack(Material.EMERALD);
    private static final ItemStack fun = new ItemStack(Material.BLAZE_POWDER);

    public static ItemStack getGames() {
        ItemMeta itemMeta = games.getItemMeta();
        itemMeta.setDisplayName(ChatColor.GREEN + "Games");
        games.setItemMeta(itemMeta);
        return games;
    }

    public static ItemStack getFun() {
        ItemMeta itemMeta = fun.getItemMeta();
        itemMeta.setDisplayName(ChatColor.AQUA + "Fun");
        fun.setItemMeta(itemMeta);
        return fun;
    }
}
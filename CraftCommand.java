package com.jesse.craftanywhere;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CraftCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (((Player) sender).getInventory().contains(Material.CRAFTING_TABLE)) {
                ((Player) sender).openWorkbench(null, true);
                return true;
            }
            else
                sender.sendMessage(ChatColor.RED + "You can only use this command with a crafting table in your inventory!");
        }
        else
            System.out.println("Only players can use this command!");
        return true;
    }
}

package com.crystalminers.System.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(args.length != 0){
			Player p = Bukkit.getPlayer(args[0]);
			if(p.getAllowFlight()){
				p.setAllowFlight(false);
				p.sendMessage("§cFlugmodus deaktiviert");
			}else{
				p.setAllowFlight(true);
				p.sendMessage("§aFlugmodus aktiviert");
			}
		}else{
			Player p = (Player) sender;
			if(p.getAllowFlight()){
				p.setAllowFlight(false);
				p.sendMessage("§cFlugmodus deaktiviert");
			}else{
				p.setAllowFlight(true);
				p.sendMessage("§aFlugmodus aktiviert");
			}
		}
		return true;
	}

}

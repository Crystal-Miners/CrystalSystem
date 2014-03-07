package com.crystalminers.System.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpeedCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {

		StringBuilder sb = new StringBuilder();
		sb.append(0);
		sb.append(".");
		sb.append(args[0]);
		if(args.length != 1){
			Player p = Bukkit.getPlayer(args[1]);
			if(p.isFlying()){
				p.setFlySpeed(Float.valueOf(sb.toString()));
			}else{
				p.setWalkSpeed(Float.valueOf(sb.toString()));
			}
		}else{
			Player p = (Player) sender;
			if(p.isFlying()){
				p.setFlySpeed(Float.valueOf(sb.toString()));
			}else{
				p.setWalkSpeed(Float.valueOf(sb.toString()));
			}
		}
		return true;
	}

	
	
}

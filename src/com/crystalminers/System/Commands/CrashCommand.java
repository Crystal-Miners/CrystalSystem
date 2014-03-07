package com.crystalminers.System.Commands;

import net.minecraft.server.v1_7_R1.EntityPlayer;
import net.minecraft.server.v1_7_R1.PacketPlayOutSpawnEntityLiving;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_7_R1.entity.CraftPlayer;

public class CrashCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		try{
		EntityPlayer v = ((CraftPlayer) Bukkit.getPlayer(args[0])).getHandle();
		v.playerConnection.sendPacket(new PacketPlayOutSpawnEntityLiving(v));
		return true;
		}catch(Exception e){
			sender.sendMessage("§cError");
		}
		return true;
	}

}

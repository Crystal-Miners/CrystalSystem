package com.crystalminers.System;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.crystalminers.System.Commands.CrashCommand;
import com.crystalminers.System.Commands.FlyCommand;
import com.crystalminers.System.Commands.SpeedCommand;
import com.crystalminers.System.Listener.PlayerJoin;

public class Main extends JavaPlugin {

	public void onEnable(){
		registerEvents();
		registerCommands();
	}
	
	public void onDisable(){
		
	}
	
	
	
	public void registerEvents(){
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new PlayerJoin(this), this);
	}
	
	public void registerCommands(){
		getCommand("crash").setExecutor(new CrashCommand());
		getCommand("fly").setExecutor(new FlyCommand());
		getCommand("speed").setExecutor(new SpeedCommand());
	}
}

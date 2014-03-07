package com.crystalminers.System.Listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.crystalminers.System.Main;

public class PlayerJoin implements Listener{
	
	Main pl;
	
	public PlayerJoin(Main plugin){
		pl = plugin;
	}
	
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		Player p = e.getPlayer();
		p.setResourcePack("https://www.dropbox.com/s/ktzl7j4qgcnyoq1/Ovos%20Rustic%20Redemption%20v1.1.2%20-%201.7.X%20%20%281%29.zip");
	}

}

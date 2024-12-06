package me.mchiappinam.pdghemotion;

import me.mchiappinam.pdghemotion.Listeners;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new Listeners(this), this);
		
		getServer().getConsoleSender().sendMessage("§3[PDGHEmotion] §2ativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHEmotion] §2Acesse: http://pdgh.com.br/");
	}
	
	@Override
	public void onDisable() {
		getServer().getConsoleSender().sendMessage("§3[PDGHEmotion] §2desativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHEmotion] §2Acesse: http://pdgh.com.br/");
	}
}
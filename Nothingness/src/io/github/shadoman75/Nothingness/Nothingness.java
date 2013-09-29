package io.github.shadoman75.Nothingness;

import org.bukkit.plugin.java.JavaPlugin;

public final class Nothingness extends JavaPlugin {
	
	@Override
	public void onEnable() {
		
		getLogger().info("this message will self destruct eventually");
		
		getLogger().info("maybe now, idk, but it will.. oh just you wait");
		
		getLogger().info("ASSFLALARGH!!!! *poof*"); {
			
			this.setEnabled(false);
			// damn, i hope this is what shuts this thing down
		}
		
	}
	
	public void onDisable() {
		
		getLogger().info("this plugin was found in a pool of its own bytes... tis a sad, sad day");
	}

}

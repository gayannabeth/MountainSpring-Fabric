package gay.mountainspring;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import gay.mountainspring.block.MSBlocks;
import gay.mountainspring.item.MSItems;
import gay.mountainspring.item.group.MSVanillaGroups;

public class MSMain implements ModInitializer {
	public static final String MOD_ID = "mountainspring";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	
	@Override
	public void onInitialize() {
		MSBlocks.init();
		MSItems.init();
		MSVanillaGroups.init();
	}
}
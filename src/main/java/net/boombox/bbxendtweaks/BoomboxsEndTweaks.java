package net.boombox.bbxendtweaks;

import net.boombox.bbxendtweaks.Block.ModBlocks;
import net.boombox.bbxendtweaks.item.ModItemGroups;
import net.boombox.bbxendtweaks.item.ModItems;
import net.boombox.bbxendtweaks.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BoomboxsEndTweaks implements ModInitializer {
	public static final String MOD_ID = "bbxendtweaks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("BOOM!");
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModSounds.registerSounds();
	}
}
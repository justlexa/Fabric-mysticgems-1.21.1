package net.justlexa.mysticgems;

import net.fabricmc.api.ModInitializer;

import net.justlexa.mysticgems.blocks.ModBlocks;
import net.justlexa.mysticgems.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MysticGems implements ModInitializer {
	public static final String MOD_ID = "mysticgems";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
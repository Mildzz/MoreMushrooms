package net.mildzz.moremushrooms;

import net.fabricmc.api.ModInitializer;

import net.mildzz.moremushrooms.mushrooms.ModBlocks;
import net.mildzz.moremushrooms.mushrooms.ModItemGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreMushrooms implements ModInitializer {
	public static final String MOD_ID = "more-mushrooms";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItemGroup.registerItemGroups();
	}
}
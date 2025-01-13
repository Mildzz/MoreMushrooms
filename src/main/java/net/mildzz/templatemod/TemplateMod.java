package net.mildzz.templatemod;

import net.fabricmc.api.ModInitializer;

import net.mildzz.templatemod.block.ModBlocks;
import net.mildzz.templatemod.item.ModItemGroups;
import net.mildzz.templatemod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TemplateMod implements ModInitializer {

	public static final String MOD_ID = "templatemod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
package net.mildzz.moremushrooms;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.mildzz.moremushrooms.mushrooms.ModBlocks;
import net.mildzz.moremushrooms.mushrooms.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreMushrooms implements ModInitializer {
	public static final String MOD_ID = "more-mushrooms";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModBlocks.registerModBlocks();
		Block inkyCap = ModBlocks.INKY_CAP;
		Block shaggyMane = ModBlocks.PENNY_BUN;
		BlockRenderLayerMap.INSTANCE.putBlock(inkyCap, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(shaggyMane, RenderLayer.getCutout());
	}
}
package net.mildzz.moremushrooms;

import net.fabricmc.api.ModInitializer;

import net.mildzz.moremushrooms.block.ModBlocks;
import net.mildzz.moremushrooms.item.ModItemGroups;
import net.mildzz.moremushrooms.item.ModItems;
import net.mildzz.moremushrooms.world.ModFeatures;
import net.mildzz.moremushrooms.world.OmbreMushroomFeature;
import net.mildzz.moremushrooms.world.gen.ModWorldGeneration;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreMushrooms implements ModInitializer {

	public static final String MOD_ID = "moremushrooms";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModFeatures.HUGE_OMBRE_MUSHROOM = register(
				new Identifier(MoreMushrooms.MOD_ID, "huge_ombre_mushroom"), new OmbreMushroomFeature(HugeMushroomFeatureConfig.CODEC)
		);

		ModWorldGeneration.generateModWorldGen();

		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}

	private static <C extends FeatureConfig, F extends Feature<C>> F register(Identifier name, F feature) {
		return Registry.register(Registries.FEATURE, name, feature);
	}
}
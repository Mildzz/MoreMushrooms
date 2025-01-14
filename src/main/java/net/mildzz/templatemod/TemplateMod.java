package net.mildzz.templatemod;

import net.fabricmc.api.ModInitializer;

import net.mildzz.templatemod.block.ModBlocks;
import net.mildzz.templatemod.item.ModItemGroups;
import net.mildzz.templatemod.item.ModItems;
import net.mildzz.templatemod.world.ModFeatures;
import net.mildzz.templatemod.world.OmbreMushroomFeature;
import net.mildzz.templatemod.world.gen.ModWorldGeneration;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TemplateMod implements ModInitializer {

	public static final String MOD_ID = "templatemod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModFeatures.HUGE_OMBRE_MUSHROOM = register(
				new Identifier(TemplateMod.MOD_ID, "huge_ombre_mushroom"), new OmbreMushroomFeature(HugeMushroomFeatureConfig.CODEC)
		);
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModWorldGeneration.generateModWorldGen();
//		Registry.register(Registries.FEATURE, new Identifier("templatemod", "huge_ombre_mushroom"), new OmbreMushroomFeature(HugeMushroomFeatureConfig.CODEC));
	}

	private static <C extends FeatureConfig, F extends Feature<C>> F register(Identifier name, F feature) {
		return Registry.register(Registries.FEATURE, name, feature);
	}
}
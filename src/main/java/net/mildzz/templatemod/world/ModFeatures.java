package net.mildzz.templatemod.world;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.world.gen.feature.*;

public abstract class ModFeatures<FC extends FeatureConfig> {
//    public static final Feature<HugeMushroomFeatureConfig> HUGE_PENNY_BUN = register(
//            "huge_penny_bun", new MushroomFeature(HugeMushroomFeatureConfig.CODEC)
//    );

    private static <C extends FeatureConfig, F extends Feature<C>> F register(String name, F feature) {
        return Registry.register(Registries.FEATURE, name, feature);
    }
}

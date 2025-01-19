package net.mildzz.moremushrooms.world;

import com.mojang.serialization.Codec;
import net.minecraft.world.gen.feature.*;

public abstract class ModFeatures<FC extends FeatureConfig> {
    public static Feature<HugeMushroomFeatureConfig> HUGE_OMBRE_MUSHROOM;

    public ModFeatures(Codec<FC> configCodec) {
        super();

    }
}

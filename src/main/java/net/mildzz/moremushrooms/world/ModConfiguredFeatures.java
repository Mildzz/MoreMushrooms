package net.mildzz.moremushrooms.world;

import net.mildzz.moremushrooms.MoreMushrooms;
import net.mildzz.moremushrooms.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.block.MushroomBlock;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> PENNY_BUN_KEY = registerKey("penny_bun");
    public static final RegistryKey<ConfiguredFeature<?, ?>> INKY_CAP_KEY = registerKey("inky_cap");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AMETHYST_DECEIVER_KEY = registerKey("amethyst_deceiver");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUE_PINKGILL_KEY = registerKey("blue_pinkgill");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WINE_CAP_KEY = registerKey("wine_cap");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PURPLE_BRITTLEGILL_KEY = registerKey("purple_brittlegill");

    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context) {
        register(context, PENNY_BUN_KEY, Feature.HUGE_RED_MUSHROOM, new HugeMushroomFeatureConfig(
                BlockStateProvider.of(ModBlocks.PENNY_BUN_BLOCK.getDefaultState().with(MushroomBlock.DOWN, Boolean.valueOf(false))),
                BlockStateProvider.of(
                        Blocks.MUSHROOM_STEM.getDefaultState().with(MushroomBlock.UP, Boolean.valueOf(false)).with(MushroomBlock.DOWN, Boolean.valueOf(false))
                ),
                2));

        register(context, INKY_CAP_KEY, Feature.HUGE_RED_MUSHROOM, new HugeMushroomFeatureConfig(
                BlockStateProvider.of(ModBlocks.INKY_CAP_BLOCK.getDefaultState().with(MushroomBlock.DOWN, Boolean.valueOf(false))),
                BlockStateProvider.of(
                        Blocks.MUSHROOM_STEM.getDefaultState().with(MushroomBlock.UP, Boolean.valueOf(false)).with(MushroomBlock.DOWN, Boolean.valueOf(false))
                ),
                2));

        register(context, AMETHYST_DECEIVER_KEY, Feature.HUGE_BROWN_MUSHROOM, new HugeMushroomFeatureConfig(
                BlockStateProvider.of(ModBlocks.AMETHYST_DECEIVER_BLOCK.getDefaultState()),
                BlockStateProvider.of(
                        ModBlocks.AMETHYST_DECEIVER_STEM.getDefaultState().with(MushroomBlock.UP, Boolean.valueOf(false)).with(MushroomBlock.DOWN, Boolean.valueOf(false))
                ),
                3));

        register(context, BLUE_PINKGILL_KEY, Feature.HUGE_BROWN_MUSHROOM, new HugeMushroomFeatureConfig(
                BlockStateProvider.of(ModBlocks.BLUE_PINKGILL_BLOCK.getDefaultState()),
                BlockStateProvider.of(
                        ModBlocks.BLUE_PINKGILL_STEM.getDefaultState().with(MushroomBlock.UP, Boolean.valueOf(false)).with(MushroomBlock.DOWN, Boolean.valueOf(false))
                ),
                3));

        register(context, WINE_CAP_KEY, Feature.HUGE_RED_MUSHROOM, new HugeMushroomFeatureConfig(
                BlockStateProvider.of(ModBlocks.WINE_CAP_BLOCK.getDefaultState().with(MushroomBlock.DOWN, Boolean.valueOf(false))),
                BlockStateProvider.of(
                        Blocks.MUSHROOM_STEM.getDefaultState().with(MushroomBlock.UP, Boolean.valueOf(false)).with(MushroomBlock.DOWN, Boolean.valueOf(false))
                ),
                2));

        register(context, PURPLE_BRITTLEGILL_KEY, ModFeatures.HUGE_OMBRE_MUSHROOM, new HugeMushroomFeatureConfig(
                BlockStateProvider.of(ModBlocks.PURPLE_BRITTLEGILL_TOP.getDefaultState().with(MushroomBlock.DOWN, Boolean.valueOf(false))),
                BlockStateProvider.of(
                        Blocks.MUSHROOM_STEM.getDefaultState().with(MushroomBlock.UP, Boolean.valueOf(false)).with(MushroomBlock.DOWN, Boolean.valueOf(false))
                ),
                2));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(MoreMushrooms.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
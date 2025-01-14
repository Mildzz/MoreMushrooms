package net.mildzz.templatemod.world;

import com.google.common.collect.ImmutableList;
import net.mildzz.templatemod.TemplateMod;
import net.mildzz.templatemod.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModPlacedFeatures {
//    public static final RegistryKey<PlacedFeature> RUBY_ORE_PLACED_KEY = registerKey("ruby_ore_placed");
//    public static final RegistryKey<PlacedFeature> NETHER_RUBY_ORE_PLACED_KEY = registerKey("nether_ruby_ore_placed");
//    public static final RegistryKey<PlacedFeature> END_RUBY_ORE_PLACED_KEY = registerKey("end_ruby_ore_placed");

    public static final RegistryKey<PlacedFeature> PENNY_BUN_PLACED_KEY = registerKey("penny_bun_placed");
    public static final RegistryKey<PlacedFeature> INKY_CAP_PLACED_KEY = registerKey("inky_cap_placed");
    public static final RegistryKey<PlacedFeature> AMETHYST_DECEIVER_PLACED_KEY = registerKey("amethyst_deceiver_placed");
    public static final RegistryKey<PlacedFeature> BLUE_PINKGILL_PLACED_KEY = registerKey("blue_pinkgill_placed");
    public static final RegistryKey<PlacedFeature> WINE_CAP_PLACED_KEY = registerKey("wine_cap_placed");
    public static final RegistryKey<PlacedFeature> PURPLE_BRITTLEGILL_PLACED_KEY = registerKey("purple_brittlegill_placed");

    public static void boostrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

//        register(context, RUBY_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RUBY_ORE_KEY),
//                ModOrePlacement.modifiersWithCount(12, // Veins per Chunk
//                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
//        register(context, NETHER_RUBY_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NETHER_RUBY_ORE_KEY),
//                ModOrePlacement.modifiersWithCount(12, // Veins per Chunk
//                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
//        register(context, END_RUBY_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.END_RUBY_ORE_KEY),
//                ModOrePlacement.modifiersWithCount(12, // Veins per Chunk
//                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));

        register(context, PENNY_BUN_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PENNY_BUN_KEY),
                mushroomModifiers(512, null));
        register(context, INKY_CAP_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.INKY_CAP_KEY),
                mushroomModifiers(256, null));
        register(context, AMETHYST_DECEIVER_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.AMETHYST_DECEIVER_KEY),
                mushroomModifiers(2, null));
        register(context, BLUE_PINKGILL_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BLUE_PINKGILL_KEY),
                mushroomModifiers(128, null));
        register(context, WINE_CAP_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BLUE_PINKGILL_KEY),
                mushroomModifiers(512, null));
        register(context, PURPLE_BRITTLEGILL_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PURPLE_BRITTLEGILL_KEY),
                mushroomModifiers(256, null));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(TemplateMod.MOD_ID, name));
    }

    private static List<PlacementModifier> mushroomModifiers(int chance, @Nullable PlacementModifier modifier) {
        ImmutableList.Builder<PlacementModifier> builder = ImmutableList.builder();
        if (modifier != null) {
            builder.add(modifier);
        }

        if (chance != 0) {
            builder.add(RarityFilterPlacementModifier.of(chance));
        }

        builder.add(SquarePlacementModifier.of());
        builder.add(PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP);
        builder.add(BiomePlacementModifier.of());
        return builder.build();
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
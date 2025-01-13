package net.mildzz.templatemod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.mildzz.templatemod.TemplateMod;
import net.mildzz.templatemod.world.ModConfiguredFeatures;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //  Penny Bun

    public static final Block PENNY_BUN = registerBlock("penny_bun",
            new MushroomPlantBlock(ModConfiguredFeatures.PENNY_BUN_KEY,
                    FabricBlockSettings.create()
                            .mapColor(MapColor.ORANGE)
                            .noCollision()
                            .nonOpaque()
                            .ticksRandomly()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .postProcess(Blocks::always)
                            .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block POTTED_PENNY_BUN = Registry.register(Registries.BLOCK,
            new Identifier(TemplateMod.MOD_ID, "potted_penny_bun"),
            new FlowerPotBlock(PENNY_BUN, FabricBlockSettings.copyOf(Blocks.POTTED_RED_MUSHROOM)));

    public static final Block PENNY_BUN_BLOCK = registerBlock("penny_bun_block",
            new MushroomBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM_BLOCK).nonOpaque()));

    //  Inky Cap

    public static final Block INKY_CAP = registerBlock("inky_cap",
            new MushroomPlantBlock(ModConfiguredFeatures.INKY_CAP_KEY,
                    FabricBlockSettings.create()
                            .mapColor(MapColor.BLACK)
                            .noCollision()
                            .nonOpaque()
                            .ticksRandomly()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .postProcess(Blocks::always)
                            .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block POTTED_INKY_CAP = Registry.register(Registries.BLOCK,
            new Identifier(TemplateMod.MOD_ID, "potted_inky_cap"),
            new FlowerPotBlock(INKY_CAP, FabricBlockSettings.copyOf(Blocks.POTTED_RED_MUSHROOM)));

    public static final Block INKY_CAP_BLOCK = registerBlock("inky_cap_block",
            new MushroomBlock(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM_BLOCK).nonOpaque()));

    public static final Block AMETHYST_DECEIVER = registerBlock("amethyst_deceiver",
            new MushroomPlantBlock(ModConfiguredFeatures.AMETHYST_DECEIVER_KEY,
                    FabricBlockSettings.create()
                            .mapColor(MapColor.MAGENTA)
                            .noCollision()
                            .nonOpaque()
                            .ticksRandomly()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .postProcess(Blocks::always)
                            .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block POTTED_AMETHYST_DECEIVER = Registry.register(Registries.BLOCK,
            new Identifier(TemplateMod.MOD_ID, "potted_amethyst_deceiver"),
            new FlowerPotBlock(AMETHYST_DECEIVER, FabricBlockSettings.copyOf(Blocks.POTTED_BROWN_MUSHROOM)));

    public static final Block AMETHYST_DECEIVER_BLOCK = registerBlock("amethyst_deceiver_block",
            new MushroomBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM_BLOCK).nonOpaque()));

    public static final Block AMETHYST_DECEIVER_STEM = registerBlock("amethyst_deceiver_stem",
            new MushroomBlock(FabricBlockSettings.copyOf(Blocks.MUSHROOM_STEM).nonOpaque()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TemplateMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TemplateMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        TemplateMod.LOGGER.info("Registering mod blocks for " + TemplateMod.MOD_ID);
    }
}
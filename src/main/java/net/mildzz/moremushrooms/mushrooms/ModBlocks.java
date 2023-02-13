package net.mildzz.moremushrooms.mushrooms;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.mildzz.moremushrooms.MoreMushrooms;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block INKY_CAP = registerMushroom("inky_cap",
            new Block(FabricBlockSettings.copy(Blocks.BROWN_MUSHROOM)), ModItemGroup.MUSHROOMS);
    public static final Block PENNY_BUN = registerMushroom("penny_bun",
            new Block(FabricBlockSettings.copy(Blocks.BROWN_MUSHROOM)), ModItemGroup.MUSHROOMS);
    public static final Block AMANITA_CAESAREA = registerMushroom("amanita_caesarea",
            new Block(FabricBlockSettings.copy(Blocks.BROWN_MUSHROOM)), ModItemGroup.MUSHROOMS);
    public static final Block BLUE_HONEY_AGARIC = registerMushroom("blue_honey_agaric",
            new Block(FabricBlockSettings.copy(Blocks.BROWN_MUSHROOM)), ModItemGroup.MUSHROOMS);
    public static final Block SHIITAKE = registerMushroom("shiitake",
            new Block(FabricBlockSettings.copy(Blocks.BROWN_MUSHROOM)), ModItemGroup.MUSHROOMS);
    public static final Block HONEY_FUNGUS = registerMushroom("honey_fungus",
            new Block(FabricBlockSettings.copy(Blocks.BROWN_MUSHROOM)), ModItemGroup.MUSHROOMS);
    public static final Block SHIMEJI = registerMushroom("shimeji",
            new Block(FabricBlockSettings.copy(Blocks.BROWN_MUSHROOM)), ModItemGroup.MUSHROOMS);
    public static final Block CHAMPIGNON = registerMushroom("champignon",
            new Block(FabricBlockSettings.copy(Blocks.BROWN_MUSHROOM)), ModItemGroup.MUSHROOMS);
    public static final Block MAITAKE = registerMushroom("maitake",
            new Block(FabricBlockSettings.copy(Blocks.BROWN_MUSHROOM)), ModItemGroup.MUSHROOMS);

    private static Block registerMushroom(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(MoreMushrooms.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(MoreMushrooms.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModBlocks() {
        MoreMushrooms.LOGGER.info("Registering Mushrooms for More Mushrooms!");
    }

}

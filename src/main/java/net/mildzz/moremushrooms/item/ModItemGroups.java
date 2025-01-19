package net.mildzz.moremushrooms.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mildzz.moremushrooms.MoreMushrooms;
import net.mildzz.moremushrooms.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup MUSHROOM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MoreMushrooms.MOD_ID, "mushroom"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.mushroom"))
                    .icon(() -> new ItemStack(ModBlocks.PURPLE_BRITTLEGILL)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.PENNY_BUN);
                        entries.add(ModBlocks.PENNY_BUN_BLOCK);

                        entries.add(ModBlocks.INKY_CAP);
                        entries.add(ModBlocks.INKY_CAP_BLOCK);

                        entries.add(ModBlocks.AMETHYST_DECEIVER);
                        entries.add(ModBlocks.AMETHYST_DECEIVER_BLOCK);
                        entries.add(ModBlocks.AMETHYST_DECEIVER_STEM);

                        entries.add(ModBlocks.BLUE_PINKGILL);
                        entries.add(ModBlocks.BLUE_PINKGILL_BLOCK);
                        entries.add(ModBlocks.BLUE_PINKGILL_STEM);

                        entries.add(ModBlocks.WINE_CAP);
                        entries.add(ModBlocks.WINE_CAP_BLOCK);

                        entries.add(ModBlocks.PURPLE_BRITTLEGILL);
                        entries.add(ModBlocks.PURPLE_BRITTLEGILL_TOP);
                        entries.add(ModBlocks.PURPLE_BRITTLEGILL_MIDDLE);
                        entries.add(ModBlocks.PURPLE_BRITTLEGILL_BOTTOM);

                    }).build());

    public static void registerItemGroups() {
        MoreMushrooms.LOGGER.info("Registering mod item groups for " + MoreMushrooms.MOD_ID);
    }

}

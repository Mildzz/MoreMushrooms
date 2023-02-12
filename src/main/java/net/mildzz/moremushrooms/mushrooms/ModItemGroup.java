package net.mildzz.moremushrooms.mushrooms;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mildzz.moremushrooms.MoreMushrooms;
import net.minecraft.item.ItemGroup;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup MUSHROOMS;

    public static void registerItemGroups() {
        MUSHROOMS = FabricItemGroup.builder(new Identifier(MoreMushrooms.MOD_ID, "mushrooms"))
                .displayName(Text.translatable("itemgroup.mushrooms")).build();
    }
}

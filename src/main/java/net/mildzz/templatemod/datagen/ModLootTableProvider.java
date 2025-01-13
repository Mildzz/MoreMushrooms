package net.mildzz.templatemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.mildzz.templatemod.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.PENNY_BUN);
        addPottedPlantDrops(ModBlocks.POTTED_PENNY_BUN);
        addDrop(ModBlocks.INKY_CAP);
        addPottedPlantDrops(ModBlocks.POTTED_INKY_CAP);
        addDrop(ModBlocks.AMETHYST_DECEIVER);
        addPottedPlantDrops(ModBlocks.POTTED_AMETHYST_DECEIVER);
    }
}

package net.mildzz.moremushrooms.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.mildzz.moremushrooms.block.ModBlocks;

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
        addDrop(ModBlocks.BLUE_PINKGILL);
        addPottedPlantDrops(ModBlocks.POTTED_BLUE_PINKGILL);
        addDrop(ModBlocks.WINE_CAP);
        addPottedPlantDrops(ModBlocks.POTTED_WINE_CAP);
        addDrop(ModBlocks.PURPLE_BRITTLEGILL);
        addPottedPlantDrops(ModBlocks.POTTED_PURPLE_BRITTLEGILL);
        addDrop(ModBlocks.HONEY_FUNGUS);
        addPottedPlantDrops(ModBlocks.POTTED_HONEY_FUNGUS);

        addDrop(ModBlocks.BLUE_PINKGILL_BLOCK, mushroomBlockDrops(ModBlocks.BLUE_PINKGILL_BLOCK, ModBlocks.BLUE_PINKGILL));
        addDrop(ModBlocks.PENNY_BUN_BLOCK, mushroomBlockDrops(ModBlocks.PENNY_BUN_BLOCK, ModBlocks.PENNY_BUN));
        addDrop(ModBlocks.AMETHYST_DECEIVER_BLOCK, mushroomBlockDrops(ModBlocks.AMETHYST_DECEIVER_BLOCK, ModBlocks.AMETHYST_DECEIVER));
        addDrop(ModBlocks.INKY_CAP_BLOCK, mushroomBlockDrops(ModBlocks.INKY_CAP_BLOCK, ModBlocks.INKY_CAP));
        addDrop(ModBlocks.WINE_CAP_BLOCK, mushroomBlockDrops(ModBlocks.WINE_CAP_BLOCK, ModBlocks.WINE_CAP));
        addDrop(ModBlocks.PURPLE_BRITTLEGILL_TOP, mushroomBlockDrops(ModBlocks.PURPLE_BRITTLEGILL_TOP, ModBlocks.PURPLE_BRITTLEGILL));
        addDrop(ModBlocks.PURPLE_BRITTLEGILL_MIDDLE, mushroomBlockDrops(ModBlocks.PURPLE_BRITTLEGILL_MIDDLE, ModBlocks.PURPLE_BRITTLEGILL));
        addDrop(ModBlocks.PURPLE_BRITTLEGILL_BOTTOM, mushroomBlockDrops(ModBlocks.PURPLE_BRITTLEGILL_BOTTOM, ModBlocks.PURPLE_BRITTLEGILL));
        addDropWithSilkTouch(ModBlocks.AMETHYST_DECEIVER_STEM);
        addDropWithSilkTouch(ModBlocks.BLUE_PINKGILL_STEM);
    }
}

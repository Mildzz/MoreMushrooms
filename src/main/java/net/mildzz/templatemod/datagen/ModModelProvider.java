package net.mildzz.templatemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.mildzz.templatemod.block.ModBlocks;
import net.mildzz.templatemod.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerMushroomBlock(ModBlocks.PENNY_BUN_BLOCK);
        blockStateModelGenerator.registerMushroomBlock(ModBlocks.INKY_CAP_BLOCK);
        blockStateModelGenerator.registerMushroomBlock(ModBlocks.AMETHYST_DECEIVER_BLOCK);
        blockStateModelGenerator.registerMushroomBlock(ModBlocks.AMETHYST_DECEIVER_STEM);
//        blockStateModelGenerator.registerTintableCross(ModBlocks.PENNY_BUN, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PENNY_BUN, ModBlocks.POTTED_PENNY_BUN, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.INKY_CAP, ModBlocks.POTTED_INKY_CAP, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.AMETHYST_DECEIVER, ModBlocks.POTTED_AMETHYST_DECEIVER, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.MUSHROOM, Models.GENERATED);
    }
}

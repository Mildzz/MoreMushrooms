package net.mildzz.templatemod.world;

import com.mojang.serialization.Codec;
import net.mildzz.templatemod.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.MushroomBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.gen.feature.HugeMushroomFeature;
import net.minecraft.world.gen.feature.HugeMushroomFeatureConfig;

public class OmbreMushroomFeature extends HugeMushroomFeature {
    public OmbreMushroomFeature(Codec<HugeMushroomFeatureConfig> codec) {
        super(codec);
    }

    @Override
    protected int getCapSize(int i, int j, int capSize, int y) {
        return 0;
    }

    @Override
    protected void generateCap(WorldAccess world, Random random, BlockPos start, int y, BlockPos.Mutable mutable, HugeMushroomFeatureConfig config) {
        for (int i = y - 3; i <= y; i++) {
            // Adjust the radius for the current row
            int j = i < y ? config.foliageRadius : config.foliageRadius - 1;
            int k = config.foliageRadius - 2;

            // BlockState for the current row
            BlockState blockState;

            // Handle the topmost row (horizontal row at i == y)
            if (i == y) {
                blockState = config.capProvider.get(random, start).with(MushroomBlock.DOWN, Boolean.valueOf(false)); // Top texture for the horizontal top row
            }
            // Handle the vertical rows below the topmost row
            else {
                if (i == y - 1) {
                    blockState = config.capProvider.get(random, start).with(MushroomBlock.DOWN, Boolean.valueOf(false)); // Top texture for the first vertical row
                } else if (i == y - 2) {
                    blockState = ModBlocks.PURPLE_BRITTLEGILL_MIDDLE.getDefaultState().with(MushroomBlock.DOWN, Boolean.valueOf(false)); // Middle texture for the second vertical row
                } else {
                    blockState = ModBlocks.PURPLE_BRITTLEGILL_BOTTOM.getDefaultState().with(MushroomBlock.DOWN, Boolean.valueOf(false)); // Bottom texture for the third vertical row
                }
            }

            // Loop through the area of the cap at the current height (i)
            for (int l = -j; l <= j; l++) {
                for (int m = -j; m <= j; m++) {
                    // Check if we're on the edge of the cap
                    boolean bl = l == -j;
                    boolean bl2 = l == j;
                    boolean bl3 = m == -j;
                    boolean bl4 = m == j;
                    boolean bl5 = bl || bl2;
                    boolean bl6 = bl3 || bl4;

                    // Check if the current position is inside the cap or on the edge
                    if (i >= y || bl5 != bl6) {
                        mutable.set(start, l, i, m);

                        // Set the block state for the current position (cap block)
                        this.setBlockState(world, mutable, blockState);
                    }
                }
            }
        }


    }
}
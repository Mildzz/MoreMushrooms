package net.mildzz.moremushrooms.world;

import com.mojang.serialization.Codec;
import net.mildzz.moremushrooms.MoreMushrooms;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.ModifiableWorld;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.util.FeatureContext;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ModFeatures<FC extends FeatureConfig> {
//    public static final Feature<HugeMushroomFeatureConfig> HUGE_PENNY_BUN = register(
//            "huge_penny_bun", new MushroomFeature(HugeMushroomFeatureConfig.CODEC)
//    );
    public static Feature<HugeMushroomFeatureConfig> HUGE_OMBRE_MUSHROOM;
//
//
//
//    private static <C extends FeatureConfig, F extends Feature<C>> F register(Identifier name, F feature) {
//        return Registry.register(Registries.FEATURE, name, feature);
//    }

    public ModFeatures(Codec<FC> configCodec) {
        super();

    }

//    protected void setBlockState(ModifiableWorld world, BlockPos pos, BlockState state) {
//        world.setBlockState(pos, state, Block.NOTIFY_ALL);
//    }
//
//    public static Predicate<BlockState> notInBlockTagPredicate(TagKey<Block> tag) {
//        return state -> !state.isIn(tag);
//    }
//
//    protected void setBlockStateIf(StructureWorldAccess world, BlockPos pos, BlockState state, Predicate<BlockState> predicate) {
//        if (predicate.test(world.getBlockState(pos))) {
//            world.setBlockState(pos, state, Block.NOTIFY_LISTENERS);
//        }
//    }

//    public abstract boolean generate(FeatureContext<FC> context);

//    public boolean generateIfValid(FC config, StructureWorldAccess world, ChunkGenerator chunkGenerator, Random random, BlockPos pos) {
//        return world.isValidForSetBlock(pos) ? this.generate(new FeatureContext<>(Optional.empty(), world, chunkGenerator, random, pos, config)) : false;
//    }
//
//    protected static boolean isStone(BlockState state) {
//        return state.isIn(BlockTags.BASE_STONE_OVERWORLD);
//    }
//
//    public static boolean isSoil(BlockState state) {
//        return state.isIn(BlockTags.DIRT);
//    }
//
//    public static boolean isSoil(TestableWorld world, BlockPos pos) {
//        return world.testBlockState(pos, Feature::isSoil);
//    }

//    public static boolean testAdjacentStates(Function<BlockPos, BlockState> posToState, BlockPos pos, Predicate<BlockState> predicate) {
//        BlockPos.Mutable mutable = new BlockPos.Mutable();
//
//        for (Direction direction : Direction.values()) {
//            mutable.set(pos, direction);
//            if (predicate.test((BlockState)posToState.apply(mutable))) {
//                return true;
//            }
//        }
//
//        return false;
//    }

//    public static boolean isExposedToAir(Function<BlockPos, BlockState> posToState, BlockPos pos) {
//        return testAdjacentStates(posToState, pos, AbstractBlock.AbstractBlockState::isAir);
//    }
//
//    protected void markBlocksAboveForPostProcessing(StructureWorldAccess world, BlockPos pos) {
//        BlockPos.Mutable mutable = pos.mutableCopy();
//
//        for (int i = 0; i < 2; i++) {
//            mutable.move(Direction.UP);
//            if (world.getBlockState(mutable).isAir()) {
//                return;
//            }
//
//            world.getChunk(mutable).markBlockForPostProcessing(mutable);
//        }
//    }
}

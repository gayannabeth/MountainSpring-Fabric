package gay.mountainspring.datagen;

import gay.mountainspring.aquifer.datagen.AquiferBlockStates;
import gay.mountainspring.block.MSBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.ModelIds;
import net.minecraft.data.client.TextureMap;
import net.minecraft.data.client.TexturedModel;

public class MSBlockStatesModelGen extends FabricModelProvider {
	public MSBlockStatesModelGen(FabricDataOutput output) {
		super(output);
	}
	
	@Override
	public void generateBlockStateModels(BlockStateModelGenerator gen) {
		gen.registerSingleton(MSBlocks.MOSSY_STONE, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.CRACKED_MOSSY_STONE_BRICKS, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.CRACKED_CHISELED_STONE_BRICKS, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.MOSSY_CHISELED_STONE_BRICKS, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICKS, TexturedModel.CUBE_ALL);
		
		gen.registerSingleton(MSBlocks.MOSSY_GRANITE, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.COBBLED_GRANITE, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.MOSSY_COBBLED_GRANITE, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.GRANITE_BRICKS, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.CRACKED_GRANITE_BRICKS, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.MOSSY_GRANITE_BRICKS, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.CRACKED_MOSSY_GRANITE_BRICKS, TexturedModel.CUBE_ALL);
		
		gen.registerSingleton(MSBlocks.MOSSY_DIORITE, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.COBBLED_DIORITE, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.MOSSY_COBBLED_DIORITE, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.DIORITE_BRICKS, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.CRACKED_DIORITE_BRICKS, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.MOSSY_DIORITE_BRICKS, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.CRACKED_MOSSY_DIORITE_BRICKS, TexturedModel.CUBE_ALL);
		
		gen.registerSingleton(MSBlocks.MOSSY_ANDESITE, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.COBBLED_ANDESITE, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.MOSSY_COBBLED_ANDESITE, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.ANDESITE_BRICKS, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.CRACKED_ANDESITE_BRICKS, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.MOSSY_ANDESITE_BRICKS, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.CRACKED_MOSSY_ANDESITE_BRICKS, TexturedModel.CUBE_ALL);
		
		gen.registerAxisRotated(MSBlocks.MOSSY_DEEPSLATE, TexturedModel.CUBE_COLUMN);
		gen.registerSingleton(MSBlocks.MOSSY_COBBLED_DEEPSLATE, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.MOSSY_DEEPSLATE_BRICKS, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICKS, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.MOSSY_DEEPSLATE_TILES, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILES, TexturedModel.CUBE_ALL);
		
		gen.registerSingleton(MSBlocks.MOSSY_TUFF, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.CRACKED_TUFF_BRICKS, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.MOSSY_TUFF_BRICKS, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.CRACKED_MOSSY_TUFF_BRICKS, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.CRACKED_CHISELED_TUFF_BRICKS, TexturedModel.END_FOR_TOP_CUBE_COLUMN);
		gen.registerSingleton(MSBlocks.MOSSY_CHISELED_TUFF_BRICKS, TexturedModel.END_FOR_TOP_CUBE_COLUMN);
		gen.registerSingleton(MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICKS, TexturedModel.END_FOR_TOP_CUBE_COLUMN);
		
		gen.registerSingleton(MSBlocks.CRACKED_BRICKS, TexturedModel.CUBE_ALL);
		
		gen.registerSingleton(MSBlocks.CRACKED_MUD_BRICKS, TexturedModel.CUBE_ALL);
		
		gen.registerSingleton(MSBlocks.SANDSTONE_BRICKS, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.CRACKED_SANDSTONE_BRICKS, TexturedModel.CUBE_ALL);
		
		gen.registerSingleton(MSBlocks.RED_SANDSTONE_BRICKS, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.CRACKED_RED_SANDSTONE_BRICKS, TexturedModel.CUBE_ALL);
		
		gen.registerSingleton(MSBlocks.CRACKED_PRISMARINE_BRICKS, TexturedModel.CUBE_ALL);
		
		gen.registerSingleton(MSBlocks.CRACKED_CHISELED_NETHER_BRICKS, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.CRACKED_RED_NETHER_BRICKS, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.CHISELED_RED_NETHER_BRICKS, TexturedModel.CUBE_ALL);
		gen.registerSingleton(MSBlocks.CRACKED_CHISELED_RED_NETHER_BRICKS, TexturedModel.CUBE_ALL);
		
		gen.registerSingleton(MSBlocks.CRACKED_END_STONE_BRICKS, TexturedModel.CUBE_ALL);
		
		gen.registerSingleton(MSBlocks.CRACKED_QUARTZ_BRICKS, TexturedModel.CUBE_ALL);
		
		AquiferBlockStates.registerSlab(gen, MSBlocks.MOSSY_STONE_SLAB, MSBlocks.MOSSY_STONE);
		AquiferBlockStates.registerStairs(gen, MSBlocks.MOSSY_STONE_STAIRS, MSBlocks.MOSSY_STONE);
		AquiferBlockStates.registerWall(gen, MSBlocks.MOSSY_STONE_WALL, MSBlocks.MOSSY_STONE);
		AquiferBlockStates.registerSlab(gen, MSBlocks.CRACKED_MOSSY_STONE_BRICK_SLAB, MSBlocks.CRACKED_MOSSY_STONE_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.CRACKED_MOSSY_STONE_BRICK_STAIRS, MSBlocks.CRACKED_MOSSY_STONE_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.CRACKED_MOSSY_STONE_BRICK_WALL, MSBlocks.CRACKED_MOSSY_STONE_BRICKS);
		AquiferBlockStates.registerSlab(gen, MSBlocks.CRACKED_CHISELED_STONE_BRICK_SLAB, MSBlocks.CRACKED_CHISELED_STONE_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.CRACKED_CHISELED_STONE_BRICK_STAIRS, MSBlocks.CRACKED_CHISELED_STONE_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.CRACKED_CHISELED_STONE_BRICK_WALL, MSBlocks.CRACKED_CHISELED_STONE_BRICKS);
		AquiferBlockStates.registerSlab(gen, MSBlocks.MOSSY_CHISELED_STONE_BRICK_SLAB, MSBlocks.MOSSY_CHISELED_STONE_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.MOSSY_CHISELED_STONE_BRICK_STAIRS, MSBlocks.MOSSY_CHISELED_STONE_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.MOSSY_CHISELED_STONE_BRICK_WALL, MSBlocks.MOSSY_CHISELED_STONE_BRICKS);
		AquiferBlockStates.registerSlab(gen, MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICK_SLAB, MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICK_STAIRS, MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICK_WALL, MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICKS);
		
		AquiferBlockStates.registerSlab(gen, MSBlocks.MOSSY_GRANITE_SLAB, MSBlocks.MOSSY_GRANITE);
		AquiferBlockStates.registerStairs(gen, MSBlocks.MOSSY_GRANITE_STAIRS, MSBlocks.MOSSY_GRANITE);
		AquiferBlockStates.registerWall(gen, MSBlocks.MOSSY_GRANITE_WALL, MSBlocks.MOSSY_GRANITE);
		AquiferBlockStates.registerSlab(gen, MSBlocks.COBBLED_GRANITE_SLAB, MSBlocks.COBBLED_GRANITE);
		AquiferBlockStates.registerStairs(gen, MSBlocks.COBBLED_GRANITE_STAIRS, MSBlocks.COBBLED_GRANITE);
		AquiferBlockStates.registerWall(gen, MSBlocks.COBBLED_GRANITE_WALL, MSBlocks.COBBLED_GRANITE);
		AquiferBlockStates.registerSlab(gen, MSBlocks.MOSSY_COBBLED_GRANITE_SLAB, MSBlocks.MOSSY_COBBLED_GRANITE);
		AquiferBlockStates.registerStairs(gen, MSBlocks.MOSSY_COBBLED_GRANITE_STAIRS, MSBlocks.MOSSY_COBBLED_GRANITE);
		AquiferBlockStates.registerWall(gen, MSBlocks.MOSSY_COBBLED_GRANITE_WALL, MSBlocks.MOSSY_COBBLED_GRANITE);
		AquiferBlockStates.registerSlab(gen, MSBlocks.GRANITE_BRICK_SLAB, MSBlocks.GRANITE_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.GRANITE_BRICK_STAIRS, MSBlocks.GRANITE_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.GRANITE_BRICK_WALL, MSBlocks.GRANITE_BRICKS);
		AquiferBlockStates.registerSlab(gen, MSBlocks.CRACKED_GRANITE_BRICK_SLAB, MSBlocks.CRACKED_GRANITE_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.CRACKED_GRANITE_BRICK_STAIRS, MSBlocks.CRACKED_GRANITE_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.CRACKED_GRANITE_BRICK_WALL, MSBlocks.CRACKED_GRANITE_BRICKS);
		AquiferBlockStates.registerSlab(gen, MSBlocks.MOSSY_GRANITE_BRICK_SLAB, MSBlocks.MOSSY_GRANITE_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.MOSSY_GRANITE_BRICK_STAIRS, MSBlocks.MOSSY_GRANITE_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.MOSSY_GRANITE_BRICK_WALL, MSBlocks.MOSSY_GRANITE_BRICKS);
		AquiferBlockStates.registerSlab(gen, MSBlocks.CRACKED_MOSSY_GRANITE_BRICK_SLAB, MSBlocks.CRACKED_MOSSY_GRANITE_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.CRACKED_MOSSY_GRANITE_BRICK_STAIRS, MSBlocks.CRACKED_MOSSY_GRANITE_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.CRACKED_MOSSY_GRANITE_BRICK_WALL, MSBlocks.CRACKED_MOSSY_GRANITE_BRICKS);
		
		AquiferBlockStates.registerSlab(gen, MSBlocks.MOSSY_DIORITE_SLAB, MSBlocks.MOSSY_DIORITE);
		AquiferBlockStates.registerStairs(gen, MSBlocks.MOSSY_DIORITE_STAIRS, MSBlocks.MOSSY_DIORITE);
		AquiferBlockStates.registerWall(gen, MSBlocks.MOSSY_DIORITE_WALL, MSBlocks.MOSSY_DIORITE);
		AquiferBlockStates.registerSlab(gen, MSBlocks.COBBLED_DIORITE_SLAB, MSBlocks.COBBLED_DIORITE);
		AquiferBlockStates.registerStairs(gen, MSBlocks.COBBLED_DIORITE_STAIRS, MSBlocks.COBBLED_DIORITE);
		AquiferBlockStates.registerWall(gen, MSBlocks.COBBLED_DIORITE_WALL, MSBlocks.COBBLED_DIORITE);
		AquiferBlockStates.registerSlab(gen, MSBlocks.MOSSY_COBBLED_DIORITE_SLAB, MSBlocks.MOSSY_COBBLED_DIORITE);
		AquiferBlockStates.registerStairs(gen, MSBlocks.MOSSY_COBBLED_DIORITE_STAIRS, MSBlocks.MOSSY_COBBLED_DIORITE);
		AquiferBlockStates.registerWall(gen, MSBlocks.MOSSY_COBBLED_DIORITE_WALL, MSBlocks.MOSSY_COBBLED_DIORITE);
		AquiferBlockStates.registerSlab(gen, MSBlocks.DIORITE_BRICK_SLAB, MSBlocks.DIORITE_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.DIORITE_BRICK_STAIRS, MSBlocks.DIORITE_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.DIORITE_BRICK_WALL, MSBlocks.DIORITE_BRICKS);
		AquiferBlockStates.registerSlab(gen, MSBlocks.CRACKED_DIORITE_BRICK_SLAB, MSBlocks.CRACKED_DIORITE_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.CRACKED_DIORITE_BRICK_STAIRS, MSBlocks.CRACKED_DIORITE_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.CRACKED_DIORITE_BRICK_WALL, MSBlocks.CRACKED_DIORITE_BRICKS);
		AquiferBlockStates.registerSlab(gen, MSBlocks.MOSSY_DIORITE_BRICK_SLAB, MSBlocks.MOSSY_DIORITE_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.MOSSY_DIORITE_BRICK_STAIRS, MSBlocks.MOSSY_DIORITE_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.MOSSY_DIORITE_BRICK_WALL, MSBlocks.MOSSY_DIORITE_BRICKS);
		AquiferBlockStates.registerSlab(gen, MSBlocks.CRACKED_MOSSY_DIORITE_BRICK_SLAB, MSBlocks.CRACKED_MOSSY_DIORITE_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.CRACKED_MOSSY_DIORITE_BRICK_STAIRS, MSBlocks.CRACKED_MOSSY_DIORITE_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.CRACKED_MOSSY_DIORITE_BRICK_WALL, MSBlocks.CRACKED_MOSSY_DIORITE_BRICKS);
		
		AquiferBlockStates.registerSlab(gen, MSBlocks.MOSSY_ANDESITE_SLAB, MSBlocks.MOSSY_ANDESITE);
		AquiferBlockStates.registerStairs(gen, MSBlocks.MOSSY_ANDESITE_STAIRS, MSBlocks.MOSSY_ANDESITE);
		AquiferBlockStates.registerWall(gen, MSBlocks.MOSSY_ANDESITE_WALL, MSBlocks.MOSSY_ANDESITE);
		AquiferBlockStates.registerSlab(gen, MSBlocks.COBBLED_ANDESITE_SLAB, MSBlocks.COBBLED_ANDESITE);
		AquiferBlockStates.registerStairs(gen, MSBlocks.COBBLED_ANDESITE_STAIRS, MSBlocks.COBBLED_ANDESITE);
		AquiferBlockStates.registerWall(gen, MSBlocks.COBBLED_ANDESITE_WALL, MSBlocks.COBBLED_ANDESITE);
		AquiferBlockStates.registerSlab(gen, MSBlocks.MOSSY_COBBLED_ANDESITE_SLAB, MSBlocks.MOSSY_COBBLED_ANDESITE);
		AquiferBlockStates.registerStairs(gen, MSBlocks.MOSSY_COBBLED_ANDESITE_STAIRS, MSBlocks.MOSSY_COBBLED_ANDESITE);
		AquiferBlockStates.registerWall(gen, MSBlocks.MOSSY_COBBLED_ANDESITE_WALL, MSBlocks.MOSSY_COBBLED_ANDESITE);
		AquiferBlockStates.registerSlab(gen, MSBlocks.ANDESITE_BRICK_SLAB, MSBlocks.ANDESITE_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.ANDESITE_BRICK_STAIRS, MSBlocks.ANDESITE_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.ANDESITE_BRICK_WALL, MSBlocks.ANDESITE_BRICKS);
		AquiferBlockStates.registerSlab(gen, MSBlocks.CRACKED_ANDESITE_BRICK_SLAB, MSBlocks.CRACKED_ANDESITE_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.CRACKED_ANDESITE_BRICK_STAIRS, MSBlocks.CRACKED_ANDESITE_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.CRACKED_ANDESITE_BRICK_WALL, MSBlocks.CRACKED_ANDESITE_BRICKS);
		AquiferBlockStates.registerSlab(gen, MSBlocks.MOSSY_ANDESITE_BRICK_SLAB, MSBlocks.MOSSY_ANDESITE_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.MOSSY_ANDESITE_BRICK_STAIRS, MSBlocks.MOSSY_ANDESITE_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.MOSSY_ANDESITE_BRICK_WALL, MSBlocks.MOSSY_ANDESITE_BRICKS);
		AquiferBlockStates.registerSlab(gen, MSBlocks.CRACKED_MOSSY_ANDESITE_BRICK_SLAB, MSBlocks.CRACKED_MOSSY_ANDESITE_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.CRACKED_MOSSY_ANDESITE_BRICK_STAIRS, MSBlocks.CRACKED_MOSSY_ANDESITE_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.CRACKED_MOSSY_ANDESITE_BRICK_WALL, MSBlocks.CRACKED_MOSSY_ANDESITE_BRICKS);
		
		AquiferBlockStates.registerOrientableSlab(gen, MSBlocks.MOSSY_DEEPSLATE_SLAB, TextureMap.sideEnd(MSBlocks.MOSSY_DEEPSLATE), ModelIds.getBlockModelId(MSBlocks.MOSSY_DEEPSLATE));
		AquiferBlockStates.registerOrientableStairs(gen, MSBlocks.MOSSY_DEEPSLATE_STAIRS, TextureMap.sideEnd(MSBlocks.MOSSY_DEEPSLATE));
		AquiferBlockStates.registerWallColumn(gen, MSBlocks.MOSSY_DEEPSLATE_WALL, TextureMap.sideEnd(MSBlocks.MOSSY_DEEPSLATE));
		AquiferBlockStates.registerSlab(gen, MSBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB, MSBlocks.MOSSY_COBBLED_DEEPSLATE);
		AquiferBlockStates.registerStairs(gen, MSBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS, MSBlocks.MOSSY_COBBLED_DEEPSLATE);
		AquiferBlockStates.registerWall(gen, MSBlocks.MOSSY_COBBLED_DEEPSLATE_WALL, MSBlocks.MOSSY_COBBLED_DEEPSLATE);
		AquiferBlockStates.registerSlab(gen, MSBlocks.MOSSY_DEEPSLATE_BRICK_SLAB, MSBlocks.MOSSY_DEEPSLATE_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS, MSBlocks.MOSSY_DEEPSLATE_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.MOSSY_DEEPSLATE_BRICK_WALL, MSBlocks.MOSSY_DEEPSLATE_BRICKS);
		AquiferBlockStates.registerSlab(gen, MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICK_SLAB, MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICK_STAIRS, MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICK_WALL, MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICKS);
		AquiferBlockStates.registerSlab(gen, MSBlocks.MOSSY_DEEPSLATE_TILE_SLAB, MSBlocks.MOSSY_DEEPSLATE_TILES);
		AquiferBlockStates.registerStairs(gen, MSBlocks.MOSSY_DEEPSLATE_TILE_STAIRS, MSBlocks.MOSSY_DEEPSLATE_TILES);
		AquiferBlockStates.registerWall(gen, MSBlocks.MOSSY_DEEPSLATE_TILE_WALL, MSBlocks.MOSSY_DEEPSLATE_TILES);
		AquiferBlockStates.registerSlab(gen, MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILE_SLAB, MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILES);
		AquiferBlockStates.registerStairs(gen, MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILE_STAIRS, MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILES);
		AquiferBlockStates.registerWall(gen, MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILE_WALL, MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILES);
		
		AquiferBlockStates.registerSlab(gen, MSBlocks.MOSSY_TUFF_SLAB, MSBlocks.MOSSY_TUFF);
		AquiferBlockStates.registerStairs(gen, MSBlocks.MOSSY_TUFF_STAIRS, MSBlocks.MOSSY_TUFF);
		AquiferBlockStates.registerWall(gen, MSBlocks.MOSSY_TUFF_WALL, MSBlocks.MOSSY_TUFF);
		AquiferBlockStates.registerSlab(gen, MSBlocks.CRACKED_TUFF_BRICK_SLAB, MSBlocks.CRACKED_TUFF_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.CRACKED_TUFF_BRICK_STAIRS, MSBlocks.CRACKED_TUFF_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.CRACKED_TUFF_BRICK_WALL, MSBlocks.CRACKED_TUFF_BRICKS);
		AquiferBlockStates.registerSlab(gen, MSBlocks.MOSSY_TUFF_BRICK_SLAB, MSBlocks.MOSSY_TUFF_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.MOSSY_TUFF_BRICK_STAIRS, MSBlocks.MOSSY_TUFF_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.MOSSY_TUFF_BRICK_WALL, MSBlocks.MOSSY_TUFF_BRICKS);
		AquiferBlockStates.registerSlab(gen, MSBlocks.CRACKED_MOSSY_TUFF_BRICK_SLAB, MSBlocks.CRACKED_MOSSY_TUFF_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.CRACKED_MOSSY_TUFF_BRICK_STAIRS, MSBlocks.CRACKED_MOSSY_TUFF_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.CRACKED_MOSSY_TUFF_BRICK_WALL, MSBlocks.CRACKED_MOSSY_TUFF_BRICKS);
		AquiferBlockStates.registerSlab(gen, MSBlocks.CRACKED_CHISELED_TUFF_BRICK_SLAB, TextureMap.sideAndEndForTop(MSBlocks.CRACKED_CHISELED_TUFF_BRICKS), ModelIds.getBlockModelId(MSBlocks.CRACKED_CHISELED_TUFF_BRICKS));
		AquiferBlockStates.registerStairs(gen, MSBlocks.CRACKED_CHISELED_TUFF_BRICK_STAIRS, TextureMap.sideAndEndForTop(MSBlocks.CRACKED_CHISELED_TUFF_BRICKS));
		AquiferBlockStates.registerWallColumn(gen, MSBlocks.CRACKED_CHISELED_TUFF_BRICK_WALL, TextureMap.sideAndEndForTop(MSBlocks.CRACKED_CHISELED_TUFF_BRICKS));
		AquiferBlockStates.registerSlab(gen, MSBlocks.MOSSY_CHISELED_TUFF_BRICK_SLAB, TextureMap.sideAndEndForTop(MSBlocks.MOSSY_CHISELED_TUFF_BRICKS), ModelIds.getBlockModelId(MSBlocks.MOSSY_CHISELED_TUFF_BRICKS));
		AquiferBlockStates.registerStairs(gen, MSBlocks.MOSSY_CHISELED_TUFF_BRICK_STAIRS, TextureMap.sideAndEndForTop(MSBlocks.MOSSY_CHISELED_TUFF_BRICKS));
		AquiferBlockStates.registerWallColumn(gen, MSBlocks.MOSSY_CHISELED_TUFF_BRICK_WALL, TextureMap.sideAndEndForTop(MSBlocks.MOSSY_CHISELED_TUFF_BRICKS));
		AquiferBlockStates.registerSlab(gen, MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICK_SLAB, TextureMap.sideAndEndForTop(MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICKS), ModelIds.getBlockModelId(MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICKS));
		AquiferBlockStates.registerStairs(gen, MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICK_STAIRS, TextureMap.sideAndEndForTop(MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICKS));
		AquiferBlockStates.registerWallColumn(gen, MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICK_WALL, TextureMap.sideAndEndForTop(MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICKS));
		
		AquiferBlockStates.registerSlab(gen, MSBlocks.CRACKED_BRICK_SLAB, MSBlocks.CRACKED_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.CRACKED_BRICK_STAIRS, MSBlocks.CRACKED_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.CRACKED_BRICK_WALL, MSBlocks.CRACKED_BRICKS);
		
		AquiferBlockStates.registerSlab(gen, MSBlocks.CRACKED_MUD_BRICK_SLAB, MSBlocks.CRACKED_MUD_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.CRACKED_MUD_BRICK_STAIRS, MSBlocks.CRACKED_MUD_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.CRACKED_MUD_BRICK_WALL, MSBlocks.CRACKED_MUD_BRICKS);
		
		AquiferBlockStates.registerSlab(gen, MSBlocks.SANDSTONE_BRICK_SLAB, MSBlocks.SANDSTONE_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.SANDSTONE_BRICK_STAIRS, MSBlocks.SANDSTONE_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.SANDSTONE_BRICK_WALL, MSBlocks.SANDSTONE_BRICKS);
		AquiferBlockStates.registerSlab(gen, MSBlocks.CRACKED_SANDSTONE_BRICK_SLAB, MSBlocks.CRACKED_SANDSTONE_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.CRACKED_SANDSTONE_BRICK_STAIRS, MSBlocks.CRACKED_SANDSTONE_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.CRACKED_SANDSTONE_BRICK_WALL, MSBlocks.CRACKED_SANDSTONE_BRICKS);
		
		AquiferBlockStates.registerSlab(gen, MSBlocks.RED_SANDSTONE_BRICK_SLAB, MSBlocks.RED_SANDSTONE_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.RED_SANDSTONE_BRICK_STAIRS, MSBlocks.RED_SANDSTONE_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.RED_SANDSTONE_BRICK_WALL, MSBlocks.RED_SANDSTONE_BRICKS);
		AquiferBlockStates.registerSlab(gen, MSBlocks.CRACKED_RED_SANDSTONE_BRICK_SLAB, MSBlocks.CRACKED_RED_SANDSTONE_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.CRACKED_RED_SANDSTONE_BRICK_STAIRS, MSBlocks.CRACKED_RED_SANDSTONE_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.CRACKED_RED_SANDSTONE_BRICK_WALL, MSBlocks.CRACKED_RED_SANDSTONE_BRICKS);
		
		AquiferBlockStates.registerSlab(gen, MSBlocks.CRACKED_PRISMARINE_BRICK_SLAB, MSBlocks.CRACKED_PRISMARINE_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.CRACKED_PRISMARINE_BRICK_STAIRS, MSBlocks.CRACKED_PRISMARINE_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.CRACKED_PRISMARINE_BRICK_WALL, MSBlocks.CRACKED_PRISMARINE_BRICKS);
		
		AquiferBlockStates.registerSlab(gen, MSBlocks.CRACKED_CHISELED_NETHER_BRICK_SLAB, MSBlocks.CRACKED_CHISELED_NETHER_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.CRACKED_CHISELED_NETHER_BRICK_STAIRS, MSBlocks.CRACKED_CHISELED_NETHER_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.CRACKED_CHISELED_NETHER_BRICK_WALL, MSBlocks.CRACKED_CHISELED_NETHER_BRICKS);
		AquiferBlockStates.registerSlab(gen, MSBlocks.CRACKED_RED_NETHER_BRICK_SLAB, MSBlocks.CRACKED_RED_NETHER_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.CRACKED_RED_NETHER_BRICK_STAIRS, MSBlocks.CRACKED_RED_NETHER_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.CRACKED_RED_NETHER_BRICK_WALL, MSBlocks.CRACKED_RED_NETHER_BRICKS);
		AquiferBlockStates.registerFence(gen, MSBlocks.CRACKED_RED_NETHER_BRICK_FENCE, MSBlocks.CRACKED_RED_NETHER_BRICKS);
		AquiferBlockStates.registerFenceGate(gen, MSBlocks.CRACKED_RED_NETHER_BRICK_FENCE_GATE, MSBlocks.CRACKED_RED_NETHER_BRICKS);
		AquiferBlockStates.registerSlab(gen, MSBlocks.CHISELED_RED_NETHER_BRICK_SLAB, MSBlocks.CHISELED_RED_NETHER_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.CHISELED_RED_NETHER_BRICK_STAIRS, MSBlocks.CHISELED_RED_NETHER_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.CHISELED_RED_NETHER_BRICK_WALL, MSBlocks.CHISELED_RED_NETHER_BRICKS);
		AquiferBlockStates.registerSlab(gen, MSBlocks.CRACKED_CHISELED_RED_NETHER_BRICK_SLAB, MSBlocks.CRACKED_CHISELED_RED_NETHER_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.CRACKED_CHISELED_RED_NETHER_BRICK_STAIRS, MSBlocks.CRACKED_CHISELED_RED_NETHER_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.CRACKED_CHISELED_RED_NETHER_BRICK_WALL, MSBlocks.CRACKED_CHISELED_RED_NETHER_BRICKS);
		
		AquiferBlockStates.registerSlab(gen, MSBlocks.CRACKED_END_STONE_BRICK_SLAB, MSBlocks.CRACKED_END_STONE_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.CRACKED_END_STONE_BRICK_STAIRS, MSBlocks.CRACKED_END_STONE_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.CRACKED_END_STONE_BRICK_WALL, MSBlocks.CRACKED_END_STONE_BRICKS);
		
		AquiferBlockStates.registerSlab(gen, MSBlocks.CRACKED_QUARTZ_BRICK_SLAB, MSBlocks.CRACKED_QUARTZ_BRICKS);
		AquiferBlockStates.registerStairs(gen, MSBlocks.CRACKED_QUARTZ_BRICK_STAIRS, MSBlocks.CRACKED_QUARTZ_BRICKS);
		AquiferBlockStates.registerWall(gen, MSBlocks.CRACKED_QUARTZ_BRICK_WALL, MSBlocks.CRACKED_QUARTZ_BRICKS);
		
		gen.registerParented(MSBlocks.MOSSY_STONE, MSBlocks.INFESTED_MOSSY_STONE);
		gen.registerParented(MSBlocks.CRACKED_MOSSY_STONE_BRICKS, MSBlocks.INFESTED_CRACKED_MOSSY_STONE_BRICKS);
		gen.registerParented(MSBlocks.CRACKED_CHISELED_STONE_BRICKS, MSBlocks.INFESTED_CRACKED_CHISELED_STONE_BRICKS);
		gen.registerParented(MSBlocks.MOSSY_CHISELED_STONE_BRICKS, MSBlocks.INFESTED_MOSSY_CHISELED_STONE_BRICKS);
		gen.registerParented(MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICKS, MSBlocks.INFESTED_CRACKED_MOSSY_CHISELED_STONE_BRICKS);
		
		gen.registerParented(MSBlocks.MOSSY_GRANITE, MSBlocks.INFESTED_MOSSY_GRANITE);
		gen.registerParented(MSBlocks.COBBLED_GRANITE, MSBlocks.INFESTED_COBBLED_GRANITE);
		gen.registerParented(MSBlocks.MOSSY_COBBLED_GRANITE, MSBlocks.INFESTED_MOSSY_COBBLED_GRANITE);
		gen.registerParented(MSBlocks.GRANITE_BRICKS, MSBlocks.INFESTED_GRANITE_BRICKS);
		gen.registerParented(MSBlocks.CRACKED_GRANITE_BRICKS, MSBlocks.INFESTED_CRACKED_GRANITE_BRICKS);
		gen.registerParented(MSBlocks.MOSSY_GRANITE_BRICKS, MSBlocks.INFESTED_MOSSY_GRANITE_BRICKS);
		gen.registerParented(MSBlocks.CRACKED_MOSSY_GRANITE_BRICKS, MSBlocks.INFESTED_CRACKED_MOSSY_GRANITE_BRICKS);
		
		gen.registerParented(MSBlocks.MOSSY_DIORITE, MSBlocks.INFESTED_MOSSY_DIORITE);
		gen.registerParented(MSBlocks.COBBLED_DIORITE, MSBlocks.INFESTED_COBBLED_DIORITE);
		gen.registerParented(MSBlocks.MOSSY_COBBLED_DIORITE, MSBlocks.INFESTED_MOSSY_COBBLED_DIORITE);
		gen.registerParented(MSBlocks.DIORITE_BRICKS, MSBlocks.INFESTED_DIORITE_BRICKS);
		gen.registerParented(MSBlocks.CRACKED_DIORITE_BRICKS, MSBlocks.INFESTED_CRACKED_DIORITE_BRICKS);
		gen.registerParented(MSBlocks.MOSSY_DIORITE_BRICKS, MSBlocks.INFESTED_MOSSY_DIORITE_BRICKS);
		gen.registerParented(MSBlocks.CRACKED_MOSSY_DIORITE_BRICKS, MSBlocks.INFESTED_CRACKED_MOSSY_DIORITE_BRICKS);
		
		gen.registerParented(MSBlocks.MOSSY_ANDESITE, MSBlocks.INFESTED_MOSSY_ANDESITE);
		gen.registerParented(MSBlocks.COBBLED_ANDESITE, MSBlocks.INFESTED_COBBLED_ANDESITE);
		gen.registerParented(MSBlocks.MOSSY_COBBLED_ANDESITE, MSBlocks.INFESTED_MOSSY_COBBLED_ANDESITE);
		gen.registerParented(MSBlocks.ANDESITE_BRICKS, MSBlocks.INFESTED_ANDESITE_BRICKS);
		gen.registerParented(MSBlocks.CRACKED_ANDESITE_BRICKS, MSBlocks.INFESTED_CRACKED_ANDESITE_BRICKS);
		gen.registerParented(MSBlocks.MOSSY_ANDESITE_BRICKS, MSBlocks.INFESTED_MOSSY_ANDESITE_BRICKS);
		gen.registerParented(MSBlocks.CRACKED_MOSSY_ANDESITE_BRICKS, MSBlocks.INFESTED_CRACKED_MOSSY_ANDESITE_BRICKS);
		
		gen.registerParented(MSBlocks.MOSSY_DEEPSLATE, MSBlocks.INFESTED_MOSSY_DEEPSLATE);
		gen.registerParented(MSBlocks.MOSSY_COBBLED_DEEPSLATE, MSBlocks.INFESTED_MOSSY_COBBLED_DEEPSLATE);
		gen.registerParented(MSBlocks.MOSSY_DEEPSLATE_BRICKS, MSBlocks.INFESTED_MOSSY_DEEPSLATE_BRICKS);
		gen.registerParented(MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICKS, MSBlocks.INFESTED_CRACKED_MOSSY_DEEPSLATE_BRICKS);
		gen.registerParented(MSBlocks.MOSSY_DEEPSLATE_TILES, MSBlocks.INFESTED_MOSSY_DEEPSLATE_TILES);
		gen.registerParented(MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILES, MSBlocks.INFESTED_CRACKED_MOSSY_DEEPSLATE_TILES);
		
		gen.registerParented(MSBlocks.MOSSY_TUFF, MSBlocks.INFESTED_MOSSY_TUFF);
		gen.registerParented(MSBlocks.CRACKED_TUFF_BRICKS, MSBlocks.INFESTED_CRACKED_TUFF_BRICKS);
		gen.registerParented(MSBlocks.MOSSY_TUFF_BRICKS, MSBlocks.INFESTED_MOSSY_TUFF_BRICKS);
		gen.registerParented(MSBlocks.CRACKED_MOSSY_TUFF_BRICKS, MSBlocks.INFESTED_CRACKED_MOSSY_TUFF_BRICKS);
		gen.registerParented(MSBlocks.CRACKED_CHISELED_TUFF_BRICKS, MSBlocks.INFESTED_CRACKED_CHISELED_TUFF_BRICKS);
		gen.registerParented(MSBlocks.MOSSY_CHISELED_TUFF_BRICKS, MSBlocks.INFESTED_MOSSY_CHISELED_TUFF_BRICKS);
		gen.registerParented(MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICKS, MSBlocks.INFESTED_CRACKED_MOSSY_CHISELED_TUFF_BRICKS);
	}
	
	@Override
	public void generateItemModels(ItemModelGenerator gen) {
		
	}
}
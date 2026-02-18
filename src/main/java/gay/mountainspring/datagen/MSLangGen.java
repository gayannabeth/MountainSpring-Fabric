package gay.mountainspring.datagen;

import java.util.concurrent.CompletableFuture;

import gay.mountainspring.block.MSBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;

public class MSLangGen {
	private MSLangGen() {}
	
	public static final class EnUs extends FabricLanguageProvider {
		protected EnUs(FabricDataOutput dataOutput, CompletableFuture<WrapperLookup> registryLookup) {
			super(dataOutput, registryLookup);
		}
		
		@Override
		public void generateTranslations(WrapperLookup registryLookup, TranslationBuilder builder) {
			builder.add(MSBlocks.MOSSY_STONE, "Mossy Stone");
			builder.add(MSBlocks.CRACKED_MOSSY_STONE_BRICKS, "Cracked Mossy Stone Bricks");
			builder.add(MSBlocks.CRACKED_CHISELED_STONE_BRICKS, "Cracked Chiseled Stone Bricks");
			builder.add(MSBlocks.MOSSY_CHISELED_STONE_BRICKS, "Mossy Chiseled Stone Bricks");
			builder.add(MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICKS, "Cracked Mossy Chiseled Stone Bricks");
			
			builder.add(MSBlocks.MOSSY_GRANITE, "Mossy Granite");
			builder.add(MSBlocks.COBBLED_GRANITE, "Cobbled Granite");
			builder.add(MSBlocks.MOSSY_COBBLED_GRANITE, "Mossy Cobbled Granite");
			builder.add(MSBlocks.GRANITE_BRICKS, "Granite Bricks");
			builder.add(MSBlocks.CRACKED_GRANITE_BRICKS, "Cracked Granite Bricks");
			builder.add(MSBlocks.MOSSY_GRANITE_BRICKS, "Mossy Granite Bricks");
			builder.add(MSBlocks.CRACKED_MOSSY_GRANITE_BRICKS, "Cracked Mossy Granite Bricks");
			
			builder.add(MSBlocks.MOSSY_DIORITE, "Mossy Diorite");
			builder.add(MSBlocks.COBBLED_DIORITE, "Cobbled Diorite");
			builder.add(MSBlocks.MOSSY_COBBLED_DIORITE, "Mossy Cobbled Diorite");
			builder.add(MSBlocks.DIORITE_BRICKS, "Diorite Bricks");
			builder.add(MSBlocks.CRACKED_DIORITE_BRICKS, "Cracked Diorite Bricks");
			builder.add(MSBlocks.MOSSY_DIORITE_BRICKS, "Mossy Diorite Bricks");
			builder.add(MSBlocks.CRACKED_MOSSY_DIORITE_BRICKS, "Cracked Mossy Diorite Bricks");
			
			builder.add(MSBlocks.MOSSY_ANDESITE, "Mossy Andesite");
			builder.add(MSBlocks.COBBLED_ANDESITE, "Cobbled Andesite");
			builder.add(MSBlocks.MOSSY_COBBLED_ANDESITE, "Mossy Cobbled Andesite");
			builder.add(MSBlocks.ANDESITE_BRICKS, "Andesite Bricks");
			builder.add(MSBlocks.CRACKED_ANDESITE_BRICKS, "Cracked Andesite Bricks");
			builder.add(MSBlocks.MOSSY_ANDESITE_BRICKS, "Mossy Andesite Bricks");
			builder.add(MSBlocks.CRACKED_MOSSY_ANDESITE_BRICKS, "Cracked Mossy Andesite Bricks");
			
			builder.add(MSBlocks.MOSSY_DEEPSLATE, "Mossy Deepslate");
			builder.add(MSBlocks.MOSSY_COBBLED_DEEPSLATE, "Mossy Cobbled Deepslate");
			builder.add(MSBlocks.MOSSY_DEEPSLATE_BRICKS, "Mossy Deepslate Bricks");
			builder.add(MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICKS, "Cracked Mossy Deepslate Bricks");
			builder.add(MSBlocks.MOSSY_DEEPSLATE_TILES, "Mossy Deepslate Tiles");
			builder.add(MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILES, "Cracked Mossy Deepslate Tiles");
			
			builder.add(MSBlocks.MOSSY_TUFF, "Mossy Tuff");
			builder.add(MSBlocks.CRACKED_TUFF_BRICKS, "Cracked Tuff Bricks");
			builder.add(MSBlocks.MOSSY_TUFF_BRICKS, "Mossy Tuff Bricks");
			builder.add(MSBlocks.CRACKED_MOSSY_TUFF_BRICKS, "Cracked Mossy Tuff Bricks");
			builder.add(MSBlocks.CRACKED_CHISELED_TUFF_BRICKS, "Cracked Chiseled Tuff Bricks");
			builder.add(MSBlocks.MOSSY_CHISELED_TUFF_BRICKS, "Mossy Chiseled Tuff Bricks");
			builder.add(MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICKS, "Cracked Mossy Chiseled Tuff Bricks");
			
			builder.add(MSBlocks.CRACKED_BRICKS, "Cracked Bricks");
			builder.add(MSBlocks.MOSSY_BRICKS, "Mossy Bricks");
			builder.add(MSBlocks.CRACKED_MOSSY_BRICKS, "Cracked Mossy Bricks");
			
			builder.add(MSBlocks.CRACKED_MUD_BRICKS, "Cracked Mud Bricks");
			builder.add(MSBlocks.MOSSY_MUD_BRICKS, "Mossy Mud Bricks");
			builder.add(MSBlocks.CRACKED_MOSSY_MUD_BRICKS, "Cracked Mossy Mud Bricks");
			
			builder.add(MSBlocks.SANDSTONE_BRICKS, "Sandstone Bricks");
			builder.add(MSBlocks.CRACKED_SANDSTONE_BRICKS, "Cracked Sandstone Bricks");
			builder.add(MSBlocks.MOSSY_SANDSTONE_BRICKS, "Mossy Sandstone Bricks");
			builder.add(MSBlocks.CRACKED_MOSSY_SANDSTONE_BRICKS, "Cracked Mossy Sandstone Bricks");
			
			builder.add(MSBlocks.RED_SANDSTONE_BRICKS, "Red Sandstone Bricks");
			builder.add(MSBlocks.CRACKED_RED_SANDSTONE_BRICKS, "Cracked Red Sandstone Bricks");
			builder.add(MSBlocks.MOSSY_RED_SANDSTONE_BRICKS, "Mossy Red Sandstone Bricks");
			builder.add(MSBlocks.CRACKED_MOSSY_RED_SANDSTONE_BRICKS, "Cracked Mossy Red Sandstone Bricks");
			
			builder.add(MSBlocks.CRACKED_PRISMARINE_BRICKS, "Cracked Prismarine Bricks");
			
			builder.add(MSBlocks.CRACKED_CHISELED_NETHER_BRICKS, "Cracked Chiseled Nether Bricks");
			builder.add(MSBlocks.CRACKED_RED_NETHER_BRICKS, "Cracked Red Nether Bricks");
			builder.add(MSBlocks.CHISELED_RED_NETHER_BRICKS, "Chiseled Red Nether Bricks");
			builder.add(MSBlocks.CRACKED_CHISELED_RED_NETHER_BRICKS, "Cracked Chiseled Red Nether Bricks");
			
			builder.add(MSBlocks.CRACKED_END_STONE_BRICKS, "Cracked End Stone Bricks");
			
			builder.add(MSBlocks.CRACKED_QUARTZ_BRICKS, "Cracked Quartz Bricks");
			
			builder.add(MSBlocks.MOSSY_STONE_SLAB, "Mossy Stone Slab");
			builder.add(MSBlocks.MOSSY_STONE_STAIRS, "Mossy Stone Stairs");
			builder.add(MSBlocks.MOSSY_STONE_WALL, "Mossy Stone Wall");
			builder.add(MSBlocks.CRACKED_MOSSY_STONE_BRICK_SLAB, "Cracked Mossy Stone Brick Slab");
			builder.add(MSBlocks.CRACKED_MOSSY_STONE_BRICK_STAIRS, "Cracked Mossy Stone Brick Stairs");
			builder.add(MSBlocks.CRACKED_MOSSY_STONE_BRICK_WALL, "Cracked Mossy Stone Brick Wall");
			builder.add(MSBlocks.CRACKED_CHISELED_STONE_BRICK_SLAB, "Cracked Chiseled Stone Brick Slab");
			builder.add(MSBlocks.CRACKED_CHISELED_STONE_BRICK_STAIRS, "Cracked Chiseled Stone Brick Stairs");
			builder.add(MSBlocks.CRACKED_CHISELED_STONE_BRICK_WALL, "Cracked Chiseled Stone Brick Wall");
			builder.add(MSBlocks.MOSSY_CHISELED_STONE_BRICK_SLAB, "Mossy Chiseled Stone Brick Slab");
			builder.add(MSBlocks.MOSSY_CHISELED_STONE_BRICK_STAIRS, "Mossy Chiseled Stone Brick Stairs");
			builder.add(MSBlocks.MOSSY_CHISELED_STONE_BRICK_WALL, "Mossy Chiseled Stone Brick Wall");
			builder.add(MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICK_SLAB, "Cracked Mossy Chiseled Stone Brick Slab");
			builder.add(MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICK_STAIRS, "Cracked Mossy Chiseled Stone Brick Stairs");
			builder.add(MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICK_WALL, "Cracked Mossy Chiseled Stone Brick Wall");
			
			builder.add(MSBlocks.MOSSY_GRANITE_SLAB, "Mossy Granite Slab");
			builder.add(MSBlocks.MOSSY_GRANITE_STAIRS, "Mossy Granite Stairs");
			builder.add(MSBlocks.MOSSY_GRANITE_WALL, "Mossy Granite Wall");
			builder.add(MSBlocks.COBBLED_GRANITE_SLAB, "Cobbled Granite Slab");
			builder.add(MSBlocks.COBBLED_GRANITE_STAIRS, "Cobbled Granite Stairs");
			builder.add(MSBlocks.COBBLED_GRANITE_WALL, "Cobbled Granite Wall");
			builder.add(MSBlocks.MOSSY_COBBLED_GRANITE_SLAB, "Mossy Cobbled Granite Slab");
			builder.add(MSBlocks.MOSSY_COBBLED_GRANITE_STAIRS, "Mossy Cobbled Granite Stairs");
			builder.add(MSBlocks.MOSSY_COBBLED_GRANITE_WALL, "Mossy Cobbled Granite Wall");
			builder.add(MSBlocks.GRANITE_BRICK_SLAB, "Granite Brick Slab");
			builder.add(MSBlocks.GRANITE_BRICK_STAIRS, "Granite Brick Stairs");
			builder.add(MSBlocks.GRANITE_BRICK_WALL, "Granite Brick Wall");
			builder.add(MSBlocks.CRACKED_GRANITE_BRICK_SLAB, "Cracked Granite Brick Slab");
			builder.add(MSBlocks.CRACKED_GRANITE_BRICK_STAIRS, "Cracked Granite Brick Stairs");
			builder.add(MSBlocks.CRACKED_GRANITE_BRICK_WALL, "Cracked Granite Brick Wall");
			builder.add(MSBlocks.MOSSY_GRANITE_BRICK_SLAB, "Mossy Granite Brick Slab");
			builder.add(MSBlocks.MOSSY_GRANITE_BRICK_STAIRS, "Mossy Granite Brick Stairs");
			builder.add(MSBlocks.MOSSY_GRANITE_BRICK_WALL, "Mossy Granite Brick Wall");
			builder.add(MSBlocks.CRACKED_MOSSY_GRANITE_BRICK_SLAB, "Cracked Mossy Granite Brick Slab");
			builder.add(MSBlocks.CRACKED_MOSSY_GRANITE_BRICK_STAIRS, "Cracked Mossy Granite Brick Stairs");
			builder.add(MSBlocks.CRACKED_MOSSY_GRANITE_BRICK_WALL, "Cracked Mossy Granite Brick Wall");
			
			builder.add(MSBlocks.MOSSY_DIORITE_SLAB, "Mossy Diorite Slab");
			builder.add(MSBlocks.MOSSY_DIORITE_STAIRS, "Mossy Diorite Stairs");
			builder.add(MSBlocks.MOSSY_DIORITE_WALL, "Mossy Diorite Wall");
			builder.add(MSBlocks.COBBLED_DIORITE_SLAB, "Cobbled Diorite Slab");
			builder.add(MSBlocks.COBBLED_DIORITE_STAIRS, "Cobbled Diorite Stairs");
			builder.add(MSBlocks.COBBLED_DIORITE_WALL, "Cobbled Diorite Wall");
			builder.add(MSBlocks.MOSSY_COBBLED_DIORITE_SLAB, "Mossy Cobbled Diorite Slab");
			builder.add(MSBlocks.MOSSY_COBBLED_DIORITE_STAIRS, "Mossy Cobbled Diorite Stairs");
			builder.add(MSBlocks.MOSSY_COBBLED_DIORITE_WALL, "Mossy Cobbled Diorite Wall");
			builder.add(MSBlocks.DIORITE_BRICK_SLAB, "Diorite Brick Slab");
			builder.add(MSBlocks.DIORITE_BRICK_STAIRS, "Diorite Brick Stairs");
			builder.add(MSBlocks.DIORITE_BRICK_WALL, "Diorite Brick Wall");
			builder.add(MSBlocks.CRACKED_DIORITE_BRICK_SLAB, "Cracked Diorite Brick Slab");
			builder.add(MSBlocks.CRACKED_DIORITE_BRICK_STAIRS, "Cracked Diorite Brick Stairs");
			builder.add(MSBlocks.CRACKED_DIORITE_BRICK_WALL, "Cracked Diorite Brick Wall");
			builder.add(MSBlocks.MOSSY_DIORITE_BRICK_SLAB, "Mossy Diorite Brick Slab");
			builder.add(MSBlocks.MOSSY_DIORITE_BRICK_STAIRS, "Mossy Diorite Brick Stairs");
			builder.add(MSBlocks.MOSSY_DIORITE_BRICK_WALL, "Mossy Diorite Brick Wall");
			builder.add(MSBlocks.CRACKED_MOSSY_DIORITE_BRICK_SLAB, "Cracked Mossy Diorite Brick Slab");
			builder.add(MSBlocks.CRACKED_MOSSY_DIORITE_BRICK_STAIRS, "Cracked Mossy Diorite Brick Stairs");
			builder.add(MSBlocks.CRACKED_MOSSY_DIORITE_BRICK_WALL, "Cracked Mossy Diorite Brick Wall");
			
			builder.add(MSBlocks.MOSSY_ANDESITE_SLAB, "Mossy Andesite Slab");
			builder.add(MSBlocks.MOSSY_ANDESITE_STAIRS, "Mossy Andesite Stairs");
			builder.add(MSBlocks.MOSSY_ANDESITE_WALL, "Mossy Andesite Wall");
			builder.add(MSBlocks.COBBLED_ANDESITE_SLAB, "Cobbled Andesite Slab");
			builder.add(MSBlocks.COBBLED_ANDESITE_STAIRS, "Cobbled Andesite Stairs");
			builder.add(MSBlocks.COBBLED_ANDESITE_WALL, "Cobbled Andesite Wall");
			builder.add(MSBlocks.MOSSY_COBBLED_ANDESITE_SLAB, "Mossy Cobbled Andesite Slab");
			builder.add(MSBlocks.MOSSY_COBBLED_ANDESITE_STAIRS, "Mossy Cobbled Andesite Stairs");
			builder.add(MSBlocks.MOSSY_COBBLED_ANDESITE_WALL, "Mossy Cobbled Andesite Wall");
			builder.add(MSBlocks.ANDESITE_BRICK_SLAB, "Andesite Brick Slab");
			builder.add(MSBlocks.ANDESITE_BRICK_STAIRS, "Andesite Brick Stairs");
			builder.add(MSBlocks.ANDESITE_BRICK_WALL, "Andesite Brick Wall");
			builder.add(MSBlocks.CRACKED_ANDESITE_BRICK_SLAB, "Cracked Andesite Brick Slab");
			builder.add(MSBlocks.CRACKED_ANDESITE_BRICK_STAIRS, "Cracked Andesite Brick Stairs");
			builder.add(MSBlocks.CRACKED_ANDESITE_BRICK_WALL, "Cracked Andesite Brick Wall");
			builder.add(MSBlocks.MOSSY_ANDESITE_BRICK_SLAB, "Mossy Andesite Brick Slab");
			builder.add(MSBlocks.MOSSY_ANDESITE_BRICK_STAIRS, "Mossy Andesite Brick Stairs");
			builder.add(MSBlocks.MOSSY_ANDESITE_BRICK_WALL, "Mossy Andesite Brick Wall");
			builder.add(MSBlocks.CRACKED_MOSSY_ANDESITE_BRICK_SLAB, "Cracked Mossy Andesite Brick Slab");
			builder.add(MSBlocks.CRACKED_MOSSY_ANDESITE_BRICK_STAIRS, "Cracked Mossy Andesite Brick Stairs");
			builder.add(MSBlocks.CRACKED_MOSSY_ANDESITE_BRICK_WALL, "Cracked Mossy Andesite Brick Wall");
			
			builder.add(MSBlocks.MOSSY_DEEPSLATE_SLAB, "Mossy Deepslate Slab");
			builder.add(MSBlocks.MOSSY_DEEPSLATE_STAIRS, "Mossy Deepslate Stairs");
			builder.add(MSBlocks.MOSSY_DEEPSLATE_WALL, "Mossy Deepslate Wall");
			builder.add(MSBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB, "Mossy Cobbled Deepslate Slab");
			builder.add(MSBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS, "Mossy Cobbled Deepslate Stairs");
			builder.add(MSBlocks.MOSSY_COBBLED_DEEPSLATE_WALL, "Mossy Cobbled Deepslate Wall");
			builder.add(MSBlocks.MOSSY_DEEPSLATE_BRICK_SLAB, "Mossy Deepslate Brick Slab");
			builder.add(MSBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS, "Mossy Deepslate Brick Stairs");
			builder.add(MSBlocks.MOSSY_DEEPSLATE_BRICK_WALL, "Mossy Deepslate Brick Wall");
			builder.add(MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICK_SLAB, "Cracked Mossy Deepslate Brick Slab");
			builder.add(MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICK_STAIRS, "Cracked Mossy Deepslate Brick Stairs");
			builder.add(MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICK_WALL, "Cracked Mossy Deepslate Brick Wall");
			builder.add(MSBlocks.MOSSY_DEEPSLATE_TILE_SLAB, "Mossy Deepslate Tile Slab");
			builder.add(MSBlocks.MOSSY_DEEPSLATE_TILE_STAIRS, "Mossy Deepslate Tile Stairs");
			builder.add(MSBlocks.MOSSY_DEEPSLATE_TILE_WALL, "Mossy Deepslate Tile Wall");
			builder.add(MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILE_SLAB, "Cracked Mossy Deepslate Tile Slab");
			builder.add(MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILE_STAIRS, "Cracked Mossy Deepslate Tile Stairs");
			builder.add(MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILE_WALL, "Cracked Mossy Deepslate Tile Wall");
			
			builder.add(MSBlocks.MOSSY_TUFF_SLAB, "Mossy Tuff Slab");
			builder.add(MSBlocks.MOSSY_TUFF_STAIRS, "Mossy Tuff Stairs");
			builder.add(MSBlocks.MOSSY_TUFF_WALL, "Mossy Tuff Wall");
			builder.add(MSBlocks.CRACKED_TUFF_BRICK_SLAB, "Cracked Tuff Brick Slab");
			builder.add(MSBlocks.CRACKED_TUFF_BRICK_STAIRS, "Cracked Tuff Brick Stairs");
			builder.add(MSBlocks.CRACKED_TUFF_BRICK_WALL, "Cracked Tuff Brick Wall");
			builder.add(MSBlocks.MOSSY_TUFF_BRICK_SLAB, "Mossy Tuff Brick Slab");
			builder.add(MSBlocks.MOSSY_TUFF_BRICK_STAIRS, "Mossy Tuff Brick Stairs");
			builder.add(MSBlocks.MOSSY_TUFF_BRICK_WALL, "Mossy Tuff Brick Wall");
			builder.add(MSBlocks.CRACKED_MOSSY_TUFF_BRICK_SLAB, "Cracked Mossy Tuff Brick Slab");
			builder.add(MSBlocks.CRACKED_MOSSY_TUFF_BRICK_STAIRS, "Cracked Mossy Tuff Brick Stairs");
			builder.add(MSBlocks.CRACKED_MOSSY_TUFF_BRICK_WALL, "Cracked Mossy Tuff Brick Wall");
			builder.add(MSBlocks.CRACKED_CHISELED_TUFF_BRICK_SLAB, "Cracked Chiseled Tuff Brick Slab");
			builder.add(MSBlocks.CRACKED_CHISELED_TUFF_BRICK_STAIRS, "Cracked Chiseled Tuff Brick Stairs");
			builder.add(MSBlocks.CRACKED_CHISELED_TUFF_BRICK_WALL, "Cracked Chiseled Tuff Brick Wall");
			builder.add(MSBlocks.MOSSY_CHISELED_TUFF_BRICK_SLAB, "Mossy Chiseled Tuff Brick Slab");
			builder.add(MSBlocks.MOSSY_CHISELED_TUFF_BRICK_STAIRS, "Mossy Chiseled Tuff Brick Stairs");
			builder.add(MSBlocks.MOSSY_CHISELED_TUFF_BRICK_WALL, "Mossy Chiseled Tuff Brick Wall");
			builder.add(MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICK_SLAB, "Cracked Mossy Chiseled Tuff Brick Slab");
			builder.add(MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICK_STAIRS, "Cracked Mossy Chiseled Tuff Brick Stairs");
			builder.add(MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICK_WALL, "Cracked Mossy Chiseled Tuff Brick Wall");
			
			builder.add(MSBlocks.CRACKED_BRICK_SLAB, "Cracked Brick Slab");
			builder.add(MSBlocks.CRACKED_BRICK_STAIRS, "Cracked Brick Stairs");
			builder.add(MSBlocks.CRACKED_BRICK_WALL, "Cracked Brick Wall");
			builder.add(MSBlocks.MOSSY_BRICK_SLAB, "Mossy Brick Slab");
			builder.add(MSBlocks.MOSSY_BRICK_STAIRS, "Mossy Brick Stairs");
			builder.add(MSBlocks.MOSSY_BRICK_WALL, "Mossy Brick Wall");
			builder.add(MSBlocks.CRACKED_MOSSY_BRICK_SLAB, "Cracked Mossy Brick Slab");
			builder.add(MSBlocks.CRACKED_MOSSY_BRICK_STAIRS, "Cracked Mossy Brick Stairs");
			builder.add(MSBlocks.CRACKED_MOSSY_BRICK_WALL, "Cracked Mossy Brick Wall");
			
			builder.add(MSBlocks.CRACKED_MUD_BRICK_SLAB, "Cracked Mud Brick Slab");
			builder.add(MSBlocks.CRACKED_MUD_BRICK_STAIRS, "Cracked Mud Brick Stairs");
			builder.add(MSBlocks.CRACKED_MUD_BRICK_WALL, "Cracked Mud Brick Wall");
			builder.add(MSBlocks.MOSSY_MUD_BRICK_SLAB, "Mossy Mud Brick Slab");
			builder.add(MSBlocks.MOSSY_MUD_BRICK_STAIRS, "Mossy Mud Brick Stairs");
			builder.add(MSBlocks.MOSSY_MUD_BRICK_WALL, "Mossy Mud Brick Wall");
			builder.add(MSBlocks.CRACKED_MOSSY_MUD_BRICK_SLAB, "Cracked Mossy Mud Brick Slab");
			builder.add(MSBlocks.CRACKED_MOSSY_MUD_BRICK_STAIRS, "Cracked Mossy Mud Brick Stairs");
			builder.add(MSBlocks.CRACKED_MOSSY_MUD_BRICK_WALL, "Cracked Mossy Mud Brick Wall");
			
			builder.add(MSBlocks.SANDSTONE_BRICK_SLAB, "Sandstone Brick Slab");
			builder.add(MSBlocks.SANDSTONE_BRICK_STAIRS, "Sandstone Brick Stairs");
			builder.add(MSBlocks.SANDSTONE_BRICK_WALL, "Sandstone Brick Wall");
			builder.add(MSBlocks.CRACKED_SANDSTONE_BRICK_SLAB, "Cracked Sandstone Brick Slab");
			builder.add(MSBlocks.CRACKED_SANDSTONE_BRICK_STAIRS, "Cracked Sandstone Brick Stairs");
			builder.add(MSBlocks.CRACKED_SANDSTONE_BRICK_WALL, "Cracked Sandstone Brick Wall");
			builder.add(MSBlocks.MOSSY_SANDSTONE_BRICK_SLAB, "Mossy Sandstone Brick Slab");
			builder.add(MSBlocks.MOSSY_SANDSTONE_BRICK_STAIRS, "Mossy Sandstone Brick Stairs");
			builder.add(MSBlocks.MOSSY_SANDSTONE_BRICK_WALL, "Mossy Sandstone Brick Wall");
			builder.add(MSBlocks.CRACKED_MOSSY_SANDSTONE_BRICK_SLAB, "Cracked Mossy Sandstone Brick Slab");
			builder.add(MSBlocks.CRACKED_MOSSY_SANDSTONE_BRICK_STAIRS, "Cracked Mossy Sandstone Brick Stairs");
			builder.add(MSBlocks.CRACKED_MOSSY_SANDSTONE_BRICK_WALL, "Cracked Mossy Sandstone Brick Wall");
			
			builder.add(MSBlocks.RED_SANDSTONE_BRICK_SLAB, "Red Sandstone Brick Slab");
			builder.add(MSBlocks.RED_SANDSTONE_BRICK_STAIRS, "Red Sandstone Brick Stairs");
			builder.add(MSBlocks.RED_SANDSTONE_BRICK_WALL, "Red Sandstone Brick Wall");
			builder.add(MSBlocks.CRACKED_RED_SANDSTONE_BRICK_SLAB, "Cracked Red Sandstone Brick Slab");
			builder.add(MSBlocks.CRACKED_RED_SANDSTONE_BRICK_STAIRS, "Cracked Red Sandstone Brick Stairs");
			builder.add(MSBlocks.CRACKED_RED_SANDSTONE_BRICK_WALL, "Cracked Red Sandstone Brick Wall");
			builder.add(MSBlocks.MOSSY_RED_SANDSTONE_BRICK_SLAB, "Mossy Red Sandstone Brick Slab");
			builder.add(MSBlocks.MOSSY_RED_SANDSTONE_BRICK_STAIRS, "Mossy Red Sandstone Brick Stairs");
			builder.add(MSBlocks.MOSSY_RED_SANDSTONE_BRICK_WALL, "Mossy Red Sandstone Brick Wall");
			builder.add(MSBlocks.CRACKED_MOSSY_RED_SANDSTONE_BRICK_SLAB, "Cracked Mossy Red Sandstone Brick Slab");
			builder.add(MSBlocks.CRACKED_MOSSY_RED_SANDSTONE_BRICK_STAIRS, "Cracked Mossy Red Sandstone Brick Stairs");
			builder.add(MSBlocks.CRACKED_MOSSY_RED_SANDSTONE_BRICK_WALL, "Cracked Mossy Red Sandstone Brick Wall");
			
			builder.add(MSBlocks.CRACKED_PRISMARINE_BRICK_SLAB, "Cracked Prismarine Brick Slab");
			builder.add(MSBlocks.CRACKED_PRISMARINE_BRICK_STAIRS, "Cracked Prismarine Brick Stairs");
			builder.add(MSBlocks.CRACKED_PRISMARINE_BRICK_WALL, "Cracked Prismarine Brick Wall");
			
			builder.add(MSBlocks.CRACKED_CHISELED_NETHER_BRICK_SLAB, "Cracked Chiseled Nether Brick Slab");
			builder.add(MSBlocks.CRACKED_CHISELED_NETHER_BRICK_STAIRS, "Cracked Chiseled Nether Brick Stairs");
			builder.add(MSBlocks.CRACKED_CHISELED_NETHER_BRICK_WALL, "Cracked Chiseled Nether Brick Wall");
			builder.add(MSBlocks.CRACKED_RED_NETHER_BRICK_SLAB, "Cracked Red Nether Brick Slab");
			builder.add(MSBlocks.CRACKED_RED_NETHER_BRICK_STAIRS, "Cracked Red Nether Brick Stairs");
			builder.add(MSBlocks.CRACKED_RED_NETHER_BRICK_WALL, "Cracked Red Nether Brick Wall");
			builder.add(MSBlocks.CRACKED_RED_NETHER_BRICK_FENCE, "Cracked Red Nether Brick Fence");
			builder.add(MSBlocks.CRACKED_RED_NETHER_BRICK_FENCE_GATE, "Cracked Red Nether Brick Fence Gate");
			builder.add(MSBlocks.CHISELED_RED_NETHER_BRICK_SLAB, "Chiseled Red Nether Brick Slab");
			builder.add(MSBlocks.CHISELED_RED_NETHER_BRICK_STAIRS, "Chiseled Red Nether Brick Stairs");
			builder.add(MSBlocks.CHISELED_RED_NETHER_BRICK_WALL, "Chiseled Red Nether Brick Wall");
			builder.add(MSBlocks.CRACKED_CHISELED_RED_NETHER_BRICK_SLAB, "Cracked Chiseled Red Nether Brick Slab");
			builder.add(MSBlocks.CRACKED_CHISELED_RED_NETHER_BRICK_STAIRS, "Cracked Chiseled Red Nether Brick Stairs");
			builder.add(MSBlocks.CRACKED_CHISELED_RED_NETHER_BRICK_WALL, "Cracked Chiseled Red Nether Brick Wall");
			
			builder.add(MSBlocks.CRACKED_END_STONE_BRICK_SLAB, "Cracked End Stone Brick Slab");
			builder.add(MSBlocks.CRACKED_END_STONE_BRICK_STAIRS, "Cracked End Stone Brick Stairs");
			builder.add(MSBlocks.CRACKED_END_STONE_BRICK_WALL, "Cracked End Stone Brick Wall");
			
			builder.add(MSBlocks.CRACKED_QUARTZ_BRICK_SLAB, "Cracked Quartz Brick Slab");
			builder.add(MSBlocks.CRACKED_QUARTZ_BRICK_STAIRS, "Cracked Quartz Brick Stairs");
			builder.add(MSBlocks.CRACKED_QUARTZ_BRICK_WALL, "Cracked Quartz Brick Wall");
			
			builder.add(MSBlocks.INFESTED_MOSSY_STONE, "Infested Mossy Stone");
			builder.add(MSBlocks.INFESTED_CRACKED_MOSSY_STONE_BRICKS, "Infested Cracked Mossy Stone Bricks");
			builder.add(MSBlocks.INFESTED_CRACKED_CHISELED_STONE_BRICKS, "Infested Cracked Chiseled Stone Bricks");
			builder.add(MSBlocks.INFESTED_MOSSY_CHISELED_STONE_BRICKS, "Infested Mossy Chiseled Stone Bricks");
			builder.add(MSBlocks.INFESTED_CRACKED_MOSSY_CHISELED_STONE_BRICKS, "Infested Cracked Mossy Chiseled Stone Bricks");
			
			builder.add(MSBlocks.INFESTED_MOSSY_GRANITE, "Infested Mossy Granite");
			builder.add(MSBlocks.INFESTED_COBBLED_GRANITE, "Infested Cobbled Granite");
			builder.add(MSBlocks.INFESTED_MOSSY_COBBLED_GRANITE, "Infested Mossy Cobbled Granite");
			builder.add(MSBlocks.INFESTED_GRANITE_BRICKS, "Infested Granite Bricks");
			builder.add(MSBlocks.INFESTED_CRACKED_GRANITE_BRICKS, "Infested Cracked Granite Bricks");
			builder.add(MSBlocks.INFESTED_MOSSY_GRANITE_BRICKS, "Infested Mossy Granite Bricks");
			builder.add(MSBlocks.INFESTED_CRACKED_MOSSY_GRANITE_BRICKS, "Infested Cracked Mossy Granite Bricks");
			
			builder.add(MSBlocks.INFESTED_MOSSY_DIORITE, "Infested Mossy Diorite");
			builder.add(MSBlocks.INFESTED_COBBLED_DIORITE, "Infested Cobbled Diorite");
			builder.add(MSBlocks.INFESTED_MOSSY_COBBLED_DIORITE, "Infested Mossy Cobbled Diorite");
			builder.add(MSBlocks.INFESTED_DIORITE_BRICKS, "Infested Diorite Bricks");
			builder.add(MSBlocks.INFESTED_CRACKED_DIORITE_BRICKS, "Infested Cracked Diorite Bricks");
			builder.add(MSBlocks.INFESTED_MOSSY_DIORITE_BRICKS, "Infested Mossy Diorite Bricks");
			builder.add(MSBlocks.INFESTED_CRACKED_MOSSY_DIORITE_BRICKS, "Infested Cracked Mossy Diorite Bricks");
			
			builder.add(MSBlocks.INFESTED_MOSSY_ANDESITE, "Infested Mossy Andesite");
			builder.add(MSBlocks.INFESTED_COBBLED_ANDESITE, "Infested Cobbled Andesite");
			builder.add(MSBlocks.INFESTED_MOSSY_COBBLED_ANDESITE, "Infested Mossy Cobbled Andesite");
			builder.add(MSBlocks.INFESTED_ANDESITE_BRICKS, "Infested Andesite Bricks");
			builder.add(MSBlocks.INFESTED_CRACKED_ANDESITE_BRICKS, "Infested Cracked Andesite Bricks");
			builder.add(MSBlocks.INFESTED_MOSSY_ANDESITE_BRICKS, "Infested Mossy Andesite Bricks");
			builder.add(MSBlocks.INFESTED_CRACKED_MOSSY_ANDESITE_BRICKS, "Infested Cracked Mossy Andesite Bricks");
			
			builder.add(MSBlocks.INFESTED_MOSSY_DEEPSLATE, "Infested Mossy Deepslate");
			builder.add(MSBlocks.INFESTED_MOSSY_COBBLED_DEEPSLATE, "Infested Mossy Cobbled Deepslate");
			builder.add(MSBlocks.INFESTED_MOSSY_DEEPSLATE_BRICKS, "Infested Mossy Deepslate Bricks");
			builder.add(MSBlocks.INFESTED_CRACKED_MOSSY_DEEPSLATE_BRICKS, "Infested Cracked Mossy Deepslate Bricks");
			builder.add(MSBlocks.INFESTED_MOSSY_DEEPSLATE_TILES, "Infested Mossy Deepslate Tiles");
			builder.add(MSBlocks.INFESTED_CRACKED_MOSSY_DEEPSLATE_TILES, "Infested Cracked Mossy Deepslate Tiles");
			
			builder.add(MSBlocks.INFESTED_MOSSY_TUFF, "Infested Mossy Tuff");
			builder.add(MSBlocks.INFESTED_CRACKED_TUFF_BRICKS, "Infested Cracked Tuff Bricks");
			builder.add(MSBlocks.INFESTED_MOSSY_TUFF_BRICKS, "Infested Mossy Tuff Bricks");
			builder.add(MSBlocks.INFESTED_CRACKED_MOSSY_TUFF_BRICKS, "Infested Cracked Mossy Tuff Bricks");
			builder.add(MSBlocks.INFESTED_CRACKED_CHISELED_TUFF_BRICKS, "Infested Cracked Chiseled Tuff Bricks");
			builder.add(MSBlocks.INFESTED_MOSSY_CHISELED_TUFF_BRICKS, "Infested Mossy Chiseled Tuff Bricks");
			builder.add(MSBlocks.INFESTED_CRACKED_MOSSY_CHISELED_TUFF_BRICKS, "Infested Cracked Mossy Chiseled Tuff Bricks");
		}
	}
	
	public static final class EnCa extends FabricLanguageProvider {
		protected EnCa(FabricDataOutput dataOutput, CompletableFuture<WrapperLookup> registryLookup) {
			super(dataOutput, "en_ca", registryLookup);
		}
		
		@Override
		public void generateTranslations(WrapperLookup registryLookup, TranslationBuilder builder) {
			
		}
	}
}
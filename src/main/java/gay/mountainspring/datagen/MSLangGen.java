package gay.mountainspring.datagen;

import java.util.concurrent.CompletableFuture;

import gay.mountainspring.block.MSBlocks;
import gay.mountainspring.item.MSItems;
import gay.mountainspring.sswplus.block.SSWPBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.block.Blocks;
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
			builder.add(MSBlocks.MOSSY_STONE_SLAB, "Mossy Stone Slab");
			builder.add(MSBlocks.MOSSY_STONE_STAIRS, "Mossy Stone Stairs");
			builder.add(MSBlocks.MOSSY_STONE_WALL, "Mossy Stone Wall");
			builder.add(MSBlocks.CRACKED_MOSSY_STONE_BRICKS, "Cracked Mossy Stone Bricks");
			builder.add(MSBlocks.CRACKED_MOSSY_STONE_BRICK_SLAB, "Cracked Mossy Stone Brick Slab");
			builder.add(MSBlocks.CRACKED_MOSSY_STONE_BRICK_STAIRS, "Cracked Mossy Stone Brick Stairs");
			builder.add(MSBlocks.CRACKED_MOSSY_STONE_BRICK_WALL, "Cracked Mossy Stone Brick Wall");
			builder.add(MSBlocks.CRACKED_CHISELED_STONE_BRICKS, "Cracked Chiseled Stone Bricks");
			builder.add(MSBlocks.CRACKED_CHISELED_STONE_BRICK_SLAB, "Cracked Chiseled Stone Brick Slab");
			builder.add(MSBlocks.CRACKED_CHISELED_STONE_BRICK_STAIRS, "Cracked Chiseled Stone Brick Stairs");
			builder.add(MSBlocks.CRACKED_CHISELED_STONE_BRICK_WALL, "Cracked Chiseled Stone Brick Wall");
			builder.add(MSBlocks.MOSSY_CHISELED_STONE_BRICKS, "Mossy Chiseled Stone Bricks");
			builder.add(MSBlocks.MOSSY_CHISELED_STONE_BRICK_SLAB, "Mossy Chiseled Stone Brick Slab");
			builder.add(MSBlocks.MOSSY_CHISELED_STONE_BRICK_STAIRS, "Mossy Chiseled Stone Brick Stairs");
			builder.add(MSBlocks.MOSSY_CHISELED_STONE_BRICK_WALL, "Mossy Chiseled Stone Brick Wall");
			builder.add(MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICKS, "Cracked Mossy Chiseled Stone Bricks");
			builder.add(MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICK_SLAB, "Cracked Mossy Chiseled Stone Brick Slab");
			builder.add(MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICK_STAIRS, "Cracked Mossy Chiseled Stone Brick Stairs");
			builder.add(MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICK_WALL, "Cracked Mossy Chiseled Stone Brick Wall");
			
			builder.add(MSBlocks.MOSSY_GRANITE, "Mossy Granite");
			builder.add(MSBlocks.MOSSY_GRANITE_SLAB, "Mossy Granite Slab");
			builder.add(MSBlocks.MOSSY_GRANITE_STAIRS, "Mossy Granite Stairs");
			builder.add(MSBlocks.MOSSY_GRANITE_WALL, "Mossy Granite Wall");
			builder.add(MSBlocks.COBBLED_GRANITE, "Cobbled Granite");
			builder.add(MSBlocks.COBBLED_GRANITE_SLAB, "Cobbled Granite Slab");
			builder.add(MSBlocks.COBBLED_GRANITE_STAIRS, "Cobbled Granite Stairs");
			builder.add(MSBlocks.COBBLED_GRANITE_WALL, "Cobbled Granite Wall");
			builder.add(MSBlocks.MOSSY_COBBLED_GRANITE, "Mossy Cobbled Granite");
			builder.add(MSBlocks.MOSSY_COBBLED_GRANITE_SLAB, "Mossy Cobbled Granite Slab");
			builder.add(MSBlocks.MOSSY_COBBLED_GRANITE_STAIRS, "Mossy Cobbled Granite Stairs");
			builder.add(MSBlocks.MOSSY_COBBLED_GRANITE_WALL, "Mossy Cobbled Granite Wall");
			builder.add(MSBlocks.GRANITE_BRICKS, "Granite Bricks");
			builder.add(MSBlocks.GRANITE_BRICK_SLAB, "Granite Brick Slab");
			builder.add(MSBlocks.GRANITE_BRICK_STAIRS, "Granite Brick Stairs");
			builder.add(MSBlocks.GRANITE_BRICK_WALL, "Granite Brick Wall");
			builder.add(MSBlocks.CRACKED_GRANITE_BRICKS, "Cracked Granite Bricks");
			builder.add(MSBlocks.CRACKED_GRANITE_BRICK_SLAB, "Cracked Granite Brick Slab");
			builder.add(MSBlocks.CRACKED_GRANITE_BRICK_STAIRS, "Cracked Granite Brick Stairs");
			builder.add(MSBlocks.CRACKED_GRANITE_BRICK_WALL, "Cracked Granite Brick Wall");
			builder.add(MSBlocks.MOSSY_GRANITE_BRICKS, "Mossy Granite Bricks");
			builder.add(MSBlocks.MOSSY_GRANITE_BRICK_SLAB, "Mossy Granite Brick Slab");
			builder.add(MSBlocks.MOSSY_GRANITE_BRICK_STAIRS, "Mossy Granite Brick Stairs");
			builder.add(MSBlocks.MOSSY_GRANITE_BRICK_WALL, "Mossy Granite Brick Wall");
			builder.add(MSBlocks.CRACKED_MOSSY_GRANITE_BRICKS, "Cracked Mossy Granite Bricks");
			builder.add(MSBlocks.CRACKED_MOSSY_GRANITE_BRICK_SLAB, "Cracked Mossy Granite Brick Slab");
			builder.add(MSBlocks.CRACKED_MOSSY_GRANITE_BRICK_STAIRS, "Cracked Mossy Granite Brick Stairs");
			builder.add(MSBlocks.CRACKED_MOSSY_GRANITE_BRICK_WALL, "Cracked Mossy Granite Brick Wall");
			
			builder.add(MSBlocks.MOSSY_DIORITE, "Mossy Diorite");
			builder.add(MSBlocks.MOSSY_DIORITE_SLAB, "Mossy Diorite Slab");
			builder.add(MSBlocks.MOSSY_DIORITE_STAIRS, "Mossy Diorite Stairs");
			builder.add(MSBlocks.MOSSY_DIORITE_WALL, "Mossy Diorite Wall");
			builder.add(MSBlocks.COBBLED_DIORITE, "Cobbled Diorite");
			builder.add(MSBlocks.COBBLED_DIORITE_SLAB, "Cobbled Diorite Slab");
			builder.add(MSBlocks.COBBLED_DIORITE_STAIRS, "Cobbled Diorite Stairs");
			builder.add(MSBlocks.COBBLED_DIORITE_WALL, "Cobbled Diorite Wall");
			builder.add(MSBlocks.MOSSY_COBBLED_DIORITE, "Mossy Cobbled Diorite");
			builder.add(MSBlocks.MOSSY_COBBLED_DIORITE_SLAB, "Mossy Cobbled Diorite Slab");
			builder.add(MSBlocks.MOSSY_COBBLED_DIORITE_STAIRS, "Mossy Cobbled Diorite Stairs");
			builder.add(MSBlocks.MOSSY_COBBLED_DIORITE_WALL, "Mossy Cobbled Diorite Wall");
			builder.add(MSBlocks.DIORITE_BRICKS, "Diorite Bricks");
			builder.add(MSBlocks.DIORITE_BRICK_SLAB, "Diorite Brick Slab");
			builder.add(MSBlocks.DIORITE_BRICK_STAIRS, "Diorite Brick Stairs");
			builder.add(MSBlocks.DIORITE_BRICK_WALL, "Diorite Brick Wall");
			builder.add(MSBlocks.CRACKED_DIORITE_BRICKS, "Cracked Diorite Bricks");
			builder.add(MSBlocks.CRACKED_DIORITE_BRICK_SLAB, "Cracked Diorite Brick Slab");
			builder.add(MSBlocks.CRACKED_DIORITE_BRICK_STAIRS, "Cracked Diorite Brick Stairs");
			builder.add(MSBlocks.CRACKED_DIORITE_BRICK_WALL, "Cracked Diorite Brick Wall");
			builder.add(MSBlocks.MOSSY_DIORITE_BRICKS, "Mossy Diorite Bricks");
			builder.add(MSBlocks.MOSSY_DIORITE_BRICK_SLAB, "Mossy Diorite Brick Slab");
			builder.add(MSBlocks.MOSSY_DIORITE_BRICK_STAIRS, "Mossy Diorite Brick Stairs");
			builder.add(MSBlocks.MOSSY_DIORITE_BRICK_WALL, "Mossy Diorite Brick Wall");
			builder.add(MSBlocks.CRACKED_MOSSY_DIORITE_BRICKS, "Cracked Mossy Diorite Bricks");
			builder.add(MSBlocks.CRACKED_MOSSY_DIORITE_BRICK_SLAB, "Cracked Mossy Diorite Brick Slab");
			builder.add(MSBlocks.CRACKED_MOSSY_DIORITE_BRICK_STAIRS, "Cracked Mossy Diorite Brick Stairs");
			builder.add(MSBlocks.CRACKED_MOSSY_DIORITE_BRICK_WALL, "Cracked Mossy Diorite Brick Wall");
			
			builder.add(MSBlocks.MOSSY_ANDESITE, "Mossy Andesite");
			builder.add(MSBlocks.MOSSY_ANDESITE_SLAB, "Mossy Andesite Slab");
			builder.add(MSBlocks.MOSSY_ANDESITE_STAIRS, "Mossy Andesite Stairs");
			builder.add(MSBlocks.MOSSY_ANDESITE_WALL, "Mossy Andesite Wall");
			builder.add(MSBlocks.COBBLED_ANDESITE, "Cobbled Andesite");
			builder.add(MSBlocks.COBBLED_ANDESITE_SLAB, "Cobbled Andesite Slab");
			builder.add(MSBlocks.COBBLED_ANDESITE_STAIRS, "Cobbled Andesite Stairs");
			builder.add(MSBlocks.COBBLED_ANDESITE_WALL, "Cobbled Andesite Wall");
			builder.add(MSBlocks.MOSSY_COBBLED_ANDESITE, "Mossy Cobbled Andesite");
			builder.add(MSBlocks.MOSSY_COBBLED_ANDESITE_SLAB, "Mossy Cobbled Andesite Slab");
			builder.add(MSBlocks.MOSSY_COBBLED_ANDESITE_STAIRS, "Mossy Cobbled Andesite Stairs");
			builder.add(MSBlocks.MOSSY_COBBLED_ANDESITE_WALL, "Mossy Cobbled Andesite Wall");
			builder.add(MSBlocks.ANDESITE_BRICKS, "Andesite Bricks");
			builder.add(MSBlocks.ANDESITE_BRICK_SLAB, "Andesite Brick Slab");
			builder.add(MSBlocks.ANDESITE_BRICK_STAIRS, "Andesite Brick Stairs");
			builder.add(MSBlocks.ANDESITE_BRICK_WALL, "Andesite Brick Wall");
			builder.add(MSBlocks.CRACKED_ANDESITE_BRICKS, "Cracked Andesite Bricks");
			builder.add(MSBlocks.CRACKED_ANDESITE_BRICK_SLAB, "Cracked Andesite Brick Slab");
			builder.add(MSBlocks.CRACKED_ANDESITE_BRICK_STAIRS, "Cracked Andesite Brick Stairs");
			builder.add(MSBlocks.CRACKED_ANDESITE_BRICK_WALL, "Cracked Andesite Brick Wall");
			builder.add(MSBlocks.MOSSY_ANDESITE_BRICKS, "Mossy Andesite Bricks");
			builder.add(MSBlocks.MOSSY_ANDESITE_BRICK_SLAB, "Mossy Andesite Brick Slab");
			builder.add(MSBlocks.MOSSY_ANDESITE_BRICK_STAIRS, "Mossy Andesite Brick Stairs");
			builder.add(MSBlocks.MOSSY_ANDESITE_BRICK_WALL, "Mossy Andesite Brick Wall");
			builder.add(MSBlocks.CRACKED_MOSSY_ANDESITE_BRICKS, "Cracked Mossy Andesite Bricks");
			builder.add(MSBlocks.CRACKED_MOSSY_ANDESITE_BRICK_SLAB, "Cracked Mossy Andesite Brick Slab");
			builder.add(MSBlocks.CRACKED_MOSSY_ANDESITE_BRICK_STAIRS, "Cracked Mossy Andesite Brick Stairs");
			builder.add(MSBlocks.CRACKED_MOSSY_ANDESITE_BRICK_WALL, "Cracked Mossy Andesite Brick Wall");
			
			builder.add(MSBlocks.MOSSY_DEEPSLATE, "Mossy Deepslate");
			builder.add(MSBlocks.MOSSY_DEEPSLATE_SLAB, "Mossy Deepslate Slab");
			builder.add(MSBlocks.MOSSY_DEEPSLATE_STAIRS, "Mossy Deepslate Stairs");
			builder.add(MSBlocks.MOSSY_DEEPSLATE_WALL, "Mossy Deepslate Wall");
			builder.add(MSBlocks.MOSSY_COBBLED_DEEPSLATE, "Mossy Cobbled Deepslate");
			builder.add(MSBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB, "Mossy Cobbled Deepslate Slab");
			builder.add(MSBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS, "Mossy Cobbled Deepslate Stairs");
			builder.add(MSBlocks.MOSSY_COBBLED_DEEPSLATE_WALL, "Mossy Cobbled Deepslate Wall");
			builder.add(MSBlocks.MOSSY_DEEPSLATE_BRICKS, "Mossy Deepslate Bricks");
			builder.add(MSBlocks.MOSSY_DEEPSLATE_BRICK_SLAB, "Mossy Deepslate Brick Slab");
			builder.add(MSBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS, "Mossy Deepslate Brick Stairs");
			builder.add(MSBlocks.MOSSY_DEEPSLATE_BRICK_WALL, "Mossy Deepslate Brick Wall");
			builder.add(MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICKS, "Cracked Mossy Deepslate Bricks");
			builder.add(MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICK_SLAB, "Cracked Mossy Deepslate Brick Slab");
			builder.add(MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICK_STAIRS, "Cracked Mossy Deepslate Brick Stairs");
			builder.add(MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICK_WALL, "Cracked Mossy Deepslate Brick Wall");
			builder.add(MSBlocks.MOSSY_DEEPSLATE_TILES, "Mossy Deepslate Tiles");
			builder.add(MSBlocks.MOSSY_DEEPSLATE_TILE_SLAB, "Mossy Deepslate Tile Slab");
			builder.add(MSBlocks.MOSSY_DEEPSLATE_TILE_STAIRS, "Mossy Deepslate Tile Stairs");
			builder.add(MSBlocks.MOSSY_DEEPSLATE_TILE_WALL, "Mossy Deepslate Tile Wall");
			builder.add(MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILES, "Cracked Mossy Deepslate Tiles");
			builder.add(MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILE_SLAB, "Cracked Mossy Deepslate Tile Slab");
			builder.add(MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILE_STAIRS, "Cracked Mossy Deepslate Tile Stairs");
			builder.add(MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILE_WALL, "Cracked Mossy Deepslate Tile Wall");
			
			builder.add(MSBlocks.MOSSY_TUFF, "Mossy Tuff");
			builder.add(MSBlocks.MOSSY_TUFF_SLAB, "Mossy Tuff Slab");
			builder.add(MSBlocks.MOSSY_TUFF_STAIRS, "Mossy Tuff Stairs");
			builder.add(MSBlocks.MOSSY_TUFF_WALL, "Mossy Tuff Wall");
			builder.add(MSBlocks.CRACKED_TUFF_BRICKS, "Cracked Tuff Bricks");
			builder.add(MSBlocks.CRACKED_TUFF_BRICK_SLAB, "Cracked Tuff Brick Slab");
			builder.add(MSBlocks.CRACKED_TUFF_BRICK_STAIRS, "Cracked Tuff Brick Stairs");
			builder.add(MSBlocks.CRACKED_TUFF_BRICK_WALL, "Cracked Tuff Brick Wall");
			builder.add(MSBlocks.MOSSY_TUFF_BRICKS, "Mossy Tuff Bricks");
			builder.add(MSBlocks.MOSSY_TUFF_BRICK_SLAB, "Mossy Tuff Brick Slab");
			builder.add(MSBlocks.MOSSY_TUFF_BRICK_STAIRS, "Mossy Tuff Brick Stairs");
			builder.add(MSBlocks.MOSSY_TUFF_BRICK_WALL, "Mossy Tuff Brick Wall");
			builder.add(MSBlocks.CRACKED_MOSSY_TUFF_BRICKS, "Cracked Mossy Tuff Bricks");
			builder.add(MSBlocks.CRACKED_MOSSY_TUFF_BRICK_SLAB, "Cracked Mossy Tuff Brick Slab");
			builder.add(MSBlocks.CRACKED_MOSSY_TUFF_BRICK_STAIRS, "Cracked Mossy Tuff Brick Stairs");
			builder.add(MSBlocks.CRACKED_MOSSY_TUFF_BRICK_WALL, "Cracked Mossy Tuff Brick Wall");
			builder.add(MSBlocks.CRACKED_CHISELED_TUFF_BRICKS, "Cracked Chiseled Tuff Bricks");
			builder.add(MSBlocks.CRACKED_CHISELED_TUFF_BRICK_SLAB, "Cracked Chiseled Tuff Brick Slab");
			builder.add(MSBlocks.CRACKED_CHISELED_TUFF_BRICK_STAIRS, "Cracked Chiseled Tuff Brick Stairs");
			builder.add(MSBlocks.CRACKED_CHISELED_TUFF_BRICK_WALL, "Cracked Chiseled Tuff Brick Wall");
			builder.add(MSBlocks.MOSSY_CHISELED_TUFF_BRICKS, "Mossy Chiseled Tuff Bricks");
			builder.add(MSBlocks.MOSSY_CHISELED_TUFF_BRICK_SLAB, "Mossy Chiseled Tuff Brick Slab");
			builder.add(MSBlocks.MOSSY_CHISELED_TUFF_BRICK_STAIRS, "Mossy Chiseled Tuff Brick Stairs");
			builder.add(MSBlocks.MOSSY_CHISELED_TUFF_BRICK_WALL, "Mossy Chiseled Tuff Brick Wall");
			builder.add(MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICKS, "Cracked Mossy Chiseled Tuff Bricks");
			builder.add(MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICK_SLAB, "Cracked Mossy Chiseled Tuff Brick Slab");
			builder.add(MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICK_STAIRS, "Cracked Mossy Chiseled Tuff Brick Stairs");
			builder.add(MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICK_WALL, "Cracked Mossy Chiseled Tuff Brick Wall");
			
			builder.add(MSBlocks.CRACKED_BRICKS, "Cracked Bricks");
			builder.add(MSBlocks.CRACKED_BRICK_SLAB, "Cracked Brick Slab");
			builder.add(MSBlocks.CRACKED_BRICK_STAIRS, "Cracked Brick Stairs");
			builder.add(MSBlocks.CRACKED_BRICK_WALL, "Cracked Brick Wall");
			builder.add(MSBlocks.MOSSY_BRICKS, "Mossy Bricks");
			builder.add(MSBlocks.MOSSY_BRICK_SLAB, "Mossy Brick Slab");
			builder.add(MSBlocks.MOSSY_BRICK_STAIRS, "Mossy Brick Stairs");
			builder.add(MSBlocks.MOSSY_BRICK_WALL, "Mossy Brick Wall");
			builder.add(MSBlocks.CRACKED_MOSSY_BRICKS, "Cracked Mossy Bricks");
			builder.add(MSBlocks.CRACKED_MOSSY_BRICK_SLAB, "Cracked Mossy Brick Slab");
			builder.add(MSBlocks.CRACKED_MOSSY_BRICK_STAIRS, "Cracked Mossy Brick Stairs");
			builder.add(MSBlocks.CRACKED_MOSSY_BRICK_WALL, "Cracked Mossy Brick Wall");
			
			builder.add(MSBlocks.CRACKED_MUD_BRICKS, "Cracked Mud Bricks");
			builder.add(MSBlocks.CRACKED_MUD_BRICK_SLAB, "Cracked Mud Brick Slab");
			builder.add(MSBlocks.CRACKED_MUD_BRICK_STAIRS, "Cracked Mud Brick Stairs");
			builder.add(MSBlocks.CRACKED_MUD_BRICK_WALL, "Cracked Mud Brick Wall");
			builder.add(MSBlocks.MOSSY_MUD_BRICKS, "Mossy Mud Bricks");
			builder.add(MSBlocks.MOSSY_MUD_BRICK_SLAB, "Mossy Mud Brick Slab");
			builder.add(MSBlocks.MOSSY_MUD_BRICK_STAIRS, "Mossy Mud Brick Stairs");
			builder.add(MSBlocks.MOSSY_MUD_BRICK_WALL, "Mossy Mud Brick Wall");
			builder.add(MSBlocks.CRACKED_MOSSY_MUD_BRICKS, "Cracked Mossy Mud Bricks");
			builder.add(MSBlocks.CRACKED_MOSSY_MUD_BRICK_SLAB, "Cracked Mossy Mud Brick Slab");
			builder.add(MSBlocks.CRACKED_MOSSY_MUD_BRICK_STAIRS, "Cracked Mossy Mud Brick Stairs");
			builder.add(MSBlocks.CRACKED_MOSSY_MUD_BRICK_WALL, "Cracked Mossy Mud Brick Wall");
			
			builder.add(MSBlocks.SANDSTONE_BRICKS, "Sandstone Bricks");
			builder.add(MSBlocks.SANDSTONE_BRICK_SLAB, "Sandstone Brick Slab");
			builder.add(MSBlocks.SANDSTONE_BRICK_STAIRS, "Sandstone Brick Stairs");
			builder.add(MSBlocks.SANDSTONE_BRICK_WALL, "Sandstone Brick Wall");
			builder.add(MSBlocks.CRACKED_SANDSTONE_BRICKS, "Cracked Sandstone Bricks");
			builder.add(MSBlocks.CRACKED_SANDSTONE_BRICK_SLAB, "Cracked Sandstone Brick Slab");
			builder.add(MSBlocks.CRACKED_SANDSTONE_BRICK_STAIRS, "Cracked Sandstone Brick Stairs");
			builder.add(MSBlocks.CRACKED_SANDSTONE_BRICK_WALL, "Cracked Sandstone Brick Wall");
			builder.add(MSBlocks.MOSSY_SANDSTONE_BRICKS, "Mossy Sandstone Bricks");
			builder.add(MSBlocks.MOSSY_SANDSTONE_BRICK_SLAB, "Mossy Sandstone Brick Slab");
			builder.add(MSBlocks.MOSSY_SANDSTONE_BRICK_STAIRS, "Mossy Sandstone Brick Stairs");
			builder.add(MSBlocks.MOSSY_SANDSTONE_BRICK_WALL, "Mossy Sandstone Brick Wall");
			builder.add(MSBlocks.CRACKED_MOSSY_SANDSTONE_BRICKS, "Cracked Mossy Sandstone Bricks");
			builder.add(MSBlocks.CRACKED_MOSSY_SANDSTONE_BRICK_SLAB, "Cracked Mossy Sandstone Brick Slab");
			builder.add(MSBlocks.CRACKED_MOSSY_SANDSTONE_BRICK_STAIRS, "Cracked Mossy Sandstone Brick Stairs");
			builder.add(MSBlocks.CRACKED_MOSSY_SANDSTONE_BRICK_WALL, "Cracked Mossy Sandstone Brick Wall");
			
			builder.add(MSBlocks.RED_SANDSTONE_BRICKS, "Red Sandstone Bricks");
			builder.add(MSBlocks.RED_SANDSTONE_BRICK_SLAB, "Red Sandstone Brick Slab");
			builder.add(MSBlocks.RED_SANDSTONE_BRICK_STAIRS, "Red Sandstone Brick Stairs");
			builder.add(MSBlocks.RED_SANDSTONE_BRICK_WALL, "Red Sandstone Brick Wall");
			builder.add(MSBlocks.CRACKED_RED_SANDSTONE_BRICKS, "Cracked Red Sandstone Bricks");
			builder.add(MSBlocks.CRACKED_RED_SANDSTONE_BRICK_SLAB, "Cracked Red Sandstone Brick Slab");
			builder.add(MSBlocks.CRACKED_RED_SANDSTONE_BRICK_STAIRS, "Cracked Red Sandstone Brick Stairs");
			builder.add(MSBlocks.CRACKED_RED_SANDSTONE_BRICK_WALL, "Cracked Red Sandstone Brick Wall");
			builder.add(MSBlocks.MOSSY_RED_SANDSTONE_BRICKS, "Mossy Red Sandstone Bricks");
			builder.add(MSBlocks.MOSSY_RED_SANDSTONE_BRICK_SLAB, "Mossy Red Sandstone Brick Slab");
			builder.add(MSBlocks.MOSSY_RED_SANDSTONE_BRICK_STAIRS, "Mossy Red Sandstone Brick Stairs");
			builder.add(MSBlocks.MOSSY_RED_SANDSTONE_BRICK_WALL, "Mossy Red Sandstone Brick Wall");
			builder.add(MSBlocks.CRACKED_MOSSY_RED_SANDSTONE_BRICKS, "Cracked Mossy Red Sandstone Bricks");
			builder.add(MSBlocks.CRACKED_MOSSY_RED_SANDSTONE_BRICK_SLAB, "Cracked Mossy Red Sandstone Brick Slab");
			builder.add(MSBlocks.CRACKED_MOSSY_RED_SANDSTONE_BRICK_STAIRS, "Cracked Mossy Red Sandstone Brick Stairs");
			builder.add(MSBlocks.CRACKED_MOSSY_RED_SANDSTONE_BRICK_WALL, "Cracked Mossy Red Sandstone Brick Wall");
			
			builder.add(MSBlocks.WHITE_SAND, "White Sand");
			builder.add(MSBlocks.WHITE_SANDSTONE, "White Sandstone");
			builder.add(MSBlocks.WHITE_SANDSTONE_SLAB, "White Sandstone Slab");
			builder.add(MSBlocks.WHITE_SANDSTONE_STAIRS, "White Sandstone Stairs");
			builder.add(MSBlocks.WHITE_SANDSTONE_WALL, "White Sandstone Wall");
			builder.add(MSBlocks.CHISELED_WHITE_SANDSTONE, "Chiseled White Sandstone");
			builder.add(MSBlocks.CHISELED_WHITE_SANDSTONE_SLAB, "Chiseled White Sandstone Slab");
			builder.add(MSBlocks.CHISELED_WHITE_SANDSTONE_STAIRS, "Chiseled White Sandstone Stairs");
			builder.add(MSBlocks.CHISELED_WHITE_SANDSTONE_WALL, "Chiseled White Sandstone Wall");
			builder.add(MSBlocks.SMOOTH_WHITE_SANDSTONE, "Smooth White Sandstone");
			builder.add(MSBlocks.SMOOTH_WHITE_SANDSTONE_SLAB, "Smooth White Sandstone Slab");
			builder.add(MSBlocks.SMOOTH_WHITE_SANDSTONE_STAIRS, "Smooth White Sandstone Stairs");
			builder.add(MSBlocks.SMOOTH_WHITE_SANDSTONE_WALL, "Smooth White Sandstone Wall");
			builder.add(MSBlocks.CUT_WHITE_SANDSTONE, "Cut White Sandstone");
			builder.add(MSBlocks.CUT_WHITE_SANDSTONE_SLAB, "Cut White Sandstone Slab");
			builder.add(MSBlocks.CUT_WHITE_SANDSTONE_STAIRS, "Cut White Sandstone Stairs");
			builder.add(MSBlocks.CUT_WHITE_SANDSTONE_WALL, "Cut White Sandstone Wall");
			builder.add(MSBlocks.WHITE_SANDSTONE_BRICKS, "White Sandstone Bricks");
			builder.add(MSBlocks.WHITE_SANDSTONE_BRICK_SLAB, "White Sandstone Brick Slab");
			builder.add(MSBlocks.WHITE_SANDSTONE_BRICK_STAIRS, "White Sandstone Brick Stairs");
			builder.add(MSBlocks.WHITE_SANDSTONE_BRICK_WALL, "White Sandstone Brick Wall");
			builder.add(MSBlocks.CRACKED_WHITE_SANDSTONE_BRICKS, "Cracked White Sandstone Bricks");
			builder.add(MSBlocks.CRACKED_WHITE_SANDSTONE_BRICK_SLAB, "Cracked White Sandstone Brick Slab");
			builder.add(MSBlocks.CRACKED_WHITE_SANDSTONE_BRICK_STAIRS, "Cracked White Sandstone Brick Stairs");
			builder.add(MSBlocks.CRACKED_WHITE_SANDSTONE_BRICK_WALL, "Cracked White Sandstone Brick Wall");
			builder.add(MSBlocks.MOSSY_WHITE_SANDSTONE_BRICKS, "Mossy White Sandstone Bricks");
			builder.add(MSBlocks.MOSSY_WHITE_SANDSTONE_BRICK_SLAB, "Mossy White Sandstone Brick Slab");
			builder.add(MSBlocks.MOSSY_WHITE_SANDSTONE_BRICK_STAIRS, "Mossy White Sandstone Brick Stairs");
			builder.add(MSBlocks.MOSSY_WHITE_SANDSTONE_BRICK_WALL, "Mossy White Sandstone Brick Wall");
			builder.add(MSBlocks.CRACKED_MOSSY_WHITE_SANDSTONE_BRICKS, "Cracked Mossy White Sandstone Bricks");
			builder.add(MSBlocks.CRACKED_MOSSY_WHITE_SANDSTONE_BRICK_SLAB, "Cracked Mossy White Sandstone Brick Slab");
			builder.add(MSBlocks.CRACKED_MOSSY_WHITE_SANDSTONE_BRICK_STAIRS, "Cracked Mossy White Sandstone Brick Stairs");
			builder.add(MSBlocks.CRACKED_MOSSY_WHITE_SANDSTONE_BRICK_WALL, "Cracked Mossy White Sandstone Brick Wall");
			
			builder.add(MSBlocks.BLACK_SAND, "Black Sand");
			builder.add(MSBlocks.BLACK_SANDSTONE, "Black Sandstone");
			builder.add(MSBlocks.BLACK_SANDSTONE_SLAB, "Black Sandstone Slab");
			builder.add(MSBlocks.BLACK_SANDSTONE_STAIRS, "Black Sandstone Stairs");
			builder.add(MSBlocks.BLACK_SANDSTONE_WALL, "Black Sandstone Wall");
			builder.add(MSBlocks.CHISELED_BLACK_SANDSTONE, "Chiseled Black Sandstone");
			builder.add(MSBlocks.CHISELED_BLACK_SANDSTONE_SLAB, "Chiseled Black Sandstone Slab");
			builder.add(MSBlocks.CHISELED_BLACK_SANDSTONE_STAIRS, "Chiseled Black Sandstone Stairs");
			builder.add(MSBlocks.CHISELED_BLACK_SANDSTONE_WALL, "Chiseled Black Sandstone Wall");
			builder.add(MSBlocks.SMOOTH_BLACK_SANDSTONE, "Smooth Black Sandstone");
			builder.add(MSBlocks.SMOOTH_BLACK_SANDSTONE_SLAB, "Smooth Black Sandstone Slab");
			builder.add(MSBlocks.SMOOTH_BLACK_SANDSTONE_STAIRS, "Smooth Black Sandstone Stairs");
			builder.add(MSBlocks.SMOOTH_BLACK_SANDSTONE_WALL, "Smooth Black Sandstone Wall");
			builder.add(MSBlocks.CUT_BLACK_SANDSTONE, "Cut Black Sandstone");
			builder.add(MSBlocks.CUT_BLACK_SANDSTONE_SLAB, "Cut Black Sandstone Slab");
			builder.add(MSBlocks.CUT_BLACK_SANDSTONE_STAIRS, "Cut Black Sandstone Stairs");
			builder.add(MSBlocks.CUT_BLACK_SANDSTONE_WALL, "Cut Black Sandstone Wall");
			builder.add(MSBlocks.BLACK_SANDSTONE_BRICKS, "Black Sandstone Bricks");
			builder.add(MSBlocks.BLACK_SANDSTONE_BRICK_SLAB, "Black Sandstone Brick Slab");
			builder.add(MSBlocks.BLACK_SANDSTONE_BRICK_STAIRS, "Black Sandstone Brick Stairs");
			builder.add(MSBlocks.BLACK_SANDSTONE_BRICK_WALL, "Black Sandstone Brick Wall");
			builder.add(MSBlocks.CRACKED_BLACK_SANDSTONE_BRICKS, "Cracked Black Sandstone Bricks");
			builder.add(MSBlocks.CRACKED_BLACK_SANDSTONE_BRICK_SLAB, "Cracked Black Sandstone Brick Slab");
			builder.add(MSBlocks.CRACKED_BLACK_SANDSTONE_BRICK_STAIRS, "Cracked Black Sandstone Brick Stairs");
			builder.add(MSBlocks.CRACKED_BLACK_SANDSTONE_BRICK_WALL, "Cracked Black Sandstone Brick Wall");
			builder.add(MSBlocks.MOSSY_BLACK_SANDSTONE_BRICKS, "Mossy Black Sandstone Bricks");
			builder.add(MSBlocks.MOSSY_BLACK_SANDSTONE_BRICK_SLAB, "Mossy Black Sandstone Brick Slab");
			builder.add(MSBlocks.MOSSY_BLACK_SANDSTONE_BRICK_STAIRS, "Mossy Black Sandstone Brick Stairs");
			builder.add(MSBlocks.MOSSY_BLACK_SANDSTONE_BRICK_WALL, "Mossy Black Sandstone Brick Wall");
			builder.add(MSBlocks.CRACKED_MOSSY_BLACK_SANDSTONE_BRICKS, "Cracked Mossy Black Sandstone Bricks");
			builder.add(MSBlocks.CRACKED_MOSSY_BLACK_SANDSTONE_BRICK_SLAB, "Cracked Mossy Black Sandstone Brick Slab");
			builder.add(MSBlocks.CRACKED_MOSSY_BLACK_SANDSTONE_BRICK_STAIRS, "Cracked Mossy Black Sandstone Brick Stairs");
			builder.add(MSBlocks.CRACKED_MOSSY_BLACK_SANDSTONE_BRICK_WALL, "Cracked Mossy Black Sandstone Brick Wall");
			
			builder.add(MSBlocks.CRACKED_PRISMARINE_BRICKS, "Cracked Prismarine Bricks");
			builder.add(MSBlocks.CRACKED_PRISMARINE_BRICK_SLAB, "Cracked Prismarine Brick Slab");
			builder.add(MSBlocks.CRACKED_PRISMARINE_BRICK_STAIRS, "Cracked Prismarine Brick Stairs");
			builder.add(MSBlocks.CRACKED_PRISMARINE_BRICK_WALL, "Cracked Prismarine Brick Wall");
			
			builder.add(MSBlocks.SOUL_SANDSTONE, "Soul Sandstone");
			builder.add(MSBlocks.SOUL_SANDSTONE_SLAB, "Soul Sandstone Slab");
			builder.add(MSBlocks.SOUL_SANDSTONE_STAIRS, "Soul Sandstone Stairs");
			builder.add(MSBlocks.SOUL_SANDSTONE_WALL, "Soul Sandstone Wall");
			builder.add(MSBlocks.CHISELED_SOUL_SANDSTONE, "Chiseled Soul Sandstone");
			builder.add(MSBlocks.CHISELED_SOUL_SANDSTONE_SLAB, "Chiseled Soul Sandstone Slab");
			builder.add(MSBlocks.CHISELED_SOUL_SANDSTONE_STAIRS, "Chiseled Soul Sandstone Stairs");
			builder.add(MSBlocks.CHISELED_SOUL_SANDSTONE_WALL, "Chiseled Soul Sandstone Wall");
			builder.add(MSBlocks.SMOOTH_SOUL_SANDSTONE, "Smooth Soul Sandstone");
			builder.add(MSBlocks.SMOOTH_SOUL_SANDSTONE_SLAB, "Smooth Soul Sandstone Slab");
			builder.add(MSBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS, "Smooth Soul Sandstone Stairs");
			builder.add(MSBlocks.SMOOTH_SOUL_SANDSTONE_WALL, "Smooth Soul Sandstone Wall");
			builder.add(MSBlocks.CUT_SOUL_SANDSTONE, "Cut Soul Sandstone");
			builder.add(MSBlocks.CUT_SOUL_SANDSTONE_SLAB, "Cut Soul Sandstone Slab");
			builder.add(MSBlocks.CUT_SOUL_SANDSTONE_STAIRS, "Cut Soul Sandstone Stairs");
			builder.add(MSBlocks.CUT_SOUL_SANDSTONE_WALL, "Cut Soul Sandstone Wall");
			builder.add(MSBlocks.SOUL_SANDSTONE_BRICKS, "Soul Sandstone Bricks");
			builder.add(MSBlocks.SOUL_SANDSTONE_BRICK_SLAB, "Soul Sandstone Brick Slab");
			builder.add(MSBlocks.SOUL_SANDSTONE_BRICK_STAIRS, "Soul Sandstone Brick Stairs");
			builder.add(MSBlocks.SOUL_SANDSTONE_BRICK_WALL, "Soul Sandstone Brick Wall");
			builder.add(MSBlocks.CRACKED_SOUL_SANDSTONE_BRICKS, "Cracked Soul Sandstone Bricks");
			builder.add(MSBlocks.CRACKED_SOUL_SANDSTONE_BRICK_SLAB, "Cracked Soul Sandstone Brick Slab");
			builder.add(MSBlocks.CRACKED_SOUL_SANDSTONE_BRICK_STAIRS, "Cracked Soul Sandstone Brick Stairs");
			builder.add(MSBlocks.CRACKED_SOUL_SANDSTONE_BRICK_WALL, "Cracked Soul Sandstone Brick Wall");
			builder.add(MSBlocks.MOSSY_SOUL_SANDSTONE_BRICKS, "Mossy Soul Sandstone Bricks");
			builder.add(MSBlocks.MOSSY_SOUL_SANDSTONE_BRICK_SLAB, "Mossy Soul Sandstone Brick Slab");
			builder.add(MSBlocks.MOSSY_SOUL_SANDSTONE_BRICK_STAIRS, "Mossy Soul Sandstone Brick Stairs");
			builder.add(MSBlocks.MOSSY_SOUL_SANDSTONE_BRICK_WALL, "Mossy Soul Sandstone Brick Wall");
			builder.add(MSBlocks.CRACKED_MOSSY_SOUL_SANDSTONE_BRICKS, "Cracked Mossy Soul Sandstone Bricks");
			builder.add(MSBlocks.CRACKED_MOSSY_SOUL_SANDSTONE_BRICK_SLAB, "Cracked Mossy Soul Sandstone Brick Slab");
			builder.add(MSBlocks.CRACKED_MOSSY_SOUL_SANDSTONE_BRICK_STAIRS, "Cracked Mossy Soul Sandstone Brick Stairs");
			builder.add(MSBlocks.CRACKED_MOSSY_SOUL_SANDSTONE_BRICK_WALL, "Cracked Mossy Soul Sandstone Brick Wall");
			
			builder.add(MSBlocks.WITHER_BONE_BLOCK, "Wither Bone Block");
			builder.add(MSBlocks.WITHER_BONE_SLAB, "Wither Bone Slab");
			builder.add(MSBlocks.WITHER_BONE_STAIRS, "Wither Bone Stairs");
			builder.add(MSBlocks.WITHER_BONE_WALL, "Wither Bone Wall");
			
			builder.add(MSBlocks.WARPED_WART, "Warped Wart");
			
			builder.add(MSBlocks.CRACKED_CHISELED_NETHER_BRICKS, "Cracked Chiseled Nether Bricks");
			builder.add(MSBlocks.CRACKED_CHISELED_NETHER_BRICK_SLAB, "Cracked Chiseled Nether Brick Slab");
			builder.add(MSBlocks.CRACKED_CHISELED_NETHER_BRICK_STAIRS, "Cracked Chiseled Nether Brick Stairs");
			builder.add(MSBlocks.CRACKED_CHISELED_NETHER_BRICK_WALL, "Cracked Chiseled Nether Brick Wall");
			
			builder.add(Blocks.RED_NETHER_BRICKS, "Crimson Nether Bricks");
			builder.add(Blocks.RED_NETHER_BRICK_SLAB, "Crimson Nether Brick Slab");
			builder.add(Blocks.RED_NETHER_BRICK_STAIRS, "Crimson Nether Brick Stairs");
			builder.add(Blocks.RED_NETHER_BRICK_WALL, "Crimson Nether Brick Wall");
			builder.add(SSWPBlocks.RED_NETHER_BRICK_FENCE, "Crimson Nether Brick Fence");
			builder.add(SSWPBlocks.RED_NETHER_BRICK_FENCE_GATE, "Crimson Nether Brick Fence Gate");
			builder.add(MSBlocks.CRACKED_RED_NETHER_BRICKS, "Cracked Crimson Nether Bricks");
			builder.add(MSBlocks.CRACKED_RED_NETHER_BRICK_SLAB, "Cracked Crimson Nether Brick Slab");
			builder.add(MSBlocks.CRACKED_RED_NETHER_BRICK_STAIRS, "Cracked Crimson Nether Brick Stairs");
			builder.add(MSBlocks.CRACKED_RED_NETHER_BRICK_WALL, "Cracked Crimson Nether Brick Wall");
			builder.add(MSBlocks.CRACKED_RED_NETHER_BRICK_FENCE, "Cracked Crimson Nether Brick Fence");
			builder.add(MSBlocks.CRACKED_RED_NETHER_BRICK_FENCE_GATE, "Cracked Crimson Nether Brick Fence Gate");
			builder.add(MSBlocks.CHISELED_RED_NETHER_BRICKS, "Chiseled Crimson Nether Bricks");
			builder.add(MSBlocks.CHISELED_RED_NETHER_BRICK_SLAB, "Chiseled Crimson Nether Brick Slab");
			builder.add(MSBlocks.CHISELED_RED_NETHER_BRICK_STAIRS, "Chiseled Crimson Nether Brick Stairs");
			builder.add(MSBlocks.CHISELED_RED_NETHER_BRICK_WALL, "Chiseled Crimson Nether Brick Wall");
			builder.add(MSBlocks.CRACKED_CHISELED_RED_NETHER_BRICKS, "Cracked Chiseled Crimson Nether Bricks");
			builder.add(MSBlocks.CRACKED_CHISELED_RED_NETHER_BRICK_SLAB, "Cracked Chiseled Crimson Nether Brick Slab");
			builder.add(MSBlocks.CRACKED_CHISELED_RED_NETHER_BRICK_STAIRS, "Cracked Chiseled Crimson Nether Brick Stairs");
			builder.add(MSBlocks.CRACKED_CHISELED_RED_NETHER_BRICK_WALL, "Cracked Chiseled Crimson Nether Brick Wall");
			
			builder.add(MSBlocks.WARPED_NETHER_BRICKS, "Warped Nether Bricks");
			builder.add(MSBlocks.WARPED_NETHER_BRICK_SLAB, "Warped Nether Brick Slab");
			builder.add(MSBlocks.WARPED_NETHER_BRICK_STAIRS, "Warped Nether Brick Stairs");
			builder.add(MSBlocks.WARPED_NETHER_BRICK_WALL, "Warped Nether Brick Wall");
			builder.add(MSBlocks.WARPED_NETHER_BRICK_FENCE, "Warped Nether Brick Fence");
			builder.add(MSBlocks.WARPED_NETHER_BRICK_FENCE_GATE, "Warped Nether Brick Fence Gate");
			builder.add(MSBlocks.CRACKED_WARPED_NETHER_BRICKS, "Cracked Warped Nether Bricks");
			builder.add(MSBlocks.CRACKED_WARPED_NETHER_BRICK_SLAB, "Cracked Warped Nether Brick Slab");
			builder.add(MSBlocks.CRACKED_WARPED_NETHER_BRICK_STAIRS, "Cracked Warped Nether Brick Stairs");
			builder.add(MSBlocks.CRACKED_WARPED_NETHER_BRICK_WALL, "Cracked Warped Nether Brick Wall");
			builder.add(MSBlocks.CRACKED_WARPED_NETHER_BRICK_FENCE, "Cracked Warped Nether Brick Fence");
			builder.add(MSBlocks.CRACKED_WARPED_NETHER_BRICK_FENCE_GATE, "Cracked Warped Nether Brick Fence Gate");
			builder.add(MSBlocks.CHISELED_WARPED_NETHER_BRICKS, "Chiseled Warped Nether Bricks");
			builder.add(MSBlocks.CHISELED_WARPED_NETHER_BRICK_SLAB, "Chiseled Warped Nether Brick Slab");
			builder.add(MSBlocks.CHISELED_WARPED_NETHER_BRICK_STAIRS, "Chiseled Warped Nether Brick Stairs");
			builder.add(MSBlocks.CHISELED_WARPED_NETHER_BRICK_WALL, "Chiseled Warped Nether Brick Wall");
			builder.add(MSBlocks.CRACKED_CHISELED_WARPED_NETHER_BRICKS, "Cracked Chiseled Warped Nether Bricks");
			builder.add(MSBlocks.CRACKED_CHISELED_WARPED_NETHER_BRICK_SLAB, "Cracked Chiseled Warped Nether Brick Slab");
			builder.add(MSBlocks.CRACKED_CHISELED_WARPED_NETHER_BRICK_STAIRS, "Cracked Chiseled Warped Nether Brick Stairs");
			builder.add(MSBlocks.CRACKED_CHISELED_WARPED_NETHER_BRICK_WALL, "Cracked Chiseled Warped Nether Brick Wall");
			
			builder.add(MSBlocks.WITHERED_NETHER_BRICKS, "Withered Nether Bricks");
			builder.add(MSBlocks.WITHERED_NETHER_BRICK_SLAB, "Withered Nether Brick Slab");
			builder.add(MSBlocks.WITHERED_NETHER_BRICK_STAIRS, "Withered Nether Brick Stairs");
			builder.add(MSBlocks.WITHERED_NETHER_BRICK_WALL, "Withered Nether Brick Wall");
			builder.add(MSBlocks.WITHERED_NETHER_BRICK_FENCE, "Withered Nether Brick Fence");
			builder.add(MSBlocks.WITHERED_NETHER_BRICK_FENCE_GATE, "Withered Nether Brick Fence Gate");
			builder.add(MSBlocks.CRACKED_WITHERED_NETHER_BRICKS, "Cracked Withered Nether Bricks");
			builder.add(MSBlocks.CRACKED_WITHERED_NETHER_BRICK_SLAB, "Cracked Withered Nether Brick Slab");
			builder.add(MSBlocks.CRACKED_WITHERED_NETHER_BRICK_STAIRS, "Cracked Withered Nether Brick Stairs");
			builder.add(MSBlocks.CRACKED_WITHERED_NETHER_BRICK_WALL, "Cracked Withered Nether Brick Wall");
			builder.add(MSBlocks.CRACKED_WITHERED_NETHER_BRICK_FENCE, "Cracked Withered Nether Brick Fence");
			builder.add(MSBlocks.CRACKED_WITHERED_NETHER_BRICK_FENCE_GATE, "Cracked Withered Nether Brick Fence Gate");
			builder.add(MSBlocks.CHISELED_WITHERED_NETHER_BRICKS, "Chiseled Withered Nether Bricks");
			builder.add(MSBlocks.CHISELED_WITHERED_NETHER_BRICK_SLAB, "Chiseled Withered Nether Brick Slab");
			builder.add(MSBlocks.CHISELED_WITHERED_NETHER_BRICK_STAIRS, "Chiseled Withered Nether Brick Stairs");
			builder.add(MSBlocks.CHISELED_WITHERED_NETHER_BRICK_WALL, "Chiseled Withered Nether Brick Wall");
			builder.add(MSBlocks.CRACKED_CHISELED_WITHERED_NETHER_BRICKS, "Cracked Chiseled Withered Nether Bricks");
			builder.add(MSBlocks.CRACKED_CHISELED_WITHERED_NETHER_BRICK_SLAB, "Cracked Chiseled Withered Nether Brick Slab");
			builder.add(MSBlocks.CRACKED_CHISELED_WITHERED_NETHER_BRICK_STAIRS, "Cracked Chiseled Withered Nether Brick Stairs");
			builder.add(MSBlocks.CRACKED_CHISELED_WITHERED_NETHER_BRICK_WALL, "Cracked Chiseled Withered Nether Brick Wall");
			
			builder.add(MSBlocks.SOUL_NETHER_BRICKS, "Soul Nether Bricks");
			builder.add(MSBlocks.SOUL_NETHER_BRICK_SLAB, "Soul Nether Brick Slab");
			builder.add(MSBlocks.SOUL_NETHER_BRICK_STAIRS, "Soul Nether Brick Stairs");
			builder.add(MSBlocks.SOUL_NETHER_BRICK_WALL, "Soul Nether Brick Wall");
			builder.add(MSBlocks.SOUL_NETHER_BRICK_FENCE, "Soul Nether Brick Fence");
			builder.add(MSBlocks.SOUL_NETHER_BRICK_FENCE_GATE, "Soul Nether Brick Fence Gate");
			builder.add(MSBlocks.CRACKED_SOUL_NETHER_BRICKS, "Cracked Soul Nether Bricks");
			builder.add(MSBlocks.CRACKED_SOUL_NETHER_BRICK_SLAB, "Cracked Soul Nether Brick Slab");
			builder.add(MSBlocks.CRACKED_SOUL_NETHER_BRICK_STAIRS, "Cracked Soul Nether Brick Stairs");
			builder.add(MSBlocks.CRACKED_SOUL_NETHER_BRICK_WALL, "Cracked Soul Nether Brick Wall");
			builder.add(MSBlocks.CRACKED_SOUL_NETHER_BRICK_FENCE, "Cracked Soul Nether Brick Fence");
			builder.add(MSBlocks.CRACKED_SOUL_NETHER_BRICK_FENCE_GATE, "Cracked Soul Nether Brick Fence Gate");
			builder.add(MSBlocks.CHISELED_SOUL_NETHER_BRICKS, "Chiseled Soul Nether Bricks");
			builder.add(MSBlocks.CHISELED_SOUL_NETHER_BRICK_SLAB, "Chiseled Soul Nether Brick Slab");
			builder.add(MSBlocks.CHISELED_SOUL_NETHER_BRICK_STAIRS, "Chiseled Soul Nether Brick Stairs");
			builder.add(MSBlocks.CHISELED_SOUL_NETHER_BRICK_WALL, "Chiseled Soul Nether Brick Wall");
			builder.add(MSBlocks.CRACKED_CHISELED_SOUL_NETHER_BRICKS, "Cracked Chiseled Soul Nether Bricks");
			builder.add(MSBlocks.CRACKED_CHISELED_SOUL_NETHER_BRICK_SLAB, "Cracked Chiseled Soul Nether Brick Slab");
			builder.add(MSBlocks.CRACKED_CHISELED_SOUL_NETHER_BRICK_STAIRS, "Cracked Chiseled Soul Nether Brick Stairs");
			builder.add(MSBlocks.CRACKED_CHISELED_SOUL_NETHER_BRICK_WALL, "Cracked Chiseled Soul Nether Brick Wall");
			
			builder.add(MSBlocks.BLAZING_NETHER_BRICKS, "Blazing Nether Bricks");
			builder.add(MSBlocks.BLAZING_NETHER_BRICK_SLAB, "Blazing Nether Brick Slab");
			builder.add(MSBlocks.BLAZING_NETHER_BRICK_STAIRS, "Blazing Nether Brick Stairs");
			builder.add(MSBlocks.BLAZING_NETHER_BRICK_WALL, "Blazing Nether Brick Wall");
			builder.add(MSBlocks.BLAZING_NETHER_BRICK_FENCE, "Blazing Nether Brick Fence");
			builder.add(MSBlocks.BLAZING_NETHER_BRICK_FENCE_GATE, "Blazing Nether Brick Fence Gate");
			builder.add(MSBlocks.CRACKED_BLAZING_NETHER_BRICKS, "Cracked Blazing Nether Bricks");
			builder.add(MSBlocks.CRACKED_BLAZING_NETHER_BRICK_SLAB, "Cracked Blazing Nether Brick Slab");
			builder.add(MSBlocks.CRACKED_BLAZING_NETHER_BRICK_STAIRS, "Cracked Blazing Nether Brick Stairs");
			builder.add(MSBlocks.CRACKED_BLAZING_NETHER_BRICK_WALL, "Cracked Blazing Nether Brick Wall");
			builder.add(MSBlocks.CRACKED_BLAZING_NETHER_BRICK_FENCE, "Cracked Blazing Nether Brick Fence");
			builder.add(MSBlocks.CRACKED_BLAZING_NETHER_BRICK_FENCE_GATE, "Cracked Blazing Nether Brick Fence Gate");
			builder.add(MSBlocks.CHISELED_BLAZING_NETHER_BRICKS, "Chiseled Blazing Nether Bricks");
			builder.add(MSBlocks.CHISELED_BLAZING_NETHER_BRICK_SLAB, "Chiseled Blazing Nether Brick Slab");
			builder.add(MSBlocks.CHISELED_BLAZING_NETHER_BRICK_STAIRS, "Chiseled Blazing Nether Brick Stairs");
			builder.add(MSBlocks.CHISELED_BLAZING_NETHER_BRICK_WALL, "Chiseled Blazing Nether Brick Wall");
			builder.add(MSBlocks.CRACKED_CHISELED_BLAZING_NETHER_BRICKS, "Cracked Chiseled Blazing Nether Bricks");
			builder.add(MSBlocks.CRACKED_CHISELED_BLAZING_NETHER_BRICK_SLAB, "Cracked Chiseled Blazing Nether Brick Slab");
			builder.add(MSBlocks.CRACKED_CHISELED_BLAZING_NETHER_BRICK_STAIRS, "Cracked Chiseled Blazing Nether Brick Stairs");
			builder.add(MSBlocks.CRACKED_CHISELED_BLAZING_NETHER_BRICK_WALL, "Cracked Chiseled Blazing Nether Brick Wall");
			
			builder.add(MSBlocks.GLOWING_NETHER_BRICKS, "Glowing Nether Bricks");
			builder.add(MSBlocks.GLOWING_NETHER_BRICK_SLAB, "Glowing Nether Brick Slab");
			builder.add(MSBlocks.GLOWING_NETHER_BRICK_STAIRS, "Glowing Nether Brick Stairs");
			builder.add(MSBlocks.GLOWING_NETHER_BRICK_WALL, "Glowing Nether Brick Wall");
			builder.add(MSBlocks.GLOWING_NETHER_BRICK_FENCE, "Glowing Nether Brick Fence");
			builder.add(MSBlocks.GLOWING_NETHER_BRICK_FENCE_GATE, "Glowing Nether Brick Fence Gate");
			builder.add(MSBlocks.CRACKED_GLOWING_NETHER_BRICKS, "Cracked Glowing Nether Bricks");
			builder.add(MSBlocks.CRACKED_GLOWING_NETHER_BRICK_SLAB, "Cracked Glowing Nether Brick Slab");
			builder.add(MSBlocks.CRACKED_GLOWING_NETHER_BRICK_STAIRS, "Cracked Glowing Nether Brick Stairs");
			builder.add(MSBlocks.CRACKED_GLOWING_NETHER_BRICK_WALL, "Cracked Glowing Nether Brick Wall");
			builder.add(MSBlocks.CRACKED_GLOWING_NETHER_BRICK_FENCE, "Cracked Glowing Nether Brick Fence");
			builder.add(MSBlocks.CRACKED_GLOWING_NETHER_BRICK_FENCE_GATE, "Cracked Glowing Nether Brick Fence Gate");
			builder.add(MSBlocks.CHISELED_GLOWING_NETHER_BRICKS, "Chiseled Glowing Nether Bricks");
			builder.add(MSBlocks.CHISELED_GLOWING_NETHER_BRICK_SLAB, "Chiseled Glowing Nether Brick Slab");
			builder.add(MSBlocks.CHISELED_GLOWING_NETHER_BRICK_STAIRS, "Chiseled Glowing Nether Brick Stairs");
			builder.add(MSBlocks.CHISELED_GLOWING_NETHER_BRICK_WALL, "Chiseled Glowing Nether Brick Wall");
			builder.add(MSBlocks.CRACKED_CHISELED_GLOWING_NETHER_BRICKS, "Cracked Chiseled Glowing Nether Bricks");
			builder.add(MSBlocks.CRACKED_CHISELED_GLOWING_NETHER_BRICK_SLAB, "Cracked Chiseled Glowing Nether Brick Slab");
			builder.add(MSBlocks.CRACKED_CHISELED_GLOWING_NETHER_BRICK_STAIRS, "Cracked Chiseled Glowing Nether Brick Stairs");
			builder.add(MSBlocks.CRACKED_CHISELED_GLOWING_NETHER_BRICK_WALL, "Cracked Chiseled Glowing Nether Brick Wall");
			
			builder.add(MSBlocks.MAGMA_NETHER_BRICKS, "Magma Nether Bricks");
			builder.add(MSBlocks.MAGMA_NETHER_BRICK_SLAB, "Magma Nether Brick Slab");
			builder.add(MSBlocks.MAGMA_NETHER_BRICK_STAIRS, "Magma Nether Brick Stairs");
			builder.add(MSBlocks.MAGMA_NETHER_BRICK_WALL, "Magma Nether Brick Wall");
			builder.add(MSBlocks.MAGMA_NETHER_BRICK_FENCE, "Magma Nether Brick Fence");
			builder.add(MSBlocks.MAGMA_NETHER_BRICK_FENCE_GATE, "Magma Nether Brick Fence Gate");
			builder.add(MSBlocks.CRACKED_MAGMA_NETHER_BRICKS, "Cracked Magma Nether Bricks");
			builder.add(MSBlocks.CRACKED_MAGMA_NETHER_BRICK_SLAB, "Cracked Magma Nether Brick Slab");
			builder.add(MSBlocks.CRACKED_MAGMA_NETHER_BRICK_STAIRS, "Cracked Magma Nether Brick Stairs");
			builder.add(MSBlocks.CRACKED_MAGMA_NETHER_BRICK_WALL, "Cracked Magma Nether Brick Wall");
			builder.add(MSBlocks.CRACKED_MAGMA_NETHER_BRICK_FENCE, "Cracked Magma Nether Brick Fence");
			builder.add(MSBlocks.CRACKED_MAGMA_NETHER_BRICK_FENCE_GATE, "Cracked Magma Nether Brick Fence Gate");
			builder.add(MSBlocks.CHISELED_MAGMA_NETHER_BRICKS, "Chiseled Magma Nether Bricks");
			builder.add(MSBlocks.CHISELED_MAGMA_NETHER_BRICK_SLAB, "Chiseled Magma Nether Brick Slab");
			builder.add(MSBlocks.CHISELED_MAGMA_NETHER_BRICK_STAIRS, "Chiseled Magma Nether Brick Stairs");
			builder.add(MSBlocks.CHISELED_MAGMA_NETHER_BRICK_WALL, "Chiseled Magma Nether Brick Wall");
			builder.add(MSBlocks.CRACKED_CHISELED_MAGMA_NETHER_BRICKS, "Cracked Chiseled Magma Nether Bricks");
			builder.add(MSBlocks.CRACKED_CHISELED_MAGMA_NETHER_BRICK_SLAB, "Cracked Chiseled Magma Nether Brick Slab");
			builder.add(MSBlocks.CRACKED_CHISELED_MAGMA_NETHER_BRICK_STAIRS, "Cracked Chiseled Magma Nether Brick Stairs");
			builder.add(MSBlocks.CRACKED_CHISELED_MAGMA_NETHER_BRICK_WALL, "Cracked Chiseled Magma Nether Brick Wall");
			
			builder.add(MSBlocks.GHASTLY_NETHER_BRICKS, "Ghastly Nether Bricks");
			builder.add(MSBlocks.GHASTLY_NETHER_BRICK_SLAB, "Ghastly Nether Brick Slab");
			builder.add(MSBlocks.GHASTLY_NETHER_BRICK_STAIRS, "Ghastly Nether Brick Stairs");
			builder.add(MSBlocks.GHASTLY_NETHER_BRICK_WALL, "Ghastly Nether Brick Wall");
			builder.add(MSBlocks.GHASTLY_NETHER_BRICK_FENCE, "Ghastly Nether Brick Fence");
			builder.add(MSBlocks.GHASTLY_NETHER_BRICK_FENCE_GATE, "Ghastly Nether Brick Fence Gate");
			builder.add(MSBlocks.CRACKED_GHASTLY_NETHER_BRICKS, "Cracked Ghastly Nether Bricks");
			builder.add(MSBlocks.CRACKED_GHASTLY_NETHER_BRICK_SLAB, "Cracked Ghastly Nether Brick Slab");
			builder.add(MSBlocks.CRACKED_GHASTLY_NETHER_BRICK_STAIRS, "Cracked Ghastly Nether Brick Stairs");
			builder.add(MSBlocks.CRACKED_GHASTLY_NETHER_BRICK_WALL, "Cracked Ghastly Nether Brick Wall");
			builder.add(MSBlocks.CRACKED_GHASTLY_NETHER_BRICK_FENCE, "Cracked Ghastly Nether Brick Fence");
			builder.add(MSBlocks.CRACKED_GHASTLY_NETHER_BRICK_FENCE_GATE, "Cracked Ghastly Nether Brick Fence Gate");
			builder.add(MSBlocks.CHISELED_GHASTLY_NETHER_BRICKS, "Chiseled Ghastly Nether Bricks");
			builder.add(MSBlocks.CHISELED_GHASTLY_NETHER_BRICK_SLAB, "Chiseled Ghastly Nether Brick Slab");
			builder.add(MSBlocks.CHISELED_GHASTLY_NETHER_BRICK_STAIRS, "Chiseled Ghastly Nether Brick Stairs");
			builder.add(MSBlocks.CHISELED_GHASTLY_NETHER_BRICK_WALL, "Chiseled Ghastly Nether Brick Wall");
			builder.add(MSBlocks.CRACKED_CHISELED_GHASTLY_NETHER_BRICKS, "Cracked Chiseled Ghastly Nether Bricks");
			builder.add(MSBlocks.CRACKED_CHISELED_GHASTLY_NETHER_BRICK_SLAB, "Cracked Chiseled Ghastly Nether Brick Slab");
			builder.add(MSBlocks.CRACKED_CHISELED_GHASTLY_NETHER_BRICK_STAIRS, "Cracked Chiseled Ghastly Nether Brick Stairs");
			builder.add(MSBlocks.CRACKED_CHISELED_GHASTLY_NETHER_BRICK_WALL, "Cracked Chiseled Ghastly Nether Brick Wall");
			
			builder.add(MSBlocks.CRACKED_END_STONE_BRICKS, "Cracked End Stone Bricks");
			builder.add(MSBlocks.CRACKED_END_STONE_BRICK_SLAB, "Cracked End Stone Brick Slab");
			builder.add(MSBlocks.CRACKED_END_STONE_BRICK_STAIRS, "Cracked End Stone Brick Stairs");
			builder.add(MSBlocks.CRACKED_END_STONE_BRICK_WALL, "Cracked End Stone Brick Wall");
			
			builder.add(MSBlocks.CRACKED_QUARTZ_BRICKS, "Cracked Quartz Bricks");
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
			
			builder.add(MSBlocks.SUSPICIOUS_RED_SAND, "Suspicious Red Sand");
			builder.add(MSBlocks.SUSPICIOUS_WHITE_SAND, "Suspicious White Sand");
			builder.add(MSBlocks.SUSPICIOUS_BLACK_SAND, "Suspicious Black Sand");
			
			builder.add(MSItems.WITHER_BONE, "Wither Bone");
			builder.add(MSItems.WITHER_BONE_MEAL, "Wither Bone Meal");
			
			builder.add(MSItems.WARPED_WART, "Warped Wart");
			
			builder.add(MSItems.WARPED_NETHER_BRICK, "Warped Nether Brick");
			builder.add(MSItems.WITHERED_NETHER_BRICK, "Withered Nether Brick");
			builder.add(MSItems.SOUL_NETHER_BRICK, "Soul Nether Brick");
			builder.add(MSItems.BLAZING_NETHER_BRICK, "Blazing Nether Brick");
			builder.add(MSItems.GLOWING_NETHER_BRICK, "Glowing Nether Brick");
			builder.add(MSItems.MAGMA_NETHER_BRICK, "Magma Nether Brick");
			builder.add(MSItems.GHASTLY_NETHER_BRICK, "Ghastly Nether Brick");
			
			builder.add(MSItems.FLINT_SWORD, "Flint Sword");
			builder.add(MSItems.FLINT_SHOVEL, "Flint Shovel");
			builder.add(MSItems.FLINT_PICKAXE, "Flint Pickaxe");
			builder.add(MSItems.FLINT_AXE, "Flint Axe");
			builder.add(MSItems.FLINT_HOE, "Flint Hoe");
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
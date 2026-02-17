package gay.mountainspring.item;

import gay.mountainspring.MSMain;
import gay.mountainspring.block.MSBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MSItems {
	private MSItems() {}
	
	public static void init() {
		
	}
	
	public static final Item MOSSY_STONE = registerBlock(MSBlocks.MOSSY_STONE);	
	public static final Item CRACKED_MOSSY_STONE_BRICKS = registerBlock(MSBlocks.CRACKED_MOSSY_STONE_BRICKS);
	public static final Item CRACKED_CHISELED_STONE_BRICKS = registerBlock(MSBlocks.CRACKED_CHISELED_STONE_BRICKS);
	public static final Item MOSSY_CHISELED_STONE_BRICKS = registerBlock(MSBlocks.MOSSY_CHISELED_STONE_BRICKS);
	public static final Item CRACKED_MOSSY_CHISELED_STONE_BRICKS = registerBlock(MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICKS);
	
	public static final Item MOSSY_GRANITE = registerBlock(MSBlocks.MOSSY_GRANITE);
	public static final Item COBBLED_GRANITE = registerBlock(MSBlocks.COBBLED_GRANITE);
	public static final Item MOSSY_COBBLED_GRANITE = registerBlock(MSBlocks.MOSSY_COBBLED_GRANITE);
	public static final Item GRANITE_BRICKS = registerBlock(MSBlocks.GRANITE_BRICKS);
	public static final Item CRACKED_GRANITE_BRICKS = registerBlock(MSBlocks.CRACKED_GRANITE_BRICKS);
	public static final Item MOSSY_GRANITE_BRICKS = registerBlock(MSBlocks.MOSSY_GRANITE_BRICKS);
	public static final Item CRACKED_MOSSY_GRANITE_BRICKS = registerBlock(MSBlocks.CRACKED_MOSSY_GRANITE_BRICKS);
	
	public static final Item MOSSY_DIORITE = registerBlock(MSBlocks.MOSSY_DIORITE);
	public static final Item COBBLED_DIORITE = registerBlock(MSBlocks.COBBLED_DIORITE);
	public static final Item MOSSY_COBBLED_DIORITE = registerBlock(MSBlocks.MOSSY_COBBLED_DIORITE);
	public static final Item DIORITE_BRICKS = registerBlock(MSBlocks.DIORITE_BRICKS);
	public static final Item CRACKED_DIORITE_BRICKS = registerBlock(MSBlocks.CRACKED_DIORITE_BRICKS);
	public static final Item MOSSY_DIORITE_BRICKS = registerBlock(MSBlocks.MOSSY_DIORITE_BRICKS);
	public static final Item CRACKED_MOSSY_DIORITE_BRICKS = registerBlock(MSBlocks.CRACKED_MOSSY_DIORITE_BRICKS);
	
	public static final Item MOSSY_ANDESITE = registerBlock(MSBlocks.MOSSY_ANDESITE);
	public static final Item COBBLED_ANDESITE = registerBlock(MSBlocks.COBBLED_ANDESITE);
	public static final Item MOSSY_COBBLED_ANDESITE = registerBlock(MSBlocks.MOSSY_COBBLED_ANDESITE);
	public static final Item ANDESITE_BRICKS = registerBlock(MSBlocks.ANDESITE_BRICKS);
	public static final Item CRACKED_ANDESITE_BRICKS = registerBlock(MSBlocks.CRACKED_ANDESITE_BRICKS);
	public static final Item MOSSY_ANDESITE_BRICKS = registerBlock(MSBlocks.MOSSY_ANDESITE_BRICKS);
	public static final Item CRACKED_MOSSY_ANDESITE_BRICKS = registerBlock(MSBlocks.CRACKED_MOSSY_ANDESITE_BRICKS);
	
	public static final Item MOSSY_DEEPSLATE = registerBlock(MSBlocks.MOSSY_DEEPSLATE);
	public static final Item MOSSY_COBBLED_DEEPSLATE = registerBlock(MSBlocks.MOSSY_COBBLED_DEEPSLATE);
	public static final Item MOSSY_DEEPSLATE_BRICKS = registerBlock(MSBlocks.MOSSY_DEEPSLATE_BRICKS);
	public static final Item CRACKED_MOSSY_DEEPSLATE_BRICKS = registerBlock(MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICKS);
	public static final Item MOSSY_DEEPSLATE_TILES = registerBlock(MSBlocks.MOSSY_DEEPSLATE_TILES);
	public static final Item CRACKED_MOSSY_DEEPSLATE_TILES = registerBlock(MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILES);
	
	public static final Item MOSSY_TUFF = registerBlock(MSBlocks.MOSSY_TUFF);
	public static final Item CRACKED_TUFF_BRICKS = registerBlock(MSBlocks.CRACKED_TUFF_BRICKS);
	public static final Item MOSSY_TUFF_BRICKS = registerBlock(MSBlocks.MOSSY_TUFF_BRICKS);
	public static final Item CRACKED_MOSSY_TUFF_BRICKS = registerBlock(MSBlocks.CRACKED_MOSSY_TUFF_BRICKS);
	public static final Item CRACKED_CHISELED_TUFF_BRICKS = registerBlock(MSBlocks.CRACKED_CHISELED_TUFF_BRICKS);
	public static final Item MOSSY_CHISELED_TUFF_BRICKS = registerBlock(MSBlocks.MOSSY_CHISELED_TUFF_BRICKS);
	public static final Item CRACKED_MOSSY_CHISELED_TUFF_BRICKS = registerBlock(MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICKS);
	
	public static final Item CRACKED_BRICKS = registerBlock(MSBlocks.CRACKED_BRICKS);
	
	public static final Item CRACKED_MUD_BRICKS = registerBlock(MSBlocks.CRACKED_MUD_BRICKS);
	
	public static final Item SANDSTONE_BRICKS = registerBlock(MSBlocks.SANDSTONE_BRICKS);
	public static final Item CRACKED_SANDSTONE_BRICKS = registerBlock(MSBlocks.CRACKED_SANDSTONE_BRICKS);
	
	public static final Item RED_SANDSTONE_BRICKS = registerBlock(MSBlocks.RED_SANDSTONE_BRICKS);
	public static final Item CRACKED_RED_SANDSTONE_BRICKS = registerBlock(MSBlocks.CRACKED_RED_SANDSTONE_BRICKS);
	
	public static final Item CRACKED_PRISMARINE_BRICKS = registerBlock(MSBlocks.CRACKED_PRISMARINE_BRICKS);
	
	public static final Item CRACKED_CHISELED_NETHER_BRICKS = registerBlock(MSBlocks.CRACKED_CHISELED_NETHER_BRICKS);
	public static final Item CRACKED_RED_NETHER_BRICKS = registerBlock(MSBlocks.CRACKED_RED_NETHER_BRICKS);
	public static final Item CHISELED_RED_NETHER_BRICKS = registerBlock(MSBlocks.CHISELED_RED_NETHER_BRICKS);
	public static final Item CRACKED_CHISELED_RED_NETHER_BRICKS = registerBlock(MSBlocks.CRACKED_CHISELED_RED_NETHER_BRICKS);
	
	public static final Item CRACKED_END_STONE_BRICKS = registerBlock(MSBlocks.CRACKED_END_STONE_BRICKS);
	
	public static final Item CRACKED_QUARTZ_BRICKS = registerBlock(MSBlocks.CRACKED_QUARTZ_BRICKS);
	
	public static final Item MOSSY_STONE_SLAB = registerBlock(MSBlocks.MOSSY_STONE_SLAB);
	public static final Item MOSSY_STONE_STAIRS = registerBlock(MSBlocks.MOSSY_STONE_STAIRS);
	public static final Item MOSSY_STONE_WALL = registerBlock(MSBlocks.MOSSY_STONE_WALL);
	public static final Item CRACKED_MOSSY_STONE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_MOSSY_STONE_BRICK_SLAB);
	public static final Item CRACKED_MOSSY_STONE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_MOSSY_STONE_BRICK_STAIRS);
	public static final Item CRACKED_MOSSY_STONE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_MOSSY_STONE_BRICK_WALL);
	public static final Item CRACKED_CHISELED_STONE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_CHISELED_STONE_BRICK_SLAB);
	public static final Item CRACKED_CHISELED_STONE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_CHISELED_STONE_BRICK_STAIRS);
	public static final Item CRACKED_CHISELED_STONE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_CHISELED_STONE_BRICK_WALL);
	public static final Item MOSSY_CHISELED_STONE_BRICK_SLAB = registerBlock(MSBlocks.MOSSY_CHISELED_STONE_BRICK_SLAB);
	public static final Item MOSSY_CHISELED_STONE_BRICK_STAIRS = registerBlock(MSBlocks.MOSSY_CHISELED_STONE_BRICK_STAIRS);
	public static final Item MOSSY_CHISELED_STONE_BRICK_WALL = registerBlock(MSBlocks.MOSSY_CHISELED_STONE_BRICK_WALL);
	public static final Item CRACKED_MOSSY_CHISELED_STONE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICK_SLAB);
	public static final Item CRACKED_MOSSY_CHISELED_STONE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICK_STAIRS);
	public static final Item CRACKED_MOSSY_CHISELED_STONE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICK_WALL);
	
	public static final Item MOSSY_GRANITE_SLAB = registerBlock(MSBlocks.MOSSY_GRANITE_SLAB);
	public static final Item MOSSY_GRANITE_STAIRS = registerBlock(MSBlocks.MOSSY_GRANITE_STAIRS);
	public static final Item MOSSY_GRANITE_WALL = registerBlock(MSBlocks.MOSSY_GRANITE_WALL);
	public static final Item COBBLED_GRANITE_SLAB = registerBlock(MSBlocks.COBBLED_GRANITE_SLAB);
	public static final Item COBBLED_GRANITE_STAIRS = registerBlock(MSBlocks.COBBLED_GRANITE_STAIRS);
	public static final Item COBBLED_GRANITE_WALL = registerBlock(MSBlocks.COBBLED_GRANITE_WALL);
	public static final Item MOSSY_COBBLED_GRANITE_SLAB = registerBlock(MSBlocks.MOSSY_COBBLED_GRANITE_SLAB);
	public static final Item MOSSY_COBBLED_GRANITE_STAIRS = registerBlock(MSBlocks.MOSSY_COBBLED_GRANITE_STAIRS);
	public static final Item MOSSY_COBBLED_GRANITE_WALL = registerBlock(MSBlocks.MOSSY_COBBLED_GRANITE_WALL);
	public static final Item GRANITE_BRICK_SLAB = registerBlock(MSBlocks.GRANITE_BRICK_SLAB);
	public static final Item GRANITE_BRICK_STAIRS = registerBlock(MSBlocks.GRANITE_BRICK_STAIRS);
	public static final Item GRANITE_BRICK_WALL = registerBlock(MSBlocks.GRANITE_BRICK_WALL);
	public static final Item CRACKED_GRANITE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_GRANITE_BRICK_SLAB);
	public static final Item CRACKED_GRANITE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_GRANITE_BRICK_STAIRS);
	public static final Item CRACKED_GRANITE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_GRANITE_BRICK_WALL);
	public static final Item MOSSY_GRANITE_BRICK_SLAB = registerBlock(MSBlocks.MOSSY_GRANITE_BRICK_SLAB);
	public static final Item MOSSY_GRANITE_BRICK_STAIRS = registerBlock(MSBlocks.MOSSY_GRANITE_BRICK_STAIRS);
	public static final Item MOSSY_GRANITE_BRICK_WALL = registerBlock(MSBlocks.MOSSY_GRANITE_BRICK_WALL);
	public static final Item CRACKED_MOSSY_GRANITE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_MOSSY_GRANITE_BRICK_SLAB);
	public static final Item CRACKED_MOSSY_GRANITE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_MOSSY_GRANITE_BRICK_STAIRS);
	public static final Item CRACKED_MOSSY_GRANITE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_MOSSY_GRANITE_BRICK_WALL);
	
	public static final Item MOSSY_DIORITE_SLAB = registerBlock(MSBlocks.MOSSY_DIORITE_SLAB);
	public static final Item MOSSY_DIORITE_STAIRS = registerBlock(MSBlocks.MOSSY_DIORITE_STAIRS);
	public static final Item MOSSY_DIORITE_WALL = registerBlock(MSBlocks.MOSSY_DIORITE_WALL);
	public static final Item COBBLED_DIORITE_SLAB = registerBlock(MSBlocks.COBBLED_DIORITE_SLAB);
	public static final Item COBBLED_DIORITE_STAIRS = registerBlock(MSBlocks.COBBLED_DIORITE_STAIRS);
	public static final Item COBBLED_DIORITE_WALL = registerBlock(MSBlocks.COBBLED_DIORITE_WALL);
	public static final Item MOSSY_COBBLED_DIORITE_SLAB = registerBlock(MSBlocks.MOSSY_COBBLED_DIORITE_SLAB);
	public static final Item MOSSY_COBBLED_DIORITE_STAIRS = registerBlock(MSBlocks.MOSSY_COBBLED_DIORITE_STAIRS);
	public static final Item MOSSY_COBBLED_DIORITE_WALL = registerBlock(MSBlocks.MOSSY_COBBLED_DIORITE_WALL);
	public static final Item DIORITE_BRICK_SLAB = registerBlock(MSBlocks.DIORITE_BRICK_SLAB);
	public static final Item DIORITE_BRICK_STAIRS = registerBlock(MSBlocks.DIORITE_BRICK_STAIRS);
	public static final Item DIORITE_BRICK_WALL = registerBlock(MSBlocks.DIORITE_BRICK_WALL);
	public static final Item CRACKED_DIORITE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_DIORITE_BRICK_SLAB);
	public static final Item CRACKED_DIORITE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_DIORITE_BRICK_STAIRS);
	public static final Item CRACKED_DIORITE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_DIORITE_BRICK_WALL);
	public static final Item MOSSY_DIORITE_BRICK_SLAB = registerBlock(MSBlocks.MOSSY_DIORITE_BRICK_SLAB);
	public static final Item MOSSY_DIORITE_BRICK_STAIRS = registerBlock(MSBlocks.MOSSY_DIORITE_BRICK_STAIRS);
	public static final Item MOSSY_DIORITE_BRICK_WALL = registerBlock(MSBlocks.MOSSY_DIORITE_BRICK_WALL);
	public static final Item CRACKED_MOSSY_DIORITE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_MOSSY_DIORITE_BRICK_SLAB);
	public static final Item CRACKED_MOSSY_DIORITE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_MOSSY_DIORITE_BRICK_STAIRS);
	public static final Item CRACKED_MOSSY_DIORITE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_MOSSY_DIORITE_BRICK_WALL);
	
	public static final Item MOSSY_ANDESITE_SLAB = registerBlock(MSBlocks.MOSSY_ANDESITE_SLAB);
	public static final Item MOSSY_ANDESITE_STAIRS = registerBlock(MSBlocks.MOSSY_ANDESITE_STAIRS);
	public static final Item MOSSY_ANDESITE_WALL = registerBlock(MSBlocks.MOSSY_ANDESITE_WALL);
	public static final Item COBBLED_ANDESITE_SLAB = registerBlock(MSBlocks.COBBLED_ANDESITE_SLAB);
	public static final Item COBBLED_ANDESITE_STAIRS = registerBlock(MSBlocks.COBBLED_ANDESITE_STAIRS);
	public static final Item COBBLED_ANDESITE_WALL = registerBlock(MSBlocks.COBBLED_ANDESITE_WALL);
	public static final Item MOSSY_COBBLED_ANDESITE_SLAB = registerBlock(MSBlocks.MOSSY_COBBLED_ANDESITE_SLAB);
	public static final Item MOSSY_COBBLED_ANDESITE_STAIRS = registerBlock(MSBlocks.MOSSY_COBBLED_ANDESITE_STAIRS);
	public static final Item MOSSY_COBBLED_ANDESITE_WALL = registerBlock(MSBlocks.MOSSY_COBBLED_ANDESITE_WALL);
	public static final Item ANDESITE_BRICK_SLAB = registerBlock(MSBlocks.ANDESITE_BRICK_SLAB);
	public static final Item ANDESITE_BRICK_STAIRS = registerBlock(MSBlocks.ANDESITE_BRICK_STAIRS);
	public static final Item ANDESITE_BRICK_WALL = registerBlock(MSBlocks.ANDESITE_BRICK_WALL);
	public static final Item CRACKED_ANDESITE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_ANDESITE_BRICK_SLAB);
	public static final Item CRACKED_ANDESITE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_ANDESITE_BRICK_STAIRS);
	public static final Item CRACKED_ANDESITE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_ANDESITE_BRICK_WALL);
	public static final Item MOSSY_ANDESITE_BRICK_SLAB = registerBlock(MSBlocks.MOSSY_ANDESITE_BRICK_SLAB);
	public static final Item MOSSY_ANDESITE_BRICK_STAIRS = registerBlock(MSBlocks.MOSSY_ANDESITE_BRICK_STAIRS);
	public static final Item MOSSY_ANDESITE_BRICK_WALL = registerBlock(MSBlocks.MOSSY_ANDESITE_BRICK_WALL);
	public static final Item CRACKED_MOSSY_ANDESITE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_MOSSY_ANDESITE_BRICK_SLAB);
	public static final Item CRACKED_MOSSY_ANDESITE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_MOSSY_ANDESITE_BRICK_STAIRS);
	public static final Item CRACKED_MOSSY_ANDESITE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_MOSSY_ANDESITE_BRICK_WALL);
	
	public static final Item MOSSY_DEEPSLATE_SLAB = registerBlock(MSBlocks.MOSSY_DEEPSLATE_SLAB);
	public static final Item MOSSY_DEEPSLATE_STAIRS = registerBlock(MSBlocks.MOSSY_DEEPSLATE_STAIRS);
	public static final Item MOSSY_DEEPSLATE_WALL = registerBlock(MSBlocks.MOSSY_DEEPSLATE_WALL);
	public static final Item MOSSY_COBBLED_DEEPSLATE_SLAB = registerBlock(MSBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB);
	public static final Item MOSSY_COBBLED_DEEPSLATE_STAIRS = registerBlock(MSBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS);
	public static final Item MOSSY_COBBLED_DEEPSLATE_WALL = registerBlock(MSBlocks.MOSSY_COBBLED_DEEPSLATE_WALL);
	public static final Item MOSSY_DEEPSLATE_BRICK_SLAB = registerBlock(MSBlocks.MOSSY_DEEPSLATE_BRICK_SLAB);
	public static final Item MOSSY_DEEPSLATE_BRICK_STAIRS = registerBlock(MSBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS);
	public static final Item MOSSY_DEEPSLATE_BRICK_WALL = registerBlock(MSBlocks.MOSSY_DEEPSLATE_BRICK_WALL);
	public static final Item CRACKED_MOSSY_DEEPSLATE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICK_SLAB);
	public static final Item CRACKED_MOSSY_DEEPSLATE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICK_STAIRS);
	public static final Item CRACKED_MOSSY_DEEPSLATE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICK_WALL);
	public static final Item MOSSY_DEEPSLATE_TILE_SLAB = registerBlock(MSBlocks.MOSSY_DEEPSLATE_TILE_SLAB);
	public static final Item MOSSY_DEEPSLATE_TILE_STAIRS = registerBlock(MSBlocks.MOSSY_DEEPSLATE_TILE_STAIRS);
	public static final Item MOSSY_DEEPSLATE_TILE_WALL = registerBlock(MSBlocks.MOSSY_DEEPSLATE_TILE_WALL);
	public static final Item CRACKED_MOSSY_DEEPSLATE_TILE_SLAB = registerBlock(MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILE_SLAB);
	public static final Item CRACKED_MOSSY_DEEPSLATE_TILE_STAIRS = registerBlock(MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILE_STAIRS);
	public static final Item CRACKED_MOSSY_DEEPSLATE_TILE_WALL = registerBlock(MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILE_WALL);
	
	public static final Item MOSSY_TUFF_SLAB = registerBlock(MSBlocks.MOSSY_TUFF_SLAB);
	public static final Item MOSSY_TUFF_STAIRS = registerBlock(MSBlocks.MOSSY_TUFF_STAIRS);
	public static final Item MOSSY_TUFF_WALL = registerBlock(MSBlocks.MOSSY_TUFF_WALL);
	public static final Item CRACKED_TUFF_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_TUFF_BRICK_SLAB);
	public static final Item CRACKED_TUFF_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_TUFF_BRICK_STAIRS);
	public static final Item CRACKED_TUFF_BRICK_WALL = registerBlock(MSBlocks.CRACKED_TUFF_BRICK_WALL);
	public static final Item MOSSY_TUFF_BRICK_SLAB = registerBlock(MSBlocks.MOSSY_TUFF_BRICK_SLAB);
	public static final Item MOSSY_TUFF_BRICK_STAIRS = registerBlock(MSBlocks.MOSSY_TUFF_BRICK_STAIRS);
	public static final Item MOSSY_TUFF_BRICK_WALL = registerBlock(MSBlocks.MOSSY_TUFF_BRICK_WALL);
	public static final Item CRACKED_MOSSY_TUFF_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_MOSSY_TUFF_BRICK_SLAB);
	public static final Item CRACKED_MOSSY_TUFF_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_MOSSY_TUFF_BRICK_STAIRS);
	public static final Item CRACKED_MOSSY_TUFF_BRICK_WALL = registerBlock(MSBlocks.CRACKED_MOSSY_TUFF_BRICK_WALL);
	public static final Item CRACKED_CHISELED_TUFF_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_CHISELED_TUFF_BRICK_SLAB);
	public static final Item CRACKED_CHISELED_TUFF_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_CHISELED_TUFF_BRICK_STAIRS);
	public static final Item CRACKED_CHISELED_TUFF_BRICK_WALL = registerBlock(MSBlocks.CRACKED_CHISELED_TUFF_BRICK_WALL);
	public static final Item MOSSY_CHISELED_TUFF_BRICK_SLAB = registerBlock(MSBlocks.MOSSY_CHISELED_TUFF_BRICK_SLAB);
	public static final Item MOSSY_CHISELED_TUFF_BRICK_STAIRS = registerBlock(MSBlocks.MOSSY_CHISELED_TUFF_BRICK_STAIRS);
	public static final Item MOSSY_CHISELED_TUFF_BRICK_WALL = registerBlock(MSBlocks.MOSSY_CHISELED_TUFF_BRICK_WALL);
	public static final Item CRACKED_MOSSY_CHISELED_TUFF_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICK_SLAB);
	public static final Item CRACKED_MOSSY_CHISELED_TUFF_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICK_STAIRS);
	public static final Item CRACKED_MOSSY_CHISELED_TUFF_BRICK_WALL = registerBlock(MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICK_WALL);
	
	public static final Item CRACKED_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_BRICK_SLAB);
	public static final Item CRACKED_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_BRICK_STAIRS);
	public static final Item CRACKED_BRICK_WALL = registerBlock(MSBlocks.CRACKED_BRICK_WALL);
	
	public static final Item CRACKED_MUD_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_MUD_BRICK_SLAB);
	public static final Item CRACKED_MUD_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_MUD_BRICK_STAIRS);
	public static final Item CRACKED_MUD_BRICK_WALL = registerBlock(MSBlocks.CRACKED_MUD_BRICK_WALL);
	
	public static final Item SANDSTONE_BRICK_SLAB = registerBlock(MSBlocks.SANDSTONE_BRICK_SLAB);
	public static final Item SANDSTONE_BRICK_STAIRS = registerBlock(MSBlocks.SANDSTONE_BRICK_STAIRS);
	public static final Item SANDSTONE_BRICK_WALL = registerBlock(MSBlocks.SANDSTONE_BRICK_WALL);
	public static final Item CRACKED_SANDSTONE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_SANDSTONE_BRICK_SLAB);
	public static final Item CRACKED_SANDSTONE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_SANDSTONE_BRICK_STAIRS);
	public static final Item CRACKED_SANDSTONE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_SANDSTONE_BRICK_WALL);
	
	public static final Item RED_SANDSTONE_BRICK_SLAB = registerBlock(MSBlocks.RED_SANDSTONE_BRICK_SLAB);
	public static final Item RED_SANDSTONE_BRICK_STAIRS = registerBlock(MSBlocks.RED_SANDSTONE_BRICK_STAIRS);
	public static final Item RED_SANDSTONE_BRICK_WALL = registerBlock(MSBlocks.RED_SANDSTONE_BRICK_WALL);
	public static final Item CRACKED_RED_SANDSTONE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_RED_SANDSTONE_BRICK_SLAB);
	public static final Item CRACKED_RED_SANDSTONE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_RED_SANDSTONE_BRICK_STAIRS);
	public static final Item CRACKED_RED_SANDSTONE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_RED_SANDSTONE_BRICK_WALL);
	
	public static final Item CRACKED_PRISMARINE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_PRISMARINE_BRICK_SLAB);
	public static final Item CRACKED_PRISMARINE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_PRISMARINE_BRICK_STAIRS);
	public static final Item CRACKED_PRISMARINE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_PRISMARINE_BRICK_WALL);
	
	public static final Item CRACKED_CHISELED_NETHER_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_CHISELED_NETHER_BRICK_SLAB);
	public static final Item CRACKED_CHISELED_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_CHISELED_NETHER_BRICK_STAIRS);
	public static final Item CRACKED_CHISELED_NETHER_BRICK_WALL = registerBlock(MSBlocks.CRACKED_CHISELED_NETHER_BRICK_WALL);
	public static final Item CRACKED_RED_NETHER_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_RED_NETHER_BRICK_SLAB);
	public static final Item CRACKED_RED_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_RED_NETHER_BRICK_STAIRS);
	public static final Item CRACKED_RED_NETHER_BRICK_WALL = registerBlock(MSBlocks.CRACKED_RED_NETHER_BRICK_WALL);
	public static final Item CRACKED_RED_NETHER_BRICK_FENCE = registerBlock(MSBlocks.CRACKED_RED_NETHER_BRICK_FENCE);
	public static final Item CRACKED_RED_NETHER_BRICK_FENCE_GATE = registerBlock(MSBlocks.CRACKED_RED_NETHER_BRICK_FENCE_GATE);
	public static final Item CHISELED_RED_NETHER_BRICK_SLAB = registerBlock(MSBlocks.CHISELED_RED_NETHER_BRICK_SLAB);
	public static final Item CHISELED_RED_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.CHISELED_RED_NETHER_BRICK_STAIRS);
	public static final Item CHISELED_RED_NETHER_BRICK_WALL = registerBlock(MSBlocks.CHISELED_RED_NETHER_BRICK_WALL);
	public static final Item CRACKED_CHISELED_RED_NETHER_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_CHISELED_RED_NETHER_BRICK_SLAB);
	public static final Item CRACKED_CHISELED_RED_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_CHISELED_RED_NETHER_BRICK_STAIRS);
	public static final Item CRACKED_CHISELED_RED_NETHER_BRICK_WALL = registerBlock(MSBlocks.CRACKED_CHISELED_RED_NETHER_BRICK_WALL);
	
	public static final Item CRACKED_END_STONE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_END_STONE_BRICK_SLAB);
	public static final Item CRACKED_END_STONE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_END_STONE_BRICK_STAIRS);
	public static final Item CRACKED_END_STONE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_END_STONE_BRICK_WALL);
	
	public static final Item CRACKED_QUARTZ_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_QUARTZ_BRICK_SLAB);
	public static final Item CRACKED_QUARTZ_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_QUARTZ_BRICK_STAIRS);
	public static final Item CRACKED_QUARTZ_BRICK_WALL = registerBlock(MSBlocks.CRACKED_QUARTZ_BRICK_WALL);
	
	public static final Item INFESTED_MOSSY_STONE = registerBlock(MSBlocks.INFESTED_MOSSY_STONE);
	public static final Item INFESTED_CRACKED_MOSSY_STONE_BRICKS = registerBlock(MSBlocks.INFESTED_CRACKED_MOSSY_STONE_BRICKS);
	public static final Item INFESTED_CRACKED_CHISELED_STONE_BRICKS = registerBlock(MSBlocks.INFESTED_CRACKED_CHISELED_STONE_BRICKS);
	public static final Item INFESTED_MOSSY_CHISELED_STONE_BRICKS = registerBlock(MSBlocks.INFESTED_MOSSY_CHISELED_STONE_BRICKS);
	public static final Item INFESTED_CRACKED_MOSSY_CHISELED_STONE_BRICKS = registerBlock(MSBlocks.INFESTED_CRACKED_MOSSY_CHISELED_STONE_BRICKS);
	
	public static final Item INFESTED_MOSSY_GRANITE = registerBlock(MSBlocks.INFESTED_MOSSY_GRANITE);
	public static final Item INFESTED_COBBLED_GRANITE = registerBlock(MSBlocks.INFESTED_COBBLED_GRANITE);
	public static final Item INFESTED_MOSSY_COBBLED_GRANITE = registerBlock(MSBlocks.INFESTED_MOSSY_COBBLED_GRANITE);
	public static final Item INFESTED_GRANITE_BRICKS = registerBlock(MSBlocks.INFESTED_GRANITE_BRICKS);
	public static final Item INFESTED_CRACKED_GRANITE_BRICKS = registerBlock(MSBlocks.INFESTED_CRACKED_GRANITE_BRICKS);
	public static final Item INFESTED_MOSSY_GRANITE_BRICKS = registerBlock(MSBlocks.INFESTED_MOSSY_GRANITE_BRICKS);
	public static final Item INFESTED_CRACKED_MOSSY_GRANITE_BRICKS = registerBlock(MSBlocks.INFESTED_CRACKED_MOSSY_GRANITE_BRICKS);
	
	public static final Item INFESTED_MOSSY_DIORITE = registerBlock(MSBlocks.INFESTED_MOSSY_DIORITE);
	public static final Item INFESTED_COBBLED_DIORITE = registerBlock(MSBlocks.INFESTED_COBBLED_DIORITE);
	public static final Item INFESTED_MOSSY_COBBLED_DIORITE = registerBlock(MSBlocks.INFESTED_MOSSY_COBBLED_DIORITE);
	public static final Item INFESTED_DIORITE_BRICKS = registerBlock(MSBlocks.INFESTED_DIORITE_BRICKS);
	public static final Item INFESTED_CRACKED_DIORITE_BRICKS = registerBlock(MSBlocks.INFESTED_CRACKED_DIORITE_BRICKS);
	public static final Item INFESTED_MOSSY_DIORITE_BRICKS = registerBlock(MSBlocks.INFESTED_MOSSY_DIORITE_BRICKS);
	public static final Item INFESTED_CRACKED_MOSSY_DIORITE_BRICKS = registerBlock(MSBlocks.INFESTED_CRACKED_MOSSY_DIORITE_BRICKS);
	
	public static final Item INFESTED_MOSSY_ANDESITE = registerBlock(MSBlocks.INFESTED_MOSSY_ANDESITE);
	public static final Item INFESTED_COBBLED_ANDESITE = registerBlock(MSBlocks.INFESTED_COBBLED_ANDESITE);
	public static final Item INFESTED_MOSSY_COBBLED_ANDESITE = registerBlock(MSBlocks.INFESTED_MOSSY_COBBLED_ANDESITE);
	public static final Item INFESTED_ANDESITE_BRICKS = registerBlock(MSBlocks.INFESTED_ANDESITE_BRICKS);
	public static final Item INFESTED_CRACKED_ANDESITE_BRICKS = registerBlock(MSBlocks.INFESTED_CRACKED_ANDESITE_BRICKS);
	public static final Item INFESTED_MOSSY_ANDESITE_BRICKS = registerBlock(MSBlocks.INFESTED_MOSSY_ANDESITE_BRICKS);
	public static final Item INFESTED_CRACKED_MOSSY_ANDESITE_BRICKS = registerBlock(MSBlocks.INFESTED_CRACKED_MOSSY_ANDESITE_BRICKS);
	
	public static final Item INFESTED_MOSSY_DEEPSLATE = registerBlock(MSBlocks.INFESTED_MOSSY_DEEPSLATE);
	public static final Item INFESTED_MOSSY_COBBLED_DEEPSLATE = registerBlock(MSBlocks.INFESTED_MOSSY_COBBLED_DEEPSLATE);
	public static final Item INFESTED_MOSSY_DEEPSLATE_BRICKS = registerBlock(MSBlocks.INFESTED_MOSSY_DEEPSLATE_BRICKS);
	public static final Item INFESTED_CRACKED_MOSSY_DEEPSLATE_BRICKS = registerBlock(MSBlocks.INFESTED_CRACKED_MOSSY_DEEPSLATE_BRICKS);
	public static final Item INFESTED_MOSSY_DEEPSLATE_TILES = registerBlock(MSBlocks.INFESTED_MOSSY_DEEPSLATE_TILES);
	public static final Item INFESTED_CRACKED_MOSSY_DEEPSLATE_TILES = registerBlock(MSBlocks.INFESTED_CRACKED_MOSSY_DEEPSLATE_TILES);
	
	public static final Item INFESTED_MOSSY_TUFF = registerBlock(MSBlocks.INFESTED_MOSSY_TUFF);
	public static final Item INFESTED_CRACKED_TUFF_BRICKS = registerBlock(MSBlocks.INFESTED_CRACKED_TUFF_BRICKS);
	public static final Item INFESTED_MOSSY_TUFF_BRICKS = registerBlock(MSBlocks.INFESTED_MOSSY_TUFF_BRICKS);
	public static final Item INFESTED_CRACKED_MOSSY_TUFF_BRICKS = registerBlock(MSBlocks.INFESTED_CRACKED_MOSSY_TUFF_BRICKS);
	public static final Item INFESTED_CRACKED_CHISELED_TUFF_BRICKS = registerBlock(MSBlocks.INFESTED_CRACKED_CHISELED_TUFF_BRICKS);
	public static final Item INFESTED_MOSSY_CHISELED_TUFF_BRICKS = registerBlock(MSBlocks.INFESTED_MOSSY_CHISELED_TUFF_BRICKS);
	public static final Item INFESTED_CRACKED_MOSSY_CHISELED_TUFF_BRICKS = registerBlock(MSBlocks.INFESTED_CRACKED_MOSSY_CHISELED_TUFF_BRICKS);
	
	public static Item register(String name) {
		return register(name, new Item.Settings());
	}
	
	public static Item register(String name, Item.Settings settings) {
		return register(name, new Item(settings));
	}
	
	public static Item register(String name, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(MSMain.MOD_ID, name), item);
	}
	
	public static Item registerBlock(Block block) {
		return registerBlock(block, new Item.Settings());
	}
	
	public static Item registerBlock(Block block, Item.Settings settings) {
		return register(Registries.BLOCK.getId(block).getPath(), new BlockItem(block, settings));
	}
}
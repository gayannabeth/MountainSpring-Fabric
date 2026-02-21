package gay.mountainspring.item;

import java.util.function.Function;

import gay.mountainspring.MSMain;
import gay.mountainspring.aquifer.item.AquiferAxeItem;
import gay.mountainspring.aquifer.item.AquiferHoeItem;
import gay.mountainspring.aquifer.item.AquiferPickaxeItem;
import gay.mountainspring.aquifer.item.AquiferShovelItem;
import gay.mountainspring.aquifer.item.AquiferSwordItem;
import gay.mountainspring.block.MSBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BoneMealItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MSItems {
	private MSItems() {}
	
	public static void init() {}
	
	public static final Item MOSSY_STONE = registerBlock(MSBlocks.MOSSY_STONE);	
	public static final Item MOSSY_STONE_SLAB = registerBlock(MSBlocks.MOSSY_STONE_SLAB);
	public static final Item MOSSY_STONE_STAIRS = registerBlock(MSBlocks.MOSSY_STONE_STAIRS);
	public static final Item MOSSY_STONE_WALL = registerBlock(MSBlocks.MOSSY_STONE_WALL);
	public static final Item CRACKED_MOSSY_STONE_BRICKS = registerBlock(MSBlocks.CRACKED_MOSSY_STONE_BRICKS);
	public static final Item CRACKED_MOSSY_STONE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_MOSSY_STONE_BRICK_SLAB);
	public static final Item CRACKED_MOSSY_STONE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_MOSSY_STONE_BRICK_STAIRS);
	public static final Item CRACKED_MOSSY_STONE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_MOSSY_STONE_BRICK_WALL);
	public static final Item CRACKED_CHISELED_STONE_BRICKS = registerBlock(MSBlocks.CRACKED_CHISELED_STONE_BRICKS);
	public static final Item CRACKED_CHISELED_STONE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_CHISELED_STONE_BRICK_SLAB);
	public static final Item CRACKED_CHISELED_STONE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_CHISELED_STONE_BRICK_STAIRS);
	public static final Item CRACKED_CHISELED_STONE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_CHISELED_STONE_BRICK_WALL);
	public static final Item MOSSY_CHISELED_STONE_BRICKS = registerBlock(MSBlocks.MOSSY_CHISELED_STONE_BRICKS);
	public static final Item MOSSY_CHISELED_STONE_BRICK_SLAB = registerBlock(MSBlocks.MOSSY_CHISELED_STONE_BRICK_SLAB);
	public static final Item MOSSY_CHISELED_STONE_BRICK_STAIRS = registerBlock(MSBlocks.MOSSY_CHISELED_STONE_BRICK_STAIRS);
	public static final Item MOSSY_CHISELED_STONE_BRICK_WALL = registerBlock(MSBlocks.MOSSY_CHISELED_STONE_BRICK_WALL);
	public static final Item CRACKED_MOSSY_CHISELED_STONE_BRICKS = registerBlock(MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICKS);
	public static final Item CRACKED_MOSSY_CHISELED_STONE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICK_SLAB);
	public static final Item CRACKED_MOSSY_CHISELED_STONE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICK_STAIRS);
	public static final Item CRACKED_MOSSY_CHISELED_STONE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICK_WALL);
	
	public static final Item MOSSY_GRANITE = registerBlock(MSBlocks.MOSSY_GRANITE);
	public static final Item MOSSY_GRANITE_SLAB = registerBlock(MSBlocks.MOSSY_GRANITE_SLAB);
	public static final Item MOSSY_GRANITE_STAIRS = registerBlock(MSBlocks.MOSSY_GRANITE_STAIRS);
	public static final Item MOSSY_GRANITE_WALL = registerBlock(MSBlocks.MOSSY_GRANITE_WALL);
	public static final Item COBBLED_GRANITE = registerBlock(MSBlocks.COBBLED_GRANITE);
	public static final Item COBBLED_GRANITE_SLAB = registerBlock(MSBlocks.COBBLED_GRANITE_SLAB);
	public static final Item COBBLED_GRANITE_STAIRS = registerBlock(MSBlocks.COBBLED_GRANITE_STAIRS);
	public static final Item COBBLED_GRANITE_WALL = registerBlock(MSBlocks.COBBLED_GRANITE_WALL);
	public static final Item MOSSY_COBBLED_GRANITE = registerBlock(MSBlocks.MOSSY_COBBLED_GRANITE);
	public static final Item MOSSY_COBBLED_GRANITE_SLAB = registerBlock(MSBlocks.MOSSY_COBBLED_GRANITE_SLAB);
	public static final Item MOSSY_COBBLED_GRANITE_STAIRS = registerBlock(MSBlocks.MOSSY_COBBLED_GRANITE_STAIRS);
	public static final Item MOSSY_COBBLED_GRANITE_WALL = registerBlock(MSBlocks.MOSSY_COBBLED_GRANITE_WALL);
	public static final Item GRANITE_BRICKS = registerBlock(MSBlocks.GRANITE_BRICKS);
	public static final Item GRANITE_BRICK_SLAB = registerBlock(MSBlocks.GRANITE_BRICK_SLAB);
	public static final Item GRANITE_BRICK_STAIRS = registerBlock(MSBlocks.GRANITE_BRICK_STAIRS);
	public static final Item GRANITE_BRICK_WALL = registerBlock(MSBlocks.GRANITE_BRICK_WALL);
	public static final Item CRACKED_GRANITE_BRICKS = registerBlock(MSBlocks.CRACKED_GRANITE_BRICKS);
	public static final Item CRACKED_GRANITE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_GRANITE_BRICK_SLAB);
	public static final Item CRACKED_GRANITE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_GRANITE_BRICK_STAIRS);
	public static final Item CRACKED_GRANITE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_GRANITE_BRICK_WALL);
	public static final Item MOSSY_GRANITE_BRICKS = registerBlock(MSBlocks.MOSSY_GRANITE_BRICKS);
	public static final Item MOSSY_GRANITE_BRICK_SLAB = registerBlock(MSBlocks.MOSSY_GRANITE_BRICK_SLAB);
	public static final Item MOSSY_GRANITE_BRICK_STAIRS = registerBlock(MSBlocks.MOSSY_GRANITE_BRICK_STAIRS);
	public static final Item MOSSY_GRANITE_BRICK_WALL = registerBlock(MSBlocks.MOSSY_GRANITE_BRICK_WALL);
	public static final Item CRACKED_MOSSY_GRANITE_BRICKS = registerBlock(MSBlocks.CRACKED_MOSSY_GRANITE_BRICKS);
	public static final Item CRACKED_MOSSY_GRANITE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_MOSSY_GRANITE_BRICK_SLAB);
	public static final Item CRACKED_MOSSY_GRANITE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_MOSSY_GRANITE_BRICK_STAIRS);
	public static final Item CRACKED_MOSSY_GRANITE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_MOSSY_GRANITE_BRICK_WALL);
	
	public static final Item MOSSY_DIORITE = registerBlock(MSBlocks.MOSSY_DIORITE);
	public static final Item MOSSY_DIORITE_SLAB = registerBlock(MSBlocks.MOSSY_DIORITE_SLAB);
	public static final Item MOSSY_DIORITE_STAIRS = registerBlock(MSBlocks.MOSSY_DIORITE_STAIRS);
	public static final Item MOSSY_DIORITE_WALL = registerBlock(MSBlocks.MOSSY_DIORITE_WALL);
	public static final Item COBBLED_DIORITE = registerBlock(MSBlocks.COBBLED_DIORITE);
	public static final Item COBBLED_DIORITE_SLAB = registerBlock(MSBlocks.COBBLED_DIORITE_SLAB);
	public static final Item COBBLED_DIORITE_STAIRS = registerBlock(MSBlocks.COBBLED_DIORITE_STAIRS);
	public static final Item COBBLED_DIORITE_WALL = registerBlock(MSBlocks.COBBLED_DIORITE_WALL);
	public static final Item MOSSY_COBBLED_DIORITE = registerBlock(MSBlocks.MOSSY_COBBLED_DIORITE);
	public static final Item MOSSY_COBBLED_DIORITE_SLAB = registerBlock(MSBlocks.MOSSY_COBBLED_DIORITE_SLAB);
	public static final Item MOSSY_COBBLED_DIORITE_STAIRS = registerBlock(MSBlocks.MOSSY_COBBLED_DIORITE_STAIRS);
	public static final Item MOSSY_COBBLED_DIORITE_WALL = registerBlock(MSBlocks.MOSSY_COBBLED_DIORITE_WALL);
	public static final Item DIORITE_BRICKS = registerBlock(MSBlocks.DIORITE_BRICKS);
	public static final Item DIORITE_BRICK_SLAB = registerBlock(MSBlocks.DIORITE_BRICK_SLAB);
	public static final Item DIORITE_BRICK_STAIRS = registerBlock(MSBlocks.DIORITE_BRICK_STAIRS);
	public static final Item DIORITE_BRICK_WALL = registerBlock(MSBlocks.DIORITE_BRICK_WALL);
	public static final Item CRACKED_DIORITE_BRICKS = registerBlock(MSBlocks.CRACKED_DIORITE_BRICKS);
	public static final Item CRACKED_DIORITE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_DIORITE_BRICK_SLAB);
	public static final Item CRACKED_DIORITE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_DIORITE_BRICK_STAIRS);
	public static final Item CRACKED_DIORITE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_DIORITE_BRICK_WALL);
	public static final Item MOSSY_DIORITE_BRICKS = registerBlock(MSBlocks.MOSSY_DIORITE_BRICKS);
	public static final Item MOSSY_DIORITE_BRICK_SLAB = registerBlock(MSBlocks.MOSSY_DIORITE_BRICK_SLAB);
	public static final Item MOSSY_DIORITE_BRICK_STAIRS = registerBlock(MSBlocks.MOSSY_DIORITE_BRICK_STAIRS);
	public static final Item MOSSY_DIORITE_BRICK_WALL = registerBlock(MSBlocks.MOSSY_DIORITE_BRICK_WALL);
	public static final Item CRACKED_MOSSY_DIORITE_BRICKS = registerBlock(MSBlocks.CRACKED_MOSSY_DIORITE_BRICKS);
	public static final Item CRACKED_MOSSY_DIORITE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_MOSSY_DIORITE_BRICK_SLAB);
	public static final Item CRACKED_MOSSY_DIORITE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_MOSSY_DIORITE_BRICK_STAIRS);
	public static final Item CRACKED_MOSSY_DIORITE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_MOSSY_DIORITE_BRICK_WALL);
	
	public static final Item MOSSY_ANDESITE = registerBlock(MSBlocks.MOSSY_ANDESITE);
	public static final Item MOSSY_ANDESITE_SLAB = registerBlock(MSBlocks.MOSSY_ANDESITE_SLAB);
	public static final Item MOSSY_ANDESITE_STAIRS = registerBlock(MSBlocks.MOSSY_ANDESITE_STAIRS);
	public static final Item MOSSY_ANDESITE_WALL = registerBlock(MSBlocks.MOSSY_ANDESITE_WALL);
	public static final Item COBBLED_ANDESITE = registerBlock(MSBlocks.COBBLED_ANDESITE);
	public static final Item COBBLED_ANDESITE_SLAB = registerBlock(MSBlocks.COBBLED_ANDESITE_SLAB);
	public static final Item COBBLED_ANDESITE_STAIRS = registerBlock(MSBlocks.COBBLED_ANDESITE_STAIRS);
	public static final Item COBBLED_ANDESITE_WALL = registerBlock(MSBlocks.COBBLED_ANDESITE_WALL);
	public static final Item MOSSY_COBBLED_ANDESITE = registerBlock(MSBlocks.MOSSY_COBBLED_ANDESITE);
	public static final Item MOSSY_COBBLED_ANDESITE_SLAB = registerBlock(MSBlocks.MOSSY_COBBLED_ANDESITE_SLAB);
	public static final Item MOSSY_COBBLED_ANDESITE_STAIRS = registerBlock(MSBlocks.MOSSY_COBBLED_ANDESITE_STAIRS);
	public static final Item MOSSY_COBBLED_ANDESITE_WALL = registerBlock(MSBlocks.MOSSY_COBBLED_ANDESITE_WALL);
	public static final Item ANDESITE_BRICKS = registerBlock(MSBlocks.ANDESITE_BRICKS);
	public static final Item ANDESITE_BRICK_SLAB = registerBlock(MSBlocks.ANDESITE_BRICK_SLAB);
	public static final Item ANDESITE_BRICK_STAIRS = registerBlock(MSBlocks.ANDESITE_BRICK_STAIRS);
	public static final Item ANDESITE_BRICK_WALL = registerBlock(MSBlocks.ANDESITE_BRICK_WALL);
	public static final Item CRACKED_ANDESITE_BRICKS = registerBlock(MSBlocks.CRACKED_ANDESITE_BRICKS);
	public static final Item CRACKED_ANDESITE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_ANDESITE_BRICK_SLAB);
	public static final Item CRACKED_ANDESITE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_ANDESITE_BRICK_STAIRS);
	public static final Item CRACKED_ANDESITE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_ANDESITE_BRICK_WALL);
	public static final Item MOSSY_ANDESITE_BRICKS = registerBlock(MSBlocks.MOSSY_ANDESITE_BRICKS);
	public static final Item MOSSY_ANDESITE_BRICK_SLAB = registerBlock(MSBlocks.MOSSY_ANDESITE_BRICK_SLAB);
	public static final Item MOSSY_ANDESITE_BRICK_STAIRS = registerBlock(MSBlocks.MOSSY_ANDESITE_BRICK_STAIRS);
	public static final Item MOSSY_ANDESITE_BRICK_WALL = registerBlock(MSBlocks.MOSSY_ANDESITE_BRICK_WALL);
	public static final Item CRACKED_MOSSY_ANDESITE_BRICKS = registerBlock(MSBlocks.CRACKED_MOSSY_ANDESITE_BRICKS);
	public static final Item CRACKED_MOSSY_ANDESITE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_MOSSY_ANDESITE_BRICK_SLAB);
	public static final Item CRACKED_MOSSY_ANDESITE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_MOSSY_ANDESITE_BRICK_STAIRS);
	public static final Item CRACKED_MOSSY_ANDESITE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_MOSSY_ANDESITE_BRICK_WALL);
	
	public static final Item MOSSY_DEEPSLATE = registerBlock(MSBlocks.MOSSY_DEEPSLATE);
	public static final Item MOSSY_DEEPSLATE_SLAB = registerBlock(MSBlocks.MOSSY_DEEPSLATE_SLAB);
	public static final Item MOSSY_DEEPSLATE_STAIRS = registerBlock(MSBlocks.MOSSY_DEEPSLATE_STAIRS);
	public static final Item MOSSY_DEEPSLATE_WALL = registerBlock(MSBlocks.MOSSY_DEEPSLATE_WALL);
	public static final Item MOSSY_COBBLED_DEEPSLATE = registerBlock(MSBlocks.MOSSY_COBBLED_DEEPSLATE);
	public static final Item MOSSY_COBBLED_DEEPSLATE_SLAB = registerBlock(MSBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB);
	public static final Item MOSSY_COBBLED_DEEPSLATE_STAIRS = registerBlock(MSBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS);
	public static final Item MOSSY_COBBLED_DEEPSLATE_WALL = registerBlock(MSBlocks.MOSSY_COBBLED_DEEPSLATE_WALL);
	public static final Item MOSSY_DEEPSLATE_BRICKS = registerBlock(MSBlocks.MOSSY_DEEPSLATE_BRICKS);
	public static final Item MOSSY_DEEPSLATE_BRICK_SLAB = registerBlock(MSBlocks.MOSSY_DEEPSLATE_BRICK_SLAB);
	public static final Item MOSSY_DEEPSLATE_BRICK_STAIRS = registerBlock(MSBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS);
	public static final Item MOSSY_DEEPSLATE_BRICK_WALL = registerBlock(MSBlocks.MOSSY_DEEPSLATE_BRICK_WALL);
	public static final Item CRACKED_MOSSY_DEEPSLATE_BRICKS = registerBlock(MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICKS);
	public static final Item CRACKED_MOSSY_DEEPSLATE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICK_SLAB);
	public static final Item CRACKED_MOSSY_DEEPSLATE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICK_STAIRS);
	public static final Item CRACKED_MOSSY_DEEPSLATE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICK_WALL);
	public static final Item MOSSY_DEEPSLATE_TILES = registerBlock(MSBlocks.MOSSY_DEEPSLATE_TILES);
	public static final Item MOSSY_DEEPSLATE_TILE_SLAB = registerBlock(MSBlocks.MOSSY_DEEPSLATE_TILE_SLAB);
	public static final Item MOSSY_DEEPSLATE_TILE_STAIRS = registerBlock(MSBlocks.MOSSY_DEEPSLATE_TILE_STAIRS);
	public static final Item MOSSY_DEEPSLATE_TILE_WALL = registerBlock(MSBlocks.MOSSY_DEEPSLATE_TILE_WALL);
	public static final Item CRACKED_MOSSY_DEEPSLATE_TILES = registerBlock(MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILES);
	public static final Item CRACKED_MOSSY_DEEPSLATE_TILE_SLAB = registerBlock(MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILE_SLAB);
	public static final Item CRACKED_MOSSY_DEEPSLATE_TILE_STAIRS = registerBlock(MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILE_STAIRS);
	public static final Item CRACKED_MOSSY_DEEPSLATE_TILE_WALL = registerBlock(MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILE_WALL);
	
	public static final Item MOSSY_TUFF = registerBlock(MSBlocks.MOSSY_TUFF);
	public static final Item MOSSY_TUFF_SLAB = registerBlock(MSBlocks.MOSSY_TUFF_SLAB);
	public static final Item MOSSY_TUFF_STAIRS = registerBlock(MSBlocks.MOSSY_TUFF_STAIRS);
	public static final Item MOSSY_TUFF_WALL = registerBlock(MSBlocks.MOSSY_TUFF_WALL);
	public static final Item CRACKED_TUFF_BRICKS = registerBlock(MSBlocks.CRACKED_TUFF_BRICKS);
	public static final Item CRACKED_TUFF_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_TUFF_BRICK_SLAB);
	public static final Item CRACKED_TUFF_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_TUFF_BRICK_STAIRS);
	public static final Item CRACKED_TUFF_BRICK_WALL = registerBlock(MSBlocks.CRACKED_TUFF_BRICK_WALL);
	public static final Item MOSSY_TUFF_BRICKS = registerBlock(MSBlocks.MOSSY_TUFF_BRICKS);
	public static final Item MOSSY_TUFF_BRICK_SLAB = registerBlock(MSBlocks.MOSSY_TUFF_BRICK_SLAB);
	public static final Item MOSSY_TUFF_BRICK_STAIRS = registerBlock(MSBlocks.MOSSY_TUFF_BRICK_STAIRS);
	public static final Item MOSSY_TUFF_BRICK_WALL = registerBlock(MSBlocks.MOSSY_TUFF_BRICK_WALL);
	public static final Item CRACKED_MOSSY_TUFF_BRICKS = registerBlock(MSBlocks.CRACKED_MOSSY_TUFF_BRICKS);
	public static final Item CRACKED_MOSSY_TUFF_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_MOSSY_TUFF_BRICK_SLAB);
	public static final Item CRACKED_MOSSY_TUFF_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_MOSSY_TUFF_BRICK_STAIRS);
	public static final Item CRACKED_MOSSY_TUFF_BRICK_WALL = registerBlock(MSBlocks.CRACKED_MOSSY_TUFF_BRICK_WALL);
	public static final Item CRACKED_CHISELED_TUFF_BRICKS = registerBlock(MSBlocks.CRACKED_CHISELED_TUFF_BRICKS);
	public static final Item CRACKED_CHISELED_TUFF_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_CHISELED_TUFF_BRICK_SLAB);
	public static final Item CRACKED_CHISELED_TUFF_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_CHISELED_TUFF_BRICK_STAIRS);
	public static final Item CRACKED_CHISELED_TUFF_BRICK_WALL = registerBlock(MSBlocks.CRACKED_CHISELED_TUFF_BRICK_WALL);
	public static final Item MOSSY_CHISELED_TUFF_BRICKS = registerBlock(MSBlocks.MOSSY_CHISELED_TUFF_BRICKS);
	public static final Item MOSSY_CHISELED_TUFF_BRICK_SLAB = registerBlock(MSBlocks.MOSSY_CHISELED_TUFF_BRICK_SLAB);
	public static final Item MOSSY_CHISELED_TUFF_BRICK_STAIRS = registerBlock(MSBlocks.MOSSY_CHISELED_TUFF_BRICK_STAIRS);
	public static final Item MOSSY_CHISELED_TUFF_BRICK_WALL = registerBlock(MSBlocks.MOSSY_CHISELED_TUFF_BRICK_WALL);
	public static final Item CRACKED_MOSSY_CHISELED_TUFF_BRICKS = registerBlock(MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICKS);
	public static final Item CRACKED_MOSSY_CHISELED_TUFF_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICK_SLAB);
	public static final Item CRACKED_MOSSY_CHISELED_TUFF_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICK_STAIRS);
	public static final Item CRACKED_MOSSY_CHISELED_TUFF_BRICK_WALL = registerBlock(MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICK_WALL);
	
	public static final Item CRACKED_BRICKS = registerBlock(MSBlocks.CRACKED_BRICKS);
	public static final Item CRACKED_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_BRICK_SLAB);
	public static final Item CRACKED_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_BRICK_STAIRS);
	public static final Item CRACKED_BRICK_WALL = registerBlock(MSBlocks.CRACKED_BRICK_WALL);
	public static final Item MOSSY_BRICKS = registerBlock(MSBlocks.MOSSY_BRICKS);
	public static final Item MOSSY_BRICK_SLAB = registerBlock(MSBlocks.MOSSY_BRICK_SLAB);
	public static final Item MOSSY_BRICK_STAIRS = registerBlock(MSBlocks.MOSSY_BRICK_STAIRS);
	public static final Item MOSSY_BRICK_WALL = registerBlock(MSBlocks.MOSSY_BRICK_WALL);
	public static final Item CRACKED_MOSSY_BRICKS = registerBlock(MSBlocks.CRACKED_MOSSY_BRICKS);
	public static final Item CRACKED_MOSSY_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_MOSSY_BRICK_SLAB);
	public static final Item CRACKED_MOSSY_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_MOSSY_BRICK_STAIRS);
	public static final Item CRACKED_MOSSY_BRICK_WALL = registerBlock(MSBlocks.CRACKED_MOSSY_BRICK_WALL);
	
	public static final Item CRACKED_MUD_BRICKS = registerBlock(MSBlocks.CRACKED_MUD_BRICKS);
	public static final Item CRACKED_MUD_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_MUD_BRICK_SLAB);
	public static final Item CRACKED_MUD_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_MUD_BRICK_STAIRS);
	public static final Item CRACKED_MUD_BRICK_WALL = registerBlock(MSBlocks.CRACKED_MUD_BRICK_WALL);
	public static final Item MOSSY_MUD_BRICKS = registerBlock(MSBlocks.MOSSY_MUD_BRICKS);
	public static final Item MOSSY_MUD_BRICK_SLAB = registerBlock(MSBlocks.MOSSY_MUD_BRICK_SLAB);
	public static final Item MOSSY_MUD_BRICK_STAIRS = registerBlock(MSBlocks.MOSSY_MUD_BRICK_STAIRS);
	public static final Item MOSSY_MUD_BRICK_WALL = registerBlock(MSBlocks.MOSSY_MUD_BRICK_WALL);
	public static final Item CRACKED_MOSSY_MUD_BRICKS = registerBlock(MSBlocks.CRACKED_MOSSY_MUD_BRICKS);
	public static final Item CRACKED_MOSSY_MUD_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_MOSSY_MUD_BRICK_SLAB);
	public static final Item CRACKED_MOSSY_MUD_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_MOSSY_MUD_BRICK_STAIRS);
	public static final Item CRACKED_MOSSY_MUD_BRICK_WALL = registerBlock(MSBlocks.CRACKED_MOSSY_MUD_BRICK_WALL);
	
	public static final Item SANDSTONE_BRICKS = registerBlock(MSBlocks.SANDSTONE_BRICKS);
	public static final Item SANDSTONE_BRICK_SLAB = registerBlock(MSBlocks.SANDSTONE_BRICK_SLAB);
	public static final Item SANDSTONE_BRICK_STAIRS = registerBlock(MSBlocks.SANDSTONE_BRICK_STAIRS);
	public static final Item SANDSTONE_BRICK_WALL = registerBlock(MSBlocks.SANDSTONE_BRICK_WALL);
	public static final Item CRACKED_SANDSTONE_BRICKS = registerBlock(MSBlocks.CRACKED_SANDSTONE_BRICKS);
	public static final Item CRACKED_SANDSTONE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_SANDSTONE_BRICK_SLAB);
	public static final Item CRACKED_SANDSTONE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_SANDSTONE_BRICK_STAIRS);
	public static final Item CRACKED_SANDSTONE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_SANDSTONE_BRICK_WALL);
	public static final Item MOSSY_SANDSTONE_BRICKS = registerBlock(MSBlocks.MOSSY_SANDSTONE_BRICKS);
	public static final Item MOSSY_SANDSTONE_BRICK_SLAB = registerBlock(MSBlocks.MOSSY_SANDSTONE_BRICK_SLAB);
	public static final Item MOSSY_SANDSTONE_BRICK_STAIRS = registerBlock(MSBlocks.MOSSY_SANDSTONE_BRICK_STAIRS);
	public static final Item MOSSY_SANDSTONE_BRICK_WALL = registerBlock(MSBlocks.MOSSY_SANDSTONE_BRICK_WALL);
	public static final Item CRACKED_MOSSY_SANDSTONE_BRICKS = registerBlock(MSBlocks.CRACKED_MOSSY_SANDSTONE_BRICKS);
	public static final Item CRACKED_MOSSY_SANDSTONE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_MOSSY_SANDSTONE_BRICK_SLAB);
	public static final Item CRACKED_MOSSY_SANDSTONE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_MOSSY_SANDSTONE_BRICK_STAIRS);
	public static final Item CRACKED_MOSSY_SANDSTONE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_MOSSY_SANDSTONE_BRICK_WALL);
	
	public static final Item RED_SANDSTONE_BRICKS = registerBlock(MSBlocks.RED_SANDSTONE_BRICKS);
	public static final Item RED_SANDSTONE_BRICK_SLAB = registerBlock(MSBlocks.RED_SANDSTONE_BRICK_SLAB);
	public static final Item RED_SANDSTONE_BRICK_STAIRS = registerBlock(MSBlocks.RED_SANDSTONE_BRICK_STAIRS);
	public static final Item RED_SANDSTONE_BRICK_WALL = registerBlock(MSBlocks.RED_SANDSTONE_BRICK_WALL);
	public static final Item CRACKED_RED_SANDSTONE_BRICKS = registerBlock(MSBlocks.CRACKED_RED_SANDSTONE_BRICKS);
	public static final Item CRACKED_RED_SANDSTONE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_RED_SANDSTONE_BRICK_SLAB);
	public static final Item CRACKED_RED_SANDSTONE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_RED_SANDSTONE_BRICK_STAIRS);
	public static final Item CRACKED_RED_SANDSTONE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_RED_SANDSTONE_BRICK_WALL);
	public static final Item MOSSY_RED_SANDSTONE_BRICKS = registerBlock(MSBlocks.MOSSY_RED_SANDSTONE_BRICKS);
	public static final Item MOSSY_RED_SANDSTONE_BRICK_SLAB = registerBlock(MSBlocks.MOSSY_RED_SANDSTONE_BRICK_SLAB);
	public static final Item MOSSY_RED_SANDSTONE_BRICK_STAIRS = registerBlock(MSBlocks.MOSSY_RED_SANDSTONE_BRICK_STAIRS);
	public static final Item MOSSY_RED_SANDSTONE_BRICK_WALL = registerBlock(MSBlocks.MOSSY_RED_SANDSTONE_BRICK_WALL);
	public static final Item CRACKED_MOSSY_RED_SANDSTONE_BRICKS = registerBlock(MSBlocks.CRACKED_MOSSY_RED_SANDSTONE_BRICKS);
	public static final Item CRACKED_MOSSY_RED_SANDSTONE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_MOSSY_RED_SANDSTONE_BRICK_SLAB);
	public static final Item CRACKED_MOSSY_RED_SANDSTONE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_MOSSY_RED_SANDSTONE_BRICK_STAIRS);
	public static final Item CRACKED_MOSSY_RED_SANDSTONE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_MOSSY_RED_SANDSTONE_BRICK_WALL);
	
	public static final Item WHITE_SAND = registerBlock(MSBlocks.WHITE_SAND);
	public static final Item WHITE_SANDSTONE = registerBlock(MSBlocks.WHITE_SANDSTONE);
	public static final Item WHITE_SANDSTONE_SLAB = registerBlock(MSBlocks.WHITE_SANDSTONE_SLAB);
	public static final Item WHITE_SANDSTONE_STAIRS = registerBlock(MSBlocks.WHITE_SANDSTONE_STAIRS);
	public static final Item WHITE_SANDSTONE_WALL = registerBlock(MSBlocks.WHITE_SANDSTONE_WALL);
	public static final Item CHISELED_WHITE_SANDSTONE = registerBlock(MSBlocks.CHISELED_WHITE_SANDSTONE);
	public static final Item CHISELED_WHITE_SANDSTONE_SLAB = registerBlock(MSBlocks.CHISELED_WHITE_SANDSTONE_SLAB);
	public static final Item CHISELED_WHITE_SANDSTONE_STAIRS = registerBlock(MSBlocks.CHISELED_WHITE_SANDSTONE_STAIRS);
	public static final Item CHISELED_WHITE_SANDSTONE_WALL = registerBlock(MSBlocks.CHISELED_WHITE_SANDSTONE_WALL);
	public static final Item SMOOTH_WHITE_SANDSTONE = registerBlock(MSBlocks.SMOOTH_WHITE_SANDSTONE);
	public static final Item SMOOTH_WHITE_SANDSTONE_SLAB = registerBlock(MSBlocks.SMOOTH_WHITE_SANDSTONE_SLAB);
	public static final Item SMOOTH_WHITE_SANDSTONE_STAIRS = registerBlock(MSBlocks.SMOOTH_WHITE_SANDSTONE_STAIRS);
	public static final Item SMOOTH_WHITE_SANDSTONE_WALL = registerBlock(MSBlocks.SMOOTH_WHITE_SANDSTONE_WALL);
	public static final Item CUT_WHITE_SANDSTONE = registerBlock(MSBlocks.CUT_WHITE_SANDSTONE);
	public static final Item CUT_WHITE_SANDSTONE_SLAB = registerBlock(MSBlocks.CUT_WHITE_SANDSTONE_SLAB);
	public static final Item CUT_WHITE_SANDSTONE_STAIRS = registerBlock(MSBlocks.CUT_WHITE_SANDSTONE_STAIRS);
	public static final Item CUT_WHITE_SANDSTONE_WALL = registerBlock(MSBlocks.CUT_WHITE_SANDSTONE_WALL);
	public static final Item WHITE_SANDSTONE_BRICKS = registerBlock(MSBlocks.WHITE_SANDSTONE_BRICKS);
	public static final Item WHITE_SANDSTONE_BRICK_SLAB = registerBlock(MSBlocks.WHITE_SANDSTONE_BRICK_SLAB);
	public static final Item WHITE_SANDSTONE_BRICK_STAIRS = registerBlock(MSBlocks.WHITE_SANDSTONE_BRICK_STAIRS);
	public static final Item WHITE_SANDSTONE_BRICK_WALL = registerBlock(MSBlocks.WHITE_SANDSTONE_BRICK_WALL);
	public static final Item CRACKED_WHITE_SANDSTONE_BRICKS = registerBlock(MSBlocks.CRACKED_WHITE_SANDSTONE_BRICKS);
	public static final Item CRACKED_WHITE_SANDSTONE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_WHITE_SANDSTONE_BRICK_SLAB);
	public static final Item CRACKED_WHITE_SANDSTONE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_WHITE_SANDSTONE_BRICK_STAIRS);
	public static final Item CRACKED_WHITE_SANDSTONE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_WHITE_SANDSTONE_BRICK_WALL);
	public static final Item MOSSY_WHITE_SANDSTONE_BRICKS = registerBlock(MSBlocks.MOSSY_WHITE_SANDSTONE_BRICKS);
	public static final Item MOSSY_WHITE_SANDSTONE_BRICK_SLAB = registerBlock(MSBlocks.MOSSY_WHITE_SANDSTONE_BRICK_SLAB);
	public static final Item MOSSY_WHITE_SANDSTONE_BRICK_STAIRS = registerBlock(MSBlocks.MOSSY_WHITE_SANDSTONE_BRICK_STAIRS);
	public static final Item MOSSY_WHITE_SANDSTONE_BRICK_WALL = registerBlock(MSBlocks.MOSSY_WHITE_SANDSTONE_BRICK_WALL);
	public static final Item CRACKED_MOSSY_WHITE_SANDSTONE_BRICKS = registerBlock(MSBlocks.CRACKED_MOSSY_WHITE_SANDSTONE_BRICKS);
	public static final Item CRACKED_MOSSY_WHITE_SANDSTONE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_MOSSY_WHITE_SANDSTONE_BRICK_SLAB);
	public static final Item CRACKED_MOSSY_WHITE_SANDSTONE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_MOSSY_WHITE_SANDSTONE_BRICK_STAIRS);
	public static final Item CRACKED_MOSSY_WHITE_SANDSTONE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_MOSSY_WHITE_SANDSTONE_BRICK_WALL);
	
	public static final Item BLACK_SAND = registerBlock(MSBlocks.BLACK_SAND);
	public static final Item BLACK_SANDSTONE = registerBlock(MSBlocks.BLACK_SANDSTONE);
	public static final Item BLACK_SANDSTONE_SLAB = registerBlock(MSBlocks.BLACK_SANDSTONE_SLAB);
	public static final Item BLACK_SANDSTONE_STAIRS = registerBlock(MSBlocks.BLACK_SANDSTONE_STAIRS);
	public static final Item BLACK_SANDSTONE_WALL = registerBlock(MSBlocks.BLACK_SANDSTONE_WALL);
	public static final Item CHISELED_BLACK_SANDSTONE = registerBlock(MSBlocks.CHISELED_BLACK_SANDSTONE);
	public static final Item CHISELED_BLACK_SANDSTONE_SLAB = registerBlock(MSBlocks.CHISELED_BLACK_SANDSTONE_SLAB);
	public static final Item CHISELED_BLACK_SANDSTONE_STAIRS = registerBlock(MSBlocks.CHISELED_BLACK_SANDSTONE_STAIRS);
	public static final Item CHISELED_BLACK_SANDSTONE_WALL = registerBlock(MSBlocks.CHISELED_BLACK_SANDSTONE_WALL);
	public static final Item SMOOTH_BLACK_SANDSTONE = registerBlock(MSBlocks.SMOOTH_BLACK_SANDSTONE);
	public static final Item SMOOTH_BLACK_SANDSTONE_SLAB = registerBlock(MSBlocks.SMOOTH_BLACK_SANDSTONE_SLAB);
	public static final Item SMOOTH_BLACK_SANDSTONE_STAIRS = registerBlock(MSBlocks.SMOOTH_BLACK_SANDSTONE_STAIRS);
	public static final Item SMOOTH_BLACK_SANDSTONE_WALL = registerBlock(MSBlocks.SMOOTH_BLACK_SANDSTONE_WALL);
	public static final Item CUT_BLACK_SANDSTONE = registerBlock(MSBlocks.CUT_BLACK_SANDSTONE);
	public static final Item CUT_BLACK_SANDSTONE_SLAB = registerBlock(MSBlocks.CUT_BLACK_SANDSTONE_SLAB);
	public static final Item CUT_BLACK_SANDSTONE_STAIRS = registerBlock(MSBlocks.CUT_BLACK_SANDSTONE_STAIRS);
	public static final Item CUT_BLACK_SANDSTONE_WALL = registerBlock(MSBlocks.CUT_BLACK_SANDSTONE_WALL);
	public static final Item BLACK_SANDSTONE_BRICKS = registerBlock(MSBlocks.BLACK_SANDSTONE_BRICKS);
	public static final Item BLACK_SANDSTONE_BRICK_SLAB = registerBlock(MSBlocks.BLACK_SANDSTONE_BRICK_SLAB);
	public static final Item BLACK_SANDSTONE_BRICK_STAIRS = registerBlock(MSBlocks.BLACK_SANDSTONE_BRICK_STAIRS);
	public static final Item BLACK_SANDSTONE_BRICK_WALL = registerBlock(MSBlocks.BLACK_SANDSTONE_BRICK_WALL);
	public static final Item CRACKED_BLACK_SANDSTONE_BRICKS = registerBlock(MSBlocks.CRACKED_BLACK_SANDSTONE_BRICKS);
	public static final Item CRACKED_BLACK_SANDSTONE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_BLACK_SANDSTONE_BRICK_SLAB);
	public static final Item CRACKED_BLACK_SANDSTONE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_BLACK_SANDSTONE_BRICK_STAIRS);
	public static final Item CRACKED_BLACK_SANDSTONE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_BLACK_SANDSTONE_BRICK_WALL);
	public static final Item MOSSY_BLACK_SANDSTONE_BRICKS = registerBlock(MSBlocks.MOSSY_BLACK_SANDSTONE_BRICKS);
	public static final Item MOSSY_BLACK_SANDSTONE_BRICK_SLAB = registerBlock(MSBlocks.MOSSY_BLACK_SANDSTONE_BRICK_SLAB);
	public static final Item MOSSY_BLACK_SANDSTONE_BRICK_STAIRS = registerBlock(MSBlocks.MOSSY_BLACK_SANDSTONE_BRICK_STAIRS);
	public static final Item MOSSY_BLACK_SANDSTONE_BRICK_WALL = registerBlock(MSBlocks.MOSSY_BLACK_SANDSTONE_BRICK_WALL);
	public static final Item CRACKED_MOSSY_BLACK_SANDSTONE_BRICKS = registerBlock(MSBlocks.CRACKED_MOSSY_BLACK_SANDSTONE_BRICKS);
	public static final Item CRACKED_MOSSY_BLACK_SANDSTONE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_MOSSY_BLACK_SANDSTONE_BRICK_SLAB);
	public static final Item CRACKED_MOSSY_BLACK_SANDSTONE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_MOSSY_BLACK_SANDSTONE_BRICK_STAIRS);
	public static final Item CRACKED_MOSSY_BLACK_SANDSTONE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_MOSSY_BLACK_SANDSTONE_BRICK_WALL);
	
	public static final Item CRACKED_PRISMARINE_BRICKS = registerBlock(MSBlocks.CRACKED_PRISMARINE_BRICKS);
	public static final Item CRACKED_PRISMARINE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_PRISMARINE_BRICK_SLAB);
	public static final Item CRACKED_PRISMARINE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_PRISMARINE_BRICK_STAIRS);
	public static final Item CRACKED_PRISMARINE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_PRISMARINE_BRICK_WALL);
	
	public static final Item SOUL_SANDSTONE = registerBlock(MSBlocks.SOUL_SANDSTONE);
	public static final Item SOUL_SANDSTONE_SLAB = registerBlock(MSBlocks.SOUL_SANDSTONE_SLAB);
	public static final Item SOUL_SANDSTONE_STAIRS = registerBlock(MSBlocks.SOUL_SANDSTONE_STAIRS);
	public static final Item SOUL_SANDSTONE_WALL = registerBlock(MSBlocks.SOUL_SANDSTONE_WALL);
	public static final Item CHISELED_SOUL_SANDSTONE = registerBlock(MSBlocks.CHISELED_SOUL_SANDSTONE);
	public static final Item CHISELED_SOUL_SANDSTONE_SLAB = registerBlock(MSBlocks.CHISELED_SOUL_SANDSTONE_SLAB);
	public static final Item CHISELED_SOUL_SANDSTONE_STAIRS = registerBlock(MSBlocks.CHISELED_SOUL_SANDSTONE_STAIRS);
	public static final Item CHISELED_SOUL_SANDSTONE_WALL = registerBlock(MSBlocks.CHISELED_SOUL_SANDSTONE_WALL);
	public static final Item SMOOTH_SOUL_SANDSTONE = registerBlock(MSBlocks.SMOOTH_SOUL_SANDSTONE);
	public static final Item SMOOTH_SOUL_SANDSTONE_SLAB = registerBlock(MSBlocks.SMOOTH_SOUL_SANDSTONE_SLAB);
	public static final Item SMOOTH_SOUL_SANDSTONE_STAIRS = registerBlock(MSBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS);
	public static final Item SMOOTH_SOUL_SANDSTONE_WALL = registerBlock(MSBlocks.SMOOTH_SOUL_SANDSTONE_WALL);
	public static final Item CUT_SOUL_SANDSTONE = registerBlock(MSBlocks.CUT_SOUL_SANDSTONE);
	public static final Item CUT_SOUL_SANDSTONE_SLAB = registerBlock(MSBlocks.CUT_SOUL_SANDSTONE_SLAB);
	public static final Item CUT_SOUL_SANDSTONE_STAIRS = registerBlock(MSBlocks.CUT_SOUL_SANDSTONE_STAIRS);
	public static final Item CUT_SOUL_SANDSTONE_WALL = registerBlock(MSBlocks.CUT_SOUL_SANDSTONE_WALL);
	public static final Item SOUL_SANDSTONE_BRICKS = registerBlock(MSBlocks.SOUL_SANDSTONE_BRICKS);
	public static final Item SOUL_SANDSTONE_BRICK_SLAB = registerBlock(MSBlocks.SOUL_SANDSTONE_BRICK_SLAB);
	public static final Item SOUL_SANDSTONE_BRICK_STAIRS = registerBlock(MSBlocks.SOUL_SANDSTONE_BRICK_STAIRS);
	public static final Item SOUL_SANDSTONE_BRICK_WALL = registerBlock(MSBlocks.SOUL_SANDSTONE_BRICK_WALL);
	public static final Item CRACKED_SOUL_SANDSTONE_BRICKS = registerBlock(MSBlocks.CRACKED_SOUL_SANDSTONE_BRICKS);
	public static final Item CRACKED_SOUL_SANDSTONE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_SOUL_SANDSTONE_BRICK_SLAB);
	public static final Item CRACKED_SOUL_SANDSTONE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_SOUL_SANDSTONE_BRICK_STAIRS);
	public static final Item CRACKED_SOUL_SANDSTONE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_SOUL_SANDSTONE_BRICK_WALL);
	public static final Item MOSSY_SOUL_SANDSTONE_BRICKS = registerBlock(MSBlocks.MOSSY_SOUL_SANDSTONE_BRICKS);
	public static final Item MOSSY_SOUL_SANDSTONE_BRICK_SLAB = registerBlock(MSBlocks.MOSSY_SOUL_SANDSTONE_BRICK_SLAB);
	public static final Item MOSSY_SOUL_SANDSTONE_BRICK_STAIRS = registerBlock(MSBlocks.MOSSY_SOUL_SANDSTONE_BRICK_STAIRS);
	public static final Item MOSSY_SOUL_SANDSTONE_BRICK_WALL = registerBlock(MSBlocks.MOSSY_SOUL_SANDSTONE_BRICK_WALL);
	public static final Item CRACKED_MOSSY_SOUL_SANDSTONE_BRICKS = registerBlock(MSBlocks.CRACKED_MOSSY_SOUL_SANDSTONE_BRICKS);
	public static final Item CRACKED_MOSSY_SOUL_SANDSTONE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_MOSSY_SOUL_SANDSTONE_BRICK_SLAB);
	public static final Item CRACKED_MOSSY_SOUL_SANDSTONE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_MOSSY_SOUL_SANDSTONE_BRICK_STAIRS);
	public static final Item CRACKED_MOSSY_SOUL_SANDSTONE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_MOSSY_SOUL_SANDSTONE_BRICK_WALL);
	
	public static final Item WITHER_BONE_BLOCK = registerBlock(MSBlocks.WITHER_BONE_BLOCK);
	public static final Item WITHER_BONE_SLAB = registerBlock(MSBlocks.WITHER_BONE_SLAB);
	public static final Item WITHER_BONE_STAIRS = registerBlock(MSBlocks.WITHER_BONE_STAIRS);
	public static final Item WITHER_BONE_WALL = registerBlock(MSBlocks.WITHER_BONE_WALL);
	
	public static final Item CRACKED_CHISELED_NETHER_BRICKS = registerBlock(MSBlocks.CRACKED_CHISELED_NETHER_BRICKS);
	public static final Item CRACKED_CHISELED_NETHER_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_CHISELED_NETHER_BRICK_SLAB);
	public static final Item CRACKED_CHISELED_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_CHISELED_NETHER_BRICK_STAIRS);
	public static final Item CRACKED_CHISELED_NETHER_BRICK_WALL = registerBlock(MSBlocks.CRACKED_CHISELED_NETHER_BRICK_WALL);
	
	public static final Item CRACKED_RED_NETHER_BRICKS = registerBlock(MSBlocks.CRACKED_RED_NETHER_BRICKS);
	public static final Item CRACKED_RED_NETHER_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_RED_NETHER_BRICK_SLAB);
	public static final Item CRACKED_RED_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_RED_NETHER_BRICK_STAIRS);
	public static final Item CRACKED_RED_NETHER_BRICK_WALL = registerBlock(MSBlocks.CRACKED_RED_NETHER_BRICK_WALL);
	public static final Item CRACKED_RED_NETHER_BRICK_FENCE = registerBlock(MSBlocks.CRACKED_RED_NETHER_BRICK_FENCE);
	public static final Item CRACKED_RED_NETHER_BRICK_FENCE_GATE = registerBlock(MSBlocks.CRACKED_RED_NETHER_BRICK_FENCE_GATE);
	public static final Item CHISELED_RED_NETHER_BRICKS = registerBlock(MSBlocks.CHISELED_RED_NETHER_BRICKS);
	public static final Item CHISELED_RED_NETHER_BRICK_SLAB = registerBlock(MSBlocks.CHISELED_RED_NETHER_BRICK_SLAB);
	public static final Item CHISELED_RED_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.CHISELED_RED_NETHER_BRICK_STAIRS);
	public static final Item CHISELED_RED_NETHER_BRICK_WALL = registerBlock(MSBlocks.CHISELED_RED_NETHER_BRICK_WALL);
	public static final Item CRACKED_CHISELED_RED_NETHER_BRICKS = registerBlock(MSBlocks.CRACKED_CHISELED_RED_NETHER_BRICKS);
	public static final Item CRACKED_CHISELED_RED_NETHER_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_CHISELED_RED_NETHER_BRICK_SLAB);
	public static final Item CRACKED_CHISELED_RED_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_CHISELED_RED_NETHER_BRICK_STAIRS);
	public static final Item CRACKED_CHISELED_RED_NETHER_BRICK_WALL = registerBlock(MSBlocks.CRACKED_CHISELED_RED_NETHER_BRICK_WALL);
	
	public static final Item WARPED_NETHER_BRICKS = registerBlock(MSBlocks.WARPED_NETHER_BRICKS);
	public static final Item WARPED_NETHER_BRICK_SLAB = registerBlock(MSBlocks.WARPED_NETHER_BRICK_SLAB);
	public static final Item WARPED_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.WARPED_NETHER_BRICK_STAIRS);
	public static final Item WARPED_NETHER_BRICK_WALL = registerBlock(MSBlocks.WARPED_NETHER_BRICK_WALL);
	public static final Item WARPED_NETHER_BRICK_FENCE = registerBlock(MSBlocks.WARPED_NETHER_BRICK_FENCE);
	public static final Item WARPED_NETHER_BRICK_FENCE_GATE = registerBlock(MSBlocks.WARPED_NETHER_BRICK_FENCE_GATE);
	public static final Item CRACKED_WARPED_NETHER_BRICKS = registerBlock(MSBlocks.CRACKED_WARPED_NETHER_BRICKS);
	public static final Item CRACKED_WARPED_NETHER_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_WARPED_NETHER_BRICK_SLAB);
	public static final Item CRACKED_WARPED_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_WARPED_NETHER_BRICK_STAIRS);
	public static final Item CRACKED_WARPED_NETHER_BRICK_WALL = registerBlock(MSBlocks.CRACKED_WARPED_NETHER_BRICK_WALL);
	public static final Item CRACKED_WARPED_NETHER_BRICK_FENCE = registerBlock(MSBlocks.CRACKED_WARPED_NETHER_BRICK_FENCE);
	public static final Item CRACKED_WARPED_NETHER_BRICK_FENCE_GATE = registerBlock(MSBlocks.CRACKED_WARPED_NETHER_BRICK_FENCE_GATE);
	public static final Item CHISELED_WARPED_NETHER_BRICKS = registerBlock(MSBlocks.CHISELED_WARPED_NETHER_BRICKS);
	public static final Item CHISELED_WARPED_NETHER_BRICK_SLAB = registerBlock(MSBlocks.CHISELED_WARPED_NETHER_BRICK_SLAB);
	public static final Item CHISELED_WARPED_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.CHISELED_WARPED_NETHER_BRICK_STAIRS);
	public static final Item CHISELED_WARPED_NETHER_BRICK_WALL = registerBlock(MSBlocks.CHISELED_WARPED_NETHER_BRICK_WALL);
	public static final Item CRACKED_CHISELED_WARPED_NETHER_BRICKS = registerBlock(MSBlocks.CRACKED_CHISELED_WARPED_NETHER_BRICKS);
	public static final Item CRACKED_CHISELED_WARPED_NETHER_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_CHISELED_WARPED_NETHER_BRICK_SLAB);
	public static final Item CRACKED_CHISELED_WARPED_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_CHISELED_WARPED_NETHER_BRICK_STAIRS);
	public static final Item CRACKED_CHISELED_WARPED_NETHER_BRICK_WALL = registerBlock(MSBlocks.CRACKED_CHISELED_WARPED_NETHER_BRICK_WALL);
	
	public static final Item WITHERED_NETHER_BRICKS = registerBlock(MSBlocks.WITHERED_NETHER_BRICKS);
	public static final Item WITHERED_NETHER_BRICK_SLAB = registerBlock(MSBlocks.WITHERED_NETHER_BRICK_SLAB);
	public static final Item WITHERED_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.WITHERED_NETHER_BRICK_STAIRS);
	public static final Item WITHERED_NETHER_BRICK_WALL = registerBlock(MSBlocks.WITHERED_NETHER_BRICK_WALL);
	public static final Item WITHERED_NETHER_BRICK_FENCE = registerBlock(MSBlocks.WITHERED_NETHER_BRICK_FENCE);
	public static final Item WITHERED_NETHER_BRICK_FENCE_GATE = registerBlock(MSBlocks.WITHERED_NETHER_BRICK_FENCE_GATE);
	public static final Item CRACKED_WITHERED_NETHER_BRICKS = registerBlock(MSBlocks.CRACKED_WITHERED_NETHER_BRICKS);
	public static final Item CRACKED_WITHERED_NETHER_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_WITHERED_NETHER_BRICK_SLAB);
	public static final Item CRACKED_WITHERED_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_WITHERED_NETHER_BRICK_STAIRS);
	public static final Item CRACKED_WITHERED_NETHER_BRICK_WALL = registerBlock(MSBlocks.CRACKED_WITHERED_NETHER_BRICK_WALL);
	public static final Item CRACKED_WITHERED_NETHER_BRICK_FENCE = registerBlock(MSBlocks.CRACKED_WITHERED_NETHER_BRICK_FENCE);
	public static final Item CRACKED_WITHERED_NETHER_BRICK_FENCE_GATE = registerBlock(MSBlocks.CRACKED_WITHERED_NETHER_BRICK_FENCE_GATE);
	public static final Item CHISELED_WITHERED_NETHER_BRICKS = registerBlock(MSBlocks.CHISELED_WITHERED_NETHER_BRICKS);
	public static final Item CHISELED_WITHERED_NETHER_BRICK_SLAB = registerBlock(MSBlocks.CHISELED_WITHERED_NETHER_BRICK_SLAB);
	public static final Item CHISELED_WITHERED_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.CHISELED_WITHERED_NETHER_BRICK_STAIRS);
	public static final Item CHISELED_WITHERED_NETHER_BRICK_WALL = registerBlock(MSBlocks.CHISELED_WITHERED_NETHER_BRICK_WALL);
	public static final Item CRACKED_CHISELED_WITHERED_NETHER_BRICKS = registerBlock(MSBlocks.CRACKED_CHISELED_WITHERED_NETHER_BRICKS);
	public static final Item CRACKED_CHISELED_WITHERED_NETHER_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_CHISELED_WITHERED_NETHER_BRICK_SLAB);
	public static final Item CRACKED_CHISELED_WITHERED_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_CHISELED_WITHERED_NETHER_BRICK_STAIRS);
	public static final Item CRACKED_CHISELED_WITHERED_NETHER_BRICK_WALL = registerBlock(MSBlocks.CRACKED_CHISELED_WITHERED_NETHER_BRICK_WALL);
	
	public static final Item SOUL_NETHER_BRICKS = registerBlock(MSBlocks.SOUL_NETHER_BRICKS);
	public static final Item SOUL_NETHER_BRICK_SLAB = registerBlock(MSBlocks.SOUL_NETHER_BRICK_SLAB);
	public static final Item SOUL_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.SOUL_NETHER_BRICK_STAIRS);
	public static final Item SOUL_NETHER_BRICK_WALL = registerBlock(MSBlocks.SOUL_NETHER_BRICK_WALL);
	public static final Item SOUL_NETHER_BRICK_FENCE = registerBlock(MSBlocks.SOUL_NETHER_BRICK_FENCE);
	public static final Item SOUL_NETHER_BRICK_FENCE_GATE = registerBlock(MSBlocks.SOUL_NETHER_BRICK_FENCE_GATE);
	public static final Item CRACKED_SOUL_NETHER_BRICKS = registerBlock(MSBlocks.CRACKED_SOUL_NETHER_BRICKS);
	public static final Item CRACKED_SOUL_NETHER_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_SOUL_NETHER_BRICK_SLAB);
	public static final Item CRACKED_SOUL_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_SOUL_NETHER_BRICK_STAIRS);
	public static final Item CRACKED_SOUL_NETHER_BRICK_WALL = registerBlock(MSBlocks.CRACKED_SOUL_NETHER_BRICK_WALL);
	public static final Item CRACKED_SOUL_NETHER_BRICK_FENCE = registerBlock(MSBlocks.CRACKED_SOUL_NETHER_BRICK_FENCE);
	public static final Item CRACKED_SOUL_NETHER_BRICK_FENCE_GATE = registerBlock(MSBlocks.CRACKED_SOUL_NETHER_BRICK_FENCE_GATE);
	public static final Item CHISELED_SOUL_NETHER_BRICKS = registerBlock(MSBlocks.CHISELED_SOUL_NETHER_BRICKS);
	public static final Item CHISELED_SOUL_NETHER_BRICK_SLAB = registerBlock(MSBlocks.CHISELED_SOUL_NETHER_BRICK_SLAB);
	public static final Item CHISELED_SOUL_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.CHISELED_SOUL_NETHER_BRICK_STAIRS);
	public static final Item CHISELED_SOUL_NETHER_BRICK_WALL = registerBlock(MSBlocks.CHISELED_SOUL_NETHER_BRICK_WALL);
	public static final Item CRACKED_CHISELED_SOUL_NETHER_BRICKS = registerBlock(MSBlocks.CRACKED_CHISELED_SOUL_NETHER_BRICKS);
	public static final Item CRACKED_CHISELED_SOUL_NETHER_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_CHISELED_SOUL_NETHER_BRICK_SLAB);
	public static final Item CRACKED_CHISELED_SOUL_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_CHISELED_SOUL_NETHER_BRICK_STAIRS);
	public static final Item CRACKED_CHISELED_SOUL_NETHER_BRICK_WALL = registerBlock(MSBlocks.CRACKED_CHISELED_SOUL_NETHER_BRICK_WALL);
	
	public static final Item BLAZING_NETHER_BRICKS = registerBlock(MSBlocks.BLAZING_NETHER_BRICKS);
	public static final Item BLAZING_NETHER_BRICK_SLAB = registerBlock(MSBlocks.BLAZING_NETHER_BRICK_SLAB);
	public static final Item BLAZING_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.BLAZING_NETHER_BRICK_STAIRS);
	public static final Item BLAZING_NETHER_BRICK_WALL = registerBlock(MSBlocks.BLAZING_NETHER_BRICK_WALL);
	public static final Item BLAZING_NETHER_BRICK_FENCE = registerBlock(MSBlocks.BLAZING_NETHER_BRICK_FENCE);
	public static final Item BLAZING_NETHER_BRICK_FENCE_GATE = registerBlock(MSBlocks.BLAZING_NETHER_BRICK_FENCE_GATE);
	public static final Item CRACKED_BLAZING_NETHER_BRICKS = registerBlock(MSBlocks.CRACKED_BLAZING_NETHER_BRICKS);
	public static final Item CRACKED_BLAZING_NETHER_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_BLAZING_NETHER_BRICK_SLAB);
	public static final Item CRACKED_BLAZING_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_BLAZING_NETHER_BRICK_STAIRS);
	public static final Item CRACKED_BLAZING_NETHER_BRICK_WALL = registerBlock(MSBlocks.CRACKED_BLAZING_NETHER_BRICK_WALL);
	public static final Item CRACKED_BLAZING_NETHER_BRICK_FENCE = registerBlock(MSBlocks.CRACKED_BLAZING_NETHER_BRICK_FENCE);
	public static final Item CRACKED_BLAZING_NETHER_BRICK_FENCE_GATE = registerBlock(MSBlocks.CRACKED_BLAZING_NETHER_BRICK_FENCE_GATE);
	public static final Item CHISELED_BLAZING_NETHER_BRICKS = registerBlock(MSBlocks.CHISELED_BLAZING_NETHER_BRICKS);
	public static final Item CHISELED_BLAZING_NETHER_BRICK_SLAB = registerBlock(MSBlocks.CHISELED_BLAZING_NETHER_BRICK_SLAB);
	public static final Item CHISELED_BLAZING_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.CHISELED_BLAZING_NETHER_BRICK_STAIRS);
	public static final Item CHISELED_BLAZING_NETHER_BRICK_WALL = registerBlock(MSBlocks.CHISELED_BLAZING_NETHER_BRICK_WALL);
	public static final Item CRACKED_CHISELED_BLAZING_NETHER_BRICKS = registerBlock(MSBlocks.CRACKED_CHISELED_BLAZING_NETHER_BRICKS);
	public static final Item CRACKED_CHISELED_BLAZING_NETHER_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_CHISELED_BLAZING_NETHER_BRICK_SLAB);
	public static final Item CRACKED_CHISELED_BLAZING_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_CHISELED_BLAZING_NETHER_BRICK_STAIRS);
	public static final Item CRACKED_CHISELED_BLAZING_NETHER_BRICK_WALL = registerBlock(MSBlocks.CRACKED_CHISELED_BLAZING_NETHER_BRICK_WALL);
	
	public static final Item GLOWING_NETHER_BRICKS = registerBlock(MSBlocks.GLOWING_NETHER_BRICKS);
	public static final Item GLOWING_NETHER_BRICK_SLAB = registerBlock(MSBlocks.GLOWING_NETHER_BRICK_SLAB);
	public static final Item GLOWING_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.GLOWING_NETHER_BRICK_STAIRS);
	public static final Item GLOWING_NETHER_BRICK_WALL = registerBlock(MSBlocks.GLOWING_NETHER_BRICK_WALL);
	public static final Item GLOWING_NETHER_BRICK_FENCE = registerBlock(MSBlocks.GLOWING_NETHER_BRICK_FENCE);
	public static final Item GLOWING_NETHER_BRICK_FENCE_GATE = registerBlock(MSBlocks.GLOWING_NETHER_BRICK_FENCE_GATE);
	public static final Item CRACKED_GLOWING_NETHER_BRICKS = registerBlock(MSBlocks.CRACKED_GLOWING_NETHER_BRICKS);
	public static final Item CRACKED_GLOWING_NETHER_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_GLOWING_NETHER_BRICK_SLAB);
	public static final Item CRACKED_GLOWING_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_GLOWING_NETHER_BRICK_STAIRS);
	public static final Item CRACKED_GLOWING_NETHER_BRICK_WALL = registerBlock(MSBlocks.CRACKED_GLOWING_NETHER_BRICK_WALL);
	public static final Item CRACKED_GLOWING_NETHER_BRICK_FENCE = registerBlock(MSBlocks.CRACKED_GLOWING_NETHER_BRICK_FENCE);
	public static final Item CRACKED_GLOWING_NETHER_BRICK_FENCE_GATE = registerBlock(MSBlocks.CRACKED_GLOWING_NETHER_BRICK_FENCE_GATE);
	public static final Item CHISELED_GLOWING_NETHER_BRICKS = registerBlock(MSBlocks.CHISELED_GLOWING_NETHER_BRICKS);
	public static final Item CHISELED_GLOWING_NETHER_BRICK_SLAB = registerBlock(MSBlocks.CHISELED_GLOWING_NETHER_BRICK_SLAB);
	public static final Item CHISELED_GLOWING_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.CHISELED_GLOWING_NETHER_BRICK_STAIRS);
	public static final Item CHISELED_GLOWING_NETHER_BRICK_WALL = registerBlock(MSBlocks.CHISELED_GLOWING_NETHER_BRICK_WALL);
	public static final Item CRACKED_CHISELED_GLOWING_NETHER_BRICKS = registerBlock(MSBlocks.CRACKED_CHISELED_GLOWING_NETHER_BRICKS);
	public static final Item CRACKED_CHISELED_GLOWING_NETHER_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_CHISELED_GLOWING_NETHER_BRICK_SLAB);
	public static final Item CRACKED_CHISELED_GLOWING_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_CHISELED_GLOWING_NETHER_BRICK_STAIRS);
	public static final Item CRACKED_CHISELED_GLOWING_NETHER_BRICK_WALL = registerBlock(MSBlocks.CRACKED_CHISELED_GLOWING_NETHER_BRICK_WALL);
	
	public static final Item MAGMA_NETHER_BRICKS = registerBlock(MSBlocks.MAGMA_NETHER_BRICKS);
	public static final Item MAGMA_NETHER_BRICK_SLAB = registerBlock(MSBlocks.MAGMA_NETHER_BRICK_SLAB);
	public static final Item MAGMA_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.MAGMA_NETHER_BRICK_STAIRS);
	public static final Item MAGMA_NETHER_BRICK_WALL = registerBlock(MSBlocks.MAGMA_NETHER_BRICK_WALL);
	public static final Item MAGMA_NETHER_BRICK_FENCE = registerBlock(MSBlocks.MAGMA_NETHER_BRICK_FENCE);
	public static final Item MAGMA_NETHER_BRICK_FENCE_GATE = registerBlock(MSBlocks.MAGMA_NETHER_BRICK_FENCE_GATE);
	public static final Item CRACKED_MAGMA_NETHER_BRICKS = registerBlock(MSBlocks.CRACKED_MAGMA_NETHER_BRICKS);
	public static final Item CRACKED_MAGMA_NETHER_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_MAGMA_NETHER_BRICK_SLAB);
	public static final Item CRACKED_MAGMA_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_MAGMA_NETHER_BRICK_STAIRS);
	public static final Item CRACKED_MAGMA_NETHER_BRICK_WALL = registerBlock(MSBlocks.CRACKED_MAGMA_NETHER_BRICK_WALL);
	public static final Item CRACKED_MAGMA_NETHER_BRICK_FENCE = registerBlock(MSBlocks.CRACKED_MAGMA_NETHER_BRICK_FENCE);
	public static final Item CRACKED_MAGMA_NETHER_BRICK_FENCE_GATE = registerBlock(MSBlocks.CRACKED_MAGMA_NETHER_BRICK_FENCE_GATE);
	public static final Item CHISELED_MAGMA_NETHER_BRICKS = registerBlock(MSBlocks.CHISELED_MAGMA_NETHER_BRICKS);
	public static final Item CHISELED_MAGMA_NETHER_BRICK_SLAB = registerBlock(MSBlocks.CHISELED_MAGMA_NETHER_BRICK_SLAB);
	public static final Item CHISELED_MAGMA_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.CHISELED_MAGMA_NETHER_BRICK_STAIRS);
	public static final Item CHISELED_MAGMA_NETHER_BRICK_WALL = registerBlock(MSBlocks.CHISELED_MAGMA_NETHER_BRICK_WALL);
	public static final Item CRACKED_CHISELED_MAGMA_NETHER_BRICKS = registerBlock(MSBlocks.CRACKED_CHISELED_MAGMA_NETHER_BRICKS);
	public static final Item CRACKED_CHISELED_MAGMA_NETHER_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_CHISELED_MAGMA_NETHER_BRICK_SLAB);
	public static final Item CRACKED_CHISELED_MAGMA_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_CHISELED_MAGMA_NETHER_BRICK_STAIRS);
	public static final Item CRACKED_CHISELED_MAGMA_NETHER_BRICK_WALL = registerBlock(MSBlocks.CRACKED_CHISELED_MAGMA_NETHER_BRICK_WALL);
	
	public static final Item GHASTLY_NETHER_BRICKS = registerBlock(MSBlocks.GHASTLY_NETHER_BRICKS);
	public static final Item GHASTLY_NETHER_BRICK_SLAB = registerBlock(MSBlocks.GHASTLY_NETHER_BRICK_SLAB);
	public static final Item GHASTLY_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.GHASTLY_NETHER_BRICK_STAIRS);
	public static final Item GHASTLY_NETHER_BRICK_WALL = registerBlock(MSBlocks.GHASTLY_NETHER_BRICK_WALL);
	public static final Item GHASTLY_NETHER_BRICK_FENCE = registerBlock(MSBlocks.GHASTLY_NETHER_BRICK_FENCE);
	public static final Item GHASTLY_NETHER_BRICK_FENCE_GATE = registerBlock(MSBlocks.GHASTLY_NETHER_BRICK_FENCE_GATE);
	public static final Item CRACKED_GHASTLY_NETHER_BRICKS = registerBlock(MSBlocks.CRACKED_GHASTLY_NETHER_BRICKS);
	public static final Item CRACKED_GHASTLY_NETHER_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_GHASTLY_NETHER_BRICK_SLAB);
	public static final Item CRACKED_GHASTLY_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_GHASTLY_NETHER_BRICK_STAIRS);
	public static final Item CRACKED_GHASTLY_NETHER_BRICK_WALL = registerBlock(MSBlocks.CRACKED_GHASTLY_NETHER_BRICK_WALL);
	public static final Item CRACKED_GHASTLY_NETHER_BRICK_FENCE = registerBlock(MSBlocks.CRACKED_GHASTLY_NETHER_BRICK_FENCE);
	public static final Item CRACKED_GHASTLY_NETHER_BRICK_FENCE_GATE = registerBlock(MSBlocks.CRACKED_GHASTLY_NETHER_BRICK_FENCE_GATE);
	public static final Item CHISELED_GHASTLY_NETHER_BRICKS = registerBlock(MSBlocks.CHISELED_GHASTLY_NETHER_BRICKS);
	public static final Item CHISELED_GHASTLY_NETHER_BRICK_SLAB = registerBlock(MSBlocks.CHISELED_GHASTLY_NETHER_BRICK_SLAB);
	public static final Item CHISELED_GHASTLY_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.CHISELED_GHASTLY_NETHER_BRICK_STAIRS);
	public static final Item CHISELED_GHASTLY_NETHER_BRICK_WALL = registerBlock(MSBlocks.CHISELED_GHASTLY_NETHER_BRICK_WALL);
	public static final Item CRACKED_CHISELED_GHASTLY_NETHER_BRICKS = registerBlock(MSBlocks.CRACKED_CHISELED_GHASTLY_NETHER_BRICKS);
	public static final Item CRACKED_CHISELED_GHASTLY_NETHER_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_CHISELED_GHASTLY_NETHER_BRICK_SLAB);
	public static final Item CRACKED_CHISELED_GHASTLY_NETHER_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_CHISELED_GHASTLY_NETHER_BRICK_STAIRS);
	public static final Item CRACKED_CHISELED_GHASTLY_NETHER_BRICK_WALL = registerBlock(MSBlocks.CRACKED_CHISELED_GHASTLY_NETHER_BRICK_WALL);
	
	public static final Item CRACKED_END_STONE_BRICKS = registerBlock(MSBlocks.CRACKED_END_STONE_BRICKS);
	public static final Item CRACKED_END_STONE_BRICK_SLAB = registerBlock(MSBlocks.CRACKED_END_STONE_BRICK_SLAB);
	public static final Item CRACKED_END_STONE_BRICK_STAIRS = registerBlock(MSBlocks.CRACKED_END_STONE_BRICK_STAIRS);
	public static final Item CRACKED_END_STONE_BRICK_WALL = registerBlock(MSBlocks.CRACKED_END_STONE_BRICK_WALL);
	
	public static final Item CRACKED_QUARTZ_BRICKS = registerBlock(MSBlocks.CRACKED_QUARTZ_BRICKS);
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
	
	public static final Item SUSPICIOUS_RED_SAND = registerBlock(MSBlocks.SUSPICIOUS_RED_SAND);
	public static final Item SUSPICIOUS_WHITE_SAND = registerBlock(MSBlocks.SUSPICIOUS_WHITE_SAND);
	public static final Item SUSPICIOUS_BLACK_SAND = registerBlock(MSBlocks.SUSPICIOUS_BLACK_SAND);
	
	public static final Item WITHER_BONE = register("wither_bone");
	public static final Item WITHER_BONE_MEAL = register("wither_bone_meal", BoneMealItem::new);
	
	public static final Item WARPED_WART = registerAliasedBlock("warped_wart", MSBlocks.WARPED_WART);
	
	public static final Item WARPED_NETHER_BRICK = register("warped_nether_brick");
	public static final Item WITHERED_NETHER_BRICK = register("withered_nether_brick");
	public static final Item SOUL_NETHER_BRICK = register("soul_nether_brick");
	public static final Item BLAZING_NETHER_BRICK = register("blazing_nether_brick");
	public static final Item GLOWING_NETHER_BRICK = register("glowing_nether_brick");
	public static final Item MAGMA_NETHER_BRICK = register("magma_nether_brick");
	public static final Item GHASTLY_NETHER_BRICK = register("ghastly_nether_brick");
	
	public static final Item FLINT_SWORD = register("flint_sword", new AquiferSwordItem(MSToolMaterials.FLINT, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(MSToolMaterials.FLINT, 3, -2.3f))));
	public static final Item FLINT_SHOVEL = register("flint_shovel", new AquiferShovelItem(MSToolMaterials.FLINT, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(MSToolMaterials.FLINT, 1.5f, -2.9f))));
	public static final Item FLINT_PICKAXE = register("flint_pickaxe", new AquiferPickaxeItem(MSToolMaterials.FLINT, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(MSToolMaterials.FLINT, 1.0f, -2.7f))));
	public static final Item FLINT_AXE = register("flint_axe", new AquiferAxeItem(MSToolMaterials.FLINT, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(MSToolMaterials.FLINT, 7.0f, -3.1f))));
	public static final Item FLINT_HOE = register("flint_hoe", new AquiferHoeItem(MSToolMaterials.FLINT, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(MSToolMaterials.FLINT, -1.0f, -1.9f))));
	
	public static Item register(String name) {
		return register(name, new Item.Settings());
	}
	
	public static Item register(String name, Item.Settings settings) {
		return register(name, new Item(settings));
	}
	
	public static Item register(String name, Function<Item.Settings, Item> itemFactory) {
		return register(name, itemFactory, new Item.Settings());
	}
	
	public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
		return register(name, itemFactory.apply(settings));
	}
	
	public static Item register(String name, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(MSMain.MOD_ID, name), item);
	}
	
	public static Item registerAliasedBlock(String name, Block block) {
		return registerAliasedBlock(name, block, new Item.Settings());
	}
	
	public static Item registerAliasedBlock(String name, Block block, Item.Settings settings) {
		return register(name, new AliasedBlockItem(block, settings));
	}
	
	public static Item registerBlock(Block block) {
		return registerBlock(block, new Item.Settings());
	}
	
	public static Item registerBlock(Block block, Item.Settings settings) {
		return register(Registries.BLOCK.getId(block).getPath(), new BlockItem(block, settings));
	}
}
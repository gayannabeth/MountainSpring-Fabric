package gay.mountainspring.datagen;

import java.util.concurrent.CompletableFuture;

import gay.mountainspring.aquifer.datagen.AquiferBlockLootTableProvider;
import gay.mountainspring.block.MSBlocks;
import gay.mountainspring.item.MSItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;

public class MSBlockLootTableGen extends AquiferBlockLootTableProvider {
	public MSBlockLootTableGen(FabricDataOutput dataOutput, CompletableFuture<WrapperLookup> registryLookup) {
		super(dataOutput, registryLookup);
	}
	
	@Override
	public void generate() {
		this.addDrop(MSBlocks.MOSSY_STONE, block -> this.drops(block, Items.MOSSY_COBBLESTONE));
		this.addDrop(MSBlocks.CRACKED_MOSSY_STONE_BRICKS);
		this.addDrop(MSBlocks.CRACKED_CHISELED_STONE_BRICKS);
		this.addDrop(MSBlocks.MOSSY_CHISELED_STONE_BRICKS);
		this.addDrop(MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICKS);
		
		this.addDrop(MSBlocks.MOSSY_GRANITE, block -> this.drops(block, MSItems.MOSSY_COBBLED_GRANITE));
		this.addDrop(MSBlocks.COBBLED_GRANITE);
		this.addDrop(MSBlocks.MOSSY_COBBLED_GRANITE);
		this.addDrop(MSBlocks.GRANITE_BRICKS);
		this.addDrop(MSBlocks.CRACKED_GRANITE_BRICKS);
		this.addDrop(MSBlocks.MOSSY_GRANITE_BRICKS);
		this.addDrop(MSBlocks.CRACKED_MOSSY_GRANITE_BRICKS);
		
		this.addDrop(MSBlocks.MOSSY_DIORITE, block -> this.drops(block, MSItems.MOSSY_COBBLED_DIORITE));
		this.addDrop(MSBlocks.COBBLED_DIORITE);
		this.addDrop(MSBlocks.MOSSY_COBBLED_DIORITE);
		this.addDrop(MSBlocks.DIORITE_BRICKS);
		this.addDrop(MSBlocks.CRACKED_DIORITE_BRICKS);
		this.addDrop(MSBlocks.MOSSY_DIORITE_BRICKS);
		this.addDrop(MSBlocks.CRACKED_MOSSY_DIORITE_BRICKS);
		
		this.addDrop(MSBlocks.MOSSY_ANDESITE, block -> this.drops(block, MSItems.MOSSY_COBBLED_ANDESITE));
		this.addDrop(MSBlocks.COBBLED_ANDESITE);
		this.addDrop(MSBlocks.MOSSY_COBBLED_ANDESITE);
		this.addDrop(MSBlocks.ANDESITE_BRICKS);
		this.addDrop(MSBlocks.CRACKED_ANDESITE_BRICKS);
		this.addDrop(MSBlocks.MOSSY_ANDESITE_BRICKS);
		this.addDrop(MSBlocks.CRACKED_MOSSY_ANDESITE_BRICKS);
		
		this.addDrop(MSBlocks.MOSSY_DEEPSLATE, block -> this.drops(block, MSItems.MOSSY_COBBLED_DEEPSLATE));
		this.addDrop(MSBlocks.MOSSY_COBBLED_DEEPSLATE);
		this.addDrop(MSBlocks.MOSSY_DEEPSLATE_BRICKS);
		this.addDrop(MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICKS);
		this.addDrop(MSBlocks.MOSSY_DEEPSLATE_TILES);
		this.addDrop(MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILES);
		
		this.addDrop(MSBlocks.MOSSY_TUFF);
		this.addDrop(MSBlocks.CRACKED_TUFF_BRICKS);
		this.addDrop(MSBlocks.MOSSY_TUFF_BRICKS);
		this.addDrop(MSBlocks.CRACKED_MOSSY_TUFF_BRICKS);
		this.addDrop(MSBlocks.CRACKED_CHISELED_TUFF_BRICKS);
		this.addDrop(MSBlocks.MOSSY_CHISELED_TUFF_BRICKS);
		this.addDrop(MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICKS);
		
		this.addDrop(MSBlocks.CRACKED_BRICKS);
		this.addDrop(MSBlocks.MOSSY_BRICKS);
		this.addDrop(MSBlocks.CRACKED_MOSSY_BRICKS);
		
		this.addDrop(MSBlocks.CRACKED_MUD_BRICKS);
		this.addDrop(MSBlocks.MOSSY_MUD_BRICKS);
		this.addDrop(MSBlocks.CRACKED_MOSSY_MUD_BRICKS);
		
		this.addDrop(MSBlocks.SANDSTONE_BRICKS);
		this.addDrop(MSBlocks.CRACKED_SANDSTONE_BRICKS);
		this.addDrop(MSBlocks.MOSSY_SANDSTONE_BRICKS);
		this.addDrop(MSBlocks.CRACKED_MOSSY_SANDSTONE_BRICKS);
		this.addDrop(MSBlocks.RED_SANDSTONE_BRICKS);
		this.addDrop(MSBlocks.CRACKED_RED_SANDSTONE_BRICKS);
		this.addDrop(MSBlocks.MOSSY_RED_SANDSTONE_BRICKS);
		this.addDrop(MSBlocks.CRACKED_MOSSY_RED_SANDSTONE_BRICKS);
		
		this.addDrop(MSBlocks.CRACKED_PRISMARINE_BRICKS);
		
		this.addDrop(MSBlocks.CRACKED_CHISELED_NETHER_BRICKS);
		this.addDrop(MSBlocks.CRACKED_RED_NETHER_BRICKS);
		this.addDrop(MSBlocks.CHISELED_RED_NETHER_BRICKS);
		this.addDrop(MSBlocks.CRACKED_CHISELED_RED_NETHER_BRICKS);
		
		this.addDrop(MSBlocks.CRACKED_END_STONE_BRICKS);
		
		this.addDrop(MSBlocks.CRACKED_QUARTZ_BRICKS);
		
		this.addDrop(MSBlocks.MOSSY_STONE_SLAB, block -> this.slabDrops(block, Items.MOSSY_COBBLESTONE_SLAB));
		this.addDrop(MSBlocks.MOSSY_STONE_STAIRS, block -> this.drops(block, Items.MOSSY_COBBLESTONE_STAIRS));
		this.addDrop(MSBlocks.MOSSY_STONE_WALL, block -> this.drops(block, Items.MOSSY_COBBLESTONE_WALL));
		this.addDrop(MSBlocks.CRACKED_MOSSY_STONE_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.CRACKED_MOSSY_STONE_BRICK_STAIRS);
		this.addDrop(MSBlocks.CRACKED_MOSSY_STONE_BRICK_WALL);
		this.addDrop(MSBlocks.CRACKED_CHISELED_STONE_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.CRACKED_CHISELED_STONE_BRICK_STAIRS);
		this.addDrop(MSBlocks.CRACKED_CHISELED_STONE_BRICK_WALL);
		this.addDrop(MSBlocks.MOSSY_CHISELED_STONE_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.MOSSY_CHISELED_STONE_BRICK_STAIRS);
		this.addDrop(MSBlocks.MOSSY_CHISELED_STONE_BRICK_WALL);
		this.addDrop(MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICK_STAIRS);
		this.addDrop(MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICK_WALL);
		
		this.addDrop(MSBlocks.MOSSY_GRANITE_SLAB, block -> this.slabDrops(block, MSBlocks.MOSSY_COBBLED_GRANITE_SLAB));
		this.addDrop(MSBlocks.MOSSY_GRANITE_STAIRS, block -> this.drops(block, MSBlocks.MOSSY_COBBLED_GRANITE_STAIRS));
		this.addDrop(MSBlocks.MOSSY_GRANITE_WALL, block -> this.drops(block, MSBlocks.MOSSY_COBBLED_GRANITE_WALL));
		this.addDrop(MSBlocks.COBBLED_GRANITE_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.COBBLED_GRANITE_STAIRS);
		this.addDrop(MSBlocks.COBBLED_GRANITE_WALL);
		this.addDrop(MSBlocks.MOSSY_COBBLED_GRANITE_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.MOSSY_COBBLED_GRANITE_STAIRS);
		this.addDrop(MSBlocks.MOSSY_COBBLED_GRANITE_WALL);
		this.addDrop(MSBlocks.GRANITE_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.GRANITE_BRICK_STAIRS);
		this.addDrop(MSBlocks.GRANITE_BRICK_WALL);
		this.addDrop(MSBlocks.CRACKED_GRANITE_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.CRACKED_GRANITE_BRICK_STAIRS);
		this.addDrop(MSBlocks.CRACKED_GRANITE_BRICK_WALL);
		this.addDrop(MSBlocks.MOSSY_GRANITE_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.MOSSY_GRANITE_BRICK_STAIRS);
		this.addDrop(MSBlocks.MOSSY_GRANITE_BRICK_WALL);
		this.addDrop(MSBlocks.CRACKED_MOSSY_GRANITE_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.CRACKED_MOSSY_GRANITE_BRICK_STAIRS);
		this.addDrop(MSBlocks.CRACKED_MOSSY_GRANITE_BRICK_WALL);
		
		this.addDrop(MSBlocks.MOSSY_DIORITE_SLAB, block -> this.slabDrops(block, MSBlocks.MOSSY_COBBLED_DIORITE_SLAB));
		this.addDrop(MSBlocks.MOSSY_DIORITE_STAIRS, block -> this.drops(block, MSBlocks.MOSSY_COBBLED_DIORITE_STAIRS));
		this.addDrop(MSBlocks.MOSSY_DIORITE_WALL, block -> this.drops(block, MSBlocks.MOSSY_COBBLED_DIORITE_WALL));
		this.addDrop(MSBlocks.COBBLED_DIORITE_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.COBBLED_DIORITE_STAIRS);
		this.addDrop(MSBlocks.COBBLED_DIORITE_WALL);
		this.addDrop(MSBlocks.MOSSY_COBBLED_DIORITE_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.MOSSY_COBBLED_DIORITE_STAIRS);
		this.addDrop(MSBlocks.MOSSY_COBBLED_DIORITE_WALL);
		this.addDrop(MSBlocks.DIORITE_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.DIORITE_BRICK_STAIRS);
		this.addDrop(MSBlocks.DIORITE_BRICK_WALL);
		this.addDrop(MSBlocks.CRACKED_DIORITE_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.CRACKED_DIORITE_BRICK_STAIRS);
		this.addDrop(MSBlocks.CRACKED_DIORITE_BRICK_WALL);
		this.addDrop(MSBlocks.MOSSY_DIORITE_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.MOSSY_DIORITE_BRICK_STAIRS);
		this.addDrop(MSBlocks.MOSSY_DIORITE_BRICK_WALL);
		this.addDrop(MSBlocks.CRACKED_MOSSY_DIORITE_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.CRACKED_MOSSY_DIORITE_BRICK_STAIRS);
		this.addDrop(MSBlocks.CRACKED_MOSSY_DIORITE_BRICK_WALL);
		
		this.addDrop(MSBlocks.MOSSY_ANDESITE_SLAB, block -> this.slabDrops(block, MSBlocks.MOSSY_COBBLED_ANDESITE_SLAB));
		this.addDrop(MSBlocks.MOSSY_ANDESITE_STAIRS, block -> this.drops(block, MSBlocks.MOSSY_COBBLED_ANDESITE_STAIRS));
		this.addDrop(MSBlocks.MOSSY_ANDESITE_WALL, block -> this.drops(block, MSBlocks.MOSSY_COBBLED_ANDESITE_WALL));
		this.addDrop(MSBlocks.COBBLED_ANDESITE_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.COBBLED_ANDESITE_STAIRS);
		this.addDrop(MSBlocks.COBBLED_ANDESITE_WALL);
		this.addDrop(MSBlocks.MOSSY_COBBLED_ANDESITE_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.MOSSY_COBBLED_ANDESITE_STAIRS);
		this.addDrop(MSBlocks.MOSSY_COBBLED_ANDESITE_WALL);
		this.addDrop(MSBlocks.ANDESITE_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.ANDESITE_BRICK_STAIRS);
		this.addDrop(MSBlocks.ANDESITE_BRICK_WALL);
		this.addDrop(MSBlocks.CRACKED_ANDESITE_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.CRACKED_ANDESITE_BRICK_STAIRS);
		this.addDrop(MSBlocks.CRACKED_ANDESITE_BRICK_WALL);
		this.addDrop(MSBlocks.MOSSY_ANDESITE_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.MOSSY_ANDESITE_BRICK_STAIRS);
		this.addDrop(MSBlocks.MOSSY_ANDESITE_BRICK_WALL);
		this.addDrop(MSBlocks.CRACKED_MOSSY_ANDESITE_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.CRACKED_MOSSY_ANDESITE_BRICK_STAIRS);
		this.addDrop(MSBlocks.CRACKED_MOSSY_ANDESITE_BRICK_WALL);
		
		this.addDrop(MSBlocks.MOSSY_DEEPSLATE_SLAB, block -> this.slabDrops(block, MSBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB));
		this.addDrop(MSBlocks.MOSSY_DEEPSLATE_STAIRS, block -> this.drops(block, MSBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS));
		this.addDrop(MSBlocks.MOSSY_DEEPSLATE_WALL, block -> this.drops(block, MSBlocks.MOSSY_COBBLED_DEEPSLATE_WALL));
		this.addDrop(MSBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS);
		this.addDrop(MSBlocks.MOSSY_COBBLED_DEEPSLATE_WALL);
		this.addDrop(MSBlocks.MOSSY_DEEPSLATE_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS);
		this.addDrop(MSBlocks.MOSSY_DEEPSLATE_BRICK_WALL);
		this.addDrop(MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICK_STAIRS);
		this.addDrop(MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICK_WALL);
		this.addDrop(MSBlocks.MOSSY_DEEPSLATE_TILE_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.MOSSY_DEEPSLATE_TILE_STAIRS);
		this.addDrop(MSBlocks.MOSSY_DEEPSLATE_TILE_WALL);
		this.addDrop(MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILE_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILE_STAIRS);
		this.addDrop(MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILE_WALL);
		
		
		this.addDrop(MSBlocks.MOSSY_TUFF_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.MOSSY_TUFF_STAIRS);
		this.addDrop(MSBlocks.MOSSY_TUFF_WALL);
		this.addDrop(MSBlocks.CRACKED_TUFF_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.CRACKED_TUFF_BRICK_STAIRS);
		this.addDrop(MSBlocks.CRACKED_TUFF_BRICK_WALL);
		this.addDrop(MSBlocks.MOSSY_TUFF_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.MOSSY_TUFF_BRICK_STAIRS);
		this.addDrop(MSBlocks.MOSSY_TUFF_BRICK_WALL);
		this.addDrop(MSBlocks.CRACKED_MOSSY_TUFF_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.CRACKED_MOSSY_TUFF_BRICK_STAIRS);
		this.addDrop(MSBlocks.CRACKED_MOSSY_TUFF_BRICK_WALL);
		this.addDrop(MSBlocks.CRACKED_CHISELED_TUFF_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.CRACKED_CHISELED_TUFF_BRICK_STAIRS);
		this.addDrop(MSBlocks.CRACKED_CHISELED_TUFF_BRICK_WALL);
		this.addDrop(MSBlocks.MOSSY_CHISELED_TUFF_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.MOSSY_CHISELED_TUFF_BRICK_STAIRS);
		this.addDrop(MSBlocks.MOSSY_CHISELED_TUFF_BRICK_WALL);
		this.addDrop(MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICK_STAIRS);
		this.addDrop(MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICK_WALL);
		
		this.addDrop(MSBlocks.CRACKED_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.CRACKED_BRICK_STAIRS);
		this.addDrop(MSBlocks.CRACKED_BRICK_WALL);
		this.addDrop(MSBlocks.MOSSY_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.MOSSY_BRICK_STAIRS);
		this.addDrop(MSBlocks.MOSSY_BRICK_WALL);
		this.addDrop(MSBlocks.CRACKED_MOSSY_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.CRACKED_MOSSY_BRICK_STAIRS);
		this.addDrop(MSBlocks.CRACKED_MOSSY_BRICK_WALL);
		
		this.addDrop(MSBlocks.CRACKED_MUD_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.CRACKED_MUD_BRICK_STAIRS);
		this.addDrop(MSBlocks.CRACKED_MUD_BRICK_WALL);
		this.addDrop(MSBlocks.MOSSY_MUD_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.MOSSY_MUD_BRICK_STAIRS);
		this.addDrop(MSBlocks.MOSSY_MUD_BRICK_WALL);
		this.addDrop(MSBlocks.CRACKED_MOSSY_MUD_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.CRACKED_MOSSY_MUD_BRICK_STAIRS);
		this.addDrop(MSBlocks.CRACKED_MOSSY_MUD_BRICK_WALL);
		
		this.addDrop(MSBlocks.SANDSTONE_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.SANDSTONE_BRICK_STAIRS);
		this.addDrop(MSBlocks.SANDSTONE_BRICK_WALL);
		this.addDrop(MSBlocks.CRACKED_SANDSTONE_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.CRACKED_SANDSTONE_BRICK_STAIRS);
		this.addDrop(MSBlocks.CRACKED_SANDSTONE_BRICK_WALL);
		this.addDrop(MSBlocks.MOSSY_SANDSTONE_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.MOSSY_SANDSTONE_BRICK_STAIRS);
		this.addDrop(MSBlocks.MOSSY_SANDSTONE_BRICK_WALL);
		this.addDrop(MSBlocks.CRACKED_MOSSY_SANDSTONE_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.CRACKED_MOSSY_SANDSTONE_BRICK_STAIRS);
		this.addDrop(MSBlocks.CRACKED_MOSSY_SANDSTONE_BRICK_WALL);
		
		this.addDrop(MSBlocks.RED_SANDSTONE_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.RED_SANDSTONE_BRICK_STAIRS);
		this.addDrop(MSBlocks.RED_SANDSTONE_BRICK_WALL);
		this.addDrop(MSBlocks.CRACKED_RED_SANDSTONE_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.CRACKED_RED_SANDSTONE_BRICK_STAIRS);
		this.addDrop(MSBlocks.CRACKED_RED_SANDSTONE_BRICK_WALL);
		this.addDrop(MSBlocks.MOSSY_RED_SANDSTONE_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.MOSSY_RED_SANDSTONE_BRICK_STAIRS);
		this.addDrop(MSBlocks.MOSSY_RED_SANDSTONE_BRICK_WALL);
		this.addDrop(MSBlocks.CRACKED_MOSSY_RED_SANDSTONE_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.CRACKED_MOSSY_RED_SANDSTONE_BRICK_STAIRS);
		this.addDrop(MSBlocks.CRACKED_MOSSY_RED_SANDSTONE_BRICK_WALL);
		
		this.addDrop(MSBlocks.CRACKED_PRISMARINE_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.CRACKED_PRISMARINE_BRICK_STAIRS);
		this.addDrop(MSBlocks.CRACKED_PRISMARINE_BRICK_WALL);
		
		this.addDrop(MSBlocks.CRACKED_CHISELED_NETHER_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.CRACKED_CHISELED_NETHER_BRICK_STAIRS);
		this.addDrop(MSBlocks.CRACKED_CHISELED_NETHER_BRICK_WALL);
		this.addDrop(MSBlocks.CRACKED_RED_NETHER_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.CRACKED_RED_NETHER_BRICK_STAIRS);
		this.addDrop(MSBlocks.CRACKED_RED_NETHER_BRICK_WALL);
		this.addDrop(MSBlocks.CRACKED_RED_NETHER_BRICK_FENCE);
		this.addDrop(MSBlocks.CRACKED_RED_NETHER_BRICK_FENCE_GATE);
		this.addDrop(MSBlocks.CHISELED_RED_NETHER_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.CHISELED_RED_NETHER_BRICK_STAIRS);
		this.addDrop(MSBlocks.CHISELED_RED_NETHER_BRICK_WALL);
		this.addDrop(MSBlocks.CRACKED_CHISELED_RED_NETHER_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.CRACKED_CHISELED_RED_NETHER_BRICK_STAIRS);
		this.addDrop(MSBlocks.CRACKED_CHISELED_RED_NETHER_BRICK_WALL);
		
		this.addDrop(MSBlocks.CRACKED_END_STONE_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.CRACKED_END_STONE_BRICK_STAIRS);
		this.addDrop(MSBlocks.CRACKED_END_STONE_BRICK_WALL);
		
		this.addDrop(MSBlocks.CRACKED_QUARTZ_BRICK_SLAB, this::slabDrops);
		this.addDrop(MSBlocks.CRACKED_QUARTZ_BRICK_STAIRS);
		this.addDrop(MSBlocks.CRACKED_QUARTZ_BRICK_WALL);
		
		this.addDrop(MSBlocks.INFESTED_MOSSY_STONE, this.dropsWithSilkTouch(MSItems.MOSSY_STONE));
		this.addDrop(MSBlocks.INFESTED_CRACKED_MOSSY_STONE_BRICKS, this.dropsWithSilkTouch(MSItems.CRACKED_MOSSY_STONE_BRICKS));
		this.addDrop(MSBlocks.INFESTED_CRACKED_CHISELED_STONE_BRICKS, this.dropsWithSilkTouch(MSItems.CRACKED_CHISELED_STONE_BRICKS));
		this.addDrop(MSBlocks.INFESTED_MOSSY_CHISELED_STONE_BRICKS, this.dropsWithSilkTouch(MSItems.MOSSY_CHISELED_STONE_BRICKS));
		this.addDrop(MSBlocks.INFESTED_CRACKED_MOSSY_CHISELED_STONE_BRICKS, this.dropsWithSilkTouch(MSItems.CRACKED_MOSSY_CHISELED_STONE_BRICKS));
		
		this.addDrop(MSBlocks.INFESTED_MOSSY_GRANITE, this.dropsWithSilkTouch(MSItems.MOSSY_GRANITE));
		this.addDrop(MSBlocks.INFESTED_COBBLED_GRANITE, this.dropsWithSilkTouch(MSItems.COBBLED_GRANITE));
		this.addDrop(MSBlocks.INFESTED_MOSSY_COBBLED_GRANITE, this.dropsWithSilkTouch(MSItems.MOSSY_COBBLED_GRANITE));
		this.addDrop(MSBlocks.INFESTED_GRANITE_BRICKS, this.dropsWithSilkTouch(MSItems.GRANITE_BRICKS));
		this.addDrop(MSBlocks.INFESTED_CRACKED_GRANITE_BRICKS, this.dropsWithSilkTouch(MSItems.CRACKED_GRANITE_BRICKS));
		this.addDrop(MSBlocks.INFESTED_MOSSY_GRANITE_BRICKS, this.dropsWithSilkTouch(MSItems.MOSSY_GRANITE_BRICKS));
		this.addDrop(MSBlocks.INFESTED_CRACKED_MOSSY_GRANITE_BRICKS, this.dropsWithSilkTouch(MSItems.CRACKED_MOSSY_GRANITE_BRICKS));
		
		this.addDrop(MSBlocks.INFESTED_MOSSY_DIORITE, this.dropsWithSilkTouch(MSItems.MOSSY_DIORITE));
		this.addDrop(MSBlocks.INFESTED_COBBLED_DIORITE, this.dropsWithSilkTouch(MSItems.COBBLED_DIORITE));
		this.addDrop(MSBlocks.INFESTED_MOSSY_COBBLED_DIORITE, this.dropsWithSilkTouch(MSItems.MOSSY_COBBLED_DIORITE));
		this.addDrop(MSBlocks.INFESTED_DIORITE_BRICKS, this.dropsWithSilkTouch(MSItems.DIORITE_BRICKS));
		this.addDrop(MSBlocks.INFESTED_CRACKED_DIORITE_BRICKS, this.dropsWithSilkTouch(MSItems.CRACKED_DIORITE_BRICKS));
		this.addDrop(MSBlocks.INFESTED_MOSSY_DIORITE_BRICKS, this.dropsWithSilkTouch(MSItems.MOSSY_DIORITE_BRICKS));
		this.addDrop(MSBlocks.INFESTED_CRACKED_MOSSY_DIORITE_BRICKS, this.dropsWithSilkTouch(MSItems.CRACKED_MOSSY_DIORITE_BRICKS));
		
		this.addDrop(MSBlocks.INFESTED_MOSSY_ANDESITE, this.dropsWithSilkTouch(MSItems.MOSSY_ANDESITE));
		this.addDrop(MSBlocks.INFESTED_COBBLED_ANDESITE, this.dropsWithSilkTouch(MSItems.COBBLED_ANDESITE));
		this.addDrop(MSBlocks.INFESTED_MOSSY_COBBLED_ANDESITE, this.dropsWithSilkTouch(MSItems.MOSSY_COBBLED_ANDESITE));
		this.addDrop(MSBlocks.INFESTED_ANDESITE_BRICKS, this.dropsWithSilkTouch(MSItems.ANDESITE_BRICKS));
		this.addDrop(MSBlocks.INFESTED_CRACKED_ANDESITE_BRICKS, this.dropsWithSilkTouch(MSItems.CRACKED_ANDESITE_BRICKS));
		this.addDrop(MSBlocks.INFESTED_MOSSY_ANDESITE_BRICKS, this.dropsWithSilkTouch(MSItems.MOSSY_ANDESITE_BRICKS));
		this.addDrop(MSBlocks.INFESTED_CRACKED_MOSSY_ANDESITE_BRICKS, this.dropsWithSilkTouch(MSItems.CRACKED_MOSSY_ANDESITE_BRICKS));
		
		this.addDrop(MSBlocks.INFESTED_MOSSY_DEEPSLATE, this.dropsWithSilkTouch(MSItems.MOSSY_DEEPSLATE));
		this.addDrop(MSBlocks.INFESTED_MOSSY_COBBLED_DEEPSLATE, this.dropsWithSilkTouch(MSItems.MOSSY_COBBLED_DEEPSLATE));
		this.addDrop(MSBlocks.INFESTED_MOSSY_DEEPSLATE_BRICKS, this.dropsWithSilkTouch(MSItems.MOSSY_DEEPSLATE_BRICKS));
		this.addDrop(MSBlocks.INFESTED_CRACKED_MOSSY_DEEPSLATE_BRICKS, this.dropsWithSilkTouch(MSItems.CRACKED_MOSSY_DEEPSLATE_BRICKS));
		this.addDrop(MSBlocks.INFESTED_MOSSY_DEEPSLATE_TILES, this.dropsWithSilkTouch(MSItems.MOSSY_DEEPSLATE_TILES));
		this.addDrop(MSBlocks.INFESTED_CRACKED_MOSSY_DEEPSLATE_TILES, this.dropsWithSilkTouch(MSItems.CRACKED_MOSSY_DEEPSLATE_TILES));
		
		this.addDrop(MSBlocks.INFESTED_MOSSY_TUFF, this.dropsWithSilkTouch(MSItems.MOSSY_TUFF));
		this.addDrop(MSBlocks.INFESTED_CRACKED_TUFF_BRICKS, this.dropsWithSilkTouch(MSItems.CRACKED_TUFF_BRICKS));
		this.addDrop(MSBlocks.INFESTED_MOSSY_TUFF_BRICKS, this.dropsWithSilkTouch(MSItems.MOSSY_TUFF_BRICKS));
		this.addDrop(MSBlocks.INFESTED_CRACKED_MOSSY_TUFF_BRICKS, this.dropsWithSilkTouch(MSItems.CRACKED_MOSSY_TUFF_BRICKS));
		this.addDrop(MSBlocks.INFESTED_CRACKED_CHISELED_TUFF_BRICKS, this.dropsWithSilkTouch(MSItems.CRACKED_CHISELED_TUFF_BRICKS));
		this.addDrop(MSBlocks.INFESTED_MOSSY_CHISELED_TUFF_BRICKS, this.dropsWithSilkTouch(MSItems.MOSSY_CHISELED_TUFF_BRICKS));
		this.addDrop(MSBlocks.INFESTED_CRACKED_MOSSY_CHISELED_TUFF_BRICKS, this.dropsWithSilkTouch(MSItems.CRACKED_MOSSY_CHISELED_TUFF_BRICKS));
	}
}
package gay.mountainspring.datagen;

import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.Nullable;

import gay.mountainspring.aquifer.tag.AquiferTags;
import gay.mountainspring.block.MSBlocks;
import gay.mountainspring.sswplus.block.SSWPBlocks;
import gay.mountainspring.sswplus.tag.SSWPTags;
import gay.mountainspring.tag.MSTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider.BlockTagProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider.ItemTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

public class MSTagGen {
	private MSTagGen() {}
	
	public static final class BlockTagGen extends BlockTagProvider {
		public BlockTagGen(FabricDataOutput output, CompletableFuture<WrapperLookup> registriesFuture) {
			super(output, registriesFuture);
		}
		
		@Override
		protected void configure(WrapperLookup wrapperLookup) {
			this.getOrCreateTagBuilder(MSTags.Blocks.GRANITE_BRICKS)
			.add(MSBlocks.GRANITE_BRICKS,
					MSBlocks.CRACKED_GRANITE_BRICKS,
					MSBlocks.MOSSY_GRANITE_BRICKS,
					MSBlocks.CRACKED_MOSSY_GRANITE_BRICKS);
			this.getOrCreateTagBuilder(MSTags.Blocks.GRANITE_BRICK_SLABS)
			.add(MSBlocks.GRANITE_BRICK_SLAB,
					MSBlocks.CRACKED_GRANITE_BRICK_SLAB,
					MSBlocks.MOSSY_GRANITE_BRICK_SLAB,
					MSBlocks.CRACKED_MOSSY_GRANITE_BRICK_SLAB);
			this.getOrCreateTagBuilder(MSTags.Blocks.GRANITE_BRICK_STAIRS)
			.add(MSBlocks.GRANITE_BRICK_STAIRS,
					MSBlocks.CRACKED_GRANITE_BRICK_STAIRS,
					MSBlocks.MOSSY_GRANITE_BRICK_STAIRS,
					MSBlocks.CRACKED_MOSSY_GRANITE_BRICK_STAIRS);
			this.getOrCreateTagBuilder(MSTags.Blocks.GRANITE_BRICK_WALLS)
			.add(MSBlocks.GRANITE_BRICK_WALL,
					MSBlocks.CRACKED_GRANITE_BRICK_WALL,
					MSBlocks.MOSSY_GRANITE_BRICK_WALL,
					MSBlocks.CRACKED_MOSSY_GRANITE_BRICK_WALL);
			
			this.getOrCreateTagBuilder(MSTags.Blocks.DIORITE_BRICKS)
			.add(MSBlocks.DIORITE_BRICKS,
					MSBlocks.CRACKED_DIORITE_BRICKS,
					MSBlocks.MOSSY_DIORITE_BRICKS,
					MSBlocks.CRACKED_MOSSY_DIORITE_BRICKS);
			this.getOrCreateTagBuilder(MSTags.Blocks.DIORITE_BRICK_SLABS)
			.add(MSBlocks.DIORITE_BRICK_SLAB,
					MSBlocks.CRACKED_DIORITE_BRICK_SLAB,
					MSBlocks.MOSSY_DIORITE_BRICK_SLAB,
					MSBlocks.CRACKED_MOSSY_DIORITE_BRICK_SLAB);
			this.getOrCreateTagBuilder(MSTags.Blocks.DIORITE_BRICK_STAIRS)
			.add(MSBlocks.DIORITE_BRICK_STAIRS,
					MSBlocks.CRACKED_DIORITE_BRICK_STAIRS,
					MSBlocks.MOSSY_DIORITE_BRICK_STAIRS,
					MSBlocks.CRACKED_MOSSY_DIORITE_BRICK_STAIRS);
			this.getOrCreateTagBuilder(MSTags.Blocks.DIORITE_BRICK_WALLS)
			.add(MSBlocks.DIORITE_BRICK_WALL,
					MSBlocks.CRACKED_DIORITE_BRICK_WALL,
					MSBlocks.MOSSY_DIORITE_BRICK_WALL,
					MSBlocks.CRACKED_MOSSY_DIORITE_BRICK_WALL);
			
			this.getOrCreateTagBuilder(MSTags.Blocks.ANDESITE_BRICKS)
			.add(MSBlocks.ANDESITE_BRICKS,
					MSBlocks.CRACKED_ANDESITE_BRICKS,
					MSBlocks.MOSSY_ANDESITE_BRICKS,
					MSBlocks.CRACKED_MOSSY_ANDESITE_BRICKS);
			this.getOrCreateTagBuilder(MSTags.Blocks.ANDESITE_BRICK_SLABS)
			.add(MSBlocks.ANDESITE_BRICK_SLAB,
					MSBlocks.CRACKED_ANDESITE_BRICK_SLAB,
					MSBlocks.MOSSY_ANDESITE_BRICK_SLAB,
					MSBlocks.CRACKED_MOSSY_ANDESITE_BRICK_SLAB);
			this.getOrCreateTagBuilder(MSTags.Blocks.ANDESITE_BRICK_STAIRS)
			.add(MSBlocks.ANDESITE_BRICK_STAIRS,
					MSBlocks.CRACKED_ANDESITE_BRICK_STAIRS,
					MSBlocks.MOSSY_ANDESITE_BRICK_STAIRS,
					MSBlocks.CRACKED_MOSSY_ANDESITE_BRICK_STAIRS);
			this.getOrCreateTagBuilder(MSTags.Blocks.ANDESITE_BRICK_WALLS)
			.add(MSBlocks.ANDESITE_BRICK_WALL,
					MSBlocks.CRACKED_ANDESITE_BRICK_WALL,
					MSBlocks.MOSSY_ANDESITE_BRICK_WALL,
					MSBlocks.CRACKED_MOSSY_ANDESITE_BRICK_WALL);
			
			this.getOrCreateTagBuilder(MSTags.Blocks.BRICK_BLOCKS)
			.add(Blocks.BRICKS,
					MSBlocks.CRACKED_BRICKS,
					MSBlocks.MOSSY_BRICKS,
					MSBlocks.CRACKED_MOSSY_BRICKS);
			this.getOrCreateTagBuilder(MSTags.Blocks.BRICK_SLABS)
			.add(Blocks.BRICK_SLAB,
					MSBlocks.CRACKED_BRICK_SLAB,
					MSBlocks.MOSSY_BRICK_SLAB,
					MSBlocks.CRACKED_MOSSY_BRICK_SLAB);
			this.getOrCreateTagBuilder(MSTags.Blocks.BRICK_STAIRS)
			.add(Blocks.BRICK_STAIRS,
					MSBlocks.CRACKED_BRICK_STAIRS,
					MSBlocks.MOSSY_BRICK_STAIRS,
					MSBlocks.CRACKED_MOSSY_BRICK_STAIRS);
			this.getOrCreateTagBuilder(MSTags.Blocks.BRICK_WALLS)
			.add(Blocks.BRICK_WALL,
					MSBlocks.CRACKED_BRICK_WALL,
					MSBlocks.MOSSY_BRICK_WALL,
					MSBlocks.CRACKED_MOSSY_BRICK_WALL);
			
			this.getOrCreateTagBuilder(MSTags.Blocks.MUD_BRICKS)
			.add(Blocks.MUD_BRICKS,
					MSBlocks.CRACKED_MUD_BRICKS,
					MSBlocks.MOSSY_MUD_BRICKS,
					MSBlocks.CRACKED_MOSSY_MUD_BRICKS);
			this.getOrCreateTagBuilder(MSTags.Blocks.MUD_BRICK_SLABS)
			.add(Blocks.MUD_BRICK_SLAB,
					MSBlocks.CRACKED_MUD_BRICK_SLAB,
					MSBlocks.MOSSY_MUD_BRICK_SLAB,
					MSBlocks.CRACKED_MOSSY_MUD_BRICK_SLAB);
			this.getOrCreateTagBuilder(MSTags.Blocks.MUD_BRICK_STAIRS)
			.add(Blocks.MUD_BRICK_STAIRS,
					MSBlocks.CRACKED_MUD_BRICK_STAIRS,
					MSBlocks.MOSSY_MUD_BRICK_STAIRS,
					MSBlocks.CRACKED_MOSSY_MUD_BRICK_STAIRS);
			this.getOrCreateTagBuilder(MSTags.Blocks.MUD_BRICK_WALLS)
			.add(Blocks.MUD_BRICK_WALL,
					MSBlocks.CRACKED_MUD_BRICK_WALL,
					MSBlocks.MOSSY_MUD_BRICK_WALL,
					MSBlocks.CRACKED_MOSSY_MUD_BRICK_WALL);
			
			this.getOrCreateTagBuilder(MSTags.Blocks.BEIGE_SANDSTONE_BRICKS)
			.add(MSBlocks.SANDSTONE_BRICKS,
					MSBlocks.CRACKED_SANDSTONE_BRICKS,
					MSBlocks.MOSSY_SANDSTONE_BRICKS,
					MSBlocks.CRACKED_MOSSY_SANDSTONE_BRICKS);
			this.getOrCreateTagBuilder(MSTags.Blocks.BEIGE_SANDSTONE_BRICK_SLABS)
			.add(MSBlocks.SANDSTONE_BRICK_SLAB,
					MSBlocks.CRACKED_SANDSTONE_BRICK_SLAB,
					MSBlocks.MOSSY_SANDSTONE_BRICK_SLAB,
					MSBlocks.CRACKED_MOSSY_SANDSTONE_BRICK_SLAB);
			this.getOrCreateTagBuilder(MSTags.Blocks.BEIGE_SANDSTONE_BRICK_STAIRS)
			.add(MSBlocks.SANDSTONE_BRICK_STAIRS,
					MSBlocks.CRACKED_SANDSTONE_BRICK_STAIRS,
					MSBlocks.MOSSY_SANDSTONE_BRICK_STAIRS,
					MSBlocks.CRACKED_MOSSY_SANDSTONE_BRICK_STAIRS);
			this.getOrCreateTagBuilder(MSTags.Blocks.BEIGE_SANDSTONE_BRICK_WALLS)
			.add(MSBlocks.SANDSTONE_BRICK_WALL,
					MSBlocks.CRACKED_SANDSTONE_BRICK_WALL,
					MSBlocks.MOSSY_SANDSTONE_BRICK_WALL,
					MSBlocks.CRACKED_MOSSY_SANDSTONE_BRICK_WALL);
			
			this.getOrCreateTagBuilder(MSTags.Blocks.RED_SANDSTONE_BRICKS)
			.add(MSBlocks.RED_SANDSTONE_BRICKS,
					MSBlocks.CRACKED_RED_SANDSTONE_BRICKS,
					MSBlocks.MOSSY_RED_SANDSTONE_BRICKS,
					MSBlocks.CRACKED_MOSSY_RED_SANDSTONE_BRICKS);
			this.getOrCreateTagBuilder(MSTags.Blocks.RED_SANDSTONE_BRICK_SLABS)
			.add(MSBlocks.RED_SANDSTONE_BRICK_SLAB,
					MSBlocks.CRACKED_RED_SANDSTONE_BRICK_SLAB,
					MSBlocks.MOSSY_RED_SANDSTONE_BRICK_SLAB,
					MSBlocks.CRACKED_MOSSY_RED_SANDSTONE_BRICK_SLAB);
			this.getOrCreateTagBuilder(MSTags.Blocks.RED_SANDSTONE_BRICK_STAIRS)
			.add(MSBlocks.RED_SANDSTONE_BRICK_STAIRS,
					MSBlocks.CRACKED_RED_SANDSTONE_BRICK_STAIRS,
					MSBlocks.MOSSY_RED_SANDSTONE_BRICK_STAIRS,
					MSBlocks.CRACKED_MOSSY_RED_SANDSTONE_BRICK_STAIRS);
			this.getOrCreateTagBuilder(MSTags.Blocks.RED_SANDSTONE_BRICK_WALLS)
			.add(MSBlocks.RED_SANDSTONE_BRICK_WALL,
					MSBlocks.CRACKED_RED_SANDSTONE_BRICK_WALL,
					MSBlocks.MOSSY_RED_SANDSTONE_BRICK_WALL,
					MSBlocks.CRACKED_MOSSY_RED_SANDSTONE_BRICK_WALL);
			
			this.getOrCreateTagBuilder(MSTags.Blocks.SANDSTONE_BRICKS)
			.addTag(MSTags.Blocks.BEIGE_SANDSTONE_BRICKS)
			.addTag(MSTags.Blocks.RED_SANDSTONE_BRICKS);
			this.getOrCreateTagBuilder(MSTags.Blocks.SANDSTONE_BRICK_SLABS)
			.addTag(MSTags.Blocks.BEIGE_SANDSTONE_BRICK_SLABS)
			.addTag(MSTags.Blocks.RED_SANDSTONE_BRICK_SLABS);
			this.getOrCreateTagBuilder(MSTags.Blocks.SANDSTONE_BRICK_STAIRS)
			.addTag(MSTags.Blocks.BEIGE_SANDSTONE_BRICK_STAIRS)
			.addTag(MSTags.Blocks.RED_SANDSTONE_BRICK_STAIRS);
			this.getOrCreateTagBuilder(MSTags.Blocks.SANDSTONE_BRICK_WALLS)
			.addTag(MSTags.Blocks.BEIGE_SANDSTONE_BRICK_WALLS)
			.addTag(MSTags.Blocks.RED_SANDSTONE_BRICK_WALLS);
			
			this.getOrCreateTagBuilder(MSTags.Blocks.PRISMARINE_BRICKS)
			.add(Blocks.PRISMARINE_BRICKS,
					MSBlocks.CRACKED_PRISMARINE_BRICKS);
			this.getOrCreateTagBuilder(MSTags.Blocks.PRISMARINE_BRICK_SLABS)
			.add(Blocks.PRISMARINE_BRICK_SLAB,
					MSBlocks.CRACKED_PRISMARINE_BRICK_SLAB);
			this.getOrCreateTagBuilder(MSTags.Blocks.PRISMARINE_BRICK_STAIRS)
			.add(Blocks.PRISMARINE_BRICK_STAIRS,
					MSBlocks.CRACKED_PRISMARINE_BRICK_STAIRS);
			this.getOrCreateTagBuilder(MSTags.Blocks.PRISMARINE_BRICK_WALLS)
			.add(SSWPBlocks.PRISMARINE_BRICK_WALL,
					MSBlocks.CRACKED_PRISMARINE_BRICK_WALL);
			
			this.getOrCreateTagBuilder(MSTags.Blocks.UNCOLORED_NETHER_BRICK_BLOCKS)
			.add(Blocks.NETHER_BRICKS,
					Blocks.CRACKED_NETHER_BRICKS,
					Blocks.CHISELED_NETHER_BRICKS,
					MSBlocks.CRACKED_CHISELED_NETHER_BRICKS);
			this.getOrCreateTagBuilder(MSTags.Blocks.UNCOLORED_NETHER_BRICK_SLABS)
			.add(Blocks.NETHER_BRICK_SLAB,
					SSWPBlocks.CRACKED_NETHER_BRICK_SLAB,
					SSWPBlocks.CHISELED_NETHER_BRICK_SLAB,
					MSBlocks.CRACKED_CHISELED_NETHER_BRICK_SLAB);
			this.getOrCreateTagBuilder(MSTags.Blocks.UNCOLORED_NETHER_BRICK_STAIRS)
			.add(Blocks.NETHER_BRICK_STAIRS,
					SSWPBlocks.CRACKED_NETHER_BRICK_STAIRS,
					SSWPBlocks.CHISELED_NETHER_BRICK_STAIRS,
					MSBlocks.CRACKED_CHISELED_NETHER_BRICK_STAIRS);
			this.getOrCreateTagBuilder(MSTags.Blocks.UNCOLORED_NETHER_BRICK_WALLS)
			.add(Blocks.NETHER_BRICK_WALL,
					SSWPBlocks.CRACKED_NETHER_BRICK_WALL,
					SSWPBlocks.CHISELED_NETHER_BRICK_WALL,
					MSBlocks.CRACKED_CHISELED_NETHER_BRICK_WALL);
			this.getOrCreateTagBuilder(MSTags.Blocks.UNCOLORED_NETHER_BRICK_FENCES)
			.add(Blocks.NETHER_BRICK_FENCE,
					SSWPBlocks.CRACKED_NETHER_BRICK_FENCE);
			this.getOrCreateTagBuilder(MSTags.Blocks.UNCOLORED_NETHER_BRICK_FENCE_GATES)
			.add(SSWPBlocks.NETHER_BRICK_FENCE_GATE,
					SSWPBlocks.CRACKED_NETHER_BRICK_FENCE_GATE);
			
			this.getOrCreateTagBuilder(MSTags.Blocks.RED_NETHER_BRICK_BLOCKS)
			.add(Blocks.RED_NETHER_BRICKS,
					MSBlocks.CRACKED_RED_NETHER_BRICKS,
					MSBlocks.CHISELED_RED_NETHER_BRICKS,
					MSBlocks.CRACKED_CHISELED_RED_NETHER_BRICKS);
			this.getOrCreateTagBuilder(MSTags.Blocks.RED_NETHER_BRICK_SLABS)
			.add(Blocks.RED_NETHER_BRICK_SLAB,
					MSBlocks.CRACKED_RED_NETHER_BRICK_SLAB,
					MSBlocks.CHISELED_RED_NETHER_BRICK_SLAB,
					MSBlocks.CRACKED_CHISELED_RED_NETHER_BRICK_SLAB);
			this.getOrCreateTagBuilder(MSTags.Blocks.RED_NETHER_BRICK_STAIRS)
			.add(Blocks.RED_NETHER_BRICK_STAIRS,
					MSBlocks.CRACKED_RED_NETHER_BRICK_STAIRS,
					MSBlocks.CHISELED_RED_NETHER_BRICK_STAIRS,
					MSBlocks.CRACKED_CHISELED_RED_NETHER_BRICK_STAIRS);
			this.getOrCreateTagBuilder(MSTags.Blocks.RED_NETHER_BRICK_WALLS)
			.add(Blocks.RED_NETHER_BRICK_WALL,
					MSBlocks.CRACKED_RED_NETHER_BRICK_WALL,
					MSBlocks.CHISELED_RED_NETHER_BRICK_WALL,
					MSBlocks.CRACKED_CHISELED_RED_NETHER_BRICK_WALL);
			this.getOrCreateTagBuilder(MSTags.Blocks.RED_NETHER_BRICK_FENCES)
			.add(SSWPBlocks.RED_NETHER_BRICK_FENCE,
					MSBlocks.CRACKED_RED_NETHER_BRICK_FENCE);
			this.getOrCreateTagBuilder(MSTags.Blocks.RED_NETHER_BRICK_FENCE_GATES)
			.add(SSWPBlocks.RED_NETHER_BRICK_FENCE_GATE,
					MSBlocks.CRACKED_RED_NETHER_BRICK_FENCE_GATE);
			
			this.getOrCreateTagBuilder(MSTags.Blocks.END_STONE_BRICKS)
			.add(Blocks.END_STONE_BRICKS,
					MSBlocks.CRACKED_END_STONE_BRICKS);
			this.getOrCreateTagBuilder(MSTags.Blocks.END_STONE_BRICK_SLABS)
			.add(Blocks.END_STONE_BRICK_SLAB,
					MSBlocks.CRACKED_END_STONE_BRICK_SLAB);
			this.getOrCreateTagBuilder(MSTags.Blocks.END_STONE_BRICK_STAIRS)
			.add(Blocks.END_STONE_BRICK_STAIRS,
					MSBlocks.CRACKED_END_STONE_BRICK_STAIRS);
			this.getOrCreateTagBuilder(MSTags.Blocks.END_STONE_BRICK_WALLS)
			.add(Blocks.END_STONE_BRICK_WALL,
					MSBlocks.CRACKED_END_STONE_BRICK_WALL);
			
			this.getOrCreateTagBuilder(MSTags.Blocks.QUARTZ_BRICKS)
			.add(Blocks.QUARTZ_BRICKS,
					MSBlocks.CRACKED_QUARTZ_BRICKS);
			this.getOrCreateTagBuilder(MSTags.Blocks.QUARTZ_BRICK_SLABS)
			.add(SSWPBlocks.QUARTZ_BRICK_SLAB,
					MSBlocks.CRACKED_QUARTZ_BRICK_SLAB);
			this.getOrCreateTagBuilder(MSTags.Blocks.QUARTZ_BRICK_STAIRS)
			.add(SSWPBlocks.QUARTZ_BRICK_STAIRS,
					MSBlocks.CRACKED_QUARTZ_BRICK_STAIRS);
			this.getOrCreateTagBuilder(MSTags.Blocks.QUARTZ_BRICK_WALLS)
			.add(SSWPBlocks.QUARTZ_BRICK_WALL,
					MSBlocks.CRACKED_QUARTZ_BRICK_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.STONE)
			.add(MSBlocks.MOSSY_STONE);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.STONE_SLABS)
			.add(MSBlocks.MOSSY_STONE_SLAB);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.STONE_STAIRS)
			.add(MSBlocks.MOSSY_STONE_STAIRS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.STONE_WALLS)
			.add(MSBlocks.MOSSY_STONE_WALL);

			this.getOrCreateTagBuilder(SSWPTags.Blocks.STONE_BRICK_SLABS)
			.add(MSBlocks.CRACKED_MOSSY_STONE_BRICK_SLAB,
					MSBlocks.CRACKED_CHISELED_STONE_BRICK_SLAB,
					MSBlocks.MOSSY_CHISELED_STONE_BRICK_SLAB,
					MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICK_SLAB);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.STONE_BRICK_STAIRS)
			.add(MSBlocks.CRACKED_MOSSY_STONE_BRICK_STAIRS,
					MSBlocks.CRACKED_CHISELED_STONE_BRICK_STAIRS,
					MSBlocks.MOSSY_CHISELED_STONE_BRICK_STAIRS,
					MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICK_STAIRS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.STONE_BRICK_WALLS)
			.add(MSBlocks.CRACKED_MOSSY_STONE_BRICK_WALL,
					MSBlocks.CRACKED_CHISELED_STONE_BRICK_WALL,
					MSBlocks.MOSSY_CHISELED_STONE_BRICK_WALL,
					MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICK_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.GRANITE)
			.add(MSBlocks.MOSSY_GRANITE,
					MSBlocks.COBBLED_GRANITE,
					MSBlocks.MOSSY_COBBLED_GRANITE)
			.addTag(MSTags.Blocks.GRANITE_BRICKS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.GRANITE_SLABS)
			.add(MSBlocks.MOSSY_GRANITE_SLAB,
					MSBlocks.COBBLED_GRANITE_SLAB,
					MSBlocks.MOSSY_COBBLED_GRANITE_SLAB)
			.addTag(MSTags.Blocks.GRANITE_BRICK_SLABS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.GRANITE_STAIRS)
			.add(MSBlocks.MOSSY_GRANITE_STAIRS,
					MSBlocks.COBBLED_GRANITE_STAIRS,
					MSBlocks.MOSSY_COBBLED_GRANITE_STAIRS)
			.addTag(MSTags.Blocks.GRANITE_BRICK_STAIRS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.GRANITE_WALLS)
			.add(MSBlocks.MOSSY_GRANITE_WALL,
					MSBlocks.COBBLED_GRANITE_WALL,
					MSBlocks.MOSSY_COBBLED_GRANITE_WALL)
			.addTag(MSTags.Blocks.GRANITE_BRICK_WALLS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DIORITE)
			.add(MSBlocks.MOSSY_DIORITE,
					MSBlocks.COBBLED_DIORITE,
					MSBlocks.MOSSY_COBBLED_DIORITE)
			.addTag(MSTags.Blocks.DIORITE_BRICKS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DIORITE_SLABS)
			.add(MSBlocks.MOSSY_DIORITE_SLAB,
					MSBlocks.COBBLED_DIORITE_SLAB,
					MSBlocks.MOSSY_COBBLED_DIORITE_SLAB)
			.addTag(MSTags.Blocks.DIORITE_BRICK_SLABS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DIORITE_STAIRS)
			.add(MSBlocks.MOSSY_DIORITE_STAIRS,
					MSBlocks.COBBLED_DIORITE_STAIRS,
					MSBlocks.MOSSY_COBBLED_DIORITE_STAIRS)
			.addTag(MSTags.Blocks.DIORITE_BRICK_STAIRS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DIORITE_WALLS)
			.add(MSBlocks.MOSSY_DIORITE_WALL,
					MSBlocks.COBBLED_DIORITE_WALL,
					MSBlocks.MOSSY_COBBLED_DIORITE_WALL)
			.addTag(MSTags.Blocks.DIORITE_BRICK_WALLS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.ANDESITE)
			.add(MSBlocks.MOSSY_ANDESITE,
					MSBlocks.COBBLED_ANDESITE,
					MSBlocks.MOSSY_COBBLED_ANDESITE)
			.addTag(MSTags.Blocks.ANDESITE_BRICKS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.ANDESITE_SLABS)
			.add(MSBlocks.MOSSY_ANDESITE_SLAB,
					MSBlocks.COBBLED_ANDESITE_SLAB,
					MSBlocks.MOSSY_COBBLED_ANDESITE_SLAB)
			.addTag(MSTags.Blocks.ANDESITE_BRICK_SLABS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.ANDESITE_STAIRS)
			.add(MSBlocks.MOSSY_ANDESITE_STAIRS,
					MSBlocks.COBBLED_ANDESITE_STAIRS,
					MSBlocks.MOSSY_COBBLED_ANDESITE_STAIRS)
			.addTag(MSTags.Blocks.ANDESITE_BRICK_STAIRS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.ANDESITE_WALLS)
			.add(MSBlocks.MOSSY_ANDESITE_WALL,
					MSBlocks.COBBLED_ANDESITE_WALL,
					MSBlocks.MOSSY_COBBLED_ANDESITE_WALL)
			.addTag(MSTags.Blocks.ANDESITE_BRICK_WALLS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DEEPSLATE)
			.add(MSBlocks.MOSSY_DEEPSLATE,
					MSBlocks.MOSSY_COBBLED_DEEPSLATE);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DEEPSLATE_SLABS)
			.add(MSBlocks.MOSSY_DEEPSLATE_SLAB,
					MSBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DEEPSLATE_STAIRS)
			.add(MSBlocks.MOSSY_DEEPSLATE_STAIRS,
					MSBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DEEPSLATE_WALLS)
			.add(MSBlocks.MOSSY_DEEPSLATE_WALL,
					MSBlocks.MOSSY_COBBLED_DEEPSLATE_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DEEPSLATE_BRICKS)
			.add(MSBlocks.MOSSY_DEEPSLATE_BRICKS,
					MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICKS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DEEPSLATE_BRICK_SLABS)
			.add(MSBlocks.MOSSY_DEEPSLATE_BRICK_SLAB,
					MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICK_SLAB);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DEEPSLATE_BRICK_STAIRS)
			.add(MSBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS,
					MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICK_STAIRS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DEEPSLATE_BRICK_WALLS)
			.add(MSBlocks.MOSSY_DEEPSLATE_BRICK_WALL,
					MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICK_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DEEPSLATE_TILES)
			.add(MSBlocks.MOSSY_DEEPSLATE_TILES,
					MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILES);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DEEPSLATE_TILE_SLABS)
			.add(MSBlocks.MOSSY_DEEPSLATE_TILE_SLAB,
					MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILE_SLAB);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DEEPSLATE_TILE_STAIRS)
			.add(MSBlocks.MOSSY_DEEPSLATE_TILE_STAIRS,
					MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILE_STAIRS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DEEPSLATE_TILE_WALLS)
			.add(MSBlocks.MOSSY_DEEPSLATE_TILE_WALL,
					MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILE_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.TUFF)
			.add(MSBlocks.MOSSY_TUFF);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.TUFF_SLABS)
			.add(MSBlocks.MOSSY_TUFF_SLAB);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.TUFF_STAIRS)
			.add(MSBlocks.MOSSY_TUFF_STAIRS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.TUFF_WALLS)
			.add(MSBlocks.MOSSY_TUFF_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.TUFF_BRICKS)
			.add(MSBlocks.CRACKED_TUFF_BRICKS,
					MSBlocks.MOSSY_TUFF_BRICKS,
					MSBlocks.CRACKED_MOSSY_TUFF_BRICKS,
					MSBlocks.CRACKED_CHISELED_TUFF_BRICKS,
					MSBlocks.MOSSY_CHISELED_TUFF_BRICKS,
					MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICKS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.TUFF_BRICK_SLABS)
			.add(MSBlocks.CRACKED_TUFF_BRICK_SLAB,
					MSBlocks.MOSSY_TUFF_BRICK_SLAB,
					MSBlocks.CRACKED_MOSSY_TUFF_BRICK_SLAB,
					MSBlocks.CRACKED_CHISELED_TUFF_BRICK_SLAB,
					MSBlocks.MOSSY_CHISELED_TUFF_BRICK_SLAB,
					MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICK_SLAB);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.TUFF_BRICK_STAIRS)
			.add(MSBlocks.CRACKED_TUFF_BRICK_STAIRS,
					MSBlocks.MOSSY_TUFF_BRICK_STAIRS,
					MSBlocks.CRACKED_MOSSY_TUFF_BRICK_STAIRS,
					MSBlocks.CRACKED_CHISELED_TUFF_BRICK_STAIRS,
					MSBlocks.MOSSY_CHISELED_TUFF_BRICK_STAIRS,
					MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICK_STAIRS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.TUFF_BRICK_WALLS)
			.add(MSBlocks.CRACKED_TUFF_BRICK_WALL,
					MSBlocks.MOSSY_TUFF_BRICK_WALL,
					MSBlocks.CRACKED_MOSSY_TUFF_BRICK_WALL,
					MSBlocks.CRACKED_CHISELED_TUFF_BRICK_WALL,
					MSBlocks.MOSSY_CHISELED_TUFF_BRICK_WALL,
					MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICK_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.BEIGE_SANDSTONE)
			.addTag(MSTags.Blocks.BEIGE_SANDSTONE_BRICKS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.BEIGE_SANDSTONE_SLABS)
			.addTag(MSTags.Blocks.BEIGE_SANDSTONE_BRICK_SLABS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.BEIGE_SANDSTONE_STAIRS)
			.addTag(MSTags.Blocks.BEIGE_SANDSTONE_BRICK_STAIRS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.BEIGE_SANDSTONE_WALLS)
			.addTag(MSTags.Blocks.BEIGE_SANDSTONE_BRICK_WALLS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.RED_SANDSTONE)
			.addTag(MSTags.Blocks.RED_SANDSTONE_BRICKS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.RED_SANDSTONE_SLABS)
			.addTag(MSTags.Blocks.RED_SANDSTONE_BRICK_SLABS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.RED_SANDSTONE_STAIRS)
			.addTag(MSTags.Blocks.RED_SANDSTONE_BRICK_STAIRS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.RED_SANDSTONE_WALLS)
			.addTag(MSTags.Blocks.RED_SANDSTONE_BRICK_WALLS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.SANDSTONE)
			.addTag(MSTags.Blocks.SANDSTONE_BRICKS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.SANDSTONE_SLABS)
			.addTag(MSTags.Blocks.SANDSTONE_BRICK_SLABS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.SANDSTONE_STAIRS)
			.addTag(MSTags.Blocks.SANDSTONE_BRICK_STAIRS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.SANDSTONE_WALLS)
			.addTag(MSTags.Blocks.SANDSTONE_BRICK_WALLS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.PRISMARINE)
			.addTag(MSTags.Blocks.PRISMARINE_BRICKS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.PRISMARINE_SLABS)
			.addTag(MSTags.Blocks.PRISMARINE_BRICK_SLABS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.PRISMARINE_STAIRS)
			.addTag(MSTags.Blocks.PRISMARINE_BRICK_STAIRS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.PRISMARINE_WALLS)
			.addTag(MSTags.Blocks.PRISMARINE_BRICK_WALLS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.NETHER_BRICK_BLOCKS)
			.addTag(MSTags.Blocks.UNCOLORED_NETHER_BRICK_BLOCKS)
			.addTag(MSTags.Blocks.RED_NETHER_BRICK_BLOCKS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.NETHER_BRICK_SLABS)
			.addTag(MSTags.Blocks.UNCOLORED_NETHER_BRICK_SLABS)
			.addTag(MSTags.Blocks.RED_NETHER_BRICK_SLABS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.NETHER_BRICK_STAIRS)
			.addTag(MSTags.Blocks.UNCOLORED_NETHER_BRICK_STAIRS)
			.addTag(MSTags.Blocks.RED_NETHER_BRICK_STAIRS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.NETHER_BRICK_WALLS)
			.addTag(MSTags.Blocks.UNCOLORED_NETHER_BRICK_WALLS)
			.addTag(MSTags.Blocks.RED_NETHER_BRICK_WALLS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.NETHER_BRICK_FENCES)
			.addTag(MSTags.Blocks.UNCOLORED_NETHER_BRICK_FENCES)
			.addTag(MSTags.Blocks.RED_NETHER_BRICK_FENCES);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.NETHER_BRICK_FENCE_GATES)
			.addTag(MSTags.Blocks.UNCOLORED_NETHER_BRICK_FENCE_GATES)
			.addTag(MSTags.Blocks.RED_NETHER_BRICK_FENCE_GATES);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.QUARTZ_BLOCKS)
			.addTag(MSTags.Blocks.QUARTZ_BRICKS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.QUARTZ_SLABS)
			.addTag(MSTags.Blocks.QUARTZ_BRICK_SLABS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.QUARTZ_STAIRS)
			.addTag(MSTags.Blocks.QUARTZ_BRICK_STAIRS);
			this.getOrCreateTagBuilder(SSWPTags.Blocks.QUARTZ_WALLS)
			.addTag(MSTags.Blocks.QUARTZ_BRICK_WALLS);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.INFESTABLE)
			.add(MSBlocks.MOSSY_STONE,
					MSBlocks.CRACKED_MOSSY_STONE_BRICKS,
					MSBlocks.CRACKED_CHISELED_STONE_BRICKS,
					MSBlocks.MOSSY_CHISELED_STONE_BRICKS,
					MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICKS,
					MSBlocks.MOSSY_GRANITE,
					MSBlocks.COBBLED_GRANITE,
					MSBlocks.MOSSY_COBBLED_GRANITE,
					MSBlocks.GRANITE_BRICKS,
					MSBlocks.CRACKED_GRANITE_BRICKS,
					MSBlocks.MOSSY_GRANITE_BRICKS,
					MSBlocks.CRACKED_MOSSY_GRANITE_BRICKS,
					MSBlocks.MOSSY_DIORITE,
					MSBlocks.COBBLED_DIORITE,
					MSBlocks.MOSSY_COBBLED_DIORITE,
					MSBlocks.DIORITE_BRICKS,
					MSBlocks.CRACKED_DIORITE_BRICKS,
					MSBlocks.MOSSY_DIORITE_BRICKS,
					MSBlocks.CRACKED_MOSSY_DIORITE_BRICKS,
					MSBlocks.MOSSY_ANDESITE,
					MSBlocks.COBBLED_ANDESITE,
					MSBlocks.MOSSY_COBBLED_ANDESITE,
					MSBlocks.ANDESITE_BRICKS,
					MSBlocks.CRACKED_ANDESITE_BRICKS,
					MSBlocks.MOSSY_ANDESITE_BRICKS,
					MSBlocks.CRACKED_MOSSY_ANDESITE_BRICKS,
					MSBlocks.MOSSY_DEEPSLATE,
					MSBlocks.MOSSY_COBBLED_DEEPSLATE,
					MSBlocks.MOSSY_DEEPSLATE_BRICKS,
					MSBlocks.CRACKED_MOSSY_DEEPSLATE_BRICKS,
					MSBlocks.MOSSY_DEEPSLATE_TILES,
					MSBlocks.CRACKED_MOSSY_DEEPSLATE_TILES,
					MSBlocks.MOSSY_TUFF,
					MSBlocks.CRACKED_TUFF_BRICKS,
					MSBlocks.MOSSY_TUFF_BRICKS,
					MSBlocks.CRACKED_MOSSY_TUFF_BRICKS,
					MSBlocks.CRACKED_CHISELED_TUFF_BRICKS,
					MSBlocks.MOSSY_CHISELED_TUFF_BRICKS,
					MSBlocks.CRACKED_MOSSY_CHISELED_TUFF_BRICKS);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.INFESTED)
			.add(MSBlocks.INFESTED_MOSSY_STONE,
					MSBlocks.INFESTED_CRACKED_MOSSY_STONE_BRICKS,
					MSBlocks.INFESTED_CRACKED_CHISELED_STONE_BRICKS,
					MSBlocks.INFESTED_MOSSY_CHISELED_STONE_BRICKS,
					MSBlocks.INFESTED_CRACKED_MOSSY_CHISELED_STONE_BRICKS,
					MSBlocks.INFESTED_MOSSY_GRANITE,
					MSBlocks.INFESTED_COBBLED_GRANITE,
					MSBlocks.INFESTED_MOSSY_COBBLED_GRANITE,
					MSBlocks.INFESTED_GRANITE_BRICKS,
					MSBlocks.INFESTED_CRACKED_GRANITE_BRICKS,
					MSBlocks.INFESTED_MOSSY_GRANITE_BRICKS,
					MSBlocks.INFESTED_CRACKED_MOSSY_GRANITE_BRICKS,
					MSBlocks.INFESTED_MOSSY_DIORITE,
					MSBlocks.INFESTED_COBBLED_DIORITE,
					MSBlocks.INFESTED_MOSSY_COBBLED_DIORITE,
					MSBlocks.INFESTED_DIORITE_BRICKS,
					MSBlocks.INFESTED_CRACKED_DIORITE_BRICKS,
					MSBlocks.INFESTED_MOSSY_DIORITE_BRICKS,
					MSBlocks.INFESTED_CRACKED_MOSSY_DIORITE_BRICKS,
					MSBlocks.INFESTED_MOSSY_ANDESITE,
					MSBlocks.INFESTED_COBBLED_ANDESITE,
					MSBlocks.INFESTED_MOSSY_COBBLED_ANDESITE,
					MSBlocks.INFESTED_ANDESITE_BRICKS,
					MSBlocks.INFESTED_CRACKED_ANDESITE_BRICKS,
					MSBlocks.INFESTED_MOSSY_ANDESITE_BRICKS,
					MSBlocks.INFESTED_CRACKED_MOSSY_ANDESITE_BRICKS,
					MSBlocks.INFESTED_MOSSY_DEEPSLATE,
					MSBlocks.INFESTED_MOSSY_COBBLED_DEEPSLATE,
					MSBlocks.INFESTED_MOSSY_DEEPSLATE_BRICKS,
					MSBlocks.INFESTED_CRACKED_MOSSY_DEEPSLATE_BRICKS,
					MSBlocks.INFESTED_MOSSY_DEEPSLATE_TILES,
					MSBlocks.INFESTED_CRACKED_MOSSY_DEEPSLATE_TILES,
					MSBlocks.INFESTED_MOSSY_TUFF,
					MSBlocks.INFESTED_CRACKED_TUFF_BRICKS,
					MSBlocks.INFESTED_MOSSY_TUFF_BRICKS,
					MSBlocks.INFESTED_CRACKED_MOSSY_TUFF_BRICKS,
					MSBlocks.INFESTED_CRACKED_CHISELED_TUFF_BRICKS,
					MSBlocks.INFESTED_MOSSY_CHISELED_TUFF_BRICKS,
					MSBlocks.INFESTED_CRACKED_MOSSY_CHISELED_TUFF_BRICKS);
			
			this.getOrCreateTagBuilder(BlockTags.STONE_BRICKS)
			.add(MSBlocks.CRACKED_MOSSY_STONE_BRICKS,
					MSBlocks.CRACKED_CHISELED_STONE_BRICKS,
					MSBlocks.MOSSY_CHISELED_STONE_BRICKS,
					MSBlocks.CRACKED_MOSSY_CHISELED_STONE_BRICKS);
			
			this.getOrCreateTagBuilder(BlockTags.SLABS)
			.addTag(MSTags.Blocks.BRICK_SLABS)
			.addTag(MSTags.Blocks.MUD_BRICK_SLABS)
			.addTag(MSTags.Blocks.END_STONE_BRICK_SLABS);
			
			this.getOrCreateTagBuilder(BlockTags.STAIRS)
			.addTag(MSTags.Blocks.BRICK_STAIRS)
			.addTag(MSTags.Blocks.MUD_BRICK_STAIRS)
			.addTag(MSTags.Blocks.END_STONE_BRICK_STAIRS);
			
			this.getOrCreateTagBuilder(BlockTags.WALLS)
			.addTag(MSTags.Blocks.BRICK_WALLS)
			.addTag(MSTags.Blocks.MUD_BRICK_WALLS)
			.addTag(MSTags.Blocks.END_STONE_BRICK_WALLS);
			
			this.getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
			.addTag(MSTags.Blocks.BRICK_BLOCKS)
			.addTag(MSTags.Blocks.BRICK_SLABS)
			.addTag(MSTags.Blocks.BRICK_STAIRS)
			.addTag(MSTags.Blocks.BRICK_WALLS)
			.addTag(MSTags.Blocks.MUD_BRICKS)
			.addTag(MSTags.Blocks.MUD_BRICK_SLABS)
			.addTag(MSTags.Blocks.MUD_BRICK_STAIRS)
			.addTag(MSTags.Blocks.MUD_BRICK_WALLS)
			.addTag(MSTags.Blocks.END_STONE_BRICKS)
			.addTag(MSTags.Blocks.END_STONE_BRICK_SLABS)
			.addTag(MSTags.Blocks.END_STONE_BRICK_STAIRS)
			.addTag(MSTags.Blocks.END_STONE_BRICK_WALLS);
			
			this.getOrCreateTagBuilder(MSTags.Blocks.Conventional.GRANITE_COBBLESTONES)
			.add(MSBlocks.COBBLED_GRANITE,
					MSBlocks.MOSSY_COBBLED_GRANITE);
			
			this.getOrCreateTagBuilder(MSTags.Blocks.Conventional.DIORITE_COBBLESTONES)
			.add(MSBlocks.COBBLED_DIORITE,
					MSBlocks.MOSSY_COBBLED_DIORITE);
			
			this.getOrCreateTagBuilder(MSTags.Blocks.Conventional.ANDESITE_COBBLESTONES)
			.add(MSBlocks.COBBLED_ANDESITE,
					MSBlocks.MOSSY_COBBLED_ANDESITE);
			
			this.getOrCreateTagBuilder(ConventionalBlockTags.MOSSY_COBBLESTONES)
			.add(MSBlocks.MOSSY_COBBLED_GRANITE,
					MSBlocks.MOSSY_COBBLED_DIORITE,
					MSBlocks.MOSSY_COBBLED_ANDESITE,
					MSBlocks.MOSSY_COBBLED_DEEPSLATE);
			
			this.getOrCreateTagBuilder(ConventionalBlockTags.DEEPSLATE_COBBLESTONES)
			.add(MSBlocks.MOSSY_COBBLED_DEEPSLATE);
			
			this.getOrCreateTagBuilder(ConventionalBlockTags.INFESTED_COBBLESTONES)
			.add(MSBlocks.INFESTED_COBBLED_GRANITE,
					MSBlocks.INFESTED_MOSSY_COBBLED_GRANITE,
					MSBlocks.INFESTED_COBBLED_DIORITE,
					MSBlocks.INFESTED_MOSSY_COBBLED_DIORITE,
					MSBlocks.INFESTED_COBBLED_ANDESITE,
					MSBlocks.INFESTED_MOSSY_COBBLED_ANDESITE,
					MSBlocks.INFESTED_MOSSY_COBBLED_DEEPSLATE);
		}
	}
	
	public static final class ItemTagGen extends ItemTagProvider {
		public ItemTagGen(FabricDataOutput output, CompletableFuture<WrapperLookup> completableFuture, @Nullable BlockTagProvider blockTagProvider) {
			super(output, completableFuture, blockTagProvider);
		}

		@Override
		protected void configure(WrapperLookup wrapperLookup) {
			this.copy(MSTags.Blocks.GRANITE_BRICKS, MSTags.Items.GRANITE_BRICKS);
			this.copy(MSTags.Blocks.GRANITE_BRICK_SLABS, MSTags.Items.GRANITE_BRICK_SLABS);
			this.copy(MSTags.Blocks.GRANITE_BRICK_STAIRS, MSTags.Items.GRANITE_BRICK_STAIRS);
			this.copy(MSTags.Blocks.GRANITE_BRICK_WALLS, MSTags.Items.GRANITE_BRICK_WALLS);
			this.copy(MSTags.Blocks.DIORITE_BRICKS, MSTags.Items.DIORITE_BRICKS);
			this.copy(MSTags.Blocks.DIORITE_BRICK_SLABS, MSTags.Items.DIORITE_BRICK_SLABS);
			this.copy(MSTags.Blocks.DIORITE_BRICK_STAIRS, MSTags.Items.DIORITE_BRICK_STAIRS);
			this.copy(MSTags.Blocks.DIORITE_BRICK_WALLS, MSTags.Items.DIORITE_BRICK_WALLS);
			this.copy(MSTags.Blocks.ANDESITE_BRICKS, MSTags.Items.ANDESITE_BRICKS);
			this.copy(MSTags.Blocks.ANDESITE_BRICK_SLABS, MSTags.Items.ANDESITE_BRICK_SLABS);
			this.copy(MSTags.Blocks.ANDESITE_BRICK_STAIRS, MSTags.Items.ANDESITE_BRICK_STAIRS);
			this.copy(MSTags.Blocks.ANDESITE_BRICK_WALLS, MSTags.Items.ANDESITE_BRICK_WALLS);
			this.copy(MSTags.Blocks.BRICK_BLOCKS, MSTags.Items.BRICK_BLOCKS);
			this.copy(MSTags.Blocks.BRICK_SLABS, MSTags.Items.BRICK_SLABS);
			this.copy(MSTags.Blocks.BRICK_STAIRS, MSTags.Items.BRICK_STAIRS);
			this.copy(MSTags.Blocks.BRICK_WALLS, MSTags.Items.BRICK_WALLS);
			this.copy(MSTags.Blocks.MUD_BRICKS, MSTags.Items.MUD_BRICKS);
			this.copy(MSTags.Blocks.MUD_BRICK_SLABS, MSTags.Items.MUD_BRICK_SLABS);
			this.copy(MSTags.Blocks.MUD_BRICK_STAIRS, MSTags.Items.MUD_BRICK_STAIRS);
			this.copy(MSTags.Blocks.MUD_BRICK_WALLS, MSTags.Items.MUD_BRICK_WALLS);
			this.copy(MSTags.Blocks.SANDSTONE_BRICKS, MSTags.Items.SANDSTONE_BRICKS);
			this.copy(MSTags.Blocks.SANDSTONE_BRICK_SLABS, MSTags.Items.SANDSTONE_BRICK_SLABS);
			this.copy(MSTags.Blocks.SANDSTONE_BRICK_STAIRS, MSTags.Items.SANDSTONE_BRICK_STAIRS);
			this.copy(MSTags.Blocks.SANDSTONE_BRICK_WALLS, MSTags.Items.SANDSTONE_BRICK_WALLS);
			this.copy(MSTags.Blocks.BEIGE_SANDSTONE_BRICKS, MSTags.Items.BEIGE_SANDSTONE_BRICKS);
			this.copy(MSTags.Blocks.BEIGE_SANDSTONE_BRICK_SLABS, MSTags.Items.BEIGE_SANDSTONE_BRICK_SLABS);
			this.copy(MSTags.Blocks.BEIGE_SANDSTONE_BRICK_STAIRS, MSTags.Items.BEIGE_SANDSTONE_BRICK_STAIRS);
			this.copy(MSTags.Blocks.BEIGE_SANDSTONE_BRICK_WALLS, MSTags.Items.BEIGE_SANDSTONE_BRICK_WALLS);
			this.copy(MSTags.Blocks.RED_SANDSTONE_BRICKS, MSTags.Items.RED_SANDSTONE_BRICKS);
			this.copy(MSTags.Blocks.RED_SANDSTONE_BRICK_SLABS, MSTags.Items.RED_SANDSTONE_BRICK_SLABS);
			this.copy(MSTags.Blocks.RED_SANDSTONE_BRICK_STAIRS, MSTags.Items.RED_SANDSTONE_BRICK_STAIRS);
			this.copy(MSTags.Blocks.RED_SANDSTONE_BRICK_WALLS, MSTags.Items.RED_SANDSTONE_BRICK_WALLS);
			this.copy(MSTags.Blocks.PRISMARINE_BRICKS, MSTags.Items.PRISMARINE_BRICKS);
			this.copy(MSTags.Blocks.PRISMARINE_BRICK_SLABS, MSTags.Items.PRISMARINE_BRICK_SLABS);
			this.copy(MSTags.Blocks.PRISMARINE_BRICK_STAIRS, MSTags.Items.PRISMARINE_BRICK_STAIRS);
			this.copy(MSTags.Blocks.PRISMARINE_BRICK_WALLS, MSTags.Items.PRISMARINE_BRICK_WALLS);
			this.copy(MSTags.Blocks.UNCOLORED_NETHER_BRICK_BLOCKS, MSTags.Items.UNCOLORED_NETHER_BRICK_BLOCKS);
			this.copy(MSTags.Blocks.UNCOLORED_NETHER_BRICK_SLABS, MSTags.Items.UNCOLORED_NETHER_BRICK_SLABS);
			this.copy(MSTags.Blocks.UNCOLORED_NETHER_BRICK_STAIRS, MSTags.Items.UNCOLORED_NETHER_BRICK_STAIRS);
			this.copy(MSTags.Blocks.UNCOLORED_NETHER_BRICK_WALLS, MSTags.Items.UNCOLORED_NETHER_BRICK_WALLS);
			this.copy(MSTags.Blocks.RED_NETHER_BRICK_BLOCKS, MSTags.Items.RED_NETHER_BRICK_BLOCKS);
			this.copy(MSTags.Blocks.RED_NETHER_BRICK_SLABS, MSTags.Items.RED_NETHER_BRICK_SLABS);
			this.copy(MSTags.Blocks.RED_NETHER_BRICK_STAIRS, MSTags.Items.RED_NETHER_BRICK_STAIRS);
			this.copy(MSTags.Blocks.RED_NETHER_BRICK_WALLS, MSTags.Items.RED_NETHER_BRICK_WALLS);
			this.copy(MSTags.Blocks.END_STONE_BRICKS, MSTags.Items.END_STONE_BRICKS);
			this.copy(MSTags.Blocks.END_STONE_BRICK_SLABS, MSTags.Items.END_STONE_BRICK_SLABS);
			this.copy(MSTags.Blocks.END_STONE_BRICK_STAIRS, MSTags.Items.END_STONE_BRICK_STAIRS);
			this.copy(MSTags.Blocks.END_STONE_BRICK_WALLS, MSTags.Items.END_STONE_BRICK_WALLS);
			this.copy(MSTags.Blocks.QUARTZ_BRICKS, MSTags.Items.QUARTZ_BRICKS);
			this.copy(MSTags.Blocks.QUARTZ_BRICK_SLABS, MSTags.Items.QUARTZ_BRICK_SLABS);
			this.copy(MSTags.Blocks.QUARTZ_BRICK_STAIRS, MSTags.Items.QUARTZ_BRICK_STAIRS);
			this.copy(MSTags.Blocks.QUARTZ_BRICK_WALLS, MSTags.Items.QUARTZ_BRICK_WALLS);
			
			this.copy(SSWPTags.Blocks.STONE, SSWPTags.Items.STONE);
			this.copy(SSWPTags.Blocks.STONE_SLABS, SSWPTags.Items.STONE_SLABS);
			this.copy(SSWPTags.Blocks.STONE_STAIRS, SSWPTags.Items.STONE_STAIRS);
			this.copy(SSWPTags.Blocks.STONE_WALLS, SSWPTags.Items.STONE_WALLS);
			this.copy(SSWPTags.Blocks.STONE_BRICK_SLABS, SSWPTags.Items.STONE_BRICK_SLABS);
			this.copy(SSWPTags.Blocks.STONE_BRICK_STAIRS, SSWPTags.Items.STONE_BRICK_STAIRS);
			this.copy(SSWPTags.Blocks.STONE_BRICK_WALLS, SSWPTags.Items.STONE_BRICK_WALLS);
			this.copy(SSWPTags.Blocks.GRANITE, SSWPTags.Items.GRANITE);
			this.copy(SSWPTags.Blocks.GRANITE_SLABS, SSWPTags.Items.GRANITE_SLABS);
			this.copy(SSWPTags.Blocks.GRANITE_STAIRS, SSWPTags.Items.GRANITE_STAIRS);
			this.copy(SSWPTags.Blocks.GRANITE_WALLS, SSWPTags.Items.GRANITE_WALLS);
			this.copy(SSWPTags.Blocks.DIORITE, SSWPTags.Items.DIORITE);
			this.copy(SSWPTags.Blocks.DIORITE_SLABS, SSWPTags.Items.DIORITE_SLABS);
			this.copy(SSWPTags.Blocks.DIORITE_STAIRS, SSWPTags.Items.DIORITE_STAIRS);
			this.copy(SSWPTags.Blocks.DIORITE_WALLS, SSWPTags.Items.DIORITE_WALLS);
			this.copy(SSWPTags.Blocks.ANDESITE, SSWPTags.Items.ANDESITE);
			this.copy(SSWPTags.Blocks.ANDESITE_SLABS, SSWPTags.Items.ANDESITE_SLABS);
			this.copy(SSWPTags.Blocks.ANDESITE_STAIRS, SSWPTags.Items.ANDESITE_STAIRS);
			this.copy(SSWPTags.Blocks.ANDESITE_WALLS, SSWPTags.Items.ANDESITE_WALLS);
			this.copy(SSWPTags.Blocks.DEEPSLATE, SSWPTags.Items.DEEPSLATE);
			this.copy(SSWPTags.Blocks.DEEPSLATE_SLABS, SSWPTags.Items.DEEPSLATE_SLABS);
			this.copy(SSWPTags.Blocks.DEEPSLATE_STAIRS, SSWPTags.Items.DEEPSLATE_STAIRS);
			this.copy(SSWPTags.Blocks.DEEPSLATE_WALLS, SSWPTags.Items.DEEPSLATE_WALLS);
			this.copy(SSWPTags.Blocks.DEEPSLATE_BRICKS, SSWPTags.Items.DEEPSLATE_BRICKS);
			this.copy(SSWPTags.Blocks.DEEPSLATE_BRICK_SLABS, SSWPTags.Items.DEEPSLATE_BRICK_SLABS);
			this.copy(SSWPTags.Blocks.DEEPSLATE_BRICK_STAIRS, SSWPTags.Items.DEEPSLATE_BRICK_STAIRS);
			this.copy(SSWPTags.Blocks.DEEPSLATE_BRICK_WALLS, SSWPTags.Items.DEEPSLATE_BRICK_WALLS);
			this.copy(SSWPTags.Blocks.DEEPSLATE_TILES, SSWPTags.Items.DEEPSLATE_TILES);
			this.copy(SSWPTags.Blocks.DEEPSLATE_TILE_SLABS, SSWPTags.Items.DEEPSLATE_TILE_SLABS);
			this.copy(SSWPTags.Blocks.DEEPSLATE_TILE_STAIRS, SSWPTags.Items.DEEPSLATE_TILE_STAIRS);
			this.copy(SSWPTags.Blocks.DEEPSLATE_TILE_WALLS, SSWPTags.Items.DEEPSLATE_TILE_WALLS);
			this.copy(SSWPTags.Blocks.TUFF, SSWPTags.Items.TUFF);
			this.copy(SSWPTags.Blocks.TUFF_SLABS, SSWPTags.Items.TUFF_SLABS);
			this.copy(SSWPTags.Blocks.TUFF_STAIRS, SSWPTags.Items.TUFF_STAIRS);
			this.copy(SSWPTags.Blocks.TUFF_WALLS, SSWPTags.Items.TUFF_WALLS);
			this.copy(SSWPTags.Blocks.TUFF_BRICKS, SSWPTags.Items.TUFF_BRICKS);
			this.copy(SSWPTags.Blocks.TUFF_BRICK_SLABS, SSWPTags.Items.TUFF_BRICK_SLABS);
			this.copy(SSWPTags.Blocks.TUFF_BRICK_STAIRS, SSWPTags.Items.TUFF_BRICK_STAIRS);
			this.copy(SSWPTags.Blocks.TUFF_BRICK_WALLS, SSWPTags.Items.TUFF_BRICK_WALLS);
			this.copy(SSWPTags.Blocks.SANDSTONE, SSWPTags.Items.SANDSTONE);
			this.copy(SSWPTags.Blocks.SANDSTONE_SLABS, SSWPTags.Items.SANDSTONE_SLABS);
			this.copy(SSWPTags.Blocks.SANDSTONE_STAIRS, SSWPTags.Items.SANDSTONE_STAIRS);
			this.copy(SSWPTags.Blocks.SANDSTONE_WALLS, SSWPTags.Items.SANDSTONE_WALLS);
			this.copy(SSWPTags.Blocks.BEIGE_SANDSTONE, SSWPTags.Items.BEIGE_SANDSTONE);
			this.copy(SSWPTags.Blocks.BEIGE_SANDSTONE_SLABS, SSWPTags.Items.BEIGE_SANDSTONE_SLABS);
			this.copy(SSWPTags.Blocks.BEIGE_SANDSTONE_STAIRS, SSWPTags.Items.BEIGE_SANDSTONE_STAIRS);
			this.copy(SSWPTags.Blocks.BEIGE_SANDSTONE_WALLS, SSWPTags.Items.BEIGE_SANDSTONE_WALLS);
			this.copy(SSWPTags.Blocks.RED_SANDSTONE, SSWPTags.Items.RED_SANDSTONE);
			this.copy(SSWPTags.Blocks.RED_SANDSTONE_SLABS, SSWPTags.Items.RED_SANDSTONE_SLABS);
			this.copy(SSWPTags.Blocks.RED_SANDSTONE_STAIRS, SSWPTags.Items.RED_SANDSTONE_STAIRS);
			this.copy(SSWPTags.Blocks.RED_SANDSTONE_WALLS, SSWPTags.Items.RED_SANDSTONE_WALLS);
			this.copy(SSWPTags.Blocks.PRISMARINE, SSWPTags.Items.PRISMARINE);
			this.copy(SSWPTags.Blocks.PRISMARINE_SLABS, SSWPTags.Items.PRISMARINE_SLABS);
			this.copy(SSWPTags.Blocks.PRISMARINE_STAIRS, SSWPTags.Items.PRISMARINE_STAIRS);
			this.copy(SSWPTags.Blocks.PRISMARINE_WALLS, SSWPTags.Items.PRISMARINE_WALLS);
			this.copy(SSWPTags.Blocks.NETHER_BRICK_BLOCKS, SSWPTags.Items.NETHER_BRICK_BLOCKS);
			this.copy(SSWPTags.Blocks.NETHER_BRICK_SLABS, SSWPTags.Items.NETHER_BRICK_SLABS);
			this.copy(SSWPTags.Blocks.NETHER_BRICK_STAIRS, SSWPTags.Items.NETHER_BRICK_STAIRS);
			this.copy(SSWPTags.Blocks.NETHER_BRICK_WALLS, SSWPTags.Items.NETHER_BRICK_WALLS);
			this.copy(SSWPTags.Blocks.QUARTZ_BLOCKS, SSWPTags.Items.QUARTZ_BLOCKS);
			this.copy(SSWPTags.Blocks.QUARTZ_SLABS, SSWPTags.Items.QUARTZ_SLABS);
			this.copy(SSWPTags.Blocks.QUARTZ_STAIRS, SSWPTags.Items.QUARTZ_STAIRS);
			this.copy(SSWPTags.Blocks.QUARTZ_WALLS, SSWPTags.Items.QUARTZ_WALLS);
			
			this.copy(AquiferTags.Blocks.INFESTABLE, AquiferTags.Items.INFESTABLE);
			this.copy(AquiferTags.Blocks.INFESTED, AquiferTags.Items.INFESTED);
			
			this.copy(BlockTags.STONE_BRICKS, ItemTags.STONE_BRICKS);
			this.copy(BlockTags.SLABS, ItemTags.SLABS);
			this.copy(BlockTags.STAIRS, ItemTags.STAIRS);
			this.copy(BlockTags.WALLS, ItemTags.WALLS);
			
			this.copy(MSTags.Blocks.Conventional.GRANITE_COBBLESTONES, MSTags.Items.Conventional.GRANITE_COBBLESTONES);
			this.copy(MSTags.Blocks.Conventional.DIORITE_COBBLESTONES, MSTags.Items.Conventional.DIORITE_COBBLESTONES);
			this.copy(MSTags.Blocks.Conventional.ANDESITE_COBBLESTONES, MSTags.Items.Conventional.ANDESITE_COBBLESTONES);
			
			this.copy(ConventionalBlockTags.MOSSY_COBBLESTONES, ConventionalItemTags.MOSSY_COBBLESTONES);
			this.copy(ConventionalBlockTags.DEEPSLATE_COBBLESTONES, ConventionalItemTags.DEEPSLATE_COBBLESTONES);
			this.copy(ConventionalBlockTags.INFESTED_COBBLESTONES, ConventionalItemTags.INFESTED_COBBLESTONES);
		}
	}
}
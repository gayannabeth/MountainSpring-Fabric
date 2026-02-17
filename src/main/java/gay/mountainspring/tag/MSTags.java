package gay.mountainspring.tag;

import gay.mountainspring.MSMain;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class MSTags {
	private MSTags() {}
	
	public static <T> TagKey<T> create(RegistryKey<? extends Registry<T>> registryKey, String path) {
		return create(registryKey, Identifier.of(MSMain.MOD_ID, path));
	}
	
	public static <T> TagKey<T> createConventional(RegistryKey<? extends Registry<T>> registryKey, String path) {
		return create(registryKey, Identifier.of("c", path));
	}
	
	public static <T> TagKey<T> create(RegistryKey<? extends Registry<T>> registryKey, Identifier id) {
		return TagKey.of(registryKey, id);
	}
	
	public static class Blocks {
		private Blocks() {}
		
		public static final TagKey<Block> GRANITE_BRICKS = create("granite_bricks");
		public static final TagKey<Block> GRANITE_BRICK_SLABS = create("granite_brick_slabs");
		public static final TagKey<Block> GRANITE_BRICK_STAIRS = create("granite_brick_stairs");
		public static final TagKey<Block> GRANITE_BRICK_WALLS = create("granite_brick_walls");
		
		public static final TagKey<Block> DIORITE_BRICKS = create("diorite_bricks");
		public static final TagKey<Block> DIORITE_BRICK_SLABS = create("diorite_brick_slabs");
		public static final TagKey<Block> DIORITE_BRICK_STAIRS = create("diorite_brick_stairs");
		public static final TagKey<Block> DIORITE_BRICK_WALLS = create("diorite_brick_walls");
		
		public static final TagKey<Block> ANDESITE_BRICKS = create("andesite_bricks");
		public static final TagKey<Block> ANDESITE_BRICK_SLABS = create("andesite_brick_slabs");
		public static final TagKey<Block> ANDESITE_BRICK_STAIRS = create("andesite_brick_stairs");
		public static final TagKey<Block> ANDESITE_BRICK_WALLS = create("andesite_brick_walls");
		
		public static final TagKey<Block> BRICK_BLOCKS = create("brick_blocks");
		public static final TagKey<Block> BRICK_SLABS = create("brick_slabs");
		public static final TagKey<Block> BRICK_STAIRS = create("brick_stairs");
		public static final TagKey<Block> BRICK_WALLS = create("brick_walls");
		
		public static final TagKey<Block> MUD_BRICKS = create("mud_bricks");
		public static final TagKey<Block> MUD_BRICK_SLABS = create("mud_brick_slabs");
		public static final TagKey<Block> MUD_BRICK_STAIRS = create("mud_brick_stairs");
		public static final TagKey<Block> MUD_BRICK_WALLS = create("mud_brick_walls");
		
		public static final TagKey<Block> SANDSTONE_BRICKS = create("sandstone_bricks");
		public static final TagKey<Block> SANDSTONE_BRICK_SLABS = create("sandstone_brick_slabs");
		public static final TagKey<Block> SANDSTONE_BRICK_STAIRS = create("sandstone_brick_stairs");
		public static final TagKey<Block> SANDSTONE_BRICK_WALLS = create("sandstone_brick_walls");
		
		public static final TagKey<Block> BEIGE_SANDSTONE_BRICKS = create("sandstone_bricks/beige");
		public static final TagKey<Block> BEIGE_SANDSTONE_BRICK_SLABS = create("sandstone_brick_slabs/beige");
		public static final TagKey<Block> BEIGE_SANDSTONE_BRICK_STAIRS = create("sandstone_brick_stairs/beige");
		public static final TagKey<Block> BEIGE_SANDSTONE_BRICK_WALLS = create("sandstone_brick_walls/beige");
		
		public static final TagKey<Block> RED_SANDSTONE_BRICKS = create("sandstone_bricks/red");
		public static final TagKey<Block> RED_SANDSTONE_BRICK_SLABS = create("sandstone_brick_slabs/red");
		public static final TagKey<Block> RED_SANDSTONE_BRICK_STAIRS = create("sandstone_brick_stairs/red");
		public static final TagKey<Block> RED_SANDSTONE_BRICK_WALLS = create("sandstone_brick_walls/red");
		
		public static final TagKey<Block> PRISMARINE_BRICKS = create("prismarine_bricks");
		public static final TagKey<Block> PRISMARINE_BRICK_SLABS = create("prismarine_brick_slabs");
		public static final TagKey<Block> PRISMARINE_BRICK_STAIRS = create("prismarine_brick_stairs");
		public static final TagKey<Block> PRISMARINE_BRICK_WALLS = create("prismarine_brick_walls");
		
		public static final TagKey<Block> UNCOLORED_NETHER_BRICK_BLOCKS = create("nether_brick_blocks/uncolored");
		public static final TagKey<Block> UNCOLORED_NETHER_BRICK_SLABS = create("nether_brick_slabs/uncolored");
		public static final TagKey<Block> UNCOLORED_NETHER_BRICK_STAIRS = create("nether_brick_stairs/uncolored");
		public static final TagKey<Block> UNCOLORED_NETHER_BRICK_WALLS = create("nether_brick_walls/uncolored");
		public static final TagKey<Block> UNCOLORED_NETHER_BRICK_FENCES = create("nether_brick_fences/uncolored");
		public static final TagKey<Block> UNCOLORED_NETHER_BRICK_FENCE_GATES = create("nether_brick_fence_gates/uncolored");
		public static final TagKey<Block> RED_NETHER_BRICK_BLOCKS = create("nether_brick_blocks/red");
		public static final TagKey<Block> RED_NETHER_BRICK_SLABS = create("nether_brick_slabs/red");
		public static final TagKey<Block> RED_NETHER_BRICK_STAIRS = create("nether_brick_stairs/red");
		public static final TagKey<Block> RED_NETHER_BRICK_WALLS = create("nether_brick_walls/red");
		public static final TagKey<Block> RED_NETHER_BRICK_FENCES = create("nether_brick_fences/red");
		public static final TagKey<Block> RED_NETHER_BRICK_FENCE_GATES = create("nether_brick_fence_gates/red");
		
		public static final TagKey<Block> END_STONE_BRICKS = create("end_stone_bricks");
		public static final TagKey<Block> END_STONE_BRICK_SLABS = create("end_stone_brick_slabs");
		public static final TagKey<Block> END_STONE_BRICK_STAIRS = create("end_stone_brick_stairs");
		public static final TagKey<Block> END_STONE_BRICK_WALLS = create("end_stone_brick_walls");
		
		public static final TagKey<Block> QUARTZ_BRICKS = create("quartz_bricks");
		public static final TagKey<Block> QUARTZ_BRICK_SLABS = create("quartz_brick_slabs");
		public static final TagKey<Block> QUARTZ_BRICK_STAIRS = create("quartz_brick_stairs");
		public static final TagKey<Block> QUARTZ_BRICK_WALLS = create("quartz_brick_walls");
		
		public static TagKey<Block> create(String path) {
			return MSTags.create(RegistryKeys.BLOCK, path);
		}
		
		public static TagKey<Block> createConventional(String path) {
			return MSTags.createConventional(RegistryKeys.BLOCK, path);
		}
		
		public static TagKey<Block> create(Identifier id) {
			return MSTags.create(RegistryKeys.BLOCK, id);
		}
		
		public static class Conventional {
			private Conventional() {}
			
			public static final TagKey<Block> GRANITE_COBBLESTONES = create("cobblestones/granite");
			public static final TagKey<Block> DIORITE_COBBLESTONES = create("cobblestones/diorite");
			public static final TagKey<Block> ANDESITE_COBBLESTONES = create("cobblestones/andesite");
			
			public static TagKey<Block> create(String path) {
				return MSTags.Blocks.createConventional(path);
			}
		}
	}
	
	public static class Items {
		private Items() {}
		
		public static final TagKey<Item> GRANITE_BRICKS = create("granite_bricks");
		public static final TagKey<Item> GRANITE_BRICK_SLABS = create("granite_brick_slabs");
		public static final TagKey<Item> GRANITE_BRICK_STAIRS = create("granite_brick_stairs");
		public static final TagKey<Item> GRANITE_BRICK_WALLS = create("granite_brick_walls");
		
		public static final TagKey<Item> DIORITE_BRICKS = create("diorite_bricks");
		public static final TagKey<Item> DIORITE_BRICK_SLABS = create("diorite_brick_slabs");
		public static final TagKey<Item> DIORITE_BRICK_STAIRS = create("diorite_brick_stairs");
		public static final TagKey<Item> DIORITE_BRICK_WALLS = create("diorite_brick_walls");
		
		public static final TagKey<Item> ANDESITE_BRICKS = create("andesite_bricks");
		public static final TagKey<Item> ANDESITE_BRICK_SLABS = create("andesite_brick_slabs");
		public static final TagKey<Item> ANDESITE_BRICK_STAIRS = create("andesite_brick_stairs");
		public static final TagKey<Item> ANDESITE_BRICK_WALLS = create("andesite_brick_walls");
		
		public static final TagKey<Item> BRICK_BLOCKS = create("brick_blocks");
		public static final TagKey<Item> BRICK_SLABS = create("brick_slabs");
		public static final TagKey<Item> BRICK_STAIRS = create("brick_stairs");
		public static final TagKey<Item> BRICK_WALLS = create("brick_walls");
		
		public static final TagKey<Item> MUD_BRICKS = create("mud_bricks");
		public static final TagKey<Item> MUD_BRICK_SLABS = create("mud_brick_slabs");
		public static final TagKey<Item> MUD_BRICK_STAIRS = create("mud_brick_stairs");
		public static final TagKey<Item> MUD_BRICK_WALLS = create("mud_brick_walls");
		
		public static final TagKey<Item> SANDSTONE_BRICKS = create("sandstone_bricks");
		public static final TagKey<Item> SANDSTONE_BRICK_SLABS = create("sandstone_brick_slabs");
		public static final TagKey<Item> SANDSTONE_BRICK_STAIRS = create("sandstone_brick_stairs");
		public static final TagKey<Item> SANDSTONE_BRICK_WALLS = create("sandstone_brick_walls");
		
		public static final TagKey<Item> BEIGE_SANDSTONE_BRICKS = create("sandstone_bricks/beige");
		public static final TagKey<Item> BEIGE_SANDSTONE_BRICK_SLABS = create("sandstone_brick_slabs/beige");
		public static final TagKey<Item> BEIGE_SANDSTONE_BRICK_STAIRS = create("sandstone_brick_stairs/beige");
		public static final TagKey<Item> BEIGE_SANDSTONE_BRICK_WALLS = create("sandstone_brick_walls/beige");
		
		public static final TagKey<Item> RED_SANDSTONE_BRICKS = create("sandstone_bricks/red");
		public static final TagKey<Item> RED_SANDSTONE_BRICK_SLABS = create("sandstone_brick_slabs/red");
		public static final TagKey<Item> RED_SANDSTONE_BRICK_STAIRS = create("sandstone_brick_stairs/red");
		public static final TagKey<Item> RED_SANDSTONE_BRICK_WALLS = create("sandstone_brick_walls/red");
		
		public static final TagKey<Item> PRISMARINE_BRICKS = create("prismarine_bricks");
		public static final TagKey<Item> PRISMARINE_BRICK_SLABS = create("prismarine_brick_slabs");
		public static final TagKey<Item> PRISMARINE_BRICK_STAIRS = create("prismarine_brick_stairs");
		public static final TagKey<Item> PRISMARINE_BRICK_WALLS = create("prismarine_brick_walls");
		
		public static final TagKey<Item> UNCOLORED_NETHER_BRICK_BLOCKS = create("nether_brick_blocks/uncolored");
		public static final TagKey<Item> UNCOLORED_NETHER_BRICK_SLABS = create("nether_brick_slabs/uncolored");
		public static final TagKey<Item> UNCOLORED_NETHER_BRICK_STAIRS = create("nether_brick_stairs/uncolored");
		public static final TagKey<Item> UNCOLORED_NETHER_BRICK_WALLS = create("nether_brick_walls/uncolored");
		public static final TagKey<Item> UNCOLORED_NETHER_BRICK_FENCES = create("nether_brick_fences/uncolored");
		public static final TagKey<Item> UNCOLORED_NETHER_BRICK_FENCE_GATES = create("nether_brick_fence_gates/uncolored");
		public static final TagKey<Item> RED_NETHER_BRICK_BLOCKS = create("nether_brick_blocks/red");
		public static final TagKey<Item> RED_NETHER_BRICK_SLABS = create("nether_brick_slabs/red");
		public static final TagKey<Item> RED_NETHER_BRICK_STAIRS = create("nether_brick_stairs/red");
		public static final TagKey<Item> RED_NETHER_BRICK_WALLS = create("nether_brick_walls/red");
		public static final TagKey<Item> RED_NETHER_BRICK_FENCES = create("nether_brick_fences/red");
		public static final TagKey<Item> RED_NETHER_BRICK_FENCE_GATES = create("nether_brick_fence_gates/red");
		
		public static final TagKey<Item> END_STONE_BRICKS = create("end_stone_bricks");
		public static final TagKey<Item> END_STONE_BRICK_SLABS = create("end_stone_brick_slabs");
		public static final TagKey<Item> END_STONE_BRICK_STAIRS = create("end_stone_brick_stairs");
		public static final TagKey<Item> END_STONE_BRICK_WALLS = create("end_stone_brick_walls");
		
		public static final TagKey<Item> QUARTZ_BRICKS = create("quartz_bricks");
		public static final TagKey<Item> QUARTZ_BRICK_SLABS = create("quartz_brick_slabs");
		public static final TagKey<Item> QUARTZ_BRICK_STAIRS = create("quartz_brick_stairs");
		public static final TagKey<Item> QUARTZ_BRICK_WALLS = create("quartz_brick_walls");
		
		public static TagKey<Item> create(String path) {
			return MSTags.create(RegistryKeys.ITEM, path);
		}
		
		public static TagKey<Item> createConventional(String path) {
			return MSTags.createConventional(RegistryKeys.ITEM, path);
		}
		
		public static TagKey<Item> create(Identifier id) {
			return MSTags.create(RegistryKeys.ITEM, id);
		}
		
		public static class Conventional {
			private Conventional() {}
			
			public static final TagKey<Item> GRANITE_COBBLESTONES = create("cobblestones/granite");
			public static final TagKey<Item> DIORITE_COBBLESTONES = create("cobblestones/diorite");
			public static final TagKey<Item> ANDESITE_COBBLESTONES = create("cobblestones/andesite");
			
			public static TagKey<Item> create(String path) {
				return MSTags.Items.createConventional(path);
			}
		}
	}
}
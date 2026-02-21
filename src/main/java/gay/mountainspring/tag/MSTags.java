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
		
		public static final TagKey<Block> WHITE_SANDSTONE = create("sandstone/white");
		public static final TagKey<Block> WHITE_SANDSTONE_SLABS = create("sandstone_slabs/white");
		public static final TagKey<Block> WHITE_SANDSTONE_STAIRS = create("sandstone_stairs/white");
		public static final TagKey<Block> WHITE_SANDSTONE_WALLS = create("sandstone_walls/white");
		public static final TagKey<Block> WHITE_SANDSTONE_BRICKS = create("sandstone_bricks/white");
		public static final TagKey<Block> WHITE_SANDSTONE_BRICK_SLABS = create("sandstone_brick_slabs/white");
		public static final TagKey<Block> WHITE_SANDSTONE_BRICK_STAIRS = create("sandstone_brick_stairs/white");
		public static final TagKey<Block> WHITE_SANDSTONE_BRICK_WALLS = create("sandstone_brick_walls/white");
		
		public static final TagKey<Block> BLACK_SANDSTONE = create("sandstone/black");
		public static final TagKey<Block> BLACK_SANDSTONE_SLABS = create("sandstone_slabs/black");
		public static final TagKey<Block> BLACK_SANDSTONE_STAIRS = create("sandstone_stairs/black");
		public static final TagKey<Block> BLACK_SANDSTONE_WALLS = create("sandstone_walls/black");
		public static final TagKey<Block> BLACK_SANDSTONE_BRICKS = create("sandstone_bricks/black");
		public static final TagKey<Block> BLACK_SANDSTONE_BRICK_SLABS = create("sandstone_brick_slabs/black");
		public static final TagKey<Block> BLACK_SANDSTONE_BRICK_STAIRS = create("sandstone_brick_stairs/black");
		public static final TagKey<Block> BLACK_SANDSTONE_BRICK_WALLS = create("sandstone_brick_walls/black");
		
		public static final TagKey<Block> PRISMARINE_BRICKS = create("prismarine_bricks");
		public static final TagKey<Block> PRISMARINE_BRICK_SLABS = create("prismarine_brick_slabs");
		public static final TagKey<Block> PRISMARINE_BRICK_STAIRS = create("prismarine_brick_stairs");
		public static final TagKey<Block> PRISMARINE_BRICK_WALLS = create("prismarine_brick_walls");
		
		public static final TagKey<Block> SOUL_SANDSTONE = create("sandstone/soul");
		public static final TagKey<Block> SOUL_SANDSTONE_SLABS = create("sandstone_slabs/soul");
		public static final TagKey<Block> SOUL_SANDSTONE_STAIRS = create("sandstone_stairs/soul");
		public static final TagKey<Block> SOUL_SANDSTONE_WALLS = create("sandstone_walls/soul");
		public static final TagKey<Block> SOUL_SANDSTONE_BRICKS = create("sandstone_bricks/soul");
		public static final TagKey<Block> SOUL_SANDSTONE_BRICK_SLABS = create("sandstone_brick_slabs/soul");
		public static final TagKey<Block> SOUL_SANDSTONE_BRICK_STAIRS = create("sandstone_brick_stairs/soul");
		public static final TagKey<Block> SOUL_SANDSTONE_BRICK_WALLS = create("sandstone_brick_walls/soul");
		
		public static final TagKey<Block> BONE_BLOCKS = create("bone_blocks");
		public static final TagKey<Block> BONE_SLABS = create("bone_slabs");
		public static final TagKey<Block> BONE_STAIRS = create("bone_stairs");
		public static final TagKey<Block> BONE_WALLS = create("bone_walls");
		
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
		
		public static final TagKey<Block> WARPED_NETHER_BRICK_BLOCKS = create("nether_brick_blocks/warped");
		public static final TagKey<Block> WARPED_NETHER_BRICK_SLABS = create("nether_brick_slabs/warped");
		public static final TagKey<Block> WARPED_NETHER_BRICK_STAIRS = create("nether_brick_stairs/warped");
		public static final TagKey<Block> WARPED_NETHER_BRICK_WALLS = create("nether_brick_walls/warped");
		public static final TagKey<Block> WARPED_NETHER_BRICK_FENCES = create("nether_brick_fences/warped");
		public static final TagKey<Block> WARPED_NETHER_BRICK_FENCE_GATES = create("nether_brick_fence_gates/warped");
		
		public static final TagKey<Block> WITHERED_NETHER_BRICK_BLOCKS = create("nether_brick_blocks/withered");
		public static final TagKey<Block> WITHERED_NETHER_BRICK_SLABS = create("nether_brick_slabs/withered");
		public static final TagKey<Block> WITHERED_NETHER_BRICK_STAIRS = create("nether_brick_stairs/withered");
		public static final TagKey<Block> WITHERED_NETHER_BRICK_WALLS = create("nether_brick_walls/withered");
		public static final TagKey<Block> WITHERED_NETHER_BRICK_FENCES = create("nether_brick_fences/withered");
		public static final TagKey<Block> WITHERED_NETHER_BRICK_FENCE_GATES = create("nether_brick_fence_gates/withered");
		
		public static final TagKey<Block> SOUL_NETHER_BRICK_BLOCKS = create("nether_brick_blocks/soul");
		public static final TagKey<Block> SOUL_NETHER_BRICK_SLABS = create("nether_brick_slabs/soul");
		public static final TagKey<Block> SOUL_NETHER_BRICK_STAIRS = create("nether_brick_stairs/soul");
		public static final TagKey<Block> SOUL_NETHER_BRICK_WALLS = create("nether_brick_walls/soul");
		public static final TagKey<Block> SOUL_NETHER_BRICK_FENCES = create("nether_brick_fences/soul");
		public static final TagKey<Block> SOUL_NETHER_BRICK_FENCE_GATES = create("nether_brick_fence_gates/soul");
		
		public static final TagKey<Block> BLAZING_NETHER_BRICK_BLOCKS = create("nether_brick_blocks/blazing");
		public static final TagKey<Block> BLAZING_NETHER_BRICK_SLABS = create("nether_brick_slabs/blazing");
		public static final TagKey<Block> BLAZING_NETHER_BRICK_STAIRS = create("nether_brick_stairs/blazing");
		public static final TagKey<Block> BLAZING_NETHER_BRICK_WALLS = create("nether_brick_walls/blazing");
		public static final TagKey<Block> BLAZING_NETHER_BRICK_FENCES = create("nether_brick_fences/blazing");
		public static final TagKey<Block> BLAZING_NETHER_BRICK_FENCE_GATES = create("nether_brick_fence_gates/blazing");
		
		public static final TagKey<Block> GLOWING_NETHER_BRICK_BLOCKS = create("nether_brick_blocks/glowing");
		public static final TagKey<Block> GLOWING_NETHER_BRICK_SLABS = create("nether_brick_slabs/glowing");
		public static final TagKey<Block> GLOWING_NETHER_BRICK_STAIRS = create("nether_brick_stairs/glowing");
		public static final TagKey<Block> GLOWING_NETHER_BRICK_WALLS = create("nether_brick_walls/glowing");
		public static final TagKey<Block> GLOWING_NETHER_BRICK_FENCES = create("nether_brick_fences/glowing");
		public static final TagKey<Block> GLOWING_NETHER_BRICK_FENCE_GATES = create("nether_brick_fence_gates/glowing");
		
		public static final TagKey<Block> MAGMA_NETHER_BRICK_BLOCKS = create("nether_brick_blocks/magma");
		public static final TagKey<Block> MAGMA_NETHER_BRICK_SLABS = create("nether_brick_slabs/magma");
		public static final TagKey<Block> MAGMA_NETHER_BRICK_STAIRS = create("nether_brick_stairs/magma");
		public static final TagKey<Block> MAGMA_NETHER_BRICK_WALLS = create("nether_brick_walls/magma");
		public static final TagKey<Block> MAGMA_NETHER_BRICK_FENCES = create("nether_brick_fences/magma");
		public static final TagKey<Block> MAGMA_NETHER_BRICK_FENCE_GATES = create("nether_brick_fence_gates/magma");
		
		public static final TagKey<Block> GHASTLY_NETHER_BRICK_BLOCKS = create("nether_brick_blocks/ghastly");
		public static final TagKey<Block> GHASTLY_NETHER_BRICK_SLABS = create("nether_brick_slabs/ghastly");
		public static final TagKey<Block> GHASTLY_NETHER_BRICK_STAIRS = create("nether_brick_stairs/ghastly");
		public static final TagKey<Block> GHASTLY_NETHER_BRICK_WALLS = create("nether_brick_walls/ghastly");
		public static final TagKey<Block> GHASTLY_NETHER_BRICK_FENCES = create("nether_brick_fences/ghastly");
		public static final TagKey<Block> GHASTLY_NETHER_BRICK_FENCE_GATES = create("nether_brick_fence_gates/ghastly");
		
		public static final TagKey<Block> END_STONE_BRICKS = create("end_stone_bricks");
		public static final TagKey<Block> END_STONE_BRICK_SLABS = create("end_stone_brick_slabs");
		public static final TagKey<Block> END_STONE_BRICK_STAIRS = create("end_stone_brick_stairs");
		public static final TagKey<Block> END_STONE_BRICK_WALLS = create("end_stone_brick_walls");
		
		public static final TagKey<Block> QUARTZ_BRICKS = create("quartz_bricks");
		public static final TagKey<Block> QUARTZ_BRICK_SLABS = create("quartz_brick_slabs");
		public static final TagKey<Block> QUARTZ_BRICK_STAIRS = create("quartz_brick_stairs");
		public static final TagKey<Block> QUARTZ_BRICK_WALLS = create("quartz_brick_walls");
		
		public static final TagKey<Block> SUPPORTS_WARPED_WART = create("supports_warped_wart");
		
		public static final TagKey<Block> OVERWORLD_NATURAL_SAND = create("overworld_natural_sand");
		public static final TagKey<Block> OVERWORLD_NATURAL_SANDSTONE = create("overworld_natural_sandstone");
		
		public static final TagKey<Block> SUSPICIOUS_SAND = create("suspicious_sand");
		public static final TagKey<Block> SUSPICIOUS_BLOCKS = create("suspicious_blocks");
		
		public static final TagKey<Block> NEEDS_FLINT_TOOL = create("needs_flint_tool");
		public static final TagKey<Block> INCORRECT_FOR_FLINT_TOOL = create("incorrect_for_flint_tool");
		
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
			
			public static final TagKey<Block> WHITE_SANDS = create("sands/white");
			public static final TagKey<Block> BLACK_SANDS = create("sands/black");
			public static final TagKey<Block> SOUL_SANDS = create("sands/soul");
			
			public static final TagKey<Block> WHITE_SANDSTONE_BLOCKS = create("sandstone/white_blocks");
			public static final TagKey<Block> WHITE_SANDSTONE_SLABS = create("sandstone/white_slabs");
			public static final TagKey<Block> WHITE_SANDSTONE_STAIRS = create("sandstone/white_stairs");
			public static final TagKey<Block> WHITE_SANDSTONE_WALLS = create("sandstone/white_walls");
			
			public static final TagKey<Block> BLACK_SANDSTONE_BLOCKS = create("sandstone/black_blocks");
			public static final TagKey<Block> BLACK_SANDSTONE_SLABS = create("sandstone/black_slabs");
			public static final TagKey<Block> BLACK_SANDSTONE_STAIRS = create("sandstone/black_stairs");
			public static final TagKey<Block> BLACK_SANDSTONE_WALLS = create("sandstone/black_walls");
			
			public static final TagKey<Block> SOUL_SANDSTONE_BLOCKS = create("sandstone/soul_blocks");
			public static final TagKey<Block> SOUL_SANDSTONE_SLABS = create("sandstone/soul_slabs");
			public static final TagKey<Block> SOUL_SANDSTONE_STAIRS = create("sandstone/soul_stairs");
			public static final TagKey<Block> SOUL_SANDSTONE_WALLS = create("sandstone/soul_walls");
			
			public static final TagKey<Block> STORAGE_BLOCKS_BRICK = create("storage_blocks/brick");
			public static final TagKey<Block> STORAGE_BLOCKS_SAND = create("storage_blocks/sand");
			public static final TagKey<Block> STORAGE_BLOCKS_COLORLESS_SAND = create("storage_blocks/sand/colorless");
			public static final TagKey<Block> STORAGE_BLOCKS_RED_SAND = create("storage_blocks/sand/red");
			public static final TagKey<Block> STORAGE_BLOCKS_WHITE_SAND = create("storage_blocks/sand/white");
			public static final TagKey<Block> STORAGE_BLOCKS_BLACK_SAND = create("storage_blocks/sand/black");
			public static final TagKey<Block> STORAGE_BLOCKS_SOUL_SAND = create("storage_blocks/sand/soul");
			public static final TagKey<Block> STORAGE_BLOCKS_PRISMARINE_SHARD = create("storage_blocks/prismarine_shard");
			public static final TagKey<Block> STORAGE_BLOCKS_NETHER_BRICK = create("storage_blocks/nether_brick");
			public static final TagKey<Block> STORAGE_BLOCKS_UNCOLORED_NETHER_BRICK = create("storage_blocks/nether_brick/uncolored");
			public static final TagKey<Block> STORAGE_BLOCKS_RED_NETHER_BRICK = create("storage_blocks/nether_brick/red");
			public static final TagKey<Block> STORAGE_BLOCKS_WARPED_NETHER_BRICK = create("storage_blocks/nether_brick/warped");
			public static final TagKey<Block> STORAGE_BLOCKS_WITHERED_NETHER_BRICK = create("storage_blocks/nether_brick/withered");
			public static final TagKey<Block> STORAGE_BLOCKS_SOUL_NETHER_BRICK = create("storage_blocks/nether_brick/soul");
			public static final TagKey<Block> STORAGE_BLOCKS_BLAZING_NETHER_BRICK = create("storage_blocks/nether_brick/blazing");
			public static final TagKey<Block> STORAGE_BLOCKS_GLOWING_NETHER_BRICK = create("storage_blocks/nether_brick/glowing");
			public static final TagKey<Block> STORAGE_BLOCKS_MAGMA_NETHER_BRICK = create("storage_blocks/nether_brick/magma");
			public static final TagKey<Block> STORAGE_BLOCKS_GHASTLY_NETHER_BRICK = create("storage_blocks/nether_brick/ghastly");
			public static final TagKey<Block> STORAGE_BLOCKS_QUARTZ = create("storage_blocks/quartz");
			public static final TagKey<Block> STORAGE_BLOCKS_WHITE_QUARTZ = create("storage_blocks/quartz/white");
			public static final TagKey<Block> STORAGE_BLOCKS_AMETHYST_SHARD = create("storage_blocks/amethyst_shard");
			public static final TagKey<Block> STORAGE_BLOCKS_STRING = create("storage_blocks/string");
			public static final TagKey<Block> STORAGE_BLOCKS_CLAY_BALL = create("storage_blocks/clay_ball");
			public static final TagKey<Block> STORAGE_BLOCKS_ICE = create("storage_blocks/ice");
			public static final TagKey<Block> STORAGE_BLOCKS_NORMAL_ICE = create("storage_blocks/ice/normal");
			public static final TagKey<Block> STORAGE_BLOCKS_PACKED_ICE = create("storage_blocks/ice/packed");
			public static final TagKey<Block> STORAGE_BLOCKS_SNOWBALL = create("storage_blocks/snowball");
			public static final TagKey<Block> STORAGE_BLOCKS_POINTED_DRIPSTONE = create("storage_blocks/pointed_dripstone");
			public static final TagKey<Block> STORAGE_BLOCKS_MAGMA_CREAM = create("storage_blocks/magma_cream");
			public static final TagKey<Block> STORAGE_BLOCKS_NORMAL_BONE_MEAL = create("storage_blocks/bone_meal/normal");
			public static final TagKey<Block> STORAGE_BLOCKS_WITHER_BONE_MEAL = create("storage_blocks/bone_meal/wither");
			public static final TagKey<Block> STORAGE_BLOCKS_GLOWSTONE_DUST = create("storage_blocks/glowstone_dust");
			public static final TagKey<Block> STORAGE_BLOCKS_WART = create("storage_blocks/wart");
			public static final TagKey<Block> STORAGE_BLOCKS_NETHER_WART = create("storage_blocks/wart/nether");
			public static final TagKey<Block> STORAGE_BLOCKS_WARPED_WART = create("storage_blocks/wart/warped");
			public static final TagKey<Block> STORAGE_BLOCKS_MELON_SLICE = create("storage_blocks/melon_slice");
			
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
		
		public static final TagKey<Item> WHITE_SANDSTONE = create("sandstone/white");
		public static final TagKey<Item> WHITE_SANDSTONE_SLABS = create("sandstone_slabs/white");
		public static final TagKey<Item> WHITE_SANDSTONE_STAIRS = create("sandstone_stairs/white");
		public static final TagKey<Item> WHITE_SANDSTONE_WALLS = create("sandstone_walls/white");
		public static final TagKey<Item> WHITE_SANDSTONE_BRICKS = create("sandstone_bricks/white");
		public static final TagKey<Item> WHITE_SANDSTONE_BRICK_SLABS = create("sandstone_brick_slabs/white");
		public static final TagKey<Item> WHITE_SANDSTONE_BRICK_STAIRS = create("sandstone_brick_stairs/white");
		public static final TagKey<Item> WHITE_SANDSTONE_BRICK_WALLS = create("sandstone_brick_walls/white");
		
		public static final TagKey<Item> BLACK_SANDSTONE = create("sandstone/black");
		public static final TagKey<Item> BLACK_SANDSTONE_SLABS = create("sandstone_slabs/black");
		public static final TagKey<Item> BLACK_SANDSTONE_STAIRS = create("sandstone_stairs/black");
		public static final TagKey<Item> BLACK_SANDSTONE_WALLS = create("sandstone_walls/black");
		public static final TagKey<Item> BLACK_SANDSTONE_BRICKS = create("sandstone_bricks/black");
		public static final TagKey<Item> BLACK_SANDSTONE_BRICK_SLABS = create("sandstone_brick_slabs/black");
		public static final TagKey<Item> BLACK_SANDSTONE_BRICK_STAIRS = create("sandstone_brick_stairs/black");
		public static final TagKey<Item> BLACK_SANDSTONE_BRICK_WALLS = create("sandstone_brick_walls/black");
		
		public static final TagKey<Item> PRISMARINE_BRICKS = create("prismarine_bricks");
		public static final TagKey<Item> PRISMARINE_BRICK_SLABS = create("prismarine_brick_slabs");
		public static final TagKey<Item> PRISMARINE_BRICK_STAIRS = create("prismarine_brick_stairs");
		public static final TagKey<Item> PRISMARINE_BRICK_WALLS = create("prismarine_brick_walls");
		
		public static final TagKey<Item> SOUL_SANDSTONE = create("sandstone/soul");
		public static final TagKey<Item> SOUL_SANDSTONE_SLABS = create("sandstone_slabs/soul");
		public static final TagKey<Item> SOUL_SANDSTONE_STAIRS = create("sandstone_stairs/soul");
		public static final TagKey<Item> SOUL_SANDSTONE_WALLS = create("sandstone_walls/soul");
		public static final TagKey<Item> SOUL_SANDSTONE_BRICKS = create("sandstone_bricks/soul");
		public static final TagKey<Item> SOUL_SANDSTONE_BRICK_SLABS = create("sandstone_brick_slabs/soul");
		public static final TagKey<Item> SOUL_SANDSTONE_BRICK_STAIRS = create("sandstone_brick_stairs/soul");
		public static final TagKey<Item> SOUL_SANDSTONE_BRICK_WALLS = create("sandstone_brick_walls/soul");
		
		public static final TagKey<Item> BONE_BLOCKS = create("bone_blocks");
		public static final TagKey<Item> BONE_SLABS = create("bone_slabs");
		public static final TagKey<Item> BONE_STAIRS = create("bone_stairs");
		public static final TagKey<Item> BONE_WALLS = create("bone_walls");
		
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
		
		public static final TagKey<Item> WARPED_NETHER_BRICK_BLOCKS = create("nether_brick_blocks/warped");
		public static final TagKey<Item> WARPED_NETHER_BRICK_SLABS = create("nether_brick_slabs/warped");
		public static final TagKey<Item> WARPED_NETHER_BRICK_STAIRS = create("nether_brick_stairs/warped");
		public static final TagKey<Item> WARPED_NETHER_BRICK_WALLS = create("nether_brick_walls/warped");
		public static final TagKey<Item> WARPED_NETHER_BRICK_FENCES = create("nether_brick_fences/warped");
		public static final TagKey<Item> WARPED_NETHER_BRICK_FENCE_GATES = create("nether_brick_fence_gates/warped");
		
		public static final TagKey<Item> WITHERED_NETHER_BRICK_BLOCKS = create("nether_brick_blocks/withered");
		public static final TagKey<Item> WITHERED_NETHER_BRICK_SLABS = create("nether_brick_slabs/withered");
		public static final TagKey<Item> WITHERED_NETHER_BRICK_STAIRS = create("nether_brick_stairs/withered");
		public static final TagKey<Item> WITHERED_NETHER_BRICK_WALLS = create("nether_brick_walls/withered");
		public static final TagKey<Item> WITHERED_NETHER_BRICK_FENCES = create("nether_brick_fences/withered");
		public static final TagKey<Item> WITHERED_NETHER_BRICK_FENCE_GATES = create("nether_brick_fence_gates/withered");
		
		public static final TagKey<Item> SOUL_NETHER_BRICK_BLOCKS = create("nether_brick_blocks/soul");
		public static final TagKey<Item> SOUL_NETHER_BRICK_SLABS = create("nether_brick_slabs/soul");
		public static final TagKey<Item> SOUL_NETHER_BRICK_STAIRS = create("nether_brick_stairs/soul");
		public static final TagKey<Item> SOUL_NETHER_BRICK_WALLS = create("nether_brick_walls/soul");
		public static final TagKey<Item> SOUL_NETHER_BRICK_FENCES = create("nether_brick_fences/soul");
		public static final TagKey<Item> SOUL_NETHER_BRICK_FENCE_GATES = create("nether_brick_fence_gates/soul");
		
		public static final TagKey<Item> BLAZING_NETHER_BRICK_BLOCKS = create("nether_brick_blocks/blazing");
		public static final TagKey<Item> BLAZING_NETHER_BRICK_SLABS = create("nether_brick_slabs/blazing");
		public static final TagKey<Item> BLAZING_NETHER_BRICK_STAIRS = create("nether_brick_stairs/blazing");
		public static final TagKey<Item> BLAZING_NETHER_BRICK_WALLS = create("nether_brick_walls/blazing");
		public static final TagKey<Item> BLAZING_NETHER_BRICK_FENCES = create("nether_brick_fences/blazing");
		public static final TagKey<Item> BLAZING_NETHER_BRICK_FENCE_GATES = create("nether_brick_fence_gates/blazing");
		
		public static final TagKey<Item> GLOWING_NETHER_BRICK_BLOCKS = create("nether_brick_blocks/glowing");
		public static final TagKey<Item> GLOWING_NETHER_BRICK_SLABS = create("nether_brick_slabs/glowing");
		public static final TagKey<Item> GLOWING_NETHER_BRICK_STAIRS = create("nether_brick_stairs/glowing");
		public static final TagKey<Item> GLOWING_NETHER_BRICK_WALLS = create("nether_brick_walls/glowing");
		public static final TagKey<Item> GLOWING_NETHER_BRICK_FENCES = create("nether_brick_fences/glowing");
		public static final TagKey<Item> GLOWING_NETHER_BRICK_FENCE_GATES = create("nether_brick_fence_gates/glowing");
		
		public static final TagKey<Item> MAGMA_NETHER_BRICK_BLOCKS = create("nether_brick_blocks/magma");
		public static final TagKey<Item> MAGMA_NETHER_BRICK_SLABS = create("nether_brick_slabs/magma");
		public static final TagKey<Item> MAGMA_NETHER_BRICK_STAIRS = create("nether_brick_stairs/magma");
		public static final TagKey<Item> MAGMA_NETHER_BRICK_WALLS = create("nether_brick_walls/magma");
		public static final TagKey<Item> MAGMA_NETHER_BRICK_FENCES = create("nether_brick_fences/magma");
		public static final TagKey<Item> MAGMA_NETHER_BRICK_FENCE_GATES = create("nether_brick_fence_gates/magma");
		
		public static final TagKey<Item> GHASTLY_NETHER_BRICK_BLOCKS = create("nether_brick_blocks/ghastly");
		public static final TagKey<Item> GHASTLY_NETHER_BRICK_SLABS = create("nether_brick_slabs/ghastly");
		public static final TagKey<Item> GHASTLY_NETHER_BRICK_STAIRS = create("nether_brick_stairs/ghastly");
		public static final TagKey<Item> GHASTLY_NETHER_BRICK_WALLS = create("nether_brick_walls/ghastly");
		public static final TagKey<Item> GHASTLY_NETHER_BRICK_FENCES = create("nether_brick_fences/ghastly");
		public static final TagKey<Item> GHASTLY_NETHER_BRICK_FENCE_GATES = create("nether_brick_fence_gates/ghastly");
		
		public static final TagKey<Item> END_STONE_BRICKS = create("end_stone_bricks");
		public static final TagKey<Item> END_STONE_BRICK_SLABS = create("end_stone_brick_slabs");
		public static final TagKey<Item> END_STONE_BRICK_STAIRS = create("end_stone_brick_stairs");
		public static final TagKey<Item> END_STONE_BRICK_WALLS = create("end_stone_brick_walls");
		
		public static final TagKey<Item> QUARTZ_BRICKS = create("quartz_bricks");
		public static final TagKey<Item> QUARTZ_BRICK_SLABS = create("quartz_brick_slabs");
		public static final TagKey<Item> QUARTZ_BRICK_STAIRS = create("quartz_brick_stairs");
		public static final TagKey<Item> QUARTZ_BRICK_WALLS = create("quartz_brick_walls");
		
		public static final TagKey<Item> OVERWORLD_NATURAL_SAND = create("overworld_natural_sand");
		public static final TagKey<Item> OVERWORLD_NATURAL_SANDSTONE = create("overworld_natural_sandstone");
		
		public static final TagKey<Item> SUSPICIOUS_SAND = create("suspicious_sand");
		public static final TagKey<Item> SUSPICIOUS_BLOCKS = create("suspicious_blocks");
		
		public static final TagKey<Item> FLINT_TOOL_MATERIALS = create("flint_tool_materials");
		
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
			
			public static final TagKey<Item> WHITE_SANDS = create("sands/white");
			public static final TagKey<Item> BLACK_SANDS = create("sands/black");
			public static final TagKey<Item> SOUL_SANDS = create("sands/soul");
			
			public static final TagKey<Item> WHITE_SANDSTONE_BLOCKS = create("sandstone/white_blocks");
			public static final TagKey<Item> WHITE_SANDSTONE_SLABS = create("sandstone/white_slabs");
			public static final TagKey<Item> WHITE_SANDSTONE_STAIRS = create("sandstone/white_stairs");
			public static final TagKey<Item> WHITE_SANDSTONE_WALLS = create("sandstone/white_walls");
			
			public static final TagKey<Item> BLACK_SANDSTONE_BLOCKS = create("sandstone/black_blocks");
			public static final TagKey<Item> BLACK_SANDSTONE_SLABS = create("sandstone/black_slabs");
			public static final TagKey<Item> BLACK_SANDSTONE_STAIRS = create("sandstone/black_stairs");
			public static final TagKey<Item> BLACK_SANDSTONE_WALLS = create("sandstone/black_walls");
			
			public static final TagKey<Item> SOUL_SANDSTONE_BLOCKS = create("sandstone/soul_blocks");
			public static final TagKey<Item> SOUL_SANDSTONE_SLABS = create("sandstone/soul_slabs");
			public static final TagKey<Item> SOUL_SANDSTONE_STAIRS = create("sandstone/soul_stairs");
			public static final TagKey<Item> SOUL_SANDSTONE_WALLS = create("sandstone/soul_walls");
			
			public static final TagKey<Item> STORAGE_BLOCKS_BRICK = create("storage_blocks/brick");
			public static final TagKey<Item> STORAGE_BLOCKS_SAND = create("storage_blocks/sand");
			public static final TagKey<Item> STORAGE_BLOCKS_COLORLESS_SAND = create("storage_blocks/sand/colorless");
			public static final TagKey<Item> STORAGE_BLOCKS_RED_SAND = create("storage_blocks/sand/red");
			public static final TagKey<Item> STORAGE_BLOCKS_WHITE_SAND = create("storage_blocks/sand/white");
			public static final TagKey<Item> STORAGE_BLOCKS_BLACK_SAND = create("storage_blocks/sand/black");
			public static final TagKey<Item> STORAGE_BLOCKS_SOUL_SAND = create("storage_blocks/sand/soul");
			public static final TagKey<Item> STORAGE_BLOCKS_PRISMARINE_SHARD = create("storage_blocks/prismarine_shard");
			public static final TagKey<Item> STORAGE_BLOCKS_NETHER_BRICK = create("storage_blocks/nether_brick");
			public static final TagKey<Item> STORAGE_BLOCKS_UNCOLORED_NETHER_BRICK = create("storage_blocks/nether_brick/uncolored");
			public static final TagKey<Item> STORAGE_BLOCKS_RED_NETHER_BRICK = create("storage_blocks/nether_brick/red");
			public static final TagKey<Item> STORAGE_BLOCKS_WARPED_NETHER_BRICK = create("storage_blocks/nether_brick/warped");
			public static final TagKey<Item> STORAGE_BLOCKS_WITHERED_NETHER_BRICK = create("storage_blocks/nether_brick/withered");
			public static final TagKey<Item> STORAGE_BLOCKS_SOUL_NETHER_BRICK = create("storage_blocks/nether_brick/soul");
			public static final TagKey<Item> STORAGE_BLOCKS_BLAZING_NETHER_BRICK = create("storage_blocks/nether_brick/blazing");
			public static final TagKey<Item> STORAGE_BLOCKS_GLOWING_NETHER_BRICK = create("storage_blocks/nether_brick/glowing");
			public static final TagKey<Item> STORAGE_BLOCKS_MAGMA_NETHER_BRICK = create("storage_blocks/nether_brick/magma");
			public static final TagKey<Item> STORAGE_BLOCKS_GHASTLY_NETHER_BRICK = create("storage_blocks/nether_brick/ghastly");
			public static final TagKey<Item> STORAGE_BLOCKS_QUARTZ = create("storage_blocks/quartz");
			public static final TagKey<Item> STORAGE_BLOCKS_WHITE_QUARTZ = create("storage_blocks/quartz/white");
			public static final TagKey<Item> STORAGE_BLOCKS_AMETHYST_SHARD = create("storage_blocks/amethyst_shard");
			public static final TagKey<Item> STORAGE_BLOCKS_STRING = create("storage_blocks/string");
			public static final TagKey<Item> STORAGE_BLOCKS_CLAY_BALL = create("storage_blocks/clay_ball");
			public static final TagKey<Item> STORAGE_BLOCKS_ICE = create("storage_blocks/ice");
			public static final TagKey<Item> STORAGE_BLOCKS_NORMAL_ICE = create("storage_blocks/ice/normal");
			public static final TagKey<Item> STORAGE_BLOCKS_PACKED_ICE = create("storage_blocks/ice/packed");
			public static final TagKey<Item> STORAGE_BLOCKS_SNOWBALL = create("storage_blocks/snowball");
			public static final TagKey<Item> STORAGE_BLOCKS_POINTED_DRIPSTONE = create("storage_blocks/pointed_dripstone");
			public static final TagKey<Item> STORAGE_BLOCKS_MAGMA_CREAM = create("storage_blocks/magma_cream");
			public static final TagKey<Item> STORAGE_BLOCKS_NORMAL_BONE_MEAL = create("storage_blocks/bone_meal/normal");
			public static final TagKey<Item> STORAGE_BLOCKS_WITHER_BONE_MEAL = create("storage_blocks/bone_meal/wither");
			public static final TagKey<Item> STORAGE_BLOCKS_GLOWSTONE_DUST = create("storage_blocks/glowstone_dust");
			public static final TagKey<Item> STORAGE_BLOCKS_WART = create("storage_blocks/wart");
			public static final TagKey<Item> STORAGE_BLOCKS_NETHER_WART = create("storage_blocks/wart/nether");
			public static final TagKey<Item> STORAGE_BLOCKS_WARPED_WART = create("storage_blocks/wart/warped");
			public static final TagKey<Item> STORAGE_BLOCKS_MELON_SLICE = create("storage_blocks/melon_slice");
			
			public static TagKey<Item> create(String path) {
				return MSTags.Items.createConventional(path);
			}
		}
	}
}
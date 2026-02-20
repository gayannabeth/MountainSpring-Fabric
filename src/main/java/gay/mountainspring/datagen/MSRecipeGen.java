package gay.mountainspring.datagen;

import java.util.concurrent.CompletableFuture;

import gay.mountainspring.MSMain;
import gay.mountainspring.item.MSItems;
import gay.mountainspring.sswplus.item.SSWPItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancement.AdvancementCriterion;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.StonecuttingRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class MSRecipeGen extends FabricRecipeProvider {
	public MSRecipeGen(FabricDataOutput output, CompletableFuture<WrapperLookup> registriesFuture) {
		super(output, registriesFuture);
	}
	
	@Override
	public void generate(RecipeExporter exp) {
		defaultUncompactingRecipes(exp);
		
		stone(exp);
		
		igneous(exp,
				Items.GRANITE,
				MSItems.MOSSY_GRANITE,
				MSItems.MOSSY_GRANITE_SLAB,
				MSItems.MOSSY_GRANITE_STAIRS,
				MSItems.MOSSY_GRANITE_WALL,
				MSItems.COBBLED_GRANITE,
				MSItems.COBBLED_GRANITE_SLAB,
				MSItems.COBBLED_GRANITE_STAIRS,
				MSItems.COBBLED_GRANITE_WALL,
				MSItems.MOSSY_COBBLED_GRANITE,
				MSItems.MOSSY_COBBLED_GRANITE_SLAB,
				MSItems.MOSSY_COBBLED_GRANITE_STAIRS,
				MSItems.MOSSY_COBBLED_GRANITE_WALL,
				Items.POLISHED_GRANITE,
				MSItems.GRANITE_BRICKS,
				MSItems.GRANITE_BRICK_SLAB,
				MSItems.GRANITE_BRICK_STAIRS,
				MSItems.GRANITE_BRICK_WALL,
				MSItems.CRACKED_GRANITE_BRICKS,
				MSItems.CRACKED_GRANITE_BRICK_SLAB,
				MSItems.CRACKED_GRANITE_BRICK_STAIRS,
				MSItems.CRACKED_GRANITE_BRICK_WALL,
				MSItems.MOSSY_GRANITE_BRICKS,
				MSItems.MOSSY_GRANITE_BRICK_SLAB,
				MSItems.MOSSY_GRANITE_BRICK_STAIRS,
				MSItems.MOSSY_GRANITE_BRICK_WALL,
				MSItems.CRACKED_MOSSY_GRANITE_BRICKS,
				MSItems.CRACKED_MOSSY_GRANITE_BRICK_SLAB,
				MSItems.CRACKED_MOSSY_GRANITE_BRICK_STAIRS,
				MSItems.CRACKED_MOSSY_GRANITE_BRICK_WALL);
		
		igneous(exp,
				Items.DIORITE,
				MSItems.MOSSY_DIORITE,
				MSItems.MOSSY_DIORITE_SLAB,
				MSItems.MOSSY_DIORITE_STAIRS,
				MSItems.MOSSY_DIORITE_WALL,
				MSItems.COBBLED_DIORITE,
				MSItems.COBBLED_DIORITE_SLAB,
				MSItems.COBBLED_DIORITE_STAIRS,
				MSItems.COBBLED_DIORITE_WALL,
				MSItems.MOSSY_COBBLED_DIORITE,
				MSItems.MOSSY_COBBLED_DIORITE_SLAB,
				MSItems.MOSSY_COBBLED_DIORITE_STAIRS,
				MSItems.MOSSY_COBBLED_DIORITE_WALL,
				Items.POLISHED_DIORITE,
				MSItems.DIORITE_BRICKS,
				MSItems.DIORITE_BRICK_SLAB,
				MSItems.DIORITE_BRICK_STAIRS,
				MSItems.DIORITE_BRICK_WALL,
				MSItems.CRACKED_DIORITE_BRICKS,
				MSItems.CRACKED_DIORITE_BRICK_SLAB,
				MSItems.CRACKED_DIORITE_BRICK_STAIRS,
				MSItems.CRACKED_DIORITE_BRICK_WALL,
				MSItems.MOSSY_DIORITE_BRICKS,
				MSItems.MOSSY_DIORITE_BRICK_SLAB,
				MSItems.MOSSY_DIORITE_BRICK_STAIRS,
				MSItems.MOSSY_DIORITE_BRICK_WALL,
				MSItems.CRACKED_MOSSY_DIORITE_BRICKS,
				MSItems.CRACKED_MOSSY_DIORITE_BRICK_SLAB,
				MSItems.CRACKED_MOSSY_DIORITE_BRICK_STAIRS,
				MSItems.CRACKED_MOSSY_DIORITE_BRICK_WALL);
		
		igneous(exp,
				Items.ANDESITE,
				MSItems.MOSSY_ANDESITE,
				MSItems.MOSSY_ANDESITE_SLAB,
				MSItems.MOSSY_ANDESITE_STAIRS,
				MSItems.MOSSY_ANDESITE_WALL,
				MSItems.COBBLED_ANDESITE,
				MSItems.COBBLED_ANDESITE_SLAB,
				MSItems.COBBLED_ANDESITE_STAIRS,
				MSItems.COBBLED_ANDESITE_WALL,
				MSItems.MOSSY_COBBLED_ANDESITE,
				MSItems.MOSSY_COBBLED_ANDESITE_SLAB,
				MSItems.MOSSY_COBBLED_ANDESITE_STAIRS,
				MSItems.MOSSY_COBBLED_ANDESITE_WALL,
				Items.POLISHED_ANDESITE,
				MSItems.ANDESITE_BRICKS,
				MSItems.ANDESITE_BRICK_SLAB,
				MSItems.ANDESITE_BRICK_STAIRS,
				MSItems.ANDESITE_BRICK_WALL,
				MSItems.CRACKED_ANDESITE_BRICKS,
				MSItems.CRACKED_ANDESITE_BRICK_SLAB,
				MSItems.CRACKED_ANDESITE_BRICK_STAIRS,
				MSItems.CRACKED_ANDESITE_BRICK_WALL,
				MSItems.MOSSY_ANDESITE_BRICKS,
				MSItems.MOSSY_ANDESITE_BRICK_SLAB,
				MSItems.MOSSY_ANDESITE_BRICK_STAIRS,
				MSItems.MOSSY_ANDESITE_BRICK_WALL,
				MSItems.CRACKED_MOSSY_ANDESITE_BRICKS,
				MSItems.CRACKED_MOSSY_ANDESITE_BRICK_SLAB,
				MSItems.CRACKED_MOSSY_ANDESITE_BRICK_STAIRS,
				MSItems.CRACKED_MOSSY_ANDESITE_BRICK_WALL);
		
		deepslate(exp);
		
		tuff(exp);
		
		bricks(exp,
				Items.BRICKS,
				MSItems.CRACKED_BRICKS,
				MSItems.CRACKED_BRICK_SLAB,
				MSItems.CRACKED_BRICK_STAIRS,
				MSItems.CRACKED_BRICK_WALL,
				MSItems.MOSSY_BRICKS,
				MSItems.MOSSY_BRICK_SLAB,
				MSItems.MOSSY_BRICK_STAIRS,
				MSItems.MOSSY_BRICK_WALL,
				MSItems.CRACKED_MOSSY_BRICKS,
				MSItems.CRACKED_MOSSY_BRICK_SLAB,
				MSItems.CRACKED_MOSSY_BRICK_STAIRS,
				MSItems.CRACKED_MOSSY_BRICK_WALL);
		
		bricks(exp,
				Items.MUD_BRICKS,
				MSItems.CRACKED_MUD_BRICKS,
				MSItems.CRACKED_MUD_BRICK_SLAB,
				MSItems.CRACKED_MUD_BRICK_STAIRS,
				MSItems.CRACKED_MUD_BRICK_WALL,
				MSItems.MOSSY_MUD_BRICKS,
				MSItems.MOSSY_MUD_BRICK_SLAB,
				MSItems.MOSSY_MUD_BRICK_STAIRS,
				MSItems.MOSSY_MUD_BRICK_WALL,
				MSItems.CRACKED_MOSSY_MUD_BRICKS,
				MSItems.CRACKED_MOSSY_MUD_BRICK_SLAB,
				MSItems.CRACKED_MOSSY_MUD_BRICK_STAIRS,
				MSItems.CRACKED_MOSSY_MUD_BRICK_WALL);
		
		bricks(exp,
				Items.SMOOTH_SANDSTONE,
				MSItems.SANDSTONE_BRICKS,
				MSItems.SANDSTONE_BRICK_SLAB,
				MSItems.SANDSTONE_BRICK_STAIRS,
				MSItems.SANDSTONE_BRICK_WALL,
				MSItems.CRACKED_SANDSTONE_BRICKS,
				MSItems.CRACKED_SANDSTONE_BRICK_SLAB,
				MSItems.CRACKED_SANDSTONE_BRICK_STAIRS,
				MSItems.CRACKED_SANDSTONE_BRICK_WALL,
				MSItems.MOSSY_SANDSTONE_BRICKS,
				MSItems.MOSSY_SANDSTONE_BRICK_SLAB,
				MSItems.MOSSY_SANDSTONE_BRICK_STAIRS,
				MSItems.MOSSY_SANDSTONE_BRICK_WALL,
				MSItems.CRACKED_MOSSY_SANDSTONE_BRICKS,
				MSItems.CRACKED_MOSSY_SANDSTONE_BRICK_SLAB,
				MSItems.CRACKED_MOSSY_SANDSTONE_BRICK_STAIRS,
				MSItems.CRACKED_MOSSY_SANDSTONE_BRICK_WALL);
		
		bricks(exp,
				Items.SMOOTH_RED_SANDSTONE,
				MSItems.RED_SANDSTONE_BRICKS,
				MSItems.RED_SANDSTONE_BRICK_SLAB,
				MSItems.RED_SANDSTONE_BRICK_STAIRS,
				MSItems.RED_SANDSTONE_BRICK_WALL,
				MSItems.CRACKED_RED_SANDSTONE_BRICKS,
				MSItems.CRACKED_RED_SANDSTONE_BRICK_SLAB,
				MSItems.CRACKED_RED_SANDSTONE_BRICK_STAIRS,
				MSItems.CRACKED_RED_SANDSTONE_BRICK_WALL,
				MSItems.MOSSY_RED_SANDSTONE_BRICKS,
				MSItems.MOSSY_RED_SANDSTONE_BRICK_SLAB,
				MSItems.MOSSY_RED_SANDSTONE_BRICK_STAIRS,
				MSItems.MOSSY_RED_SANDSTONE_BRICK_WALL,
				MSItems.CRACKED_MOSSY_RED_SANDSTONE_BRICKS,
				MSItems.CRACKED_MOSSY_RED_SANDSTONE_BRICK_SLAB,
				MSItems.CRACKED_MOSSY_RED_SANDSTONE_BRICK_STAIRS,
				MSItems.CRACKED_MOSSY_RED_SANDSTONE_BRICK_WALL);
		
		crackedBricks(exp,
				Items.PRISMARINE_BRICKS,
				MSItems.CRACKED_PRISMARINE_BRICKS,
				MSItems.CRACKED_PRISMARINE_BRICK_SLAB,
				MSItems.CRACKED_PRISMARINE_BRICK_STAIRS,
				MSItems.CRACKED_PRISMARINE_BRICK_WALL);
		
		soulSandstone(exp);
		
		witherBone(exp);
		
		warpedWart(exp);
		
		netherBricks(exp);
		
		netherBricks(exp,
				MSItems.WARPED_WART,
				MSItems.WARPED_NETHER_BRICK,
				MSItems.WARPED_NETHER_BRICKS,
				MSItems.WARPED_NETHER_BRICK_SLAB,
				MSItems.WARPED_NETHER_BRICK_STAIRS,
				MSItems.WARPED_NETHER_BRICK_WALL,
				MSItems.WARPED_NETHER_BRICK_FENCE,
				MSItems.WARPED_NETHER_BRICK_FENCE_GATE,
				MSItems.CRACKED_WARPED_NETHER_BRICKS,
				MSItems.CRACKED_WARPED_NETHER_BRICK_SLAB,
				MSItems.CRACKED_WARPED_NETHER_BRICK_STAIRS,
				MSItems.CRACKED_WARPED_NETHER_BRICK_WALL,
				MSItems.CRACKED_WARPED_NETHER_BRICK_FENCE,
				MSItems.CRACKED_WARPED_NETHER_BRICK_FENCE_GATE,
				MSItems.CHISELED_WARPED_NETHER_BRICKS,
				MSItems.CHISELED_WARPED_NETHER_BRICK_SLAB,
				MSItems.CHISELED_WARPED_NETHER_BRICK_STAIRS,
				MSItems.CHISELED_WARPED_NETHER_BRICK_WALL,
				MSItems.CRACKED_CHISELED_WARPED_NETHER_BRICKS,
				MSItems.CRACKED_CHISELED_WARPED_NETHER_BRICK_SLAB,
				MSItems.CRACKED_CHISELED_WARPED_NETHER_BRICK_STAIRS,
				MSItems.CRACKED_CHISELED_WARPED_NETHER_BRICK_WALL);
		
		netherBricks(exp,
				MSItems.WITHER_BONE_MEAL,
				MSItems.WITHERED_NETHER_BRICK,
				MSItems.WITHERED_NETHER_BRICKS,
				MSItems.WITHERED_NETHER_BRICK_SLAB,
				MSItems.WITHERED_NETHER_BRICK_STAIRS,
				MSItems.WITHERED_NETHER_BRICK_WALL,
				MSItems.WITHERED_NETHER_BRICK_FENCE,
				MSItems.WITHERED_NETHER_BRICK_FENCE_GATE,
				MSItems.CRACKED_WITHERED_NETHER_BRICKS,
				MSItems.CRACKED_WITHERED_NETHER_BRICK_SLAB,
				MSItems.CRACKED_WITHERED_NETHER_BRICK_STAIRS,
				MSItems.CRACKED_WITHERED_NETHER_BRICK_WALL,
				MSItems.CRACKED_WITHERED_NETHER_BRICK_FENCE,
				MSItems.CRACKED_WITHERED_NETHER_BRICK_FENCE_GATE,
				MSItems.CHISELED_WITHERED_NETHER_BRICKS,
				MSItems.CHISELED_WITHERED_NETHER_BRICK_SLAB,
				MSItems.CHISELED_WITHERED_NETHER_BRICK_STAIRS,
				MSItems.CHISELED_WITHERED_NETHER_BRICK_WALL,
				MSItems.CRACKED_CHISELED_WITHERED_NETHER_BRICKS,
				MSItems.CRACKED_CHISELED_WITHERED_NETHER_BRICK_SLAB,
				MSItems.CRACKED_CHISELED_WITHERED_NETHER_BRICK_STAIRS,
				MSItems.CRACKED_CHISELED_WITHERED_NETHER_BRICK_WALL);
		
		netherBricks(exp,
				Items.SOUL_SAND,
				MSItems.SOUL_NETHER_BRICK,
				MSItems.SOUL_NETHER_BRICKS,
				MSItems.SOUL_NETHER_BRICK_SLAB,
				MSItems.SOUL_NETHER_BRICK_STAIRS,
				MSItems.SOUL_NETHER_BRICK_WALL,
				MSItems.SOUL_NETHER_BRICK_FENCE,
				MSItems.SOUL_NETHER_BRICK_FENCE_GATE,
				MSItems.CRACKED_SOUL_NETHER_BRICKS,
				MSItems.CRACKED_SOUL_NETHER_BRICK_SLAB,
				MSItems.CRACKED_SOUL_NETHER_BRICK_STAIRS,
				MSItems.CRACKED_SOUL_NETHER_BRICK_WALL,
				MSItems.CRACKED_SOUL_NETHER_BRICK_FENCE,
				MSItems.CRACKED_SOUL_NETHER_BRICK_FENCE_GATE,
				MSItems.CHISELED_SOUL_NETHER_BRICKS,
				MSItems.CHISELED_SOUL_NETHER_BRICK_SLAB,
				MSItems.CHISELED_SOUL_NETHER_BRICK_STAIRS,
				MSItems.CHISELED_SOUL_NETHER_BRICK_WALL,
				MSItems.CRACKED_CHISELED_SOUL_NETHER_BRICKS,
				MSItems.CRACKED_CHISELED_SOUL_NETHER_BRICK_SLAB,
				MSItems.CRACKED_CHISELED_SOUL_NETHER_BRICK_STAIRS,
				MSItems.CRACKED_CHISELED_SOUL_NETHER_BRICK_WALL);
		
		netherBricks(exp,
				Items.BLAZE_POWDER,
				MSItems.BLAZING_NETHER_BRICK,
				MSItems.BLAZING_NETHER_BRICKS,
				MSItems.BLAZING_NETHER_BRICK_SLAB,
				MSItems.BLAZING_NETHER_BRICK_STAIRS,
				MSItems.BLAZING_NETHER_BRICK_WALL,
				MSItems.BLAZING_NETHER_BRICK_FENCE,
				MSItems.BLAZING_NETHER_BRICK_FENCE_GATE,
				MSItems.CRACKED_BLAZING_NETHER_BRICKS,
				MSItems.CRACKED_BLAZING_NETHER_BRICK_SLAB,
				MSItems.CRACKED_BLAZING_NETHER_BRICK_STAIRS,
				MSItems.CRACKED_BLAZING_NETHER_BRICK_WALL,
				MSItems.CRACKED_BLAZING_NETHER_BRICK_FENCE,
				MSItems.CRACKED_BLAZING_NETHER_BRICK_FENCE_GATE,
				MSItems.CHISELED_BLAZING_NETHER_BRICKS,
				MSItems.CHISELED_BLAZING_NETHER_BRICK_SLAB,
				MSItems.CHISELED_BLAZING_NETHER_BRICK_STAIRS,
				MSItems.CHISELED_BLAZING_NETHER_BRICK_WALL,
				MSItems.CRACKED_CHISELED_BLAZING_NETHER_BRICKS,
				MSItems.CRACKED_CHISELED_BLAZING_NETHER_BRICK_SLAB,
				MSItems.CRACKED_CHISELED_BLAZING_NETHER_BRICK_STAIRS,
				MSItems.CRACKED_CHISELED_BLAZING_NETHER_BRICK_WALL);
		
		netherBricks(exp,
				Items.GLOWSTONE_DUST,
				MSItems.GLOWING_NETHER_BRICK,
				MSItems.GLOWING_NETHER_BRICKS,
				MSItems.GLOWING_NETHER_BRICK_SLAB,
				MSItems.GLOWING_NETHER_BRICK_STAIRS,
				MSItems.GLOWING_NETHER_BRICK_WALL,
				MSItems.GLOWING_NETHER_BRICK_FENCE,
				MSItems.GLOWING_NETHER_BRICK_FENCE_GATE,
				MSItems.CRACKED_GLOWING_NETHER_BRICKS,
				MSItems.CRACKED_GLOWING_NETHER_BRICK_SLAB,
				MSItems.CRACKED_GLOWING_NETHER_BRICK_STAIRS,
				MSItems.CRACKED_GLOWING_NETHER_BRICK_WALL,
				MSItems.CRACKED_GLOWING_NETHER_BRICK_FENCE,
				MSItems.CRACKED_GLOWING_NETHER_BRICK_FENCE_GATE,
				MSItems.CHISELED_GLOWING_NETHER_BRICKS,
				MSItems.CHISELED_GLOWING_NETHER_BRICK_SLAB,
				MSItems.CHISELED_GLOWING_NETHER_BRICK_STAIRS,
				MSItems.CHISELED_GLOWING_NETHER_BRICK_WALL,
				MSItems.CRACKED_CHISELED_GLOWING_NETHER_BRICKS,
				MSItems.CRACKED_CHISELED_GLOWING_NETHER_BRICK_SLAB,
				MSItems.CRACKED_CHISELED_GLOWING_NETHER_BRICK_STAIRS,
				MSItems.CRACKED_CHISELED_GLOWING_NETHER_BRICK_WALL);
		
		netherBricks(exp,
				Items.GHAST_TEAR,
				MSItems.GHASTLY_NETHER_BRICK,
				MSItems.GHASTLY_NETHER_BRICKS,
				MSItems.GHASTLY_NETHER_BRICK_SLAB,
				MSItems.GHASTLY_NETHER_BRICK_STAIRS,
				MSItems.GHASTLY_NETHER_BRICK_WALL,
				MSItems.GHASTLY_NETHER_BRICK_FENCE,
				MSItems.GHASTLY_NETHER_BRICK_FENCE_GATE,
				MSItems.CRACKED_GHASTLY_NETHER_BRICKS,
				MSItems.CRACKED_GHASTLY_NETHER_BRICK_SLAB,
				MSItems.CRACKED_GHASTLY_NETHER_BRICK_STAIRS,
				MSItems.CRACKED_GHASTLY_NETHER_BRICK_WALL,
				MSItems.CRACKED_GHASTLY_NETHER_BRICK_FENCE,
				MSItems.CRACKED_GHASTLY_NETHER_BRICK_FENCE_GATE,
				MSItems.CHISELED_GHASTLY_NETHER_BRICKS,
				MSItems.CHISELED_GHASTLY_NETHER_BRICK_SLAB,
				MSItems.CHISELED_GHASTLY_NETHER_BRICK_STAIRS,
				MSItems.CHISELED_GHASTLY_NETHER_BRICK_WALL,
				MSItems.CRACKED_CHISELED_GHASTLY_NETHER_BRICKS,
				MSItems.CRACKED_CHISELED_GHASTLY_NETHER_BRICK_SLAB,
				MSItems.CRACKED_CHISELED_GHASTLY_NETHER_BRICK_STAIRS,
				MSItems.CRACKED_CHISELED_GHASTLY_NETHER_BRICK_WALL);
		
		crackedBricks(exp,
				Items.END_STONE_BRICKS,
				MSItems.CRACKED_END_STONE_BRICKS,
				MSItems.CRACKED_END_STONE_BRICK_SLAB,
				MSItems.CRACKED_END_STONE_BRICK_STAIRS,
				MSItems.CRACKED_END_STONE_BRICK_WALL);
		
		crackedBricks(exp,
				Items.QUARTZ_BRICKS,
				MSItems.CRACKED_QUARTZ_BRICKS,
				MSItems.CRACKED_QUARTZ_BRICK_SLAB,
				MSItems.CRACKED_QUARTZ_BRICK_STAIRS,
				MSItems.CRACKED_QUARTZ_BRICK_WALL);
	}
	
	private static void defaultUncompactingRecipes(RecipeExporter exp) {
		offerAlternativeShapelessRecipe(exp, RecipeCategory.MISC, Items.BRICK, Items.BRICKS, 4);
		offerAlternativeShapelessRecipe(exp, RecipeCategory.BUILDING_BLOCKS, Items.SAND, Items.SANDSTONE, 4);
		offerAlternativeShapelessRecipe(exp, RecipeCategory.BUILDING_BLOCKS, Items.RED_SAND, Items.RED_SANDSTONE, 4);
		offerAlternativeShapelessRecipe(exp, RecipeCategory.MISC, Items.PRISMARINE_SHARD, Items.PRISMARINE, 4);
		offerAlternativeShapelessRecipe(exp, RecipeCategory.MISC, Items.PRISMARINE_SHARD, Items.PRISMARINE_BRICKS, 9);
		offerAlternativeShapelessRecipe(exp, RecipeCategory.MISC, Items.NETHER_BRICK, Items.NETHER_BRICKS, 4);
		offerAlternativeShapelessRecipe(exp, RecipeCategory.MISC, SSWPItems.RED_NETHER_BRICK, Items.RED_NETHER_BRICKS, 4);
		offerAlternativeShapelessRecipe(exp, RecipeCategory.MISC, Items.QUARTZ, Items.QUARTZ_BLOCK, 4);
		offerAlternativeShapelessRecipe(exp, RecipeCategory.MISC, Items.AMETHYST_SHARD, Items.AMETHYST_BLOCK, 4);
		offerAlternativeShapelessRecipe(exp, RecipeCategory.REDSTONE, Items.STRING, ItemTags.WOOL, 4);
		offerAlternativeShapelessRecipe(exp, RecipeCategory.MISC, Items.CLAY_BALL, Items.CLAY, 4);
		offerAlternativeShapelessRecipe(exp, RecipeCategory.BUILDING_BLOCKS, Items.ICE, Items.PACKED_ICE, 9);
		offerAlternativeShapelessRecipe(exp, RecipeCategory.BUILDING_BLOCKS, Items.PACKED_ICE, Items.BLUE_ICE, 9);
		offerAlternativeShapelessRecipe(exp, RecipeCategory.COMBAT, Items.SNOWBALL, Items.SNOW_BLOCK, 4);
		offerAlternativeShapelessRecipe(exp, RecipeCategory.DECORATIONS, Items.POINTED_DRIPSTONE, Items.DRIPSTONE_BLOCK, 4);
		offerAlternativeShapelessRecipe(exp, RecipeCategory.BREWING, Items.MAGMA_CREAM, Items.MAGMA_BLOCK, 4);
		offerAlternativeShapelessRecipe(exp, RecipeCategory.BREWING, Items.GLOWSTONE_DUST, Items.GLOWSTONE, 4);
		offerAlternativeShapelessRecipe(exp, RecipeCategory.BREWING, Items.NETHER_WART, Items.NETHER_WART_BLOCK, 9);
		offerAlternativeShapelessRecipe(exp, RecipeCategory.FOOD, Items.MELON_SLICE, Items.MELON, 9);
		offerAlternativeShapelessRecipe(exp, RecipeCategory.MISC, Items.RABBIT_HIDE, Items.LEATHER, 4);
		
		offerStonecuttingRecipe(exp, RecipeCategory.MISC, Items.BRICK, Items.BRICKS, 4);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, Items.SAND, Items.SANDSTONE, 4);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, Items.RED_SAND, Items.RED_SANDSTONE, 4);
		offerStonecuttingRecipe(exp, RecipeCategory.MISC, Items.PRISMARINE_SHARD, Items.PRISMARINE, 4);
		offerStonecuttingRecipe(exp, RecipeCategory.MISC, Items.PRISMARINE_SHARD, Items.PRISMARINE_BRICKS, 9);
		offerStonecuttingRecipe(exp, RecipeCategory.MISC, Items.NETHER_BRICK, Items.NETHER_BRICKS, 4);
		offerStonecuttingRecipe(exp, RecipeCategory.MISC, SSWPItems.RED_NETHER_BRICK, Items.RED_NETHER_BRICKS, 4);
		offerStonecuttingRecipe(exp, RecipeCategory.MISC, Items.COAL, Items.COAL_BLOCK, 9);
		offerStonecuttingRecipe(exp, RecipeCategory.MISC, Items.IRON_INGOT, Items.IRON_BLOCK, 9);
		offerStonecuttingRecipe(exp, RecipeCategory.MISC, Items.GOLD_INGOT, Items.GOLD_BLOCK, 9);
		offerStonecuttingRecipe(exp, RecipeCategory.REDSTONE, Items.REDSTONE, Items.REDSTONE_BLOCK, 9);
		offerStonecuttingRecipe(exp, RecipeCategory.MISC, Items.EMERALD, Items.EMERALD_BLOCK, 9);
		offerStonecuttingRecipe(exp, RecipeCategory.MISC, Items.LAPIS_LAZULI, Items.LAPIS_BLOCK, 9);
		offerStonecuttingRecipe(exp, RecipeCategory.MISC, Items.DIAMOND, Items.DIAMOND_BLOCK, 9);
		offerStonecuttingRecipe(exp, RecipeCategory.MISC, Items.NETHERITE_INGOT, Items.NETHERITE_BLOCK, 9);
		offerStonecuttingRecipe(exp, RecipeCategory.MISC, Items.QUARTZ, Items.QUARTZ_BLOCK, 4);
		offerStonecuttingRecipe(exp, RecipeCategory.MISC, Items.AMETHYST_SHARD, Items.AMETHYST_BLOCK, 4);
		offerStonecuttingRecipe(exp, RecipeCategory.MISC, Items.COPPER_INGOT, Items.COPPER_BLOCK, 9);
		offerStonecuttingRecipe(exp, RecipeCategory.MISC, Items.COPPER_INGOT, Items.WAXED_COPPER_BLOCK, 9);
		offerStonecuttingRecipe(exp, RecipeCategory.MISC, Items.CLAY_BALL, Items.CLAY, 4);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, Items.ICE, Items.PACKED_ICE, 9);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, SSWPItems.ICE_SLAB, Items.PACKED_ICE, 18);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, SSWPItems.ICE_STAIRS, Items.PACKED_ICE, 9);
		offerStonecuttingRecipe(exp, RecipeCategory.DECORATIONS, SSWPItems.ICE_WALL, Items.PACKED_ICE, 9);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, Items.PACKED_ICE, Items.BLUE_ICE, 9);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, SSWPItems.PACKED_ICE_SLAB, Items.BLUE_ICE, 18);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, SSWPItems.PACKED_ICE_STAIRS, Items.BLUE_ICE, 9);
		offerStonecuttingRecipe(exp, RecipeCategory.DECORATIONS, SSWPItems.PACKED_ICE_WALL, Items.BLUE_ICE, 9);
		offerStonecuttingRecipe(exp, RecipeCategory.COMBAT, Items.SNOWBALL, Items.SNOW_BLOCK, 4);
		offerStonecuttingRecipe(exp, RecipeCategory.DECORATIONS, Items.POINTED_DRIPSTONE, Items.DRIPSTONE_BLOCK, 4);
		offerStonecuttingRecipe(exp, RecipeCategory.BREWING, Items.MAGMA_CREAM, Items.MAGMA_BLOCK, 4);
		offerStonecuttingRecipe(exp, RecipeCategory.MISC, Items.BONE_MEAL, Items.BONE_BLOCK, 9);
		offerStonecuttingRecipe(exp, RecipeCategory.MISC, Items.RAW_IRON, Items.RAW_IRON_BLOCK, 9);
		offerStonecuttingRecipe(exp, RecipeCategory.MISC, Items.RAW_COPPER, Items.RAW_COPPER_BLOCK, 9);
		offerStonecuttingRecipe(exp, RecipeCategory.MISC, Items.RAW_GOLD, Items.RAW_GOLD_BLOCK, 9);
		offerStonecuttingRecipe(exp, RecipeCategory.BREWING, Items.GLOWSTONE_DUST, Items.GLOWSTONE, 4);
		offerStonecuttingRecipe(exp, RecipeCategory.MISC, Items.IRON_NUGGET, Items.IRON_INGOT, 9);
		offerStonecuttingRecipe(exp, RecipeCategory.MISC, SSWPItems.COPPER_NUGGET, Items.COPPER_INGOT, 9);
		offerStonecuttingRecipe(exp, RecipeCategory.MISC, Items.GOLD_NUGGET, Items.GOLD_INGOT, 9);
		offerStonecuttingRecipe(exp, RecipeCategory.MISC, SSWPItems.NETHERITE_NUGGET, Items.NETHERITE_INGOT, 9);
	}
	
	private static void stone(RecipeExporter exp) {
		offerCombineWithMossRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_STONE, Items.STONE);
		offerSlabRecipe(exp, MSItems.MOSSY_STONE_SLAB, MSItems.MOSSY_STONE);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_STONE_SLAB, MSItems.MOSSY_STONE, 2);
		offerStairsRecipe(exp, MSItems.MOSSY_STONE_STAIRS, MSItems.MOSSY_STONE);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_STONE_STAIRS, MSItems.MOSSY_STONE);
		offerWallRecipe(exp, MSItems.MOSSY_STONE_WALL, MSItems.MOSSY_STONE);
		offerStonecuttingRecipe(exp, RecipeCategory.DECORATIONS, MSItems.MOSSY_STONE_WALL, MSItems.MOSSY_STONE);
		
		offerAlternative2x2Recipe(exp, RecipeCategory.BUILDING_BLOCKS, Items.MOSSY_STONE_BRICKS, MSItems.MOSSY_STONE);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, Items.MOSSY_STONE_BRICKS, MSItems.MOSSY_STONE);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, Items.MOSSY_STONE_BRICK_SLAB, MSItems.MOSSY_STONE, 2);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, Items.MOSSY_STONE_BRICK_STAIRS, MSItems.MOSSY_STONE);
		offerStonecuttingRecipe(exp, RecipeCategory.DECORATIONS, Items.MOSSY_STONE_BRICK_WALL, MSItems.MOSSY_STONE);
		
		offerCombineWithMossRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_STONE_BRICKS, Items.CRACKED_STONE_BRICKS);
		offerSlabRecipe(exp, MSItems.CRACKED_MOSSY_STONE_BRICK_SLAB, MSItems.CRACKED_MOSSY_STONE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_STONE_BRICK_SLAB, MSItems.CRACKED_MOSSY_STONE_BRICKS, 2);
		offerStairsRecipe(exp, MSItems.CRACKED_MOSSY_STONE_BRICK_STAIRS, MSItems.CRACKED_MOSSY_STONE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_STONE_BRICK_STAIRS, MSItems.CRACKED_MOSSY_STONE_BRICKS);
		offerWallRecipe(exp, MSItems.CRACKED_MOSSY_STONE_BRICK_WALL, MSItems.CRACKED_MOSSY_STONE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.DECORATIONS, MSItems.CRACKED_MOSSY_STONE_BRICK_WALL, MSItems.CRACKED_MOSSY_STONE_BRICKS);
		
		offer2StackedRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_STONE_BRICKS, SSWPItems.CRACKED_STONE_BRICK_SLAB);
		offerAlternativeSmeltingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_STONE_BRICKS, Items.CHISELED_STONE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_STONE_BRICKS, Items.CRACKED_STONE_BRICKS);
		offerSlabRecipe(exp, MSItems.CRACKED_CHISELED_STONE_BRICK_SLAB, MSItems.CRACKED_CHISELED_STONE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_STONE_BRICK_SLAB, MSItems.CRACKED_CHISELED_STONE_BRICKS, 2);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_STONE_BRICK_SLAB, Items.CRACKED_STONE_BRICKS, 2);
		offerStairsRecipe(exp, MSItems.CRACKED_CHISELED_STONE_BRICK_STAIRS, MSItems.CRACKED_CHISELED_STONE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_STONE_BRICK_STAIRS, MSItems.CRACKED_CHISELED_STONE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_STONE_BRICK_STAIRS, Items.CRACKED_STONE_BRICKS);
		offerWallRecipe(exp, MSItems.CRACKED_CHISELED_STONE_BRICK_WALL, MSItems.CRACKED_CHISELED_STONE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.DECORATIONS, MSItems.CRACKED_CHISELED_STONE_BRICK_WALL, MSItems.CRACKED_CHISELED_STONE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.DECORATIONS, MSItems.CRACKED_CHISELED_STONE_BRICK_WALL, Items.CRACKED_STONE_BRICKS);
		
		offer2StackedRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_CHISELED_STONE_BRICKS, Items.MOSSY_STONE_BRICK_SLAB);
		offerAlternativeCombineWithMossRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_CHISELED_STONE_BRICKS, Items.CHISELED_STONE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_CHISELED_STONE_BRICKS, Items.MOSSY_STONE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_CHISELED_STONE_BRICKS, MSItems.MOSSY_STONE);
		offerSlabRecipe(exp, MSItems.MOSSY_CHISELED_STONE_BRICK_SLAB, MSItems.MOSSY_CHISELED_STONE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_CHISELED_STONE_BRICK_SLAB, MSItems.MOSSY_CHISELED_STONE_BRICKS, 2);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_CHISELED_STONE_BRICK_SLAB, Items.MOSSY_STONE_BRICKS, 2);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_CHISELED_STONE_BRICK_SLAB, MSItems.MOSSY_STONE, 2);
		offerStairsRecipe(exp, MSItems.MOSSY_CHISELED_STONE_BRICK_STAIRS, MSItems.MOSSY_CHISELED_STONE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_CHISELED_STONE_BRICK_STAIRS, MSItems.MOSSY_CHISELED_STONE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_CHISELED_STONE_BRICK_STAIRS, Items.MOSSY_STONE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_CHISELED_STONE_BRICK_STAIRS, MSItems.MOSSY_STONE);
		offerWallRecipe(exp, MSItems.MOSSY_CHISELED_STONE_BRICK_WALL, MSItems.MOSSY_CHISELED_STONE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.DECORATIONS, MSItems.MOSSY_CHISELED_STONE_BRICK_WALL, MSItems.MOSSY_CHISELED_STONE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.DECORATIONS, MSItems.MOSSY_CHISELED_STONE_BRICK_WALL, Items.MOSSY_STONE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.DECORATIONS, MSItems.MOSSY_CHISELED_STONE_BRICK_WALL, MSItems.MOSSY_STONE);
		
		offer2StackedRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_CHISELED_STONE_BRICKS, MSItems.CRACKED_MOSSY_STONE_BRICK_SLAB);
		offerAlternativeCombineWithMossRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_CHISELED_STONE_BRICKS, MSItems.CRACKED_CHISELED_STONE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_CHISELED_STONE_BRICKS, MSItems.CRACKED_MOSSY_STONE_BRICKS);
		offerSlabRecipe(exp, MSItems.CRACKED_MOSSY_CHISELED_STONE_BRICK_SLAB, MSItems.CRACKED_MOSSY_CHISELED_STONE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_CHISELED_STONE_BRICK_SLAB, MSItems.CRACKED_MOSSY_CHISELED_STONE_BRICKS, 2);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_CHISELED_STONE_BRICK_SLAB, MSItems.CRACKED_MOSSY_STONE_BRICKS, 2);
		offerStairsRecipe(exp, MSItems.CRACKED_MOSSY_CHISELED_STONE_BRICK_STAIRS, MSItems.CRACKED_MOSSY_CHISELED_STONE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_CHISELED_STONE_BRICK_STAIRS, MSItems.CRACKED_MOSSY_CHISELED_STONE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_CHISELED_STONE_BRICK_STAIRS, MSItems.CRACKED_MOSSY_STONE_BRICKS);
		offerWallRecipe(exp, MSItems.CRACKED_MOSSY_CHISELED_STONE_BRICK_WALL, MSItems.CRACKED_MOSSY_CHISELED_STONE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.DECORATIONS, MSItems.CRACKED_MOSSY_CHISELED_STONE_BRICK_WALL, MSItems.CRACKED_MOSSY_CHISELED_STONE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.DECORATIONS, MSItems.CRACKED_MOSSY_CHISELED_STONE_BRICK_WALL, MSItems.CRACKED_MOSSY_STONE_BRICKS);
	}
	
	private static void igneous(RecipeExporter exp,
			ItemConvertible base,
			ItemConvertible mossy,
			ItemConvertible mossySlab,
			ItemConvertible mossyStairs,
			ItemConvertible mossyWall,
			ItemConvertible cobbled,
			ItemConvertible cobbledSlab,
			ItemConvertible cobbledStairs,
			ItemConvertible cobbledWall,
			ItemConvertible mossyCobbled,
			ItemConvertible mossyCobbledSlab,
			ItemConvertible mossyCobbledStairs,
			ItemConvertible mossyCobbledWall,
			ItemConvertible polished,
			ItemConvertible brick,
			ItemConvertible brickSlab,
			ItemConvertible brickStairs,
			ItemConvertible brickWall,
			ItemConvertible crackedBrick,
			ItemConvertible crackedBrickSlab,
			ItemConvertible crackedBrickStairs,
			ItemConvertible crackedBrickWall,
			ItemConvertible mossyBrick,
			ItemConvertible mossyBrickSlab,
			ItemConvertible mossyBrickStairs,
			ItemConvertible mossyBrickWall,
			ItemConvertible crackedMossyBrick,
			ItemConvertible crackedMossyBrickSlab,
			ItemConvertible crackedMossyBrickStairs,
			ItemConvertible crackedMossyBrickWall) {
		offerSmeltingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, base, cobbled);
		
		offerCombineWithMossRecipe(exp, RecipeCategory.BUILDING_BLOCKS, mossy, base);
		offerSlabRecipe(exp, mossySlab, mossy);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, mossySlab, mossy);
		offerStairsRecipe(exp, mossyStairs, mossy);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, mossyStairs, mossy);
		offerWallRecipe(exp, mossyWall, mossy);
		offerStonecuttingRecipe(exp, RecipeCategory.DECORATIONS, mossyWall, mossy);
		
		offerSlabRecipe(exp, cobbledSlab, cobbled);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, cobbledSlab, cobbled);
		offerStairsRecipe(exp, cobbledStairs, cobbled);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, cobbledStairs, cobbled);
		offerWallRecipe(exp, cobbledWall, cobbled);
		offerStonecuttingRecipe(exp, RecipeCategory.DECORATIONS, cobbledWall, cobbled);
		
		offerCombineWithMossRecipe(exp, RecipeCategory.BUILDING_BLOCKS, mossyCobbled, base);
		offerSlabRecipe(exp, mossyCobbledSlab, mossyCobbled);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, mossyCobbledSlab, mossyCobbled);
		offerStairsRecipe(exp, mossyCobbledStairs, mossyCobbled);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, mossyCobbledStairs, mossyCobbled);
		offerWallRecipe(exp, mossyCobbledWall, mossyCobbled);
		offerStonecuttingRecipe(exp, RecipeCategory.DECORATIONS, mossyCobbledWall, mossyCobbled);
		
		offer2x2Recipe(exp, RecipeCategory.BUILDING_BLOCKS, brick, polished);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, brick, polished);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, brick, base);
		offerSlabRecipe(exp, brickSlab, brick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, brickSlab, brick, 2);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, brickSlab, polished, 2);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, brickSlab, base, 2);
		offerStairsRecipe(exp, brickStairs, brick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, brickStairs, brick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, brickStairs, polished);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, brickStairs, base);
		offerWallRecipe(exp, brickWall, brick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, brickWall, brick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, brickWall, polished);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, brickWall, base);
		
		offerSmeltingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedBrick, brick);
		offerSlabRecipe(exp, crackedBrickSlab, crackedBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedBrickSlab, crackedBrick, 2);
		offerStairsRecipe(exp, crackedBrickStairs, crackedBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedBrickStairs, crackedBrick);
		offerWallRecipe(exp, crackedBrickWall, crackedBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedBrickWall, crackedBrick);
		
		offerCombineWithMossRecipe(exp, RecipeCategory.BUILDING_BLOCKS, mossyBrick, brick);
		offerSlabRecipe(exp, mossyBrickSlab, mossyBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, mossyBrickSlab, mossyBrick, 2);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, mossyBrickSlab, mossy, 2);
		offerStairsRecipe(exp, mossyBrickStairs, mossyBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, mossyBrickStairs, mossyBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, mossyBrickStairs, mossy);
		offerWallRecipe(exp, mossyBrickWall, mossyBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, mossyBrickWall, mossyBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, mossyBrickWall, mossy);
		
		offerCombineWithMossRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedMossyBrick, crackedBrick);
		offerSlabRecipe(exp, crackedMossyBrickSlab, crackedMossyBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedMossyBrickSlab, crackedMossyBrick, 2);
		offerStairsRecipe(exp, crackedMossyBrickStairs, crackedMossyBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedMossyBrickStairs, crackedMossyBrick);
		offerWallRecipe(exp, crackedMossyBrickWall, crackedMossyBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedMossyBrickWall, crackedMossyBrick);
	}
	
	private static void deepslate(RecipeExporter exp) {
		offerCombineWithMossRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_DEEPSLATE, Items.DEEPSLATE);
		offerSlabRecipe(exp, MSItems.MOSSY_DEEPSLATE_SLAB, MSItems.MOSSY_DEEPSLATE);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_DEEPSLATE_SLAB, MSItems.MOSSY_DEEPSLATE, 2);
		offerStairsRecipe(exp, MSItems.MOSSY_DEEPSLATE_STAIRS, MSItems.MOSSY_DEEPSLATE);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_DEEPSLATE_STAIRS, MSItems.MOSSY_DEEPSLATE);
		offerWallRecipe(exp, MSItems.MOSSY_DEEPSLATE_WALL, MSItems.MOSSY_DEEPSLATE);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_DEEPSLATE_WALL, MSItems.MOSSY_DEEPSLATE);
		
		offerCombineWithMossRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_COBBLED_DEEPSLATE, Items.COBBLED_DEEPSLATE);
		offerSlabRecipe(exp, MSItems.MOSSY_COBBLED_DEEPSLATE_SLAB, MSItems.MOSSY_COBBLED_DEEPSLATE);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_COBBLED_DEEPSLATE_SLAB, MSItems.MOSSY_COBBLED_DEEPSLATE, 2);
		offerStairsRecipe(exp, MSItems.MOSSY_COBBLED_DEEPSLATE_STAIRS, MSItems.MOSSY_COBBLED_DEEPSLATE);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_COBBLED_DEEPSLATE_STAIRS, MSItems.MOSSY_COBBLED_DEEPSLATE);
		offerWallRecipe(exp, MSItems.MOSSY_COBBLED_DEEPSLATE_WALL, MSItems.MOSSY_COBBLED_DEEPSLATE);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_COBBLED_DEEPSLATE_WALL, MSItems.MOSSY_COBBLED_DEEPSLATE);
		
		offerCombineWithMossRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_DEEPSLATE_BRICKS, Items.DEEPSLATE_BRICKS);
		offerSlabRecipe(exp, MSItems.MOSSY_DEEPSLATE_BRICK_SLAB, MSItems.MOSSY_DEEPSLATE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_DEEPSLATE_BRICK_SLAB, MSItems.MOSSY_DEEPSLATE_BRICKS, 2);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_DEEPSLATE_BRICK_SLAB, MSItems.MOSSY_COBBLED_DEEPSLATE, 2);
		offerStairsRecipe(exp, MSItems.MOSSY_DEEPSLATE_BRICK_STAIRS, MSItems.MOSSY_DEEPSLATE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_DEEPSLATE_BRICK_STAIRS, MSItems.MOSSY_DEEPSLATE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_DEEPSLATE_BRICK_STAIRS, MSItems.MOSSY_COBBLED_DEEPSLATE);
		offerWallRecipe(exp, MSItems.MOSSY_DEEPSLATE_BRICK_WALL, MSItems.MOSSY_DEEPSLATE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_DEEPSLATE_BRICK_WALL, MSItems.MOSSY_DEEPSLATE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_DEEPSLATE_BRICK_WALL, MSItems.MOSSY_COBBLED_DEEPSLATE);
		
		offerCombineWithMossRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_DEEPSLATE_BRICKS, Items.CRACKED_DEEPSLATE_BRICKS);
		offerSlabRecipe(exp, MSItems.CRACKED_MOSSY_DEEPSLATE_BRICK_SLAB, MSItems.CRACKED_MOSSY_DEEPSLATE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_DEEPSLATE_BRICK_SLAB, MSItems.CRACKED_MOSSY_DEEPSLATE_BRICKS, 2);
		offerStairsRecipe(exp, MSItems.CRACKED_MOSSY_DEEPSLATE_BRICK_STAIRS, MSItems.CRACKED_MOSSY_DEEPSLATE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_DEEPSLATE_BRICK_STAIRS, MSItems.CRACKED_MOSSY_DEEPSLATE_BRICKS);
		offerWallRecipe(exp, MSItems.CRACKED_MOSSY_DEEPSLATE_BRICK_WALL, MSItems.CRACKED_MOSSY_DEEPSLATE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_DEEPSLATE_BRICK_WALL, MSItems.CRACKED_MOSSY_DEEPSLATE_BRICKS);
		
		offerCombineWithMossRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_DEEPSLATE_TILES, Items.DEEPSLATE_TILES);
		offerAlternative2x2Recipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_DEEPSLATE_TILES, MSItems.MOSSY_DEEPSLATE_BRICKS);
		offerSlabRecipe(exp, MSItems.MOSSY_DEEPSLATE_TILE_SLAB, MSItems.MOSSY_DEEPSLATE_TILES);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_DEEPSLATE_TILE_SLAB, MSItems.MOSSY_DEEPSLATE_TILES, 2);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_DEEPSLATE_TILE_SLAB, MSItems.MOSSY_DEEPSLATE_BRICKS, 2);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_DEEPSLATE_TILE_SLAB, MSItems.MOSSY_COBBLED_DEEPSLATE, 2);
		offerStairsRecipe(exp, MSItems.MOSSY_DEEPSLATE_TILE_STAIRS, MSItems.MOSSY_DEEPSLATE_TILES);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_DEEPSLATE_TILE_STAIRS, MSItems.MOSSY_DEEPSLATE_TILES);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_DEEPSLATE_TILE_STAIRS, MSItems.MOSSY_DEEPSLATE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_DEEPSLATE_TILE_STAIRS, MSItems.MOSSY_COBBLED_DEEPSLATE);
		offerWallRecipe(exp, MSItems.MOSSY_DEEPSLATE_TILE_WALL, MSItems.MOSSY_DEEPSLATE_TILES);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_DEEPSLATE_TILE_WALL, MSItems.MOSSY_DEEPSLATE_TILES);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_DEEPSLATE_TILE_WALL, MSItems.MOSSY_DEEPSLATE_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_DEEPSLATE_TILE_WALL, MSItems.MOSSY_COBBLED_DEEPSLATE);
		
		offerCombineWithMossRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_DEEPSLATE_TILES, Items.CRACKED_DEEPSLATE_TILES);
		offerAlternative2x2Recipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_DEEPSLATE_TILES, MSItems.CRACKED_MOSSY_DEEPSLATE_BRICKS);
		offerSlabRecipe(exp, MSItems.CRACKED_MOSSY_DEEPSLATE_TILE_SLAB, MSItems.CRACKED_MOSSY_DEEPSLATE_TILES);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_DEEPSLATE_TILE_SLAB, MSItems.CRACKED_MOSSY_DEEPSLATE_TILES, 2);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_DEEPSLATE_TILE_SLAB, MSItems.CRACKED_MOSSY_DEEPSLATE_BRICKS, 2);
		offerStairsRecipe(exp, MSItems.CRACKED_MOSSY_DEEPSLATE_TILE_STAIRS, MSItems.CRACKED_MOSSY_DEEPSLATE_TILES);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_DEEPSLATE_TILE_STAIRS, MSItems.CRACKED_MOSSY_DEEPSLATE_TILES);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_DEEPSLATE_TILE_STAIRS, MSItems.CRACKED_MOSSY_DEEPSLATE_BRICKS);
		offerWallRecipe(exp, MSItems.CRACKED_MOSSY_DEEPSLATE_TILE_WALL, MSItems.CRACKED_MOSSY_DEEPSLATE_TILES);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_DEEPSLATE_TILE_WALL, MSItems.CRACKED_MOSSY_DEEPSLATE_TILES);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_DEEPSLATE_TILE_WALL, MSItems.CRACKED_MOSSY_DEEPSLATE_BRICKS);
	}
	
	private static void tuff(RecipeExporter exp) {
		offerCombineWithMossRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_TUFF, Items.TUFF);
		offerSlabRecipe(exp, MSItems.MOSSY_TUFF_SLAB, MSItems.MOSSY_TUFF);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_TUFF_SLAB, MSItems.MOSSY_TUFF, 2);
		offerStairsRecipe(exp, MSItems.MOSSY_TUFF_STAIRS, MSItems.MOSSY_TUFF);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_TUFF_STAIRS, MSItems.MOSSY_TUFF);
		offerWallRecipe(exp, MSItems.MOSSY_TUFF_WALL, MSItems.MOSSY_TUFF);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_TUFF_WALL, MSItems.MOSSY_TUFF);
		
		offerSmeltingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_TUFF_BRICKS, Items.TUFF_BRICKS);
		offerSlabRecipe(exp, MSItems.CRACKED_TUFF_BRICK_SLAB, MSItems.CRACKED_TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_TUFF_BRICK_SLAB, MSItems.CRACKED_TUFF_BRICKS, 2);
		offerStairsRecipe(exp, MSItems.CRACKED_TUFF_BRICK_STAIRS, MSItems.CRACKED_TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_TUFF_BRICK_STAIRS, MSItems.CRACKED_TUFF_BRICKS);
		offerWallRecipe(exp, MSItems.CRACKED_TUFF_BRICK_WALL, MSItems.CRACKED_TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_TUFF_BRICK_WALL, MSItems.CRACKED_TUFF_BRICKS);
		
		offerCombineWithMossRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_TUFF_BRICKS, Items.TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_TUFF_BRICKS, MSItems.MOSSY_TUFF);
		offerSlabRecipe(exp, MSItems.MOSSY_TUFF_BRICK_SLAB, MSItems.MOSSY_TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_TUFF_BRICK_SLAB, MSItems.MOSSY_TUFF_BRICKS, 2);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_TUFF_BRICK_SLAB, MSItems.MOSSY_TUFF, 2);
		offerStairsRecipe(exp, MSItems.MOSSY_TUFF_BRICK_STAIRS, MSItems.MOSSY_TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_TUFF_BRICK_STAIRS, MSItems.MOSSY_TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_TUFF_BRICK_STAIRS, MSItems.MOSSY_TUFF);
		offerWallRecipe(exp, MSItems.MOSSY_TUFF_BRICK_WALL, MSItems.MOSSY_TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_TUFF_BRICK_WALL, MSItems.MOSSY_TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_TUFF_BRICK_WALL, MSItems.MOSSY_TUFF);
		
		offerCombineWithMossRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_TUFF_BRICKS, MSItems.CRACKED_TUFF_BRICKS);
		offerSlabRecipe(exp, MSItems.CRACKED_MOSSY_TUFF_BRICK_SLAB, MSItems.CRACKED_MOSSY_TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_TUFF_BRICK_SLAB, MSItems.CRACKED_MOSSY_TUFF_BRICKS, 2);
		offerStairsRecipe(exp, MSItems.CRACKED_MOSSY_TUFF_BRICK_STAIRS, MSItems.CRACKED_MOSSY_TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_TUFF_BRICK_STAIRS, MSItems.CRACKED_MOSSY_TUFF_BRICKS);
		offerWallRecipe(exp, MSItems.CRACKED_MOSSY_TUFF_BRICK_WALL, MSItems.CRACKED_MOSSY_TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_TUFF_BRICK_WALL, MSItems.CRACKED_MOSSY_TUFF_BRICKS);
		
		offer2StackedRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_TUFF_BRICKS, MSItems.CRACKED_TUFF_BRICKS);
		offerAlternativeSmeltingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_TUFF_BRICKS, Items.CHISELED_TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_TUFF_BRICKS, MSItems.CRACKED_TUFF_BRICKS);
		offerSlabRecipe(exp, MSItems.CRACKED_CHISELED_TUFF_BRICK_SLAB, MSItems.CRACKED_CHISELED_TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_TUFF_BRICK_SLAB, MSItems.CRACKED_CHISELED_TUFF_BRICKS, 2);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_TUFF_BRICK_SLAB, MSItems.CRACKED_TUFF_BRICKS, 2);
		offerStairsRecipe(exp, MSItems.CRACKED_CHISELED_TUFF_BRICK_STAIRS, MSItems.CRACKED_CHISELED_TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_TUFF_BRICK_STAIRS, MSItems.CRACKED_CHISELED_TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_TUFF_BRICK_STAIRS, MSItems.CRACKED_TUFF_BRICKS);
		offerWallRecipe(exp, MSItems.CRACKED_CHISELED_TUFF_BRICK_WALL, MSItems.CRACKED_CHISELED_TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_TUFF_BRICK_WALL, MSItems.CRACKED_TUFF_BRICKS);
		
		offer2StackedRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_CHISELED_TUFF_BRICKS, MSItems.MOSSY_TUFF_BRICKS);
		offerAlternativeCombineWithMossRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_CHISELED_TUFF_BRICKS, Items.CHISELED_TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_CHISELED_TUFF_BRICKS, MSItems.MOSSY_TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_CHISELED_TUFF_BRICKS, MSItems.MOSSY_TUFF);
		offerSlabRecipe(exp, MSItems.MOSSY_CHISELED_TUFF_BRICK_SLAB, MSItems.MOSSY_CHISELED_TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_CHISELED_TUFF_BRICK_SLAB, MSItems.MOSSY_CHISELED_TUFF_BRICKS, 2);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_CHISELED_TUFF_BRICK_SLAB, MSItems.MOSSY_TUFF_BRICKS, 2);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_CHISELED_TUFF_BRICK_SLAB, MSItems.MOSSY_TUFF, 2);
		offerStairsRecipe(exp, MSItems.MOSSY_CHISELED_TUFF_BRICK_STAIRS, MSItems.MOSSY_CHISELED_TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_CHISELED_TUFF_BRICK_STAIRS, MSItems.MOSSY_CHISELED_TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_CHISELED_TUFF_BRICK_STAIRS, MSItems.MOSSY_TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_CHISELED_TUFF_BRICK_STAIRS, MSItems.MOSSY_TUFF);
		offerWallRecipe(exp, MSItems.MOSSY_CHISELED_TUFF_BRICK_WALL, MSItems.MOSSY_CHISELED_TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_CHISELED_TUFF_BRICK_WALL, MSItems.MOSSY_CHISELED_TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_CHISELED_TUFF_BRICK_WALL, MSItems.MOSSY_TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.MOSSY_CHISELED_TUFF_BRICK_WALL, MSItems.MOSSY_TUFF);
		
		offer2StackedRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_CHISELED_TUFF_BRICKS, MSItems.CRACKED_MOSSY_TUFF_BRICKS);
		offerAlternativeCombineWithMossRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_CHISELED_TUFF_BRICKS, MSItems.CRACKED_CHISELED_TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_CHISELED_TUFF_BRICKS, MSItems.CRACKED_MOSSY_TUFF_BRICKS);
		offerSlabRecipe(exp, MSItems.CRACKED_MOSSY_CHISELED_TUFF_BRICK_SLAB, MSItems.CRACKED_MOSSY_CHISELED_TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_CHISELED_TUFF_BRICK_SLAB, MSItems.CRACKED_MOSSY_CHISELED_TUFF_BRICKS, 2);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_CHISELED_TUFF_BRICK_SLAB, MSItems.CRACKED_MOSSY_TUFF_BRICKS, 2);
		offerStairsRecipe(exp, MSItems.CRACKED_MOSSY_CHISELED_TUFF_BRICK_STAIRS, MSItems.CRACKED_MOSSY_CHISELED_TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_CHISELED_TUFF_BRICK_STAIRS, MSItems.CRACKED_MOSSY_CHISELED_TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_CHISELED_TUFF_BRICK_STAIRS, MSItems.CRACKED_MOSSY_TUFF_BRICKS);
		offerWallRecipe(exp, MSItems.CRACKED_MOSSY_CHISELED_TUFF_BRICK_WALL, MSItems.CRACKED_MOSSY_CHISELED_TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_CHISELED_TUFF_BRICK_WALL, MSItems.CRACKED_MOSSY_CHISELED_TUFF_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_MOSSY_CHISELED_TUFF_BRICK_WALL, MSItems.CRACKED_MOSSY_TUFF_BRICKS);
	}
	
	private static void bricks(RecipeExporter exp,
			ItemConvertible base,
			ItemConvertible brick,
			ItemConvertible brickSlab,
			ItemConvertible brickStairs,
			ItemConvertible brickWall,
			ItemConvertible crackedBrick,
			ItemConvertible crackedBrickSlab,
			ItemConvertible crackedBrickStairs,
			ItemConvertible crackedBrickWall,
			ItemConvertible mossyBrick,
			ItemConvertible mossyBrickSlab,
			ItemConvertible mossyBrickStairs,
			ItemConvertible mossyBrickWall,
			ItemConvertible crackedMossyBrick,
			ItemConvertible crackedMossyBrickSlab,
			ItemConvertible crackedMossyBrickStairs,
			ItemConvertible crackedMossyBrickWall) {
		offer2x2Recipe(exp, RecipeCategory.BUILDING_BLOCKS, brick, base);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, brick, base);
		offerSlabRecipe(exp, brickSlab, brick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, brickSlab, brick, 2);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, brickSlab, base, 2);
		offerStairsRecipe(exp, brickStairs, brick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, brickStairs, brick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, brickStairs, base);
		offerWallRecipe(exp, brickWall, brick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, brickWall, brick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, brickWall, base);
		
		offerSmeltingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedBrick, brick);
		offerSlabRecipe(exp, crackedBrickSlab, crackedBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedBrickSlab, crackedBrick, 2);
		offerStairsRecipe(exp, crackedBrickStairs, crackedBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedBrickStairs, crackedBrick);
		offerWallRecipe(exp, crackedBrickWall, crackedBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedBrickWall, crackedBrick);
		
		offerCombineWithMossRecipe(exp, RecipeCategory.BUILDING_BLOCKS, mossyBrick, brick);
		offerSlabRecipe(exp, mossyBrickSlab, mossyBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, mossyBrickSlab, mossyBrick, 2);
		offerStairsRecipe(exp, mossyBrickStairs, mossyBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, mossyBrickStairs, mossyBrick);
		offerWallRecipe(exp, mossyBrickWall, mossyBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, mossyBrickWall, mossyBrick);
		
		offerCombineWithMossRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedMossyBrick, crackedBrick);
		offerSlabRecipe(exp, crackedMossyBrickSlab, crackedMossyBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedMossyBrickSlab, crackedMossyBrick, 2);
		offerStairsRecipe(exp, crackedMossyBrickStairs, crackedMossyBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedMossyBrickStairs, crackedMossyBrick);
		offerWallRecipe(exp, crackedMossyBrickWall, crackedMossyBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedMossyBrickWall, crackedMossyBrick);
	}
	
	private static void bricks(RecipeExporter exp,
			ItemConvertible brick,
			ItemConvertible crackedBrick,
			ItemConvertible crackedBrickSlab,
			ItemConvertible crackedBrickStairs,
			ItemConvertible crackedBrickWall,
			ItemConvertible mossyBrick,
			ItemConvertible mossyBrickSlab,
			ItemConvertible mossyBrickStairs,
			ItemConvertible mossyBrickWall,
			ItemConvertible crackedMossyBrick,
			ItemConvertible crackedMossyBrickSlab,
			ItemConvertible crackedMossyBrickStairs,
			ItemConvertible crackedMossyBrickWall) {
		offerSmeltingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedBrick, brick);
		offerSlabRecipe(exp, crackedBrickSlab, crackedBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedBrickSlab, crackedBrick, 2);
		offerStairsRecipe(exp, crackedBrickStairs, crackedBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedBrickStairs, crackedBrick);
		offerWallRecipe(exp, crackedBrickWall, crackedBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedBrickWall, crackedBrick);
		
		offerCombineWithMossRecipe(exp, RecipeCategory.BUILDING_BLOCKS, mossyBrick, brick);
		offerSlabRecipe(exp, mossyBrickSlab, mossyBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, mossyBrickSlab, mossyBrick, 2);
		offerStairsRecipe(exp, mossyBrickStairs, mossyBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, mossyBrickStairs, mossyBrick);
		offerWallRecipe(exp, mossyBrickWall, mossyBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, mossyBrickWall, mossyBrick);
		
		offerCombineWithMossRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedMossyBrick, crackedBrick);
		offerSlabRecipe(exp, crackedMossyBrickSlab, crackedMossyBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedMossyBrickSlab, crackedMossyBrick, 2);
		offerStairsRecipe(exp, crackedMossyBrickStairs, crackedMossyBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedMossyBrickStairs, crackedMossyBrick);
		offerWallRecipe(exp, crackedMossyBrickWall, crackedMossyBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedMossyBrickWall, crackedMossyBrick);
	}
	
	@SuppressWarnings("unused")
	private static void bricks(RecipeExporter exp,
			ItemConvertible base,
			ItemConvertible brick,
			ItemConvertible brickSlab,
			ItemConvertible brickStairs,
			ItemConvertible brickWall,
			ItemConvertible crackedBrick,
			ItemConvertible crackedBrickSlab,
			ItemConvertible crackedBrickStairs,
			ItemConvertible crackedBrickWall) {
		offer2x2Recipe(exp, RecipeCategory.BUILDING_BLOCKS, brick, base);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, brick, base);
		offerSlabRecipe(exp, brickSlab, brick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, brickSlab, brick, 2);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, brickSlab, base, 2);
		offerStairsRecipe(exp, brickStairs, brick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, brickStairs, brick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, brickStairs, base);
		offerWallRecipe(exp, brickWall, brick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, brickWall, brick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, brickWall, base);
		
		offerSmeltingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedBrick, brick);
		offerSlabRecipe(exp, crackedBrickSlab, crackedBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedBrickSlab, crackedBrick, 2);
		offerStairsRecipe(exp, crackedBrickStairs, crackedBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedBrickStairs, crackedBrick);
		offerWallRecipe(exp, crackedBrickWall, crackedBrick);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedBrickWall, crackedBrick);
	}
	
	private static void crackedBricks(RecipeExporter exp,
			ItemConvertible uncracked,
			ItemConvertible base,
			ItemConvertible slab,
			ItemConvertible stairs,
			ItemConvertible wall) {
		offerSmeltingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, base, uncracked);
		offerSlabRecipe(exp, slab, base);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, slab, base, 2);
		offerStairsRecipe(exp, stairs, base);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, stairs, base);
		offerWallRecipe(exp, wall, base);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, wall, base);
	}
	
	private static void netherBricks(RecipeExporter exp) {
		offer2StackedRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_NETHER_BRICKS, SSWPItems.CRACKED_NETHER_BRICK_SLAB);
		offerAlternativeSmeltingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_NETHER_BRICKS, Items.CHISELED_NETHER_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_NETHER_BRICKS, MSItems.CRACKED_CHISELED_NETHER_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_NETHER_BRICKS, Items.CRACKED_NETHER_BRICKS);
		offerSlabRecipe(exp, MSItems.CRACKED_CHISELED_NETHER_BRICK_SLAB, MSItems.CRACKED_CHISELED_NETHER_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_NETHER_BRICK_SLAB, MSItems.CRACKED_CHISELED_NETHER_BRICKS, 2);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_NETHER_BRICK_SLAB, Items.CRACKED_NETHER_BRICKS, 2);
		offerStairsRecipe(exp, MSItems.CRACKED_CHISELED_NETHER_BRICK_STAIRS, MSItems.CRACKED_CHISELED_NETHER_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_NETHER_BRICK_STAIRS, MSItems.CRACKED_CHISELED_NETHER_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_NETHER_BRICK_STAIRS, Items.CRACKED_NETHER_BRICKS);
		offerWallRecipe(exp, MSItems.CRACKED_CHISELED_NETHER_BRICK_WALL, MSItems.CRACKED_CHISELED_NETHER_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_NETHER_BRICK_WALL, MSItems.CRACKED_CHISELED_NETHER_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_NETHER_BRICK_WALL, Items.CRACKED_NETHER_BRICKS);
		
		offerSmeltingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_RED_NETHER_BRICKS, Items.RED_NETHER_BRICKS);
		offerSlabRecipe(exp, MSItems.CRACKED_RED_NETHER_BRICK_SLAB, MSItems.CRACKED_RED_NETHER_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_RED_NETHER_BRICK_SLAB, MSItems.CRACKED_RED_NETHER_BRICKS, 2);
		offerStairsRecipe(exp, MSItems.CRACKED_RED_NETHER_BRICK_STAIRS, MSItems.CRACKED_RED_NETHER_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_RED_NETHER_BRICK_STAIRS, MSItems.CRACKED_RED_NETHER_BRICKS);
		offerWallRecipe(exp, MSItems.CRACKED_RED_NETHER_BRICK_WALL, MSItems.CRACKED_RED_NETHER_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_RED_NETHER_BRICK_WALL, MSItems.CRACKED_RED_NETHER_BRICKS);
		offerFenceRecipe(exp, MSItems.CRACKED_RED_NETHER_BRICK_FENCE, 6, MSItems.CRACKED_RED_NETHER_BRICKS, SSWPItems.RED_NETHER_BRICK);
		offerFenceGateRecipe(exp, MSItems.CRACKED_RED_NETHER_BRICK_FENCE_GATE, MSItems.CRACKED_RED_NETHER_BRICKS, SSWPItems.RED_NETHER_BRICK);
		
		offer2StackedRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CHISELED_RED_NETHER_BRICKS, Items.RED_NETHER_BRICK_SLAB);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CHISELED_RED_NETHER_BRICKS, Items.RED_NETHER_BRICKS);
		offerSlabRecipe(exp, MSItems.CHISELED_RED_NETHER_BRICK_SLAB, MSItems.CHISELED_RED_NETHER_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CHISELED_RED_NETHER_BRICK_SLAB, MSItems.CHISELED_RED_NETHER_BRICKS, 2);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CHISELED_RED_NETHER_BRICK_SLAB, Items.RED_NETHER_BRICKS, 2);
		offerStairsRecipe(exp, MSItems.CHISELED_RED_NETHER_BRICK_STAIRS, MSItems.CHISELED_RED_NETHER_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CHISELED_RED_NETHER_BRICK_STAIRS, MSItems.CHISELED_RED_NETHER_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CHISELED_RED_NETHER_BRICK_STAIRS, Items.RED_NETHER_BRICKS);
		offerWallRecipe(exp, MSItems.CHISELED_RED_NETHER_BRICK_WALL, MSItems.CHISELED_RED_NETHER_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CHISELED_RED_NETHER_BRICK_WALL, MSItems.CHISELED_RED_NETHER_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CHISELED_RED_NETHER_BRICK_WALL, Items.RED_NETHER_BRICKS);
		
		offer2StackedRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_RED_NETHER_BRICKS, MSItems.CRACKED_RED_NETHER_BRICK_SLAB);
		offerAlternativeSmeltingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_RED_NETHER_BRICKS, MSItems.CHISELED_RED_NETHER_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_RED_NETHER_BRICKS, MSItems.CRACKED_RED_NETHER_BRICKS);
		offerSlabRecipe(exp, MSItems.CRACKED_CHISELED_RED_NETHER_BRICK_SLAB, MSItems.CRACKED_CHISELED_RED_NETHER_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_RED_NETHER_BRICK_SLAB, MSItems.CRACKED_CHISELED_RED_NETHER_BRICKS, 2);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_RED_NETHER_BRICK_SLAB, MSItems.CRACKED_RED_NETHER_BRICKS, 2);
		offerStairsRecipe(exp, MSItems.CRACKED_CHISELED_RED_NETHER_BRICK_STAIRS, MSItems.CRACKED_CHISELED_RED_NETHER_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_RED_NETHER_BRICK_STAIRS, MSItems.CRACKED_CHISELED_RED_NETHER_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_RED_NETHER_BRICK_STAIRS, MSItems.CRACKED_RED_NETHER_BRICKS);
		offerWallRecipe(exp, MSItems.CRACKED_CHISELED_RED_NETHER_BRICK_WALL, MSItems.CRACKED_CHISELED_RED_NETHER_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_RED_NETHER_BRICK_WALL, MSItems.CRACKED_CHISELED_RED_NETHER_BRICKS);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.CRACKED_CHISELED_RED_NETHER_BRICK_WALL, MSItems.CRACKED_RED_NETHER_BRICKS);
	}
	
	private final void netherBricks(RecipeExporter exp,
			ItemConvertible material,
			ItemConvertible item,
			ItemConvertible base,
			ItemConvertible slab,
			ItemConvertible stairs,
			ItemConvertible wall,
			ItemConvertible fence,
			ItemConvertible fenceGate,
			ItemConvertible cracked,
			ItemConvertible crackedSlab,
			ItemConvertible crackedStairs,
			ItemConvertible crackedWall,
			ItemConvertible crackedFence,
			ItemConvertible crackedFenceGate,
			ItemConvertible chiseled,
			ItemConvertible chiseledSlab,
			ItemConvertible chiseledStairs,
			ItemConvertible chiseledWall,
			ItemConvertible crackedChiseled,
			ItemConvertible crackedChiseledSlab,
			ItemConvertible crackedChiseledStairs,
			ItemConvertible crackedChiseledWall) {
		offerShapelessRecipe(exp, RecipeCategory.MISC, item, 2, material, Items.NETHER_BRICK);
		
		offer2x2CheckerboardRecipe(exp, RecipeCategory.BUILDING_BLOCKS, base, material, Items.NETHER_BRICK);
		offerAlternativeReversible2x2CompactingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, RecipeCategory.MISC, base, item);
		offerStonecuttingRecipe(exp, RecipeCategory.MISC, item, base, 4);
		offerSlabRecipe(exp, slab, base);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, slab, base, 2);
		offerStairsRecipe(exp, stairs, base);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, stairs, base);
		offerWallRecipe(exp, wall, base);
		offerStonecuttingRecipe(exp, RecipeCategory.DECORATIONS, wall, base);
		offerFenceRecipe(exp, fence, 6, base, item);
		offerFenceGateRecipe(exp, fenceGate, base, item);
		
		offerSmeltingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, cracked, base);
		offerSlabRecipe(exp, crackedSlab, cracked);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedSlab, cracked, 2);
		offerStairsRecipe(exp, crackedStairs, cracked);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedStairs, cracked);
		offerWallRecipe(exp, crackedWall, cracked);
		offerStonecuttingRecipe(exp, RecipeCategory.DECORATIONS, crackedWall, cracked);
		offerFenceRecipe(exp, crackedFence, 6, cracked, item);
		offerFenceGateRecipe(exp, crackedFenceGate, cracked, item);
		
		offer2StackedRecipe(exp, RecipeCategory.BUILDING_BLOCKS, chiseled, slab);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, chiseled, base);
		offerSlabRecipe(exp, chiseledSlab, chiseled);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, chiseledSlab, chiseled, 2);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, chiseledSlab, base, 2);
		offerStairsRecipe(exp, chiseledStairs, chiseled);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, chiseledStairs, chiseled);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, chiseledStairs, base);
		offerWallRecipe(exp, chiseledWall, chiseled);
		offerStonecuttingRecipe(exp, RecipeCategory.DECORATIONS, chiseledWall, chiseled);
		offerStonecuttingRecipe(exp, RecipeCategory.DECORATIONS, chiseledWall, base);
		
		offer2StackedRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedChiseled, crackedSlab);
		offerAlternativeSmeltingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedChiseled, chiseled);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedChiseled, cracked);
		offerSlabRecipe(exp, crackedChiseledSlab, crackedChiseled);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedChiseledSlab, crackedChiseled, 2);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedChiseledSlab, cracked, 2);
		offerStairsRecipe(exp, crackedChiseledStairs, crackedChiseled);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedChiseledStairs, crackedChiseled);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, crackedChiseledStairs, cracked);
		offerWallRecipe(exp, crackedChiseledWall, crackedChiseled);
		offerStonecuttingRecipe(exp, RecipeCategory.DECORATIONS, crackedChiseledWall, crackedChiseled);
		offerStonecuttingRecipe(exp, RecipeCategory.DECORATIONS, crackedChiseledWall, cracked);
	}
	
	private final void witherBone(RecipeExporter exp) {
		offerShapelessRecipe(exp, RecipeCategory.MISC, MSItems.WITHER_BONE_MEAL, MSItems.WITHER_BONE, 3);
		offerReversible3x3CompactingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, RecipeCategory.MISC, MSItems.WITHER_BONE_BLOCK, MSItems.WITHER_BONE_MEAL);
		offerStonecuttingRecipe(exp, RecipeCategory.MISC, MSItems.WITHER_BONE_MEAL, MSItems.WITHER_BONE_BLOCK, 9);
		
		offerSlabRecipe(exp, MSItems.WITHER_BONE_SLAB, MSItems.WITHER_BONE_BLOCK);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.WITHER_BONE_SLAB, MSItems.WITHER_BONE_BLOCK, 2);
		offerStairsRecipe(exp, MSItems.WITHER_BONE_STAIRS, MSItems.WITHER_BONE_BLOCK);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, MSItems.WITHER_BONE_STAIRS, MSItems.WITHER_BONE_BLOCK);
		offerWallRecipe(exp, MSItems.WITHER_BONE_WALL, MSItems.WITHER_BONE_BLOCK);
		offerStonecuttingRecipe(exp, RecipeCategory.DECORATIONS, MSItems.WITHER_BONE_WALL, MSItems.WITHER_BONE_BLOCK);
	}
	
	private final void warpedWart(RecipeExporter exp) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.WARPED_WART_BLOCK).pattern("###").pattern("###").pattern("###").input('#', MSItems.WARPED_WART).criterion(hasItem(MSItems.WARPED_WART), conditionsFromItem(MSItems.WARPED_WART)).offerTo(exp, Identifier.of(MSMain.MOD_ID, getItemPath(Items.WARPED_WART_BLOCK)));
		offerAlternativeShapelessRecipe(exp, RecipeCategory.BREWING, MSItems.WARPED_WART, Items.WARPED_WART_BLOCK, 9);
	}
	
	private final void soulSandstone(RecipeExporter exp) {
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, SSWPItems.SOUL_SAND_SLAB, MSItems.SOUL_SANDSTONE, 8);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, SSWPItems.SOUL_SAND_STAIRS, MSItems.SOUL_SANDSTONE, 4);
		offerStonecuttingRecipe(exp, RecipeCategory.DECORATIONS, SSWPItems.SOUL_SAND_WALL, MSItems.SOUL_SANDSTONE, 4);
		
		sandstone(exp,
				Items.SOUL_SAND,
				MSItems.SOUL_SANDSTONE,
				MSItems.SOUL_SANDSTONE_SLAB,
				MSItems.SOUL_SANDSTONE_STAIRS,
				MSItems.SOUL_SANDSTONE_WALL,
				MSItems.CHISELED_SOUL_SANDSTONE,
				MSItems.CHISELED_SOUL_SANDSTONE_SLAB,
				MSItems.CHISELED_SOUL_SANDSTONE_STAIRS,
				MSItems.CHISELED_SOUL_SANDSTONE_WALL,
				MSItems.SMOOTH_SOUL_SANDSTONE,
				MSItems.SMOOTH_SOUL_SANDSTONE_SLAB,
				MSItems.SMOOTH_SOUL_SANDSTONE_STAIRS,
				MSItems.SMOOTH_SOUL_SANDSTONE_WALL,
				MSItems.CUT_SOUL_SANDSTONE,
				MSItems.CUT_SOUL_SANDSTONE_SLAB,
				MSItems.CUT_SOUL_SANDSTONE_STAIRS,
				MSItems.CUT_SOUL_SANDSTONE_WALL,
				MSItems.SOUL_SANDSTONE_BRICKS,
				MSItems.SOUL_SANDSTONE_BRICK_SLAB,
				MSItems.SOUL_SANDSTONE_BRICK_STAIRS,
				MSItems.SOUL_SANDSTONE_BRICK_WALL,
				MSItems.CRACKED_SOUL_SANDSTONE_BRICKS,
				MSItems.CRACKED_SOUL_SANDSTONE_BRICK_SLAB,
				MSItems.CRACKED_SOUL_SANDSTONE_BRICK_STAIRS,
				MSItems.CRACKED_SOUL_SANDSTONE_BRICK_WALL,
				MSItems.MOSSY_SOUL_SANDSTONE_BRICKS,
				MSItems.MOSSY_SOUL_SANDSTONE_BRICK_SLAB,
				MSItems.MOSSY_SOUL_SANDSTONE_BRICK_STAIRS,
				MSItems.MOSSY_SOUL_SANDSTONE_BRICK_WALL,
				MSItems.CRACKED_MOSSY_SOUL_SANDSTONE_BRICKS,
				MSItems.CRACKED_MOSSY_SOUL_SANDSTONE_BRICK_SLAB,
				MSItems.CRACKED_MOSSY_SOUL_SANDSTONE_BRICK_STAIRS,
				MSItems.CRACKED_MOSSY_SOUL_SANDSTONE_BRICK_WALL);
	}
	
	private final void sandstone(RecipeExporter exp,
			ItemConvertible sand,
			ItemConvertible base,
			ItemConvertible slab,
			ItemConvertible stairs,
			ItemConvertible wall,
			ItemConvertible chiseled,
			ItemConvertible chiseledSlab,
			ItemConvertible chiseledStairs,
			ItemConvertible chiseledWall,
			ItemConvertible smooth,
			ItemConvertible smoothSlab,
			ItemConvertible smoothStairs,
			ItemConvertible smoothWall,
			ItemConvertible cut,
			ItemConvertible cutSlab,
			ItemConvertible cutStairs,
			ItemConvertible cutWall,
			ItemConvertible brick,
			ItemConvertible brickSlab,
			ItemConvertible brickStairs,
			ItemConvertible brickWall,
			ItemConvertible crackedBrick,
			ItemConvertible crackedBrickSlab,
			ItemConvertible crackedBrickStairs,
			ItemConvertible crackedBrickWall,
			ItemConvertible mossyBrick,
			ItemConvertible mossyBrickSlab,
			ItemConvertible mossyBrickStairs,
			ItemConvertible mossyBrickWall,
			ItemConvertible crackedMossyBrick,
			ItemConvertible crackedMossyBrickSlab,
			ItemConvertible crackedMossyBrickStairs,
			ItemConvertible crackedMossyBrickWall) {
		offerReversible2x2CompactingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, RecipeCategory.BUILDING_BLOCKS, base, sand);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, Items.SOUL_SAND, MSItems.SOUL_SANDSTONE, 4);
		offerSlabRecipe(exp, slab, base);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, slab, base, 2);
		offerStairsRecipe(exp, stairs, base);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, stairs, base);
		offerWallRecipe(exp, wall, base);
		offerStonecuttingRecipe(exp, RecipeCategory.DECORATIONS, wall, base);
		
		offer2StackedRecipe(exp, RecipeCategory.BUILDING_BLOCKS, chiseled, slab);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, chiseled, base);
		offerSlabRecipe(exp, chiseledSlab, chiseled);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, chiseledSlab, chiseled, 2);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, chiseledSlab, base, 2);
		offerStairsRecipe(exp, chiseledStairs, chiseled);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, chiseledStairs, chiseled);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, chiseledStairs, base);
		offerWallRecipe(exp, chiseledWall, chiseled);
		offerStonecuttingRecipe(exp, RecipeCategory.DECORATIONS, chiseledWall, chiseled);
		offerStonecuttingRecipe(exp, RecipeCategory.DECORATIONS, chiseledWall, base);
		
		offerSmeltingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, smooth, base);
		offerSlabRecipe(exp, smoothSlab, smooth);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, smoothSlab, smooth, 2);
		offerStairsRecipe(exp, smoothStairs, smooth);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, smoothStairs, smooth);
		offerWallRecipe(exp, smoothWall, smooth);
		offerStonecuttingRecipe(exp, RecipeCategory.DECORATIONS, smoothWall, smooth);
		
		offer2x2Recipe(exp, RecipeCategory.BUILDING_BLOCKS, cut, base);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, cut, base);
		offerSlabRecipe(exp, cutSlab, cut);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, cutSlab, cut, 2);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, cutSlab, base, 2);
		offerStairsRecipe(exp, cutStairs, cut);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, cutStairs, cut);
		offerStonecuttingRecipe(exp, RecipeCategory.BUILDING_BLOCKS, cutStairs, base);
		offerWallRecipe(exp, cutWall, cut);
		offerStonecuttingRecipe(exp, RecipeCategory.DECORATIONS, cutWall, cut);
		offerStonecuttingRecipe(exp, RecipeCategory.DECORATIONS, cutWall, base);
		
		bricks(exp,
				smooth,
				brick,
				brickSlab,
				brickStairs,
				brickWall,
				crackedBrick,
				crackedBrickSlab,
				crackedBrickStairs,
				crackedBrickWall,
				mossyBrick,
				mossyBrickSlab,
				mossyBrickStairs,
				mossyBrickWall,
				crackedMossyBrick,
				crackedMossyBrickSlab,
				crackedMossyBrickStairs,
				crackedMossyBrickWall);
	}
	
	public static void offerSlabRecipe(RecipeExporter exp, ItemConvertible output, ItemConvertible input) {
		createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, output, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(output)).offerTo(exp);
	}
	
	public static void offerStairsRecipe(RecipeExporter exp, ItemConvertible output, ItemConvertible input) {
		createStairsRecipe(output, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(output)).offerTo(exp);
	}
	
	public static void offerWallRecipe(RecipeExporter exp, ItemConvertible output, ItemConvertible input) {
		getWallRecipe(RecipeCategory.DECORATIONS, output, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(output)).offerTo(exp);
	}
	
	public static void offerFenceRecipe(RecipeExporter exp, ItemConvertible output, ItemConvertible input1, ItemConvertible input2) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output, 3).pattern("XYX").pattern("XYX").input('X', input1).input('Y', input2).criterion(hasItem(input1), conditionsFromItem(input1)).criterion(hasItem(input2), conditionsFromItem(input2)).group(getItemPath(output)).offerTo(exp);
	}
	
	public static void offerFenceRecipe(RecipeExporter exp, ItemConvertible output, int count, ItemConvertible input1, ItemConvertible input2) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output, count).pattern("XYX").pattern("XYX").input('X', input1).input('Y', input2).criterion(hasItem(input1), conditionsFromItem(input1)).criterion(hasItem(input2), conditionsFromItem(input2)).group(getItemPath(output)).offerTo(exp);
	}
	
	public static void offerFenceGateRecipe(RecipeExporter exp, ItemConvertible output, ItemConvertible input1, ItemConvertible input2) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output).pattern("YXY").pattern("YXY").input('X', input1).input('Y', input2).criterion(hasItem(input1), conditionsFromItem(input1)).criterion(hasItem(input2), conditionsFromItem(input2)).group(getItemPath(output)).offerTo(exp);
	}
	
	public static void offerStonecuttingRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input) {
		StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(input), cat, output).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exp, Identifier.of(MSMain.MOD_ID, convertBetween(output, input) + "_stonecutting"));
	}
	
	public static void offerStonecuttingRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input, int count) {
		StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(input), cat, output, count).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exp, Identifier.of(MSMain.MOD_ID, convertBetween(output, input) + "_stonecutting"));
	}
	
	public static void offerSmeltingRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input) {
		offerSmeltingRecipe(exp, cat, output, input, 0.1f);
	}
	
	public static void offerSmeltingRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input, float xp) {
		CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(input), cat, output, xp, 200).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exp);
	}
	
	public static void offerAlternativeSmeltingRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input) {
		offerAlternativeSmeltingRecipe(exp, cat, output, input, 0.1f);
	}
	
	public static void offerAlternativeSmeltingRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input, float xp) {
		CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(input), cat, output, xp, 200).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exp, Identifier.of(MSMain.MOD_ID, getItemPath(output) + "_smelting"));
	}
	
	public static void offerSmeltingRecipes(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible... inputs) {
		offerSmeltingRecipes(exp, cat, output, 0.1f, inputs);
	}
	
	public static void offerSmeltingRecipes(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, float xp, ItemConvertible... inputs) {
		for (ItemConvertible input : inputs) {
			CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(input), cat, output, xp, 200).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(output)).offerTo(exp, Identifier.of(MSMain.MOD_ID, convertBetween(output, input) + "_smelting"));
		}
	}
	
	public static void offerBlastingRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input) {
		offerBlastingRecipe(exp, cat, output, input, 0.1f);
	}
	
	public static void offerBlastingRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input, float xp) {
		CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(input), cat, output, xp, 100).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exp, Identifier.of(MSMain.MOD_ID, getItemPath(output) + "_blasting"));
	}
	
	public static void offerAlternativeBlastingRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input) {
		offerAlternativeBlastingRecipe(exp, cat, output, input, 0.1f);
	}
	
	public static void offerAlternativeBlastingRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input, float xp) {
		CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(input), cat, output, xp, 100).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exp, Identifier.of(MSMain.MOD_ID, convertBetween(output, input) + "_blasting"));
	}
	
	public static void offerBlastingRecipes(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible... inputs) {
		offerBlastingRecipes(exp, cat, output, 0.1f, inputs);
	}
	
	public static void offerBlastingRecipes(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, float xp, ItemConvertible... inputs) {
		for (ItemConvertible input : inputs) {
			CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(input), cat, output, xp, 100).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(output)).offerTo(exp, Identifier.of(MSMain.MOD_ID, convertBetween(output, input) + "_blasting"));
		}
	}
	
	public static void offerSmokingRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input) {
		offerSmokingRecipe(exp, cat, output, input, 0.1f);
	}
	
	public static void offerSmokingRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input, float xp) {
		CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(input), cat, output, xp, 100).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exp, Identifier.of(MSMain.MOD_ID, getItemPath(output) + "_smoking"));
	}
	
	public static void offerAlternativeSmokingRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input) {
		offerAlternativeSmokingRecipe(exp, cat, output, input, 0.1f);
	}
	
	public static void offerAlternativeSmokingRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input, float xp) {
		CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(input), cat, output, xp, 100).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exp, Identifier.of(MSMain.MOD_ID, convertBetween(output, input) + "_smoking"));
	}
	
	public static void offerSmokingRecipes(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible... inputs) {
		offerSmokingRecipes(exp, cat, output, 0.1f, inputs);
	}
	
	public static void offerSmokingRecipes(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, float xp, ItemConvertible... inputs) {
		for (ItemConvertible input : inputs) {
			CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(input), cat, output, xp, 100).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(output)).offerTo(exp, Identifier.of(MSMain.MOD_ID, convertBetween(output, input) + "_smoking"));
		}
	}
	
	public static void offerCampfireRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input) {
		offerCampfireRecipe(exp, cat, output, input, 0.1f);
	}
	
	public static void offerCampfireRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input, float xp) {
		CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(input), cat, output, xp, 600).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exp, Identifier.of(MSMain.MOD_ID, getItemPath(output) + "_campfire"));
	}
	
	public static void offerCampfireRecipes(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible... inputs) {
		offerCampfireRecipes(exp, cat, output, 0.1f, inputs);
	}
	
	public static void offerCampfireRecipes(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, float xp, ItemConvertible... inputs) {
		for (ItemConvertible input : inputs) {
			CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(input), cat, output, xp, 600).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(output)).offerTo(exp, Identifier.of(MSMain.MOD_ID, convertBetween(output, input) + "_campfire"));
		}
	}
	
	public static void offer2StackedRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input) {
		ShapedRecipeJsonBuilder.create(cat, output).pattern("#").pattern("#").input('#', input).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(output)).offerTo(exp);
	}
	
	public static void offerAlternative2StackedRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input) {
		ShapedRecipeJsonBuilder.create(cat, output).pattern("#").pattern("#").input('#', input).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(output)).offerTo(exp, Identifier.of(MSMain.MOD_ID, convertBetween(output, input)));
	}
	
	public static void offer2StackedRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input, int count) {
		ShapedRecipeJsonBuilder.create(cat, output, count).pattern("#").pattern("#").input('#', input).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(output)).offerTo(exp);
	}
	
	public static void offerAlternative2StackedRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input, int count) {
		ShapedRecipeJsonBuilder.create(cat, output, count).pattern("#").pattern("#").input('#', input).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(output)).offerTo(exp, Identifier.of(MSMain.MOD_ID, convertBetween(output, input)));
	}
	
	public static void offer2SideBySideRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input) {
		ShapedRecipeJsonBuilder.create(cat, output).pattern("##").input('#', input).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(output)).offerTo(exp);
	}
	
	public static void offerAlternative2SideBySideRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input) {
		ShapedRecipeJsonBuilder.create(cat, output).pattern("##").input('#', input).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(output)).offerTo(exp, Identifier.of(MSMain.MOD_ID, convertBetween(output, input)));
	}
	
	public static void offer2SideBySideRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input, int count) {
		ShapedRecipeJsonBuilder.create(cat, output, count).pattern("##").input('#', input).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(output)).offerTo(exp);
	}
	
	public static void offerAlternative2SideBySideRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input, int count) {
		ShapedRecipeJsonBuilder.create(cat, output, count).pattern("##").input('#', input).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(output)).offerTo(exp, Identifier.of(MSMain.MOD_ID, convertBetween(output, input)));
	}
	
	public static void offer3StackedRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input) {
		ShapedRecipeJsonBuilder.create(cat, output).pattern("#").pattern("#").pattern("#").input('#', input).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(output)).offerTo(exp);
	}
	
	public static void offerAlternative3StackedRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input) {
		ShapedRecipeJsonBuilder.create(cat, output).pattern("#").pattern("#").pattern("#").input('#', input).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(output)).offerTo(exp, Identifier.of(MSMain.MOD_ID, convertBetween(output, input)));
	}
	
	public static void offer3StackedRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input, int count) {
		ShapedRecipeJsonBuilder.create(cat, output, count).pattern("#").pattern("#").pattern("#").input('#', input).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(output)).offerTo(exp);
	}
	
	public static void offerAlternative3StackedRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input, int count) {
		ShapedRecipeJsonBuilder.create(cat, output, count).pattern("#").pattern("#").pattern("#").input('#', input).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(output)).offerTo(exp, Identifier.of(MSMain.MOD_ID, convertBetween(output, input)));
	}
	
	public static void offer3SideBySideRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input) {
		ShapedRecipeJsonBuilder.create(cat, output).pattern("###").input('#', input).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(output)).offerTo(exp);
	}
	
	public static void offerAlternative3SideBySideRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input) {
		ShapedRecipeJsonBuilder.create(cat, output).pattern("###").input('#', input).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(output)).offerTo(exp, Identifier.of(MSMain.MOD_ID, convertBetween(output, input)));
	}
	
	public static void offer3SideBySideRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input, int count) {
		ShapedRecipeJsonBuilder.create(cat, output, count).pattern("###").input('#', input).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(output)).offerTo(exp);
	}
	
	public static void offerAlternative3SideBySideRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input, int count) {
		ShapedRecipeJsonBuilder.create(cat, output, count).pattern("###").input('#', input).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(output)).offerTo(exp, Identifier.of(MSMain.MOD_ID, convertBetween(output, input)));
	}
	
	public static void offer2x2Recipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input) {
		ShapedRecipeJsonBuilder.create(cat, output).pattern("##").pattern("##").input('#', input).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(output)).offerTo(exp);
	}
	
	public static void offerAlternative2x2Recipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input) {
		ShapedRecipeJsonBuilder.create(cat, output).pattern("##").pattern("##").input('#', input).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(output)).offerTo(exp, Identifier.of(MSMain.MOD_ID, convertBetween(output, input)));
	}
	
	public static void offerCombineWithMossRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input) {
		ShapelessRecipeJsonBuilder.create(cat, output).input(input).input(Ingredient.ofItems(Items.MOSS_BLOCK, Items.VINE)).criterion(hasItem(input), conditionsFromItem(input)).criterion(hasItem(Items.MOSS_BLOCK, Items.VINE), conditionsFromItems(Items.MOSS_BLOCK, Items.VINE)).group(getItemPath(output)).offerTo(exp);
	}
	
	public static void offerAlternativeCombineWithMossRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input) {
		ShapelessRecipeJsonBuilder.create(cat, output).input(input).input(Ingredient.ofItems(Items.MOSS_BLOCK, Items.VINE)).criterion(hasItem(input), conditionsFromItem(input)).criterion("has_moss_block_or_vine", conditionsFromItems(Items.MOSS_BLOCK, Items.VINE)).group(getItemPath(output)).offerTo(exp, Identifier.of(MSMain.MOD_ID, getItemPath(output) + "_from_moss_block_or_vine"));
	}
	
	public static void offer2x2CheckerboardRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input1, ItemConvertible input2) {
		ShapedRecipeJsonBuilder.create(cat, output).pattern("AB").pattern("BA").input('A', input1).input('B', input2).criterion(hasItem(input1), conditionsFromItem(input1)).criterion(hasItem(input2), conditionsFromItem(input2)).group(getItemPath(output)).offerTo(exp);
	}
	
	public static void offer2x2CheckerboardRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input1, ItemConvertible input2, int count) {
		ShapedRecipeJsonBuilder.create(cat, output, count).pattern("AB").pattern("BA").input('A', input1).input('B', input2).criterion(hasItem(input1), conditionsFromItem(input1)).criterion(hasItem(input2), conditionsFromItem(input2)).group(getItemPath(output)).offerTo(exp);
	}
	
	public static void offerAlternative2x2CheckerboardRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input1, ItemConvertible input2) {
		ShapedRecipeJsonBuilder.create(cat, output).pattern("AB").pattern("BA").input('A', input1).input('B', input2).criterion(hasItem(input1), conditionsFromItem(input1)).criterion(hasItem(input2), conditionsFromItem(input2)).group(getItemPath(output)).offerTo(exp, Identifier.of(MSMain.MOD_ID, convertBetween(output, input1, input2)));
	}
	
	public static void offerAlternative2x2CheckerboardRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input1, ItemConvertible input2, int count) {
		ShapedRecipeJsonBuilder.create(cat, output, count).pattern("AB").pattern("BA").input('A', input1).input('B', input2).criterion(hasItem(input1), conditionsFromItem(input1)).criterion(hasItem(input2), conditionsFromItem(input2)).group(getItemPath(output)).offerTo(exp, Identifier.of(MSMain.MOD_ID, convertBetween(output, input1, input2)));
	}
	
	public static void offerShapelessRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input) {
		ShapelessRecipeJsonBuilder.create(cat, output).input(input).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(output)).offerTo(exp);
	}
	
	public static void offerShapelessRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input, int count) {
		ShapelessRecipeJsonBuilder.create(cat, output, count).input(input).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(output)).offerTo(exp);
	}
	
	public static void offerAlternativeShapelessRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input) {
		ShapelessRecipeJsonBuilder.create(cat, output).input(input).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(output)).offerTo(exp, Identifier.of(MSMain.MOD_ID, convertBetween(output, input)));
	}
	
	public static void offerAlternativeShapelessRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input, int count) {
		ShapelessRecipeJsonBuilder.create(cat, output, count).input(input).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(output)).offerTo(exp, Identifier.of(MSMain.MOD_ID, convertBetween(output, input)));
	}
	
	public static void offerShapelessRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible... inputs) {
		var builder = ShapelessRecipeJsonBuilder.create(cat, output).group(getItemPath(output));
		for (ItemConvertible input : inputs) {
			builder.input(input).criterion(hasItem(input), conditionsFromItem(input));
		}
		builder.offerTo(exp);
	}
	
	public static void offerShapelessRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, int count, ItemConvertible... inputs) {
		var builder = ShapelessRecipeJsonBuilder.create(cat, output, count).group(getItemPath(output));
		for (ItemConvertible input : inputs) {
			builder.input(input).criterion(hasItem(input), conditionsFromItem(input));
		}
		builder.offerTo(exp);
	}
	
	public static void offerAlternativeShapelessRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible... inputs) {
		var builder = ShapelessRecipeJsonBuilder.create(cat, output).group(getItemPath(output));
		for (ItemConvertible input : inputs) {
			builder.input(input).criterion(hasItem(input), conditionsFromItem(input));
		}
		builder.offerTo(exp, convertBetween(output, inputs));
	}
	
	public static void offerAlternativeShapelessRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, int count, ItemConvertible... inputs) {
		var builder = ShapelessRecipeJsonBuilder.create(cat, output, count).group(getItemPath(output));
		for (ItemConvertible input : inputs) {
			builder.input(input).criterion(hasItem(input), conditionsFromItem(input));
		}
		builder.offerTo(exp, convertBetween(output, inputs));
	}
	
	public static void offerShapelessRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, TagKey<Item> input) {
		ShapelessRecipeJsonBuilder.create(cat, output).input(input).criterion(hasTag(input), conditionsFromTag(input)).group(getItemPath(output)).offerTo(exp);
	}
	
	public static void offerShapelessRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, TagKey<Item> input, int count) {
		ShapelessRecipeJsonBuilder.create(cat, output, count).input(input).criterion(hasTag(input), conditionsFromTag(input)).group(getItemPath(output)).offerTo(exp);
	}
	
	public static void offerAlternativeShapelessRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, TagKey<Item> input) {
		ShapelessRecipeJsonBuilder.create(cat, output).input(input).criterion(hasTag(input), conditionsFromTag(input)).group(getItemPath(output)).offerTo(exp, Identifier.of(MSMain.MOD_ID, convertBetween(output, input)));
	}
	
	public static void offerAlternativeShapelessRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, TagKey<Item> input, int count) {
		ShapelessRecipeJsonBuilder.create(cat, output, count).input(input).criterion(hasTag(input), conditionsFromTag(input)).group(getItemPath(output)).offerTo(exp, Identifier.of(MSMain.MOD_ID, convertBetween(output, input)));
	}
	
	public static void offer2x2CompactingRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input) {
		ShapedRecipeJsonBuilder.create(cat, output).pattern("##").pattern("##").input('#', input).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(output)).offerTo(exp);
	}
	
	public static void offerAlternative2x2CompactingRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input) {
		ShapedRecipeJsonBuilder.create(cat, output).pattern("##").pattern("##").input('#', input).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(output)).offerTo(exp, Identifier.of(MSMain.MOD_ID, convertBetween(output, input)));
	}
	
	public static void offerReversible2x2CompactingRecipe(RecipeExporter exp, RecipeCategory compactingCat, RecipeCategory uncompactingCat, ItemConvertible compacted, ItemConvertible uncompacted) {
		offer2x2CompactingRecipe(exp, compactingCat, compacted, uncompacted);
		offerAlternativeShapelessRecipe(exp, uncompactingCat, uncompacted, compacted, 4);
	}
	
	public static void offerAlternativeReversible2x2CompactingRecipe(RecipeExporter exp, RecipeCategory compactingCat, RecipeCategory uncompactingCat, ItemConvertible compacted, ItemConvertible uncompacted) {
		offerAlternative2x2CompactingRecipe(exp, compactingCat, compacted, uncompacted);
		offerAlternativeShapelessRecipe(exp, uncompactingCat, uncompacted, compacted, 4);
	}
	
	public static void offer3x3CompactingRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input) {
		ShapedRecipeJsonBuilder.create(cat, output).pattern("###").pattern("###").pattern("###").input('#', input).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(input)).offerTo(exp);
	}
	
	public static void offerAlternative3x3CompactingRecipe(RecipeExporter exp, RecipeCategory cat, ItemConvertible output, ItemConvertible input) {
		ShapedRecipeJsonBuilder.create(cat, output).pattern("###").pattern("###").pattern("###").input('#', input).criterion(hasItem(input), conditionsFromItem(input)).group(getItemPath(input)).offerTo(exp, Identifier.of(MSMain.MOD_ID, convertBetween(output, input)));
	}
	
	public static void offerReversible3x3CompactingRecipe(RecipeExporter exp, RecipeCategory compactingCat, RecipeCategory uncompactingCat, ItemConvertible compacted, ItemConvertible uncompacted) {
		offer3x3CompactingRecipe(exp, compactingCat, compacted, uncompacted);
		offerAlternativeShapelessRecipe(exp, uncompactingCat, uncompacted, compacted, 9);
	}
	
	public static void offerAlternativeReversible3x3CompactingRecipe(RecipeExporter exp, RecipeCategory compactingCat, RecipeCategory uncompactingCat, ItemConvertible compacted, ItemConvertible uncompacted) {
		offerAlternative3x3CompactingRecipe(exp, compactingCat, compacted, uncompacted);
		offerAlternativeShapelessRecipe(exp, uncompactingCat, uncompacted, compacted, 9);
	}
	
	public static AdvancementCriterion<InventoryChangedCriterion.Conditions> conditionsFromItems(ItemConvertible... items) {
		return InventoryChangedCriterion.Conditions.items(items);
	}
	
	public static String convertBetween(ItemConvertible output, ItemConvertible... inputs) {
		String result = getItemPath(output) + "_from_";
		for (ItemConvertible input : inputs) {
			if (input != inputs[0]) {
				result = result + "_and_";
			}
			result = result + getItemPath(input);
		}
		return result;
	}
	
	public static String convertBetween(ItemConvertible output, TagKey<?> input) {
		return getItemPath(output) + "_from_" + getTagPath(input);
	}
	
	public static String hasItem(ItemConvertible... options) {
		String result = "has_";
		for (ItemConvertible item : options) {
			if (item != options[0]) {
				result = result + "_or_";
			}
			result = result + getItemPath(item);
		}
		return result;
	}
	
	public static String hasTag(TagKey<?> tagKey) {
		return "has_" + getTagPath(tagKey);
	}
	
	public static String getTagPath(TagKey<?> tagKey) {
		return tagKey.id().getPath();
	}
}
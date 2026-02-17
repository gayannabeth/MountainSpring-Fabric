package gay.mountainspring.loot;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import com.google.common.collect.ImmutableMap;

import gay.mountainspring.item.MSItems;
import gay.mountainspring.sswplus.block.SSWPBlocks;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.fabricmc.fabric.api.loot.v3.LootTableSource;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.enums.SlabType;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.condition.MatchToolLootCondition;
import net.minecraft.loot.condition.SurvivesExplosionLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ExplosionDecayLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.predicate.NumberRange;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.predicate.item.EnchantmentPredicate;
import net.minecraft.predicate.item.EnchantmentsPredicate;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.predicate.item.ItemSubPredicateTypes;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.state.property.Properties;

public class MSLootModifications {
	private MSLootModifications() {}
	
	private static Supplier<LootCondition.Builder> WITH_SILK_TOUCH;
	
	private static final Map<RegistryKey<LootTable>, Block> NON_SLABS = List.of(Blocks.STONE_STAIRS,
			SSWPBlocks.STONE_WALL,
			Blocks.GRANITE,
			Blocks.GRANITE_STAIRS,
			Blocks.GRANITE_WALL,
			Blocks.DIORITE,
			Blocks.DIORITE_STAIRS,
			Blocks.DIORITE_WALL,
			Blocks.ANDESITE,
			Blocks.ANDESITE_STAIRS,
			Blocks.ANDESITE_WALL,
			SSWPBlocks.DEEPSLATE_STAIRS,
			SSWPBlocks.DEEPSLATE_WALL)
			.stream()
			.collect(ImmutableMap.toImmutableMap(block -> block.getLootTableKey(), block -> block));
	
	private static final Map<RegistryKey<LootTable>, Block> SLABS = List.of(Blocks.STONE_SLAB,
			Blocks.GRANITE_SLAB,
			Blocks.DIORITE_SLAB,
			Blocks.ANDESITE_SLAB,
			SSWPBlocks.DEEPSLATE_SLAB)
			.stream()
			.collect(ImmutableMap.toImmutableMap(block -> block.getLootTableKey(), block -> block));
	
	private static final Map<Block, ItemConvertible> TO_WITHOUT_SILK_TOUCH = ImmutableMap.<Block, ItemConvertible>builder()
			.put(Blocks.STONE_SLAB, Items.COBBLESTONE_SLAB)
			.put(Blocks.STONE_STAIRS, Items.COBBLESTONE_STAIRS)
			.put(SSWPBlocks.STONE_WALL, Items.COBBLESTONE_WALL)
			.put(Blocks.GRANITE, MSItems.COBBLED_GRANITE)
			.put(Blocks.GRANITE_SLAB, MSItems.COBBLED_GRANITE_SLAB)
			.put(Blocks.GRANITE_STAIRS, MSItems.COBBLED_GRANITE_STAIRS)
			.put(Blocks.GRANITE_WALL, MSItems.COBBLED_GRANITE_WALL)
			.put(Blocks.DIORITE, MSItems.COBBLED_DIORITE)
			.put(Blocks.DIORITE_SLAB, MSItems.COBBLED_DIORITE_SLAB)
			.put(Blocks.DIORITE_STAIRS, MSItems.COBBLED_DIORITE_STAIRS)
			.put(Blocks.DIORITE_WALL, MSItems.COBBLED_DIORITE_WALL)
			.put(Blocks.ANDESITE, MSItems.COBBLED_ANDESITE)
			.put(Blocks.ANDESITE_SLAB, MSItems.COBBLED_ANDESITE_SLAB)
			.put(Blocks.ANDESITE_STAIRS, MSItems.COBBLED_ANDESITE_STAIRS)
			.put(Blocks.ANDESITE_WALL, MSItems.COBBLED_ANDESITE_WALL)
			.put(SSWPBlocks.DEEPSLATE_SLAB, Items.COBBLED_DEEPSLATE_SLAB)
			.put(SSWPBlocks.DEEPSLATE_STAIRS, Items.COBBLED_DEEPSLATE_STAIRS)
			.put(SSWPBlocks.DEEPSLATE_WALL, Items.COBBLED_DEEPSLATE_WALL)
			.build();
	
	public static final void init() {
		LootTableEvents.REPLACE.register((key, original, source, registries) -> {
			if (source != LootTableSource.DATA_PACK) {
				var impl = registries.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
				if (WITH_SILK_TOUCH == null) {
					WITH_SILK_TOUCH = () -> {
						return MatchToolLootCondition.builder(
							ItemPredicate.Builder.create()
								.subPredicate(
									ItemSubPredicateTypes.ENCHANTMENTS,
									EnchantmentsPredicate.enchantments(List.of(new EnchantmentPredicate(impl.getOrThrow(Enchantments.SILK_TOUCH), NumberRange.IntRange.atLeast(1))))
								)
							);
					};
					
				}
				if (NON_SLABS.containsKey(key)) {
					Block block = NON_SLABS.get(key);
					return drops(block, TO_WITHOUT_SILK_TOUCH.get(block)).build();
				}
				
				if (SLABS.containsKey(key)) {
					Block block = SLABS.get(key);
					return slabDrops(block, TO_WITHOUT_SILK_TOUCH.get(block)).build();
				}
			}
			
			return null;
		});
	}
	
	private static LootTable.Builder drops(Block withSilkTouch, ItemConvertible withoutSilkTouch) {
		return LootTable.builder()
				.pool(LootPool.builder()
						.rolls(ConstantLootNumberProvider.create(1.0f))
						.with(ItemEntry.builder(withSilkTouch)
								.conditionally(WITH_SILK_TOUCH.get())
								.alternatively(ItemEntry.builder(withoutSilkTouch)
										.conditionally(SurvivesExplosionLootCondition.builder()))));
	}
	
	private static LootTable.Builder slabDrops(Block withSilkTouch, ItemConvertible withoutSilkTouch) {
		return LootTable.builder()
				.pool(LootPool.builder()
						.rolls(ConstantLootNumberProvider.create(1.0f))
						.with(ItemEntry.builder(withSilkTouch)
								.conditionally(WITH_SILK_TOUCH.get())
								.alternatively(ItemEntry.builder(withoutSilkTouch)))
						.apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0f))
								.conditionally(isDoubleSlab(withSilkTouch)))
						.apply(ExplosionDecayLootFunction.builder()));
	}
	
	private static LootCondition.Builder isDoubleSlab(Block block) {
		return BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE));
	}
}
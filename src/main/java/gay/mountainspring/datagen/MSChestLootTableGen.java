package gay.mountainspring.datagen;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTable.Builder;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;

public class MSChestLootTableGen extends SimpleFabricLootTableProvider {
	public MSChestLootTableGen(FabricDataOutput output, CompletableFuture<WrapperLookup> registryLookup) {
		super(output, registryLookup, LootContextTypes.CHEST);
	}

	@Override
	public void accept(BiConsumer<RegistryKey<LootTable>, Builder> lootTableBiConsumer) {
		
	}
}
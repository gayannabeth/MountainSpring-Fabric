package gay.mountainspring.datagen;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;

public class MSAdvancementGen extends FabricAdvancementProvider {
	public MSAdvancementGen(FabricDataOutput output, CompletableFuture<WrapperLookup> registryLookup) {
		super(output, registryLookup);
	}
	
	@Override
	public void generateAdvancement(WrapperLookup registryLookup, Consumer<AdvancementEntry> consumer) {
		
	}
}
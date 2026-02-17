package gay.mountainspring.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator.Pack;

public class MSDataGen implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator gen) {
		Pack pack = gen.createPack();
		
		pack.addProvider(MSAdvancementGen::new);
		pack.addProvider(MSBlockLootTableGen::new);
		pack.addProvider(MSBlockStatesModelGen::new);
		pack.addProvider(MSChestLootTableGen::new);
		pack.addProvider(MSLangGen.EnUs::new);
		pack.addProvider(MSLangGen.EnCa::new);
		pack.addProvider(MSRecipeGen::new);
		MSTagGen.BlockTagGen blockTags = pack.addProvider(MSTagGen.BlockTagGen::new);
		pack.addProvider((output, completableFuture) -> new MSTagGen.ItemTagGen(output, completableFuture, blockTags));
	}
}
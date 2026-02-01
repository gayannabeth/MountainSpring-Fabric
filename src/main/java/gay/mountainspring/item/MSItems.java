package gay.mountainspring.item;

import gay.mountainspring.MSMain;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MSItems {
	private MSItems() {}
	
	public static void init() {
		
	}
	
	
	
	public static Item register(String name) {
		return register(name, new Item.Settings());
	}
	
	public static Item register(String name, Item.Settings settings) {
		return register(name, new Item(settings));
	}
	
	public static Item register(String name, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(MSMain.MOD_ID, name), item);
	}
	
	public static Item registerBlock(Block block) {
		return registerBlock(block, new Item.Settings());
	}
	
	public static Item registerBlock(Block block, Item.Settings settings) {
		return register(Registries.BLOCK.getId(block).getPath(), new BlockItem(block, settings));
	}
}
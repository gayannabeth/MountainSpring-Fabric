package gay.mountainspring.block;

import gay.mountainspring.MSMain;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MSBlocks {
	private MSBlocks() {}
	
	public static void init() {
		
	}
	
	
	
	public static Block register(String name, Block block) {
		return Registry.register(Registries.BLOCK, Identifier.of(MSMain.MOD_ID, name), block);
	}
}
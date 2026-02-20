package gay.mountainspring.block;

import gay.mountainspring.MSMain;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MSBlockTypes {
	private MSBlockTypes() {}
	
	public static void init () {}
	
	static {
		Registry.register(Registries.BLOCK_TYPE, Identifier.of(MSMain.MOD_ID, "warped_wart"), WarpedWartBlock.CODEC);
	}
}
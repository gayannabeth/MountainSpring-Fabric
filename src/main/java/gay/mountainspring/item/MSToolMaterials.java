package gay.mountainspring.item;

import gay.mountainspring.MSMain;
import gay.mountainspring.aquifer.item.AquiferToolMaterial;
import gay.mountainspring.tag.MSTags;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Identifier;

public class MSToolMaterials {
	private MSToolMaterials() {}
	
	public static final ToolMaterial FLINT = AquiferToolMaterial.create(Identifier.of(MSMain.MOD_ID, "flint"), MSTags.Blocks.INCORRECT_FOR_FLINT_TOOL, 103, 4.0f, 1.0f, 7, MSTags.Items.FLINT_TOOL_MATERIALS);
}
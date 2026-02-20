package gay.mountainspring.block;

import com.mojang.serialization.MapCodec;

import gay.mountainspring.tag.MSTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.NetherWartBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class WarpedWartBlock extends NetherWartBlock {
	public static final MapCodec<NetherWartBlock> CODEC = createCodec(WarpedWartBlock::new);
	
	@Override
	public MapCodec<NetherWartBlock> getCodec() {
		return CODEC;
	}
	
	public WarpedWartBlock(Settings settings) {
		super(settings);
	}
	
	@Override
	protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
		return floor.isIn(MSTags.Blocks.SUPPORTS_WARPED_WART);
	}
}
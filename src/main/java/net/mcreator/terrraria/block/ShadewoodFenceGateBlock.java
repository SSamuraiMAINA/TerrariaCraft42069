
package net.mcreator.terrraria.block;

import net.minecraft.block.material.Material;

@TerrrariaModElements.ModElement.Tag
public class ShadewoodFenceGateBlock extends TerrrariaModElements.ModElement {

	@ObjectHolder("terrraria:shadewood_fence_gate")
	public static final Block block = null;

	public ShadewoodFenceGateBlock(TerrrariaModElements instance) {
		super(instance, 58);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(TerrariaItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends FenceGateBlock {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2f, 3f).lightValue(0));

			setRegistryName("shadewood_fence_gate");
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 5;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}

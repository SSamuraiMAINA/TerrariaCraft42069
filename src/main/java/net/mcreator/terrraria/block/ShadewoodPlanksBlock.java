
package net.mcreator.terrraria.block;

import net.minecraft.block.material.Material;

@TerrrariaModElements.ModElement.Tag
public class ShadewoodPlanksBlock extends TerrrariaModElements.ModElement {

	@ObjectHolder("terrraria:shadewood_planks")
	public static final Block block = null;

	public ShadewoodPlanksBlock(TerrrariaModElements instance) {
		super(instance, 53);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(TerrariaItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2f, 3f).lightValue(0).harvestLevel(0)
							.harvestTool(ToolType.AXE));

			setRegistryName("shadewood_planks");
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

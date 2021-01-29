
package net.mcreator.terrraria.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.terrraria.item.TiconItem;
import net.mcreator.terrraria.TerrrariaModElements;

@TerrrariaModElements.ModElement.Tag
public class TerrariaItemGroup extends TerrrariaModElements.ModElement {
	public TerrariaItemGroup(TerrrariaModElements instance) {
		super(instance, 49);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabterraria") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TiconItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}

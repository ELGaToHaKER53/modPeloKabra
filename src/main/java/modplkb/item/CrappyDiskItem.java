
package modplkb.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import modplkb.ModplkbModElements;

@ModplkbModElements.ModElement.Tag
public class CrappyDiskItem extends ModplkbModElements.ModElement {
	@ObjectHolder("modplkb:crappy_disk")
	public static final Item block = null;

	public CrappyDiskItem(ModplkbModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, ModplkbModElements.sounds.get(new ResourceLocation("modplkb:shity_disk.sound")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("crappy_disk");
		}
	}
}

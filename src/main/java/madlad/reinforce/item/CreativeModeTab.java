package madlad.reinforce.item;

import net.minecraft.world.item.ItemStack;

public class CreativeModeTab {

    public static final net.minecraft.world.item.CreativeModeTab ReinforceTab = new net.minecraft.world.item.CreativeModeTab("Reinforce") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.Guidebook.get());
        }

    };
}

package madlad.reinforce.item;

import madlad.reinforce.Reinforce;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reinforce.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

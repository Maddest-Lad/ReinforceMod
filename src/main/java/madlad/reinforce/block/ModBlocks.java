package madlad.reinforce.block;

import madlad.reinforce.Reinforce;
import madlad.reinforce.item.CreativeModeTab;
import madlad.reinforce.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reinforce.MODID);

    // Smithy Block
    public static final RegistryObject<Block> smithy = registerBlock("smithy", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).destroyTime(0.25f)));


    // Register Blocks
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    // Create an Item for Each Block
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(CreativeModeTab.ReinforceTab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }



}

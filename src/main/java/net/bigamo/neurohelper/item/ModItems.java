package net.bigamo.neurohelper.item;

import net.bigamo.neurohelper.NeuroHepler;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NeuroHepler.MOD_ID);
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
    public static final RegistryObject<Item> COMPUTER = ITEMS.register("computer",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}

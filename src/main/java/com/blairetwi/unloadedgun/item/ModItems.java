package com.blairetwi.unloadedgun.item;

import com.blairetwi.unloadedgun.UnloadedGun;
import com.blairetwi.unloadedgun.item.custom.UnloadedGunItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UnloadedGun.MODID);

    public static final RegistryObject<Item> UNLOADED_GUN = ITEMS.register("unloaded_gun", () -> new UnloadedGunItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

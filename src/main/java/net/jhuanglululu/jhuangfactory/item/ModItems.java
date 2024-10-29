package net.jhuanglululu.jhuangfactory.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jhuanglululu.jhuangfactory.JhuangFactory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems  {
    public static final Item STEEL = registerItem("steel", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(net.jhuanglululu.jhuangfactory.JhuangFactory.MOD_ID, name), item);
    }

    public static void registerModItems() {
        net.jhuanglululu.jhuangfactory.JhuangFactory.LOGGER.info("Registering Mod Items for " + JhuangFactory.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}

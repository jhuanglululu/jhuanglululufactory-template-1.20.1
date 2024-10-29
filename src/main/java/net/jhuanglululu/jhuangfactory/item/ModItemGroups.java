package net.jhuanglululu.jhuangfactory.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jhuanglululu.jhuangfactory.JhuangFactory;
import net.jhuanglululu.jhuangfactory.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup Ingots = Registry.register(Registries.ITEM_GROUP,
            new Identifier(JhuangFactory.MOD_ID, "steel"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.jhuangfactory.ingots"))
                    .icon(() -> new ItemStack(ModItems.STEEL)).entries((displayContext, entries) -> {
                        entries.add(ModItems.STEEL);

                    }).build());

    public static final ItemGroup Building_Blocks = Registry.register(Registries.ITEM_GROUP,
            new Identifier(net.jhuanglululu.jhuangfactory.JhuangFactory.MOD_ID, "concrete_foundation"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.jhuangfactory.building_blocks"))
                    .icon(() -> new ItemStack(ModBlocks.CONCRETE_FOUNDATION)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CONCRETE_FOUNDATION);

                    }).build());

    public static void registerItemGroups() {
        net.jhuanglululu.jhuangfactory.JhuangFactory.LOGGER.info("Registering Item Groups for " + net.jhuanglululu.jhuangfactory.JhuangFactory.MOD_ID);
    }
}

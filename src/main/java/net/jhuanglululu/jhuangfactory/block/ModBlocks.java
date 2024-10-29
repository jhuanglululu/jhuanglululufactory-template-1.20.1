package net.jhuanglululu.jhuangfactory.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.jhuanglululu.jhuangfactory.JhuangFactory;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block CONCRETE_FOUNDATION = registerBlock("concrete_foundation",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(net.jhuanglululu.jhuangfactory.JhuangFactory.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(net.jhuanglululu.jhuangfactory.JhuangFactory.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        JhuangFactory.LOGGER.info("Registiring ModBlocks for " + net.jhuanglululu.jhuangfactory.JhuangFactory.MOD_ID);
    }
}

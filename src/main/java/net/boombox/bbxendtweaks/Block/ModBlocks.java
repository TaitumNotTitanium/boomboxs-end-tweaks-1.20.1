package net.boombox.bbxendtweaks.Block;

import net.boombox.bbxendtweaks.BoomboxsEndTweaks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block ENDZITE_BLOCK = registerBlock("endzite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)
                    .mapColor(MapColor.EMERALD_GREEN)));

    public static final Block BUDDING_ENDZITE = registerBlock("budding_endzite",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)
                    .mapColor(MapColor.EMERALD_GREEN)));

    public static final Block REFINED_ENDZITE_BLOCK = registerBlock("refined_endzite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)
                    .mapColor(MapColor.DIAMOND_BLUE)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BoomboxsEndTweaks.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BoomboxsEndTweaks.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        BoomboxsEndTweaks.LOGGER.info("Registering blocks for " + BoomboxsEndTweaks.MOD_ID);
    }
}

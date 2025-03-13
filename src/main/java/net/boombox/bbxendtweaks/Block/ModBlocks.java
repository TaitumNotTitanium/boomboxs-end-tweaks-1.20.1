package net.boombox.bbxendtweaks.Block;

import net.boombox.bbxendtweaks.Block.custom.BuddingEndziteBlock;
import net.boombox.bbxendtweaks.Block.custom.TestSongBlock;
import net.boombox.bbxendtweaks.BoomboxsEndTweaks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block EUROPIUM_ORE = registerBlock("europium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE)
                    .mapColor(MapColor.DIAMOND_BLUE)));
    public static final Block DEEPSLATE_EUROPIUM_ORE = registerBlock("deepslate_europium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)
                    .mapColor(MapColor.DIAMOND_BLUE)));

    public static final Block BEANIUM_ORE = registerBlock("beanium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE)
                    .mapColor(MapColor.BROWN)));
    public static final Block DEEPSLATE_BEANIUM_ORE = registerBlock("deepslate_beanium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)
                    .mapColor(MapColor.BROWN)));

    public static final Block YUIUM_BLOCK = registerBlock("yuium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)
                    .mapColor(MapColor.PALE_YELLOW)));
    public static final Block BEANIUM_BLOCK = registerBlock("beanium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)
                    .mapColor(MapColor.BROWN)));
    public static final Block EUROPIUM_BLOCK = registerBlock("europium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)
                    .mapColor(MapColor.BROWN)));
    public static final Block LOOCHIUM_BLOCK = registerBlock("loochium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)
                    .mapColor(MapColor.BROWN)));

    public static final Block ENDZITE_BLOCK = registerBlock("endzite_block",
            new AmethystBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)
                    .mapColor(MapColor.EMERALD_GREEN)
                    .strength(60.0F)));

    public static final Block BUDDING_ENDZITE = registerBlock("budding_endzite",
            new BuddingEndziteBlock(FabricBlockSettings.copyOf(Blocks.BUDDING_AMETHYST).mapColor(MapColor.EMERALD_GREEN)));
    public static final Block ENDZITE_CLUSTER = registerBlock("endzite_cluster",
            new AmethystClusterBlock(
                    7, 3,
                    FabricBlockSettings.copyOf(Blocks.AMETHYST_CLUSTER).mapColor(MapColor.EMERALD_GREEN)));
    public static final Block LARGE_ENDZITE_BUD = registerBlock("large_endzite_bud",
            new AmethystClusterBlock(
                    5, 3,
                    FabricBlockSettings.copyOf(Blocks.LARGE_AMETHYST_BUD).mapColor(MapColor.EMERALD_GREEN)));
    public static final Block MEDIUM_ENDZITE_BUD = registerBlock("medium_endzite_bud",
            new AmethystClusterBlock(
                    4, 3,
                    FabricBlockSettings.copyOf(Blocks.MEDIUM_AMETHYST_BUD).mapColor(MapColor.EMERALD_GREEN)));
    public static final Block SMALL_ENDZITE_BUD = registerBlock("small_endzite_bud",
            new AmethystClusterBlock(
                    3, 4,
                    FabricBlockSettings.copyOf(Blocks.SMALL_AMETHYST_BUD).mapColor(MapColor.EMERALD_GREEN)));

    public static final Block REFINED_ENDZITE_BLOCK = registerBlock("refined_endzite_block",
            new AmethystBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)
                    .mapColor(MapColor.DIAMOND_BLUE)
                    .strength(60.0F)));

    public static final Block TEST_SONG_BLOCK = registerBlock("test_song_block",
            new TestSongBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));

    public static final Block ENDZITE_ENRICHED_PLANKS = registerBlock("endzite_enriched_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.EMERALD_GREEN)));

    public static final Block ENDZITE_ENRICHED_STAIRS = registerBlock("endzite_enriched_stairs",
            new StairsBlock(ModBlocks.ENDZITE_ENRICHED_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS).mapColor(MapColor.EMERALD_GREEN)));
    public static final Block ENDZITE_ENRICHED_SLAB = registerBlock("endzite_enriched_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB).mapColor(MapColor.EMERALD_GREEN)));

    public static final Block ENDZITE_ENRICHED_BUTTON = registerBlock("endzite_enriched_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON).mapColor(MapColor.EMERALD_GREEN), BlockSetType.OAK, 10, true));
    public static final Block ENDZITE_ENRICHED_PRESSURE_PLATE = registerBlock("endzite_enriched_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_SLAB).mapColor(MapColor.EMERALD_GREEN), BlockSetType.OAK));

    public static final Block ENDZITE_ENRICHED_FENCE = registerBlock("endzite_enriched_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).mapColor(MapColor.EMERALD_GREEN)));
    public static final Block ENDZITE_ENRICHED_FENCE_GATE = registerBlock("endzite_enriched_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE).mapColor(MapColor.EMERALD_GREEN), WoodType.OAK));

    public static final Block ENDZITE_ENRICHED_DOOR = registerBlock("endzite_enriched_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR).mapColor(MapColor.EMERALD_GREEN), BlockSetType.OAK));
    public static final Block ENDZITE_ENRICHED_TRAPDOOR = registerBlock("endzite_enriched_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR).mapColor(MapColor.EMERALD_GREEN), BlockSetType.OAK));

    public static final Block ENDZITE_ENRICHED_LOG = registerBlock("endzite_enriched_log",
            Blocks.createLogBlock(MapColor.EMERALD_GREEN, MapColor.BLACK));
    public static final Block ENDZITE_ENRICHED_WOOD = registerBlock("endzite_enriched_wood",
            Blocks.createLogBlock(MapColor.EMERALD_GREEN, MapColor.BLACK));
    public static final Block STRIPPED_ENDZITE_ENRICHED_LOG = registerBlock("stripped_endzite_enriched_log",
            Blocks.createLogBlock(MapColor.EMERALD_GREEN, MapColor.BLACK));
    public static final Block STRIPPED_ENDZITE_ENRICHED_WOOD = registerBlock("stripped_endzite_enriched_wood",
            Blocks.createLogBlock(MapColor.EMERALD_GREEN, MapColor.BLACK));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BoomboxsEndTweaks.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BoomboxsEndTweaks.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        BoomboxsEndTweaks.LOGGER.info("Registering blocks for " + BoomboxsEndTweaks.MOD_ID);
    }
}

package net.boombox.bbxendtweaks.item;

import net.boombox.bbxendtweaks.Block.ModBlocks;
import net.boombox.bbxendtweaks.BoomboxsEndTweaks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup END_TWEAKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BoomboxsEndTweaks.MOD_ID, "endtweaks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.endtweaks"))
                    .icon( () -> new ItemStack(ModItems.ENDZITE_SHARD)).entries((displayContext, entries) -> {

                        entries.add(ModItems.BOOMBOXIUM_INGOT);
                        entries.add(ModBlocks.BEANIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_BEANIUM_ORE);
                        entries.add(ModItems.RAW_BEANIUM);
                        entries.add(ModBlocks.BEANIUM_BLOCK);
                        entries.add(ModItems.BEANIUM_INGOT);
                        entries.add(ModItems.RAW_LOOCHIUM);
                        entries.add(ModBlocks.LOOCHIUM_BLOCK);
                        entries.add(ModItems.LOOCHIUM_INGOT);
                        entries.add(ModBlocks.YUIUM_BLOCK);
                        entries.add(ModItems.YUIUM_INGOT);
                        entries.add(ModItems.THORIUM_INGOT);
                        entries.add(ModBlocks.EUROPIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_EUROPIUM_ORE);
                        entries.add(ModItems.RAW_EUROPIUM);
                        entries.add(ModBlocks.EUROPIUM_BLOCK);
                        entries.add(ModItems.EUROPIUM_INGOT);
                        entries.add(ModItems.EMPTY_CAN);
                        entries.add(ModItems.CAN_OF_BEANS);
                        entries.add(ModItems.ENDZITE_HELMET);
                        entries.add(ModItems.ENDZITE_CHESTPLATE);
                        entries.add(ModItems.ENDZITE_LEGGINGS);
                        entries.add(ModItems.ENDZITE_BOOTS);
                        entries.add(ModItems.ENDZITE_SWORD);
                        entries.add(ModItems.ENDZITE_PICKAXE);
                        entries.add(ModItems.ENDZITE_AXE);
                        entries.add(ModItems.ENDZITE_SHOVEL);
                        entries.add(ModItems.ENDZITE_HOE);
                        entries.add(ModItems.ENDZITE_SHARD);
                        entries.add(ModItems.REFINED_ENDZITE_SHARD);
                        entries.add(ModBlocks.ENDZITE_BLOCK);
                        entries.add(ModBlocks.BUDDING_ENDZITE);
                        entries.add(ModBlocks.ENDZITE_CLUSTER);
                        entries.add(ModBlocks.LARGE_ENDZITE_BUD);
                        entries.add(ModBlocks.MEDIUM_ENDZITE_BUD);
                        entries.add(ModBlocks.SMALL_ENDZITE_BUD);
                        entries.add(ModBlocks.REFINED_ENDZITE_BLOCK);
                        entries.add(ModItems.LINKING_TOOL);
                        entries.add(ModBlocks.TEST_SONG_BLOCK);
                        entries.add(ModItems.END_GLOW_BERRIES);
                        entries.add(ModItems.END_GLOW_BERRIES_FREY);
                        entries.add(ModItems.MUSIC_DISC_NOVAS_DREAM);

                        entries.add(ModBlocks.ENDZITE_ENRICHED_LOG);
                        entries.add(ModBlocks.ENDZITE_ENRICHED_WOOD);
                        entries.add(ModBlocks.STRIPPED_ENDZITE_ENRICHED_LOG);
                        entries.add(ModBlocks.STRIPPED_ENDZITE_ENRICHED_WOOD);
                        entries.add(ModBlocks.ENDZITE_ENRICHED_PLANKS);
                        entries.add(ModBlocks.ENDZITE_ENRICHED_STAIRS);
                        entries.add(ModBlocks.ENDZITE_ENRICHED_SLAB);
                        entries.add(ModBlocks.ENDZITE_ENRICHED_FENCE);
                        entries.add(ModBlocks.ENDZITE_ENRICHED_FENCE_GATE);
                        entries.add(ModBlocks.ENDZITE_ENRICHED_DOOR);
                        entries.add(ModBlocks.ENDZITE_ENRICHED_TRAPDOOR);
                        entries.add(ModBlocks.ENDZITE_ENRICHED_PRESSURE_PLATE);
                        entries.add(ModBlocks.ENDZITE_ENRICHED_BUTTON);

                    }).build());

    public static void registerItemGroups() {
        BoomboxsEndTweaks.LOGGER.info("Registering item groups for " + BoomboxsEndTweaks.MOD_ID);
    }
}

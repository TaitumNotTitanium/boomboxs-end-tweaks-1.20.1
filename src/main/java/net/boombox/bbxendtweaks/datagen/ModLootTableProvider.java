package net.boombox.bbxendtweaks.datagen;


import net.boombox.bbxendtweaks.Block.ModBlocks;
import net.boombox.bbxendtweaks.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.TEST_SONG_BLOCK);
        addDrop(ModBlocks.ENDZITE_BLOCK);
        addDrop(ModBlocks.BUDDING_ENDZITE, drops(ModBlocks.ENDZITE_BLOCK));
        addDrop(ModBlocks.REFINED_ENDZITE_BLOCK);

        addDrop(ModBlocks.ENDZITE_ENRICHED_PLANKS);
        addDrop(ModBlocks.ENDZITE_ENRICHED_BUTTON);
        addDrop(ModBlocks.ENDZITE_ENRICHED_FENCE);
        addDrop(ModBlocks.ENDZITE_ENRICHED_STAIRS);
        addDrop(ModBlocks.ENDZITE_ENRICHED_FENCE_GATE);
        addDrop(ModBlocks.ENDZITE_ENRICHED_PRESSURE_PLATE);
        addDrop(ModBlocks.ENDZITE_ENRICHED_TRAPDOOR);
        addDrop(ModBlocks.ENDZITE_ENRICHED_DOOR, doorDrops(ModBlocks.ENDZITE_ENRICHED_DOOR));
        addDrop(ModBlocks.ENDZITE_ENRICHED_SLAB, slabDrops(ModBlocks.ENDZITE_ENRICHED_SLAB));
        addDrop((ModBlocks.ENDZITE_ENRICHED_LOG));
        addDrop((ModBlocks.ENDZITE_ENRICHED_WOOD));
        addDrop((ModBlocks.STRIPPED_ENDZITE_ENRICHED_LOG));
        addDrop((ModBlocks.STRIPPED_ENDZITE_ENRICHED_WOOD));
        addDrop(ModBlocks.ENDZITE_CLUSTER, endziteOreDrops(ModBlocks.ENDZITE_CLUSTER, ModItems.ENDZITE_SHARD));
        addDrop(ModBlocks.LARGE_ENDZITE_BUD, dropsWithSilkTouch(ModBlocks.LARGE_ENDZITE_BUD));
        addDrop(ModBlocks.MEDIUM_ENDZITE_BUD, dropsWithSilkTouch(ModBlocks.MEDIUM_ENDZITE_BUD));
        addDrop(ModBlocks.SMALL_ENDZITE_BUD, dropsWithSilkTouch(ModBlocks.SMALL_ENDZITE_BUD));
    }

    public LootTable.Builder endziteOreDrops(Block block, Item item) {
        return dropsWithSilkTouch(
                block,
                (LootPoolEntry.Builder<?>)this.applyExplosionDecay(
                        block,
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 2.0F)))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))
                )
        );
    }

}

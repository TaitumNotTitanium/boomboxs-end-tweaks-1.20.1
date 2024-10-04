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
        addDrop(ModBlocks.ENDZITE_BLOCK, endziteOreDrops(ModBlocks.ENDZITE_BLOCK, ModItems.ENDZITE_SHARD));
        addDrop(ModBlocks.BUDDING_ENDZITE, endziteOreDrops(ModBlocks.ENDZITE_BLOCK, ModItems.ENDZITE_SHARD));
        addDrop(ModBlocks.REFINED_ENDZITE_BLOCK, endziteOreDrops(ModBlocks.REFINED_ENDZITE_BLOCK, ModItems.REFINED_ENDZITE_SHARD));
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

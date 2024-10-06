package net.boombox.bbxendtweaks.datagen;

import net.boombox.bbxendtweaks.Block.ModBlocks;
import net.boombox.bbxendtweaks.item.ModItems;
import net.boombox.bbxendtweaks.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModItems.MUSIC_DISC_NOVAS_DREAM);

        getOrCreateTagBuilder(ModTags.Items.ENRICHED_ENDZITE_LOG)
                .add(ModBlocks.ENDZITE_ENRICHED_LOG.asItem())
                .add(ModBlocks.STRIPPED_ENDZITE_ENRICHED_LOG.asItem())
                .add(ModBlocks.ENDZITE_ENRICHED_WOOD.asItem())
                .add(ModBlocks.STRIPPED_ENDZITE_ENRICHED_WOOD.asItem());
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.ENDZITE_ENRICHED_LOG.asItem())
                .add(ModBlocks.STRIPPED_ENDZITE_ENRICHED_LOG.asItem())
                .add(ModBlocks.ENDZITE_ENRICHED_WOOD.asItem())
                .add(ModBlocks.STRIPPED_ENDZITE_ENRICHED_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ENDZITE_HELMET)
                .add(ModItems.ENDZITE_CHESTPLATE)
                .add(ModItems.ENDZITE_LEGGINGS)
                .add(ModItems.ENDZITE_BOOTS);
    }
}

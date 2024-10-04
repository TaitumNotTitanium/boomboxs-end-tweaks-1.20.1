package net.boombox.bbxendtweaks.datagen;

import net.boombox.bbxendtweaks.Block.ModBlocks;
import net.boombox.bbxendtweaks.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.REFINED_ENDZITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDZITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BUDDING_ENDZITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TEST_SONG_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.REFINED_ENDZITE_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDZITE_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.END_GLOW_BERRIES, Models.GENERATED);
        itemModelGenerator.register(ModItems.LINKING_TOOL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_NOVAS_DREAM, Models.GENERATED);
    }
}

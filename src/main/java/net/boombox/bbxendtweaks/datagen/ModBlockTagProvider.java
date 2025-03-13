package net.boombox.bbxendtweaks.datagen;

import net.boombox.bbxendtweaks.Block.ModBlocks;
import net.boombox.bbxendtweaks.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider (FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.END_GLOW_BERRIES_PLACEABLE_ON)
                .add(ModBlocks.ENDZITE_BLOCK)
                .add(ModBlocks.REFINED_ENDZITE_BLOCK)
                .add(ModBlocks.BUDDING_ENDZITE)
                .add(Blocks.END_STONE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.ENDZITE_BLOCK)
                .add(ModBlocks.REFINED_ENDZITE_BLOCK)
                .add(ModBlocks.BUDDING_ENDZITE)
                .add(ModBlocks.ENDZITE_CLUSTER)
                .add(ModBlocks.EUROPIUM_ORE)
                .add(ModBlocks.DEEPSLATE_EUROPIUM_ORE)
                .add(ModBlocks.YUIUM_BLOCK)
                .add(ModBlocks.BEANIUM_ORE)
                .add(ModBlocks.DEEPSLATE_BEANIUM_ORE);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_2")))
                .add(ModBlocks.BEANIUM_ORE)
                .add(ModBlocks.DEEPSLATE_BEANIUM_ORE);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_3")))
                .add(ModBlocks.EUROPIUM_ORE)
                .add(ModBlocks.DEEPSLATE_EUROPIUM_ORE)
                .add(ModBlocks.YUIUM_BLOCK);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
                .add(ModBlocks.ENDZITE_BLOCK)
                .add(ModBlocks.BUDDING_ENDZITE)
                .add(ModBlocks.ENDZITE_CLUSTER);
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_5")))
                .add(ModBlocks.REFINED_ENDZITE_BLOCK);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.ENDZITE_ENRICHED_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.ENDZITE_ENRICHED_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(ModBlocks.ENDZITE_ENRICHED_PLANKS);

        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(ModBlocks.ENDZITE_ENRICHED_LOG)
                .add(ModBlocks.ENDZITE_ENRICHED_WOOD)
                .add(ModBlocks.STRIPPED_ENDZITE_ENRICHED_LOG)
                .add(ModBlocks.STRIPPED_ENDZITE_ENRICHED_WOOD);

    }

}

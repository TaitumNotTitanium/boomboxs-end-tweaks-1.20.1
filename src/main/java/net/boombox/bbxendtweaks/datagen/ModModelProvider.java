package net.boombox.bbxendtweaks.datagen;

import net.boombox.bbxendtweaks.Block.ModBlocks;
import net.boombox.bbxendtweaks.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.REFINED_ENDZITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LOOCHIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BEANIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EUROPIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDZITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BUDDING_ENDZITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TEST_SONG_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EUROPIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_EUROPIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BEANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BEANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YUIUM_BLOCK);

        BlockStateModelGenerator.BlockTexturePool ENDZITE_ENRICHED_PLANKS_POOL = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ENDZITE_ENRICHED_PLANKS);
        ENDZITE_ENRICHED_PLANKS_POOL.button(ModBlocks.ENDZITE_ENRICHED_BUTTON);
        ENDZITE_ENRICHED_PLANKS_POOL.fence(ModBlocks.ENDZITE_ENRICHED_FENCE);
        ENDZITE_ENRICHED_PLANKS_POOL.fenceGate(ModBlocks.ENDZITE_ENRICHED_FENCE_GATE);
        ENDZITE_ENRICHED_PLANKS_POOL.pressurePlate(ModBlocks.ENDZITE_ENRICHED_PRESSURE_PLATE);
        ENDZITE_ENRICHED_PLANKS_POOL.slab(ModBlocks.ENDZITE_ENRICHED_SLAB);
        ENDZITE_ENRICHED_PLANKS_POOL.stairs(ModBlocks.ENDZITE_ENRICHED_STAIRS);
        blockStateModelGenerator.registerDoor(ModBlocks.ENDZITE_ENRICHED_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.ENDZITE_ENRICHED_TRAPDOOR);
        blockStateModelGenerator.registerAmethyst(ModBlocks.SMALL_ENDZITE_BUD);
        blockStateModelGenerator.registerAmethyst(ModBlocks.MEDIUM_ENDZITE_BUD);
        blockStateModelGenerator.registerAmethyst(ModBlocks.LARGE_ENDZITE_BUD);
        blockStateModelGenerator.registerAmethyst(ModBlocks.ENDZITE_CLUSTER);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BOTTOMLESS_CAN_OF_BEANS, Models.GENERATED);
        itemModelGenerator.register(ModItems.FRISKIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BARREL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMPTY_CAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.CAN_OF_BEANS, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_LOOCHIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.EUROPIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_BEANIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_EUROPIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.BOOMBOXIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.LOOCHIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEANIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.YUIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.THORIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.REFINED_ENDZITE_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDZITE_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.END_GLOW_BERRIES, Models.GENERATED);
        itemModelGenerator.register(ModItems.END_GLOW_BERRIES_FREY, Models.GENERATED);
        itemModelGenerator.register(ModItems.LINKING_TOOL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_NOVAS_DREAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDZITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDZITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDZITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDZITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDZITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BEANIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDZITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDZITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDZITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDZITE_BOOTS));
        itemModelGenerator.register(ModBlocks.ENDZITE_CLUSTER.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.LARGE_ENDZITE_BUD.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.MEDIUM_ENDZITE_BUD.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.SMALL_ENDZITE_BUD.asItem(), Models.GENERATED);
    }
}

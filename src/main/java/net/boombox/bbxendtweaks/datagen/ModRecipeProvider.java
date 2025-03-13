package net.boombox.bbxendtweaks.datagen;

import net.boombox.bbxendtweaks.Block.ModBlocks;
import net.boombox.bbxendtweaks.item.ModItems;
import net.boombox.bbxendtweaks.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    private static final List<ItemConvertible> REFINED_ENDZITE_SHARD_BLASTABLES = List.of(ModItems.ENDZITE_SHARD);
    private static final List<ItemConvertible> EUROPIUM_INGOT_BLASTABLES = List.of(ModItems.RAW_EUROPIUM, ModBlocks.EUROPIUM_ORE, ModBlocks.DEEPSLATE_EUROPIUM_ORE);
    private static final List<ItemConvertible> BEANIUM_INGOT_BLASTABLES = List.of(ModItems.RAW_BEANIUM, ModBlocks.BEANIUM_ORE, ModBlocks.DEEPSLATE_BEANIUM_ORE);
    private static final List<ItemConvertible> LOOCHIUM_INGOT_BLASTABLES = List.of(ModItems.RAW_LOOCHIUM);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.ENDZITE_SHARD, RecipeCategory.MISC, ModBlocks.ENDZITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.REFINED_ENDZITE_SHARD, RecipeCategory.MISC, ModBlocks.REFINED_ENDZITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.YUIUM_INGOT, RecipeCategory.MISC, ModBlocks.YUIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.EUROPIUM_INGOT, RecipeCategory.MISC, ModBlocks.EUROPIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.BEANIUM_INGOT, RecipeCategory.MISC, ModBlocks.BEANIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.LOOCHIUM_INGOT, RecipeCategory.MISC, ModBlocks.LOOCHIUM_BLOCK);

        offerBlasting(exporter, REFINED_ENDZITE_SHARD_BLASTABLES, RecipeCategory.MISC, ModItems.REFINED_ENDZITE_SHARD, 10, 1000, "refined_endzite_shard");
        offerBlasting(exporter, EUROPIUM_INGOT_BLASTABLES, RecipeCategory.MISC, ModItems.EUROPIUM_INGOT, 10, 100, "europium_ingot");
        offerBlasting(exporter, LOOCHIUM_INGOT_BLASTABLES, RecipeCategory.MISC, ModItems.LOOCHIUM_INGOT, 10, 100, "loochium_ingot");
        offerBlasting(exporter, BEANIUM_INGOT_BLASTABLES, RecipeCategory.MISC, ModItems.BEANIUM_INGOT, 10, 100, "beanium_ingot");
        offerSmelting(exporter, EUROPIUM_INGOT_BLASTABLES, RecipeCategory.MISC, ModItems.EUROPIUM_INGOT, 10, 200, "europium_ingot");
        offerSmelting(exporter, LOOCHIUM_INGOT_BLASTABLES, RecipeCategory.MISC, ModItems.LOOCHIUM_INGOT, 10, 200, "loochium_ingot");
        offerSmelting(exporter, BEANIUM_INGOT_BLASTABLES, RecipeCategory.MISC, ModItems.BEANIUM_INGOT, 10, 200, "beanium_ingot");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LINKING_TOOL, 1)
                .pattern("  B")
                .pattern(" R ")
                .pattern("B  ")
                .input('B', ModItems.ENDZITE_SHARD)
                .input('R', ModItems.REFINED_ENDZITE_SHARD)
                .criterion(hasItem(ModItems.REFINED_ENDZITE_SHARD), conditionsFromItem(ModItems.REFINED_ENDZITE_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LINKING_TOOL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDZITE_SWORD, 1)
                .pattern(" E ")
                .pattern(" E ")
                .pattern(" S ")
                .input('E', ModItems.ENDZITE_SHARD)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.REFINED_ENDZITE_SHARD), conditionsFromItem(ModItems.REFINED_ENDZITE_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ENDZITE_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDZITE_PICKAXE, 1)
                .pattern("EEE")
                .pattern(" S ")
                .pattern(" S ")
                .input('E', ModItems.ENDZITE_SHARD)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.REFINED_ENDZITE_SHARD), conditionsFromItem(ModItems.REFINED_ENDZITE_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ENDZITE_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDZITE_AXE, 1)
                .pattern("EE")
                .pattern("SE")
                .pattern("S ")
                .input('E', ModItems.ENDZITE_SHARD)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.REFINED_ENDZITE_SHARD), conditionsFromItem(ModItems.REFINED_ENDZITE_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ENDZITE_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDZITE_SHOVEL, 1)
                .pattern("E")
                .pattern("S")
                .pattern("S")
                .input('E', ModItems.ENDZITE_SHARD)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.REFINED_ENDZITE_SHARD), conditionsFromItem(ModItems.REFINED_ENDZITE_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ENDZITE_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDZITE_HOE, 1)
                .pattern("EE")
                .pattern("S ")
                .pattern("S ")
                .input('E', ModItems.ENDZITE_SHARD)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.REFINED_ENDZITE_SHARD), conditionsFromItem(ModItems.REFINED_ENDZITE_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ENDZITE_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.EMPTY_CAN, 1)
                .pattern("IBI")
                .pattern(" I ")
                .input('I', Items.IRON_INGOT)
                .input('B', Items.GLASS_BOTTLE)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EMPTY_CAN)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_NOVAS_DREAM, 1)
                .input(ModItems.REFINED_ENDZITE_SHARD)
                .input(ItemTags.MUSIC_DISCS)
                .criterion(hasItem(ModItems.REFINED_ENDZITE_SHARD), conditionsFromItem(ModItems.REFINED_ENDZITE_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MUSIC_DISC_NOVAS_DREAM)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CAN_OF_BEANS, 1)
                .input(ModItems.EMPTY_CAN)
                .input(ModItems.BEANIUM_INGOT)
                .criterion(hasItem(ModItems.EMPTY_CAN), conditionsFromItem(ModItems.EMPTY_CAN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CAN_OF_BEANS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ENDZITE_ENRICHED_SLAB, ModBlocks.ENDZITE_ENRICHED_PLANKS);
        offerPressurePlateRecipe(exporter, ModBlocks.ENDZITE_ENRICHED_PRESSURE_PLATE, ModBlocks.ENDZITE_ENRICHED_PLANKS);
        createTrapdoorRecipe(ModBlocks.ENDZITE_ENRICHED_TRAPDOOR, Ingredient.ofItems(ModBlocks.ENDZITE_ENRICHED_PLANKS))
                .criterion(hasItem(ModBlocks.ENDZITE_ENRICHED_PLANKS), conditionsFromItem(ModBlocks.ENDZITE_ENRICHED_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ENDZITE_ENRICHED_TRAPDOOR)));
        createDoorRecipe(ModBlocks.ENDZITE_ENRICHED_DOOR, Ingredient.ofItems(ModBlocks.ENDZITE_ENRICHED_PLANKS))
                .criterion(hasItem(ModBlocks.ENDZITE_ENRICHED_PLANKS), conditionsFromItem(ModBlocks.ENDZITE_ENRICHED_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ENDZITE_ENRICHED_DOOR)));
        createFenceRecipe(ModBlocks.ENDZITE_ENRICHED_FENCE, Ingredient.ofItems(ModBlocks.ENDZITE_ENRICHED_PLANKS))
                .criterion(hasItem(ModBlocks.ENDZITE_ENRICHED_PLANKS), conditionsFromItem(ModBlocks.ENDZITE_ENRICHED_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ENDZITE_ENRICHED_FENCE)));
        createFenceGateRecipe(ModBlocks.ENDZITE_ENRICHED_FENCE_GATE, Ingredient.ofItems(ModBlocks.ENDZITE_ENRICHED_PLANKS))
                .criterion(hasItem(ModBlocks.ENDZITE_ENRICHED_PLANKS), conditionsFromItem(ModBlocks.ENDZITE_ENRICHED_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ENDZITE_ENRICHED_FENCE_GATE)));
        createStairsRecipe(ModBlocks.ENDZITE_ENRICHED_STAIRS, Ingredient.ofItems(ModBlocks.ENDZITE_ENRICHED_PLANKS))
                .criterion(hasItem(ModBlocks.ENDZITE_ENRICHED_PLANKS), conditionsFromItem(ModBlocks.ENDZITE_ENRICHED_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ENDZITE_ENRICHED_STAIRS)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ENDZITE_ENRICHED_BUTTON, 1)
                .input(ModBlocks.ENDZITE_ENRICHED_PLANKS)
                .criterion(hasItem(ModBlocks.ENDZITE_ENRICHED_PLANKS), conditionsFromItem(ModBlocks.ENDZITE_ENRICHED_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ENDZITE_ENRICHED_BUTTON)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ENDZITE_ENRICHED_PLANKS, 4)
                .input(ModTags.Items.ENRICHED_ENDZITE_LOG)
                .criterion(hasItem(ModBlocks.ENDZITE_ENRICHED_LOG), conditionsFromItem(ModBlocks.ENDZITE_ENRICHED_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ENDZITE_ENRICHED_PLANKS)));



    }
}

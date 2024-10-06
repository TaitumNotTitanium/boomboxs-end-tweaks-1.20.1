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

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.ENDZITE_SHARD, RecipeCategory.MISC, ModBlocks.ENDZITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.REFINED_ENDZITE_SHARD, RecipeCategory.MISC, ModBlocks.REFINED_ENDZITE_BLOCK);

        offerBlasting(exporter, REFINED_ENDZITE_SHARD_BLASTABLES, RecipeCategory.MISC, ModItems.REFINED_ENDZITE_SHARD, 10, 1000, "refined_endzite_shard");

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

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_NOVAS_DREAM, 1)
                .input(ModItems.REFINED_ENDZITE_SHARD)
                .input(ItemTags.MUSIC_DISCS)
                .criterion(hasItem(ModItems.REFINED_ENDZITE_SHARD), conditionsFromItem(ModItems.REFINED_ENDZITE_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MUSIC_DISC_NOVAS_DREAM)));

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

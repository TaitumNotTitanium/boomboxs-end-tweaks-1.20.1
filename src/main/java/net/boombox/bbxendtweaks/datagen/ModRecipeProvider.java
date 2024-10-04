package net.boombox.bbxendtweaks.datagen;

import net.boombox.bbxendtweaks.Block.ModBlocks;
import net.boombox.bbxendtweaks.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.ENDZITE_SHARD, RecipeCategory.MISC, ModBlocks.ENDZITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.REFINED_ENDZITE_SHARD, RecipeCategory.MISC, ModBlocks.REFINED_ENDZITE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LINKING_TOOL, 1)
                .pattern("  B")
                .pattern(" R ")
                .pattern("B  ")
                .input('B', ModItems.ENDZITE_SHARD)
                .input('R', ModItems.REFINED_ENDZITE_SHARD)
                .criterion(hasItem(ModItems.REFINED_ENDZITE_SHARD), conditionsFromItem(ModItems.REFINED_ENDZITE_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LINKING_TOOL)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MUSIC_DISC_NOVAS_DREAM, 1)
                .input(ModItems.REFINED_ENDZITE_SHARD)
                .input(ItemTags.MUSIC_DISCS)
                .criterion(hasItem(ModItems.REFINED_ENDZITE_SHARD), conditionsFromItem(ModItems.REFINED_ENDZITE_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MUSIC_DISC_NOVAS_DREAM)));
    }
}

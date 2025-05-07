package net.dakji.purpuradditions.datagen;

import net.dakji.purpuradditions.block.PABlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class PARecipeProvider extends RecipeProvider implements IConditionBuilder {
    public PARecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
    }

    private void addStonecuttingRecipe(RecipeOutput recipeOutput, Block input, Block output) {
        String inputName = BuiltInRegistries.BLOCK.getKey(input).getPath();
        String outputName = BuiltInRegistries.BLOCK.getKey(output).getPath();

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(input),
                        RecipeCategory.BUILDING_BLOCKS,
                        output,
                        outputName.contains("slab") ? 2 : 1)
                .unlockedBy("has_" + inputName, has(input))
                .save(recipeOutput, outputName + "_from_" + inputName + "_stonecutting");
    }
}

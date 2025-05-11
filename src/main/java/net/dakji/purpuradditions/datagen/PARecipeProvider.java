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
        // ---- PURPUR STONE RECIPES ---- //
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PABlocks.PURPUR_STONE.get(), 2)
                .pattern("PC")
                .pattern("CP")
                .define('P', Items.POPPED_CHORUS_FRUIT)
                .define('C', Items.COBBLESTONE)
                .unlockedBy("has_popped_chorus_fruit", has(Items.POPPED_CHORUS_FRUIT)).save(recipeOutput);

        stairBuilder(PABlocks.PURPUR_STONE_STAIRS.get(), Ingredient.of(PABlocks.PURPUR_STONE)).group("purpur_stone")
                .unlockedBy("has_purpur_stone", has(PABlocks.PURPUR_STONE.get())).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, PABlocks.PURPUR_STONE_SLAB.get(), PABlocks.PURPUR_STONE.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS,PABlocks.PURPUR_STONE_WALL.get(), PABlocks.PURPUR_STONE.get());

        // ---- DARK PURPUR STONE RECIPES ---- /
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PABlocks.DARK_PURPUR_STONE.get(), 8)
                .pattern("PPP")
                .pattern("PDP")
                .pattern("PPP")
                .define('P', PABlocks.PURPUR_STONE)
                .define('D', Items.BLACK_DYE)
                .unlockedBy("has_purpur_stone", has(PABlocks.PURPUR_STONE)).save(recipeOutput);

        stairBuilder(PABlocks.DARK_PURPUR_STONE_STAIRS.get(), Ingredient.of(PABlocks.DARK_PURPUR_STONE)).group("dark_purpur_stone")
                .unlockedBy("has_dark_purpur_stone", has(PABlocks.DARK_PURPUR_STONE.get())).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, PABlocks.DARK_PURPUR_STONE_SLAB.get(), PABlocks.DARK_PURPUR_STONE.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS,PABlocks.DARK_PURPUR_STONE_WALL.get(), PABlocks.DARK_PURPUR_STONE.get());

        // ---- DARK PURPUR STONE BRICKS RECIPES ---- /
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PABlocks.DARK_PURPUR_STONE_BRICKS.get(), 4)
                .pattern("PP")
                .pattern("PP")
                .define('P', PABlocks.DARK_PURPUR_STONE)
                .unlockedBy("has_dark_purpur_stone", has(PABlocks.DARK_PURPUR_STONE)).save(recipeOutput);

        stairBuilder(PABlocks.DARK_PURPUR_STONE_BRICK_STAIRS.get(), Ingredient.of(PABlocks.DARK_PURPUR_STONE_BRICKS)).group("dark_purpur_stone_bricks")
                .unlockedBy("has_dark_purpur_stone_bricks", has(PABlocks.DARK_PURPUR_STONE_BRICKS.get())).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, PABlocks.DARK_PURPUR_STONE_BRICK_SLAB.get(), PABlocks.DARK_PURPUR_STONE_BRICKS.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS,PABlocks.DARK_PURPUR_STONE_BRICK_WALL.get(), PABlocks.DARK_PURPUR_STONE_BRICKS.get());

        // ---- DARK PURPUR STONE TILES RECIPES ---- /
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PABlocks.DARK_PURPUR_STONE_TILES.get(), 4)
                .pattern("PP")
                .pattern("PP")
                .define('P', PABlocks.DARK_PURPUR_STONE_BRICKS)
                .unlockedBy("has_dark_purpur_stone_bricks", has(PABlocks.DARK_PURPUR_STONE_BRICKS)).save(recipeOutput);

        stairBuilder(PABlocks.DARK_PURPUR_STONE_TILE_STAIRS.get(), Ingredient.of(PABlocks.DARK_PURPUR_STONE_TILES)).group("dark_purpur_stone_tiles")
                .unlockedBy("has_dark_purpur_stone_tiles", has(PABlocks.DARK_PURPUR_STONE_TILES.get())).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, PABlocks.DARK_PURPUR_STONE_TILE_SLAB.get(), PABlocks.DARK_PURPUR_STONE_TILES.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS,PABlocks.DARK_PURPUR_STONE_TILE_WALL.get(), PABlocks.DARK_PURPUR_STONE_TILES.get());

        // ---- PURPUR SHROOMLIGHT RECIPE ---- //
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PABlocks.PURPUR_SHROOMLIGHT.get())
                .pattern("PS")
                .define('P', Items.POPPED_CHORUS_FRUIT)
                .define('S', Items.SHROOMLIGHT)
                .unlockedBy("has_popped_chorus_fruit", has(Items.POPPED_CHORUS_FRUIT)).save(recipeOutput);

        // ---- STONE CUTTING RECIPES ---- //
        addStonecuttingRecipe(recipeOutput, PABlocks.PURPUR_STONE.get(), PABlocks.PURPUR_STONE_STAIRS.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.PURPUR_STONE.get(), PABlocks.PURPUR_STONE_SLAB.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.PURPUR_STONE.get(), PABlocks.PURPUR_STONE_WALL.get());

        addStonecuttingRecipe(recipeOutput, PABlocks.DARK_PURPUR_STONE.get(), PABlocks.DARK_PURPUR_STONE_STAIRS.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.DARK_PURPUR_STONE.get(), PABlocks.DARK_PURPUR_STONE_SLAB.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.DARK_PURPUR_STONE.get(), PABlocks.DARK_PURPUR_STONE_WALL.get());

        addStonecuttingRecipe(recipeOutput, PABlocks.DARK_PURPUR_STONE.get(), PABlocks.DARK_PURPUR_STONE_BRICKS.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.DARK_PURPUR_STONE.get(), PABlocks.DARK_PURPUR_STONE_BRICK_STAIRS.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.DARK_PURPUR_STONE.get(), PABlocks.DARK_PURPUR_STONE_BRICK_SLAB.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.DARK_PURPUR_STONE.get(), PABlocks.DARK_PURPUR_STONE_BRICK_WALL.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.DARK_PURPUR_STONE_BRICKS.get(), PABlocks.DARK_PURPUR_STONE_BRICK_STAIRS.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.DARK_PURPUR_STONE_BRICKS.get(), PABlocks.DARK_PURPUR_STONE_BRICK_SLAB.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.DARK_PURPUR_STONE_BRICKS.get(), PABlocks.DARK_PURPUR_STONE_BRICK_WALL.get());

        addStonecuttingRecipe(recipeOutput, PABlocks.DARK_PURPUR_STONE.get(), PABlocks.DARK_PURPUR_STONE_TILES.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.DARK_PURPUR_STONE.get(), PABlocks.DARK_PURPUR_STONE_TILE_STAIRS.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.DARK_PURPUR_STONE.get(), PABlocks.DARK_PURPUR_STONE_TILE_SLAB.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.DARK_PURPUR_STONE.get(), PABlocks.DARK_PURPUR_STONE_TILE_WALL.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.DARK_PURPUR_STONE_BRICKS.get(), PABlocks.DARK_PURPUR_STONE_TILES.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.DARK_PURPUR_STONE_BRICKS.get(), PABlocks.DARK_PURPUR_STONE_TILE_STAIRS.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.DARK_PURPUR_STONE_BRICKS.get(), PABlocks.DARK_PURPUR_STONE_TILE_SLAB.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.DARK_PURPUR_STONE_BRICKS.get(), PABlocks.DARK_PURPUR_STONE_TILE_WALL.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.DARK_PURPUR_STONE_TILES.get(), PABlocks.DARK_PURPUR_STONE_TILE_STAIRS.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.DARK_PURPUR_STONE_TILES.get(), PABlocks.DARK_PURPUR_STONE_TILE_SLAB.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.DARK_PURPUR_STONE_TILES.get(), PABlocks.DARK_PURPUR_STONE_TILE_WALL.get());
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

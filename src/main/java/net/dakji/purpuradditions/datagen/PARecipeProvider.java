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
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, PABlocks.PURPUR_STONE.get(), 2)
                .pattern("PC")
                .pattern("CP")
                .define('P', Items.POPPED_CHORUS_FRUIT)
                .define('C', Items.COBBLESTONE)
                .unlockedBy("has_popped_chorus_fruit", has(Items.POPPED_CHORUS_FRUIT)).save(recipeOutput);

        stairBuilder(PABlocks.PURPUR_STONE_STAIRS.get(), Ingredient.of(PABlocks.PURPUR_STONE)).group("purpur_stone")
                .unlockedBy("has_purpur_stone", has(PABlocks.PURPUR_STONE.get())).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, PABlocks.PURPUR_STONE_SLAB.get(), PABlocks.PURPUR_STONE.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS,PABlocks.PURPUR_STONE_WALL.get(), PABlocks.PURPUR_STONE.get());

        // ---- POLISHED PURPUR STONE RECIPES ---- //
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, PABlocks.POLISHED_PURPUR_STONE.get(), 4)
                .pattern("PP")
                .pattern("PP")
                .define('P', PABlocks.PURPUR_STONE)
                .unlockedBy("has_purpur_stone", has(PABlocks.PURPUR_STONE)).save(recipeOutput);

        stairBuilder(PABlocks.POLISHED_PURPUR_STONE_STAIRS.get(), Ingredient.of(PABlocks.POLISHED_PURPUR_STONE)).group("polished_purpur_stone")
                .unlockedBy("has_polished_purpur_stone", has(PABlocks.POLISHED_PURPUR_STONE.get())).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, PABlocks.POLISHED_PURPUR_STONE_SLAB.get(), PABlocks.POLISHED_PURPUR_STONE.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS,PABlocks.POLISHED_PURPUR_STONE_WALL.get(), PABlocks.POLISHED_PURPUR_STONE.get());

        // ---- PURPUR STONE BRICKS RECIPES ---- //
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, PABlocks.PURPUR_STONE_BRICKS.get(), 4)
                .pattern("PP")
                .pattern("PP")
                .define('P', PABlocks.POLISHED_PURPUR_STONE)
                .unlockedBy("has_polished_purpur_stone", has(PABlocks.POLISHED_PURPUR_STONE)).save(recipeOutput);

        stairBuilder(PABlocks.PURPUR_STONE_BRICK_STAIRS.get(), Ingredient.of(PABlocks.PURPUR_STONE_BRICKS)).group("purpur_stone_bricks")
                .unlockedBy("has_purpur_stone_bricks", has(PABlocks.PURPUR_STONE_BRICKS.get())).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, PABlocks.PURPUR_STONE_BRICK_SLAB.get(), PABlocks.PURPUR_STONE_BRICKS.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS,PABlocks.PURPUR_STONE_BRICK_WALL.get(), PABlocks.PURPUR_STONE_BRICKS.get());

        // ---- PURPUR STONE TILES RECIPES ---- /
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PABlocks.PURPUR_STONE_TILES.get(), 4)
                .pattern("PP")
                .pattern("PP")
                .define('P', PABlocks.PURPUR_STONE_BRICKS)
                .unlockedBy("has_purpur_stone_bricks", has(PABlocks.PURPUR_STONE_BRICKS)).save(recipeOutput);

        stairBuilder(PABlocks.PURPUR_STONE_TILE_STAIRS.get(), Ingredient.of(PABlocks.PURPUR_STONE_TILES)).group("purpur_stone_tiles")
                .unlockedBy("has_purpur_stone_tiles", has(PABlocks.PURPUR_STONE_TILES.get())).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, PABlocks.PURPUR_STONE_TILE_SLAB.get(), PABlocks.PURPUR_STONE_TILES.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS,PABlocks.PURPUR_STONE_TILE_WALL.get(), PABlocks.PURPUR_STONE_TILES.get());

        // ---- DARK PURPUR STONE RECIPES ---- /
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, PABlocks.DARK_PURPUR_STONE.get(), 8)
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


        // ---- POLISHED DARK PURPUR STONE RECIPES ---- /
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, PABlocks.POLISHED_DARK_PURPUR_STONE.get(), 4)
                .pattern("PP")
                .pattern("PP")
                .define('P', PABlocks.DARK_PURPUR_STONE)
                .unlockedBy("has_dark_purpur_stone", has(PABlocks.DARK_PURPUR_STONE)).save(recipeOutput);

        stairBuilder(PABlocks.POLISHED_DARK_PURPUR_STONE_STAIRS.get(), Ingredient.of(PABlocks.POLISHED_DARK_PURPUR_STONE)).group("polished_dark_purpur_stone")
                .unlockedBy("has_polished_dark_purpur_stone", has(PABlocks.POLISHED_DARK_PURPUR_STONE.get())).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, PABlocks.POLISHED_DARK_PURPUR_STONE_SLAB.get(), PABlocks.POLISHED_DARK_PURPUR_STONE.get());
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS,PABlocks.POLISHED_DARK_PURPUR_STONE_WALL.get(), PABlocks.POLISHED_DARK_PURPUR_STONE.get());


        // ---- DARK PURPUR STONE BRICKS RECIPES ---- /
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, PABlocks.DARK_PURPUR_STONE_BRICKS.get(), 4)
                .pattern("PP")
                .pattern("PP")
                .define('P', PABlocks.POLISHED_DARK_PURPUR_STONE)
                .unlockedBy("has_polished_dark_purpur_stone", has(PABlocks.POLISHED_DARK_PURPUR_STONE)).save(recipeOutput);

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
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, PABlocks.PURPUR_SHROOMLIGHT.get())
                .pattern("PS")
                .define('P', Items.POPPED_CHORUS_FRUIT)
                .define('S', Items.SHROOMLIGHT)
                .unlockedBy("has_popped_chorus_fruit", has(Items.POPPED_CHORUS_FRUIT)).save(recipeOutput);

        // ---- PURPUR GLOWSTONE RECIPE ---- //
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, PABlocks.PURPUR_GLOWSTONE.get())
                .pattern("PG")
                .define('P', Items.POPPED_CHORUS_FRUIT)
                .define('G', Items.GLOWSTONE)
                .unlockedBy("has_glowstone", has(Items.GLOWSTONE)).save(recipeOutput);


        // ---- STONE CUTTING RECIPES ---- //
        addStonecuttingRecipe(recipeOutput, PABlocks.PURPUR_STONE.get(), null, PABlocks.PURPUR_STONE_STAIRS.get(), PABlocks.PURPUR_STONE_SLAB.get(), PABlocks.PURPUR_STONE_WALL.get());

        addStonecuttingRecipe(recipeOutput, PABlocks.PURPUR_STONE.get(), PABlocks.POLISHED_PURPUR_STONE.get(), PABlocks.POLISHED_PURPUR_STONE_STAIRS.get(), PABlocks.POLISHED_PURPUR_STONE_SLAB.get(), PABlocks.POLISHED_PURPUR_STONE_WALL.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.POLISHED_PURPUR_STONE.get(), null, PABlocks.POLISHED_PURPUR_STONE_STAIRS.get(), PABlocks.POLISHED_PURPUR_STONE_SLAB.get(), PABlocks.POLISHED_PURPUR_STONE_WALL.get());

        addStonecuttingRecipe(recipeOutput, PABlocks.PURPUR_STONE.get(), PABlocks.PURPUR_STONE_BRICKS.get(), PABlocks.PURPUR_STONE_BRICK_STAIRS.get(), PABlocks.PURPUR_STONE_BRICK_SLAB.get(), PABlocks.PURPUR_STONE_BRICK_WALL.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.POLISHED_PURPUR_STONE.get(), PABlocks.PURPUR_STONE_BRICKS.get(), PABlocks.PURPUR_STONE_BRICK_STAIRS.get(), PABlocks.PURPUR_STONE_BRICK_SLAB.get(), PABlocks.PURPUR_STONE_BRICK_WALL.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.PURPUR_STONE_BRICKS.get(), null, PABlocks.PURPUR_STONE_BRICK_STAIRS.get(), PABlocks.PURPUR_STONE_BRICK_SLAB.get(), PABlocks.PURPUR_STONE_BRICK_WALL.get());

        addStonecuttingRecipe(recipeOutput, PABlocks.PURPUR_STONE.get(), PABlocks.PURPUR_STONE_TILES.get(), PABlocks.PURPUR_STONE_TILE_STAIRS.get(), PABlocks.PURPUR_STONE_TILE_SLAB.get(), PABlocks.PURPUR_STONE_TILE_WALL.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.POLISHED_PURPUR_STONE.get(), PABlocks.PURPUR_STONE_TILES.get(), PABlocks.PURPUR_STONE_TILE_STAIRS.get(), PABlocks.PURPUR_STONE_TILE_SLAB.get(), PABlocks.PURPUR_STONE_TILE_WALL.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.PURPUR_STONE_BRICKS.get(), PABlocks.PURPUR_STONE_TILES.get(), PABlocks.PURPUR_STONE_TILE_STAIRS.get(), PABlocks.PURPUR_STONE_TILE_SLAB.get(), PABlocks.PURPUR_STONE_TILE_WALL.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.PURPUR_STONE_TILES.get(), null, PABlocks.PURPUR_STONE_TILE_STAIRS.get(), PABlocks.PURPUR_STONE_TILE_SLAB.get(), PABlocks.PURPUR_STONE_TILE_WALL.get());

        addStonecuttingRecipe(recipeOutput, PABlocks.DARK_PURPUR_STONE.get(), null, PABlocks.DARK_PURPUR_STONE_STAIRS.get(), PABlocks.DARK_PURPUR_STONE_SLAB.get(), PABlocks.DARK_PURPUR_STONE_WALL.get());

        addStonecuttingRecipe(recipeOutput, PABlocks.DARK_PURPUR_STONE.get(), PABlocks.POLISHED_DARK_PURPUR_STONE.get(), PABlocks.POLISHED_DARK_PURPUR_STONE_STAIRS.get(), PABlocks.POLISHED_DARK_PURPUR_STONE_SLAB.get(), PABlocks.POLISHED_DARK_PURPUR_STONE_WALL.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.POLISHED_DARK_PURPUR_STONE.get(), null, PABlocks.POLISHED_DARK_PURPUR_STONE_STAIRS.get(), PABlocks.POLISHED_DARK_PURPUR_STONE_SLAB.get(), PABlocks.POLISHED_DARK_PURPUR_STONE_WALL.get());

        addStonecuttingRecipe(recipeOutput, PABlocks.DARK_PURPUR_STONE.get(), PABlocks.DARK_PURPUR_STONE_BRICKS.get(), PABlocks.DARK_PURPUR_STONE_BRICK_STAIRS.get(), PABlocks.DARK_PURPUR_STONE_BRICK_SLAB.get(), PABlocks.DARK_PURPUR_STONE_BRICK_WALL.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.POLISHED_DARK_PURPUR_STONE.get(), PABlocks.DARK_PURPUR_STONE_BRICKS.get(), PABlocks.DARK_PURPUR_STONE_BRICK_STAIRS.get(), PABlocks.DARK_PURPUR_STONE_BRICK_SLAB.get(), PABlocks.DARK_PURPUR_STONE_BRICK_WALL.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.DARK_PURPUR_STONE_BRICKS.get(), null, PABlocks.DARK_PURPUR_STONE_BRICK_STAIRS.get(), PABlocks.DARK_PURPUR_STONE_BRICK_SLAB.get(), PABlocks.DARK_PURPUR_STONE_BRICK_WALL.get());

        addStonecuttingRecipe(recipeOutput, PABlocks.DARK_PURPUR_STONE.get(), PABlocks.DARK_PURPUR_STONE_TILES.get(), PABlocks.DARK_PURPUR_STONE_TILE_STAIRS.get(), PABlocks.DARK_PURPUR_STONE_TILE_SLAB.get(), PABlocks.DARK_PURPUR_STONE_TILE_WALL.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.POLISHED_DARK_PURPUR_STONE.get(), PABlocks.DARK_PURPUR_STONE_TILES.get(), PABlocks.DARK_PURPUR_STONE_TILE_STAIRS.get(), PABlocks.DARK_PURPUR_STONE_TILE_SLAB.get(), PABlocks.DARK_PURPUR_STONE_TILE_WALL.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.DARK_PURPUR_STONE_BRICKS.get(), PABlocks.DARK_PURPUR_STONE_TILES.get(), PABlocks.DARK_PURPUR_STONE_TILE_STAIRS.get(), PABlocks.DARK_PURPUR_STONE_TILE_SLAB.get(), PABlocks.DARK_PURPUR_STONE_TILE_WALL.get());
        addStonecuttingRecipe(recipeOutput, PABlocks.DARK_PURPUR_STONE_TILES.get(), null, PABlocks.DARK_PURPUR_STONE_TILE_STAIRS.get(), PABlocks.DARK_PURPUR_STONE_TILE_SLAB.get(), PABlocks.DARK_PURPUR_STONE_TILE_WALL.get());
    }

    private void addStonecuttingRecipe(RecipeOutput recipeOutput, Block input, Block block, Block stairs, Block slab, Block wall) {
        String inputName = BuiltInRegistries.BLOCK.getKey(input).getPath();
        String outputName = "_from_" + inputName + "_stonecutting";

        if (block != null) {
            SingleItemRecipeBuilder.stonecutting(
                            Ingredient.of(input),
                            RecipeCategory.BUILDING_BLOCKS,
                            block)
                    .unlockedBy("has_" + inputName, has(input))
                    .save(recipeOutput, BuiltInRegistries.BLOCK.getKey(block).getPath() + outputName);
        }

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(input),
                        RecipeCategory.BUILDING_BLOCKS,
                        slab,
                        2)
                .unlockedBy("has_" + inputName, has(input))
                .save(recipeOutput, BuiltInRegistries.BLOCK.getKey(slab).getPath() + outputName);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(input),
                        RecipeCategory.BUILDING_BLOCKS,
                        stairs)
                .unlockedBy("has_" + inputName, has(input))
                .save(recipeOutput, BuiltInRegistries.BLOCK.getKey(stairs).getPath() + outputName);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(input),
                        RecipeCategory.BUILDING_BLOCKS,
                        wall)
                .unlockedBy("has_" + inputName, has(input))
                .save(recipeOutput, BuiltInRegistries.BLOCK.getKey(wall).getPath() + outputName);
    }
}

package net.dakji.purpurexpansion.datagen;

import net.dakji.purpurexpansion.PurpurExpansion;
import net.dakji.purpurexpansion.block.PEBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class PEItemModelProvider extends ItemModelProvider {
    public PEItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PurpurExpansion.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        wallItem(PEBlocks.PURPUR_STONE_WALL, PEBlocks.PURPUR_STONE);
        wallItem(PEBlocks.POLISHED_PURPUR_STONE_WALL, PEBlocks.POLISHED_PURPUR_STONE);
        wallItem(PEBlocks.PURPUR_STONE_BRICK_WALL, PEBlocks.PURPUR_STONE_BRICKS);
        wallItem(PEBlocks.PURPUR_STONE_TILE_WALL, PEBlocks.PURPUR_STONE_TILES);
        wallItem(PEBlocks.DARK_PURPUR_STONE_WALL, PEBlocks.DARK_PURPUR_STONE);
        wallItem(PEBlocks.POLISHED_DARK_PURPUR_STONE_WALL, PEBlocks.POLISHED_DARK_PURPUR_STONE);
        wallItem(PEBlocks.DARK_PURPUR_STONE_BRICK_WALL, PEBlocks.DARK_PURPUR_STONE_BRICKS);
        wallItem(PEBlocks.DARK_PURPUR_STONE_TILE_WALL, PEBlocks.DARK_PURPUR_STONE_TILES);
    }

    public void wallItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", ResourceLocation.fromNamespaceAndPath(PurpurExpansion.MODID,
                        "block/" + baseBlock.getId().getPath()));
    }
}

package net.dakji.purpuradditions.datagen;

import net.dakji.purpuradditions.PurpurAdditions;
import net.dakji.purpuradditions.block.PABlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class PAItemModelProvider extends ItemModelProvider {
    public PAItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PurpurAdditions.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        wallItem(PABlocks.PURPUR_STONE_WALL, PABlocks.PURPUR_STONE);
        wallItem(PABlocks.DARK_PURPUR_STONE_WALL, PABlocks.DARK_PURPUR_STONE);
        wallItem(PABlocks.POLISHED_DARK_PURPUR_STONE_WALL, PABlocks.POLISHED_DARK_PURPUR_STONE);
        wallItem(PABlocks.DARK_PURPUR_STONE_BRICK_WALL, PABlocks.DARK_PURPUR_STONE_BRICKS);
        wallItem(PABlocks.DARK_PURPUR_STONE_TILE_WALL, PABlocks.DARK_PURPUR_STONE_TILES);
    }

    public void wallItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", ResourceLocation.fromNamespaceAndPath(PurpurAdditions.MODID,
                        "block/" + baseBlock.getId().getPath()));
    }
}

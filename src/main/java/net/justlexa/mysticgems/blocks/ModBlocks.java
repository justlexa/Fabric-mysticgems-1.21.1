package net.justlexa.mysticgems.blocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.justlexa.mysticgems.MysticGems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block HEART_GEM_ORE = registerBlock("heart_gem_ore",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_CLUSTER)));

    public static final Block DEEPSLATE_HEART_GEM_ORE = registerBlock("deepslate_heart_gem_ore",
            new Block(AbstractBlock.Settings.create().strength(4.5f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_CLUSTER)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MysticGems.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MysticGems.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }



    public static void registerModBlocks() {
        MysticGems.LOGGER.info("Registering Mod Blocks for " + MysticGems.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.HEART_GEM_ORE);
            fabricItemGroupEntries.add(ModBlocks.DEEPSLATE_HEART_GEM_ORE);
        });
    }
}

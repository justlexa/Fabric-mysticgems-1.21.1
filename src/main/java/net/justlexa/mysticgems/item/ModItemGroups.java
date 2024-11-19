package net.justlexa.mysticgems.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.justlexa.mysticgems.MysticGems;
import net.justlexa.mysticgems.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MYSTIC_GEMS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MysticGems.MOD_ID, "mystic_gems_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.MYSTIC_DUST))
                    .displayName(Text.translatable("itemgroup.mysticgems.mystic_gems_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.HEART_GEM);
                        entries.add(ModItems.RAW_HEART_GEM);
                        entries.add(ModItems.MYSTIC_DUST);
                    })

                    .build());

    public static final ItemGroup MYSTIC_GEMS_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MysticGems.MOD_ID, "mystic_gems_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.HEART_GEM_ORE))
                    .displayName(Text.translatable("itemgroup.mysticgems.mystic_gems_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.HEART_GEM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_HEART_GEM_ORE);
                    })

                    .build());



    public static void registerItemGroups() {
        MysticGems.LOGGER.info("Registering Item Groups for " + MysticGems.MOD_ID);
    }
}

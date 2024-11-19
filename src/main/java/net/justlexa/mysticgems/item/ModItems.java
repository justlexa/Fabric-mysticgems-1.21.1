package net.justlexa.mysticgems.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.justlexa.mysticgems.MysticGems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAW_HEART_GEM = registerItem("raw_heart_gem", new Item(new Item.Settings()));
    public static final Item HEART_GEM = registerItem("heart_gem", new Item(new Item.Settings()));
    public static final Item MYSTIC_DUST = registerItem("mystic_dust", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MysticGems.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MysticGems.LOGGER.info("Registering Mod Items for " + MysticGems.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(RAW_HEART_GEM);
            fabricItemGroupEntries.add(HEART_GEM);
            fabricItemGroupEntries.add(MYSTIC_DUST);
        });
    }
}

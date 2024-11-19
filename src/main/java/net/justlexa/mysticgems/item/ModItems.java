package net.justlexa.mysticgems.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.justlexa.mysticgems.MysticGems;
import net.justlexa.mysticgems.item.custom.ModArmorMaterials;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MYSTIC_DUST = registerItem("mystic_dust", new Item(new Item.Settings()));


    // Heart Gem Items
    public static final Item RAW_HEART_GEM = registerItem("raw_heart_gem", new Item(new Item.Settings()));

    public static final Item HEART_GEM = registerItem("heart_gem", new Item(new Item.Settings()));

    // Heart Gem Armor
    public static final Item HEART_GEM_HELMET = registerItem("heart_gem_helmet",
            new ArmorItem(ModArmorMaterials.HEART_GEM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(22))));

    public static final Item HEART_GEM_CHESTPLATE = registerItem("heart_gem_chestplate",
            new ArmorItem(ModArmorMaterials.HEART_GEM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(22))));

    public static final Item HEART_GEM_LEGGINGS = registerItem("heart_gem_leggings",
            new ArmorItem(ModArmorMaterials.HEART_GEM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(22))));

    public static final Item HEART_GEM_BOOTS = registerItem("heart_gem_boots",
            new ArmorItem(ModArmorMaterials.HEART_GEM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(22))));

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

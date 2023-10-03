package net.xenerax.customstuff.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xenerax.customstuff.CustomStuff;
import net.xenerax.customstuff.item.custom.*;

public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));

    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));


    public static final Item RUBY_STAFF = registerItem("ruby_staff",
            new Item(new FabricItemSettings().maxCount(1)));


    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new PickaxeItem(ModToolMaterial.RUBY, 2, 2f, new FabricItemSettings()));
    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new AxeItem(ModToolMaterial.RUBY, 2, 2f, new FabricItemSettings()));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new ShovelItem(ModToolMaterial.RUBY, 2, 2f, new FabricItemSettings()));
    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new SwordItem(ModToolMaterial.RUBY, 2, 2f, new FabricItemSettings()));
    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new HoeItem(ModToolMaterial.RUBY, 2, 2f, new FabricItemSettings()));


    public static final Item BLOOD_SWORD = registerItem("blood_sword",
            new BleedSwordItem(ModToolMaterial.BLOOD, 8, -2.4f, new FabricItemSettings()));
    public static final Item DRAGON_SWORD = registerItem("dragon_sword",
            new DragonSwordItem(ModToolMaterial.DRAGON, 8, -2.4f, new FabricItemSettings()));
    public static final Item ROTT_SCYTHE = registerItem("rott_scythe",
            new RottScytheItem(ModToolMaterial.ROTT, 14, -3.2f, new FabricItemSettings()));



    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item COPPER_HELMET = registerItem("copper_helmet",
            new CopperArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate",
            new CopperArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings",
            new CopperArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item COPPER_BOOTS = registerItem("copper_boots",
            new CopperArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new FabricItemSettings()));


    public static final Item CUSTOMIZATION_TEMPLATE = registerItem("customization_template", new Item(new FabricItemSettings()));

    public static final Item COPPER_PLATE = registerItem("copper_plate", new Item(new FabricItemSettings()));
    public static final Item IRON_BOLT = registerItem("iron_bolt", new Item(new FabricItemSettings()));
    public static final Item REINFORCED_COPPER_PLATE = registerItem("reinforced_copper_plate", new Item(new FabricItemSettings()));
    public static final Item HARDENED_REINFORCED_COPPER_PLATE = registerItem("hardened_reinforced_copper_plate", new Item(new FabricItemSettings()));
    public static final Item WHETSTONE = registerItem("whetstone", new Item(new FabricItemSettings()));
    public static final Item BLOODY_WHETSTONE = registerItem("bloody_whetstone", new Item(new FabricItemSettings()));
    public static final Item BLOOD_CLOTT = registerItem("blood_clott", new Item(new FabricItemSettings()));



    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {

    }

    private static  void  addItemsToCombatItemGroup(FabricItemGroupEntries entries){

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CustomStuff.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CustomStuff.LOGGER.info("Registering Mod Items for " + CustomStuff.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
    }
}

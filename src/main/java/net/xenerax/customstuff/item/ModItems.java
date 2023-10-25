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
import net.xenerax.customstuff.item.custom.AncientXeneriteArmor.AncientXeneriteBootsItem;
import net.xenerax.customstuff.item.custom.AncientXeneriteArmor.AncientXeneriteChestItem;
import net.xenerax.customstuff.item.custom.AncientXeneriteArmor.AncientXeneriteHelmetItem;
import net.xenerax.customstuff.item.custom.AncientXeneriteArmor.AncientXeneriteLeggingsItem;
import net.xenerax.customstuff.item.custom.XeneriteArmor.XeneriteBootsItem;
import net.xenerax.customstuff.item.custom.XeneriteArmor.XeneriteChestItem;
import net.xenerax.customstuff.item.custom.XeneriteArmor.XeneriteHelmetItem;
import net.xenerax.customstuff.item.custom.XeneriteArmor.XeneriteLeggingsItem;

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


    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new FabricItemSettings()));






    //weapons
    public static final Item BLOOD_SWORD = registerItem("blood_sword",
            new BleedSwordItem(ModToolMaterial.BLOOD, 8, -2.4f, new FabricItemSettings()));
    public static final Item DRAGON_SWORD = registerItem("dragon_sword",
            new DragonSwordItem(ModToolMaterial.DRAGON, 8, -2.4f, new FabricItemSettings()));
    public static final Item ROTT_SCYTHE = registerItem("rott_scythe",
            new RottScytheItem(ModToolMaterial.ROTT, 14, -3.2f, new FabricItemSettings()));
    public static final Item MEOWMERE = registerItem("meowmere",
            new MeowmereItem(ModToolMaterial.CAT, 7, -2f, new FabricItemSettings()));
    public static final Item IMYLDRIEN = registerItem("imyldrien",
            new ImyldrienItem(ModToolMaterial.IMYLDRIEN, 7, -2f, new FabricItemSettings()));


    //armor
    public static final Item COPPER_HELMET = registerItem("copper_helmet",
            new CopperArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate",
            new CopperArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings",
            new CopperArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item COPPER_BOOTS = registerItem("copper_boots",
            new CopperArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item XENERITE_HELMET = registerItem("xenerite_helmet",
            new XeneriteHelmetItem(ModArmorMaterials.XENERITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item XENERITE_CHESTPLATE = registerItem("xenerite_chestplate",
            new XeneriteChestItem(ModArmorMaterials.XENERITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item XENERITE_LEGGINGS = registerItem("xenerite_leggings",
            new XeneriteLeggingsItem(ModArmorMaterials.XENERITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item XENERITE_BOOTS = registerItem("xenerite_boots",
            new XeneriteBootsItem(ModArmorMaterials.XENERITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item ANCIENT_XENERITE_HELMET = registerItem("ancient_xenerite_helmet",
            new AncientXeneriteHelmetItem(ModArmorMaterials.ANCIENT_XENERITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ANCIENT_XENERITE_CHESTPLATE = registerItem("ancient_xenerite_chestplate",
            new AncientXeneriteChestItem(ModArmorMaterials.ANCIENT_XENERITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item ANCIENT_XENERITE_LEGGINGS = registerItem("ancient_xenerite_leggings",
            new AncientXeneriteLeggingsItem(ModArmorMaterials.ANCIENT_XENERITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item ANCIENT_XENERITE_BOOTS = registerItem("ancient_xenerite_boots",
            new AncientXeneriteBootsItem(ModArmorMaterials.ANCIENT_XENERITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));


    //tools
    public static final Item XENERITE_PICKAXE = registerItem("xenerite_pickaxe",
            new PickaxeItem(ModToolMaterial.XENERITE, 0, -2.8f, new FabricItemSettings()));
    public static final Item ANCIENT_XENERITE_PICKAXE = registerItem("ancient_xenerite_pickaxe",
            new PickaxeItem(ModToolMaterial.ANCIENT_XENERITE, 0, -2.8f, new FabricItemSettings()));

    public static final Item COPPER_HAMMER = registerItem("copper_hammer",
            new HammerItem(ModToolMaterial.HR_COPPER, 0, -2.8f, new FabricItemSettings()));
    public static final Item IRON_HAMMER = registerItem("iron_hammer",
            new HammerItem(ToolMaterials.IRON, 0, -2.8f, new FabricItemSettings()));
    public static final Item DIAMOND_HAMMER = registerItem("diamond_hammer",
            new HammerItem(ToolMaterials.DIAMOND, 0, -2.8f, new FabricItemSettings()));
    public static final Item NETHERITE_HAMMER = registerItem("netherite_hammer",
            new HammerItem(ToolMaterials.NETHERITE, 0, -2.8f, new FabricItemSettings()));
    public static final Item XENERITE_HAMMER = registerItem("xenerite_hammer",
            new HammerItem(ModToolMaterial.XENERITE, 0, -2.8f, new FabricItemSettings()));
    public static final Item ANCIENT_XENERITE_HAMMER = registerItem("ancient_xenerite_hammer",
            new HammerItem(ModToolMaterial.ANCIENT_XENERITE, 0, -2.8f, new FabricItemSettings()));


    //materials
    public static final Item CUSTOMIZATION_TEMPLATE = registerItem("customization_template", new Item(new FabricItemSettings()));
    public static final Item CHROMATIC_ORB = registerItem("chromatic_orb", new Item(new FabricItemSettings()));

    public static final Item COPPER_PLATE = registerItem("copper_plate", new Item(new FabricItemSettings()));
    public static final Item IRON_BOLT = registerItem("iron_bolt", new Item(new FabricItemSettings()));
    public static final Item REINFORCED_COPPER_PLATE = registerItem("reinforced_copper_plate", new Item(new FabricItemSettings()));
    public static final Item HARDENED_REINFORCED_COPPER_PLATE = registerItem("hardened_reinforced_copper_plate", new Item(new FabricItemSettings()));
    public static final Item WHETSTONE = registerItem("whetstone", new Item(new FabricItemSettings()));
    public static final Item BLOODY_WHETSTONE = registerItem("bloody_whetstone", new Item(new FabricItemSettings()));
    public static final Item BLOOD_CLOTT = registerItem("blood_clott", new Item(new FabricItemSettings()));
    public static final Item XENERITE_INGOT = registerItem("xenerite_ingot", new Item(new FabricItemSettings()));
    public static final Item ANCIENT_XENERITE_INGOT = registerItem("ancient_xenerite_ingot", new Item(new FabricItemSettings()));
    public static final Item REINFORCED_STICK = registerItem("reinforced_stick", new Item(new FabricItemSettings()));
    public static final Item DIAMOND_HAMMER_HEAD = registerItem("diamond_hammer_head", new Item(new FabricItemSettings()));
    public static final Item DIAMOND_HAMMER_BODY = registerItem("diamond_hammer_body", new Item(new FabricItemSettings()));
    public static final Item COPPER_HAMMER_HEAD = registerItem("copper_hammer_head", new Item(new FabricItemSettings()));
    public static final Item COPPER_HAMMER_BODY = registerItem("copper_hammer_body", new Item(new FabricItemSettings()));
    public static final Item IRON_HAMMER_HEAD = registerItem("iron_hammer_head", new Item(new FabricItemSettings()));
    public static final Item IRON_HAMMER_BODY = registerItem("iron_hammer_body", new Item(new FabricItemSettings()));



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

package net.xenerax.customstuff.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.xenerax.customstuff.block.ModBlocks;
import net.xenerax.customstuff.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CUSTOMIZER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUND_BLOCK);



        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.REINFORCED_COPPER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HARDENED_REINFORCED_COPPER_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);

        itemModelGenerator.register(ModItems.RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_BOOTS));


        //weapons
        itemModelGenerator.register(ModItems.BLOOD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DRAGON_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ROTT_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MEOWMERE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IMYLDRIEN, Models.HANDHELD);

        //armor
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COPPER_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COPPER_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COPPER_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COPPER_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.XENERITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.XENERITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.XENERITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.XENERITE_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ANCIENT_XENERITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ANCIENT_XENERITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ANCIENT_XENERITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ANCIENT_XENERITE_BOOTS));

        //tools
        itemModelGenerator.register(ModItems.XENERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ANCIENT_XENERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.XENERITE_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ANCIENT_XENERITE_HAMMER, Models.HANDHELD);

        //material
        itemModelGenerator.register(ModItems.CUSTOMIZATION_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHROMATIC_ORB, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_PLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_BOLT, Models.GENERATED);
        itemModelGenerator.register(ModItems.REINFORCED_COPPER_PLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.HARDENED_REINFORCED_COPPER_PLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHETSTONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLOOD_CLOTT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLOODY_WHETSTONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.XENERITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANCIENT_XENERITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.REINFORCED_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_HAMMER_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_HAMMER_BODY, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_HAMMER_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_HAMMER_BODY, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_HAMMER_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_HAMMER_BODY, Models.GENERATED);

    }
}

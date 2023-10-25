package net.xenerax.customstuff.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.xenerax.customstuff.CustomStuff;
import net.xenerax.customstuff.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup Custom_Group = Registry.register(Registries.ITEM_GROUP, new Identifier(CustomStuff.MOD_ID, "custom"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.custom"))
                    .icon(() -> new ItemStack(ModItems.BLOOD_SWORD)).entries((displayContext, entries) -> {

                        //weapons
                        entries.add(ModItems.BLOOD_SWORD);
                        entries.add(ModItems.DRAGON_SWORD);
                        entries.add(ModItems.ROTT_SCYTHE);
                        entries.add(ModItems.MEOWMERE);
                        entries.add(ModItems.IMYLDRIEN);

                        //armor
                        entries.add(ModItems.COPPER_HELMET);
                        entries.add(ModItems.COPPER_CHESTPLATE);
                        entries.add(ModItems.COPPER_LEGGINGS);
                        entries.add(ModItems.COPPER_BOOTS);
                        entries.add(ModItems.XENERITE_HELMET);
                        entries.add(ModItems.XENERITE_CHESTPLATE);
                        entries.add(ModItems.XENERITE_LEGGINGS);
                        entries.add(ModItems.XENERITE_BOOTS);
                        entries.add(ModItems.ANCIENT_XENERITE_HELMET);
                        entries.add(ModItems.ANCIENT_XENERITE_CHESTPLATE);
                        entries.add(ModItems.ANCIENT_XENERITE_LEGGINGS);
                        entries.add(ModItems.ANCIENT_XENERITE_BOOTS);

                        //tools
                        entries.add(ModItems.XENERITE_PICKAXE);
                        entries.add(ModItems.ANCIENT_XENERITE_PICKAXE);
                        entries.add(ModItems.COPPER_HAMMER);
                        entries.add(ModItems.IRON_HAMMER);
                        entries.add(ModItems.DIAMOND_HAMMER);
                        entries.add(ModItems.NETHERITE_HAMMER);
                        entries.add(ModItems.XENERITE_HAMMER);
                        entries.add(ModItems.ANCIENT_XENERITE_HAMMER);

                        //materials
                        entries.add(ModItems.CUSTOMIZATION_TEMPLATE);
                        entries.add(ModItems.CHROMATIC_ORB);
                        entries.add(ModItems.COPPER_PLATE);
                        entries.add(ModItems.IRON_BOLT);
                        entries.add(ModItems.REINFORCED_COPPER_PLATE);
                        entries.add(ModItems.HARDENED_REINFORCED_COPPER_PLATE);
                        entries.add(ModItems.WHETSTONE);
                        entries.add(ModItems.BLOOD_CLOTT);
                        entries.add(ModItems.BLOODY_WHETSTONE);
                        entries.add(ModItems.XENERITE_INGOT);
                        entries.add(ModItems.ANCIENT_XENERITE_INGOT);
                        entries.add(ModItems.REINFORCED_STICK);
                        entries.add(ModItems.DIAMOND_HAMMER_HEAD);
                        entries.add(ModItems.DIAMOND_HAMMER_BODY);
                        entries.add(ModItems.IRON_HAMMER_HEAD);
                        entries.add(ModItems.IRON_HAMMER_BODY);
                        entries.add(ModItems.COPPER_HAMMER_HEAD);
                        entries.add(ModItems.COPPER_HAMMER_BODY);
                        entries.add(ModBlocks.REINFORCED_COPPER_BLOCK);
                        entries.add(ModBlocks.HARDENED_REINFORCED_COPPER_BLOCK);
                    }).build());


    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(CustomStuff.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);

                        entries.add(ModItems.METAL_DETECTOR);
                        entries.add(ModBlocks.SOUND_BLOCK);

                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.CUSTOMIZER_BLOCK);

                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.NETHER_RUBY_ORE);
                        entries.add(ModBlocks.END_RUBY_ORE);


                        entries.add(ModItems.RUBY_PICKAXE);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_SWORD);
                        entries.add(ModItems.RUBY_HOE);

                        entries.add(ModItems.RUBY_STAFF);


                        entries.add(ModItems.RUBY_HELMET);
                        entries.add(ModItems.RUBY_CHESTPLATE);
                        entries.add(ModItems.RUBY_LEGGINGS);
                        entries.add(ModItems.RUBY_BOOTS);

                    }).build());

    public static void registerItemGroups() {
        CustomStuff.LOGGER.info("Registering Item Groups for " + CustomStuff.MOD_ID);
    }
}

package net.xenerax.customstuff.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.PickaxeItem;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.xenerax.customstuff.block.ModBlocks;
import net.xenerax.customstuff.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> RUBY_SMELTABLES = List.of(ModItems.RAW_RUBY,
            ModBlocks.RUBY_ORE, ModBlocks.DEEPSLATE_RUBY_ORE, ModBlocks.NETHER_RUBY_ORE, ModBlocks.END_RUBY_ORE);
    private static final List<ItemConvertible> REINFORCED_COPPER_PLATE_BLASTING = List.of(ModItems.REINFORCED_COPPER_PLATE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY,
                0.7f, 200, "ruby");
        offerBlasting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY,
                0.7f, 100, "ruby");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, RecipeCategory.DECORATIONS,
                ModBlocks.RUBY_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_RUBY, 1)
                .pattern("SSS")
                .pattern("SRS")
                .pattern("SSS")
                .input('S', Items.STONE)
                .input('R', ModItems.RUBY)
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RAW_RUBY)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_PLATE, 1)
                .pattern("III")
                .pattern("III")
                .input('I', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier((getRecipeName(ModItems.COPPER_PLATE))));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRON_BOLT, 3)
                .pattern("I")
                .pattern("I")
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier((getRecipeName(ModItems.IRON_BOLT))));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.REINFORCED_COPPER_PLATE, 1)
                .pattern("BBB")
                .pattern("PPP")
                .pattern("PPP")
                .input('P', ModItems.COPPER_PLATE)
                .input('B', ModItems.IRON_BOLT)
                .criterion(hasItem(ModItems.COPPER_PLATE), conditionsFromItem(ModItems.COPPER_PLATE))
                .criterion(hasItem(ModItems.IRON_BOLT), conditionsFromItem(ModItems.IRON_BOLT))
                .offerTo(exporter, new Identifier("reinforced_copper_plate_item"));

        offerBlasting(exporter, REINFORCED_COPPER_PLATE_BLASTING, RecipeCategory.MISC, ModItems.HARDENED_REINFORCED_COPPER_PLATE,
                1f, 100, "copper");


        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_HELMET, 1)
                .pattern("PPP")
                .pattern("P P")
                .input('P', ModItems.HARDENED_REINFORCED_COPPER_PLATE)
                .criterion(hasItem(ModItems.HARDENED_REINFORCED_COPPER_PLATE), conditionsFromItem(ModItems.HARDENED_REINFORCED_COPPER_PLATE))
                .offerTo(exporter, new Identifier((getRecipeName(ModItems.COPPER_HELMET))));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_CHESTPLATE, 1)
                .pattern("P P")
                .pattern("PPP")
                .pattern("PPP")
                .input('P', ModItems.HARDENED_REINFORCED_COPPER_PLATE)
                .criterion(hasItem(ModItems.HARDENED_REINFORCED_COPPER_PLATE), conditionsFromItem(ModItems.HARDENED_REINFORCED_COPPER_PLATE))
                .offerTo(exporter, new Identifier((getRecipeName(ModItems.COPPER_CHESTPLATE))));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_LEGGINGS, 1)
                .pattern("PPP")
                .pattern("P P")
                .pattern("P P")
                .input('P', ModItems.HARDENED_REINFORCED_COPPER_PLATE)
                .criterion(hasItem(ModItems.HARDENED_REINFORCED_COPPER_PLATE), conditionsFromItem(ModItems.HARDENED_REINFORCED_COPPER_PLATE))
                .offerTo(exporter, new Identifier((getRecipeName(ModItems.COPPER_LEGGINGS))));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_BOOTS, 1)
                .pattern("P P")
                .pattern("P P")
                .input('P', ModItems.HARDENED_REINFORCED_COPPER_PLATE)
                .criterion(hasItem(ModItems.HARDENED_REINFORCED_COPPER_PLATE), conditionsFromItem(ModItems.HARDENED_REINFORCED_COPPER_PLATE))
                .offerTo(exporter, new Identifier((getRecipeName(ModItems.COPPER_BOOTS))));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLOODY_WHETSTONE, 1)
                .input(ModItems.WHETSTONE)
                .input(ModItems.BLOOD_CLOTT)
                .criterion(hasItem(ModItems.WHETSTONE), conditionsFromItem(ModItems.WHETSTONE))
                .criterion(hasItem(ModItems.BLOOD_CLOTT), conditionsFromItem(ModItems.BLOOD_CLOTT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BLOODY_WHETSTONE)));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.CUSTOMIZATION_TEMPLATE),
                        Ingredient.ofItems(Items.NETHERITE_SWORD),
                        Ingredient.ofItems(ModItems.BLOODY_WHETSTONE),
                        RecipeCategory.COMBAT,
                        ModItems.BLOOD_SWORD)
                .criterion(hasItem(ModItems.BLOODY_WHETSTONE), conditionsFromItem(ModItems.BLOODY_WHETSTONE))
                .offerTo(exporter, new Identifier((getRecipeName(ModItems.BLOOD_SWORD))));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.IRON_HAMMER, 1)
                .pattern("HBH")
                .pattern(" S ")
                .pattern(" S ")
                .input('B', ModItems.IRON_HAMMER_BODY)
                .input('H', ModItems.IRON_HAMMER_HEAD)
                .input('S', ModItems.REINFORCED_STICK)
                .criterion(hasItem(Blocks.IRON_BLOCK), conditionsFromItem(Blocks.IRON_BLOCK))
                .criterion(hasItem(ModItems.REINFORCED_STICK), conditionsFromItem(ModItems.REINFORCED_STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IRON_HAMMER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRON_HAMMER_HEAD, 1)
                .pattern("ODD")
                .pattern("ODD")
                .pattern("ODD")
                .input('O', Blocks.CRYING_OBSIDIAN)
                .input('D', Blocks.IRON_BLOCK)
                .criterion(hasItem(Blocks.CRYING_OBSIDIAN), conditionsFromItem(Blocks.CRYING_OBSIDIAN))
                .criterion(hasItem(Blocks.IRON_BLOCK), conditionsFromItem(Blocks.IRON_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IRON_HAMMER_HEAD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRON_HAMMER_BODY, 1)
                .pattern("DDD")
                .pattern("DDD")
                .pattern("DDD")
                .input('D', Blocks.IRON_BLOCK)
                .criterion(hasItem(Blocks.IRON_BLOCK), conditionsFromItem(Blocks.IRON_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IRON_HAMMER_BODY)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_HAMMER, 1)
                .pattern("HBH")
                .pattern(" S ")
                .pattern(" S ")
                .input('B', ModItems.COPPER_HAMMER_BODY)
                .input('H', ModItems.COPPER_HAMMER_HEAD)
                .input('S', ModItems.REINFORCED_STICK)
                .criterion(hasItem(ModBlocks.HARDENED_REINFORCED_COPPER_BLOCK), conditionsFromItem(ModBlocks.HARDENED_REINFORCED_COPPER_BLOCK))
                .criterion(hasItem(ModItems.REINFORCED_STICK), conditionsFromItem(ModItems.REINFORCED_STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_HAMMER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_HAMMER_HEAD, 1)
                .pattern("ODD")
                .pattern("ODD")
                .pattern("ODD")
                .input('O', Blocks.CRYING_OBSIDIAN)
                .input('D', ModBlocks.HARDENED_REINFORCED_COPPER_BLOCK)
                .criterion(hasItem(Blocks.CRYING_OBSIDIAN), conditionsFromItem(Blocks.CRYING_OBSIDIAN))
                .criterion(hasItem(ModBlocks.HARDENED_REINFORCED_COPPER_BLOCK), conditionsFromItem(ModBlocks.HARDENED_REINFORCED_COPPER_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_HAMMER_HEAD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_HAMMER_BODY, 1)
                .pattern("DDD")
                .pattern("DDD")
                .pattern("DDD")
                .input('D', ModBlocks.HARDENED_REINFORCED_COPPER_BLOCK)
                .criterion(hasItem(ModBlocks.HARDENED_REINFORCED_COPPER_BLOCK), conditionsFromItem(ModBlocks.HARDENED_REINFORCED_COPPER_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_HAMMER_BODY)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIAMOND_HAMMER, 1)
                .pattern("HBH")
                .pattern(" S ")
                .pattern(" S ")
                .input('H', ModItems.DIAMOND_HAMMER_HEAD)
                .input('B', ModItems.DIAMOND_HAMMER_BODY)
                .input('S', ModItems.REINFORCED_STICK)
                .criterion(hasItem(ModItems.DIAMOND_HAMMER_HEAD), conditionsFromItem(ModItems.DIAMOND_HAMMER_HEAD))
                .criterion(hasItem(ModItems.DIAMOND_HAMMER_BODY), conditionsFromItem(ModItems.DIAMOND_HAMMER_BODY))
                .criterion(hasItem(ModItems.REINFORCED_STICK), conditionsFromItem(ModItems.REINFORCED_STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DIAMOND_HAMMER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DIAMOND_HAMMER_HEAD, 1)
                .pattern("ODD")
                .pattern("ODD")
                .pattern("ODD")
                .input('O', Blocks.CRYING_OBSIDIAN)
                .input('D', Blocks.DIAMOND_BLOCK)
                .criterion(hasItem(Blocks.CRYING_OBSIDIAN), conditionsFromItem(Blocks.CRYING_OBSIDIAN))
                .criterion(hasItem(Blocks.DIAMOND_BLOCK), conditionsFromItem(Blocks.DIAMOND_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DIAMOND_HAMMER_HEAD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DIAMOND_HAMMER_BODY, 1)
                .pattern("DDD")
                .pattern("DDD")
                .pattern("DDD")
                .input('D', Blocks.DIAMOND_BLOCK)
                .criterion(hasItem(Blocks.DIAMOND_BLOCK), conditionsFromItem(Blocks.DIAMOND_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DIAMOND_HAMMER_BODY)));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(ModItems.DIAMOND_HAMMER),
                        Ingredient.ofItems(Blocks.NETHERITE_BLOCK),
                        RecipeCategory.TOOLS,
                        ModItems.NETHERITE_HAMMER)
                .criterion(hasItem(Blocks.NETHERITE_BLOCK), conditionsFromItem(Blocks.NETHERITE_BLOCK))
                .offerTo(exporter, new Identifier((getRecipeName(ModItems.NETHERITE_HAMMER))));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.CUSTOMIZATION_TEMPLATE),
                        Ingredient.ofItems(ModItems.NETHERITE_HAMMER),
                        Ingredient.ofItems(ModItems.XENERITE_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.XENERITE_HAMMER)
                .criterion(hasItem(ModItems.XENERITE_INGOT), conditionsFromItem(ModItems.XENERITE_INGOT))
                .offerTo(exporter, new Identifier((getRecipeName(ModItems.XENERITE_HAMMER))));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.CUSTOMIZATION_TEMPLATE),
                        Ingredient.ofItems(ModItems.XENERITE_HAMMER),
                        Ingredient.ofItems(ModItems.ANCIENT_XENERITE_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.ANCIENT_XENERITE_HAMMER)
                .criterion(hasItem(ModItems.ANCIENT_XENERITE_INGOT), conditionsFromItem(ModItems.ANCIENT_XENERITE_INGOT))
                .offerTo(exporter, new Identifier((getRecipeName(ModItems.ANCIENT_XENERITE_HAMMER))));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.REINFORCED_COPPER_PLATE, RecipeCategory.DECORATIONS,
                ModBlocks.REINFORCED_COPPER_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.HARDENED_REINFORCED_COPPER_PLATE, RecipeCategory.DECORATIONS,
                ModBlocks.HARDENED_REINFORCED_COPPER_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.REINFORCED_STICK, 1)
                .pattern("ISI")
                .pattern("ISI")
                .pattern("ISI")
                .input('I', Items.IRON_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.REINFORCED_STICK)));

    }
}

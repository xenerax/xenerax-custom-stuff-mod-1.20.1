package net.xenerax.customstuff.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.xenerax.customstuff.block.ModBlocks;
import net.xenerax.customstuff.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> RUBY_SMELTABLES = List.of(ModItems.RAW_RUBY,
            ModBlocks.RUBY_ORE, ModBlocks.DEEPSLATE_RUBY_ORE, ModBlocks.NETHER_RUBY_ORE, ModBlocks.END_RUBY_ORE);
    private static final List<ItemConvertible> REINFORCED_COPPER_PLATE_BLASTING =List.of(ModItems.REINFORCED_COPPER_PLATE);

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
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.REINFORCED_COPPER_PLATE)));

        offerBlasting(exporter, REINFORCED_COPPER_PLATE_BLASTING, RecipeCategory.MISC, ModItems.HARDENED_REINFORCED_COPPER_PLATE,
                1f, 100, "copper");    //wofür ist diese gruppe da?


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

    }
}

package net.xenerax.customstuff.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;
import net.xenerax.customstuff.CustomStuff;
import net.xenerax.customstuff.item.ModItems;

import java.util.function.BiConsumer;

public class ModChestLootTableProvider extends SimpleFabricLootTableProvider {
    public ModChestLootTableProvider(FabricDataOutput dataGenerator) {
        super(dataGenerator, LootContextTypes.CHEST);
    }

    public static final Identifier CUSTOM_LOOT_CHEST =
            new Identifier(CustomStuff.MOD_ID, "chests/custom_loot_chest");

        @Override
    public void accept(BiConsumer<Identifier, LootTable.Builder> biConsumer) {
            biConsumer.accept(CUSTOM_LOOT_CHEST, LootTable.builder()
                    .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                            .with(ItemEntry.builder(ModItems.COPPER_PLATE))
                    ));
    }
}

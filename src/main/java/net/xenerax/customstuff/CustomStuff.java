package net.xenerax.customstuff;

import net.fabricmc.api.ModInitializer;

import net.xenerax.customstuff.block.ModBlocks;
import net.xenerax.customstuff.damage_types.ModDamageTypes;
import net.xenerax.customstuff.effect.ModEffects;
import net.xenerax.customstuff.enchantment.ModEnchantments;
import net.xenerax.customstuff.item.ModItemGroups;
import net.xenerax.customstuff.item.ModItems;
import net.xenerax.customstuff.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomStuff implements ModInitializer {
	public static final String MOD_ID = "xenerax-custom-stuff-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModEffects.registerEffects();
		ModEnchantments.registerModEnchantments();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModLootTableModifiers.modifyLootTables();



	}
}
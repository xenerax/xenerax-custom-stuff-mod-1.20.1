package net.xenerax.customstuff.effect;




import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xenerax.customstuff.CustomStuff;




public class ModEffects {
    public static StatusEffect BLEED;
    public static StatusEffect ROTT;

/*
    public static StatusEffect registerStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(CustomStuff.MOD_ID, name), new BleedEffect(StatusEffectCategory.HARMFUL, 0xA60707));
    }
 */

    public static void registerEffects() {
       BLEED = Registry.register(Registries.STATUS_EFFECT, new Identifier(CustomStuff.MOD_ID, "bleed"), new BleedEffect(StatusEffectCategory.HARMFUL, 0xA60707));
       ROTT = Registry.register(Registries.STATUS_EFFECT, new Identifier(CustomStuff.MOD_ID, "rott"), new RottEffect(StatusEffectCategory.HARMFUL, 0xDA2056));

    }

}
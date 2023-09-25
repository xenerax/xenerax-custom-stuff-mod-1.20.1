package net.xenerax.customstuff.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xenerax.customstuff.CustomStuff;

public class ModEffects {
    public static StatusEffect BLEED;

    public static StatusEffect registerStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(CustomStuff.MOD_ID, name),
                new BleedEffect(StatusEffectCategory.HARMFUL, 0xA60707));
    }

    public static void registerEffects() {
        BLEED = registerStatusEffect("bleed");
    }
}

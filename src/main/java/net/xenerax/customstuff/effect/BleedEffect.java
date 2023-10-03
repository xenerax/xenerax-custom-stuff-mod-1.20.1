package net.xenerax.customstuff.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.world.World;
import net.xenerax.customstuff.damage_types.ModDamageTypes;

public class BleedEffect extends StatusEffect {
    public BleedEffect(StatusEffectCategory category, int color) {

        super(category, color);
    }



    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {

        return true;
    }

    //@Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier, World world) {
        if(!entity.getWorld().isClient()) {
            if(amplifier == 0) {
                entity.damage(entity.getDamageSources().magic(), 0.5f);
            }
            if(amplifier == 1) {
                entity.damage(entity.getDamageSources().magic(), 1.0f);
            }
            if(amplifier == 2) {
                //entity.damage(entity.getDamageSources().magic(), 2.0f);
                entity.damage(ModDamageTypes.of(world, ModDamageTypes.BLOOD_LOSS), 2.0f);
            }

        }
        super.applyUpdateEffect(entity, amplifier);
    }

}

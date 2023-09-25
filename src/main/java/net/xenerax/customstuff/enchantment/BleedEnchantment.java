package net.xenerax.customstuff.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.xenerax.customstuff.effect.ModEffects;

public class BleedEnchantment extends Enchantment {
    public BleedEnchantment(Rarity weight, EnchantmentTarget target, EquipmentSlot... slotTypes) {
        super(weight, target, slotTypes);
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(!user.getWorld().isClient()) {
            ServerWorld world = (ServerWorld) user.getWorld();


            int i = ((LivingEntity) target).getStatusEffect(ModEffects.BLEED).getAmplifier(); //game crash weil wenn kein effect da ist hier "null" zurückgegeben wird! int darf nicht null sein

            if(level == 1) {
                ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(ModEffects.BLEED, 40, 0), user);
            }
            if(level == 2) {
                if(i == 0) {
                    ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(ModEffects.BLEED, 40, 1), user);
                }
                else if (i == 1) {
                    ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(ModEffects.BLEED, 40, 1), user);
                }
                else {
                    ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(ModEffects.BLEED, 40, 0), user);
                }
            }
            if(level == 3) {
                ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(ModEffects.BLEED, 40, i + 1), user);
            }
        }

        super.onTargetDamaged(user, target, level);
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }
}

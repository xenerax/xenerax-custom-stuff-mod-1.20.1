package net.xenerax.customstuff.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.sound.SoundEvents;

public class ImyldrienItem extends SwordItem{
    public ImyldrienItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }




    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.playSound(SoundEvents.ENTITY_ENDER_DRAGON_AMBIENT, 0.5f, 0.5f);
        return super.postHit(stack, target, attacker);
    }



}

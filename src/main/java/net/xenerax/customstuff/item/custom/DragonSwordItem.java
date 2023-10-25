package net.xenerax.customstuff.item.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.xenerax.customstuff.effect.ModEffects;
import net.xenerax.customstuff.item.ToolsType.KatanaItem;

public class DragonSwordItem extends KatanaItem {
    public DragonSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if(!attacker.getWorld().isClient()) {
            ServerWorld world = (ServerWorld) attacker.getWorld();
            BlockPos position = target.getBlockPos();
            EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
            EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
            EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);

        }
        return super.postHit(stack, target, attacker);
    }
}

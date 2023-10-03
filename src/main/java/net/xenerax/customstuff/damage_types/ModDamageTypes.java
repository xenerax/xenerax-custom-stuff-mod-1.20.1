package net.xenerax.customstuff.damage_types;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.xenerax.customstuff.CustomStuff;

public class ModDamageTypes {

    public static final RegistryKey<DamageType> BLOOD_LOSS = RegistryKey.of(RegistryKeys.DAMAGE_TYPE, new Identifier(CustomStuff.MOD_ID, "blood_loss"));

    public static DamageSource of(World world, RegistryKey<DamageType> key) {
        return new DamageSource(world.getRegistryManager().get(RegistryKeys.DAMAGE_TYPE).entryOf(key));
    }

}

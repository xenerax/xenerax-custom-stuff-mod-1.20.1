package net.xenerax.customstuff.structure;


import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.structure.Structure;
import net.xenerax.customstuff.CustomStuff;

public class ModStructures {

    public static final RegistryKey<Structure> CHURCH = RegistryKey.of(RegistryKeys.STRUCTURE, new Identifier(CustomStuff.MOD_ID, "custom_church"));
    public static final RegistryKey<Structure> DUNGEON = RegistryKey.of(RegistryKeys.STRUCTURE, new Identifier(CustomStuff.MOD_ID, "custom_dungeon"));


    private static RegistryKey<Structure> of(String id) {
        return RegistryKey.of(RegistryKeys.STRUCTURE, new Identifier(id));
    }
}

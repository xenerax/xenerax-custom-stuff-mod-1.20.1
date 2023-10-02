package net.xenerax.customstuff.structure;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureKeys;
import net.minecraft.world.gen.structure.StructureType;
import net.xenerax.customstuff.CustomStuff;

import java.util.Optional;

public class ModStructures extends Structure {

    public static final RegistryKey<Structure> CHURCH = ModStructures.of("custom_church");

    protected ModStructures(Config config) {
        super(config);
    }


    private static RegistryKey<Structure> of(String id) {
        return RegistryKey.of(RegistryKeys.STRUCTURE, new Identifier(id));
    }


    @Override
    protected Optional<StructurePosition> getStructurePosition(Context context) {
        return Optional.empty();
    }

    @Override
    public StructureType<?> getType() {
        return null;
    }
}

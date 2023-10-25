package net.xenerax.customstuff.entity.client;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.xenerax.customstuff.CustomStuff;

public class ModModelLayers {
    public static final EntityModelLayer ROTTSCYTHE =
            new EntityModelLayer(new Identifier(CustomStuff.MOD_ID, "rott_scythe"), "main");
}

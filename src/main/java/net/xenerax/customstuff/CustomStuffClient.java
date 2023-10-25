package net.xenerax.customstuff;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.xenerax.customstuff.entity.ModEntitys;
import net.xenerax.customstuff.entity.client.ModModelLayers;
import net.xenerax.customstuff.entity.client.RottScytheModel;
import net.xenerax.customstuff.entity.client.RottScytheRenderer;

public class CustomStuffClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntitys.ROTTSCYTHE, RottScytheRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.ROTTSCYTHE, RottScytheModel::getTexturedModelData);

    }
}

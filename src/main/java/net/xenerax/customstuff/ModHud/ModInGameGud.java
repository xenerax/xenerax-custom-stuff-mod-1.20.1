package net.xenerax.customstuff.ModHud;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.xenerax.customstuff.effect.ModEffects;

public class ModInGameGud extends InGameHud {
    public ModInGameGud(MinecraftClient client, ItemRenderer itemRenderer) {
        super(client, itemRenderer);
    }

    static enum ModHeartType {
        CONTAINER(0, false),
        NORMAL(2, true),
        ROTTEN(4, true);

        private final int textureIndex;
        private final boolean hasBlinkingTexture;

        private ModHeartType(int textureIndex, boolean hasBlinkingTexture) {
            this.textureIndex = textureIndex;
            this.hasBlinkingTexture = hasBlinkingTexture;
        }

        public int modgetU(boolean halfHeart, boolean blinking) {
            int i;
            if (this == CONTAINER) {
                i = blinking ? 1 : 0;
            } else {
                int j = halfHeart ? 1 : 0;
                int k = this.hasBlinkingTexture && blinking ? 2 : 0;
                i = j + k;
            }
            return 16 + (this.textureIndex * 2 + i) * 9;
        }

        static ModHeartType modfromPlayerState(PlayerEntity player) {
            ModHeartType heartType = (player.hasStatusEffect(ModEffects.ROTT) ? ROTTEN: NORMAL);
            return heartType;
        }
    }

}

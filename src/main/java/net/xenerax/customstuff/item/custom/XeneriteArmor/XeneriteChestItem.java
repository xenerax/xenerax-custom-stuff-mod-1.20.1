package net.xenerax.customstuff.item.custom.XeneriteArmor;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.UUID;

public class XeneriteChestItem extends ArmorItem {
    private static final UUID HEALTH_MODIFIER = UUID.fromString("05353c98-6abe-11ee-b962-0242ac120002");

    public XeneriteChestItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(ItemStack stack, EquipmentSlot slot) {
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        Multimap<EntityAttribute, EntityAttributeModifier> modifiers = super.getAttributeModifiers(slot);
        builder.putAll(modifiers);
        if (slot == EquipmentSlot.CHEST) {
            builder.put(EntityAttributes.GENERIC_MAX_HEALTH,
                    new EntityAttributeModifier(HEALTH_MODIFIER, "Health Increase", 2.5,
                            EntityAttributeModifier.Operation.ADDITION));
        }
        return builder.build();
    }
}

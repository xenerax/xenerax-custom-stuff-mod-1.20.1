package net.xenerax.customstuff.item.custom.AncientXeneriteArmor;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;

import java.util.UUID;

public class AncientXeneriteLeggingsItem extends ArmorItem {
    private static final UUID HEALTH_MODIFIER = UUID.fromString("1251691a-6abe-11ee-b962-0242ac120002");

    public AncientXeneriteLeggingsItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(ItemStack stack, EquipmentSlot slot) {
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        Multimap<EntityAttribute, EntityAttributeModifier> modifiers = super.getAttributeModifiers(slot);
        builder.putAll(modifiers);
        if (slot == EquipmentSlot.LEGS) {
            builder.put(EntityAttributes.GENERIC_MAX_HEALTH,
                    new EntityAttributeModifier(HEALTH_MODIFIER, "Health Increase", 5,
                            EntityAttributeModifier.Operation.ADDITION));
        }
        return builder.build();
    }
}

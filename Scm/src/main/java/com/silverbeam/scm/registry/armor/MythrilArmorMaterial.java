package com.silverbeam.scm.registry.armor;

import com.silverbeam.scm.registry.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class MythrilArmorMaterial implements ArmorMaterial {

    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    private static final int [] PROTECTION_AMOUNTS = new int[] {1, 3, 4, 1};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()]*8;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_AMOUNTS[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 18;
    }

    @Override
    public SoundEvent getEquipSound() { return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.MYTHRIL_SHARD);
    }

    @Override
    public String getName() {
        return "mythril";
    }

    @Override
    public float getToughness() {
        return 0;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}

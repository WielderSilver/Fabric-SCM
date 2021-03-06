package com.silverbeam.scm.registry.tools.toolmaterials;

import com.silverbeam.scm.registry.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialRuby implements ToolMaterial {
    @Override
    public int getDurability() {
        return 191;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 5.0f;
    }

    @Override
    public float getAttackDamage() {
        return 2.0f;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 18;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.RUBY);
    }

}
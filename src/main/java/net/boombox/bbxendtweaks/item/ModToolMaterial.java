package net.boombox.bbxendtweaks.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    ENDZITE(5, 2331, 9.5f, 4.5F, 17, () -> Ingredient.ofItems(ModItems.ENDZITE_SHARD)),
    BEANIUM(3, 250, 7.0f, 2.0F, 10, () -> Ingredient.ofItems(ModItems.BEANIUM_INGOT));

    private final int miningLevel;
    private final int durability;
    private final float miningSpeedMultiplier;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairingIngredient;

    ModToolMaterial(int miningLevel, int durability, float miningSpeedMultiplier, float attackDamage, int enchantability, Supplier<Ingredient> repairingIngredient) {
        this.miningLevel = miningLevel;
        this.durability = durability;
        this.miningSpeedMultiplier = miningSpeedMultiplier;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairingIngredient = repairingIngredient;
    }


    @Override
    public int getDurability() {
        return this.durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeedMultiplier;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairingIngredient.get();
    }
}

package net.boombox.bbxendtweaks.item.custom;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {
    public static final FoodComponent END_GLOW_BERRIES = new FoodComponent.Builder()
            .alwaysEdible()
            .hunger(4)
            .saturationModifier(2)
            .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 20, 1), 100)
            .build();

}

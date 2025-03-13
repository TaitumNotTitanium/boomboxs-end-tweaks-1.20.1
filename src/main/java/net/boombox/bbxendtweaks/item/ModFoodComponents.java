package net.boombox.bbxendtweaks.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent END_GLOW_BERRIES = new FoodComponent.Builder()
            .alwaysEdible()
            .hunger(4)
            .saturationModifier(2)
            .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 20, 1), 100)
            .build();
    public static final FoodComponent END_GLOW_BERRIES_FREY = new FoodComponent.Builder()
            .alwaysEdible()
            .hunger(4)
            .saturationModifier(2)
            .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 5200, 68), 100)
            .build();

    public static final FoodComponent CAN_OF_BEANS = new FoodComponent.Builder()
            .alwaysEdible()
            .hunger(10)
            .saturationModifier(20)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 200, 1), 100)
            .build();

}

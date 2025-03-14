package net.boombox.bbxendtweaks.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class InfiniteFoodItem extends Item {
    public InfiniteFoodItem(Item.Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        // Call user.eatFood() to get the effects from eating the item. Make sure to
        // make a copy of the item so it isn't removed when this is called.
        user.eatFood(world, stack.copy());

        // Return the new stack. In this case, we don't want the stack to change.
        return stack;
    }
}

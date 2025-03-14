package net.boombox.bbxendtweaks.item.custom;

import net.boombox.bbxendtweaks.item.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class CannedFoodItem extends Item {
    public CannedFoodItem(Item.Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if(user instanceof PlayerEntity){
            ((PlayerEntity)user).eatFood(world, stack.copy());
            return ItemUsage.exchangeStack(stack, (PlayerEntity)user, new ItemStack(ModItems.EMPTY_CAN));
        }
        return new ItemStack(ModItems.EMPTY_CAN);
    }
}

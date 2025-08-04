package dev.chemthunder.regalia.item;

import dev.chemthunder.regalia.init.RegaliaItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;

public class EffigyItem extends Item {
    public EffigyItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
       if (user.isSneaking() && entity.getHealth() <= 3.0f) {
           entity.setHealth(10f);
           stack.decrement(1);
           user.giveItemStack(RegaliaItems.BROKEN_EFFIGY.getDefaultStack());
           user.swingHand(Hand.MAIN_HAND);
           user.playSound(new SoundEvent(SoundEvents.ITEM_TRIDENT_THUNDER.getId()), 5, 5);
           entity.teleport(entity.getX() + 75000, entity.getY() + 100, entity.getZ());
           entity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 999999999, 250));
           entity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 999999999, 250));
           return super.useOnEntity(stack, user, entity, hand);
       } else {

       }
        return ActionResult.FAIL;
    }
}

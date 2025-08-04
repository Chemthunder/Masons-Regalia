package dev.chemthunder.regalia.item;

import dev.chemthunder.regalia.init.RegaliaItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;

public class ContractItem extends Item {
    public ContractItem(Settings settings) {
        super(settings);
    }


    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {

        stack.decrement(1);
        user.giveItemStack(RegaliaItems.SIGNED_CONTRACT.getDefaultStack());
        user.playSound(new SoundEvent(SoundEvents.BLOCK_END_PORTAL_SPAWN.getId()), 5, 5);
        entity.playSound(new SoundEvent(SoundEvents.BLOCK_END_PORTAL_SPAWN.getId()), 5, 5);
        return super.useOnEntity(stack, user, entity, hand);
    }
}

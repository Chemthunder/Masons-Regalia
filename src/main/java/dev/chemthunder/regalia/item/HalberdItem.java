package dev.chemthunder.regalia.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.sound.SoundEvents;

public class HalberdItem extends SwordItem {
    public HalberdItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
    target.setVelocity(attacker.getRotationVec(0).multiply(-0.5));
        return super.postHit(stack, target, attacker);
    }
}

package dev.chemthunder.regalia.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;

public class WaystoneItem extends SwordItem {
    public WaystoneItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (attacker.isSneaking()) {
            target.setVelocity(target.getVelocity().x, 2, target.getVelocity().z);
            target.velocityModified = true;
        }
        return super.postHit(stack, target, attacker);
    }
}

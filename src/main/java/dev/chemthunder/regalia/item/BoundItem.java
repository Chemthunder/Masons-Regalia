package dev.chemthunder.regalia.item;

import dev.chemthunder.regalia.init.RegaliaDamageSources;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.world.World;


public class BoundItem extends SwordItem {
    public BoundItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (entity instanceof PlayerEntity player) {
            ItemStack stackMain = player.getMainHandStack();
            ItemStack offStack = player.getOffHandStack();

            if (stackMain.isOf(this) || offStack.isOf(this)) {
                player.damage(RegaliaDamageSources.SOL,
                        2f);

                player.sendMessage(Text.translatable("text.item_burning")
                        .setStyle(Style.EMPTY.withColor(0xad1359)
                        ), true);
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}

package dev.chemthunder.regalia.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BurningItem extends Item {
    public BurningItem(Settings settings) {
        super(settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
entity.damage(DamageSource.IN_FIRE, 3f);

        super.inventoryTick(stack, world, entity, slot, selected);
    }
}

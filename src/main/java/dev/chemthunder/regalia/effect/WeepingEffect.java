package dev.chemthunder.regalia.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

public class WeepingEffect extends StatusEffect {
    public WeepingEffect() {
        super(
                StatusEffectCategory.HARMFUL, // whether beneficial or harmful for entities
                0x98D982); // color in RGB
    }


    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
           entity.setHealth(1f);
        }
    }
}

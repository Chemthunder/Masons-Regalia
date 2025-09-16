package dev.chemthunder.regalia.init;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.text.Text;


public class RegaliaDamageSources {
    public static final DamageSource SOL = (new DamageSource("sol") {
        public Text getDeathMessage(LivingEntity entity) {
            return Text.literal(entity.getName().getString() + "'s soul combusted");
        }
    });
}

package dev.chemthunder.regalia.init;

import dev.chemthunder.regalia.MasonsRegalia;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class RegaliaItemGroup {
    public static final ItemGroup MASON = FabricItemGroupBuilder.build(
            new Identifier(MasonsRegalia.MOD_ID, "mason"), () -> new ItemStack(RegaliaItems.CRIMSON_OBITUARY));
}

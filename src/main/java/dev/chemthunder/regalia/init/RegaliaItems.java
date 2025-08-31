package dev.chemthunder.regalia.init;

import dev.chemthunder.regalia.MasonsRegalia;
import dev.chemthunder.regalia.item.*;
import dev.chemthunder.regalia.item.FrostbearerItem;
import dev.chemthunder.regalia.item.HelianthiItem;
import dev.chemthunder.regalia.item.SkarletItem;
import dev.chemthunder.regalia.item.SolitudeItem;
import dev.chemthunder.regalia.item.skin.LancerCautionSignItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;
import java.util.Map;

public interface RegaliaItems {


    Map<Item, Identifier> ITEMS = new LinkedHashMap<>();

    Item HELIANTHI = create("helianthi", new HelianthiItem(ToolMaterials.NETHERITE, 5, -3f, new  FabricItemSettings()
            .fireproof()
            .rarity(Rarity.UNCOMMON)
            .group(RegaliaItemGroup.MASON)));

    Item SUNDERED_EFFIGY = create("sundered_effigy", new Item(new FabricItemSettings()
            .maxCount(1)
            .fireproof()
            .group(RegaliaItemGroup.MASON)));

    Item BROKEN_EFFIGY = create("broken_effigy", new Item(new FabricItemSettings()
            .fireproof()
            .group(RegaliaItemGroup.MASON)
            .maxCount(1)));


    Item SKARLET_PROMISE = create("skarlet_promise", new SkarletItem(ToolMaterials.GOLD, 8, -2.6f, new FabricItemSettings()
            .group(RegaliaItemGroup.MASON)
            .fireproof()
            .rarity(Rarity.UNCOMMON)
    ));

    Item ESSENCE_DISC = create("essence_disc", new EssenceItem(new FabricItemSettings()
            .maxCount(1)
            .fireproof()
            .rarity(Rarity.RARE)
            .group(RegaliaItemGroup.MASON))
    );

    Item ESSENCE_PIECE = create("essence_piece", new DiscFragmentEssence(new FabricItemSettings()
            .maxCount(8)
            .group(RegaliaItemGroup.MASON))
    );


    Item FROSTBEARER = create("frostbearer", new FrostbearerItem(ToolMaterials.DIAMOND, 5, -2.9f, new FabricItemSettings()
            .rarity(Rarity.RARE)
            .group(RegaliaItemGroup.MASON))
    );


    Item FOLLYSCYTHE = create("sirens_call", new FollyScytheItem(ToolMaterials.NETHERITE, 4, -2.6f, new FabricItemSettings()
            .group(RegaliaItemGroup.MASON)
            .rarity(Rarity.EPIC)
            .fireproof()));

    Item BOUND_EFFIGY = create("bound_effigy", new BoundItem(ToolMaterials.NETHERITE, 1, -2.3f, new FabricItemSettings()
            .fireproof()
            .rarity(Rarity.UNCOMMON)
            .maxDamage(1)));

    Item SOLITUDE = create("solitude", new SolitudeItem(ToolMaterials.NETHERITE, 4, -2.8f, new FabricItemSettings()
            .rarity(Rarity.UNCOMMON)
            .group(RegaliaItemGroup.MASON)
            .fireproof()));

    Item CRIMSON_OBITUARY = create("crimson", new HalberdItem(ToolMaterials.GOLD, 6, -2.3f, new FabricItemSettings()
            .group(RegaliaItemGroup.MASON)
            .fireproof()
            .rarity(Rarity.UNCOMMON)
    ));

    Item WAYSTONE = create("waystone", new WaystoneItem(ToolMaterials.IRON, 6, -2.4f, new FabricItemSettings()
            .maxCount(1)
            .group(RegaliaItemGroup.MASON)
            .fireproof()
    ));

    Item RESONANT_NAIL = create("resonant_nail", new NailItem(ToolMaterials.GOLD, 6, -2.4f, new FabricItemSettings()
            .maxCount(1)
            .group(RegaliaItemGroup.MASON)
            .fireproof()
            .rarity(Rarity.UNCOMMON)
    ));

    Item SOULFLAME_SPEAR = create("soulflame_spear", new SoulflameSpearItem(ToolMaterials.IRON, 5, -2.7f, new FabricItemSettings()
            .maxCount(1)
            .group(RegaliaItemGroup.MASON)
            .rarity(Rarity.RARE)
    ));

    Item CAUTION_SIGN = create("caution_sign", new CautionSignItem(ToolMaterials.IRON, -2, -2.7f, new FabricItemSettings()
            .maxCount(1)
            .group(RegaliaItemGroup.MASON)
            .rarity(Rarity.UNCOMMON)
    ));

    Item LANCER_CAUTION_SIGN = create("lancer_caution_sign", new LancerCautionSignItem(ToolMaterials.IRON, -2, -2.1f, new FabricItemSettings()
            .maxCount(1)
            .rarity(Rarity.UNCOMMON)
    ));

    Item FUMI_SCYTHE = create("fumi_scythe", new FumiScytheItem(ToolMaterials.IRON, 6, -2.6f, new FabricItemSettings()
            .maxCount(1)
            .group(RegaliaItemGroup.MASON)
    ));

    Item RIFTED_EYE = create("rifted_eye", new Item(new FabricItemSettings()
            .maxCount(1)
            .group(RegaliaItemGroup.MASON)
    ));

    Item RIFTED_LONGSWORD = create("rifted_longsword", new RiftedLongswordItem(ToolMaterials.DIAMOND, 5, -2.7f, new FabricItemSettings()
            .maxCount(1)
            .group(RegaliaItemGroup.MASON)
            .rarity(Rarity.EPIC)
    ));

    static <T extends Item> T create(String name, T item) {
        ITEMS.put(item, MasonsRegalia.id(name));
        return item;
    }
    static void initialize() {
        ITEMS.forEach((item, id) -> Registry.register(Registry.ITEM, id, item));

    }
}

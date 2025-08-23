package dev.chemthunder.regalia;

import dev.chemthunder.regalia.init.RegaliaItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MasonsRegalia implements ModInitializer {
	public static final String MOD_ID = "regalia";

	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path); }

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		RegaliaItems.initialize();
        LOGGER.info("This message means Mason's Regalia is working");
	}
}
package net.bunmuppen.coloredwoodentools;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ColoredWoodenTools implements ModInitializer {
	public static final	String MOD_ID = "colored-wooden-tools";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}
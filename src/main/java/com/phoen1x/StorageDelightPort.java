package com.phoen1x;

import com.phoen1x.registry.BlockEntityTypesRegistry;
import com.phoen1x.registry.BlockRegistry;
import net.fabricmc.api.ModInitializer;

import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import eu.pb4.polymer.resourcepack.extras.api.ResourcePackExtras;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StorageDelightPort implements ModInitializer {
	public static final String MOD_ID = "storagedelight-port";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		BlockRegistry.registerBlocks();
		BlockEntityTypesRegistry.register();
		if (PolymerResourcePackUtils.addModAssets(MOD_ID)) {
			ResourcePackExtras.forDefault().addBridgedModelsFolder(id("block"), id("sgui"));
			LOGGER.info("Successfully added mod assets for " + MOD_ID);
		} else {
			LOGGER.error("Failed to add mod assets for " + MOD_ID);
		}
		PolymerResourcePackUtils.markAsRequired();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
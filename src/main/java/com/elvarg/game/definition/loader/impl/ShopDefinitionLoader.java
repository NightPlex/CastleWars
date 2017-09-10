package com.elvarg.game.definition.loader.impl;

import java.io.FileReader;

import com.elvarg.game.GameConstants;
import com.elvarg.game.definition.ShopDefinition;
import com.elvarg.game.definition.loader.DefinitionLoader;
import com.google.gson.Gson;

public class ShopDefinitionLoader extends DefinitionLoader {

	@Override
	public void load() throws Throwable {
		FileReader reader = new FileReader(file());
		ShopDefinition[] defs = new Gson().fromJson(reader, ShopDefinition[].class);
		for(ShopDefinition def : defs) {
			ShopDefinition.definitions.put(def.getId(), def);
		}
		reader.close();
	}

	@Override
	public String file() {
		return GameConstants.DEFINITIONS_DIRECTORY + "shops.json";
	}
}

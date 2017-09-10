package com.elvarg.game.definition;

import java.util.HashMap;
import java.util.Map;

import com.elvarg.game.model.Item;

/**
 * Represents a definition for a shop.
 * @author Professor Oak
 */
public class ShopDefinition {
	
	/**
	 * The map containing all our {@link ShopDefinition}s.
	 */
	public static final Map<Integer, ShopDefinition> definitions = new HashMap<Integer, ShopDefinition>();

	/**
	 * The default definition that will be used
	 * in case one was not found.
	 */
	public static final ShopDefinition DEFAULT = new ShopDefinition();

	/**
	 * Attempts to get the {@link ShopDefinition} for the 
	 * given shop id.
	 * @param item
	 * @return
	 */
	public static ShopDefinition forId(int shopId) {
		return definitions.getOrDefault(shopId, DEFAULT);
	}
	
	/**
	 * Represents a currency a shop can have.
	 */
	public enum Currency {
		COINS,
		POINTS,
		OTHER;
	}
	
	private int id;
	private String name = "";
	private Currency currency = Currency.COINS;
	private Item[] stock;
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Currency getCurrency() {
		return currency;
	}
	
	public Item[] getStock() {
		return stock;
	}
}

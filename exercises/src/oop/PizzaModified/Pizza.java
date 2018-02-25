package oop.PizzaModified;

public class Pizza {
	// Private properties
	private int price;
	private String type;

	// Constructs a Pizza object with a price and a type
	public Pizza(int price, String type) {
		this.price = price;
		this.type = type;
	}

	// Gets the price of the pizza
	public int price() {
		return price;
	}

	// Gets the type of the pizza
	public String type() {
		return type;
	}
}
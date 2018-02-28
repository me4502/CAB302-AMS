package oop.PizzaModified;

public class PizzaModified {
	// Private properties
	private PizzaType pizzaType;

	// Constructs a Pizza object with a price and a type
	public PizzaModified(PizzaType pizzaType) {
		this.pizzaType = pizzaType;
	}

	// Gets the price of the pizza
	public int price() {
		return pizzaType.price();
	}

	// Gets the type of the pizza
	public String type() {
		return pizzaType.name();
	}
}
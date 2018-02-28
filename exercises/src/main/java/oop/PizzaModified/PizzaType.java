package oop.PizzaModified;

public enum PizzaType {
	HAWAIIAN(10), MEATLOVERS(12), VEGETARIAN(9);

	private int price;

	PizzaType(int price) {
		this.price = price;
	}

	public int price() {
		return price;
	}
}
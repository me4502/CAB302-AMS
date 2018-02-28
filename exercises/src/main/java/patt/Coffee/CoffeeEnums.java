package patt.Coffee;

public class CoffeeEnums {

	public static enum Type {
		LONG_BLACK(4.0),
		FLAT_WHITE(4.75),
		MOCHA(5.5);

		private double price;

		Type(double price) {
			this.price = price;
		}

		public double getPrice() {
			return price;
		}
	}

	public static enum Ingredient {
		ESPRESSO(0.5),
		MILK(1),
		CHOCOLATE(1.5);

		private double cost;

		Ingredient(double cost) {
			this.cost = cost;
		}

		public double getCost() {
			return cost;
		}
	}
}

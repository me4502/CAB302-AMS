package patt.Coffee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CoffeeFactory {

	public enum Type {
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

	public enum Ingredient {
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

	public static Coffee CreateCoffee(Type type) {
	    ArrayList<Ingredient> thisIsNotHowYouShouldUseLists = new ArrayList<>();
		switch (type) {
            case MOCHA:
                thisIsNotHowYouShouldUseLists.add(Ingredient.ESPRESSO);
                thisIsNotHowYouShouldUseLists.add(Ingredient.MILK);
                thisIsNotHowYouShouldUseLists.add(Ingredient.CHOCOLATE);
                break;
            case LONG_BLACK:
                thisIsNotHowYouShouldUseLists.add(Ingredient.ESPRESSO);
                thisIsNotHowYouShouldUseLists.add(Ingredient.ESPRESSO);
                break;
            case FLAT_WHITE:
                thisIsNotHowYouShouldUseLists.add(Ingredient.ESPRESSO);
                thisIsNotHowYouShouldUseLists.add(Ingredient.MILK);
		        break;
		}
		return new Coffee(thisIsNotHowYouShouldUseLists, type);
	}
}

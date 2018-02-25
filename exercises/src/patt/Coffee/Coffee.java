package patt.Coffee;

import java.util.ArrayList;

public class Coffee {
	String type;
	double cost;
	ArrayList<String> ingredients;

	public Coffee(ArrayList<String> ingredients, String type) {
		this.type = type;

		this.ingredients = ingredients;

		double sum = 0;
		for (String ingredient : ingredients) {
			if (ingredient == "espresso") {
				sum += 0.5;
			} else if (ingredient == "milk") {
				sum += 1.0;
			} else if (ingredient == "chocolate") {
				sum += 1.5;
			} else {
				sum += 0;
			}
		}
		this.cost = sum;

	}

	public double getCost() {
		return cost;
	}

	public double getPrice() {
		if (this.type.equals("long black")) {
			return 4.0;
		} else if (this.type.equals("flat white")) {
			return 5.0;
		} else if (this.type.equals("mocha")) {
			return 6.0;
		}
		return 0;
	}

	public String listIngredients() {
		String string = "";
		for (String ingredient : ingredients) {
			string += ingredient;
			string += "\n";
		}
		return string;
	}
}
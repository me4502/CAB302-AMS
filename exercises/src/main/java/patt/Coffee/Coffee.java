package patt.Coffee;

import java.util.ArrayList;

public class Coffee {
	private CoffeeFactory.Type type;
	private ArrayList<CoffeeFactory.Ingredient> ingredients;

	public Coffee(ArrayList<CoffeeFactory.Ingredient> ingredients, CoffeeFactory.Type type) {
		this.type = type;

		this.ingredients = ingredients;
	}

	public double getCost() {
		return ingredients.stream().map(CoffeeFactory.Ingredient::getCost).mapToDouble(d -> d).sum();
	}

	public double getPrice() {
		return this.type.getPrice();
	}

	public String listIngredients() {
		StringBuilder string = new StringBuilder();
		for (CoffeeFactory.Ingredient ingredient : ingredients) {
			string.append(ingredient.toString());
			string.append("\n");
		}
		return string.toString();
	}
}
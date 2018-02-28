package oop.Pizza;

public class Main {
	public static void main(String[] args) {
		// Instantiate a $10 Hawaiian pizza called p1
		Pizza p1 = new Pizza(10, "Hawaiian");
		// Instantiate a $12 Meatlovers pizza called p2
		Pizza p2 = new Pizza(10, "Meatlovers");

		// Fix the below print statements. Hint: inspect the Pizza class.
		System.out.println("p1 has price: " + p1.price());
		System.out.println("p2 has type: " + p2.type());
	}
}
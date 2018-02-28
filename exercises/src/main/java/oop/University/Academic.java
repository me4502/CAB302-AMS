package oop.University;

public abstract class Academic {
	private String name;
	private int id;
	private Title title;

	public Academic(String name, int id, Title title) {
		this.name = name;
		this.id = id;
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public int getID() {
		return id;
	}

	public Title getTitle() {
		return title;
	}

	public abstract double getWeeklyPay();

	public abstract String toString();
}
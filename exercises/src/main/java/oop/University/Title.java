package oop.University;

public enum Title {
	BACHELOR_STUDENT("Bachelor degree."),
	MASTERS_STUDENT("Masters degree."),
	PHD_STUDENT("PhD."),
	TUTOR("tutor."),
	LECTURER("lecturer.");

	private final String text;

	Title(String text) {
		this.text = text;
	}

	public String toString() {
		return text;
	}
}
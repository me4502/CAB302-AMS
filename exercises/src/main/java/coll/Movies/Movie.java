package coll.Movies;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	private String title;
	private int year;
	private List<Integer> ratings;

	// Constructor
	public Movie(String title, int year) {
		this.title = title;
		this.year = year;
		this.ratings = new ArrayList<>();
	}

	// Rate the movie
	public void addRating(int rating) {
        this.ratings.add(rating);
	}

	// Get the title of the movie
	public String title() {
		return this.title;
	}

	// Get the year of the movie
	public int year() {
		return this.year;
	}

	// Get the average rating of the movie
	public double rating() {
		return this.ratings.stream().mapToInt(i -> i).average().orElse(0.0);
	}

}
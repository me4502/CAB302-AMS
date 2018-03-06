package coll.Matrix;

import java.util.*;
import java.util.stream.Collectors;

public class Matrix<T> implements Iterable<T> {

    private int rows, columns;
    private T[] array;

	/**
	 * Construct a Matrix object.
	 * 
	 * @param rows An int that specifies the number of rows.
	 * @param columns An int that specifies the number of columns.
	 */
	public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.array = (T[]) new Object[this.rows * this.columns];
	}

	/**
	 * Assigns a value to a given cell, specified by its row, column coordinates.
	 * 
	 * @param row An int for the row index with 0-based indexing.
	 * @param column An int for the column index with 0-based indexing.
	 * @param value A generic value to be assigned to the given cell.
	 */
	public void insert(int row, int column, T value) {
		this.array[column + (row * this.columns)] = value;
	}

	/**
	 * Gets the value at a given cell, specified by its row, column coordinates.
	 * @param row An int for the row index with 0-based indexing.
	 * @param column An int for the column index with 0-based indexing.
	 * @return value. A generic value located at the given cell.
	 */
	public T get(int row, int column) {
		return this.array[column + (row * this.columns)];
	}

	/**
	 * Gets the total number of cells in the matrix.
	 * @return an int equal to the total number of cells in the matrix.
	 */
	public int size() {
        return this.rows * this.columns;
	}
	
	/**
	 * Converts the matrix to String format.
	 * @return a String representation of the matrix.
	 */
	@Override
	public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int row = 0; row < rows; row ++) {
            List<String> strings = new ArrayList<>();
            for (int column = 0; column < columns; column ++) {
                strings.add(String.valueOf(get(row, column)));
            }
            builder.append(strings.stream().collect(Collectors.joining("\t"))).append("\n");
        }
	    return builder.toString();
	}

	/**
	 * Returns an Iterator object for the matrix. The Iterator should follow the
	 * order of row by row. Within each row the order is left to right.
	 * @return an Iterator object for the matrix.
	 */
	@Override
	public Iterator<T> iterator() {
        return Arrays.asList(this.array).iterator();
	}

}
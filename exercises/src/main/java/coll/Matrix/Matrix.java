package coll.Matrix;

import java.util.*;

public class Matrix<T> implements Iterable<T> {

    private int rows, columns;

	/**
	 * Construct a Matrix object.
	 * 
	 * @param rows An int that specifies the number of rows.
	 * @param columns An int that specifies the number of columns.
	 */
	public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
	}

	/**
	 * Assigns a value to a given cell, specified by its row, column coordinates.
	 * 
	 * @param row An int for the row index with 0-based indexing.
	 * @param column An int for the column index with 0-based indexing.
	 * @param value A generic value to be assigned to the given cell.
	 */
	public void insert(int row, int column, T value) {

	}

	/**
	 * Gets the value at a given cell, specified by its row, column coordinates.
	 * @param row An int for the row index with 0-based indexing.
	 * @param column An int for the column index with 0-based indexing.
	 * @return value. A generic value located at the given cell.
	 */
	public T get(int row, int column) {
		return null;
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
        return null;
	}

	/**
	 * Returns an Iterator object for the matrix. The Iterator should follow the
	 * order of row by row. Within each row the order is left to right.
	 * @return an Iterator object for the matrix.
	 */
	@Override
	public Iterator<T> iterator() {
        return null;
	}

}
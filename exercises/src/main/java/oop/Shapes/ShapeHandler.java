package oop.Shapes;

import java.util.Arrays;

public class ShapeHandler {
	// Returns the sum of the volumes of the given shapes.
	public static double volumeSum(Shape[] shapes) {
		return Arrays.stream(shapes).mapToDouble(Shape::volume).sum();
	}

	// Returns the sum of the surface areas of the given shapes.
	public static double surfaceAreaSum(Shape[] shapes) {
		return Arrays.stream(shapes).mapToDouble(Shape::surfaceArea).sum();
	}
}
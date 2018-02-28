package oop.Shapes;

public class RectangularPrism implements Shape {

    private double width, height, length;

    public RectangularPrism(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    @Override
    public double volume() {
        return this.width * this.height * this.length;
    }

    @Override
    public double surfaceArea() {
        return 2 * (width * length + height * length + height * width);
    }
}

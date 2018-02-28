package oop.Shapes;

public class Cylinder implements Shape {

    private double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(this.radius, 2) * this.height;
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * this.radius * this.height + 2 * Math.PI * Math.pow(this.radius, 2);
    }
}

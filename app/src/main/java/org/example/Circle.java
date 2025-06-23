package org.example;

/**
 * A Circle represents a shape defined by its radius.
 */
public class Circle extends Shape {
    private final double radius;

    /**
     * Constructs a new Circle with the specified radius.
     *
     * @param radius  the radius of the circle
     * @throws IllegalArgumentException if radius is negative
     */
    public Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("radius must be >= 0");
        }
        this.radius = radius;
    }

    /**
     * Compute the area of this circle.
     * Uses the formula: area = pi * r^2
     *
     * @return the area in square units
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Compute the perimeter of this circle.
     * Uses the formula: circumference = 2 * pi * r
     *
     * @return the perimeter
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
package org.example;

/**
 * A Rectangle represents a four‐sided polygon.
 * It provides implementations for calculating its area, perimeter,
 * and reports its side count via the Polygon interface.
 */
public class Rectangle extends Shape implements Polygon {
    /** The length of this rectangle (must be >= 0). */
    private final double length;
    /** The width of this rectangle (must be >= 0). */
    private final double width;

    /**
     * Constructs a Rectangle with the given dimensions.
     *
     * @param length the length of the rectangle
     * @param width  the width of the rectangle
     * @throws IllegalArgumentException if either dimension is negative
     */
    public Rectangle(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("sides must be >= 0");
        }
        this.length = length;
        this.width = width;
    }

    /**
     * Computes the area of this rectangle.
     * Uses the formula: area = length * width.
     *
     * @return the area in square units
     */
    @Override
    public double getArea() {
        return length * width;
    }

    /**
     * Computes the perimeter of this rectangle.
     * Uses the formula: perimeter = 2 * (length + width).
     *
     * @return the perimeter in linear units
     */
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    /**
     * Reports the number of sides for this polygon.
     *
     * @return 4, a rectangle has four sides
     */
    @Override
    public int numberOfSides() {
        return 4;
    }
}
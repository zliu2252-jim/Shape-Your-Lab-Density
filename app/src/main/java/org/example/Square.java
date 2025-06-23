package org.example;

/**
 * Inherits getArea() and getPerimeter() implementations from Rectangle.
 * Implements Polygon to report the side.
 */
public class Square extends Rectangle implements Polygon {

    /**
     * Constructs a Square with the given length of the side.
     *
     * @param side  the length of each side (must be >= 0)
     * @throws IllegalArgumentException if side < 0
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * Returns the number of sides for this polygon.
     *
     * @return 4, a square has four sides
     */
    @Override
    public int numberOfSides() {
        return 4;
    }
}
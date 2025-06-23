package org.example;

/**
 * The class represents an isosceles right triangle
 * both legs are the same length.
 */
public class IsoscelesRightTriangle extends RightTriangle implements Polygon {

    /**
     * Builds an isosceles right triangle with equal legs.
     *
     * @param leg the length of each leg (must be >= 0)
     * @throws IllegalArgumentException if leg < 0 (thrown by RightTriangle)
     */
    public IsoscelesRightTriangle(double leg) {
        super(leg, leg);
    }

    /**
     * Returns the number of sides for the polygon.
     *
     * @return 3, the triangle has three sides
     */
    @Override
    public int numberOfSides() {
        return 3;
    }
}
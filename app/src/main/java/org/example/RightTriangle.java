package org.example;

/**
 * This class represents a right triangle
 * <p>
 * Inherits area and perimeter calculations
 */
public class RightTriangle extends Shape implements Polygon {
    /** Length of the first leg (must be >= 0). */
    protected final double legA;
    /** Length of the second leg (must be >= 0). */
    protected final double legB;

    /**
     * Constructs a RightTriangle with the given leg lengths.
     *
     * @param legA length of the first leg
     * @param legB length of the second leg
     * @throws IllegalArgumentException if either leg is negative
     */
    public RightTriangle(double legA, double legB) {
        if (legA < 0 || legB < 0) {
            throw new IllegalArgumentException("legs must be ≥ 0");
        }
        this.legA = legA;
        this.legB = legB;
    }

    /**
     * Computes the area of this right triangle.
     * <p>
     * Formula: (1/2) * legA * legB
     * </p>
     *
     * @return the area in square units
     */
    @Override
    public double getArea() {
        return 0.5 * legA * legB;
    }

    /**
     * Computes the perimeter about this right triangle.
     * <p>
     * Perimeter = legA + legB + hypotenuse,
     * where hypotenuse = square root of ((legA)^2 + (legB)^2)
     * </p>
     *
     * @return the perimeter in linear units
     */
    @Override
    public double getPerimeter() {
        double hyp = Math.hypot(legA, legB);
        return legA + legB + hyp;
    }

    /**
     * Returns the number of sides for this polygon.
     *
     * @return 3, a triangle has three sides
     */
    @Override
    public int numberOfSides() {
        return 3;
    }
}
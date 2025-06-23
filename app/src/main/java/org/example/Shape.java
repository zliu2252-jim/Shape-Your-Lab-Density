package org.example;

/**
 * Abstract base for all shapes.
 * <p>
 * Any concrete shape subclass should provide implementations for
 * computing its area and perimeter.
 * </p>
 */
public abstract class Shape {

    /**
     * Compute the area of this shape.
     *
     * @return the area
     */
    public abstract double getArea();

    /**
     * Compute the perimeter of this shape.
     *
     * @return the perimeter
     */
    public abstract double getPerimeter();
}
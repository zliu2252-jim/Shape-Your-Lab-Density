package org.example;

/**
 * The Polygon interface defines a contract for any shape
 * that has a fixed number of straight sides.
 */
public interface Polygon {

    /**
     * Returns the number of boundary sides for this polygon.
     *
     * @return an integer
     */
    int numberOfSides();
}

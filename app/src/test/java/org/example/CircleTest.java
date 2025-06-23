package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the Circle class.
 */
class CircleTest {

    /**
     * Test that a circle of radius 2.0 have the correct area.
     * Formula: area = pi * r^2
     */
    @Test
    void testArea() {
        Circle c = new Circle(2.0);
        assertEquals(Math.PI * 4, c.getArea(), 0.0, "Area should be pi * r^2");
    }

    /**
     * Test that a circle of radius 2.0 computes the correct perimeter.
     * Formula: perimeter = 2 * pi * r
     */
    @Test
    void testPerimeter() {
        Circle c = new Circle(2.0);
        assertEquals(2 * Math.PI * 2, c.getPerimeter(), 0.0, "Perimeter should be 2*pi*r");
    }

    /**
     * Test that a circle of radius 0.0 returns zero.
     */
    @Test
    void testZeroRadius() {
        Circle c = new Circle(0.0);
        assertEquals(0.0, c.getArea(), 0.0, "Area of zero-radius circle should be 0");
        assertEquals(0.0, c.getPerimeter(), 0.0, "Perimeter of zero-radius circle should be 0");
    }

    /**
     * Test that constructing a circle with a negative radius
     * throws IllegalArgumentException.
     */
    @Test
    void testNegativeRadiusThrows() {
        try {
            new Circle(-1.0);
            fail("Expected IllegalArgumentException for negative radius");
        } catch (IllegalArgumentException ex) {
            assertEquals("radius must be >= 0", ex.getMessage());
        }
    }
}
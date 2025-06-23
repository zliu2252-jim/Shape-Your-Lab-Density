package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the Rectangle class.
 */
class RectangleTest {

    /**
     * A rectangle of length 3 and width 5 should have area 15.
     */
    @Test
    void testArea() {
        Rectangle r = new Rectangle(3.0, 5.0);
        assertEquals(
                15.0,
                r.getArea(),
                0.0,
                "Area should be length * width"
        );
    }

    /**
     * A rectangle of length 3 and width 5 should have perimeter 16.
     */
    @Test
    void testPerimeter() {
        Rectangle r = new Rectangle(3.0, 5.0);
        assertEquals(
                16.0,
                r.getPerimeter(),
                0.0,
                "Perimeter should be 2 * (length + width)"
        );
    }

    /**
     * A rectangle always have four sides.
     */
    @Test
    void testNumberOfSides() {
        Rectangle r = new Rectangle(7.0, 2.0);
        assertEquals(
                4,
                r.numberOfSides(),
                "numberOfSides() should return 4"
        );
    }

    /**
     * A rectangle with one dimension zero should have zero area
     */
    @Test
    void testZeroDimension() {
        Rectangle r = new Rectangle(0.0, 4.0);
        assertEquals(0.0, r.getArea(),      0.0, "Area should be 0 when one side is 0");
        assertEquals(8.0, r.getPerimeter(), 0.0, "Perimeter should be 2 * (0 + 4)");
    }

    /**
     * Constructing with a negative length should throw IllegalArgumentException.
     */
    @Test
    void testNegativeLengthThrows() {
        try {
            new Rectangle(-1.0, 2.0);
            fail("Expected IllegalArgumentException for negative length");
        } catch (IllegalArgumentException ex) {
            assertEquals("sides must be >= 0", ex.getMessage());
        }
    }

    /**
     * Constructing with a negative width should throw IllegalArgumentException.
     */
    @Test
    void testNegativeWidthThrows() {
        try {
            new Rectangle(2.0, -1.0);
            fail("Expected IllegalArgumentException for negative width");
        } catch (IllegalArgumentException ex) {
            assertEquals("sides must be >= 0", ex.getMessage());
        }
    }
}
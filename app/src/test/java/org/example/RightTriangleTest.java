package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the RightTriangle class.
 */
class RightTriangleTest {

    /**
     * A 3-4-5 right triangle should have area = (1/2) * 3 * 4 = 6.0.
     */
    @Test
    void testArea() {
        RightTriangle t = new RightTriangle(3.0, 4.0);
        assertEquals(
                6.0,
                t.getArea(),
                0.0,
                "Area should be (1/2) * legA * legB"
        );
    }

    /**
     * A 3-4-5 right triangle need to have perimeter = 3 + 4 + 5 = 12.0.
     */
    @Test
    void testPerimeter() {
        RightTriangle t = new RightTriangle(3.0, 4.0);
        assertEquals(
                12.0,
                t.getPerimeter(),
                0.0,
                "Perimeter should be legA + legB + square root((legA)^2 + (legB)^2)"
        );
    }

    /**
     * numberOfSides() should always return 3 for any triangle.
     */
    @Test
    void testNumberOfSides() {
        RightTriangle t = new RightTriangle(1.0, 2.0);
        assertEquals(
                3,
                t.numberOfSides(),
                "A triangle need to have 3 sides"
        );
    }

    /**
     * Constructing with a negative leg length should throw.
     */
    @Test
    void testNegativeLegThrows() {
        try {
            new RightTriangle(-1.0, 5.0);
            fail("Expected IllegalArgumentException for negative legA");
        } catch (IllegalArgumentException ex) {
            assertEquals("legs must be >= 0", ex.getMessage());
        }

        try {
            new RightTriangle(5.0, -2.0);
            fail("Expected IllegalArgumentException for negative legB");
        } catch (IllegalArgumentException ex) {
            assertEquals("legs must be >= 0", ex.getMessage());
        }
    }
}
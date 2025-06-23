package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the Square.
 */
class SquareTest {

    /**
     * A square of side 5.0 should have area = side^2 = 25.0.
     */
    @Test
    void testArea() {
        Square s = new Square(5.0);
        assertEquals(
                25.0,
                s.getArea(),
                0.0,
                "Area should be side^2"
        );
    }

    /**
     * A square of side 5.0 should have perimeter = 4 * side = 20.0.
     */
    @Test
    void testPerimeter() {
        Square s = new Square(5.0);
        assertEquals(
                20.0,
                s.getPerimeter(),
                0.0,
                "Perimeter should be 4 * side"
        );
    }

    /**
     * A square has four sides.
     */
    @Test
    void testNumberOfSides() {
        Square s = new Square(5.0);
        assertEquals(
                4,
                s.numberOfSides(),
                "numberOfSides() should return 4"
        );
    }

    /**
     * Constructing with a negative side length.
     */
    @Test
    void testNegativeSideThrows() {
        try {
            new Square(-2.0);
            fail("Expected IllegalArgumentException for negative side");
        } catch (IllegalArgumentException ex) {
            assertEquals("sides must be >= 0", ex.getMessage());
        }
    }
}
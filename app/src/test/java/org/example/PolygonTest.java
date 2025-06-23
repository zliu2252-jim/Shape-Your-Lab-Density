package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for Polygon interface.
 * Ensures each shape reports the correct number of sides.
 */
class PolygonTest {

    /**
     * Tests that each type of Polygon returns the expected side count
     */
    @Test
    void sidesCount() {
        assertEquals(4, new Rectangle(2,3).numberOfSides());
        assertEquals(4, new Square(5).numberOfSides());
        assertEquals(3, new RightTriangle(3,4).numberOfSides());
        assertEquals(3, new IsoscelesRightTriangle(7).numberOfSides());
    }
}
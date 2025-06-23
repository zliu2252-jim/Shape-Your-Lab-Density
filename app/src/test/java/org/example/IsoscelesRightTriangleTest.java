package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * The class is the unit tests for the IsoscelesRightTriangle class.
 */
class IsoscelesRightTriangleTest {

    /**
     * Verifies area calculation: (1/2) * leg^2.
     */
    @Test
    void testArea() {
        IsoscelesRightTriangle iso = new IsoscelesRightTriangle(4.0);
        assertEquals(
                0.5 * 4.0 * 4.0,
                iso.getArea(),
                0.0,
                "Area should be (1/2) × leg^2"
        );
    }

    /**
     * The test verifies perimeter: leg + leg + hypotenuse = 2*leg + leg*sqrt(2).
     */
    @Test
    void testPerimeter() {
        IsoscelesRightTriangle iso = new IsoscelesRightTriangle(4.0);
        double expected = 2 * 4.0 + 4.0 * Math.sqrt(2);
        assertEquals(
                expected,
                iso.getPerimeter(),
                0.0,
                "Perimeter should be 2*leg + leg*(square root 2)"
        );
    }

    /**
     * A triangle has three sides.
     */
    @Test
    void testNumberOfSides() {
        IsoscelesRightTriangle iso = new IsoscelesRightTriangle(4.0);
        assertEquals(
                3,
                iso.numberOfSides(),
                "numberOfSides() should return 3"
        );
    }

    /**
     * Throw for negative leg length.
     */
    @Test
    void testNegativeLegThrows() {
        try {
            new IsoscelesRightTriangle(-1.0);
            fail("Expected IllegalArgumentException for negative leg");
        } catch (IllegalArgumentException ex) {
            assertEquals(
                    "legs must be >= 0",
                    ex.getMessage(),
                    "Exception message need to indicate invalid leg"
            );
        }
    }
}









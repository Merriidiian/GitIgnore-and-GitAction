import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(10, calculator.addition(5, 5));
        assertEquals(10, calculator.addition(2, 8));
        assertEquals(10, calculator.addition(4, 6));
        assertEquals(10, calculator.addition(-10, 20));
    }

    @Test
    void testSubtraction() {
        assertEquals(10, calculator.subtraction(25, 15));
        assertEquals(10, calculator.subtraction(150, 140));
        assertEquals(10, calculator.subtraction(0, -10));
        assertEquals(10, calculator.subtraction(19, 9));
    }

    @Test
    void testMultiplication() {
        assertEquals(10, calculator.multiplication(2, 5));
        assertEquals(10, calculator.multiplication(-5, -2));
        assertEquals(10, calculator.multiplication(10, 1));
        assertEquals(18, calculator.multiplication(3, 6));
    }
    @Test
    void testDif() {
        assertEquals(10, calculator.div(100, 10));
        assertEquals(10, calculator.div(20, 2));
        assertEquals(10, calculator.div(5, 0.5));
        assertEquals(10, calculator.div(-50, -5));
    }

}

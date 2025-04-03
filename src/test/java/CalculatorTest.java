import static org.junit.jupiter.api.Assertions.*;

import com.bridgelabz.Calculator;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void testAddition() {
        assertEquals(5, calc.add(2, 3));
        assertEquals(-1, calc.add(-2, 1));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, calc.subtract(5, 3));
        assertEquals(-5, calc.subtract(-2, 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(10, calc.multiply(2, 5));
        assertEquals(-6, calc.multiply(-2, 3));
    }

    @Test
    void testDivision() {
        assertEquals(2, calc.divide(6, 3));
        assertEquals(-3, calc.divide(-9, 3));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calc.divide(5, 0);
        });
         assertEquals("Cannot divide by zero", exception.getMessage());
    }
}

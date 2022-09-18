import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void plus() {
     assertEquals(8, calculator.plus(5,3));
    }

    @Test
    void minus() {
        assertEquals(13, calculator.minus(23,10));
    }

    @Test
    void multiply() {assertEquals(25, calculator.multiply(5,5));
    }

    @Test
    void divide() {
        assertEquals(4, calculator.divide(16,4));
    }
}
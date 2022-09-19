import org.junit.jupiter.api.Test;
import java.lang.Exception;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void plus() throws Exception{
     assertEquals(8, calculator.plus(5,3));
    }

    @Test
    public void minus() throws Exception{
        assertEquals(13, calculator.minus(23,10));
    }

    @Test
    public void multiply() throws Exception{
        assertEquals(25, calculator.multiply(5,5));
    }

    @Test
    public void divide() throws Exception{
        assertEquals(4, calculator.divide(16,4));
    }
}
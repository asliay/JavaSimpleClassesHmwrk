import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;
    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(5, calculator.add(3, 2));
    }

    @Test
    public void canSubtract(){
        assertEquals(1, calculator.subtract(3,2));
    }

    @Test
    public void canMultiply(){
        assertEquals(6, calculator.multiply(3,2));
    }

    @Test
    public void canDivide(){
        assertEquals(3.0, calculator.divide(75.75, 25.25), 0.0);
    }
}

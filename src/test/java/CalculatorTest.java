import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void canAdd(){
        assertEquals(5, calculator.add(2, 3));
    }
}

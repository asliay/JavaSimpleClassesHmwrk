import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(50, 40);
    }

    @Test
    public void hasNumOfSheets(){
        assertEquals(50, printer.getSheets());
    }

    @Test
    public void hasToner(){
        assertEquals(40, printer.getToner());
    }

    @Test
    public void canPrint_true(){
        printer.print(5, 4);
        assertEquals(30, printer.getSheets());
        assertEquals(20, printer.getToner());
    }

    @Test
    public void canPrint_false(){
        assertEquals("Not enough paper/ toner.", printer.print(10,6));
    }
}

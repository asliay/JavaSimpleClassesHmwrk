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
    public void canPrint(){
        printer.print(5, 4);
        assertEquals(30, printer.getSheets());
        assertEquals(20, printer.getToner());
    }

    @Test
    public void cantPrint(){
        printer.print(10, 6);
        assertEquals(50, printer.getSheets());
        assertEquals(40, printer.getToner());
    }
}

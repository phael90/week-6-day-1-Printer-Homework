import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
    printer = new Printer(100);
    }

    @Test
    public void sheetCount(){
        assertEquals(100, printer.getSheetsNumber() );
    }

    @Test
    public void printEnoughPaper(){
        printer.print(10, 5);
        assertEquals(50, printer.getSheetsNumber());
    }

    @Test
    public void printNotEnoughPaper(){
        printer.print(50, 3);
        assertEquals(100, printer.getSheetsNumber());
    }

    @Test
    public void reFill(){
        printer.setRefill(50);
        assertEquals(150, printer.getSheetsNumber());
    }
}


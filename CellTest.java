import org.junit.Test;
import static org.junit.Assert.*;

public class CellTest {
    @Test
    public void testDefaultConstructor() {
        Cell cell = new Cell();
        assertNull(cell.getValue());
        assertEquals(Colour.SILVER, cell.getColour());
    }

    @Test
    public void testValueConstructor() {
        Cell cell = new Cell("5");
        assertEquals("5", cell.getValue());
        assertEquals(Colour.BLUE, cell.getColour());
    }

    @Test
    public void testSetValue() {
        Cell cell = new Cell();
        cell.setValue("10");
        assertEquals("10", cell.getValue());
    }

    @Test
    public void testToInt() {
        Cell cell = new Cell("5");
        assertEquals(5, cell.toInt());
    }

    @Test
    public void testToDouble() {
        Cell cell = new Cell("5.5");
        assertEquals(5.5, cell.toDouble(), 0.0);
    }

    @Test
    public void testToDateValid() {
        Cell cell = new Cell();
        Date date = cell.toDate(2021, 1, 1);
        // Assuming the showDate method prints the date to the console
        // You can add assertions to check the values of the year, month, and day of the returned date object
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToDateInvalid() {
        Cell cell = new Cell();
        cell.toDate(999, 13, 32);
    }

    @Test
    public void testReset() {
        Cell cell = new Cell("10");
        cell.reset();
        assertEquals("", cell.getValue());
    }
}

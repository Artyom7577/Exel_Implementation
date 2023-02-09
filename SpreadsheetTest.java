import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SpreadsheetTest {
    @Test
    public void testConstructor() {
        Spreadsheet spreadsheet = new Spreadsheet(5, 5);
        assertEquals(5, spreadsheet.m_cells.length);
        assertEquals(5, spreadsheet.m_cells[0].length);
        assertThrows(IllegalArgumentException.class, () -> new Spreadsheet(-1, 5));
        assertThrows(IllegalArgumentException.class, () -> new Spreadsheet(5, -1));
    }

    @Test
    public void testSetCellAtWithCellObject() {
        Spreadsheet spreadsheet = new Spreadsheet(5, 5);
        spreadsheet.setCellAt(0, 0, new Cell("value"));
        assertEquals("value", spreadsheet.getCellAt(0, 0));
        assertThrows(IllegalArgumentException.class, () -> spreadsheet.setCellAt(-1, 0, new Cell("value")));
        assertThrows(IllegalArgumentException.class, () -> spreadsheet.setCellAt(0, -1, new Cell("value")));
        assertThrows(IllegalArgumentException.class, () -> spreadsheet.setCellAt(6, 0, new Cell("value")));
        assertThrows(IllegalArgumentException.class, () -> spreadsheet.setCellAt(0, 6, new Cell("value")));
    }

    @Test
    public void testSetCellAtWithString() {
        Spreadsheet spreadsheet = new Spreadsheet(5, 5);
        spreadsheet.setCellAt(0, 0, "value");
        assertEquals("value", spreadsheet.getCellAt(0, 0));
        assertThrows(IllegalArgumentException.class, () -> spreadsheet.setCellAt(-1, 0, "value"));
        assertThrows(IllegalArgumentException.class, () -> spreadsheet.setCellAt(0, -1, "value"));
        assertThrows(IllegalArgumentException.class, () -> spreadsheet.setCellAt(6, 0, "value"));
        assertThrows(IllegalArgumentException.class, () -> spreadsheet.setCellAt(0, 6, "value"));
    }

    @Test
    public void testGetCellAt() {
        Spreadsheet spreadsheet = new Spreadsheet(5, 5);
        spreadsheet.setCellAt(0, 0, "value");
        assertEquals("value", spreadsheet.getCellAt(0, 0));
        assertThrows(IllegalArgumentException.class, () -> spreadsheet.getCellAt(-1, 0));
        assertThrows(IllegalArgumentException.class, () -> spreadsheet.getCellAt(0, -1));
    }

    @Test
    void addRowTest() {
        Spreadsheet sheet = new Spreadsheet(3, 3);
        sheet.setCellAt(0, 0, "Hello");
        sheet.setCellAt(1, 1, "World");
        sheet.addRow(1);
        assertEquals("Hello", sheet.getCellAt(0, 0));
        assertEquals("World", sheet.getCellAt(1, 1));
        assertNull(null, sheet.getCellAt(3, 2));
    }

    @Test
    void removeRowTest() {
        Spreadsheet sheet = new Spreadsheet(3, 3);
        sheet.setCellAt(0, 0, "Hello");
        sheet.setCellAt(1, 1, "World");
        sheet.removeRow(1);
        assertEquals("Hello", sheet.getCellAt(0, 0));
        assertEquals("World", sheet.getCellAt(1, 1));
        assertNull(null, sheet.getCellAt(1, 2));
    }

    @Test
    void addColumTest() {
        Spreadsheet sheet = new Spreadsheet(3, 3);
        sheet.setCellAt(0, 0, "Hello");
        sheet.setCellAt(1, 1, "World");
        sheet.addColum(1);
        assertEquals("Hello", sheet.getCellAt(0, 0));
        assertEquals("World", sheet.getCellAt(1, 1));
        assertNull(null, sheet.getCellAt(2, 3));
    }

    @Test
    void removeColumTest() {
        Spreadsheet sheet = new Spreadsheet(3, 3);
        sheet.setCellAt(0, 0, "Hello");
        sheet.setCellAt(1, 1, "World");
        sheet.removeColum(1);
        assertEquals("Hello", sheet.getCellAt(0, 0));
        assertEquals("World", sheet.getCellAt(1, 1));
        assertNull(sheet.getCellAt(2, 1));
    }
}


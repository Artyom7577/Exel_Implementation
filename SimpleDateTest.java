import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleDateTest {
    @Test
    public void testValidDates() {
        String[] validDates = {"01-01-2022", "2022-01-01", "01/01/2022", "2022/01/01",
                "01.01.2022", "2022.01.01"};
        for (String date : validDates) {
            Cell cell = new Cell(date);
            SimpleDate simpleDate = new SimpleDate(cell);
            assertEquals(date + " is a Date", simpleDate.checkDate());
        }
    }

    @Test
    public void testInvalidDate() {

        Cell cell1 = new Cell("32-13-2021");
        Cell cell2 = new Cell("2022-13-01");
        Cell cell3 = new Cell("01/32/2022");
        Cell cell4 = new Cell("2022/01/32");
        Cell cell5 = new Cell("01.0661.2022");
        Cell cell6 = new Cell("2022/01.01");

        SimpleDate simpleDate1 = new SimpleDate(cell1);
        SimpleDate simpleDate2 = new SimpleDate(cell2);
        SimpleDate simpleDate3 = new SimpleDate(cell3);
        SimpleDate simpleDate4 = new SimpleDate(cell4);
        SimpleDate simpleDate5 = new SimpleDate(cell5);
        SimpleDate simpleDate6 = new SimpleDate(cell6);

        assertEquals(" ", simpleDate1.checkDate());
        assertEquals(" ", simpleDate2.checkDate());
        assertEquals(" ", simpleDate3.checkDate());
        assertEquals(" ", simpleDate4.checkDate());
        assertEquals(" ", simpleDate5.checkDate());
        assertEquals(" ", simpleDate6.checkDate());
    }
}

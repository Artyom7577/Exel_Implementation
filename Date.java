import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SimpleDate {
    private String inDate;

    public SimpleDate(Cell cell) {

        inDate = cell.getValue();

        String inDate = cell.getValue();

        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dateFormat3 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dateFormat4 = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat dateFormat5 = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat dateFormat6 = new SimpleDateFormat("yyyy.MM.dd");

        dateFormat1.setLenient(false);
        dateFormat2.setLenient(false);
        dateFormat3.setLenient(false);
        dateFormat4.setLenient(false);
        dateFormat5.setLenient(false);
        dateFormat6.setLenient(false);
        try {
            dateFormat1.parse(inDate.trim());
            System.out.println(cell.getValue() + " is a Date");
        } catch (ParseException pe) {
        }
        try {
            dateFormat2.parse(inDate.trim());
            System.out.println(cell.getValue() + " is a Date");
        } catch (ParseException pe) {
        }
        try {
            dateFormat3.parse(inDate.trim());
            System.out.println(cell.getValue() + " is a Date");
        } catch (ParseException pe) {
        }
        try {
            dateFormat4.parse(inDate.trim());
            System.out.println(cell.getValue() + " is a Date");
        } catch (ParseException pe) {
        }
        try {
            dateFormat5.parse(inDate.trim());
            System.out.println(cell.getValue() + " is a Date");
        } catch (ParseException pe) {
        }
        try {
            dateFormat6.parse(inDate.trim());
            System.out.println(cell.getValue() + " is a Date");
        } catch (ParseException pe) {
        }
    }

    public String checkDate() {
        SimpleDateFormat[] dateFormats = new SimpleDateFormat[]{
                new SimpleDateFormat("dd-MM-yyyy"),
                new SimpleDateFormat("yyyy-MM-dd"),
                new SimpleDateFormat("dd/MM/yyyy"),
                new SimpleDateFormat("yyyy/MM/dd"),
                new SimpleDateFormat("dd.MM.yyyy"),
                new SimpleDateFormat("yyyy.MM.dd")
        };

        for (SimpleDateFormat dateFormat : dateFormats) {
            dateFormat.setLenient(false);
            try {
                dateFormat.parse(inDate.trim());
                return inDate + " is a Date";
            } catch (ParseException pe) {
                System.out.println(pe.getMessage());
            }
        }

        return " ";
    }
}


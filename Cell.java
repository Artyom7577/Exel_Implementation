public class Cell {
    private String m_Value;
    private final Colour colour;
    public Cell(){
        this.m_Value = null;
        this.colour = Colour.SILVER;
    }
    public Cell(String cl) {
        this.m_Value = cl;
        this.colour = Colour.BLUE;
    }
    public void setValue(String v) { m_Value = v; }
    public String getValue() { return m_Value; }
    public int toInt() { return Integer.parseInt(m_Value); }
    public double toDouble() { return Double.parseDouble(m_Value); }
    public Date toDate(int year, int mount, int day){
        if (year < 1000 || mount < 0 || mount > 12 || day < 0 || day > 31) {

            throw new IllegalArgumentException("something wrong in toDate method! ");

        }else {
            Date date = new Date(year, mount, day);
            date.showDate();
            return date;
        }
    }
    public void reset() { m_Value = ""; }
    public Colour getColour() { return colour; }
}

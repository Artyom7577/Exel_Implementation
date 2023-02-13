public class Cell {
    private String m_Value;
    private Colour colour;

    public Cell() {
        this.m_Value = null;
        this.colour = Colour.SILVER;
    }

    public Cell(String cl) {
        this.m_Value = cl;
        this.colour = Colour.BLUE;
    }

    public void setValue(String v) {
        m_Value = v;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Colour getColour() {
        return colour;
    }

    public String getValue() {
        return m_Value;
    }

    public int toInt() throws NumberFormatException {
        return Integer.parseInt(m_Value);
    }

    public double toDouble() throws NumberFormatException {
        return Double.parseDouble(m_Value);
    }

    public String toStrings() throws NumberFormatException {
        return String.valueOf(m_Value);
    }

    public SimpleDate toDate() {
        return new SimpleDate(this);
    }

    public void reset() {
        m_Value = "";
    }
}

public class Spreadsheet {
    Cell[][] m_cells;
    Spreadsheet(int row, int col) {
        if (row <= 0 || col <= 0) {
            throw new IllegalArgumentException("row or colum is a negative! ");
        }else {
            this.m_cells = new Cell[row][col];
            for (int i = 0; i < m_cells.length; i++) {
                for (int j = 0; j < m_cells[i].length; j++) {
                    this.m_cells[i][j] = new Cell(null);
                }
            }
        }
    }
    public void setCellAt(int row, int col, Cell cl) {
        if (row < 0 || row > m_cells.length || col < 0 || col > m_cells[0].length) {

            throw new IllegalArgumentException("index row or index colum is negative! or " +
                    "bigger that object length ");

        }else {
            for (int i = 0; i < m_cells.length; i++) {
                for (int j = 0; j < m_cells[i].length; j++) {
                    if (i == row && j == col) {
                        this.m_cells[i][j] = cl;
                    }
                }
            }
        }
    }
    public void setCellAt(int row, int col, String cl) {
        if (row < 0 || row > m_cells.length || col < 0 || col > m_cells[0].length) {

            throw new IllegalArgumentException("index row or index colum is negative! or " +
                    "bigger that object length ");

        }else {
            for (int i = 0; i < m_cells.length; i++) {
                for (int j = 0; j < m_cells[i].length; j++) {
                    if (i == row && j == col) {
                        this.m_cells[i][j] = new Cell(cl);
                    }
                }
            }
        }
    }
    public String getCellAt(int row, int col) {
        if (row < 0 || col < 0 || row >= m_cells.length || col >= m_cells[0].length) {

            throw new IllegalArgumentException("index row or index colum cant be negative or bigger! ");

        }else {
            return m_cells[row][col].getValue();
        }
    }
    public void addRow(int row) {
        if (row < 0) {

            throw new IllegalArgumentException("add row index is negative! ");

        }else {
            int rows = m_cells.length;
            int cols = m_cells[0].length;
            Cell[][] newArray = new Cell[rows + row][cols];
            for (int i = 0; i < rows; i++) {
                System.arraycopy(m_cells[i], 0, newArray[i], 0, cols);
            }
            for (int i = rows; i < rows + row; i++) {
                for (int j = 0; j < cols; j++) {
                    newArray[i][j] = new Cell();
                }
            }
            m_cells = newArray;

            for (int i = 0; i < m_cells.length; i++) {
                for (int j = 0; j < m_cells[i].length; j++) {
                    if (m_cells[i][j] == null) {
                        m_cells[i][j] = new Cell();
                    }
                }
            }
        }
    }
    public void removeRow(int row) {
        if (row < 0 || row > m_cells.length) {

            throw new IllegalArgumentException("remove Row index is negative or bigger than array Row! ");

        }else {

            int rows = m_cells.length;
            int cols = m_cells[0].length;
            Cell[][] newArray = new Cell[rows - row][cols];
            for (int i = 0; i < rows - row; i++) {
                System.arraycopy(m_cells[i], 0, newArray[i], 0, cols);
            }
            for (int i = 0; i < rows - row; i++) {
                for (int j = 0; j < cols; j++) {
                    m_cells[i][j] = new Cell();
                }
            }
            m_cells = newArray;
        }
    }
    public void addColum(int col) {
        if(col < 0){

            throw new IllegalArgumentException("Colum is negative or 0");

        }else {

            int rows = m_cells.length;
            int cols = m_cells[0].length;
            Cell[][] newArray = new Cell[rows][cols + col];
            for (int i = 0; i < rows; i++) {
                System.arraycopy(m_cells[i], 0, newArray[i], 0, cols);
            }
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols + col; j++) {
                    if (newArray[i][j] == null) {
                        newArray[i][j] = new Cell();
                    }
                }
            }
            m_cells = newArray;

            for (int i = 0; i < m_cells.length; i++) {
                for (int j = 0; j < m_cells[i].length; j++) {
                    if (m_cells[i][j] == null) {
                        m_cells[i][j] = new Cell();
                    }
                }
            }
        }
    }
    public void removeColum(int col) {
        if (col < 0 || col > m_cells[0].length) {

            throw new IllegalArgumentException("remove Colum index is negative or bigger than array Colum! ");

        }else {

            int rows = m_cells.length;
            int cols = m_cells[0].length;
            Cell[][] newArray = new Cell[rows][cols - col];
            for (int i = 0; i < rows; i++) {
                System.arraycopy(m_cells[i], 0, newArray[i], 0, cols - col);
            }
            m_cells = newArray;

            for (int i = 0; i < m_cells.length; i++) {
                for (int j = 0; j < m_cells[i].length; j++) {
                    if (m_cells[i][j] == null) {
                        m_cells[i][j] = new Cell();
                    }
                }
            }
        }
    }
    public void swapRows(int r1, int r2) {
        if (r1 < 0 || r2 < 0 || r1 > m_cells.length || r2 > m_cells.length) {

            throw new IllegalArgumentException("swap numbers is negative or bigger than row! ");

        } else {

            Cell[] swapRows;
            swapRows = m_cells[r1];
            m_cells[r1] = m_cells[r2];
            m_cells[r2] = swapRows;
            System.out.println();
        }
    }
    public void swapColums(int c1, int c2) {
        if (c1 < 0 || c2 < 0 || c1 > m_cells[0].length || c2 > m_cells[0].length) {

            throw new IllegalArgumentException("swap numbers is negative or bigger than Colum! ");

        } else {

            Cell swapColums;
            int rows = m_cells.length;
            for (int i = 0; i < rows; i++) {
                swapColums = m_cells[i][c1];
                m_cells[i][c1] = m_cells[i][c2];
                m_cells[i][c2] = swapColums;
            }
            System.out.println();
        }
    }
    public void showMatrix(){
        System.out.println();
        for (Cell[] mCell : m_cells) {
            for (Cell cell : mCell) {
                System.out.print(cell.getValue() + " ");
            }
            System.out.println();
        }
    }
}

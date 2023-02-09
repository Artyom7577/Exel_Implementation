# Exel_Implementation
This code implements a simple Spreadsheet class in Java. The Spreadsheet has a 2D array of Cells. 
The constructor creates an instance of the Spreadsheet class with a specified number of rows and columns. 
The class provides several methods to modify the cells, such as setCellAt(int row, int col, Cell cl), 
which sets the value of a cell at the specified row and column to the specified Cell, 
and setCellAt(int row, int col, String cl), which sets the value of a cell at the specified row and 
column to a new Cell with the specified string value.

The getCellAt(int row, int col) method returns the value of a cell at the specified row and column. 
The addRow(int row) method adds the specified number of rows to the Spreadsheet, 
and the removeRow(int row) method removes the specified number of rows from the Spreadsheet. 
The addColum(int col) method adds the specified number of columns to the Spreadsheet, 
and the removeColum(int col) method removes the specified number of columns from the Spreadsheet.





public class CharMatrix
{
  public final char SPACE = ' ';
  

  private char[][] grid;
  


  public CharMatrix(int rows, int cols)
  {
    grid = new char[rows][cols];
    fillRect(0, 0, rows - 1, cols - 1, ' ');
  }
  




  public CharMatrix(int rows, int cols, char fill)
  {
    grid = new char[rows][cols];
    fillRect(0, 0, rows - 1, cols - 1, fill);
  }
  



  public int numRows()
  {
    return grid.length;
  }
  



  public int numCols()
  {
    return grid[0].length;
  }
  



  public char charAt(int row, int col)
  {
    return grid[row][col];
  }
  



  public void setCharAt(int row, int col, char ch)
  {
    grid[row][col] = ch;
  }
  




  public boolean isEmpty(int row, int col)
  {
    return charAt(row, col) == ' ';
  }
  





  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
    for (int r = row0; r <= row1; r++)
    {
      for (int c = col0; c <= col1; c++)
      {
        setCharAt(r, c, fill);
      }
    }
  }
  





  public void clearRect(int row0, int col0, int row1, int col1)
  {
    fillRect(row0, col0, row1, col1, ' ');
  }
  



  public int countInRow(int row)
  {
    int count = 0;
    
    for (int c = 0; c < numCols(); c++) {
      if (!isEmpty(row, c))
        count++;
    }
    return count;
  }
  



  public int countInCol(int col)
  {
    int count = 0;
    
    for (int r = 0; r < numRows(); r++) {
      if (!isEmpty(r, col))
        count++;
    }
    return count;
  }
}

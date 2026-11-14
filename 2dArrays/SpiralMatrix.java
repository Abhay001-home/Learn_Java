public class SpiralMatrix {
     static void printSpiral(int[][] matrix){
          if(matrix == null || matrix.length == 0){
               return;
          }
          
          int startRow = 0;
          int endRow = matrix.length - 1;
          int startCol = 0;
          int endCol = matrix[0].length - 1;

          // matrix is of m x n size
          while (startRow <= endRow && startCol <= endCol) {
               // TOPMOST ROW j stands for Columns -->  i stands for Rows
               for (int j = startCol; j <= endCol; j++) {
                    System.out.print(matrix[startRow][j] + " ");
               }

               // RIGHTMOST COLUMN
               for (int i = startRow + 1; i <= endRow; i++) {
                    System.out.print(matrix[i][endCol] + " ");
               }

               // BOTTOMMOST row
               for (int j = endCol - 1; j >= startCol; j--) {
                    
                    if(startRow == endRow){
                         break;
                    }
                    
                    System.out.print(matrix[endRow][j] + " ");
               }

               // leftmost column
               for (int i = endRow - 1; i >= startRow + 1; i--) {
                    
                    if (startCol == endCol) {
                         break;
                    }
                    
                    System.out.print(matrix[i][startCol] + " ");
               }

               startRow++;
               endRow--;
               startCol++;
               endCol--;
          }
          System.out.println();

     }

     public static void main(String[] args){
          int[][] grid = {{1, 2, 3, 4},
                         {5, 6, 7, 8,},
                         {9, 10, 11, 12},
                    {13,14,15,16}};
          
          printSpiral(grid);
     }
}

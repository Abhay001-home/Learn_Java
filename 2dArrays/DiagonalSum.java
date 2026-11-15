public class DiagonalSum {
     static int diagonalSum(int[][] matrix){
          
          // 1. Brute - Force
          int sum = 0;
          /* 
          for (int i = 0; i < matrix.length; i++) {
               for (int j = 0; j < matrix[0].length; j++) {
                    // Primary Diagonal Sum of the array
                    if( i == j ){
                         sum = sum + matrix[i][j];
                    }
                    // Secondary Diagonal Sum of the array
                    else if (i+j == matrix.length - 1) {
                         sum = sum + matrix[i][j];
                    }
               }
          }
          return sum;
          // Time Comlexity - O(n^2)
          */

          // 2. Optimal Approach
          for (int i = 0; i < matrix.length; i++) {
               // primary diagonal
               sum = sum + matrix[i][i];
               
               // secondary diagonal
               // if matrix has odd no. of rows
               if(i != matrix.length-1 - i){
                    sum = sum + matrix[i][matrix.length-1 -i];
               }
          }
          return sum;
          // TC: O(n)
     }

     public static void main(String[] args) {
          int[][] grid = {{1, 2, 3, 4}, { 5, 6, 7, 8 }, { 9, 0, 11, 12 }, { 13, 14, 15, 16 }};
          System.out.println(diagonalSum(grid));

     }
}

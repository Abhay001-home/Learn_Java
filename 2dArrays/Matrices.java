import java.util.Scanner;

public class Matrices {

     static boolean search(int[][] grid, int key){
          for (int i = 0; i < grid.length; i++) {
               for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == key) {
                         System.out.print("the row and column are : ");
                         System.out.println(i + " " + j);
                         return true;
                    }
               }
          }
          return false;
     }

     static boolean findLargest(int[][] matrix){
          int max = matrix[0][0];
          for (int i = 0; i < matrix.length; i++) {
               for (int j = 0; j < matrix.length; j++) {
                    if(matrix[i][j] > max){
                         max = matrix[i][j];
                         return true;
                    }
               }
          }
          System.out.println(max);
          return false;
     }

     static boolean findSmallest(int[][] matrix){
          int min = matrix[0][0];
          for (int i = 0; i < matrix.length; i++) {
               for (int j = 0; j < matrix.length; j++) {
                    if (matrix[i][j] < min) {
                         min = matrix[i][j];
                         return true;
                    }
               }
          }
          System.out.println(min);
          return false;
     }

     // main function
     public static void main(String[] args) {
          int[][] matrix = new int[3][3];
          int row = matrix.length, col = matrix[0].length;
          
          Scanner sc = new Scanner(System.in);
          for (int i = 0; i < row; i++) {
               for (int j = 0; j < col; j++) {
                    matrix[i][j] = sc.nextInt();
               }
          }
          System.out.println( "Output" );

          // print the matrix
          for (int i = 0; i < row; i++) {
               for (int j = 0; j < col; j++) {
                    System.out.print(matrix[i][j] + " ");
               }
               System.out.println();
          }

          search(matrix, 5);
          findLargest(matrix);
          findSmallest(matrix);
          
          sc.close();
     }
}

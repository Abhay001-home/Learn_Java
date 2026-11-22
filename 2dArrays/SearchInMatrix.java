public class SearchInMatrix {
     static boolean searchInSortedMatrix(int[][] grid, int key) {
          int n = grid.length;
          int m = grid[0].length;

          // 1. Brute-force method TC - O( n^2 )
          // traverse every element in the matrix
          for (int i = 0; i < n; i++) {
               for (int j = 0; j < m; j++) {
                    if (grid[i][j] == key) {
                         System.out.println("key is at (" + i + "," + j + ")");
                         return true;
                    }
               }
          }
          return false;
     }

     // 2. Better method Binary search twice TC - O(log n + log m)
     static boolean searchInSortedMatrixBetter(int[][] grid, int key) {
          int low = 0, high = grid.length - 1;
          int row = -1;

          while (low <= high) {
               int mid = (low + high) / 2;

               // if the first element of mid row is equal to x,
               // return true
               if (key == grid[mid][0])
                    return true;

               // if x is greater than first element of mid row,
               // store the mid row and search in lower half
               if (key > grid[mid][0]) {
                    row = mid;
                    low = mid + 1;
               }

               // if x is smaller than first element of mid row,
               // search in upper half
               else
                    high = mid - 1;
          }

          // if x is smaller than all elements of mat[][]
          if (row == -1)
               return false;

          return search(grid[row], key);
     }

     static boolean search(int[] arr, int x) {
          int lo = 0, hi = arr.length - 1;

          while (lo <= hi) {
               int mid = (lo + hi) / 2;

               if (x == arr[mid])
                    return true;
               if (x < arr[mid])
                    hi = mid - 1;
               else
                    lo = mid + 1;
          }
          return false;
     }

     // 3. optimal method Staircase Search TC - O(log (n x m))
     static boolean searchInSortedMatrixOptimal(int[][] grid, int key) {
          // top-right corner starting
          int row = 0, col = grid[0].length - 1;

          while (row < grid.length && col >= 0) {
               if (grid[row][col] == key) {
                    System.out.println("found key at (" + row + "," + col + " )");
                    return true;
               } else if (key < grid[row][col]) {
                    col--;
               } else { // key > grid[row][col]
                    row++;
               }
          }
          System.out.println("key not foumd");
          return false;

          // bottom-left corner starting
     }

     public static void main(String[] args) {
          int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
          System.out.println(searchInSortedMatrix(matrix, 15));

          System.out.println(searchInSortedMatrixBetter(matrix, 11));

          System.out.println(searchInSortedMatrixOptimal(matrix, 18));
     }
}

public class SearchInMatrix {

     // 1. BRUTE-FORCE METHOD
     // Idea: Check every single cell in the matrix one by one until we find `key`.
     // Time Complexity: O(n * m) — or O(n^2) if the matrix is n x n.
     // Space Complexity: O(1) — uses only a few loop variables.
     static boolean searchInSortedMatrix(int[][] grid, int key) {
          int n = grid.length; // Total number of rows
          int m = grid[0].length; // Total number of columns

          // Outer loop moves down row by row (top to bottom)
          for (int i = 0; i < n; i++) {
               // Inner loop moves across column by column (left to right)
               for (int j = 0; j < m; j++) {
                    // Check if the current cell matches the target `key`
                    if (grid[i][j] == key) {
                         System.out.println("key is at (" + i + "," + j + ")");
                         return true;
                    }
               }
          }

          // We checked the entire matrix and did not find `key`
          return false;
     }

     // 2. BETTER METHOD: Binary Search on Rows + Binary Search on One Row
     // Assumption: Rows are sorted left-to-right, and each row starts with a value
     // greater than or equal to the end of the previous row
     // (strictly/non-decreasingly sorted).
     // Step 1: Use binary search on the first column to find which row could contain
     // `key`.
     // Step 2: Use binary search inside that single row to find `key`.
     // Time Complexity: O(log n + log m)
     // Space Complexity: O(1)
     static boolean searchInSortedMatrixBetter(int[][] grid, int key) {
          int low = 0, high = grid.length - 1;
          int row = -1; // Will store the candidate row index that might hold `key`

          // Binary search over row indices using the first element (grid[mid][0]) of each
          // row
          while (low <= high) {
               int mid = (low + high) / 2;

               // Lucky hit: `key` matches the first number in row `mid`
               if (key == grid[mid][0])
                    return true;

               // If `key` is larger than the first number of row `mid`,
               // `key` could be in row `mid` or a later row.
               // Save `mid` as a candidate and search lower rows (larger indices).
               if (key > grid[mid][0]) {
                    row = mid;
                    low = mid + 1;
               }
               // If `key` is smaller than the first number of row `mid`,
               // `key` cannot be in row `mid` or below it; search upper rows.
               else {
                    high = mid - 1;
               }
          }

          // If `row` is still -1, `key` is smaller than the very first element of row 0
          if (row == -1)
               return false;

          // Now run standard binary search inside the single candidate row
          return search(grid[row], key);
     }

     // Helper method: Standard binary search on a 1D sorted array `arr`
     static boolean search(int[] arr, int x) {
          int lo = 0, hi = arr.length - 1;

          while (lo <= hi) {
               int mid = (lo + hi) / 2;

               if (x == arr[mid])
                    return true;

               // Target is smaller, so ignore the right half
               if (x < arr[mid])
                    hi = mid - 1;
               // Target is larger, so ignore the left half
               else
                    lo = mid + 1;
          }

          // Element was not found in this row
          return false;
     }

     // 3. OPTIMAL METHOD: Staircase Search
     // Assumption: Each row is sorted left-to-right AND each column is sorted
     // top-to-bottom.
     // Start at the top-right corner:
     // - Moving LEFT decreases values (good when `key` is smaller).
     // - Moving DOWN increases values (good when `key` is larger).
     // This creates a "staircase" path that eliminates a row or column each step.
     // Time Complexity: O(n + m)
     // Space Complexity: O(1)
     static boolean searchInSortedMatrixOptimal(int[][] grid, int key) {
          // Start at top-right corner: row 0, last column
          int row = 0, col = grid[0].length - 1;

          // Stay inside valid matrix boundaries
          while (row < grid.length && col >= 0) {
               if (grid[row][col] == key) {
                    System.out.println("found key at (" + row + "," + col + " )");
                    return true;
               } else if (key < grid[row][col]) {
                    // Current value is too big; move left to smaller numbers
                    col--;
               } else { // key > grid[row][col]
                    // Current value is too small; move down to larger numbers
                    row++;
               }
          }

          // Went out of bounds without finding `key`
          System.out.println("key not foumd");
          return false;

          // Note: You can also start at the bottom-left corner (row = n - 1, col = 0):
          // move UP when key < current, and RIGHT when key > current.
     }

     public static void main(String[] args) {
          // Sample 4x4 sorted matrix
          int[][] matrix = {
                    { 1, 2, 3, 4 },
                    { 5, 6, 7, 8 },
                    { 9, 10, 11, 12 },
                    { 13, 14, 15, 16 }
          };

          // Test brute-force search (finds 15 at row 3, col 2)
          System.out.println(searchInSortedMatrix(matrix, 15));

          // Test binary-search-based method (finds 11 at row 2, col 2)
          System.out.println(searchInSortedMatrixBetter(matrix, 11));

          // Test staircase search (18 is not in the matrix, prints false)
          System.out.println(searchInSortedMatrixOptimal(matrix, 18));
     }
}
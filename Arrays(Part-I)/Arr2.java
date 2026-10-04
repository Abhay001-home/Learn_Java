public class Arr2 {

     /*
      Course Outcome: Linear Search, Largest in Array, Smallest in an array, Binary Search
     */

     public static int linSearch(int[] arr, int key) {
          for (int i = 0; i < arr.length - 1; i++) {
               if (arr[i] == key) {
                    return i;
               }
          }
          return -1;
     }

     public static int maxInArr(int[] arr) {
          int max = Integer.MIN_VALUE;
          for (int i = 0; i < arr.length; i++) {
               if (arr[i] > max) {
                    max = arr[i];
               }
          }
          return max;
     }

     public static int getSmallest(int arr[]) {
          int smallest = Integer.MAX_VALUE;
          for (int i = 0; i < arr.length; i++) {
               if (arr[i] < smallest) {
                    smallest = arr[i];
               }
          }
          return smallest;
     }

     public static int binSearch(int[] arr, int key) {
          int low = 0, high = arr.length - 1;
          while (low <= high) {
               int mid = low + (high - low) / 2;
               if (arr[mid] == key) {
                    return mid;
               } else if (arr[mid] > key) {
                    high = mid - 1;
               } else {
                    low = mid + 1;
               }
          }
          return -1;
     }

     public static void main(String[] args) {
          int[] arr = { 2, 4, 6, 8, 10 };
          int key = 10;
          linSearch(arr, key);
          maxInArr(arr);
          binSearch(arr, key);
     }
}

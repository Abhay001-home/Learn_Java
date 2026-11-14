public class selection {

     // pick the smallest and place it at the beginning
     public static void selectionSort(int[] nums) {
          int n = nums.length;
          // turns: loop up to n - 1
          for (int i = 0; i < n - 1; i++) {
               int smallest = i;
               // inner loop: check all the way to n
               for (int j = i + 1; j < n; j++) {
                    if (nums[smallest] > nums[j]) {
                         smallest = j;
                    }
               }
               // swap
               int temp = nums[smallest];
               nums[smallest] = nums[i];
               nums[i] = temp;
          }
     }

     public static void printArray(int[] nums) {
          for (int i = 0; i < nums.length; i++) {
               System.out.print(nums[i] + " "); // Changed println to print for a cleaner single-line output
          }
          System.out.println();
     }

     public static void main(String[] args) {
          int[] arr = { 5, 4, 9, 2, 3, 54, 52 };
          selectionSort(arr);
          printArray(arr);
     }
}
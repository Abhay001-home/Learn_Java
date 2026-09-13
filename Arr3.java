public class Arr3 {
     /*
      * Course Outcome: Reverse an array, Pairs in an array, SubArrays in an array
      */
     public static void revArray(int[] arr) {
          int low = 0;
          int high = arr.length - 1;
          while (low <= high) {
               int temp = arr[low];
               arr[low] = arr[high];
               arr[high] = temp;
          }
          System.out.println(arr);
     }

     public static void pairArray(int numbers[]) {
          int totalPair = 0;
          for (int i = 0; i < numbers.length; i++) {
               for (int j = i + 1; j < numbers.length; j++) {
                    System.out.print("(" + numbers[i] + "," + numbers[j] + ") ");
                    totalPair++;
               }
               System.out.println();
          }
          System.out.println("Total pairs are: " + totalPair);
     }

     // find all possible subarrays in given an array    
     public static void printSubarray(int numbers[]) {
          for (int i = 0; i < numbers.length; i++) {
               int start = i;
               for (int j = i; j < numbers.length; j++) {
                    int end = j;
                    for (int k = start; k <= end; k++) {
                         System.out.print(numbers[k] + " ");
                    }
                    System.out.println();
               }
          }
     }

     public static void maxSubArraySum(int numbers[]) {
          int currSum = 0;
          int maxSum = Integer.MIN_VALUE;
          for (int i = 0; i < numbers.length; i++) {
               int start = i;
               for (int j = i; j < numbers.length; j++) {
                    int end = j;
                    currSum = 0; // Reset currSum for each new subarray
                    for (int k = start; k <= end; k++) {
                         currSum += numbers[k];
                    }
                    maxSum = Math.max(maxSum, currSum);
               }
          }
          System.out.println("The maximum subarray sum is: " + maxSum);
     }

     // by Kadane's algorithm
     public static void maxsubArraySumOptimize(int numbers[]) {
          int currSum = 0;
          int maxSum = Integer.MIN_VALUE;
          for (int i = 0; i < numbers.length; i++) {
               currSum += numbers[i];
               if (currSum < 0) {
                    currSum = 0;
               }
               maxSum = Math.max(maxSum, currSum);
          }
          System.out.println("The maximum subarray sum is: " + maxSum);
     }

     public static void main(String[] args) {
          int[] arr = { 1, 2, 3, 4, 5, 6 };
          revArray(arr);
          pairArray(arr);
          printSubarray(arr);
          maxSubArraySum(arr);
          maxsubArraySumOptimize(arr);

     }

}

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

     public static void printPairsOfArray(int[] arr){
          for (int i = 0; i < arr.length; i++) {
               int curr = arr[i];
               for (int j = i+1; j < arr.length; j++) {
                    System.out.print("(" + curr + "," + arr[j] + ")");
               }
               System.out.println();
          }
     }

     public static void totalPairInArray(int numbers[]) {
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
          int totalSubArray = 0;
          for (int i = 0; i < numbers.length; i++) {
               int start = i;
               for (int j = i; j < numbers.length; j++) {
                    int end = j;
                    for (int k = start; k <= end; k++) {
                         System.out.print(numbers[k] + " ");
                    }
                    totalSubArray++;
                    System.out.println();
               }
          }
          System.out.println(totalSubArray);
     }

     // calculating the sum of the SubArrays
     public static void maxSubArraySum(int numbers[]) {
          int currSum = 0;
          int maxSum = Integer.MIN_VALUE;
          for (int i = 0; i < numbers.length; i++) {
               int start = i;
               for (int j = i; j < numbers.length; j++) {
                    int end = j;
                    // Reset currSum for each new subarray
                    currSum = 0; 
                    for (int k = start; k <= end; k++) {
                         currSum += numbers[k];
                    }
                    maxSum = Math.max(maxSum, currSum);
               }
          }
          System.out.println("The maximum subarray sum is: " + maxSum);
     }
     
     // calculating maxsubarraysum using prefix sum array
     public static void maxSubArraySumPrefix(int numbers[]) {
          int currSum = 0;
          int maxSum = Integer.MIN_VALUE;
          int prefix[] = new int[numbers.length];

          // calculate prefix array
          prefix[0] = numbers[0];
          for (int i = 1; i < prefix.length; i++) {
               prefix[i] = prefix[i-1] + numbers[i];
          }

          for (int i = 0; i < numbers.length; i++) {
               int start = i;
               for (int j = i; j < numbers.length; j++) {
                    int end = j;
                    currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                    maxSum = Math.max(maxSum, currSum);
               }
          }
          System.out.println("The maximum subarray sum is: " + maxSum);
     }

     // by Kadane's algorithm
     public static void maxsubArraySumKadane(int numbers[]) {
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
          printPairsOfArray(arr);
          totalPairInArray(arr);
          printSubarray(arr);
          maxSubArraySum(arr);
          maxSubArraySumPrefix(arr);
          maxsubArraySumKadane(arr);

     }

}

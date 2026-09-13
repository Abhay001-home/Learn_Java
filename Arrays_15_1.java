// import java.util.Scanner;
public class Arrays_15_1 {
     // public static void inputArray(int size){
     //      int[] arr = new int[size];
     //      for (int i=0; i<size;i++){
     //           Scanner sc = new Scanner(System.in);
     //           System.out.print("Enter the element at index "+i+" : ");
     //           arr[i] = sc.nextInt();
     //           sc.close();
     //      }
     //      for (int i=0;i<size;i++){
     //           System.out.println("array is: ");
     //           System.out.print(arr[i]+" ");
     //      }
     // }
     
     // public static int linearSearch(int no[],int size,int key){
     //      for(int i=0;i<size;i++){
     //           if (no[i]==key){
     //                return i;
     //           }
     //      }
     //      return -1;
     // }

     // public static int getLargest(int arr[]){
     //      int largest =Integer.MIN_VALUE;
     //      for (int i=0;i< arr.length;i++){
     //           if (arr[i]>largest){
     //                largest = arr[i];
     //           }
     //      }
     //      return largest;
     // }

     // public static int getSmallest(int arr[]){
     //      int smallest = Integer.MAX_VALUE;
     //      for (int i=0;i< arr.length;i++){
     //           if(arr[i]<smallest){
     //                smallest = arr[i];
     //           }
     //      }
     //      return smallest;
     // }

     // public static void binarySearch(int arr[], int key) {
     //      int start = 0;
     //      int end = arr.length - 1;
     //      while (start <= end) {
     //          int mid = start + (end - start) / 2; // Safer way to calculate mid
  
     //          if (arr[mid] == key) {
     //              System.out.println("Element found at index: " + mid);
     //              return;
     //          } else if (arr[mid] < key) {
     //              start = mid + 1;
     //          } else {
     //              end = mid - 1;
     //          }
     //      }
     //      System.out.println("Element not found in the array.");
     // }

     // public static void pairArray(int numbers[]){
     //      int totalPair = 0;
     //      for (int i=0;i<numbers.length;i++){
     //           for (int j=i+1;j<numbers.length;j++){
     //                System.out.print("("+numbers[i]+","+numbers[j]+")  ");
     //                totalPair++;
     //           }
     //           System.out.println();
     //      }
     //      System.out.println("Total pairs are: "+totalPair);
     // }

     // public static void printSubarray(int numbers[]){
     //      for (int i=0;i<numbers.length;i++){
     //           int start = i;
     //           for (int j=i;j<numbers.length;j++){
     //                int end = j;
     //                for (int k=start;k<=end;k++){
     //                     System.out.print(numbers[k]+" ");
     //                }
     //                System.out.println();
     //           }
     //      }
     // }

     // public static void maxSubArraySum(int numbers[]){
     //      int currSum =0;
     //      int maxSum = Integer.MIN_VALUE;
     //      for (int i=0;i<numbers.length;i++){
     //           int start = i;
     //           for (int j=i;j<numbers.length;j++){
     //                int end = j;
     //                currSum = 0; // Reset currSum for each new subarray
     //                for (int k=start;k<=end;k++){
     //                     currSum += numbers[k];
     //                }
     //                maxSum = Math.max(maxSum,currSum);
     //           }
     //      }
     //      System.out.println("The maximum subarray sum is: "+maxSum);
     // }    

     // public static void maxsubArraySum(int numbers[]){      //by Kadane's algorithm
     //      int currSum =0;
     //      int maxSum = Integer.MIN_VALUE;
     //      for (int i=0;i<numbers.length;i++){
     //           currSum += numbers[i];
     //           if (currSum<0){
     //                currSum = 0;
     //           }
     //           maxSum = Math.max(maxSum,currSum);
     //      }
     //      System.out.println("The maximum subarray sum is: "+maxSum);
     // }

     
     public static void main (String[] args){
          // Scanner sc = new Scanner(System.in);
          // System.out.println("size of the array is: ");
          // int size = sc.nextInt();
          
          // inputArray(size);
          
          // int[] arr = new int[size];
          // for (int i=0; i<size;i++){
          //      System.out.print("Enter the element at index "+i+" : ");
          //      arr[i] = sc.nextInt();
          // }
          // int key;
          // System.out.print("Enter the element to be searched: ");
          // key = sc.nextInt();
          // int result = linearSearch(arr,size,key);
          // if (result == -1){
          //      System.out.println("Element not found in the array.");
          // }else{
          //      System.out.println("Element found at index: "+result);
          // }

          // int arr[] = {1,2,33,4,51,6,77,8,0};
          // System.out.println("The largest element in the array is: "+getLargest(arr));
          // System.out.println("The smallest element in the array is: "+getSmallest(arr));
          
          // int[] numbers = {1,2,3,4,5,-6,7,-8,9,10};
          // int key = 0;
          // binarySearch(arr, key);

          // for (int i=0;i<arr.length;i++){
          //      System.out.print(arr[i]+" ");
          // }

          // pairArray(numbers);

          // printSubarray(numbers);

          // maxSubArraySum(numbers);

          // maxsubArraySum(numbers); //kadane's algorithm
          // sc.close();
     }     
}
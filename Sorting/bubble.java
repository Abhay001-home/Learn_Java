import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class bubble {

     public static void bubbleSort(int arr[]) {
          int n = arr.length;
          // taking turns
          for (int i = 0; i < n - 1; i++) {
               // for swapping each element
               for (int j = 0; j < n-i-1; j++) {
                    if (arr[j] > arr[j + 1]) {
                         // swapping the adjacent element
                         int temp = arr[j];
                         arr[j] = arr[j + 1];
                         arr[j + 1] = temp;
                    }
               }
          }
     }
     // Time Complexity - O(n^2) 

     public static void printArray(int arr[]) {
          for (int i = 0; i < arr.length; i++) {
               System.out.print(arr[i] + " ");
          }
          System.out.println();
     }

     // internally they uses COMPARATOR class to do these things
     static int compare(int a, int b) {
          // a < b -> -ve | a == b -> 0 | a > b -> +ve
          return b - a; // used when comparator class is used 
     }

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter the number of elements in the array: ");
          int n = sc.nextInt();

          Integer arr1[] = new Integer[n]; 
          int arr[] = new int[n]; // int is used to sort in ascending order

          System.out.println("Enter the elements of the array: ");
          for (int i = 0; i < n; i++) {
               arr[i] = sc.nextInt();
          }

          bubbleSort(arr);
          printArray(arr);

          // by using Arrays class --- Time Complexity - O(nlogn)
          Arrays.sort(arr);

          for (int i = 0; i < n; i++) {
               System.out.print(arr[i] + " ");
          }

          // Arrays.sort(arrayName, startIndex, endIndex);

          // by the use of Colections class. We can sort an array in DESCENDING order & it works on OBJECT not primitve data types
          Arrays.sort(arr1, Collections.reverseOrder());
          
          for (int i = 0; i < n; i++) {
               System.out.print(arr[i] + " ");
          }

          // Arrays.sort(arrayName, startIndex, endIndex, Collections.reverseOrder());

          sc.close();
     }

}

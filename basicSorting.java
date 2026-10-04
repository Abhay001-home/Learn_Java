import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class basicSorting {

     public static void bubbleSort(int arr[]) {
          int n = arr.length;
          for (int turn = 0; turn < n - 1; turn++) {
               for (int j = 0; j < n - turn - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                         // swapping the adjacent element
                         int temp = arr[j];
                         arr[j] = arr[j + 1];
                         arr[j + 1] = temp;
                    }
               }
          }
     }

     public static void printArray(int arr[]) {
          for (int i = 0; i < arr.length; i++) {
               System.out.print(arr[i] + " ");
          }
          System.out.println();
     }

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter the number of elements in the array: ");
          int n = sc.nextInt();

          Integer arr1[] = new Integer[n];// Integer is used to sort in reverse order
          int arr[] = new int[n]; // int is used to sort in ascending order

          System.out.println("Enter the elements of the array: ");
          for (int i = 0; i < n; i++) {
               arr[i] = sc.nextInt();
          }

          bubbleSort(arr);
          printArray(arr);

          Arrays.sort(arr);
          for (int i = 0; i < n; i++) {
               System.out.print(arr[i] + " ");
          }

          Arrays.sort(arr1, Collections.reverseOrder());
          for (int i = 0; i < n; i++) {
               System.out.print(arr[i] + " ");
          }
          sc.close();
     }

}

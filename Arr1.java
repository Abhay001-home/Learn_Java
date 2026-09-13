import java.util.Scanner;

public class Arr1{
     /*
     Course Outcome: Array creation, input, output and update
     */

     public static void printArr(int arr[]){
          for (int i = 0; i < arr.length - 1; i++) {
               System.out.println(arr[i]);
          }
     }
     public static void main(String[] args) {
          // creation
          // array is initialised as an empty array which stores 0 as value 
          int[] empArr = new int[10];
          // array where length is determined by the no. of elements
          int[] arr = {2,3,4};
          int arr1[] = {2,3,4};

          Scanner sc = new Scanner(System.in);
          for (int i = 0; i < empArr.length - 1; i++) {
               empArr[i] = sc.nextInt();
          }
          
          // print memory referencing hashcode
          System.out.println(empArr);
          
          // printing element of array
          printArr(empArr);
     }
}
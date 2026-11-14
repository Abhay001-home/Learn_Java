import java.util.Arrays;

public class RotateArray {
     static void rotateLeftByShifting(int[] arr) {
          if (arr == null || arr.length <= 1)
               return;

          // Store the last element in a temp variable.
          int firstElement = arr[0];

          // Shift every other element one position ahead.
          for (int i = 1; i < arr.length; i++) {
               arr[i - 1] = arr[i];
          }
          // After shifting, update the first element with value stored in temp
          arr[arr.length - 1] = firstElement;

     }

     public static void main(String[] args) {
          int[] arr = { 1, 2, 3, 4, 5 };
          rotateLeftByShifting(arr);
          System.out.println(Arrays.toString(arr));
     }
}

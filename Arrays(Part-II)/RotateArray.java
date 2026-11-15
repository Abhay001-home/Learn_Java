import java.util.ArrayList;
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

     static void rotateBydPlace(int[] arr, int shift){
          int size = arr.length;
          shift = shift % size;

          // 1. Storing the elemnts in temp[] array
          ArrayList<Integer> temp = new ArrayList<>();
          for(int i = 0; i < shift; i++){
               temp.add(arr[i]);
          }
          // 2. Shifting of the elements
          for (int i = shift; i < arr.length; i++) {
               arr[i - shift] = arr[i];
          }
          // 3. Put back the elements
          for (int i = size - shift; i < size; i++) {
               arr[i] = temp.get(i - (size - shift));
          }
     }

     public static void main(String[] args) {
          int[] arr = { 1, 2, 3, 4, 5, 6, 7};
          rotateLeftByShifting(arr);
          System.out.println(Arrays.toString(arr));

          // here shift is treated as index value so upto that index will gets shifted
          int shift = 2;
          rotateBydPlace(arr, shift);
          System.out.println(Arrays.toString(arr));
     }
}

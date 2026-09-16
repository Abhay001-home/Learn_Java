import java.util.*;

public class Arr4 {
     /*
      * 1. is there atleast 2duplicates in the given array
      * 2.
      */

     public static boolean duplicate(int[] arr) {
          // Brute force approach
          // Time complexity -> O(n^2)

          for (int i = 0; i < arr.length; i++) {
               for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j])
                         return true;
               }

          }
          return false;
     }

     public static boolean containDuplicate(int[] nums) {
          // Using sets 
          // Time Complexity -> O(n)
          HashSet<Integer> set = new HashSet<>();
          for (int i = 0; i < nums.length; i++) {
               if (set.contains(nums[i])) {
                    return true;
               } else {
                    set.add(nums[i]);
               }
          }
          return false;
     }

     public static void main(String[] args) {
          int[] arr = { 1, 2, 3, 1 };
          
          System.out.println(duplicate(arr));
          System.out.println(containDuplicate(arr));
     }
}

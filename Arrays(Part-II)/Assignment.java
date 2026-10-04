import java.util.*;

public class Assignment {
     /*
      * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
      * Example 1:
      * Input: nums = [1, 2, 3, 1]
      * Output: true
      * Example 2:
      * Input: nums = [1, 2, 3, 4]
      * Output: false
      * Example 3:
      * Input: nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
      * Output: true
      * Constraints: • 1 <= nums . lengtth <= 105
      * • -109 <= nums [ i ] <= 109
      */

     // Brute force approach
     // Time complexity -> O(n^2)
     public static boolean duplicate(int[] arr) {

          for (int i = 0; i < arr.length; i++) {
               for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j])
                         return true;
               }

          }
          return false;
     }

     // Using Sets
     // Time Complexity -> O(n)
     public static boolean containDuplicate(int[] nums) {
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

     /*
      * In a rotated sorted array, dividing it in half will always result in at least one strictly sorted half. We can use this property to narrow down our search:
      * Find the middle element (mid).
      * Check if the target is at mid.
      * Determine which half (left or right) is normally sorted.
      * Check if the target falls within the range of the sorted half:
      * --> If it does, narrow the search to that half.
      * --> If it doesn't, search the other half.
      * Repeat until pointers cross.
      */

     public static int search(int[] nums, int target) {
          // min will have index of minimum element of nums
          int min = minSearch(nums);
          // find in sorted left
          if (nums[min] <= target && target <= nums[nums.length - 1]) {
               return search(nums, min, nums.length - 1, target);
          }
          // find in sorted right
          else {
               return search(nums, 0, min, target);
          }
     }

     // binary search to find target in left to right boundary
     public static int search(int[] nums, int left, int right, int target) {
          int l = left;
          int r = right;
          // System.out.println(left+" "+right);
          while (l <= r) {
               int mid = l + (r - l) / 2;
               if (nums[mid] == target) {
                    return mid;
               } else if (nums[mid] > target) {
                    r = mid - 1;
               } else {
                    l = mid + 1;
               }
          }
          return -1;
     }

     // smallest element index
     public static int minSearch(int[] nums) {
          int left = 0;
          int right = nums.length - 1;
          while (left < right) {
               int mid = left + (right - left) / 2;
               if (mid > 0 && nums[mid - 1] > nums[mid]) {
                    return mid;
               } else if (nums[left] <= nums[mid] && nums[mid] > nums[right]) {
                    left = mid + 1;
               } else {
                    right = mid - 1;
               }
          }

          return left;
     }

     public static void main(String[] args) {
          int[] arr = { 1, 2, 3, 1 };
          System.out.println(duplicate(arr));
          System.out.println(containDuplicate(arr));

          int[] nums = {4, 5, 6, 7, 0, 1, 2};
          int target = 0;
          System.out.println(search(nums,target));
     }
}

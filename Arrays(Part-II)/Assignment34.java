import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class Assignment34 {

     // question-3 Buy and Sell Stock

     public static int buyAndSellStock(int prices[]) {
          int maxProfit = 0;
          int buyPrice = Integer.MAX_VALUE;
          for (int i = 0; i < prices.length; i++) {
               if (prices[i] < buyPrice) {
                    buyPrice = prices[i];
               } else {
                    int profit = prices[i] - buyPrice;
                    maxProfit = Math.max(maxProfit, profit);
               }
          }
          return maxProfit;
     }

     // Question-4 Trapped RainWater

     public static int trappedWater(int height[]) {

          int n = height.length;
          // calculate leftmaximum of height
          int leftMax[] = new int[n];
          leftMax[0] = height[0];
          for (int i = 1; i < n; i++) {
               leftMax[i] = Math.max(height[i], leftMax[i - 1]);
          }

          // calculate rightmaximum of height
          int rightMax[] = new int[n];
          rightMax[n - 1] = height[n - 1];
          for (int i = n - 2; i >= 0; i--) {
               rightMax[i] = Math.max(height[i], rightMax[i + 1]);
          }

          // loop for storing the water
          int trappedWater = 0;
          for (int i = 0; i < n; i++) {

               // calculate water trapped at each index
               int waterLevel = Math.min(leftMax[i], rightMax[i]);

               // return total water trapped
               trappedWater += waterLevel - height[i];
          }
          return trappedWater;
     }

     // Question-5   Given an integer array nums, return all the triplets [nums[i], nums[j],nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.Notice that the solution set must not contain duplicate triplets

     public static List<List<Integer>> threeSum(int nums[]) {
          List<List<Integer>> result = new ArrayList <List<Integer>> ();
          for(int i=0; i<nums.length; i++) {
               for(int j=i+1; j<nums.length; j++) {
                    for(int k=j+1; k<nums.length; k++) {
                         if(nums[i] + nums[j] + nums[k] == 0) {
                              List<Integer> triplet = new ArrayList < Integer > ();
                              triplet.add(nums[i]);
                              triplet.add(nums[j]);
                              triplet.add(nums[k]);
                              Collections.sort(triplet);
                              result.add(triplet);
                         }
                    }
               }
          }
          result = new ArrayList<List<Integer>> (new LinkedHashSet<List<Integer>> (result));
          return result;
     }

     public static void main(String[] args) {
          int prices[] = { 7, 1, 5, 3, 6, 4 };
          System.out.println(buyAndSellStock(prices));

          // int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
          // System.out.println(trappedWater(height));

          int[] nums = {-1, 0, 1, 2, -1, -4};
          System.out.println(threeSum(nums));

     }
}

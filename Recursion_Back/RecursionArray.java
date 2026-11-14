import java.util.ArrayList;

public class RecursionArray {

     // linear search return true/false
     static boolean find(int[] arr, int target, int index){
          if(index == arr.length) return false;
          return arr[index] == target || find(arr, target, index+1);
     }

     // linear search starting from 0 return index value
     static int findIndex(int[] arr, int target, int index){
          if(index == arr.length){
               return -1;
          }

          if (arr[index] == target) {
               return index;
          }else{
               return findIndex(arr, target, index+1);
          }
     }

     // linear search starting from arr.length(end) return index of the value
     static int findLastIndex(int[] arr, int target, int index) {
          if (index == -1) {
               return -1;
          }

          if (arr[index] == target) {
               return index;
          } else {
               return findIndex(arr, target, index - 1);
          }

     }

     // find all index/occurrences in the given array return list initialised before the function call
     static ArrayList<Integer> list = new ArrayList<>();
     static void findAllIndex(int[] arr, int target, int index){
          if (index == arr.length) {
               return;
          }

          if (arr[index] == target) {
               list.add(index);
          }
          findAllIndex(arr, target, index + 1);
     }

     // find all index/occurrences in the given array return list initialised inside the function call
     static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
          ArrayList<Integer> list = new ArrayList<>();
          if(index == arr.length){
               return list;
          }

          // this will store answer for that function only
          if(arr[index] == target){
               list.add(index);
          }

          ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index+1);
          list.addAll(ansFromBelowCalls);
          
          return list;
     }

     // Rotated Binary Search Using Recursion
     

     public static void main(String[] args) {
          int[] arr = {3, 2, 4, 0, 18, 0};
          System.out.println(find(arr, 18, 0));
          System.out.println(findIndex(arr, 18, 0));
          System.out.println(findLastIndex(arr, 18, arr.length - 1));
          findAllIndex(arr, 18, 0);
          System.out.println(list);

          System.out.println(findAllIndex2(arr, 0, 0));
     }
}
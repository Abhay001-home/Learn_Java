public class insertion {

     public static void insertionSort(int[] nums){
          for (int i = 1; i < nums.length; i++) {
               int curr = nums[i];
               int prev = i - 1;
               // finding the position element to be inserted 
               while(prev >= 0 && nums[prev] > curr){
                    nums[prev+1] = nums[prev];
                    prev--;
               }
               // insertion
               nums[prev+1] = curr;
          }
     }

     public static void printArray(int[] nums){
          for (int i = 0; i < nums.length; i++) {
               System.out.print(nums[i] + " ");
          }
          System.out.println();
     }
     public static void main(String[] args) {
          int[] arr = {5,4,1,32,2};
          insertionSort(arr);
          printArray(arr);
     }
}

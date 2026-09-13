class maxArr {
     static int missingNum(int arr[]) {
          // code here
          int n = arr.length + 1;
          long totalSum = (long) n * (n + 1) / 2;

          long currSum = 0;
          for (int i = 0; i < n - 1; i++) {
               currSum += arr[i];
          }
          return (int) (totalSum - currSum);
     }

     public static void main(String[] args) {
          int[] arr = { 1 };
          System.out.println(missingNum(arr));
     }
}

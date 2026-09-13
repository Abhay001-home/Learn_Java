import java.util.Scanner;
// public class no_reversal {
     // public static void main(String[] args) {
     //      System.out.println("enter the number: ");
     //      Scanner sc = new Scanner(System.in);
     //      int n = sc.nextInt();
     //      int rev =0;
     //      while(0<n){
     //           int lastDigit = n%10;
     //           rev = (rev*10)+lastDigit;
     //           n = n/10;
     //      }
     //      System.out.println(rev);
     //      sc.close();
     // }
// }
public class revArr{
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int[] arr =new int[n];
          int i=0;
          int j = arr.length-1; 
          while(i<=j){
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
          }
          System.out.println(arr);
          sc.close();
     }
}
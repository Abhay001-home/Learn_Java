import java.util.*;

public class Func_Ques {

     public static void avgThree(int a, int b, int c) {
          int avg = (int) (a + b + c) / 3;
          System.out.println(avg);
     }

     public static void isEven(int e) {
          if (e % 2 == 0) {
               System.out.println("True");
          } else {
               System.out.println("False");
          }
     }

     public static void isPalindrome(int p) {
          int originalNum = p; // Save the original number
          int rev = 0; // Variable to store the reversed number
          while (p > 0) {
               int rem = p % 10; // Get the last digit of n
               rev = rev * 10 + rem; // Build the reversed number
               p = p / 10; // Remove the last digit from n
          }
          if (rev == originalNum) {
               System.out.println("Palindrome");
          } else {
               System.out.println("Not Palindrome");
          }
     }

     public static void sumOfDigits(int s) {
          int sum = 0;
          while (s > 0) {
               int ld = s % 10;
               sum = sum + ld;
               s = s / 10;
          }
          System.out.println("Sum of the given input number is: " + sum);
     }

     public static void main(String[] args) {
          // System.out.println("Enter three integer values to calculate their average:");
          // System.out.println("Enter the value to verify Even number");
          System.out.println("Enter the integer value to get the sum of the integer value: ");
          Scanner sc = new Scanner(System.in);
          
          // change the input variable according to its need

          int a = sc.nextInt();
          
          // int b = sc.nextInt();
          // int c = sc.nextInt();
          
          // avgThree(a, b, c);
          // isEven(e);
          // isPalindrome(p);
          // sumOfDigits(s);
          
          sc.close();
     }
}

import java.util.Scanner;

public class JavaBasics {
     // public static void calculateSum(int a, int b) {
     // int sum = a + b;
     // System.out.println("Sum: " + sum);
     // }

     // public static void swapNumber(int a,int b){
     // int temp =a;
     // a=b;
     // b=temp;
     // System.out.println("After swapping: a = " + a + ",\n\t\tb = " + b);
     // }

     // public static void productOfTwo(int a,int b){
     // int product = a*b;
     // System.out.println("Product: " + product);
     // }

     // public static int facTorial(int a) {
     // if (a == 0 || a==1){
     // return 1;
     // } else {
     // return a * facTorial(a - 1);
     // }
     // }
     
     // public static int binomialCoeficient(int n, int k) {
     // if (k == 0 || k == n) {
     // return 1;
     // } else {
     // return binomialCoeficient(n - 1, k - 1) + binomialCoeficient(n - 1, k);
     // }
     // }

     // function overloading multiple methods with same name but different parameters
     // multiply(int a,int b)
     // multiply(float a,float b)
     // multiply(int a,float b)
     // multiply(float a,int b)
     // multiply(double a,double b)
     // multiply(inta, int b,int c)

     // public static boolean optimisedPrime(int n){
     //      if (n==2){
     //           return true; 
     //     }
     //      for(int i=2; i<=Math.sqrt(n); i++){
     //           if (n%i == 0){
     //                return false;
     //           }
     //      }
     //      return true;
     // }

     // public static void primeInRange(int n){
     //      for (int i=2; i<=n; i++){
     //           if(optimisedPrime(i)){
     //                System.out.println(i + " ");
     //           }
     //      }
     //      System.out.println();
     // }

     // public static int binToDec(int n){
     //      int pow = 0;
     //      int dec = 0;
     //      while(n > 0){
     //           int lsd = n%10;
     //           dec = dec + (lsd * (int)Math.pow(2,pow));
     //           pow++;
     //           n = n/10;
     //      }
     //      return dec;
     // }

     public static void decToBin(int n){
          int pow = 0;
          int bin = 0;
          while(n>0){
               int lsd = n%2;
               bin = bin + lsd * (int)Math.pow(10,pow);
               pow++;
               n =n/2;
          }
          System.out.println("Binary: " + bin);
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          // System.out.println("Enter two numbers to calculate different properties:");
          // System.out.println("Enter two numbers to calculate binomial coefficient:");
          // int a = sc.nextInt();
          // int b = sc.nextInt();
          // calculateSum(a,b);
          // swapNumber(a,b);
          // productOfTwo(a, b);
          // System.out.println("Enter a number to calculate its factorial:");
          // facTorial(a);
          // System.out.println("Factorial of " + a + " is: " + facTorial(a));
          // binomialCoeficient(a, b);
          // System.out.println("Binomial Coefficient of " + a + " and " + b + " is: " +
          // binomialCoeficient(a, b));
          // System.out.println("It is prime: " + optimisedPrime(7));
          // primeInRange(20);
          // System.out.print("Enter binary values to convert it into binary to decimal:");
          // int n = sc.nextInt();
          // // int dec = binToDec(n);
          // System.out.println("Decimal: " + binToDec(n));
          System.out.print("Enter decimal values to convert it into decimal to binary:");
          int n = sc.nextInt();
          decToBin(n);
          sc.close(); // Close the scanner to prevent resource leaks
     }
}
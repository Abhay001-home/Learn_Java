import java.util.*;

public class armstrongAndPrime {
     public static void armstrongNo(int n){
          int origNum = n;
          int sumOfDigits = 0;
          while(n != 0){
               int digit = n%10;
               n = n/10;
               sumOfDigits += digit*digit*digit;  
          }
          if(origNum == sumOfDigits){
               System.out.println("Armstrong Number this is");
          }else{
               System.out.println("it is not");
          }
     }
     public static void main(String[] args) {
          System.out.println("Verify your number: ");
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          
          // if (n==2){
          //      System.out.println("no. is prime");
          // }else{
          //      boolean isPrime = true;
          //      for(int i=2;i<=Math.sqrt(n);i++){//we can write this also for(int i=2;i<=n-1;i++){}
          //           if(n%i == 0){
          //           isPrime = false;}}
          //      if (isPrime == true) {
          //           System.out.println("prime");                    
          //      } else {
          //           System.out.println("non prime");
                    
          //      }
          // }

          armstrongNo(n);
          sc.close();
     }    
}
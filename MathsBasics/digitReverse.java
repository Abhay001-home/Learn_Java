import java.util.Scanner;

public class digitReverse {
     public static void main(String[] args) {
          System.out.println("enter the number: ");
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int rev =0;
          while(0<n){
               int lastDigit = n%10;
               rev = (rev*10)+lastDigit;
               n = n/10;
          }
          System.out.println(rev);
          sc.close();
     }
}

import java.util.Scanner;

public class Strings {
     static void printLetters(String str) {
          for (int i = 0; i < str.length(); i++) {
               System.out.print(str.charAt(i));
               // System.out.print(str.charAt(i%4)); ;-)
          }

          System.out.println();

          for (char st : str.toCharArray()) {
               System.out.print(st);
          }
     }

     public static void main(String[] args) {
          // char[] arr = { 'q', 'w', 'e', 'r' };

          // Strings are immutable to do changes create new String
          // String str = "qwer";

          // String str2 = new String("qwer");

          Scanner sc = new Scanner(System.in);
          // String inp = sc.next(); // will take a word only
          // System.out.println(inp);

          // String inpLine = sc.nextLine();
          // System.out.println(inpLine);

          // System.out.println(inpLine.length());

          // Concatenation
          String firstName = "Alex";
          String lastName = "Pandian";
          String name = firstName + " " + lastName;
          System.out.println(name);
          System.out.println(name.charAt(5));
          printLetters(name);

          sc.close();
     }
}

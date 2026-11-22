public class PaliShortestPath {
     static void palinDrome(String str) {
          int start = 0;
          int end = str.length() - 1;

          while (start < end) {
               if (str.charAt(start) != str.charAt(end)) {
                    System.out.println("no palindrome");
                    return;
               }
               start++;
               end--;
          }
          System.out.println("palindrome");
     }

     static boolean isPalindrome(String str) {

          for (int i = 0; i < str.length() / 2; i++) {
               int n = str.length();
               if (str.charAt(i) != str.charAt(n - 1 - i)) {
                    return false;
               }
          }
          return true;
     }

     static float getShortestPath(String s) {
          int x = 0, y = 0;
          for (int i = 0; i < s.length(); i++) {
               char dir = s.charAt(i);
               // South direction
               if (dir == 'S' || dir == 's') {
                    y--;
               }
               // North direction
               else if (dir == 'N' || dir == 'n') {
                    y++;
               }
               // East direction
               else if (dir == 'E' || dir == 'e') {
                    x++;
               }
               // West direction
               else {
                    x--;
               }

          }
          float x2 = x * x, y2 = y * y;
          return (float) Math.sqrt(x2 + y2);
     }

     public static void main(String[] args) {
          // String text = "madqam";
          // palinDrome(text);

          // System.out.println(isPalindrome(text));

          String path = "weswesnews";
          System.out.println(getShortestPath(path));
     }
}

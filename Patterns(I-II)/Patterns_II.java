// import java.util.*;
public class Patterns_II {
     // public static void hollow_rectangle(int row, int col){
     //      // outer loop for rows
     //      for(int i=1;i<=row;i++){
     //           // inner loop for columns
     //           for(int j=1;j<=col;j++){
     //                // condition for first and last row or first and last column
     //                if(i==1 || i==row || j==1 || j==col){
     //                     System.out.print("* ");
     //                }else{
     //                     System.out.print("  ");
     //                }
     //           }
     //           System.out.println();
     //      }
     // }

     // public static void invert_triangle(int row, int col){
     //      // outer loop for rows
     //      for(int i=1;i<=row;i++){
     //           // inner loop for columns
     //           for(int j=1;j<=col;j++){
     //                // condition for first and last row or first and last column
     //                     if((i+j)<=row){    // for 10 rows and 10 columns
     //                     System.out.print(" ");
     //                }else{
     //                     System.out.print("*");//add space the right of asterisk to get a pyramid shape
     //                }
     //           }
     //           System.out.println();
     //      }
     // }

     // public static void leftToRightUpward(int row, int col){
     //      // outer loop for rows
     //      for(int i=1;i<=row;i++){
     //           // inner loop for columns
     //           for(int j=1;j<=col;j++){
     //                // condition for first and last row or first and last column
     //                if(i<j){
     //                     System.out.print(" ");
     //                }else{
     //                     System.out.print("*");
     //                }
     //           }
     //           System.out.println();
     //      }
     // }

     // public static void rightToLeftDownward(int row, int col){
     //      // outer loop for rows
     //      for(int i=1;i<=row;i++){
     //           // inner loop for columns
     //           for(int j=1;j<=col;j++){
     //                // condition for first and last row or first and last column
     //                if(i>j){
     //                     System.out.print(" ");
     //                }else{
     //                     System.out.print("*");
     //                }
     //           }
     //           System.out.println();
     //      }
     // }

     // public static void inverted_pyramid_diff_no(int row){
     //      // outer loop for rows
     //      for(int i=1;i<=row;i++){
     //           // inner loop for columns
     //           for(int j=1;j<=(row-i)+1;j++){
     //                System.out.print(" "+j);  //different no. printed having it in same line
     //           }
     //           System.out.println();
     //      }
     // }

     // public static void inverted_pyramid_same_no(int row){
     //      // outer loop for rows
     //      for(int i=1;i<=row;i++){
     //           // inner loop for columns
     //           for(int j=1;j<=(row-i)+1;j++){
     //                System.out.print("  "+i);     //repetitive no. printed having it in same line
     //           }
     //           System.out.println();
     //      }
     // }

     
     // public static void floyd_triangle(int row){
     //      // outer loop for rows
     //      int count=1; // to print different no. in same line
     //      for(int i=1;i<=row;i++){
     //           for(int j=1;j<=i;j++){
     //                System.out.print("  "+ count +" ");
     //                count++; //incrementing the value of count to print different no. in same line
     //           }
     //           System.out.println();
     //      }
     // }

     // public static void  binary_triangle(int a){
     //      for(int i=1;i<=a;i++){
     //           for(int j=1;j<=i;j++){
     //                if((i+j)%2==0){
     //                     System.out.print("1 ");
     //                }else{
     //                     System.out.print("0 ");
     //                }
     //           }
     //           System.out.println("--> "+i);
     //      }
     // }

     // public static void butterfly_Pattern(int a){
     //      // first half of the butterfly pattern
     //      for (int i = 1; i <=a; i++) {
     //           for (int j = 1; j <= i; j++) {
     //                System.out.print("*");
     //           }
     //           for (int j = 1; j <= 2 * (a - i); j++) {
     //                System.out.print(" ");
     //           }
     //           for (int j = 1; j <= i; j++) {
     //                System.out.print("*");
     //           }
     //           System.out.println();
     //      }
     //      // second half of the butterfly pattern
     //      for (int i = a; i >=1; i--) {
     //           for (int j = 1; j <= i; j++) {
     //                System.out.print("*");
     //           }
     //           for (int j = 1; j <= 2 * (a - i); j++) {
     //                System.out.print(" ");
     //           }
     //           for (int j = 1; j <= i; j++) {
     //                System.out.print("*");
     //           }
     //           System.out.println();
     //      }
     // }

     // public static void solid_Rhombus(int row){
     //      for(int i=1;i<=row;i++){
     //           for(int j=1;j<=row-i;j++){
     //                System.out.print(" ");
     //           }
     //           for(int j=1;j<=row;j++){
     //                System.out.print(" * ");
     //           }
     //           System.out.println();
     //      }
     // }

     // public static void hollow_Rhombus(int row){
     //      for(int i=1;i<=row;i++){
     //           for(int j=1;j<=row-i;j++){
     //                System.out.print(" ");    //Print spaces to get a rhombus shape
     //           }
     //           for(int j=1;j<=row;j++){
     //                if(j==1 || j==row || i==1 || i==row){ // condition for first and last row or first and last column
     //                     System.out.print(" * ");
     //                }else{
     //                     System.out.print("   ");
     //                }
     //           }
     //           System.out.println();
     //      }
     // }

     // public static void diamond(int row){
     //      // upper half of the diamond
     //      for(int i=1;i<=row;i++){
     //           for(int j=1;j<=row-i;j++){
     //                System.out.print(" ");
     //           }
     //           for(int j=1;j<=2*i-1;j++){
     //                System.out.print("*");
     //           }
     //           System.out.println();
     //      }
     //      // lower half of the diamond
     //      for(int i=row-1;i>=1;i--){
     //           for(int j=1;j<=row-i;j++){
     //                System.out.print(" ");
     //           }
     //           for(int j=1;j<=2*i-1;j++){
     //                System.out.print("*");
     //           }
     //           System.out.println();
     //      }
     // }
     public static void main(String[] args){
          // Scanner sc =new Scanner(System.in);
          // System.out.println("Enter the number of rows and columns for hollow rectangle: ");
          // int a = sc.nextInt();
          // int b = sc.nextInt();
          // hollow_rectangle(a,b);
          // invert_triangle(a, b);
          // left_right_upward(a, b);
          // rightToLeftDownward(a, b);
          // inverted_pyramid_diff_no(a);
          // inverted_pyramid_same_no(a);
          // floyd_triangle(a);
          // binary_triangle(a);
          // butterfly_Pattern(a);
          // solid_Rhombus(a);
          // hollow_Rhombus(a);
          // diamond(a);
          // sc.close();
     }
}

import java.util.Scanner;

class TestOddEven {
 public static void main(String arg[]){
   int num;
   //Read a number
   Scanner input = new Scanner(System.in);
   System.out.println("Enter a number to check its Even or Odd");
   num = input.nextInt();
   // Conditional operator
   System.out.println((num%2)==0 ? "even number":"odd number");
  }
}
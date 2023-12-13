//To find their sum and average

import java.util.Scanner;

public class SumAverage
{
   public static void main(String args[])
   {
      Scanner reader = new Scanner(System.in);
      System.out.print("\nEnter the first number: ");
      int n1 = reader.nextInt();
      System.out.print("\nEnter the second number: ");
      int n2 = reader.nextInt();
      System.out.print("\nEnter the third number: ");
      int n3 = reader.nextInt();
      System.out.print("\nEnter the fourth number: ");
      int n4 = reader.nextInt();
      System.out.print("\nEnter the fifth number: ");
      int n5 = reader.nextInt();
      int sum = n1 + n2 + n3 + n4 + n5;
      float avg = (n1 + n2 + n3 + n4 + n5)/5;
      System.out.print("Sum of " + n1 +"," + n2 +","+ n3 +"," + n4 +"," + n5 +" = " + sum);
      System.out.print("Average of " + n1 +"," + n2 +","+ n3 +"," + n4 +"," + n5 +" = " + avg);
   }
}
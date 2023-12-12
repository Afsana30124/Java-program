//Whether the year is a leap year or not

import java.util.Scanner;

public class LeapYear
{
   public static void main(String args[])
   {
      Scanner reader = new Scanner(System.in);
      System.out.print("Enter the year = ");
      int year = reader.nextInt();
      if(year %400 == 0)
      {
         System.out.print("\nEntered year is a leap year");
      }
      else if(year %4 == 0 && year %100 != 0)
      {
         System.out.print("\nEntered year is a leap year");
      }
      else
      { 
         System.out.print("\nEntered year is not a leap year");

      }
   }
}
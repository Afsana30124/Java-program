//To display first n natural number

import java.util.Scanner;

public class FirstnNatural
{
   public static void main(String args[])
   { 
      Scanner reader = new Scanner(System.in);
      System.out.print("\nEnter the total numbers: ");
      int number= reader.nextInt();
      System.out.print("First n numbers are ");
      for(int i=1;i<=number;i++)
      {
         System.out.print(i);
      }
   }
}
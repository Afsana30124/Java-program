import java.util.Scanner;
public class Evenodd
{
    public static void main(String args[])
    {
        System.out.print("Enter a number:");
        Scanner reader=new Scanner(System.in);
        int num = reader.nextInt();
        reader.close();
        if(num%2==0)
        {
            System.out.print("\nEnterd number"+ num +"is an Even number");
        }
        else
        {
            System.out.print("\nEntered number"+ num +"is an Odd number");
        }
    }
}


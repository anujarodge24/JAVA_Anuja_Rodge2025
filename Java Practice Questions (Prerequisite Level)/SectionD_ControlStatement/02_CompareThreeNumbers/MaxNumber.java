//Accept 3 numbers and find the maximum using nested if-else.
import java.util.Scanner;

class MaxNumber
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number1:");
        int num1 = sc.nextInt();

        System.out.print("Enter number2:");
        int num2 = sc.nextInt();

        System.out.print("Enter number3:");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3)
        {
            System.out.println(num1 +" is maximum");
        }
            
        else if(num2 > num3)
        {
            System.out.println(num2 +" is maximum");
        }
        else
        {
            System.out.println(num3 +" is maximum");
        }

    }
    
}
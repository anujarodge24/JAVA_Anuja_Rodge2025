import java.util.Scanner;

class EvenOdd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer:");
        int num = sc.nextInt();

        if(num % 2 == 0)
        {
            System.out.print("It's Even number");
        }

        else if(num%2 != 0 )
        {
            System.out.println("It's Odd number");
        }

    }
}
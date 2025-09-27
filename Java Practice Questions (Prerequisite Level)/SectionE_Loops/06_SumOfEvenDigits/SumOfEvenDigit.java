import java.util.Scanner;

class SumOfEvenDigit
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number:");
        int number = sc.nextInt();

        int digit;  
        int sum =0 ;
        while(number!=0)
        {
            digit=number%10;
            if(digit % 2 == 0)
            {
                sum = sum + digit;
            }
            number = number/10;
        }

        System.out.print("Sum of even digit in number: "+ sum );


    }
}
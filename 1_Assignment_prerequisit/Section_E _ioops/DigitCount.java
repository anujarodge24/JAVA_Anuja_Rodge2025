import java.util.Scanner;

class DigitCount
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number:");
        int number = sc.nextInt();

        int digit =0;  
        
        while(number!=0)
        {
            number = number/10;
            digit++;
        }

        System.out.print("Number of digit in number: "+ digit );


    }
}
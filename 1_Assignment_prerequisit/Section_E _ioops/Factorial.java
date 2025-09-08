import java.util.Scanner;

class Factorial
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number:");
        int a = sc.nextInt();

        int b = a-1;

        while(b>0)
        {
            a = a * b;
            b = b - 1 ;
        }

        System.out.print(" Factorial of number :"+ a );


    }
}
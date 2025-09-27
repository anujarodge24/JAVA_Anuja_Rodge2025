//Print Fibonacci series up to N terms.
import java.util.Scanner;

class Fabonacci
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number of terms in Fabonacci Series: ");
        int n = sc.nextInt();

        int a=0,b=1,c=0;

        for(int i = 0;i<n;i++)
        {
            System.out.print(" " + a);
            c = a+b;
            a = b;
            b = c;
            

        }
    }
}

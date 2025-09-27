
import java.util.Scanner;

class NumberReverse
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int num= sc.nextInt();

        int A ;
        int reversed= 0;

        while(num!= 0)
        {
            A = num % 10;
            reversed = reversed* 10 + A;
            num = num / 10;
           
        }
        System.out.println("Display Reversed number: "+reversed);
       
    }
}
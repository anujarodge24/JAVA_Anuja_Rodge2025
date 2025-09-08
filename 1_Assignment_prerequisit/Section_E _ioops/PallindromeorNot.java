import java.util.Scanner;

class PallindromeorNot
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int num= sc.nextInt();

        int A ;
        int reversed= 0;
        int original = num;

        while(num!= 0)
        {
            A = num % 10;
            reversed = reversed* 10 + A;
            num = num / 10;
           
        }

        if(reversed == original)       
        {
            System.out.println("It's Pallindrome");
        }
        else
        {
            System.out.println("It's not Pallindrome");
        }
    }
}
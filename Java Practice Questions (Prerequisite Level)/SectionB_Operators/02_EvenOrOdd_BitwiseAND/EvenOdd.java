//2]Accept a number and check wheather it is even orr odd using Bitwise and.

import java.util.Scanner;

class EvenOdd
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        if ((num & 1) == 0) 
        {
            System.out.println(num + " is Even");
        } 
        else 
        {
            System.out.println(num + " is Odd");
        }
    }
}
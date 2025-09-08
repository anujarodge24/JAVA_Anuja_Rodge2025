//1]Use ternary operator to check whether a number is positive,negative or zero.

import java.util.Scanner;

class NumberChecking
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        System.out.println((number > 0 ) ? " Positive number " : (number < 0)? "Negative number" : "Zero");
    }
}
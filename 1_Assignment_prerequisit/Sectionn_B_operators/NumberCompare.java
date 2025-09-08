//3]Accept three numbers and find the graetest using ternary operator only.

import java.util.Scanner;

class NumberChecking
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number1: ");
        int number1 = sc.nextInt();

        System.out.print("Enter Number2: ");
        int number2 = sc.nextInt();

        System.out.print("Enter Number3: ");
        int number3 = sc.nextInt();

        System.out.println((number1 > number2 && number1 > number3) ? "number1 is greatest" : (number2 > number3)? "number2 is greatest" : "number 3 is gretest");
    }
}
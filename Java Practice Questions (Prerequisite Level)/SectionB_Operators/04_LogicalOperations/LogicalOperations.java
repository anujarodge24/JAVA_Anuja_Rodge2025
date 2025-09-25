//4] Accept two boolean and perform all logical operations(AND,OR,NOT)

import java.util.Scanner;

public class LogicalOperations 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter first boolean: ");
        boolean a = sc.nextBoolean();

        System.out.print("Enter second boolean: ");
        boolean b = sc.nextBoolean();

        System.out.println("a && b: " + (a && b));
        System.out.println("a || b : " + (a || b));
        System.out.println("!a: " + (!a));
        System.out.println("!b: " + (!b));

    }
}

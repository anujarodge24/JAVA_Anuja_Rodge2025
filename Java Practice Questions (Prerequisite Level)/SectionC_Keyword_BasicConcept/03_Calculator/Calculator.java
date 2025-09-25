import java.util.Scanner;

class Calculator
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        int num1,num2;

        System.out.print("Enter two numbers : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

    
        System.out.println("***Calculator***");
        System.out.println("1: Addition");
        System.out.println("2: Substraction");
        System.out.println("3: Multiplication");
        System.out.println("4.Division");
            
        System.out.print("Enter choice: ");
        choice = sc.nextInt();
            

        switch(choice)
        {
            case 1:
                System.out.println("Addition: " + (num1+num2));
                break;

            case 2:
                System.out.println("Substraction: " + (num1-num2));
                break;

            case 3:
                System.out.println("Multiplication: " + (num1*num2));
                break;

            case 4:
                if(num1>num2)
                    System.out.println("Division: " + (num1/num2));
                else
                    System.out.println("Division:0");
                break;

            default:
                System.out.println("Invalid Input");

        }
    }
}
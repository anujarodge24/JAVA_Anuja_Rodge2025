import java.util.Scanner;

class MathOperations
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        int a,b;

        System.out.print("Enter two numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();

        do { 
            System.out.println("***Math Operations***");
            System.out.println("1.Addition");
            System.out.println("2.Substraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            

            switch(choice)
            {
                case 1:
                    System.out.println("Addition: " + (a+b));
                    break;

                case 2:
                    System.out.println("Substraction: " + (a-b));
                    break;

                case 3:
                    System.out.println("Multiplication: " + (a*b));
                    break;

                case 4:
                    if(a>b)
                        System.out.println("Division: " + (a/b));
                    else
                        System.out.println("Division:0");

                    break;

                case 5:
                    System.out.println("Thank You!!!");
                    break;

                default:
                    System.out.println("Invalid Input");

            }
            
        } while (choice!=5);


        
    }
}
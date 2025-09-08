import java.util.Scanner;

class LeapyearOrNot
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Year:");
        int year = sc.nextInt();

        if(year % 4 == 0 && (year % 100 !=0 || year % 400 == 0))
        {
            System.out.println("It's Leap Year");
        }
        else
        {
            System.out.println("It's Not Leap Year");
        }

    }

}

import java.util.Scanner;


class Grade
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if(marks > 80 && marks <= 100)
            System.out.println("Grade A");

        else if(marks > 60 && marks <= 80)
            System.out.println("Grade B");

        else if(marks > 35 && marks <= 60)
            System.out.println("Grade C");

        else
            System.out.println("Fail");        
    }
}
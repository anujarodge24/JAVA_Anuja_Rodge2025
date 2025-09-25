import java.util.Scanner;

public class Triangle 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side1: ");
        int s1 = sc.nextInt();

        System.out.print("Enter side2: ");
        int s2= sc.nextInt();

        System.out.print("Enter side3: ");
        int s3 = sc.nextInt();

        // Check validity using triangle inequality
        if (s1 + s2 >s3 && s1+s3 > s2 && s2+ s3 > s1) 
        {
            System.out.println("Triangle is valid.");
        

            if (s1 == s2 && s2 == s3) 
            {
                System.out.println("It is an Equilateral Triangle.");
            } 
            
            else if (s1 == s2 || s2 == s3 || s1 == s3) 
            {
                System.out.println("It is an Isosceles Triangle.");
            } 
            
            else if(s1*s1 + s2*s2 ==s3*s3 || s1*s1 + s3*s3 ==s2*s2 || s3*s3 + s2*s2 ==s1*s1)
            {
                System.out.println("It is a Right Angled Triangle");
            }

            else
                System.out.println("It is a Scalene Triangle");
        }
        else    
            System.out.println("Triangle is not valid");
    }
}

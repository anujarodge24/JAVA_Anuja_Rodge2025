//Accept a number and check whether it is an Armstrong number.
import java.util.Scanner;
class Armstrong
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int digit = 0;
        int armNumber=0;
        int number = num;         //user number value assign to another number

        while(num!=0)
        {
            digit = num % 10;
            armNumber = (digit*digit*digit) + armNumber;
            num = num/10;
        }

        if(armNumber == number)
        {
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
        
    }
}


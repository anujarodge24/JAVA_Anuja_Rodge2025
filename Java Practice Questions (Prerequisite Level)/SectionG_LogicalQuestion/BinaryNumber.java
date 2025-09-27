//Accept a number and convert it to binary (without inbuilt functions).

import java.util.Scanner;

class BinaryNumber
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int remainder=0;
        int number=0;
        int Binary1 =0;
        int Binary2 =0;
        while(num!=0)
        {
            remainder=num%2;
            Binary1 = (Binary1*10) +remainder;
            num = num/2;
        }

        while(Binary1!=0)
        {
            remainder = number%10;
            Binary2 = (Binary2*10) + remainder;
            Binary1 = Binary1/10;
        }
        

        System.out.println("Binary Value: " + Binary2);
        
    }
}
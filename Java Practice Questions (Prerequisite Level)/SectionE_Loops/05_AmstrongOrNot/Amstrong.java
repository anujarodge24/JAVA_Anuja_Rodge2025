
import java.util.Scanner;


class Amstrong
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        
        int digit = 0;
        int sum = 0;
        int d_num = num;         //num value store in duplicate num(d_num)

        while(num!=0)
        {
            digit = num%10;
            sum = sum + (num*num*num);     //cube of digits which present in given num
            num = num/10;
        }
        if(d_num ==sum)
        {
            System.out.println("It's Amstrong Number");
        }
        else 
        {
            System.out.println("It's not Amstrong Number");
        }


    }
}
//Count the number of even and odd elements in an array.
import java.util.Scanner;

class EvenOdd
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        int EvenCnt=0;
        int OddCnt = 0;

        System.out.print("Enter Array Elements:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
                EvenCnt++;

            else 
                OddCnt++;
        }
        System.out.println("Even Number Count: " + EvenCnt);
        System.out.println("Odd Number Count: " + OddCnt);
    }
}

        
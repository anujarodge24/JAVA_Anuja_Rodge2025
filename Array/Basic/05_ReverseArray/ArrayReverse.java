//Accept array and print in reverse order.
import java.util.Scanner;

class ArrayReverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        //Enter Array Elements
        System.out.print("Enter Array Elements:");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        //Reverse Array
        System.out.println("Reverse Array:");

        for (int i = n - 1; i >= 0; i--) 
        {
            System.out.print(arr[i] + " ");
        }
    }
}
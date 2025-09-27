//Accept n integers into an array and display all elements.
import java.util.Scanner;

class ArrayPrinting
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        System.out.println("Enter Array Elements:");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Array Printing: ");
        for(int i=0;i<n;i++)
        {
            System.out.print( arr[i] + " ");
        }
    }
}

        
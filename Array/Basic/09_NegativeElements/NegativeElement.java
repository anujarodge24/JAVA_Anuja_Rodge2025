//Print all negative elements in an array.

import java.util.Scanner;

class NegativeElement
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        //Enter Array Elements
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Printing Array Negative Elements: ");
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
                System.out.print( arr[i] + " ");
        }
    }
}

        
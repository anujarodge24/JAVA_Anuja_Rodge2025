//4.Find the maximum and minimum element in the array.

import java.util.Scanner;

class ArrayMaxMin
{
    static public void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.print("Enter Array Elements:");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)max = arr[i];  
            if(arr[i]<min)min =arr[i];    
        }

        System.out.print("Maximun: "+ max);
        System.out.println();
        System.out.print("Minimum:" + min);

    }
}
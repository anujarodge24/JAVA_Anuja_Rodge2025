import java.util.Scanner;

class ArraySort
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.print("Enter Array Elements:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j =i+1; j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        System.out.print("Sorted Array: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" " + arr[i]);
        }
    }
        
}

        
import java.util.Scanner;

class ArrayElementFrequency
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.print("Enter Array Elements:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int count=1;
        for(int i=0;i<arr.length;i++)
        {
            for(int j =i+1; j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            System.out.println(arr[i] + "Occurs" + count);
        }

        


    }
}
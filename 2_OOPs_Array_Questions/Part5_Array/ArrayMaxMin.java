class ArrayElementSum
{
    static public void main(String[] args)
    {
        int[] arr = {23,89,15,67,42};

        int max = arr[0], min = arr[0];

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
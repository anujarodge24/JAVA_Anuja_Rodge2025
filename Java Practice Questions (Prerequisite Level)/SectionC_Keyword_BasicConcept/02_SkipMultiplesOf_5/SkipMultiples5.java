//Use break and continue in a loop to skip printing multiples of 5.
class SkipMultiples5 
{
    public static void main(String[] args) 
    {
        for (int i=1; i <=40; i++) 
        {
            if (i ==20)
            {
                break; 
            } 
            
            if (i % 5 == 0)
            {
                continue;  
            } 

            System.out.print(i + " "); 
        }
    }
}

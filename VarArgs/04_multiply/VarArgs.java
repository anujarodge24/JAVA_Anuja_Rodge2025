/*
Write a program with method multiply(String msg, int... nums) that 
prints a custom message and the product of numbers passed.
*/

class VarArgs
{
    static void multiply(String msg,int...nums)
    {
        int mul =1 ;
        for(int n:nums)
        {
            mul=mul*n;
        }

        System.out.println(msg + "multiplication is " + mul);
    }

    public static void main(String[] args) {
        
        multiply("one number",10);
        multiply("Two number",10,2);
        multiply("Three number",10,2,30);

    }

}
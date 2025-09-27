/* Write a program using varargs to create a method displayNumbers(int... nums) that prints the numbers passed to it. Call it with:
		- One number
		- Three numbers
		- No numbers
*/

class VarArgs
{
    static void  displayNumbers(int...num)
    {
        System.out.print("Number of Args: " + num.length + "  " + "Content: ");
        
        for(int x:num)
            System.out.print(x + " ");
            System.out.println();
    }

    public static void main(String[] args) 
    {
        displayNumbers(10);     //single argument
        displayNumbers(1,2,3); //multiple argument
        displayNumbers();   //no argument
        
    }
}
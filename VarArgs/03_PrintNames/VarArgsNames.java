/*- Create a method printNames(String... names) that prints all names passed. Call it with:
		- Two names
		- Five names
		- No names
*/

class VarargsNames 
{
    static void printNames(String... names) 
    {
        
        for (String name : names) 
        {
            System.out.print(" " + name);
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        printNames("Anuja", "Rutuja");
        printNames("Ram", "Sneha", "Shyam", "Priya", "Sita");
        printNames();
    }
}

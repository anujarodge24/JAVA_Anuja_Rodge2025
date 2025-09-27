/*Design a class Rectangle with length and breadth. Create methods to calculate area and perimeter. 
Then, accept 3 rectangles and display the one with the largest area.*/

class Rectangle
{
    float length;
    float breadth;
    float area;
    float Perimeter;

    Rectangle(float length ,float breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    void CalculateArea()
    {
        area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    void CalculatePerimeter()
    {
        Perimeter = 2 * length *breadth ;
        System.out.println("Perimeter of Rectangle: " + Perimeter); 
    }

    void CompareArea(Rectangle r1 , Rectangle r2)
    {
        if(area > r1.area && area > r2.area)
		{
			System.out.println("R3 Rectangle has a highest area.");
		}
		else if (r1.area > r2.area)
		{
		    System.out.println("R1 Rectangle has a highest area.");
	    }
		else
	    {
			System.out.println ("R2 Rectangle has a highest area. ");
		}

    }
}

public class RectangleMain
{
    public static void main(String[] args) 
    {
        Rectangle R1 = new Rectangle(3.14f,5.4f);
        Rectangle R2 = new Rectangle(2.5f,4.5f);
        Rectangle R3 = new Rectangle(1.4f,5.4f);
        
        System.out.println("***Area and Perimeter of Rectangle R1***");
        R1.CalculateArea();
        R1.CalculatePerimeter();
        System.out.println();
        
        System.out.println("***Area and Perimeter of Rectangle R2***");
        R2.CalculateArea();
        R2.CalculatePerimeter();
        System.out.println();
        
        System.out.println("***Area and Perimeter of Rectangle R3***");
        R3.CalculateArea();
        R3.CalculatePerimeter();
        System.out.println();

        System.out.println("***Display Highest Area Rectangle***");
        R3.CompareArea(R1, R2);

    }
}
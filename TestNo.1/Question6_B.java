class Rectangle
{
    float length;
    float width;
    float area;
    float Perimeter;
	
	Rectangle()
	{
		this.length = 0;
		this.width = 0;
	}

    Rectangle(float length ,float width)
    {
        this.length = length;
        this.width = width;
    }

    float CalculateArea()
    {
        area = length * width;
    }

    float CalculatePerimeter()
    {
        Perimeter = 2 * length * width;
 
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
        
        System.out.println("***Area and Perimeter of Rectangle R1***");
        float area1 = R1.CalculateArea();
		System.out.println("Area of Rectangle: " + area1);
        
		float Perimeter1 = R1.CalculatePerimeter();
		System.out.println("Perimeter of Rectangle: " + Perimeter1);
 
        
        

    }
}
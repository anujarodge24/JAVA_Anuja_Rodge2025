class Circle
{
    //final variable(constant)
    final double PI=3.14159;

    //Normal variables/class member variable
    double radius;

    Circle(double r)
    {
        radius = r;
    }

    //method to calculate area of circle
    void calculateArea()
    {
        double area = PI * radius * radius;
        System.out.println("Area of Circle: " + area);

        //Trying to change final value of variable
        //PI=3.14;      //This will cause a compilation error
    }
}

public class CircleFinalDemo1
{
    public static void main(String[] args) 
    {
        Circle c = new Circle(6.0);
        c.calculateArea();
        
    }
}
class Box
{
    double width;
    double height;
    double depth;

    //copy constructor
    Box(Box ob)
    {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //constructor when all dimensions are specified

    Box(double width,double height,double depth)
    {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    //constructor for uninitialised box

    Box() 
    {
        width = height = depth = -1;

    }

    //constructor for cube
    Box(double length)
    {
        width = height = depth = length;

    }

    //compute volume

    double volume()
    {
        return width*height*depth;
    }

    
}

class BoxWeight extends Box 
{
    double weight;

    //constructor
    BoxWeight(double w,double h,double d,double m)
    {
        super(w,h,d);   //super keyword used for calling superclass constructor
        weight = m;

    }

}

class ColorBox extends Box 
{
    int color;

    //constructor
    ColorBox(double w,double h,double d,int c)
    {
        super(w,h,d);   //super keyword used for calling superclass constructor
        color = c;

    }

}

public  class DemoBoxInheritance3
{
    public static void main(String[] args)
    {
        BoxWeight mybox1 = new BoxWeight(10,20,15,34.56);
        BoxWeight mybox2 = new BoxWeight(1,2,5,0.066);

        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1: " + vol);
        System.out.println("weight of mybox1: "+ mybox1.weight);

        vol = mybox2.volume();
        System.out.println("Volume of mybox1: " + vol);
        System.out.println("weight of mybox1: "+ mybox2.weight);

        System.out.println();

        ColorBox mycolorbox = new ColorBox(3,4,5,255);
        vol = mycolorbox.volume();
        System.out.println("Volume of mycolorbox: " + vol);
        System.out.println("color of mycolorbox: " + mycolorbox.color);
    }
}
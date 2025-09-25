class Demo
{
    static int cnt =0;
    int num=0;

    Demo()
    {
        cnt++;           //Static variable
        num++;       //non static variable
    }

    void display()
    {
        System.out.println("Static variable value: " + cnt);     //static value is equal to the number of objects
        System.out.println("Non-static variable value: " + num);  //non static value remain constant
    }
}

public class DemoMain
{ 
    public static void main(String[] args) 
    {
        Demo d1 = new Demo();
        d1.display();
        
        Demo d2 = new Demo();
        d2.display();
        
        Demo d3 = new Demo();
        d3.display();
        
    }

}
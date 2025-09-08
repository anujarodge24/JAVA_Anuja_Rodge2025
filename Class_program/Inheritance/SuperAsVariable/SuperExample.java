class Company
{
    String name = "Infosys";        //parent class variable
}

class Department extends Company 
{
    String name ="IT dept";         //child class variable

    void showNames()
    {
        System.out.println("Company name: " + super.name);      //printing parent class variable using super.varname
        System.out.println("Department name: " + name);
    }
}

public class SuperExample
{
    public static void main(String[] args) {
        
        Department d = new Department();
        d.showNames();
    }
}
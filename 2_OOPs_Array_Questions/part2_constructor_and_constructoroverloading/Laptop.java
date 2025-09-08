/*Create a class Laptop with company name, model, and price. Overload constructors to initialize:
Only company name
Company name + model
Company name + model + price*/

class Laptop
{
    String CompanyName;
    String model;
    float price;
    
    //1.Default Constructor
    Laptop()
    {
        CompanyName = "NULL";
        model = "NULL";
        price = 0.0f;
    }

    //2.Constructor with only company name

    Laptop(String CompanyName)
    {
        this.CompanyName = CompanyName;
    }

    //3.constructor with company name and model

    Laptop(String CompanyName,String model)
    {
        this.CompanyName = CompanyName;
        this.model = model;
    }

    //4.Constructor with companyname,model and price

    Laptop(String CompanyName,String model,float price)
    {
        this.CompanyName = CompanyName;
        this.model = model;
        this.price = price;
    }

    void display()
    {
        System.out.println("Company Name: " + CompanyName);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) 
    {
        Laptop L1 = new Laptop();
        Laptop L2 = new Laptop("Lenovo");
        Laptop L3 = new Laptop("Asus","Asus vivo book14");
        Laptop L4 = new Laptop("Samsung","Galaxy Book5",50000);

        L1.display();
        L2.display();
        L3.display();
        L4.display();
    }
}

//parent class
class Employee
{
    private String company;
    private String name;
    private double salary;

    Employee(String company,String name,double salary) 
    {
        this.company = company;
        this.name = name;
        this.salary = salary;

        System.out.println("Employee constructor called");
    }

    //Getter for companyname
    public String getCompany()
    {
        return company;
    }

    //Getter for name
    public String getName()
    {
        return name;
    }

    //Getter for salary
    public double getSalary()
    {
        return salary;
    }
    
    void showDetails()
    {
        System.out.println("Name: " + name + ",Salary: " +salary);
    }
}

//child class
class Manager extends Employee 
{
    private String company;    //child variable(Separate from parent company)
    private double bonus;

    //child constructor
    Manager(String parentCompany,String childCompany,String name,double salary,double bonus)
    {
        super(parentCompany,name,salary);
        this.company = childCompany;
        this.bonus = bonus;

        System.out.println("Manager constructor callaed");
    }

    //override parent method
    @Override
    public double getSalary()
    {
        return super.getSalary() + bonus;
    }

    void showCompanyNames()
    {
        //accessing parent variable using super
        System.out.println("Parent company: "+ super.getCompany());
        System.out.println("Child company: " + this.company);
    }

    @Override
    void showDetails()
    {
        super.showDetails();
        System.out.println("Bonus: "+ bonus);
        System.out.println("Total salary(With bonus): " +getSalary());
    }
}

public class CompanySuperExample
{
    public static void main(String[] args) 
    {
        Manager m = new Manager("Infosys","TCS","Ram",60000,15000);

        System.out.println("\n---showing details---");
        m.showDetails();

        System.out.println("\n---showing company names---");
        m.showCompanyNames();
    }
}

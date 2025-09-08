class Company
{
    String companyName;

    Company(String companyName)
    {
        this.companyName = companyName;
    }

    class Employee
    {
        String empName;
        int salary;

        Employee(String empName,int salary)
        {
            this.empName = empName;
            this.salary = salary;
        }

        void showDetails()
        {
            System.out.println("Employee Name: " + empName);
            System.out.println("Employee Salary: " + salary);
            System.out.println("Company Name : " + companyName);
        }
    }
}

public class CompanyDemo
{
    public static void main(String[] args) 
    {
        
        Company c1 = new Company("Google");
        Company c2 = new Company("Microsoft");

        
        Company.Employee emp1 = c1.new Employee("Anuja",300000);
        Company.Employee emp2 = c2.new Employee("Rutuja",400000);

        emp1.showDetails();
        emp2.showDetails();
    

    }
}

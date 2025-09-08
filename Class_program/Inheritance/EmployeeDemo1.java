//Single level inheritance

class Employee
{
    String name;
    double salary;

    void work()
    {
        System.out.println(name + "is working ");

    }

    double getSalary()
    {
        return salary;
    }
}

class Manager extends Employee
{
    //inherited name,salary,work and getsalary

    void approveBudget()
    {
        System.out.println(name + "Approve Budget");
    }

}

public class EmployeeDemo1
{
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Anuja Rodge";
        m.salary = 400000;

        m.work();

        System.out.println(m.getSalary());
        m.approveBudget();
    }
}
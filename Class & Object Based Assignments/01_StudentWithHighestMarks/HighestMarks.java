/*1.	Create a class Student with rollNo, name, and marks. Accept details of 3 students and
 print details of the student with the highest marks.*/

class Student 
{
    int rollNo;
    String name;
    float marks;

    Student(int rollNo, String name, float marks) 
	{
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    
    void display() 
	{
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
	void CompareMarks(Student stud1,Student stud2)
	{
		if(marks>stud1.marks && marks > stud2.marks)
		{
			System.out.println(name + " " + rollNo + " has a highest marks ");
		}
		else if (stud1.marks > stud2.marks)
		{
		    System.out.println(stud1.name +" " + stud1.rollNo + " has a highest marks ");
	    }
		else
	    {
			System.out.println (stud2.name + " " + stud2.rollNo + " has a highest marks ");
		}
	}
}

public class HighestMarks
{

    public static void main(String[] args) 
	{
    
        Student s1 = new Student(10, "Anuja", 80.5f);
        Student s2 = new Student(12, "Vaishali", 99.0f);
        Student s3 = new Student(13, "Kaveri", 98.0f);
		
		s1.display();
		s2.display();
		s3.display();
		
        s3.CompareMarks(s1,s2);
    }
}

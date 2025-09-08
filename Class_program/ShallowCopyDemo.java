/*Create a student class with name,int[]marks(3 subjects)
Implement a shallow copy constructor and show that changinng the marks in original obj also 
changes them in copied object.*/

class Student
{
	String name;
	int[] marks;  //array of marks of 3 subjects
	
	//Parameterised constructor
	Student(String name,int[] marks)
	{
		this.name = name;
		this.marks = marks;    //assigning reference
	}
	
	//Shallow copy constructor
	Student(Student s)
	{
		this.name = s.name;
		this.marks = s.marks;   //shallow copy:same array reference
	}
	
	void display()
	{
		System.out.println("Name: " + name +"Marks: ");
		for(int mark:marks)
		{
			System.out.print(mark +" ");
		}
		System.out.println();
	}
}

public class ShallowCopyDemo
{
	public static void main(String[] args)
	{
		int[] originalMarks = {85,90,95};
		
		Student s1 = new Student("Anuja",originalMarks);
		
		//create a shallow copy
		Student s2 = new Student(s1);
		System.out.println("Before changing marks:");
		s1.display();
		s2.display();
		
		//change one subject marks in original
		s1.marks[0] = 100;
		System.out.println("\nAfter changing marks in s1:");
		s1.display();
		s2.display();
	}
}
	
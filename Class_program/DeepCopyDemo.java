/*Create a student class with name,int[]marks(3 subjects)
Implement a Deep copy constructor and show that changinng the marks in original obj but not 
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
	
	//Deep copy constructor
	Student(Student s)
	{
		this.name = s.name;   //string is immutable safe to copy
		this.marks = new int[s.marks.length]; //create new array

		//copy each element manually
		for(int i=0;i<s.marks.length;i++)
		{
			this.marks[i] = s.marks[i];

		}	
		
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

public class DeepCopyDemo
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
	
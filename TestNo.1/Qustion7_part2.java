class Student
{
	static class Marks
	{
		String subject;
		int score;
		
		Marks(String subject,int score)
		{
			this.subject = subject;
			this.score = score;
		}
		
		
		void display()
		{
			System.out.println("Subject Name: " + subject);
			System.out.println("Score:" + score);
		}
	}
}

public class StudentMain
{
	public static void main(String[] args)
	{
		Student.Marks s1 = new Student.Marks("Science",98);
		Student.Marks s2 = new Student.Marks("Math",80);
		Student.Marks s3 = new Student.Marks("History",78);
		Student.Marks s4 = new Student.Marks("Physics",68);
		
		s1.display();
		s2.display();
		s3.display();
		s4.display();
	}
}
		
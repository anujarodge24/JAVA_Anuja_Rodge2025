class Course
{
    private
	private String CourseName;
	private tring Instructor;
	int Duration;
	String LastEnrolledStudent;
	
	private static int TotalEnrollments=0;
	
	//Constructor1:only course name
	
	public Course(String CourseName)
	{
		this.CourseName = CourseName;
		this.Instructor = "To be decided";
		this.Duration = 1;
	}
	
	//Constructor2:CourseName and Instructor
	
	public Course(String CourseName,String Instructor)
	{
		this.CourseName = CourseName;
		this.Instructor = Instructor;
		this.Duration = 1;
	}
	
	//Constructor3:CourseName ,Instructor and Duration
	
	public Course(String CourseName,String Instructor,int Duration)
	{
		this.CourseName = CourseName;
		this.Instructor = Instructor;
		SetDuration(Duration);
	}
	
	//Constructor4:Duration,Instructor and CourseName 
	
	public Course(int Duration,String CourseName,String Instructor)
	{
		this.CourseName = CourseName;
		this.Instructor = Instructor;
		SetDuration(Duration);
	}
	
	//valid and set duration
	
	private void SetDuration(int Duration)
	{
		if(Duration > 0)
		{
			this.Duration = Duration;
		}
		
		else
		{
			System.out.println("Invalid duration provided set default to 1");
		}
	}
	
	//Method overloading :Enroll Student with just name
	
	public void EnrollStudent(String StudentName)
	{
		System.out.println(StudentName + "Enroll in" + CourseName);
		LastEnrolledStudent = StudentName;
		TotalEnrollments++;
	}
	
	//Method overloading :Enroll Student with name and age
	
	public void EnrollStudent(String StudentName,int age)
	{
		System.out.println(StudentName + "Age : " + age +" "+ "Enroll in" + CourseName);
		LastEnrolledStudent = StudentName;
		TotalEnrollments++;
	}
	
	//Method overloading :Enroll Student with name,age and Email
	
	public void EnrollStudent(String StudentName,int age,String Email)
	{
		System.out.println(StudentName + "Age : " + age +" " + "Email: " + Email +" "+ "Enroll in" + CourseName);
		LastEnrolledStudent = StudentName;
		TotalEnrollments++;
	}
	
	//Display Course Details()
	
	public void DisplayCourseDetails()
	{
		System.out.println("CourseName: " + CourseName);
	    System.out.println("Instructor: " + Instructor);
		System.out.println("Duration: " + Duration);
		
	}
}


public class OnlineCourse
{
	public static void main(String[] args)
	{
		Course c1 = new Course("Java Programing");
		Course c2 = new Course("Data Structure","Samarth");
		Course c3 = new Course("Masterclass in c","Tanuja",35);
		Course c4 = new Course(40,"SpringBoot","Rutuja");
		
		//Enroll Students
		
		c1.EnrollStudent("Anuja");
		c2.EnrollStudent("Sneha",23);
		c3.EnrollStudent("Vaishali",21,"vaishu@gmail.com");
		c4.EnrollStudent("Kaveri");
		
		//Display Course Details
		
        c1.DisplayCourseDetails();
		c2.DisplayCourseDetails();
		c3.DisplayCourseDetails();
		c4.DisplayCourseDetails();
		
		System.out.println("Total Enrollments Across All Courses:"+Course.getTotalEnrollments());
	}
}

				
	
/*Static Nested Class – Student & Marks
Create a class Student with a static nested class Marks.
    *Marks should store subject and score.
	Add a method display() to print subject and score.
In main(), create multiple Student.Marks objects and display them.*/

class Student
{
    //static nested class
    static class Marks
    {
        String subject;
        int score;

        //constructor
        Marks(String subject,int score)
        {
            this.subject = subject;
            this.score = score;

        }

        void displayMarks()
        {
        
            System.out.println("Subject: " + subject + "  Score : " + score);
        }

    }
}

public class StudentDemo
{
    public static void main(String[] args) {
        
        //create object of static inner class directly

        Student.Marks m1 = new Student.Marks("Math",80);
        Student.Marks m2 = new Student.Marks("English",70);
        Student.Marks m3 = new Student.Marks("Science",100);
        Student.Marks m4 = new Student.Marks("History",90);

        m1.displayMarks();
        m2.displayMarks();
        m3.displayMarks();
        m4.displayMarks();
    }
}

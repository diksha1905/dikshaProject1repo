package pkg_1;

public class Student 
{
	int age, roll_no;

	public void display()
	{
	 System.out.println("Welcome to all of you");
	}
	
	public static void main(String[] args) {
		Student a = new Student();
		a.display();
		a.age = 25;
		System.out.println("age of student is " + a.age);
		a.roll_no = 30;
		System.out.println("roll number of student is " + a.roll_no);
	}
}
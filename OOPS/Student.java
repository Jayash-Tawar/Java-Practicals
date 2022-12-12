package oops;

class StudentTest 
{
	int rollno;
	String name;


			
		static String college="IIT";
		//Static method to change the value of static variable
		public static void change()
		{
			college="SGBAU";
		}
		
		//Constructor to initialize the variable
		StudentTest(int r,String n)
		{
			rollno=r;
			name=n;
		}
		
		void display()
		{
			System.out.println(rollno+""+name+""+college);
		}
	
}

	 public class Student
	 {
		public static void main(String args[])
		{
			StudentTest.change();
			StudentTest s1 = new StudentTest(154,"Akshay");
			StudentTest s2 = new StudentTest(154,"Abhay");
			StudentTest s3 = new StudentTest(154,"Anshul");
		}
	 }
	 


public class Student 
{
	
	private String userName, iD, name, dob;

	private int age;
	
	public Student (String Name, String ID, String DOB, int Age)
	{
		this.name = Name;
		this.iD = ID;
		this.dob = DOB;
		this.age = Age;
	}
	
	public String getUsername()
	{		
		return this.name + Integer.toString(this.age);
	}
}

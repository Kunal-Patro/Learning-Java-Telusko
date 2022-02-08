/*
 * Encapsualtion is binding member data with member funtions.
 * A good practice is to keep the member data as private so that they cannot be accessed (are hidden) from outside.
 * We use getters and setters to manupulate or read private member data.
 * This is a safety measure as we can have our own log of when value is changed.
 */
class Student
{
	private int rollNo;
	private String name;

	public void setRollNo(int roll)
	{
		rollNo = roll;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getRollNo()
	{
		return rollNo;
	}
	public String getName()
	{
		return name;
	}
}
public class Encapsulation
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.setRollNo(70);
		s1.setName("Kunal");
		int rollno = s1.getRollNo();
		String name = s1.getName();
		System.out.println(rollno + " : " + name);
	}
}

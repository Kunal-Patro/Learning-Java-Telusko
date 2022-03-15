/*
 * Comparable Interface allows us to compare between objects of anytype on any specified criteria. eg: string length, marks etc...
 * Comparable has a funtion compareTo(Object) which can be defined by the class implementing it. 
 * If any class wants to use Collections.sort() it needs to be of comparable type i.e. it should implements comparable interface.
 * Integer class implements Comparable interface.
 */
import java.util.*;
class Stud implements Comparable<Stud>
{
	int rollno, marks;
	String name;

	public Stud(int rollno, String name, int marks)
	{
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString()
	{
		return "Stud [rollno = " + rollno + ", marks = " + marks + ", name = " + name + "]"; 
	}

	public int compareTo(Stud s)
	{
		return marks>s.marks?1:-1;
	}
}
public class ComparableDemo
{
	public static void main(String[] args)
	{
		List<Stud> stuList = new ArrayList<>();
		stuList.add(new Stud(10,"Kunal",90));
		stuList.add(new Stud(20,"Moomal",99));
		stuList.add(new Stud(22,"Hinata",80));
		stuList.add(new Stud(27,"Paridhi",89));

		Collections.sort(stuList);

		// To change the sorting rules we can use modified sort using comparator object.
		// Collections.sort(stuList, (i,j) -> i.marks>j.marks?1:-1)

		for(Stud s : stuList)
		{
			System.out.println(s);
		}
	}
}

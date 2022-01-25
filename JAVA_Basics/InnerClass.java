/*
 * A class in java can have variables, methods and class itself as members.
 * Member class is known as inner class.
 * If purpose of a class if specific to some other class only no other class then we make it inner class.
 * Inner class can be of these types:
 * 1. Member class
 * 2. Static class
 * 3. Anonymous class
 *
 * Each class is exported in different .class file explicitly
 */
class Outer
{
	int num;
	public void show()
	{
		System.out.println("Outer class method calling...");
	}
	
	class Inner // exported by nama of Outer$Inner.class
	{
		public void display()
		{
			System.out.println("Inner class method calling...");
		}
	}
}
public class InnerClass
{
	public static void main(String[] args)
	{
		Outer obj = new Outer();

		Outer.Inner obj1 = obj.new Inner(); /* While creating object of inner class we have to mention Outer.inner as type and instance of outer class.new to allocate memory in case of member
						       class and if inner class is static then "Outer.inner obj = new Outer.inner()" */	       
		obj1.display();
		obj.show();
	}
}

/*
 * Some modifiers are used to specify access of classes, member functions and member variables.
 * 1. Private: access is allowed within the class itself.
 * 2. Default: access is allowed within the package itself.
 * 3. Protected: access is allowed in package and to the sub-classes of different packages.
 * 4. Public: access is allowed everywhere.
 *
 * Pakage is a kind of folder which consist of similar types of classes.
 * There is a pakage com->kunal->AccessModifiers in the root folder named as com.kunal.AccessModifiers.
 */

import com.kunal.AccessModifiers.*;

class A // default modifier
{
	private int i;
	public void modifyI()
	{
		i = 10;
		System.out.println("I modified to " + i);
	}
}
class B extends StudentP
{
	public void show()
	{
		System.out.println(name); // name is protected property of class StudentP from differnt package
	}
}
public class AccessModifier
{
	public static void main(String[] args)
	{
		A obj = new A();
		obj.modifyI();

		B obj1 = new B();
		obj1.show();

		StudentP obj3 = new StudentP(); // public class from different package
		obj3.marks = 30; // public property form public class from different package.
		System.out.println(obj3.marks);
	}
}

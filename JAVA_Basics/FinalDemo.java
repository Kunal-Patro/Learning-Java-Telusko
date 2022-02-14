/*
 * Final keyword can be used with
 * 1. Variables - To make them constant.
 * 2. Methods - So that they cannot br overridden.
 * 3. Class - So that they cannot be extended.
 */
final class A // Cannot extend this class
{
	public void show()
	{
		System.out.println("in class A");
	}
}
class A1
{
	public final void show() // Cannot override this method
	{
		System.out.println("in class A1");
	}
}
class B extends A1
{
	final int i = 0; // Cannot modify this variable
	public void show1()
	{
		System.out.println("in class B");
	}
}
public class FinalDemo
{
	public static void main(String[] args)
	{
		B obj = new B();
		obj.show();

	}
}

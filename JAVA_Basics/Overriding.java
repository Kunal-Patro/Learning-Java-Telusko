/*
 * Overriding the Super class method in sub class is method overriding
 * In overriding youngest child's method will be called
 */
class Super
{
	public void show()
	{
		System.out.println("We are in Super class");
	}
}
class Sub extends Super
{
	@Override 	// This annotation will ensure that this method is for overriding purpose only, any mismatch in function name or signature will give compile time error. Without it, it is always runtime error.
	public void show()
	{
		System.out.println("We are in Sub class");
	}
}
public class Overriding
{
	public static void main(String[] args)
	{
		Sub obj = new Sub();
		obj.show();
	}
}

/*
 * From Java 1.8 it is allowed to define methods in interfaces using default key word.
 * We can say an interface as functional if it has only one abstract method, while many methods with default defination can exist.
 * Overriding is also possible with default defination of methods in interfaces.
 */

interface AF
{
	void abc();
	default void show()
	{
		System.out.println("in show");
	}
}
class AImpl implements AF
{
	public void abc()
	{
		System.out.println("in abc");
	}
}
public class DefaultDemo
{
	public static void main(String[] args)
	{
		AF obj = new AImpl();
		obj.abc();
		obj.show();
	}
}

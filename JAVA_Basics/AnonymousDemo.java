/*
 * Anonymous class is a class without name.
 * It is basically used for just overriding  methods of a class.
 * It is defined just after the object creation.
 */
class A
{
	public void show()
	{
		System.out.println("in A");
	}
}
public class AnonymousDemo
{
	public static void main(String[] args)
	{
		A obj = new A()
			// Anonymous class
			{
				public void show()
				{
					System.out.println("in Anonymous");
				}
			};
		obj.show();
	}
}

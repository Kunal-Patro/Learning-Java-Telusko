/*
 * Anonymous class is a class without name.
 * It is basically used for just overriding  methods of a class.
 * It is defined just after the object creation.
 * Anonymous class cannot be used other than where its decleared.
 * We can create object of interface using anonymous class.
 */
interface B
{
	void display();
}
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
		B obj1 = new B()
			{
				public void display()
				{
					System.out.println("in Interface Anonymous");
				}
			};
		obj.show();
		obj1.display();
	}
}

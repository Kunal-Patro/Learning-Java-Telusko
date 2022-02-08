/*
 * Dynamic method dispatch is changing method's behaviour at runtime.
 * Runtime polymorphism is creating sub class objects with super class refrence.
 * Runtime polymorphism is necessary for dynamic method dispatch.
 * Whenever we follow runtime polymorphism, members specified in super class can only accessed althought overriding will exist.
 */
class A
{
	public void show()
	{
		System.out.println("in A");
	}
}
class B extends A
{
	public void show()
	{
		System.out.println("in B");
	}
}
class C extends A
{
	public void show()
	{
		System.out.println("in C");
	}
	public void displayInfo()
	{
		System.out.println("C is the subclass and A is Super");
	}
}
public class DynamicMethodDispatch
{
	public static void main(String[] args)
	{
		A obj1 = new B(); //runtime polymorphism
		obj1.show();

		obj1 = new C(); 
		obj1.show(); // dynamic method dispatch
		//obj1.displayInfo();   Invalid access

	}

}

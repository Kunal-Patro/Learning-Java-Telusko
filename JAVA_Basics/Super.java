/*
 * Super method calls the parent constructor based on parameters passed to it.
 * Super method is called automatically by the sub class's constructor even if not mentioned.
 * Super method call should be first statement of the constructor, so there can only be one super method call in constructor at a time.
 * Parameters of super method call should match one of the parent's constructor.
 * Super keyword is used to refer to the parent class members.
 */
class A
{
	public A()
	{
		System.out.println("I am in A(Default)");
	}
	public A(int a)
        {
                System.out.println("I am in A(int)");
        }

}
class B extends A
{
	public B()
        {
		super();
		// super(30); This will call A's parametrized constructor
                System.out.println("I am in B(Default)");
        }
	public B(int a)
       	{
		super(a);
               	System.out.println("I am in B(int)");
        }

}
public class Super
{
	public static void main(String[] args)
	{
		B obj = new B();
	}
}

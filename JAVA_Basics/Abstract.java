/*
 * Abstract class is a class in which all the member functions are abstract (decleared not implemened).
 * Objects of abstract class cannot be decleared.
 * Abstract class is extended by sub classes and all the abstract methods of abstract super class is implemented here.
 * We use abstract class because:
 * 1. We don't want anyone to create object of abstract class.
 * 2. Instead of creating 2 separate methods we can accept all the objects of different class in one.
 */
abstract class Writer
{
	public abstract void write(Number i);
}
class Operation
{
	/*public void add(Number i, Number j) // Number is abstract class
	{
		Number c = new BigDecimal(i.toString()).add(new BigDecimal(j.toString()));
		System.out.println(c);
	}*/
	public void print(Number i)
	{
		System.out.println(i);
	}
}
class Pen extends Writer
{
	public void write(Number i)
	{
		System.out.println("This is what a Pen writes of " + i + " pinpoint");
	}
}
class Pencil extends Writer
{
	public void write(Number i)
	{
		System.out.println("This is what Pencil writes of " + i + " HB");
	}
}

public class Abstract
{
	public static void main(String[] args)
	{
		Writer cello = new Pen();
		Writer natraj = new Pencil();

		cello.write(0.5f);
		natraj.write(3);

		Operation plus = new Operation();
		plus.print(1.5f);
		plus.print(2);
		plus.print(40.66);
	}
}

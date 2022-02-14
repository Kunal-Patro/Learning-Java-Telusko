/*
 * Interfaces are special classes in java which have all the methods as abstract i.e. functions in interfaces are not defined just decleared.
 * Through interfaces we can achieve multiple inheritance in java.
 * For inheriting interfaces we use "implements" as keyword.
 * We can extends as well as implements to the same child class.
 * We can create refrence of interface but not object of interface.
 * All the methods in an interface are "public abstract" by default so no need to specify.
 * While combining any third-party app, an API is provided to us by that party and we need to work upon all the interfaces and classes in that API.
 */
interface Writer
{
	void show();
}
interface Reader
{
	void read();
}
class Pen implements Writer, Reader // Multiple inheritance with interfaces
{
	float i;
	public void show()
	{
		System.out.println("Writing with Pen");
	}
	public void read()
	{
		i = 1.1f;
		System.out.println("Pen version " + i);
	}
}
class Pencil implements Writer, Reader
{
	int i;
	public void show()
	{
		System.out.println("Writing with Pencil");
	}
	public void read()
	{
		i = 10;
		System.out.println("Pencil number " + i);
	}

}
class Worker
{
	public void DoSomething(Writer w)
	{
		w.show();
	}
	public void ReadSomething(Reader r)
	{
		r.read();
	}
}
public class InterfaceDemo
{
	public static void main(String[] args)
	{
		Worker j = new Worker();
		Writer p = new Pen();
		Writer pc = new Pencil();
		Reader pr = new Pen();
		Reader pcr = new Pencil();

		j.DoSomething(p);
		j.DoSomething(pc);
		j.ReadSomething(pr);
		j.ReadSomething(pcr);
	}
}

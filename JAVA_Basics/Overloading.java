/*
 * Overloading is having the same function or constructor name but different behaviour.
 * We can achieve funtion or constructor overloading by keeping the different signatures(number of parameters, type of parameters) for functions or constructors.
 * In the below example 'add' function and 'Calculator' constructor is overloaded.
 */
class Calculator
{
	int num1, num2;
	public void add(int i, int j)
	{
		System.out.println(i+j);
	}
	public void add(int i, int j, int k)
	{
		System.out.println(i+j+k);
	}
	public Calculator()
	{
		System.out.println("Basic Operation");
	}
	public Calculator(int num)
	{
		System.out.println("Advance Operation");
		num1 = num2 = num;
		System.out.println("Square of " + num + " is " + num1*num2);
	}
}
public class Overloading
{
	public static void main(String[] args)
	{
		Calculator casio = new Calculator();
		casio.add(20,30);
		casio.add(20,30,40);
		Calculator sony = new Calculator(3);
		sony.add(40,30);
		sony.add(40,30,50);
	}
}

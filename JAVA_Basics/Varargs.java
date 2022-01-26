/*
 * We can add variable number of arguments to a function, which can be decide during a function call 
 */
class Calculator
{
	public void add(int ... n) // n will be an array here
	{
		int sum = 0;
		for(int k : n)
		{
			sum += k;
		}
		System.out.println("Sum is " + sum);
	}
}
public class Varargs
{
	public static void main(String[] args)
	{
		Calculator casio = new Calculator();
		casio.add(1,2,3,4,5);
		casio.add(1,2);
		casio.add(1,2,3,4,5,6,7,8,9,10,11,12,13);
	}
}

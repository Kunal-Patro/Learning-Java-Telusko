/*
 * One of the piller of Object Oriented Programming paradigm is Inheritance.
 * In java we have single level inheritance and multi-level inheritance.
 * Multiple Inheritance in not allowed in Java due to ambiguity problem.
 * Child class has all the features of parent class. In java we use 'Super' keyword for parent class and 'Sub' keyword for child class.
 */
class Calculator // Super Class , Parent , Base
{
	public void add(int a, int b)
	{
		System.out.println("Addition of " + a + " and " + b + " is " + (a+b));
	}
}
class AdvCalculator extends Calculator // Sub Class , Child, Derived . Single level Inheritance
{
	public void sub(int a, int b)
        {
                System.out.println("Subtraction of " + a + " and " + b + " is " + (a-b));
        }

}
class SuperAdvCalculator extends AdvCalculator // Sub-Sub class. Multi-level inheritance
{
	public void mult(int a, int b)
        {
                System.out.println("Multiplication of " + a + " and " + b + " is " + (a*b));
        }

}

public class Inheritance
{
	public static void main(String[] args)
	{
		SuperAdvCalculator casio = new SuperAdvCalculator();
		casio.add(3,5);
		casio.sub(90,18);
		casio.mult(20,89);
	}
}

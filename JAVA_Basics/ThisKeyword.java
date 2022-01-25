/*
 * "This" keyword represents current instance's/objects's variable or method.
 */
class Calculator
{
	int num1,num2;
	public Calculator(int number)
	{
		num1 = number; // No need of this keyword as function variable and member variable have different names.
	}
	public Calculator(int num1, int num2)
	{
		this.num1 = num1; // We used this keyword here to resolve the ambiguty for names as function variable and member variable has same names.
		this.num2 = num2;
	}
}
public class ThisKeyword
{
	public static void main(String[] args)
	{
		Calculator casio = new Calculator(3);
		System.out.println("Without 'this' is num1 = " + casio.num1 + " num2 = " + casio.num2);

		Calculator citizen = new Calculator(4,6);
		System.out.println("With 'this' is num1 = " + citizen.num1 + " num2 = " + citizen.num2);
	}
}

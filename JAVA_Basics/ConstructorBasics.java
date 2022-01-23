/* Properties of Constructor
 * 1. Member function.
 * 2. Same name as classname.
 * 3. Doesn't return anything, hence no return type in signature.
 * 4. Used to allocate memory.
 * 5. Don't have to call the constructor, it's called automatically at time of object creation.
 * 6. Can have different behaviour for same class with different parameters i.e. can be Overloaded.
*/

class Calculator
{
	int num1;
	float num2;
	public Calculator()
	{
		num1 = 5;
		num2 = 30.0f;
	}
	public Calculator(int number)
	{
		num1 = number;
		num2 = number;
	}
	public Calculator(int number, float decimalNum)
	{
		num1 = number;
		num2 = decimalNum;
	}
}
public class ConstructorBasics
{
	public static void main(String[] args)
	{
		Calculator casio = new Calculator();
		System.out.println("num1 = " + casio.num1 + " num2 = " + casio.num2);

		Calculator citizen = new Calculator(7);
		System.out.println("num1 = " + citizen.num1 + " num2 = " + citizen.num2);

		Calculator sony = new Calculator(8,1.6f);
		System.out.println("num1 = " + sony.num1 + " num2 = " + sony.num2);

	}
}

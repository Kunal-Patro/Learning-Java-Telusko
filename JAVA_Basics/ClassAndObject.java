class Calculator // knows something (member variables) and does something (member functions)
{
	int num1;
	int num2;
	int result;
	public void Add()
	{
		result = num1 + num2;
	}
}
public class ClassAndObject
{
	public static void main(String[] args)
	{
		Calculator obj1 = new Calculator(); // obj1 is the refrence to newly alloted value for the class object  
		// For making an object we have to assign storage. That is done by 'new' keyword.
 		obj1.num1 = 5;
		obj1.num2 = 15;
		obj1.Add();
		System.out.println("Result is " + obj1.result);

	}

}

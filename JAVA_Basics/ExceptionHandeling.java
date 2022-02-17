/*
 * Errors stops the execution of rest of the program where it occures. So it need to be handeled to avoid the termination of program.
 * There are 2 types of errors in JAVA
 * 1. Unchecked errors : Which can't be detected by the compiler. Detected at runtime.
 * 2. Checked errors : Which are detected by compiler.
 * Unchecked errors are handeled using try and catch blocks.
 * Try block throws the exception if any towards catch, this block mainly has logic code.
 * Catch block catches the exception and execute the statements within and continues execution. 
 * Finally block is executed everytime regardless of whether there is an exception or not.
 * We can have multiple catch blocks and they are checked in the order they are coded.
 */
public class ExceptionHandeling
{
	public static void main(String[] args)
	{
		int i,j,k;
		int a[] = new int[5];	
		try
		{
			i = 10;
			j = 2;
			a[4] = 10;
			k = i/j;
			System.out.println("Answer is " + k);
		}

		// catch(ArithmeticException | ArrayIndexOutOfBoundsException e)  this can written if we want to execute same set of statements under both exceptions.

		catch(ArithmeticException e)  // Sub-class of Exception 
		{
			System.out.println("Dividing by zero isn't a good option...");
		}

		catch(ArrayIndexOutOfBoundsException e) // Sub-class of Exception
		{
			System.out.println("Be in your limits...");
		}

		catch(Exception e)
		{
			System.out.println("Something went wrong ...");
		}

		finally
		{
			System.out.println("Tata");
		}
	}
}

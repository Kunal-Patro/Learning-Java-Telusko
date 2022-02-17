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
 * Try block needs either catch block or finally block otherwise it will give error.
 * If we are using any resource and exception occures there, we apply try, finally block to release the resource if exception occures. We can instead use try block with resouce allocation only for that.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ExceptionHandeling
{
	public static void main(String[] args)
	{
		int i,j,k;
		int a[] = new int[5];
		ExceptionHandeling eh = new ExceptionHandeling();	
		try
		{
			i = 10;
			j = 2;
			a[4] = 10;
			k = i/j;
			System.out.println("Answer is " + k);
			eh.Input();
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
			System.out.println(e);
		}

		finally
		{
			System.out.println("Tata");
		}
	}
	public void Input() throws Exception
	{
		int n = 0;
		System.out.println("Enter a number ");
		BufferedReader br = null;
		try    			//try(BufferReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			br = new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(br.readLine());
			System.out.println(n);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Enter a valid number");
		}
		finally
		{
			br.close();
		
		}
	}
}

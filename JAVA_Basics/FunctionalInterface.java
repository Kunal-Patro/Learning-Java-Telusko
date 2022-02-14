/*
 * Types of interfaces:
 * 1. Normal - have more than one methods.
 * 2. Single abstract/ Functional - have only one method. Lambda Expression can be used to define.
 * 3. Marker - doesn't have any method.
 * As functional interface contains only one function so we can use anonymous class to define it without using "public and return datatype" of the function and "new with interface name" while object creation.
 */

interface A
{
	void show();
}
public class FunctionalInterface
{
	public static void main(String[] args)
	{
		A obj = ()-> {System.out.println("In Functional Interface");}; // Lambda Expression
		obj.show();
	}
}

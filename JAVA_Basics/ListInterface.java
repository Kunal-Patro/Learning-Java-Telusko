/*
 * Collection interface doesn't work with indexes, so we cannot add or delete any element from a random place(index) in collection.
 * List interface implements collection with additional functionality of working with indexes.
 * As now using List we can work with indexes so we can use loops to operate on elements of collection.
 */

import java.util.List;
import java.util.ArrayList;

public class ListInterface
{
	public static void main(String[] args)
	{
		List ls = new ArrayList();
		ls.add(2);
		ls.add(4);
		ls.add(6);
		ls.add("hi");

		for(int i = 0; i < ls.size(); i++)
		{
			System.out.println(ls.get(i));
		}

		System.out.println("Printing through foreach loop now");
		for(Object o : ls) 	//Data type for collection without generics is "Object"
		{
			System.out.println(o);
		}
	}
}

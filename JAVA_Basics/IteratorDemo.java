/*
 * As Collection doesn't work with collection, it doesn't support index numbers.
 * So to access particular element in collection there is a special interface called "Iterator" which is responsible to fetch the value from collection. An iterator iterates over a collection.
 * Iterator has ".next()" function to access next value in iterator, ".hasNext()" method to identify if there is a any next number left.
 * If we move out of bounds using .next method then it give an error "NO such element".
 */
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo
{
	public static void main(String[] args)
	{
		Collection<Integer> c = new ArrayList<>();
		c.add(3);
		c.add(2);
		c.add(5);

		Iterator i = c.iterator();

		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}

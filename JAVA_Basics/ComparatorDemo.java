/*
 * We have used sort function from the collections class in standard way, but if we want to modify of sort function as to sort on last digit basis only.
 * We can override the sort function for that.
 * .sort() method uses compare method of Integer class to sort and Integer class implements Comparator interface for compare method.
 * As it is an Interface so we directly cannot make object of it to override, we can either make object of some class which implements it or we can use annonymous class to write an overriden defination.
 * Comparator is a functional interface, so we can use lambda expression for writing logic.
 */
import java.util.*;
public class ComparatorDemo
{
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<>();
		list.add(446);
		list.add(564);
		list.add(789);
		list.add(238);
		
		// Comparator<Integer> c = (i,j) -> i%10>j%10?1:-1;
		Comparator<Integer> c = new Comparator<>()
		{
			public int compare(Integer i, Integer j)
			{
				// return i%10>j%10?1:-1;

				if(i%10>j%10)
					return 1; // swap the element
				else
					return -1; // donot swap
			}
		};
		Collections.sort(list,c); // sorts the list based on comparator rules.
	       	// we can directly put (i,j) -> i%10>j%10?1:-1 in place of c
		for(Integer i : list)
		{
			System.out.println(i);
		}	
	}
}

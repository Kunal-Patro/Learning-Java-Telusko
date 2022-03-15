/*
 * Like List, Set is also a type of collection.
 * Java has 2 classes HashSet and TreeSet that implements Set Interface.
 * Difference between Set and List is that list keeps duplicate values also whereas set returns false if we add any dublicate value.
 * In HashSet elements are stored according to hash value for that element and is retrived accordingly (no order).
 * In TreeSet elements are stored in sorted order.
 * .add() here returns boolean value accoriding to whether the current element is already there in set or not.
 */
import java.util.*;
public class SetDemo
{
	public static void main(String[] args)
	{
		Set<Integer> set = new HashSet<>();
		set.add(98);
		set.add(2);
		set.add(144);
		set.add(0);

		Set<Integer> set1 = new TreeSet<>();
		set1.add(98);
		set1.add(2);
		set1.add(144);
		set1.add(0);

		System.out.println("HashSet");
		for(Integer i : set)
		{
			System.out.println(i);
		}

		System.out.println("");
		System.out.println("TreeSet");

		for(Integer i : set1)
		{
			System.out.println(i);
		}
	}
}

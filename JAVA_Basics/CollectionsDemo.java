/*
 * Collection API provides many class, one of which is "Collections".
 * Collections provides many build-in functions to operate upon elements of list.
 * Some of the features are: sort(), reverse(), shuffle().
 */

import java.util.*;

public class CollectionsDemo
{
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(90);
		list.add(56);
		list.add(5);

		List<Integer> sortList = new ArrayList<>();  // Problem: need to add elements equal or greater than source list size otherwise it gives IndexOutOfBounds error
		for(Integer i : list)
		{
			sortList.add(0);
		}

                List<Integer> reverseList = new ArrayList<>();
		for(Integer i : list)
		{
			reverseList.add(0);
		}
                
                List<Integer> shuffleList = new ArrayList<>();
		for(Integer i : list)
		{
			shuffleList.add(0);
		}
                
		Collections.copy(sortList, list);
		Collections.copy(reverseList, list);
		Collections.copy(shuffleList, list);

		Collections.sort(sortList);
		Collections.reverse(reverseList);
		Collections.shuffle(shuffleList);

		for(Integer i : list)
		{
			System.out.print(i + " ");
		}
		System.out.println("Original List");

                for(Integer i : sortList)
                {
                        System.out.print(i + " ");
                }
		System.out.println("Sorted List");

                for(Integer i : reverseList)
                {
                        System.out.print(i + " ");
                }
		System.out.println("Reverse of List");

                for(Integer i : shuffleList)
                {
                        System.out.print(i + " ");
                }
		System.out.println("Shuffled List");


	}
}

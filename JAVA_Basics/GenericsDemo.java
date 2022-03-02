/*
 * As it is not mandatory to mention a data type of collection as elements are  considered as "Object" type by default.
 * But as JAVA is a type safe language so its good that  a collection have same type of data.
 * By giving data type to collection helps to restrict the elements of other data type different from mentioned.
 * We always use Wrapper classes as data types instead of native datatype.
 */
import java.util.*;
public class GenericsDemo
{
	public static void main(String[] args)
	{
		List<Integer> lis = new ArrayList<>(); // this is java 1.7, if using java 1.5 we need to mention datatype in ArrayList angular brackets also.
		lis.add(2);
		lis.add(4);
		lis.add(6);
		lis.add(8);

		//lis.add("hi"); will give error

		List<String> names = new ArrayList<>();
		
		//names.add(500); will give error
		
		names.add("kunal");
		names.add("moomal");
		
		System.out.println("Integer list print");
		for(Integer i : lis)
		{
			System.out.println(i);
		}
		System.out.println("String list print");
		for(String s : names)
		{
			System.out.println(s);
		}
	}
}

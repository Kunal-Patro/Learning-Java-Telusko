/*
 * Java provides a collection API which have lots of classes and interfaces in it which provide advance features.
 * By name "collection" we have 3 things in JAVA.
 * 1. API concepts (collection)
 * 2. An interface (Collection)
 * 3. A class (Collections)
 * Basically collection means storing many elements together. For this purpose we used arrays previously but arrays doesn't provides dynamic features such as expanding, putting any object in between.
 * And Collection provides these features.
 * Eg. int arr[] = new int[5];
 * 	Collection val = new ArrayList();
 * 	val.add(5);
 * 	val.add("kunal");
 * In above example we are creating an int array of 5 integers. In second line we are creating a collection in which you can add any number of objects dynamically.
 * ArrayList implements List interface with itself implements Collection.
 * Collection is Interface here which doesn't specify any type so default type is 'object' in java. So we can add any value string, int, float etc.
 * So to restrict upon types later on they added "GENERICS", we can use generics to specify types with collections.
 * Eg. Collection<Integer> val = new ArrayList<Integer>();
 *     Collection<Integer> val = new ArrayList<>(); in newer versions no need to mention type in RHS.
 * Collection doesn't work on indexes. So we have to use List instead of Collection to work with indexes.
 * Similar to list we have Set interface which is implemented by HashSet and TreeSet. Difference in Set and List is that, Set doesn't accepts duplicate values where as List does.
 * Difference in HashSet and TreeSet is treeset is ordered always gives elements in sorted order where as hashset doesn't give
 * In List the order in which we get the elements is fixed whereas in Set is random.
 * We also have Map interface. Map has key value relationship. We have HashMap and HashTable implementing Map interface.
 * Difference in HashMap and HashTable is one is synchronized and other is not. (Thread safe/unsafe implementation)
 * Eg. Map<key,value>.
 * 	Map<Integer,String> m = new HashMap(); 
 */
public class CollectionGenerics
{
	public static void main(String[] args)
	{
		System.out.println("This is just a theory program, to see the theory open source code and see the comments");
		System.out.println("Have a good day, BYE");
	}
}

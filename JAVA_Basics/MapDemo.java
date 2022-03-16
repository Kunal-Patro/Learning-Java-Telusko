/*
 * Map is type of collection that instead of using index numbers uses key value pairs.
 * Map interfaces is implemented by HashMap and HashTable class of Java.
 * HashTable is synchronized i.e. thread safe but HashMap is not.
 * Most of the time we use HashMap.
 * .keySet() will give all the keys as set.
 * As keys are set so if repeat same key with different value pair it will replace the previous value on that key.
 */
import java.util.*;
public class MapDemo
{
	public static void main(String[] args)
	{
		Map<String, String> data = new HashMap<>();
		data.put("name", "Moomal");
		data.put("age", "20");
		data.put("education", "MSC");

		System.out.println("Name is " + data.get("name"));
		System.out.println("Hobbie is " + data.get("hobbie")); // returns null

		Set<String> keys = data.keySet();
		for(String key : keys)
		{
			System.out.println(key + " " + data.get(key));
		}
	}
}

/*
 * Thread is a unit of process. A sub-process of a process.
 * When we run java application its a thread, "main" is one thread.
 * As we have multiple cores in CPU nowadays and when we run a java application one core is occupied. To improve the computing we can use all the cores to run piece of job in parallel, this can be achieved through multithreading.
 * Multithreading is distributing the current job into many independent parts so that they can run in parallel.
 * We can create thread in JAVA using:
 * 1. Thread class
 * 2. Runnable Interface
 * Each thread has run method which contains the main functioning of thread.
 * Thread class is concrete class so multiple inheritance is not possible with it.
 * Through Runnable interface we can have multiple inheritance.
 * We execute a thread using .start() method. Start method searches for run function in thread and execute it.
 * Runnable is a functional interface which have only run method.
 * We need to create threads and pass runnable object to the constructor.
 */

class Dialogue extends Thread
{
	private String text;
	public Dialogue(String s)
	{
		text = s;
	}
	public void run()
	{
		for(int i = 0; i<2 ; i++) // dialogue should be printed twice
		{
			System.out.println(text);
			try{Thread.sleep(1000);} catch(Exception e){} // this will create the delay of 1sec or 1000 ms.
		}
	}
}
class Counting implements Runnable
{
	private int[] arr = new int[5];
	public Counting(int[] a)
	{
		arr = a;
	}
	public void run()
	{
		for(int k: arr)
		{
			System.out.println(k);
			try{Thread.sleep(1000);} catch(Exception e){}
		}
	}
	 
}
public class Multithreading
{
	public static void main(String[] args)
	{
		Thread dia1 = new Dialogue("Hi I am Pathfinder, Maven's brother");
		Thread dia2 = new Dialogue("I have come to say your day");
		dia1.start();
		try{Thread.sleep(500);} catch(Exception e){} // second thread should be started after 0.5 sec.
		dia2.start();
		try{Thread.sleep(3000);} catch(Exception e){}

		int[] odds = {1,3,5,7,9};
		int[] even = {0,2,4,6,8};

		Runnable obj1 = new Counting(even);
		Runnable obj2 = new Counting(odds);

		Thread t1 = new Thread(obj1); //Thread constructor with Runnable objects as arguments
		Thread t2 = new Thread(obj2);

		t1.start();
		try{Thread.sleep(500);} catch(Exception e){}
		t2.start();
	}
}

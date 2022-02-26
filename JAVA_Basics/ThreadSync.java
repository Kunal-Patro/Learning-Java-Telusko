/*
 * Thread works in parallel so they need to work in synchronization if working upon same data.
 * There is no such mechanism that can be impemented on thread to make them work in synchronization but java provides "synchronized" keyword to pe applied on the section or function which is commonly accessed between thread. 
 * Such section is also known as critical section.
 * "synchronized" keyword allows only one thread to access upon itself at a time.
 */
class Counter
{
	int count;
	public synchronized void increment()
	{
		count++;
	}
}
public class ThreadSync
{
	public static void main(String[] args) throws Exception
	{
		Counter c = new Counter();
		Thread t1 = new Thread(()->{
			for(int i = 0; i < 1000; i++)
			{
				c.increment();
			}
		});
		Thread t2 = new Thread(()->{
			for(int i = 0; i < 1000; i++)
			{
				c.increment();
			}
		});

		t1.start();
		t2.start();
		
		t1.join();
		t2.join();

		System.out.println("Count value is " + c.count); // if synchronized would not be there than this would give any result 1000 - 2000
	}
}

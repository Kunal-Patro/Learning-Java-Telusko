/*
 * Each thread has its own name.
 * We can get the name of a thread using .getName() method.
 * We can set names for any thread using .setName() method or while creating using new Thread(Runnable object , Name) constructor.
 * Each thread has some priority.
 * We can get priority of particular thread using .getPriority() method.
 * We can set priority of particular thread using .setPriority() method.
 * Java has priorities ranging from 1-10, 1 being least and 10 as highest.
 * We can use some constants such as Thread.MIN_PRIORITY resulting in 1, Thread.MAX_PRIORITY resulting in 10, Thread.NORM_PRIORITY resulting in 5.
 * We can refer to thread itself from inside it using Thread.currentThread() method.
 */
public class ThreadPriority
{
	public static void main(String[] args) throws Exception
	{
		Thread t1 = new Thread(()->{
			for(int i = 0; i<5; i++)
			{
				System.out.print("Awesome ");
				try{Thread.sleep(1000);} catch(Exception e){}
			}
		},"Awesome Thread");
		Thread t2 = new Thread(()->{
			for(int i = 0; i<5; i++)
			{
				System.out.println("Blossom");
				try{Thread.sleep(1000);} catch(Exception e){}
			}
		},"Blossom Thread");

		//t1.setName("");
		//t2.setName("");

		System.out.println(t1.getName() + " starting");
		System.out.println(t2.getName() + " starting");

		t1.start();
		try{Thread.sleep(500);} catch(Exception e){}
		t2.start();

	}
}

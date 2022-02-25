/*
 * Join method of thread class can be used to hold the execution of main thread until that particular caller thread have completed execution.
 * 		main()
 * 		  |
 * 	 t1()<----|---->t2()
 * 	  |		  |
 * 	  |		  |
 * 	  |		  |
 * 	  |------>|<------|
 * 	  t1.join |t2.join
 * 	  	  |
 * 	  	  V
 * Thread.join may throws exception so we need to add throws exception to funtion calling it.
 * isAlive() funtion returns true and false based on status of thread i.e. if that thread is still executing or not. 
 */
public class JoinAliveDemo
{
	public static void main(String[] args) throws Exception
	{
		Thread t1 = new Thread(()->{
			for(int i = 0; i<5; i++)
			{
				System.out.println("Hi");
				try{Thread.sleep(1000);} catch(Exception e){}
			}
		});
		Thread t2 = new Thread(()->{
			for(int i = 0; i<5; i++)
			{
				System.out.println("Hello");
				try{Thread.sleep(1000);} catch(Exception e){}
			}
		});

		t1.start();
		try{Thread.sleep(500);} catch(Exception e){}
		t2.start();

		t1.join();
		t2.join();
		if(!t1.isAlive() && !t2.isAlive())
			System.out.println("End of threads");
		System.out.println("Bye");
	}
}

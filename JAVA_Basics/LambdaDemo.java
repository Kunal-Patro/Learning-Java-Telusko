/*
 * When we creates threads using runnable interface, hence it is a functional interface so we can use lambda expression to reduce line of code.
 * It is always recommended to reduce lines of code and make less classes, so classes which are used only once can be turned to anomymous classes.
 */

public class LambdaDemo
{
	public static void main(String[] args)
	{
		Thread t1 = new Thread(()->{
				for(int i = 0; i<5; i++)
				{
					System.out.println("Hi");
					try{Thread.sleep(1000);} catch(Exception e){}
				}
		}
		);
		Thread t2 = new Thread(()->{
				for(int i = 0; i<5; i++)
				{
					System.out.println("Hello");
					try{Thread.sleep(1000);} catch(Exception e){}
				}
			}
		);

		t1.start();
		try{Thread.sleep(500);} catch(Exception e){}
		t2.start();
	}
}

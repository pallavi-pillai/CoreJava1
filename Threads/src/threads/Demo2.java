package threads;

public class Demo2 extends Thread {
	@Override
	public void run()
	{
		for(int i=0;i<3;i++) 
		{
		try
		{
	 	Thread.sleep(100);
		}
		catch(InterruptedException e)
		{
		}
		
		System.out.println("Hi");
	}
	
}
}

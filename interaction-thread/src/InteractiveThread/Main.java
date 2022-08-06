package InteractiveThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
		customer c=new customer();
		Runnable t=()->
		{
			try {
				c.withdrawal(1500);
			} catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		};
		Runnable t1=()->
		{
			c.deposit(1000);
		};
		Thread thread=new Thread(t);
		Thread thread1=new Thread(t1);
		thread.start();
		thread1.start();
		thread.join();
		thread1.join();
		System.out.println(c.amount);
	}
}

package threads;

public class Main{

	public static void main(String[] args) throws InterruptedException {
		Thread thread=new Demo(); //upcasting
		Thread thread1=new Demo2();
		thread.start();//runnable
		thread1.start();
		//thread.join();
		//thread1.join();
		System.out.println("Hello World");

	}

}



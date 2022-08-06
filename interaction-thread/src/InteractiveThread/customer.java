package InteractiveThread;

public class customer {
	public int amount=1000; //IV
	public synchronized void deposit(int amount)
	{
		this.amount+=amount;
		System.out.println("Deposit completed");
		notify();
	}
	public synchronized void withdrawal(int amount) throws InterruptedException
	{
		if(this.amount<amount)
		{
			System.out.println("Insufficient Balance");
			wait();
		}
		this.amount-=amount;
		System.out.println("Withdraw completed");
	}
}

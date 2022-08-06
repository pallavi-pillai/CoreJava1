package threads;

public class Demo extends Thread{
	//running stage
		 @Override
			public void run()
			{	
			 for(int i=0;i<3;i++) {
			 	try
			 	{
			 		Thread.sleep(100);
			 	}
			 	catch(InterruptedException e)
			 	{	
			 	}
				System.out.println("Hello");
			}
			
		}
}



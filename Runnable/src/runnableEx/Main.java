package runnableEx;

public class Main {
   public static void main(String a[]) {
	   C2tc c=new C2tc();
	   //using lambda expression
	   
	   //no use of student class,directly implementing assignment
	   Runnable t=()->
	   {
		   c.assignment();
	   };
	   new Thread(t).start();
	
}
}

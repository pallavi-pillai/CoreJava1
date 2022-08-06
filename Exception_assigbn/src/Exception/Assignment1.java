package Exception;

import java.util.Scanner;

public class Assignment1 {
	@SuppressWarnings("resource")
	public static void main(String a[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int p=sc.nextInt();
	
	
	try
	{
		validate(n,p);
		int pow=1;
		for (int i = 1; i <= p; i++)
		{
         pow *= n;
		}
		System.out.println(pow);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
private static void validate(int n,int p) throws Exception{
	if(n<0 || p<0)
	{
		throw new java.lang.Exception("n or p should not be negative");
	}
	else if(n==0 || p==0)
	{
		throw new java.lang.Exception("n and p should not be zero");
	}
}
}


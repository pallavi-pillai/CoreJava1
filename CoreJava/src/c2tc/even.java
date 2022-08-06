package c2tc;
import java.util.*;
public class even {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int flag=0;
		for(int i=0;i<=n;i=i+2)
		{
			if(n==i)
			flag=1;
			break;
		}
		if(flag==1)
		{
			System.out.println("even");	
		}
		else
		{
			System.out.println("odd");
		}
	}
}

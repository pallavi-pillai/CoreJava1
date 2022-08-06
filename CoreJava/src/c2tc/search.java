package c2tc;
import java.util.*;
public class search {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int flag=0;
		int pos,i;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int num=sc.nextInt();
		for(i=0;i<n;i++)
		{
		if(num==a[i])
		{
			flag=1;
			break;
		}
		}
			if(flag==1)
		    System.out.println(i+1);
			else
			System.out.println("not found");
		}
}

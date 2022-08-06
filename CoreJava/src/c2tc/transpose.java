package c2tc;
import java.util.*;
public class transpose {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				
			a[i][j]=sc.nextInt();
			
		    }	
		}	
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(j==0)
				{
				System.out.print(a[j][i]);
				}
				else
				{
					System.out.println(" "+a[j][i]);
				}
			}
		}		
	}
}

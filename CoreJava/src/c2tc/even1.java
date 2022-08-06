package c2tc;
import java.util.*;
public class even1 {
public static void main(String a[]) {
	@SuppressWarnings("resource")
	Scanner sc= new Scanner(System.in); 
	int n=sc.nextInt();
	if((n&1)!=1)
	{
		System.out.println("even");
	}
	else
	{
		System.out.println("odd");
	}
}
}

package c2tc;
import java.util.*;
public class anagram {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		char temp;
		String A=sc.nextLine();
		String B=sc.nextLine();
		//characters inside strings cannot be changed since string class is immutable
		char arr1[]=A.toLowerCase().toCharArray();
		char arr2[]=B.toLowerCase().toCharArray();
		
		if(A.length()!=B.length())
		{
			System.out.println("Not anagram");
		}
		else
		{
			for(int i=0;i<A.length();i++)
				for(int j=i+1;j<A.length();j++)
					if(A.charAt(i)>A.charAt(j))
					{
						temp=arr1[i];
						arr1[i]=arr1[j];
						arr1[j]=temp;
					}
			A=new String(arr1); //converting array to string here
			//System.out.println(A);
			Arrays.sort(arr2);
			B=new String(arr2);
			//System.out.println(B);
		
		if(A.compareTo(B)==0)
			System.out.println("anagram");
		else
			System.out.println("not anagram");

//        boolean result = Arrays.equals(A,B);
//        if(result)
//        	System.out.println("anagram");
//        else
//        System.out.println("not anagram");
		}  
	}
}

package c2tc;
import java.util.*;
public class stringex {
	public static void main(String[] args) {
		Scanner var= new Scanner(System.in); 
		System.out.print("Enter a string1: ");
		String A= var.nextLine();
		System.out.print("Enter a string2: ");
		String B= var.nextLine();
        System.out.println(A.length()+B.length());
        if(A.compareTo(B)>0)
        	System.out.println("yes");
        else
        	System.out.println("no");
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1)+" " +Character.toUpperCase(B.charAt(0))+B.substring(1));
       //Character.toUpperCase(B.charAt(0)+B.substring(1)
	}
}

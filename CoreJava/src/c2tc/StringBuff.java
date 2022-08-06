package c2tc;
import java.util.Scanner;
public class StringBuff {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		StringBuffer sb=new StringBuffer(str);
		int strlen=sb.length();
		for(int i=0;i<strlen;i++)
		{
			char ch=sb.charAt(i);
			if(ch>='a' && ch<='z')
			{
				ch=(char)(ch-32);
			}
			else if(ch>='A' && ch<='Z')
			{
				ch=(char)(ch+32);
			}
			sb.setCharAt(i, ch);
		}
		System.out.println(sb);
	}
}

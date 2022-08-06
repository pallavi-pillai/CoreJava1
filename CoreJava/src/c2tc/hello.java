package c2tc;
class hello
{
	static int a;
	static 
	{
		a=4;
		System.out.println("inside static block");
		System.out.println("a="+a);
	}
	hello()
	{
		System.out.println("inside constructor");
		a=10;
	}
	public static void func()
	{
		a=a+1;
		System.out.println("a="+a);
	}
	public static void main(String a[])
	{
		hello obj=new hello();
		obj.func();
	}
}


//public class hello {
//	public static void main(String[] args) {
////		System.out.println("Hello");
////		System.out.print("Pallavi");
////		System.out.printf("100");
//		Test t;
//		System.out.println(t.i);
//}

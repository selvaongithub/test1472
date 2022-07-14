package newpack;

public class Modifiers1 
{
	static int a=10; //static variable
	public static void add()
	{
		System.out.println("addition");
	}
	public static void mul()  //non static variable
	{
	System.out.println("multiply");	
	}
	private static void sub() {
		System.out.println("substraction");
	}
	public static void main(String[] args) {
		add();
		mul();
		//Modifiers1 mod=new Modifiers1();
		System.out.println(a);
		
		
	}
		

	}
     


package variables;

public class Global_variables2 
{
	int a = 10; // global non static variable
	static int b= 20; // global static variable
	String name = "velocity";
	

	public static void main(String[] args) 
	{
		System.out.println("value of b is "+b);
		

		Global_variables2 GV2 = new Global_variables2();
		System.out.println("value of a is "+GV2.a);
		
		GV2.demo();
		demo1();
		
	}
	public void demo()
	{
		System.out.println("Class name is "+name);
		int c= 30;
		int sum = c+a;
		int sum1=c+b;
		System.out.println("Addition is "+sum);
		System.out.println("addition is "+sum1);
		
		// int sum = c+d we can't use local variable from another method  
	}
	
	public static void demo1() 
	{
		//System.out.println("class name is "+name);
		//can't use non static variables in static method
        //int sum=d+a;		
		
		int c =40;
		int d =50;
		int sum = c+d;
		int sub=d-b;
		System.out.println("Addition is "+sum);
		System.out.println("Substration is "+sub);
	}
	

}

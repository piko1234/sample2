package constructor;

public class CS2
{
	public CS2() 
	{
	System.out.println("Runing zero parameter constructor");	
	}
	
	public static void main(String[] args)
	{
		CS2 e2=new CS2();
		e2.test1();
	
	}
	public void test1()
	{
	System.out.println("Non static method Test1 is called");	
	System.out.println("Pune is clean city");
	System.out.println("Manda is good cook");
		
	}

}

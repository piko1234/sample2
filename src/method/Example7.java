package method;

public class Example7 
{
	public static void main(String[] args)
	{
		// static method from different class 
		Example6.addition();
		Example6.add(10,20);
		Example6.add(24,56);
		Example6.demo();
		
		// non static method from different class
		Example6 e2 = new Example6();
		e2.addition1();
		e2.right();
		e2.variable("PIYUSH", 29, 'A', 61.26f);
	}
}

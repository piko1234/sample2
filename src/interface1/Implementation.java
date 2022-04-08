package interface1;

public class Implementation  implements Interface2{

	public static void main(String[] args) 
	{
	   Implementation im= new Implementation();
	   im.m1();
	   im.m2();
	   im.m3();
	   im.m4();

	
}

	@Override
	public void m1() 
	{
		System.out.println("m1 method from interface1 completed in implementation class");


		
	}

	@Override
	public void m2() 
	{
	   System.out.println("m2 method from interface1 completed in implementation class");	
		
	}

	@Override
	public void m3() 
	{
		System.out.println("m3 method from interface2 completed in implementation class");
		
	}

	@Override
	public void m4() 
	{
		System.out.println("m4 method from interface2 completed in implementation class");
		
	}

}

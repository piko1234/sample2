package inheretance;

public class Multilevel_inheritance
{

	public static void main(String[] args)
	{
      
		Class_C C= new Class_C();
		C.test();
		C.test1();
		C.demo();
		C.demo1();
		C.right();
		C.right1();
		 
		Class_C.test2();
		Class_C.demo2();
		
		System.out.println("\nTable of 5");
		int i;
		for(i=5;i<=50;i=i+5)
		{
		
			System.out.println(i);
		}
		
		
	}
}

	



package test_access_specifier;

import Access_specifiers.AS1;


public class Demo extends AS1
{

	public static void main(String[] args)
	{
		AS1 s1 = new AS1();
        s1.test1();
        
        Demo d= new Demo();
        d.test1(); //calling public method from AS1 class
        d.test3(); //calling protected method from AS1 class 
        
        
		
		
	}

}

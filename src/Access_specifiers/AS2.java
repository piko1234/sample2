package Access_specifiers;

public class AS2 
{

	public static void main(String[] args)
	{
        AS1 s1=new AS1();
        s1.test1(); //public method of AS1 class
        s1.test2();//default method of AS1 class
        s1.test3();//protected method of AS1 class
        
        
        // s1.test(); private method are visible only within class
        
        System.out.println("=============================================");
        
        
        System.out.println("Calling public member of AS1 class is "+s1.a);
        System.out.println("calling default member of AS1 class is "+s1.b);
        System.out.println("Calling protected member of AS1 class is "+s1.c);
		
        //System.out.println("private member of AS1 class is  not possible  "+s1.d);
		// private member can't call outside class
		
	}

}

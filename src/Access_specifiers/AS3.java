package Access_specifiers;

public class AS3

{

    int a = 20;	
	public String name = "Piyush";
	private float b= 55.65f;
	protected char grade ='A';
	
	    public static void main(String[] args)
	
	{
		AS3 s3 = new AS3();
		s3.demo();
		s3.demo3();
		
		
		demo2();
		demo1();
		
		
	
		System.out.println("============================");
		System.out.println("Value of A is "+s3.a);
		System.out.println("Name is "+s3.name);
		System.out.println("percentage is "+s3.b+"%");
		System.out.println("grade is "+s3.grade);

	}

	    private void demo()
	    {
	        System.out.println("This is private access specifier");
	    
	    }
	    
	    protected static void demo1()
	    {
	    
	    	int d= 35;
	    	int e=40;
	    	int sum =d+e;
	        System.out.println("This is protected access specifier ");
	     	System.out.println("sum is "+sum);
	    	
	    }
	    
	  public static void demo2()
	    {
	    	
	       System.out.println("This is public access specifier");
	    	
	    }
	    
	    void demo3() 
	    {
	    
	    	System.out.println("This is default access specifier");
	    }
	    
	    
}

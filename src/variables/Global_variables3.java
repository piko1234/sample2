package variables;

public class Global_variables3
{
    int a= 100;
    static int b=200;
    
	public static void main(String[] args)
	{

        Global_variables3 test = new Global_variables3();
	    int sum =10+test.a;
	    System.out.println("sum is "+sum);
	    
	    int sub = 300-b;
	    System.out.println("sub is "+sub);
	
	    int sub1 = 150-test.a; 
	    System.out.println("sub is "+sub1);
	}

}

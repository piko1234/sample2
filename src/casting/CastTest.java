package casting;

public class CastTest 
{

	public static void main(String[] args)
	{
		int a=100;
		System.out.println("value of a is "+a);
		
		double b=a; //implicit casting
		System.out.println("value of b is "+b);
		
		double c=108.1234;
		System.out.println("value of c is "+c);
		
		int d=(int)c; //explicit casting
		System.out.println("value of d is "+d);
		
	}

}

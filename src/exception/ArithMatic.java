package exception;

public class ArithMatic 
{

	public static void main(String[] args)
	{
		int a=10;
		int b=0;
		try 
		{
			int div=a/b;
			System.out.println(div);
		} 
		catch (Exception e)
		{
			System.out.println("Cannot Divide by Zero");

		}
		
		
		System.out.println("Hi Good Morning India");


	}

}

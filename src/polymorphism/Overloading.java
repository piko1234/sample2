package polymorphism;

public class Overloading {

	public static void main(String[] args)
	{
	     
		Overloading o=new Overloading();
		o.add();
		o.add(15,35);
		o.add(23.54f,12.34f );
		add(18,55.87f);
	} 
	
	public void add() 
	{
		int a=10;
		int b=20;
		int sum =a+b;
		System.out.println("sum is "+sum);
	}

	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("sum is "+sum);
		
	}
	public void add(float a,float b)
	{
		float sum=a+b;
		System.out.println("value is "+sum );
		
	}
	public static void add(int a,float b)
	{
		float sum=a+b;
		System.out.println("value is "+sum);
		
	}
	
	   
}

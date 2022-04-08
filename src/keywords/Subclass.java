package keywords;

public class Subclass extends Superclass
{
      int a=20;
      int b=32;
      
	public static void main(String[] args)
	{
       Subclass S = new Subclass();
       S.test1();
	   S.test3();
	   
	   
	}

	  public void test1() 
	{
	   int a=13;
	   int b=19;
	   int sum=a+b;
	   int sum1=100+this.a;
	   int sub =this.b-b;
	   
	   System.out.println("value of a is "+super.a);
	   System.out.println("value of b is "+super.b);
	   System.out.println("\nsum is "+sum);
	   System.out.println("sum is "+sum1);
	   System.out.println("sub is "+sub);
	}
	public void test3()
	{
		int a=56;
		int b=43;
		int mul=a*b;
		
		int sum3=super.a+b;
		int sub=a-super.b;
		
		System.out.println("mul is "+mul);
		System.out.println("sum is "+sum3);
		System.out.println("sub is "+sub);
	}
}

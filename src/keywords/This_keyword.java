package keywords;

public class This_keyword 


{
	
	int a=100;
   static int b=200;
	int c=250;

	public static void main(String[] args)
	{
		This_keyword s=new This_keyword();
		s.sample();
		
		
		
	}
		public void sample() 
		{
		
	       int a=10;
	       int b=900;
	       int sum=100+a;  //a=10--> local value
	       System.out.println("======================================");
	       System.out.println("sum using local  variables is "+sum);
	       
	       int sum1=100+this.a; //a=100--> global value
	       System.out.println("sum using Global variables is "+sum1);
	       
	       int sub =b-this.b;
	       int sub1 =1000-this.c;
	       
	       System.out.println("sub using Global variables is "+sub);
	       System.out.println("sub using Global variables is "+sub1);
	       
	       System.out.println("======================================");
		 
		
	
		
		
	}

}

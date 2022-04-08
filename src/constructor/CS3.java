package constructor;

public class CS3 

{
	   int   a;
	   int   b;
	   int   c;
	   float d;
	   float e;
	
	   public CS3()
   {
	    a=100;
        b=200;
        c=300;
	System.out.println("---------------------------------------------");
	System.out.println("constructor method is running without paramrter");
	
   }
      public CS3(int num1)
      {
    	a= num1;
    	System.out.println("----------------------------------------");
    	System.out.println("value of a is "+a);  
    	System.out.println("constructor using one parameter");  
    	  
      }
      public CS3(int num1,int num2)
      {
    	a=num1;
    	b=num2; 	  
        System.out.println("-----------------------------------------------");
        System.out.println("value of a is "+a);
        System.out.println("value of b is "+b);
        System.out.println("constructor using two parameter");
      }
        public CS3(int num1 ,int num2,int num3)
        {
        	a=num1;
        	b=num2;       	
        	c=num3;
        	System.out.println("------------------------------------------");
        	System.out.println("value of a is "+a);
            System.out.println("value of b is "+b);
            System.out.println("value of c is "+c);
        	System.out.println("constructor using three parameter");
        	
        }
      public CS3(float num1,float num2)
      {
    	  d = num1;
    	  e = num2;
    	  System.out.println("---------------------------------------------");
     	System.out.println("value of d is "+d);
       	System.out.println("value of e is "+e);

     	 
      }
      
      
      public static void main(String[] args) 
	{
      CS3 c1 = new CS3();
      c1.addition();
       
      CS3 c2 = new CS3(800);
      c2.addition();
     
      CS3 c3 = new CS3(400,600);
      c3.addition();
      
      CS3 c4 = new CS3(500, 700, 900);
      c4.addition();
      
      CS3 c5 = new CS3(55.67f,32.56f);
      c5.addition1();
      
      System.out.println("------------------------------------------------------");
	}
	
	
	public void addition()
	{
		int sum =a+b+c;
	 System.out.println("sum is "+sum);
	}
	public void addition1()
	{
	   float sum1 =d+e;   
	   System.out.println("sum1 is "+sum1);

	   
	}

}

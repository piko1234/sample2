package variables;

public class Global_variables
{
     static int a=10;// global static variable
     int b=20;// global non static variable
     
     static  public void main(String[] args) 
     {
       System.out.println("value of a is "+a);//calling global static variable
       Global_variables G= new Global_variables();//created object
       System.out.println("value of b is "+G.b);//calling global non static variable
       test();
       G.test1(); 
      
       
	 }
      
     public static void test() 
     {
    	  int c=30;
    	  int sum=a+c;
    	  
    	  System.out.println("sum is "+sum);
    	  System.out.println();
     }
 
     public void  test1()
     {
    	int c=40; 
    	int sub= c-a; 
    	
    	System.out.println("sub is "+sub);
     }
}

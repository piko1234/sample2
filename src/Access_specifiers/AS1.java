package Access_specifiers;

public class AS1
{
	
	int  a=10; //////default global variable
	public int b =20; //public global variable
	protected int c=30; //protected global variable
	private int d=40; // private global variable
	public static void main(String[] args)
	{
          AS1 s1 = new AS1();
          s1.test1(); //public method --> Throughout project 
          s1.test2(); //default method --> within package can't accessed outside of package
          s1.test3(); //protected method -->within package can be accessed outside package --> inheritance
          s1.test4(); //private method --> only within class 
          
          System.out.println("=======================================");
          System.out.println("Default global variable a is "+s1.a);
          System.out.println("public global variable b is "+s1.b);
          System.out.println("protected global variable c is "+s1.c);
          System.out.println("private global variable d is "+s1.d);
	
	
	 }
	    public void test1()
	
	 {
	   System.out.println("Public test1 method from AS1 class");	
		
	 }
	
	     void test2()
	 {
	    System.out.println("Default test2 from AS1 class");	
	
	 }
         protected void test3()
     {
    	System.out.println("Protected Test3 from AS1 class"); 
     }	
         private void test4()
     {
       System.out.println("private Test4 from AS1 class"); 	 
     }
 
     	
	
}

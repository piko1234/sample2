package method;

public class Example6 
{

	public static void main(String[] args)
	{
	    addition();//static method maths
	    
        Example6 e1 =new Example6();
        e1.addition1();//non static method maths
        
	    demo();// variable static method
	    e1.right();//variable non static method
	    
	 // static variable using parameter method
	    add(10,40); 
	    add(20,45); 
	    add(17,19);
	    
	   
	    // non static method using parameter
	    e1.variable("Piyush",1,'A', 58.85f);
	    e1.variable("Ganesh",2,'A', 60.21f);
	    e1.variable("Akshay",3,'A', 60.23f);
	    e1.variable("Nagesh",4,'A', 59.21f);
	    e1.variable("Virendra",5,'A', 65.41f);
	    e1.variable("Akash",6,'A', 60.34f);
	    
	    //static method using parameter
	    variable2("Kalyani", 1, 'b', 51.56f);
	    variable2("Madhuri", 2, 'b', 53.61f);
	    variable2("Sayali", 3, 'b', 50.50f);
	    variable2("Pooja", 4, 'b', 52.52f);
	    
	    
	    
	}
      public static void addition()
     {
	   int a=100;
	   int b=200;
	   int sum = a+b;
	   System.out.println("Sum is "+sum);
	 }
      
      public void addition1()
      {
    	  int a=10;
    	  int b=20;
    	  int sum =a+b;
    	  System.out.println("Sum is "+sum);
      }
      public static void demo()
      {
    	  String name = "piyush";
    	  int roll_num =9;
    	  char grade  ='A';
    	  float weight =67.76f;
    	  System.out.println("---------------------------");
    	  System.out.println("Name is "+name);
    	  System.out.println("Roll no. is "+roll_num);
    	  System.out.println("Grade is "+grade);
    	  System.out.println("Weight is "+weight);
    	  System.out.println("---------------------------");
      }
           public void right()
      {
    	 
    	 String name = "Ganesh";
   	     int roll_num =1;
   	     char grade  ='A';
   	     float weight =78.5f;
   	     
   	     System.out.println("---------------------------");
   	     System.out.println("Name is "+name);
   	     System.out.println("Roll no. is "+roll_num);
   	     System.out.println("Grade is "+grade);
   	     System.out.println("Weight is "+weight);
   	     System.out.println("---------------------------");
     
      }
         public static void add(int a,int b)
      {
    	int sum1=a+b;
    	int sub =b-a;
    	int mut= a*b;
    	System.out.println("sum is "+sum1);
    	System.out.println("sub is "+sub);
    	System.out.println("mut is "+mut);
     }
        public void variable(String name,int roll_no,char grade,float weight)
      {
    	  
    	  System.out.println("---------------------------");
    	  
    	  System.out.println("Name = "+name);
    	  System.out.println("Roll no. = "+roll_no);
    	  System.out.println("Grade = "+grade);
    	  System.out.println("Weight = "+weight);
    	  System.out.println("result is pass");
    	  
    	  System.out.println("---------------------------");
    	  
      }
        public static void variable2(String name,int roll_no,char grade,float weight)
      {
    	  
          System.out.println("---------------------------");
    	  
          System.out.println("Name = "+name);
    	  System.out.println("Roll no. = "+roll_no);
    	  System.out.println("Grade = "+grade);
    	  System.out.println("Weight = "+weight);
    	  System.out.println("result is pass");
    	  
    	  System.out.println("---------------------------");
    	  
    	  
      }
      
}

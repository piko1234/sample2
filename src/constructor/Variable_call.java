package constructor;

public class Variable_call 
{
     int a=1000;
    static int b= 2000;
    String name = "velocity";
    char grade = 'A';
    static float c=66.67f;
	public static void main(String[] args) 
	
	{
      Variable_call e2 = new Variable_call();
      System.out.println("================================");
      System.out.println("Value of variable a is "+e2.a);
      System.out.println("Value of variable b is "+b);
      System.out.println("The name of class is "+e2.name);
      System.out.println("grade is "+e2.grade);
      System.out.println("percentage is "+c);
      System.out.println("================================");
      
	}

}

package variables;

public class Global_variables1 

{
	String name = "Piyush";
	String class_name= "Velocity";
	static char grade='A';
	static float per=67.76f;
	
	
	    public static void main(String[] args) 
	{
		Global_variables1 G1=new Global_variables1();
		System.out.println("Name is "+G1.name);
		System.out.println("class name is "+G1.class_name);
		System.out.println("Grade is "+grade);
		System.out.println("percentage is "+per);
	}
	
}

package control_statement;

public class Else_if_study {

	public static void main(String[] args) 
	{
	  int marks = 60;
	  
	  if ( marks>=40 & marks<50) 
	  {
		System.out.println("i am in 2nd class");
		
	  }
	  else if (marks >=50 & marks<70) 
	  
	  {
		System.out.println("I am in 1st class");
	  }
	  else if (marks>=70)
	  {
		System.out.println("I am in distinction");
	  }
	  
	   else 
	{
         System.out.println("i am failed");
	}
	}

}

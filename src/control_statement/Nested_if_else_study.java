package control_statement;

public class Nested_if_else_study 
{       
	//if user name is correct then please enter password , if your password is correct then login successful 


	public static void main(String[] args)
	{
		Nested_if_else_study n =new Nested_if_else_study();
		n.demo();
	}
	
	public void demo() 
	{
		
	
		String Username = "velocity";
		String Password = "velocity@123";
		if(Username== "velocity") 
	{
		System.out.println("Username is correct \nplease enter password");
		
		
		if (Password=="velocity@123" )
		{
		System.out.println("correct password \nlogin successful");
		
		}
		else 
		{
			System.out.println("please check password");
		}
	}
		else
		{
		System.out.println("incorrect username");	
		}
	
	}
}


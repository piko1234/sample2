package control_statement;

public class Irctc_login
{

	public static void main(String[] args)
	{
        String username="velocity";
		String password="velocity@123";
		String captha="12345";
		if ( username=="velocity")
		{
			System.out.println("username is correct \nEnter password \n");
			
			 
			if (password=="velocity@123")
			{
				System.out.println("password correct \nEnter captha\n ");
				
				if (captha=="12345")
				{
			      System.out.println("login success");
				}
				
				else 
				{
				System.out.println("check captha");	
				}
			}
			else
			{
			  System.out.println("check password ");	
			}	
		}
		 else
		{
		System.out.println("check username");	
		}
		
		
	}

}

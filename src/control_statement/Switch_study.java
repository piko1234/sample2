package control_statement;

public class Switch_study
{
    //if my year is
	// 1:I am in 1st year of engineering
	// 2:I am in 2nd year of engineering
	// 3:I am in 3rd year of engineering
	// 4:I am in 4th year of engineering
	// please enter valid value between 1-4-->Default
	
	public static void main(String[] args)
	
	{
		int year=4;
		char Branch= 'C';
		
		switch (year)
		{
		
		case 1:System.out.println("I am in 1st year of engineering");
		break;
		
		case 2:System.out.println("I am in 2nd year of engineering");
		break;
		
		case 3:System.out.println("I am in 3rd year of engineering ");
		break;
		
		case 4:System.out.println("I am in 4th year of engineering");
        break;
        
		default:System.out.println("enter valid no. between 1-4"); 
		break;
		}
		
		switch (Branch) 
		{
		case 'A':System.out.println("mechanical");
		break;
         
		case 'B':System.out.println("civil");
		break;
		 
		case 'C':System.out.println("Elelctrical ");
		break;
		
		default:System.out.println("enter valid branch");
			break;
		}

	}

}

package control_statement;

public class Else_if_3_study
{

	public static void main(String[] args)
	{
		Else_if_3_study e = new Else_if_3_study();
		e.test();
	}
          public void test()
          
          {
        	char grade ='A';  
        	if (grade=='A')
        	
        	{
			System.out.println("my marks are between 70 and 80");	
			}  
        	 else if (grade=='B')
            {
			System.out.println("my marks are between 60 & 70");	
			}
        	 else if (grade=='C') 
        	 {
        		 System.out.println("my marks are between 50 & 60");
        	 }
        	else if (grade=='D')
        	{
			System.out.println("my marks are between 40 & 50");	
			}
        	 else
                 
             {
           	 System.out.println("i am failed"); 
             }
                
       }
         
             
             
            	 
             
}

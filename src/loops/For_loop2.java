package loops;

public class For_loop2
{

	public static void main(String[] args)
	{
		System.out.println("Table of 4");
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*4);
		}
		
		System.out.println("\nprint 5 to 0");
		
         for(int i=5;i>=0;i--) 
         {
        	 System.out.println(i);
        	 
         }
         
           System.out.println("\nTable of 5");
         
         for(int i=5;i<=50;i=i+5) 
         {
        	 System.out.println(i);
         }
	}

}

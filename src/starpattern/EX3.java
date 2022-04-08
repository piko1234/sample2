package starpattern;

public class EX3
{
//	*        
//	**
//	***
//	****
//	*****
	
  public static void main(String[] args) 
    {
	  for(int i=1;i<=5;i++)
	  {
		  for(int j=1;j<=i;j++)
		  {
			  System.out.print("* ");
		  }
		  
		  System.out.println();
	  }
	  
	  
	  System.out.println("========Another method==========");
		
	  
	   int star=1;
	   for(int i=1;i<=5;i++)   // outer loop for rows
	   {
		   for(int j=1;j<=star;j++) // inner loop for columns
		   {
			System.out.print("* ");   
		   }
	
		   System.out.println();
		   star++;
	   }
	   
		
		
    }

}

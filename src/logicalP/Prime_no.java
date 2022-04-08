package logicalP;

public class Prime_no
{

	public static void main(String[] args)
 {
		System.out.println("Prime no from 1 to 20");
	      
    for (int m=2;m<=20;m++) 
    {
  	  int n=m;
  	  int check=0;
  	 
	
	for(int i=2;i<n;i++)
	   {
		if(n%i==0) 
		  {
			check=1;
		  }
	  }
       if(check==0)
       {
  	  System.out.println(n);
       }
    }
    
  }
}

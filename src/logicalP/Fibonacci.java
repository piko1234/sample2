package logicalP;

public class Fibonacci
{

	static public  void main(String[] args)
	{
	  //0,1,1,2,3,5,8,13,21,34
		
	 //3rd=1st+2nd	
		
		int n1=0;
		int n2=1;
		
		System.out.print(" "+n1);
		System.out.print(" "+n2);
		
		 
		 
		for(int i=1;i<=10;i++)
		{
		 int n3=n1+n2;
		 
		 n1=n2;
		 n2=n3; 
		 
		 System.out.print(" "+n3);
			
		}
	}
}

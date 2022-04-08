package loops;

public class Do_while1
{

	public static void main(String[] args) 
	{
		int a=1;
		do
		{
			int c=a;
			int b=c%2;
			  if(b==0)
			  {
				System.out.println(c+" is the even no "+"\n and its square is "+c*c);  
			  }
			  else
			  {
				 System.out.println(c+" is the odd no"+"\n and its cube is "+c*c*c); 
			  }
			  a++;
		}
		while
			(a<=10);
	}

}

package loops;

public class Odd_no {

	public static void main(String[] args)
	{
		
		//print odd no. using for loop
		int i;
		System.out.println("print odd no. ");
		
		for(i=11;i<=30;i=i+2)
		{
			
			System.out.println(i);
		}
		
		System.out.println("===========");
		
		//print odd no. using do while loop
		
		System.out.println("print odd no");
		int j=11;
		do
		{
			System.out.println(j);
			j=j+2;
		} while (j<=30);
		
		//print even no. using while loop
		
		
		System.out.println("=============");
		System.out.println("print even no.");
		int k =10;
		while (k<=30)
		{
			System.out.println(k);
			k=k+2;
		}
		

	}

}

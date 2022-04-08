package loops;

public class While_loop_table {

	public static void main(String[] args) 
	{
		System.out.println("Table of 3");
		int i=1;
		while (i<=10)
		{
			System.out.println(i*3);
			i++;
		}
		System.out.println("=================");
		System.out.println("Table of 4");
		
		
		// table using do while loop
		int j=1;
		do { 
			
			System.out.println(j*4);
			j++;
			
			
		} while (j<=10);
		
		
	}

}

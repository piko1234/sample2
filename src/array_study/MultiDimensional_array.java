package array_study;

public class MultiDimensional_array {

	public static void main(String[] args) 
	{
		char grade[][]= {{'a','b'},{'c','d'}};
		
		
		 for (int i=0;i<=grade.length-1;i++)
		 {
			for (int j=0;j<=grade.length-1;j++)
			{
			System.out.print(grade[i][j]+" ");	
			}
			System.out.println();
		 }
		 
		 
		 System.out.println("====================");
		 
		 
		 int num[][]= {{1,3},{2,4}};
		 
		 for (int i=0;i<=num.length-1;i++)
		 {
		 
		for (int j=0;j<=num.length-1;j++)
			{
			System.out.print(num[i][j]+" ");	
			}
			System.out.println();
		 } 
		

	}

}

package array_study;

public class MultiDimensional1 {

	public static void main(String[] args) 
	{
		int num[][] = new int[2][2];
		 num[0][0]=10;
		 num[0][1]=20;
		 num[1][0]=30;
		 num[1][1]=40;
		 
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



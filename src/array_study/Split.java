package array_study;

public class Split 
{

	public static void main(String[] args)
	{
		System.out.println("---------split method-------------");
		
		String i="I LOVE MY INDIA";
		String j=" ";
		String v[]=i.split(j);
		for (int h=0;h<=3;h++)
		{
			System.out.println(v[h]);
		}
		
		for (int h=0;h<=3;h++)
		{
			System.out.print(v[h]+" ");
		}
		
		
		System.out.println("\n=========================");
		
		String a="Welcome To Goa Singham";
		
		String w[]=a.split(" ");
		 for(int k=0;k<=3;k++) 
		 {
			 System.out.print(w[k]+" ");
		 }
   }

}

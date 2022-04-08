package array_study;

import java.util.*;

public class Test_2 {

	public static void main(String[] args) 
	{
	
		//second method declaring and initialization in one line
		
		//1.declaration 2.initialization
		
		//1.integer
		int money []= {10,20,50,100,200,500,2000};
		
		for (int i=0;i<=money.length-1;i++)
		{
			System.out.println(money[i]);
		}
		
		
		//2.String
		String city[]= {"Akola","Amravati","Washim","Buldhana","Nagpur"};
		
		System.out.println("==========================");
		
		for(int j=0;j<=city.length-1;j++)
		{
		System.out.println(city[j]);	
			
		}
		
		Arrays.sort(city);
		
		System.out.println("=========================");
		for(int j=0;j<=city.length-1;j++)
		{
			System.out.println(city[j]);
		}
		
		
		System.out.println("======Descending order======");
		
		for(int i=city.length-1;i>=0;i--)
		{
			System.out.println(city[i]);
		}

		
		//3.char
	
	   char grade[]= {'C','D','A','B'};
	   
	   
	   System.out.println("===========================");
	   Arrays.sort(grade);
	   
	   for(int i=0;i<=grade.length-1;i++)
	   {
		  System.out.println(grade[i]); 
	   }
	
	   System.out.println("=========descending order========");
	   
	   for(int j=grade.length-1;j>=0;j--)
	   {
		   System.out.println(grade[j]);
		   
	   }
	
	
	
	
	}
	
	
	
	
	
	

}

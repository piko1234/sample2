package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist2 
{

	public static void main(String[] args) 
	{
      ArrayList<Integer> in= new ArrayList<>();
		
      in.add(1);
      in.add(2);
      in.add(3);
      in.add(4);
      in.add(5);
      
      System.out.println(in);
      
      for(int i:in) 
      {
    	  System.out.println(i);
      }
      
      //fetch data using iterator
      System.out.println("================using iterator=============");
      Iterator<Integer> it = in.iterator();
      
      while(it.hasNext()) 
      {
    	System.out.println(it.next());  
      }
      System.out.println("=====================");
      System.out.println(in.get(3));
      
   }

}

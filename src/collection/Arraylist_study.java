package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_study
 {

	public static void main(String[] args)
    {
	// it will show duplicate value
	// it allow multiple null values
	// order of insertion --> linear	
		
		
	//creating arraylist collection of different datatype	
     ArrayList<Object> al= new ArrayList<>();
     
     al.add("velocity");
     al.add(123);
     al.add(null);
     al.add('A');
     al.add(100);
     al.add('A');
     al.add("center");
     al.add(null);
     al.add('B');
     
     
     System.out.println(al);
     System.out.println(al.size());
     
     System.out.println("=====================================");
     //after creating list add another variable
     al.add("pune");
     al.add("Akola");
     al.add(5,8989.8989F);
     
     System.out.println(al);
     
     System.out.println("=======================================");
    
     //remove variable from list
     al.remove(7);
     al.remove("center");
     System.out.println(al);
     
     System.out.println("======================================");
    
     //checking multipe method
     System.out.println(al.contains('A'));
     System.out.println(al.contains('j'));
     System.out.println(al.isEmpty());
     System.out.println(al.get(4));
     
     System.out.println("===============Using for loop=======================");
    
     for(int i=0;i<=al.size()-1;i++)
     {
    	System.out.println(al.get(i)); 
     }
     
     System.out.println("===============using iterator===========--");
     
     Iterator<Object> it = al.iterator();
     
     while(it.hasNext()) 
     {
    	 System.out.println(it.next());
     }
    
     
     System.out.println("===============using for each loop===========--");
	
    
     for (Object o:al)
	{
      System.out.println(o);		
	}
}
     
}


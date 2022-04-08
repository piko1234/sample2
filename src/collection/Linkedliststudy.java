package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedliststudy 
{

	public static void main(String[] args) 
	{
		
		LinkedList<Object> ll= new LinkedList<>();

		ll.add('A');
		ll.add("pune");
		ll.add('A');
		ll.add(null);
		ll.add(100);
		ll.add(45.56f);
		ll.add(null);
		
		System.out.println(ll);
		
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.contains("pune"));
		
		ll.set(0,"AA");
		System.out.println(ll);
		
	     Iterator<Object> it = ll.iterator();
	     
	     while(it.hasNext())
	     {
	    	 System.out.println(it.next());
	     }
	     
	     ll.remove(5); //remove info in between linkedlist
	     System.out.println(ll);
	     
         System.out.println("=================using foreach loop============");	    
	       for(Object o:ll)
	     {
	    	 System.out.print(o);
	     }
	     
}
	
	
		
		
		
		

}



package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset
{

	public static void main(String[] args)
	{

		HashSet<Object> hs = new HashSet<>();
		
		// it allow only one null vaue
		//it will not display duplicate value
 		//order of insertion --> Random

		hs.add("velocity");
		hs.add(100);
		hs.add(32.56f);
		hs.add(null);
		hs.add(100);
		hs.add('A');
		hs.add(null);
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		hs.add("pune");
	    System.out.println(hs);
	    hs.add("bahubai jai ho");
	    System.out.println(hs);
	    hs.remove("pune");
	    System.out.println(hs);
	   
	    
	    
	    System.out.println("========using iterator=========");
	    Iterator<Object> it = hs.iterator();
	    
	    while(it.hasNext()) 
	    {
	    	System.out.println(it.next());
	    }
	   
	    
	    System.out.println("========using for each loop===========");
	    for(Object o:hs) 
	    {
	    	System.out.println(o);
	    }
	    
	    hs.clear();
	    System.out.println(hs);
	    System.out.println(hs.isEmpty());
	    
	    
		
		
	}

}
 
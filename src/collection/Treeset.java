package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset 
{

	public static void main(String[] args)
	{
       //dosent allow duplicate
	   //null value not allowed
	   //order of insertion --> asscending order
	   //no default capacity
		//can store only homogeneous data
		
		TreeSet<String> ts = new TreeSet<>();
		ts.add("yuvraj");
		ts.add("yuvraj");
		ts.add("class");
		ts.add("sachin");
		ts.add("virat");
		ts.add("dhoni");
		//ts.add(null);
		
		System.out.println(ts);
		System.out.println(ts.isEmpty());
		System.out.println(ts.contains("class"));
 		
       System.out.println("==============using iterator============");        
       Iterator<String> it= ts.iterator();
        while (it.hasNext())
        {
        	System.out.println(it.next());
		}
        
        System.out.println("=============using for loop===============");
        for(Object o:ts)
        {
        	System.out.println(o);
        	
        }
        
        System.out.println("================================");
        System.out.println(ts.pollFirst());
		System.out.println(ts);
		System.out.println(ts.pollLast());
        System.out.println(ts);
		
	}

}

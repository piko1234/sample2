package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priorityqueue {

	public static void main(String[] args)
	{
		
		//can accept only homogeneous data 
		
		PriorityQueue<Object> pq = new PriorityQueue<>();
		
         pq.add("abc");
         pq.add("pqr");
         pq.add("lmn");
         pq.add("piyush");
         pq.add("ganesh");
         
         // pq.add(100);  //it show classcast exception
        
         System.out.println(pq);
         System.out.println(pq.contains("veocity"));
         System.out.println(pq.isEmpty());
         
         
         System.out.println("============using iterator===========");
         Iterator<Object> it = pq.iterator();
         while(it.hasNext()) 
         {
        	System.out.println(it.next()); 
         }
         
         System.out.println("================using foreach loop===============");
          
         for(Object o:pq)
         {
        	 System.out.println(o);
         }
         System.out.println("==================================");
         System.out.println(pq.poll());
         System.out.println(pq);
         
	}

}

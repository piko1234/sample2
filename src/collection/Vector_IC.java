package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_IC 
{

	public static void main(String[] args)
	{
		Vector <Object> v =new Vector<>();
		
		v.add('A');
		v.add(100);
		v.add("gold");
		v.add('A');
		v.add(null);
		v.add(null);
		v.add("silver");
		v.add(null);
		
		System.out.println(v);
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v.indexOf("silver"));
		System.out.println(v.isEmpty());
		System.out.println(v.contains(2));
		System.out.println(v.get(2));
		
		v.add(5, 'n');//it will add n char at 5th index and other shift towards right
		System.out.println(v);
		
		v.remove(3);//remove element from specified index and other shift towards left
		System.out.println(v);
		
		System.out.println("==========using foreach loop=========");
		
		for(Object o:v)
		{
			System.out.println(o);
		}
		System.out.println("=============using iterator============");
		Iterator<Object> it = v.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
		System.out.println("=========using enumeration cursor=========");
		//this cursor used for only legacy class i.e vector class
		
		Enumeration<Object> en = v.elements();
		
		while(en.hasMoreElements()) 
		{
			System.out.println(en.nextElement()); 
		}
		
		System.out.println("==============using listiterator===========");
		ListIterator<Object> lit = v.listIterator();
		while(lit.hasNext())
		{
			System.out.print(" "+lit.next());
		}
		
	}

}

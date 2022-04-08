package collection;

import java.util.LinkedHashSet;

public class Linkedhashset
{

	public static void main(String[] args)
	{

		LinkedHashSet<Object> lhs = new LinkedHashSet<>();

		lhs.add("virat");
		lhs.add("dhoni");
		lhs.add(183);
		lhs.add(183);
		lhs.add(null);
		lhs.add('A');
		lhs.add('B');
		lhs.add(null);
		
		System.out.println(lhs);
		
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.size());
		System.out.println(lhs.contains("sachin"));
		System.out.println(lhs.clone());
		
		for(Object o:lhs)
		{
			System.out.println(o);
		}
		
		
		
		
		
		
		
	}

}

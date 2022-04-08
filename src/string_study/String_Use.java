package string_study;

public class String_Use {

	public static void main(String[] args) 
	{
		
	    //String a="Pune";   without using new keyword
		//String_Use s= new String_Use();  using new keyword
		
		
		///string without using new keyword    // constant pool area
		String m="velocity";
		String m1="velocity";
		
		///string using new keyword     //non constant pool area
		String n =new String("velocity");
		String n1=new String("velocity");
		String n2=new String("velocity pune");
		
		
		//equals equals shows boolean value
		//it compare memory location
		System.out.println(m==m1);
		System.out.println(m==n);
		System.out.println(n1==n2);
		
		
		//equals ()
		// it compare content of string
		System.out.println(m.equals(n));
		System.out.println(n.equals(n1));
		System.out.println(m.equals(n2));
		
		//length()
		
		System.out.println(m.length());
		System.out.println(n2.length());
		
		
		int length2=n2.length();
		System.out.println("length of string is "+length2);
		
		
		//touppercase()
		
		System.out.println(n2.toUpperCase());
		System.out.println(n1.toUpperCase());
		
		//tolowercase
		
		String lower= n2.toUpperCase();
		System.out.println(lower.toLowerCase());
		
	}

}

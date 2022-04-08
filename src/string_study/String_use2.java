package string_study;

public class String_use2
{

	public static void main(String[] args) 
	{
		//concat 
		
		String p="Velocity ";
		String q="Corporate ";
		String r="Training ";
		String s="Center ";
		String t="Pune";
		
		System.out.println(p.concat("testing ").concat(s));
		System.out.println(p.concat(q).concat(r).concat(s).concat(t));
		
		
		String finalString =p.concat(q).concat(r).concat(s).concat(t);
		System.out.println("\ncombination of all string is \n --->"+finalString);
		
	    //indexOf 
		//lastIndex
		//replace
		
		System.out.println(finalString.indexOf('o'));
		System.out.println(finalString.indexOf('p'));
		
		System.out.println(finalString.lastIndexOf('o'));
		
		System.out.println(finalString.replace('o', 'y'));
		
		String k="NITIN";
		System.out.println(k.replace("NI", "SA"));
   }

}

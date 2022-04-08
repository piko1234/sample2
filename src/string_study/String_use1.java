package string_study;

public class String_use1 
{
	   public static void main(String[] args) 
    {
		
	String a="velocity";
	String b="velocity";
	String d="VELOCITY";
	String c="velocity pune";
	
	//equals &  equalsIgnore -->it ignores lower case and upper case difference
	System.out.println(a.equals(b));
	System.out.println(b.equalsIgnoreCase(d));
	System.out.println(b.equalsIgnoreCase(c));
	
	//contains
	
	System.out.println(a.contains("ve"));
	System.out.println(a.contains("v"));
	
	
	//isEmpty & isBlank 
	
	String ab="";
	String bc=" ";
	String cd="pune";
	//System.out.println("\n"+a.isEmpty());
	System.out.println("===========");
	System.out.println(ab.isEmpty());
	System.out.println(bc.isEmpty());
	System.out.println(cd.isEmpty());
	 
	System.out.println("ab isBlank ? "+ab.isBlank());
	System.out.println("bc isBlank ? "+bc.isBlank());
	System.out.println("cd islank ? "+cd.isBlank());
	
	//charAT
	String pq="velocity";
	char at= c.charAt(3);
	char at1=pq.charAt(5);
	
	System.out.println("\n"+pq.charAt(4));
	System.out.println(at);
	System.out.println(at1);
	//System.out.println(pq.charAt(-1));  //it will show run time error
	
	//String elf=null;
	//System.out.println(elf.length());	 //shows runtime error
	
	
	//startWith & endWith
	
	String mn="velocit y";
	System.out.println(mn.startsWith("ve"));
	System.out.println(mn.startsWith("vl"));
	
	System.out.println(mn.endsWith("ty"));
	System.out.println(mn.endsWith("cty"));
	
	//substring
	
	String subString =mn.substring(6);
	System.out.println(subString);
	System.out.println("subString is "+subString);
	
	System.out.println(mn.substring(2, 4));
	System.out.println(mn.substring(1, 7));
	
  }

}

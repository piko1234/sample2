package logicalP;

public class A3 {

	public static void main(String[] args) 
	{
		String str="InTeRnaTIoNal";
		String L="";
		String U="";
		
		for(int i=0; i<=str.length()-1; i++)
		{
			char C = str.charAt(i);
			if(Character.isUpperCase(C))
			{
				U=U+C;
			}
			else 
			{
				L=L+C;
			}
		}
		System.out.println("Upper Case : "+U);
		System.out.println(("Lower Case : "+L));
	}

	}



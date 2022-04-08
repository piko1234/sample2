package logicalP;

public class A2 {

	public static void main(String[] args) {

String str="abc    ed  f  ";
		
		int count=0;
		
		for(int i=0;i<=str.length()-1;i++)
		{
			char space = str.charAt(i);
			if(space==' ')
			{
				count++;
			}
		}
		System.out.println("Total No.Space is "+count);
	}

	}



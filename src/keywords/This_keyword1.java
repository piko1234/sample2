package keywords;

public class This_keyword1
{
     String color = "White";
     
	public static void main(String[] args)
	{
		This_keyword1 k = new This_keyword1();
		k.test();
		
	}
	
       public void test() 
       {
		
    	  String color ="Black";
	      System.out.println("Mobile Color is "+color);
	      System.out.println("Mobile Display is "+this.color);
		
		
		
		
	}

}

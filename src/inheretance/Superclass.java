package inheretance;

public class Superclass 
{
       static int a=40;
       int b=30;
      
       public static void add()
         {
		int p =10;
		int t = 30;
		int sum = t+p;
		Superclass s = new Superclass();
		int sum2=a+s.b;
		int mul=a*s.b;
		
		System.out.println(mul);
	    System.out.println(sum);
	    System.out.println(sum2);
	    
	   }
        public void  sub()
        {
        	System.out.println(a-b);
		}
        
        
        
	
	
	
	
	
	
}

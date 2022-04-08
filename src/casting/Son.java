package casting;

public class Son extends Father{

	public static void main(String[] args)
	{
	    Father f =new Father();
	    f.money();
		
		Son s=new Son();
		s.money();
		s.bike();
		
		Father f1= new Son();
		f1.money();
		
		//f1.bike --> we can't call the method which is not common 
		

	}
	
	public void money() 
	{
		System.out.println("Sons money is 1 lacs");
	}
	
	public void bike() 
	{
	   System.out.println("sons bike luna");	
		
	}

}

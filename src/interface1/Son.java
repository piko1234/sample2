package interface1;

public class Son implements Father,mother {

	public static void main(String[] args) 
	{
		Son s= new Son();
		s.job();
		Father.bike();
		mother.bike();
	
	}

	@Override
public void job()
	{
		
		
        Father.super.job();
 		mother.super.job();
	System.out.println("Son is Engineer");
		System.out.println("Daughter is Engineer\nBoth are working in IT service sector");
}
	
}

package interface1;

public class Subclass implements Superclass_1,Superclass_2
{

	public static void main(String[] args) {
	   	
		Subclass s=new Subclass();
		s.bike();
		s.game();
		s.money();
		s.property();
		System.out.println("\nValue of a is "+a);
	
}

	
	public void property()
	{
			
		System.out.println("I have 1 acer of land");
		
	}

	
	public void bike() 
	{
		
		System.out.println("Bullet is my favourite bike");
	}

	@Override
	public void game()
	{
		System.out.println("love to play vollyball");
		
		
	}

	@Override
	public void money()
	{
		System.out.println("I have 1000 rupess ");
		
	}

}

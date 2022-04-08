package polymorphism;

public class Sub_class extends Super_class
{

	public static void main(String[] args)
	{
		Super_class s1 =new Super_class();
		s1.land();
		s1.land("Manda","kalyani");
		Sub_class s = new Sub_class();
		s.land();
		s.land("Ganesh","Manda");
		
	}
	
	public void land()
	{
	   System.out.println("\nPiyush have Land of 5 acers");
	   
	}
	   
	public void land(String name1,String name2)
	{
		String a=name1;
		String b= name2; 
		System.out.println("land of 2.5 acers beong to "+a);
		System.out.println("land of 2.5 acers belong to "+b);
		
	}

}

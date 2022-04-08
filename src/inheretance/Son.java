package inheretance;

public class Son extends Mother
{

	public static void main(String[] args)
	{
		Son s = new Son();
		s.money();
		s.look();
		s.laptop();
		nature();
		percent();
	}
      
	public void laptop()
      {
		System.out.println("Sons laptop");
	}
	
	public static void percent()
	{
		System.out.println("sons percent = 88.98%");
	}
}

package generalisation;

public class Testclass 
{

	public static void main(String[] args) 
	{
		Jio j=new Jio();
		System.out.println("=====JIO SIM DETAILS=====");
		j.call();
		j.Data();
		j.SMS();
		j.Jiotv();
		System.out.println("Jio sim rate is "+TRAI.SIM+"\n");
		
		Airtel a= new Airtel();
		System.out.println("=====AIRTEL SIM DETAILS=====");
		a.call();
		a.Data();
		a.SMS();
		a.money();
		System.out.println("Airtel sim rate is "+TRAI.SIM+"\n");
		
		VI v=new VI();
		System.out.println("=====VI SIM DETAILS=====");
		v.call();
		v.Data();
		v.SMS();
		v.D2H();
		System.out.println("VI sim rate is "+TRAI.SIM);
		
		

	
		
		

	}

}

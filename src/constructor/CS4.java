package constructor;

public class CS4 
    
{  
	int e;
	int f;
	String g;
	double num;
	float num1;
	
	CS4(double a, float b)
	{
		num=a;
		num1=b;
		
	}
	public static void main(String[] args)
	{
		CS4 m = new CS4(55.55,23.2f);
		m.add();
		
		CS4 m1 = new CS4(65.23, 22.2f); 
        m1.sub();
        
	}
	public  void add()
	{
		double c =num+num1;
		System.out.println(c);
	}
	public void sub() 
	{
		double d =num-num1;
		System.out.println(d);
		
		
		
	}
        
}

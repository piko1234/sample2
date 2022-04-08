package logicalP;

public class HCF_three {

	public static void main(String[] args)
	{
    int a=20,b=45,c=70;
    int hcf=0;
    
    for(int i=1;i<=a &&i<=b && i<=c;i++)
    {
    	
    	if(a%i==0 && b%i==0 && c%i==0)
    	{
    		hcf=i;
    	}
    }
	System.out.println("hcf of no is "+hcf);	
		
		
		// TODO Auto-generated method stub

	}

}

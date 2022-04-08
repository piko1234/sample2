package generalisation;

public class BOI implements RBI
{

	@Override
	public void CashDeposit() 
	{
		System.out.println("Diposit limit -75000/day per account");
		
	}

	@Override
	public void CashWithdraw()
	{
		System.out.println("Withdraw limit -25000/day per account");
		
	}

	@Override
	public void MoneyTransfer()
	{
	   System.out.println("RTGS-100000/day per account");	
	}

	@Override
	public void Interest()
	{
	  System.out.println("interest -8%");	
	}

	
}

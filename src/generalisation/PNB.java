package generalisation;

public class PNB implements RBI{


	@Override
	public void CashDeposit() 
	{
		System.out.println("Diposit limit -50000/day per account");
		
	}

	@Override
	public void CashWithdraw()
	{
		System.out.println("Withdraw limit -30000/day per account");
		
	}

	@Override
	public void MoneyTransfer()
	{
	   System.out.println("RTGS-150000/day per account");	
	}

	@Override
	public void Interest()
	{
	  System.out.println("interest -7.5%");	
	}

	
}

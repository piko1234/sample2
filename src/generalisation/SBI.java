package generalisation;

public class SBI implements RBI {

	@Override
	public void CashDeposit() 
	{
		System.out.println("Diposit limit -100000/day per account");
		
	}

	@Override
	public void CashWithdraw()
	{
		System.out.println("Withdraw limit -40000/day per account");
		
	}

	@Override
	public void MoneyTransfer()
	{
	   System.out.println("RTGS-200000/day per account");	
	}

	@Override
	public void Interest()
	{
	  System.out.println("interest -7%");	
	}

	
	

}

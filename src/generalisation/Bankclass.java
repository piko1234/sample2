package generalisation;

public class Bankclass {

	public static void main(String[] args)
	{
	   System.out.println("=======================================");
		
	   SBI s=new SBI();
	   s.CashDeposit();
	   s.CashWithdraw();
	   s.MoneyTransfer();
	   s.Interest();
	   
	   System.out.println("======================================");
	   
	   PNB p=new PNB();
	   p.CashDeposit();
	   p.CashWithdraw();
	   p.MoneyTransfer();
	   p.Interest();
	   
	   System.out.println("======================================");
	   
	   BOI b=new BOI();
	   b.CashDeposit();
	   b.CashWithdraw();
	   b.MoneyTransfer();
	   b.Interest();
	   
	   System.out.println("=====================================");
		
		

	}

}

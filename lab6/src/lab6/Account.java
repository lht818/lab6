package lab6;

public class Account 
{
	private int accountNumber;
	private boolean isStudent;
	private double feeShipping;
	
	public int getAccount()
	{
		return accountNumber;
	}
	public void setAccount(int aa)
	{
		accountNumber = aa;
	}
	public double shippping()
	{
		if(isStudent)
			feeShipping = 0.0 ;
		else
			feeShipping = 3.99;
	return feeShipping;
	}
}

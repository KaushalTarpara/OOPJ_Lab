class InsufficientFundsException extends Exception
{
	private double amount;
 	public InsufficientFundsException(double amount)
 	{
 		this.amount = amount;
 	}
 	public double getAmount()
	{
		return amount;
 	}
}
class CheckingAccount
{
 	private double balance;
 	private int number;
 	public CheckingAccount(int number)
 	{
 		this.number = number;
 	}
 	public void deposit(double amount)
	{
 		balance += amount;
 	}
public void withdraw(double amount) throws InsufficientFundsException
{
 	if(amount <= balance)
	{
		 balance -= amount;
 	}
 	else
 	{
 		double needs = amount - balance;
 		throw new InsufficientFundsException(needs);
 	}
 }
 public double getBalance()
 {
 	return balance;
 }
 public int getNumber()
 {
 	return number;
 }
}
public class Lab7_2
{
	public static void main(String [] args)
 	{
 		CheckingAccount c = new CheckingAccount(23712);
 		System.out.println("Depositing Rs.15000...");
 		c.deposit(10000.00);
 		try
 		{
 			System.out.println("\nWithdrawing Rs.10000...");
 			c.withdraw(10000.00);
 			System.out.println("\nWithdrawing Rs.48000...");
 			c.withdraw(48000.00);
 		}
 		catch (InsufficientFundsException e)
		{
			 System.out.println("Sorry, but you are short Rs." + e.getAmount());
			 e.printStackTrace();
		 }
 	}
}

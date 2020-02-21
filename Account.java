public class Account
{
	protected String accName;
	protected String accId;
	protected int balance;
	
	Account()
	{
		System.out.println("No Name");
	}
	
	Account(String aN, String aId, int b)
	{
		accName=aN;
		accId=aId;
		balance=b;
	}
	
	
	public void setAccName(String n)
	{
		accName=n;
	}
	public void setAccID(String i)
	{
		accId=i;
	}
	public void setBalance(int d)
	{
		balance=d;
	}
	
	public String getAccName()
	{
		System.out.println(accName);
		return accName;
	}
	
	public String getAccID()
	{
		System.out.println(accId);
		return accId;
	}
	
	public int getBalance()
	{
		System.out.println(balance);
		return balance;
	}
	
	public void deposit(int ammount)
	{
		if(ammount<0)
		{
			System.out.println("ERROR !!!");
		}
		else
		{
			balance=balance+ammount;
			System.out.println("Balance :"+balance);
		}
	}
	
	public void withdraw(int ammount2)
	{
		if(ammount2>balance)
		{
			System.out.println("Not Enough Balance");
		}
		else
		{
			balance=balance-ammount2;
			System.out.println("Balance :"+balance);
		}
	}
	
	public void showInfo(){
		System.out.println("Account Name:"+accName);
		System.out.println("Account ID:"+accId);
		System.out.println("Balance:"+balance);
	}
	
	
}
import java.util.Scanner;
public class AcMain
{
	public static void main(String a[])
	{	
	Scanner sin=new Scanner(System.in);
	System.out.println("Input Account Name:");
		String accName=sin.next();
		System.out.println("Input AccountId:");
		String accId=sin.next();
		System.out.println("Input Balance:");
		int balance=sin.nextInt();
		
		Account acc=new Account(accName,accId,balance);
		
		System.out.println("Add Balance:");
		int ammount=sin.nextInt();
		
		acc.deposit(ammount);
		
		System.out.println("Withdraw Balance:");
		int ammount2=sin.nextInt();
		
		acc.withdraw(ammount2);
		
		acc.showInfo();
	}
	
		
	
}
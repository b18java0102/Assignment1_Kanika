import java.util.Scanner;
class Handle extends Exception{
	Handle(String s)
	{
		super(s);
	}
}
class atm {
	int pin;
	double balance=20000;
	atm(){
		System.out.println("Enter PIN");
		Scanner s=new Scanner(System.in);
		if(s.nextInt()==1234)
		{
			pin=1234;
			System.out.println("Login Success");
		}
		else
		{
			System.out.println("Enter pin again");
			new atm();
		}
	}
	
	void withdraw(double amt){
		try{
		if(balance< 10000)
			throw new Handle("Balance is less than 10000");
		else if(balance<amt)
			throw new Handle("Amount is greater than the balance");
		else
		balance-=amt;
		}
		catch(Handle e)
		{
			System.out.println(e);
		}
	}
	void deposit(double amt){
		balance =balance+amt;
		
	}
	void balance_enquiry(){
		System.out.println("Balance = "+balance);
	}
}
public class atmpin {

	public static void main(String[] args) {
		
		int ch;
		Scanner s=new Scanner(System.in);
		do{
			System.out.println("1.Balance_Enquiry");
			System.out.println("2.Withdrawl");
			System.out.println("3.Deposit");
			System.out.println("4.Exit");
			System.out.println("Enter the PIN");
			atm a=new atm();
			System.out.println("Enter option");
			ch=s.nextInt();
			switch(ch)
			{
			case 1: a.balance_enquiry();
			break;
			case 2:System.out.println("Enter the balance to be withdrawn");
					double r=s.nextDouble();
					a.withdraw(r);
					System.out.println("Available Balance"+a.balance);
			break;
			case 3:System.out.println("Enter amount to deposit");
					double rp=s.nextDouble();
					a.deposit(rp);
					System.out.println("Available Balance"+a.balance);
			}
		}while(ch<4);
		System.out.println("Thanks for transaction.......!");
	}

}

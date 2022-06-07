package bankAccountApp;

public abstract class Account implements IBaseRate {
//List common property for saving and checking 
	
	private String name;
	private String SSN;
	private double balance;
	private  static int index =10000;
	protected String accountNo;
	protected double rate;
	
	//Constructor to set base properties and initialise the account
	
	public Account(String name,String SSN, double initDeposit) {
	
		this.name=name;
		this.SSN=SSN;
		this.balance=initDeposit;
		
		//set account number
		++index;
		this.accountNo=setAccountNumber();
		//System.out.println(getBaseRate());
		setRate();
	}
	
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoOfSSN=SSN.substring(SSN.length()-2,SSN.length());
		int uniqueID=index;
		int randomNumber = (int)(Math.random()* Math.pow(10, 3) ) ;
		return lastTwoOfSSN+uniqueID+randomNumber;
	}
	
	public void compound() {
		double accruedInterest= balance * (rate/100);
		balance+=accruedInterest;
		System.out.println("Accrued Interest"+accruedInterest);
		printBalance();	
	}
	
	//List common method - transaction
	
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("Depositing Amount $"+amount);
		printBalance();
	}
public void withdraw(double amount) {
		balance-=amount;
		System.out.println("Withdraw amount $"+amount);
		printBalance();
	}
public void transfer(String toWhere, double amount) {
	balance-=amount;
	System.out.println("Tranfered $"+amount+" to "+ toWhere );
	printBalance();
}
public void printBalance() {
System.out.println("Your balance is $"+balance);
}
	
	
	public void showInfo() {
		System.out.println("Name: "+name+"\nAccount No: "+accountNo
	+"\nSSN: "+SSN+"\nBalance: $"+balance+"\nRate is :"+rate+"%");
		
		
	}
	
	
}

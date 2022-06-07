package bankAccountApp;

public class Checking extends Account {
//list properties specific to checking account
	private int debitCardNumber;
	private int debitCardPIN;
	
	
	//constructor to initialize checking account properties
	public Checking(String name, String SSN, double initDeposit) {
		super(name,SSN,initDeposit);
		accountNo="2"+accountNo;
		//System.out.println("Checking account number is : "+accountNo );
		setDebitCard();
	}
	
	@Override
	public void setRate() {
		 rate= getBaseRate() * .15;
	}
	
	//list any method specific to the checking account
	private void setDebitCard() {
		debitCardNumber= (int)(Math.random()* Math.pow(10,12) );
		debitCardPIN= (int)(Math.random()* Math.pow(10,4) );
	}
	
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Checking Account  Debit Card Number is : "
				+debitCardNumber+" having PIN "+debitCardPIN
				);
	}
	
	
}

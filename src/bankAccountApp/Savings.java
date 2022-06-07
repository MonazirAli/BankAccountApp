package bankAccountApp;

public class Savings extends Account {

	//list properties specific to saving account
	private int safetyDepositBoxID;
	private int safetyDepositBoxPIN;
	
	
		//constructor to initialize saving account properties
	public Savings (String name,String SSN, double initDeposit) {
		super(name,SSN,initDeposit);
		accountNo="1"+accountNo;
		//System.out.println("Saving  account number is : "+accountNo );
		setSafetyDepositBox();
	}
	@Override
	public void setRate() {
		 rate= getBaseRate() - .25;
	}
	
//list any method specific to the saving account
	private void setSafetyDepositBox() {
		safetyDepositBoxID= (int)(Math.random()* Math.pow(10,3) );
		safetyDepositBoxPIN		= (int)(Math.random()* Math.pow(10,4) );
	}
	
	
		
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Saving Account has safety Deposit Box ID: "
				+safetyDepositBoxID+" having PIN "+safetyDepositBoxPIN
				);
		
	}
	
}

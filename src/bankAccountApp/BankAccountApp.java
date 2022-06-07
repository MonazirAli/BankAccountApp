package bankAccountApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();
		/*	
		Checking a=new Checking("Tom Willson","123456789",1000); 
		Savings b = new Savings("Richel Wayner","987654321",500);

		a.showInfo();
		System.out.println("**************************");
		b.showInfo();
		System.out.println("**************************");

		a.deposit(135);
		a.withdraw(100);
		a.transfer("Monazir", 1200);*/
	
		
// Read a CSV file then create new accounts based on that data 
		
		String file ="/home/monazir/Learn/Java/Project/src/NewBankAccounts.csv";
		
			List<String[]> newAccountHolder = utilites.CSV.read(file);
			for(String[] accountHolder: newAccountHolder ) {
				//System.out.println("New Accounts");
				String name= accountHolder[0];
				String SSN= accountHolder[1];
				String accountType= accountHolder[2];
				double initDeposit= Double.parseDouble(accountHolder[3] ) ;
				
			//System.out.println(name+ " "+ SSN +" "+accountType+" $"+initDeposit);
					
					if(accountType.equals("Savings")) {
						//System.out.println("Open a Saving account");
						accounts.add(new Savings(name, SSN, initDeposit) );
					}
					else if  (accountType.equals("Checking")) {
						//System.out.println("Open a Checking Account");
						accounts.add(new Checking(name, SSN, initDeposit) );
					}
					else {
						System.out.println("Error reading account type");
					}
					
			
			}
			
				for(Account acc: accounts){
					System.out.println("\n*************************************");
					acc.showInfo();
			 }
			
				accounts.get((int) Math.random()*accounts.size()).deposit(1000); 
				
	} 

}

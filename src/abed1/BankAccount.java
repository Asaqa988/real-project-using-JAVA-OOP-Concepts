package abed1;

public class BankAccount {
	
	private String accountNumber ; 
	
	private double balance ; 
	
	public BankAccount(String accountNumber , double initialBalance) {
		this.accountNumber = accountNumber ; 
		setBalance(initialBalance); 
		
	}
	
	
	public String getAccountNumber() {
		return accountNumber ; 
	}
	
	public double getBalance() {
		return balance ; 
	}
	
	private void setBalance(double balance) {
		
		if(balance >=0) {
			this.balance = balance ; 
		}else {
			System.out.println("sorry please enter a valid positive number");
		}
	}
	public void deposit(double amount) {
		
		if(amount > 0 ) {
			setBalance(this.balance+amount);
			
		}else {
			System.out.println("pleae depoist an amount of 1 jd and higher");
		}
		
	}
	public void withdraw (double amount) {
		if(amount > 0 && amount<=this.balance) {
			setBalance(this.balance-amount);
		}else {
			System.out.println("please correct the withdrawal amount ");
		}
	}
  
}

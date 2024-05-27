package abed1;

public class Main {
    public static void main(String[] args) {
       BankAccount account = new BankAccount("115598471", 0); 
    	
       
       // open the new account with this information (115598471,0) 
       
    	System.out.println("account number is "+account.getAccountNumber());
    	
    	System.out.println("initial balance is "+account.getBalance());
    	
    	
    // make some transaction 
    	
    	account.deposit(600);
    	
    	account.withdraw(500);
      	account.deposit(1000);
      	account.deposit(500);
      	account.deposit(900);
      	
      	account.withdraw(500);
    	
    	System.out.println("current balance is "+account.getBalance());
    	
    }
}

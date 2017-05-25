package sheet8BankAccount;

public class BankAccountMain {

	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount("Pat Flynn", "Dublin", 20000.36);
		System.out.println(b1);
		b1.deposit(12.36);
		b1.withdraw(125);
		b1.checkBalance();
		b1.withdrawAll();
		b1.checkBalance();
		b1.withdraw(125);
		
		System.out.println();
		
		
		BankAccount b2 = new BankAccount("Sebastian Smith", "Galway", 1000);
		System.out.println(b2);
		b2.interest();
		b2.checkBalance();
		b2.deposit(3000);
		b2.checkBalance();
		
		System.out.println("\nAccount counter: " + BankAccount.accountCounter);
	}
}


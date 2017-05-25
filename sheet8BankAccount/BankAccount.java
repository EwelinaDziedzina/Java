package sheet8BankAccount;

public class BankAccount {
	
	private String name;
	private String address;
	private int newAccountNumber;
	private double balance;
	
	public static double interestRate = 1.07; 
	public static int accountCounter;
	public static int accountNumber = 12341000;
	
	
	
	public BankAccount(){
		newAccountNumber = accountNumber++;
		accountCounter++;
	}
	
	
	public BankAccount(String name, String adress, double balance) {
		this();
		this.name = name;
		this.address = adress;
		this.balance = balance;
		
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAdress(String address) {
		this.address = address;
	}
		
	public String getAdress() {
		return address;
	}
	
	
	public void setAccountNumber(int newAccountNumber ) {
		this.newAccountNumber = newAccountNumber;
	}
	
	public int getAccountNumber() {
		return newAccountNumber;
	}

	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double deposit (double deposit){
		if (deposit > 0)
			balance += deposit;
		else
			System.out.println("Deposit can't be less than 0.");
		return balance;
	}
	
	public double withdraw (double withdraw){
		if (withdraw <= balance) 
			balance -= withdraw;
		else	
			System.out.printf("\nMax withdraw is: €%.2f", balance);
		return balance;
	}
	
	public void checkBalance(){
		System.out.printf("\nCurrent balance: €%.2f", balance);
	}
	
	public double interest (){
		balance = balance * interestRate;
		return balance;
	}
	
	public double withdrawAll(){
		System.out.printf("\nWithdrawed all amount: €%.2f", balance);
		return balance = balance - balance;	
	}
		
	
	public String toString(){
		return String.format("\nName: %s\nAddress: %s\nBank Account: %d \nBalance: €%.2f", name, address, 
				newAccountNumber, balance);
	}
}

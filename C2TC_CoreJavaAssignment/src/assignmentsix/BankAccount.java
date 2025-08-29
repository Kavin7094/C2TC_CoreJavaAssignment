package assignmentsix;

//BankAccount class
public class BankAccount {
	 private int accountNumber;
	 private double balance;

	 // Parameterized constructor
	 public BankAccount(int accountNumber, double balance) {
	     this.accountNumber = accountNumber;
	     this.balance = balance;
	 }

	 // Deposit method
	 public void deposit(double amount) throws InvalidAmountException {
	     if (amount <= 0) {
	         throw new InvalidAmountException("Deposit amount must be greater than 0.");
	     }
	     balance += amount;
	     System.out.println("Successfully deposited: " + amount);
	 }

	 // Withdraw method
	 public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
	     if (amount <= 0) {
	         throw new InvalidAmountException("Withdrawal amount must be greater than 0.");
	     }
	     if (amount > balance) {
	         throw new InsufficientFundsException("Insufficient balance! Available: " + balance);
	     }
	     balance -= amount;
	     System.out.println("Successfully withdrawn: " + amount);
	 }

	 // Display balance
	 public void displayBalance() {
	     System.out.println("Current Balance: " + balance);
	 }
	}

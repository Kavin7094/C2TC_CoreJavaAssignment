package assignmentsix;

import java.util.Scanner;

//Driver class
public class Main {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     // Create Bank Account
     BankAccount account = new BankAccount(101, 5000.0);

     try {
         System.out.println("Enter deposit amount:");
         double depositAmount = sc.nextDouble();
         account.deposit(depositAmount);

         System.out.println("Enter withdrawal amount:");
         double withdrawAmount = sc.nextDouble();
         account.withdraw(withdrawAmount);

     } catch (InvalidAmountException | InsufficientFundsException e) {
         System.out.println("Error: " + e.getMessage());
     } finally {
         account.displayBalance(); // Always show balance
     }

     sc.close();
 }
}


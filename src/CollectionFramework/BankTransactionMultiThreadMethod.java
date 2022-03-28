package CollectionFramework;

import java.util.Scanner;

class Account {
	public int balance;
	public int accountNumber;

	void displaybalance() {

		System.out.println("Account Number : " + accountNumber + " Balance : " + balance);
	}

	synchronized void deposit(int amount) {
		balance = balance + amount;
		System.out.println("Deposited Amount : " + amount);
		displaybalance();
	}

	synchronized void withdraw(int amount) {
		balance = balance - amount;
		System.out.println("Withdraw Amount : " + amount);
		displaybalance();
	}
} // End of the Account Class

class TransactionDeposit implements Runnable {
	int ammount;
	Account accountX;

	TransactionDeposit(Account x, int ammount) {
		accountX = x;
		this.ammount = ammount;
		new Thread(this).start();
	}

	public void run() {
		accountX.deposit(ammount);
	}
} // End of the TransactionDeposit Class

class TransactionWithdraw implements Runnable {
	int ammount;
	Account accountY;

	TransactionWithdraw(Account y, int ammount) {
		accountY = y;
		this.ammount = ammount;
		new Thread(this).start();
	}

	public void run() {
		accountY.withdraw(ammount);
	}
} // End of the TransactionWithdraw Class

public class BankTransactionMultiThreadMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Account Number :");
		Scanner sc = new Scanner(System.in);
		int accountNumber = sc.nextInt();
		
		/*int balance = sc.nextInt();
		System.out.println("Balance : " + balance);*/
		
		Account ABC = new Account();
		ABC.balance = 1000;
		ABC.accountNumber = accountNumber;
		System.out.println("balance in account :" + ABC.balance);
		System.out.println("Enter Deposit Ammount :");
		int a = sc.nextInt();
		System.out.println("Enter Withdraw Ammount :");
		int b = sc.nextInt();

		TransactionDeposit t1;
		TransactionWithdraw t2;
		t1 = new TransactionDeposit(ABC, a);
		t2 = new TransactionWithdraw(ABC, b);
	}

}
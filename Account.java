package ATM;

import java.util.ArrayList;

public class Account extends User {

	private int accountNumber;
	private String ownerName;
	private double amount;
	private int lastAmount;
	
	public int getLastAmount() {
		return lastAmount;
	}

	public void setLastAmount(int lastAmount) {
		this.lastAmount = lastAmount;
	}


	public static ArrayList<Account> accountList2 = new ArrayList<>();
	

	public static void setAccountList2(ArrayList<Account> accountList2) {
		Account.accountList2 = accountList2;
	}

	public Account(String name, String lastName, int accountNumber, String ownerName, double amount) {
		super(name, lastName);
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.amount = amount;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String toString() {
		return "User{" + "Account number = '" + accountNumber + '\''
				+ ", Owner Name = '" + ownerName + '\''
				+ ", Amount on the account = '" + amount + '\'' + '}';

	}

	public static void accountInfo(String name, String lastName,
			int telephoneNumber, String address, double amount, int accountNumber) {
		System.out.println("---------- ACCOUNT INFO ----------");
		System.out.println("-- ACCOUNT NUMBER:  " + accountNumber);
		System.out.println("-- OWNER'S NAME:    " + name);
		System.out.println("-- OWNER'S SURNAME: " + lastName);
		System.out.println("-- OWNER'S ADDRESS: " + address);
		System.out.println("-- OWNER'S NUMBER:  " + telephoneNumber);
		System.out.println("-- ACCOUNT AMOUNT:  " + amount);
		System.out.println("----------------------------------");

	}

	public boolean check(int accountNumber, ArrayList<Account> accountList) {
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getAccountNumber() == accountNumber) {
				return true;
			}
		}
		return false;

	}

	public static void moneyTransfer(int sourceAccount, int targetAccount,
			double amount) {
		for (int i = 0; i < accountList2.size(); i++) {
			if (accountList2.get(i).getAmount() == sourceAccount) {
				if (accountList2.get(i).getAmount() >= 0
						&& (accountList2.get(i).getAmount() - amount) >= 0) {
					accountList2.get(i).setAmount(
							accountList2.get(i).getAmount() - amount);
				} else {
					System.out.println("Try again!");
					return;
				}
				break;
			}
		}
		for (int j = 0; j < accountList2.size(); j++) {
			if (accountList2.get(j).getAccountNumber() == targetAccount) {

				accountList2.get(j).setAmount(
						accountList2.get(j).getAmount() + amount);
			}
		}
	}

	public static boolean transferCheck(int sourceAccount, int targetAccount,
			double amount) {

		boolean source = false;
		boolean target = false;
		boolean sending = false;

		for (int i = 0; i < accountList2.size(); i++) {

			if (accountList2.get(i).accountNumber == sourceAccount) {

				source = true;

			}

			if (accountList2.get(i).accountNumber == targetAccount) {

				target = true;

			}

			if (accountList2.get(i).lastAmount >= amount) {

				sending = true;

			}

		}

		if (!source) {
			System.out
					.println("Please enter the right number of source account!");
		}

		if (!target) {
			System.out
					.println("Please enter the right number of target account!");
		}

		if (!sending) {
			System.out.println("Please enter the right amount of money!");

		}

		if (!source || !target || !sending) {
			return false;

		} else
			return true;
	}

}

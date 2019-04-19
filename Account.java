package ATM;

import java.util.ArrayList;

public class Account extends User {

	private int accountNumber;
	private String ownerName;
	private double accountAmount;
	private ArrayList<Account> accountList2 = new ArrayList<>();

	Account(String name, String lastName, int telephoneNumber, String address, double amount) {

	}

	public Account(int accountNumber, String ownerName, double accountAmount) {
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.accountAmount = accountAmount;
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

	public double getAccountAmount() {
		return accountAmount;
	}

	public void setAccountAmount(double accountAmount) {
		this.accountAmount = accountAmount;
	}

	public String toString() {
		return "User{" + "Account number = '" + accountNumber + '\''
				+ ", Owner Name = '" + ownerName + '\''
				+ ", Amount on the account = '" + accountAmount + '\'' + '}';

	}

	public static void accountInfo(String name, String lastName, int telephoneNumber, String address, double amount, int accountNumber) {
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

	public void moneyTransfer(int sourceAccount, int targetAccount, double amount) {
		for (int i = 0; i < accountList2.size(); i++) {
			if (accountList2.get(i).getAccountAmount() == sourceAccount) {
				if (accountList2.get(i).getAccountAmount() >= 0
						&& (accountList2.get(i).getAccountAmount() - amount) >= 0) {
					accountList2.get(i).getAccountAmount(
							accountList2.get(i).getAccountAmount() - amount);
				} else {
					System.out.println("Try again!");
					return;
				}
				break;
			}
		}
		for (int j = 0; j < accountList2.size(); j++) {
			if (accountList2.get(j).getAccountNumber() == targetAccount) {

				accountList2.get(j).setAccountAmount(
						accountList2.get(j).getAccountAmount() + amount);
			}
		}
	}

	private void getAccountAmount(double d) {

	}

	public void setAccountList2(ArrayList<Account> accountList) {
		
	}

	public static void transferMoney(int sourceAccount, int targetAccount,
			double amount) {
		// TODO Auto-generated method stub
		
	}

	


}

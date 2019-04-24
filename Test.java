package ATM;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ArrayList<Account> accountList = new ArrayList<>();
		Account newAccount = null;

		menu();

		int menu = Integer();

		while (menu != 1 && menu != 2 && menu != 3 && menu != 4) {
			System.out.println("Please enter the correct option!");
			menu = Integer();

		}

		switch (menu) {

		case 1:
			System.out.println("--------------------------------------");
			System.out.println(" -- ENTER YOUR NAME -- ");
			System.out.println("--------------------------------------");
			String name = input.nextLine();
			

			System.out.println("--------------------------------------");
			System.out.println(" -- ENTER YOUR LAST NAME --");
			System.out.println("--------------------------------------");
			String lastName = input.nextLine();

			System.out.println("--------------------------------------");
			System.out.println(" -- ENTER YOUR TELEPHONE NUMBER -- ");
			System.out.println("--------------------------------------");
			int telephoneNumber = Integer();

			System.out.println("--------------------------------------");
			System.out.println(" -- ENTER YOUR ADDRESS -- ");
			System.out.println("--------------------------------------");
			String address = input.nextLine();

			System.out.println("--------------------------------------");
			System.out.println(" -- ENTER YOUR ACCOUNT NUMBER -- ");
			System.out.println("--------------------------------------");
			int accountNumber = Integer();

			System.out.println("--------------------------------------");
			System.out.println(" -- ENTER THE AMOUNT ON THE ACCOUNT --");
			System.out.println("--------------------------------------");
			double amount = Double();
			
			newAccount = new Account(name, lastName, telephoneNumber, address,
					amount);

			if (!newAccount.check(accountNumber, accountList) && amount > 0) {
				accountList.add(newAccount);
				System.out.println("--------------------------------------");
				System.out
						.println(" -- YOUR ACCOUNT HAS BEEN SUCCESSFULLY CREATED -- ");
				System.out.println("--------------------------------------");
				System.out.println();
			} else {
				System.out.println("--------------------------------------");
				System.out
						.println(" -- SOMEONE ALREADY CREATED AN ACCOUNT WITH THIS ACCOUNT NUMBER, OR YOUR AMOUNT IS NEGATIVE -- ");
				System.out.println("--------------------------------------");
			}

			menu();
			newAccount.setAccountList2(accountList);

			menu = Integer();

			System.out.println("--------------------------------------");
			System.out
					.println(" -- ENTER THE ACCOUNT NUMBER FROM WHICH YOU WANT TO SEND MONEY -- ");
			System.out.println("--------------------------------------");
			int sourceAccount = Integer();

			while (sourceAccount < 0) {
				System.out
						.println("Please enter the valid source account number!");
				sourceAccount = Integer();
			}

			System.out.println("--------------------------------------");
			System.out
					.println(" -- ENTER THE ACCOUNT NUMBER ON WHICH YOU WANT TO SEND MONEY -- ");
			System.out.println("--------------------------------------");
			int targetAccount = Integer();

			while (targetAccount < 0) {
				System.out
						.println("Please enter the valit target account number!");
				targetAccount = Integer();

			}

			System.out.println("--------------------------------------");
			System.out.println(" -- ENTER THE AMOUNT -- ");
			System.out.println("--------------------------------------");
			double sendingAmount = Double();

			while (sendingAmount <= 0) {
				System.out.println("Please enter a valid amount.");
				sendingAmount = Double();

			}

			Account.moneyTransfer(sourceAccount, targetAccount, sendingAmount);

			System.out.println("--------------------------------------");
			System.out.println(" -- TRANSFER SUCCESSFULLY DONE -- ");
			System.out.println("--------------------------------------");

			double lastAmount = amount - sendingAmount;

			Account.accountInfo(name, lastName, telephoneNumber, address,
					lastAmount, accountNumber);
			System.out.println();

		}

	}

	public static void menu() {
		System.out.println("---------- MAIN MENU ----------");
		System.out.println("1. CREATE NEW ACCOUNT");
		System.out.println("2. TRANSFER MONEY");
		System.out.println("3. EXIT PROM APPLICATION");
		System.out.println("-------------------------------");

	}

	public static int Integer() {

		Scanner input = new Scanner(System.in);

		int number = 0;

		while (true)
			try {
				number = input.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Enter the right number!");
				input.nextLine();
				continue;
			}
		return number;
		
	}

	public static double Double() {

		Scanner input = new Scanner(System.in);

		double number = 0;

		while (true)
			try {
				number = input.nextDouble();
				break;
			} catch (Exception e) {
				System.out.println("Enter the right number!");
				input.nextLine();
				continue;
			}
		return number;

	}
}

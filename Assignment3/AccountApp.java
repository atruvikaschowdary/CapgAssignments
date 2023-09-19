package assignment3;

import java.util.Collections;



import java.util.*;

 

public class AccountApp {

public static void main(String[] args) {

 

		TreeSet<Account> allAccounts = new TreeSet<>();

 

		  Account a1 = new Account(1,"Vikas", 12000, "Delhi");

		  Account a2 = new Account(2,"Manoj", 10500, "Hyderabad");

		  Account a3 = new Account(3,"mani", 22000, "Bangalore");

		  Account a4 = new Account(4,"teja", 6000, "Mumbai");

		  Account a5 = new Account(5,"naveen", 35000, "Bangalore");

 

		  allAccounts.add(a1);

		  allAccounts.add(a2);

		  allAccounts.add(a3);

		  allAccounts.add(a4);

		  allAccounts.add(a5);

 

		for (Account account : allAccounts) {

 

			System.out.println(account);

 

		}

 

		System.out.println(" ");

		

		System.out.println("---  Account Balance (Low to High)  ----------");

 

		System.out.println(" ");

 

		getLaptopsBasedOnPriceLowToHigh(allAccounts);

		

		System.out.println("---  Account Balance (High to Low)  ----------");

 

		System.out.println(" ");

		getLaptopsBasedOnPriceHighToLow(allAccounts);

 

	}

 

	public static void getLaptopsBasedOnPriceHighToLow(TreeSet<Account> allAccounts)

 

	{

 

		// Step1 -> convert set to List

 

		List<Account> tempList = new ArrayList<>();// or pass as constructor argument

		tempList.addAll(allAccounts);

		// Step 2-> create Comparator class Object

 

		SortAccountBasedOnBalanceHighToLow sortCode = new SortAccountBasedOnBalanceHighToLow();

		Collections.sort(tempList, sortCode);

		for (Account account : tempList) {

 

			System.out.println(account);

 

		}

	}

	public static void getLaptopsBasedOnPriceLowToHigh(TreeSet<Account> allAccounts)

 

	{

		// Step1 -> convert set to List

 

		List<Account> tempList = new ArrayList<>();// or pass as constructor argument

		tempList.addAll(allAccounts);

 

		// Step 2-> create Comparator class Object

 

		SortAccountBasedOnBalanceLowToHigh sortCode = new SortAccountBasedOnBalanceLowToHigh();

		Collections.sort(tempList, sortCode);

		for (Account account: tempList) {

 

			System.out.println(account);

 

		}

 

	}

}
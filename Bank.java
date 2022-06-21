package org.project1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.HashMap;
import org.project1.Account;


public class Bank 
{
	HashMap<Integer, Account> account_list;
	
	public Bank()
	{
		super();
		account_list = new HashMap<Integer, Account>();
		this.account_list = account_list;
	}
	
	public Bank(HashMap<Integer, Account> account_list)
	{
		super();
		this.account_list = account_list;
	}

	public boolean accountExists(int account_no)
	{
		return this.account_list.containsKey(account_no);
	}
	
	public Account getAccount(int account_no)
	{
		if(accountExists(account_no))
		{
			return this.account_list.get(account_no); 
		}
		else
		{
			System.out.println("Account doesn't exist!");
			System.out.println("Returning empty account");
			return null;
		}
	}
	public void addAccount(int account_no, float amount, String name, String address)
	{
		if(accountExists(account_no))
		{
			System.out.println("Account already exists!");
			System.out.println("In order to add amount or update name or update address. Call different function.");
		}
		else
		{
			Account account = new Account(account_no, amount, name, address);
			this.account_list.put(account_no, account);
		}
	}
	public void removeAccount(int account_no)
	{
		if(accountExists(account_no))
		{
			this.account_list.remove(account_no);
			System.out.println("Sorry to see you go!");
		}
		else
		{
			System.out.println("Account doesn't exist in order to be removed!");	
		}
	}
	
	public void updateAccountName(int account_no, String name)
	{
		if(accountExists(account_no))
		{
			Account account = this.account_list.get(account_no);
			account.setName(name);
			this.account_list.put(account_no, account);
		}
		else
		{
			System.out.println("Account doesn't exist to be updated.");
		}
	}
	
	public void updateAccountAddress(int account_no, String address)
	{
		if(accountExists(account_no))
		{
			Account account = this.account_list.get(account_no);
			account.setAddress(address);
			this.account_list.put(account_no, account);
		}
		else
		{
			System.out.println("Account doesn't exist to be updated.");
		}
	}

	public void withdraw(int account_no, float withdraw)
	{
		if(accountExists(account_no))
		{
			Account account = this.account_list.get(account_no);
			account.withdrawal(withdraw);
			this.account_list.put(account_no, account);
		}
		else
		{
			System.out.println("Account doesn't exist to be updated.");
		}
	}
	
	public void deposit(int account_no, float deposit)
	{
		if(accountExists(account_no))
		{
			Account account = this.account_list.get(account_no);
			account.deposit(deposit);
			this.account_list.put(account_no, account);
		}
		else
		{
			System.out.println("Account doesn't exist to be updated.");
		}
	}
	public void printAllDetails()
	{
		for (Account acc : this.account_list.values())
		{
			acc.displayDetails();
		}
	}
}
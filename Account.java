package org.project1;

public class Account 
{
	
	float amount;
	int account_no;
	String name , address;
	
	public Account()
	{
		super();
		this.account_no = -1;
		this.name = "";
		this.address = "";
		this.amount = 0;
	}
	public Account(int account_no, float amount, String name, String address)
	{
		super();
		this.account_no = account_no;
		this.name = name;
		this.address = address;
		this.amount = amount;
	}
	
	public int getAccno()
	{
		return this.account_no;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getAddress()
	{
		return this.address;
	}
	
	public float getAmount()
	{
		return this.amount;
	}

	public void setAmount(int amount)
	{
		this.amount = amount;
	}
	
	public void setAccno(int account_no)
	{
		this.account_no = account_no;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAddress(String address)
	{
		this.name = name;
	}
	
	public void deposit(float add_amount)
	{
		if(add_amount > 0)
		{
			this.amount += add_amount;
		}
		else
		{
			System.out.println("Amount must be greater than zero.");
		}
	}
	
	public void withdrawal(float withdraw_amount)
	{
		if(withdraw_amount > this.amount)
		{
			System.out.println("Withdrawal amount greater than the current balance.");
			System.out.println("Deducting only the available balance - "+ getAmount());
			this.amount = 0;
		}
		else
		{
			this.amount -= withdraw_amount;
		}
	}

	public void printBal()
	{
		System.out.println("The balance in the account is"+getAmount());
	}
 
	public void displayDetails()
	{
		System.out.println("================================");
		System.out.println("Account No - " + this.account_no);
		System.out.println("Account Amount - " + this.amount);
		System.out.println("Account Address - " + this.address);
		System.out.println("Account Name - " + this.name);
		System.out.println("================================");
	}

}

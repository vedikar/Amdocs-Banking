package org.project1;
import java.util.Iterator;
import java.util.Scanner;
import org.project1.Bank;

public class Operation extends Account
{
	public Operation(int account_no, String name, String address, int amount) {
		super(account_no, amount, address, name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Bank bank = new Bank();
		char cont = 'y';
        do 
        {
        	System.out.println("Welcome to Vedika Bank!");
        	System.out.println("Enter your choice: ");
        	System.out.println("Press 0 to Display all Account Details.");
        	System.out.println("Press 1 to Add Account.");
        	System.out.println("Press 2 to Deposit Amount.");
        	System.out.println("Press 3 to Withdraw Account.");
        	System.out.println("Press 4 to Check Balance Account.");
        	System.out.println("Press 5 to Check if Account exists.");
        	System.out.println("Press 6 to Remove Account.");
            int ch = sc.nextInt();  
            switch (ch) 
            {  
                case 0: // Display all Details
                	{
                		bank.printAllDetails();
                		break;
                	}
                case 1: // Display all Details
            	{
            		System.out.println("Adding account");
            		System.out.println("Enter account number");
            		int acct = sc.nextInt();
            		System.out.println("Enter amount for initial balance.");
            		float value = sc.nextFloat();
            		System.out.println("Enter name");
            		String name = sc.next();
            		System.out.println("enter address");
            		String address = sc.next();
            		bank.addAccount(acct, value, name, address);
            		break;
            	}
                case 2://deposit
                	{
                		System.out.println("Enter account number");
                		int acct =sc.nextInt();
                		System.out.println("enter  value to be deposited");
                		float value = sc.nextFloat();
                		bank.deposit(acct, value);
                		break;
                	}
                case 3://withdraw
                	{
                		System.out.println("Enter account details to withdraw the money");
                		int acct = sc.nextInt();
                		System.out.println("Enter value to be withdrawn");
                		float val = sc.nextFloat();
                		bank.withdraw(acct, val);
                		break;
                	}
                case 4://Check balance
                	{
                		System.out.println("Enter account details to check the balance");
						int acct=sc.nextInt();
                		Account acc = bank.getAccount(acct);
                		acc.printBal();
                		break;
                	}
                case 5://Checking account
	                {
	                	System.out.println("Enter account number to be searched");
	                	int acct=sc.nextInt();
	                	bank.accountExists(acct);
	                }
                case 6://Checking account
	                {
	                	System.out.println("Enter account number to be removed");
	                	int acct=sc.nextInt();
	                	bank.removeAccount(acct);
	                }
                default:
	                {
	                	System.out.println("Press y to continue. Any keyword other than y will quit the program"); 
	                    char inp = sc.next().charAt(0);
	                    if(inp == 'y' || inp == 'Y')
	                    {
	                    	cont = 'y';
	                    }
	                    else
	                    {
		                	System.out.println("Automatically stopping the enquiry.");
		                	cont = 'n';
	                    }
	                }	
            }
        }while(cont == 'y' || cont == 'Y');
	}
}
	

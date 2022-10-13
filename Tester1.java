import java.io.*;
import java.util.*;
class SavingAccount
{
	static int annualInterestRate;
	private int savingBalance,newBalance;
	double monthlyInterestRate;
	SavingAccount(int savingBalance)
	{
		this.savingBalance=savingBalance;
	}
	public int getNewBalance()
	{
	return this.newBalance;
	}
	public int getSavingBalance()
	{
	return this.savingBalance;
	}
	public void calculateMonthlyInterest(int annualInterestRate,int savingBalance)
	{
	this.annualInterestRate=annualInterestRate;
	this.savingBalance=savingBalance;
	this.monthlyInterestRate=this.annualInterestRate/12;
	this.newBalance=this.savingBalance+this.savingBalance*this.annualInterestRate/100;
	
	}
	public void modifyInterestRate(int annualInterestRate)
	{
	this.annualInterestRate=annualInterestRate;
	}

}
class Tester1
{
	public static void main(String[] args)
	{
		SavingAccount saver1=new SavingAccount(2000);
		SavingAccount saver2=new SavingAccount(3000);
		saver1.modifyInterestRate(4);
		saver1.calculateMonthlyInterest(4,2000);
		System.out.println("\n\tData of saver 1 with interest rate 4:-");
		System.out.println("Old balance:-"+saver1.getSavingBalance());
		System.out.println("*********after modifying interest rate************");
		System.out.println("New balance:-"+saver1.getNewBalance());
		saver2.modifyInterestRate(4);
		saver2.calculateMonthlyInterest(4,3000);
		System.out.println("\n\tData of saver 2 with interest 4:-");
		System.out.println("Old balance:-"+saver2.getSavingBalance());
		System.out.println("*********after modifying interest rate************");
		System.out.println("New balance:-"+saver2.getNewBalance());
		saver1.modifyInterestRate(5);
		saver1.calculateMonthlyInterest(5,2000);
		System.out.println("\n\tData of saver 1 with interest 5:-");
		System.out.println("Old balance:-"+saver1.getSavingBalance());
		System.out.println("*********after modifying interest rate************");
		System.out.println("New balance:-"+saver1.getNewBalance());
		saver2.modifyInterestRate(5);
		saver2.calculateMonthlyInterest(5,3000);
		System.out.println("\n\tData of saver 2 with interest 5:-");
		System.out.println("Old balance:-"+saver2.getSavingBalance());
		System.out.println("*********after modifying interest rate************");
		System.out.println("New balance:-"+saver2.getNewBalance());
		
	}
}
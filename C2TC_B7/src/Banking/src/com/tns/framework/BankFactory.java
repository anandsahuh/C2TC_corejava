package com.tns.framework;

public abstract class BankFactory
{
	public void getNewSavingAccount(int accNo,String AccNm, float accBal,boolean isSalary)
	{
		
	}
	
	public abstract CurrentAcc getNewCurrentAccount(int accNo,String accNm,float accBal,boolean creditLimit);
	{
		
	}
}


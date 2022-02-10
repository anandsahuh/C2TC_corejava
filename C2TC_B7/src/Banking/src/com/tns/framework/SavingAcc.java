package com.tns.framework;

public abstract class SavingAcc extends BankAcc
{
	 private boolean isSalary;
	private static final float MinBal = 0;
	
	@Override
	 public void withdraw(float accBal)
	{
		
	}
	
	public SavingAcc(int accNO, String accNm, float accBal, boolean isSalary) {
		super(accNO, accNm, accBal);
		this.isSalary = isSalary;
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}


package com.tns.framework;

public abstract class CurrentAcc extends BankAcc
{
	private final float creditLimit;
	@Override
	public void withdraw(float accBal)
	{
		
	}
	
	
	public CurrentAcc(int accNO, String accNm, float accBal, float creditLimit) {
		super(accNO, accNm, accBal);
		this.creditLimit = creditLimit;
	}


	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}


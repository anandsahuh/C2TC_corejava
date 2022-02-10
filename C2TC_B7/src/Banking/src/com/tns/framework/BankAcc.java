package com.tns.framework;

public abstract class BankAcc 
{
	 private int accNO;
	protected String accNm;
	protected float accBal;
	 public void withdraw(float accBal)
	{
		
	}
	
	 public void deposit(float accBal)
	{
		
	}
	
	public BankAcc(int accNO, String accNm, float accBal) {
		super();
		this.accNO = accNO;
		this.accNm = accNm;
		this.accBal = accBal;
	}

	@Override
	public String toString() {
		return "BankAcc [accNO=" + accNO + ", accNm=" + accNm + ", accBal=" + accBal + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	



	
	}



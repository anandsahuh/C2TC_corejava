package com.tns.application;
import com.tns.framework.*;

public class MMCurrentAcc extends CurrentBank
{	@Override
	public void withdraw(float accBal)
	{
		
	}

	public CurrentAcc(int accNO, String accNm, float accBal, float creditLimit) {
		super(accNO, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	

	
	
}

	@Override
	public String toString() {
		return "MMCurrentAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	import com.tns.framework.*;

public class MMCurrentAcc extends CurrentBank
{	@Override
	public void withdraw(float accBal)
	{
		
	}

	public CurrentAcc(int accNO, String accNm, float accBal, float creditLimit) {
		super(accNO, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	

	
	
}

	@Override
	public String toString() {
		return "MMCurrentAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


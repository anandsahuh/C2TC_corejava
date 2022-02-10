package com.tns.application;
import com.tns.framework;
public class MMSavingAcc {
	public class MMSavingAcc extends SavingAcc
	{
		private static final MIN BAL;
		
		
		@Override
		public void withdraw(float MINBAL)
		{
			
		}
		
		public void SavingAcc(int accNO, String accNm, float accBal, boolean isSalary) {
			super(accNO, accNm, accBal);
			this.isSalary = isSalary;
		}
		
		@Override
		public String toString() {
			return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
					+ hashCode() + "]";
		}
		
		
		
	}

}

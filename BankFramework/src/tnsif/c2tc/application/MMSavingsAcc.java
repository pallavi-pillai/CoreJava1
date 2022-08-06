package tnsif.c2tc.application;

import tnsif.c2tc.framework.SavingsAcc;

public class MMSavingsAcc extends SavingsAcc {

	@Override
	public String toString() {
		return "MMSavingsAcc [isSalary()=" + isSalary() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getAccBal()=" + getAccBal() + "]";
	}
	public void withdraw(float accBal)
	{
		System.out.println("You have withdrawed "+accBal);
	}
	public MMSavingsAcc(int accno, String accNm, float accBal) {
		super(accno, accNm, accBal);
		// TODO Auto-generated constructor stub
	}
}

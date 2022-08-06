package tnsif.c2tc.application;

import tnsif.c2tc.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {
	
	public MMCurrentAcc(int accno, String accNm, float accBal) {
		super(accno, accNm, accBal);
		// TODO Auto-generated constructor stub
	}
	
		@Override
	public void withdraw(float accBal) {
		System.out.println("You have withdrawed amount "+accBal+" with creditLimit "+ creditLimit);
	}

	
}

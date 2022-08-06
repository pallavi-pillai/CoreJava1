package tnsif.c2tc.application;

import tnsif.c2tc.framework.BankFactory;
import tnsif.c2tc.framework.CurrentAcc;
import tnsif.c2tc.framework.SavingsAcc;

public class MMBankFactory implements BankFactory {

	@Override
	public SavingsAcc getNewSavingsAccount(int accno,String accNm,float accBal) {
		SavingsAcc sa=new MMSavingsAcc(123,"pallavi",2500);
		return sa;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accno,String accNm,float accBal) {
		CurrentAcc ca=new MMCurrentAcc(234,"Janavi",30000);
		return ca;
	}

	

}

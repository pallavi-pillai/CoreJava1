package tnsif.c2tc.framework;

public interface BankFactory {
	public SavingsAcc getNewSavingsAccount(int accno,String accNm,float accBal);
	public CurrentAcc getNewCurrentAccount(int accno,String accNm,float accBal);
}

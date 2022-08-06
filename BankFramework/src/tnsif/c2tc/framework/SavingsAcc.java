package tnsif.c2tc.framework;

public class SavingsAcc extends BankAcc{
	public SavingsAcc(int accno, String accNm, float accBal) {
		super(accno, accNm, accBal);
		
	}
	private final boolean isSalary=true;

	
	@Override
	public String toString() {
		return "SavingsAcc [isSalary=" + isSalary + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getAccBal()=" + getAccBal() +  "]";
	}


	public boolean isSalary() {
		return isSalary;
	}
	
	
	
	
}

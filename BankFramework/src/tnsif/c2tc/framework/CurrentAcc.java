package tnsif.c2tc.framework;

public class CurrentAcc extends BankAcc {
    protected final float creditLimit=10000;

	public float getCreditLimit() {
		return creditLimit;
	}

	public CurrentAcc(int accno, String accNm, float accBal) {
		super(accno, accNm, accBal);
		
	}

	
	
	
    
}

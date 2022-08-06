package tnsif.c2tc;

import tnsif.c2tc.application.MMSavingsAcc;
import tnsif.c2tc.application.MMCurrentAcc;
import tnsif.c2tc.application.MMBankFactory;
import tnsif.c2tc.framework.CurrentAcc;
import tnsif.c2tc.framework.SavingsAcc;
import tnsif.c2tc.framework.BankFactory;

public class Client {
	public static void main(String[] args) {
		BankFactory sf=new MMBankFactory();
		SavingsAcc pa=new MMSavingsAcc(333, "Pallavi", 25000);
		pa.withdraw(1500);
		CurrentAcc na=new MMCurrentAcc(123,"Janavi",90000);
		na.withdraw(5000);
	}
}

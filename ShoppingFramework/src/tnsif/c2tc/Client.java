package tnsif.c2tc;

import tnsif.c2tc.application.GSNormalAcc;
import tnsif.c2tc.application.GSPrimeAcc;
import tnsif.c2tc.application.GSShopFactory;
import tnsif.c2tc.framework.NormalAcc;
import tnsif.c2tc.framework.PrimeAcc;
import tnsif.c2tc.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		ShopFactory sf=new GSShopFactory();
		PrimeAcc pa=new GSPrimeAcc(987, "Pallavi", 1000);
		pa.bookProducts(500);
		NormalAcc na=new GSNormalAcc(123,"Janavi",1000);
		na.bookProducts(500);
	}
	

}

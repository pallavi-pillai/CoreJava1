package tnsif.c2tc.framework;

public class NormalAcc extends ShopAcc {
    protected final float deliverycharges=50;
    
    public NormalAcc(int accno, String accname, float charges) {
		super(accno, accname, charges);
		
	}

	public float getDeliverycharges() {
		return deliverycharges;
	}  
	/*public void setDeliveryCharges(float deliverycharges) {
		this.deliverycharges=deliverycharges;
	}*/
}

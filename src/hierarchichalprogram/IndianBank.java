package hierarchichalprogram;

public class IndianBank extends RbiBank {
	public void place() {
		System.out.println("Bank Placed in OMR");
		
	}
	public static void main(String[] args) {
		IndianBank i=new IndianBank();
		i.adharCard();
		i.place();
	}
	

}

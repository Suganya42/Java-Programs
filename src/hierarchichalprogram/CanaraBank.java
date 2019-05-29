package hierarchichalprogram;

public class CanaraBank extends RbiBank {
	public void location() {
		System.out.println("Bank Located in Adyar");
		
	}
	public static void main(String[] args) {
		CanaraBank c=new CanaraBank();
		c.adharCard();
		c.location();
	}

}

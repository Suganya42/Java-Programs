package hierarchichalprogram;

public class SbiBank extends RbiBank {
	public void branch() {
		System.out.println("Bank Branch is in Velacheri");
		
	}
	public static void main(String[] args) {
		SbiBank s=new SbiBank();
		s.adharCard();
		s.branch();
	}

}

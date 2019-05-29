package mathodoverriding;

public class ChildBank extends ParentBank {
	
	public void fixed() {
		System.out.println("10%");
	}
	public void deposit() {
		System.out.println("11%");
	}
	public static void main(String[] args) {
		ChildBank bank=new ChildBank();
		bank.savigs();
		bank.fixed();
		bank.deposit();
	}
	

}

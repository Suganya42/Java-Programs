package interfaceprogram;

public class ChildBank implements ParentBank {

	@Override
	public void deposit() {
		System.out.println("7%");
		
	}

	@Override
	public void fixed() {
		System.out.println("4%");
		
	}
	public static void main(String[] args) {
		ChildBank bank=new ChildBank();
		bank.deposit();
		bank.fixed();
	}

}

package AbstractProgram;

public class ChildBank extends ParentBank {

	@Override
	public void savings() {
		System.out.println("9%");
		
	}

	@Override
	public void deposit() {
		System.out.println("7%");
		
	}
	public static void main(String[] args) {
		ChildBank bank = new ChildBank();
		bank.savings();
		bank.deposit();
		bank.fixed();
		
	}
	

	
	
	

}

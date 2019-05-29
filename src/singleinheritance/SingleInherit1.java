package singleinheritance;

public class SingleInherit1 extends SingleInherit {
	public void mainSingle1() {
		System.out.println("I am mainSingle 1");
		
	}
	public void mainSingle2() {
		System.out.println("I am mainSingle 2");
		
	}
	public static void main(String[] args) {
		SingleInherit1 s=new SingleInherit1();
		s.Single1();
		s.Single2();
		s.mainSingle1();
		s.mainSingle2();
	}

}

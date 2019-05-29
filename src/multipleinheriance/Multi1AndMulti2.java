package multipleinheriance;

public class Multi1AndMulti2 implements MultiOne, MultiTwo{

	@Override
	public void sub2One() {
		System.out.println("I am from multi2 one");
		
	}

	@Override
	public void sub2Two() {
		System.out.println("I am from multi2 two");
		
	}

	@Override
	public void sub1One() {
		System.out.println("I am from multi1 one");
		
	}

	@Override
	public void sub1Two() {
		System.out.println("I am from multi1 two");
		
	}
	public static void main(String[] args) {
		Multi1AndMulti2 m=new Multi1AndMulti2();
		m.sub1One();
		m.sub1Two();
		m.sub2One();
		m.sub2Two();
	}

}

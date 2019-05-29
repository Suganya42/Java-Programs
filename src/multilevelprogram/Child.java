package multilevelprogram;

public class Child extends Parent {
	public void children() {
		System.out.println("I am ur son");
		
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.children();
		c.parent();
		c.grandparent();
		
	}

}

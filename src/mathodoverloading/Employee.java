package mathodoverloading;


public class Employee {
	private void empId(String name) {
		System.out.println(name);
		
	}
	private void empId(long pno, String email) {
		System.out.println(pno + " " + email);
		
	}
	private void empId(int regno) {
		System.out.println(regno);
		
	}
	private void empId(String doj, String project) {
		System.out.println(doj + " " + project);
		
	}
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.empId("Suganya");
		emp.empId(1234567890l, "test@gmail.com");
		emp.empId(76542);
		emp.empId("12/04/18", "JAVA");
	}

}

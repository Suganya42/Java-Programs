package encasulationprogram;

import java.util.*;

public class Sample {
	public static void main(String[] args) {
		List<Sample1> li=new ArrayList<>();

		Sample1 s1=new Sample1();
		s1.setId(1234);
		s1.setName("Suganya");
		
		Sample1 s2=new Sample1();
		s2.setId(4321);
		s2.setName("Sukanya");
		
		li.add(s1);
		li.add(s2);
		
		for (int i = 0; i < li.size(); i++) {
			System.out.println("Id is " + li.get(i).getId());
			System.out.println("Name is " + li.get(i).getName());
			
		}
	}

}

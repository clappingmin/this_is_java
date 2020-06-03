package exam02;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ClassmateTest {
	public static void main(String[] args) {
		List<Classmate> classs = new LinkedList<>();
		
		classs.add(new Classmate(21611730,"박수민"));
		classs.add(new Classmate(21611742,"신세란"));
		classs.add(new Classmate(21611756,"정승연"));
		classs.add(new Classmate(22011756,"신입생"));
		
		Collections.sort(classs);	//오름차순
		
		for(Classmate m : classs)
			System.out.println(m);
		
		System.out.println("--------------------------------------");
		
		Collections.sort(classs,Collections.reverseOrder());	//내림차순
		
		for(Classmate m : classs)
			System.out.println(m);
	}
}

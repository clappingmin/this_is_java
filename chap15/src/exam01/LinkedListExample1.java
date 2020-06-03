package exam01;

import java.util.*;

public class LinkedListExample1 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();

		Long starttime, endtime;

		starttime = System.nanoTime();

		for (int i = 0; i < 10000; i++)
			list1.add(0, String.valueOf(i));
		endtime = System.nanoTime();

		System.out.println("ArrayList 걸린시간 : " + (endtime - starttime) + "ns");

		starttime = System.nanoTime();

		for (int i = 0; i < 10000; i++)
			list2.add(0, String.valueOf(i));
		endtime = System.nanoTime();

		System.out.println("LinkedList 걸린시간 : " + (endtime - starttime) + "ns");
	}
}

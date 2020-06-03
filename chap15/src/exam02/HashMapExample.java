package exam02;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>(); // <학생,성적>
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(2, "홍길동"), 95);
		map.put(new Student(3, "홍길동"), 95);

		System.out.println(map.size()); // equals 오버라이드 안해서 주소값으로 비교해서 따로 개수 센다
		System.out.println(map.hashCode());
	}
}

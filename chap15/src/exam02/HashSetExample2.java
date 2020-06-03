package exam02;

import java.util.*;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();

		set.add(new Member("È«±æµ¿", 30));
		set.add(new Member("È«±æµ¿", 30));	//MemberÀÇ equals ¶§¹®¿¡ À§¿¡²¨¶û Áßº¹µÇ¼­ ÇÑ°³¸¸ µé¾î°¨ 
		set.add(new Member("È«±æµ¿", 33));
		set.add(new Member("±è³ª¸®", 30));

		System.out.println("ÃÑ °´Ã¼¼ö :" + set.size());

		for (Member m : set) {
			System.out.println(m);
		}
	}
}

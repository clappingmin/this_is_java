package exam01;

import java.util.StringTokenizer;

public class StringSplitExample {
	public static void main(String[] args) {
		String s = "홍길동&이수홍,박연수,김자바-최명호";
		String[] result = s.split("&|,|-");

		for (String name : result)
			System.out.println(name);

		StringTokenizer stringTokenizer = new StringTokenizer(s, "/");

	}
}

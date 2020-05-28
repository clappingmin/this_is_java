package chap03;

import java.util.Scanner;

public class ConditionOperationExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("성적을 입력하세요.");
		int sum = scanner.nextInt();
		String t = sum >= 80 ? "합격" : "불합격";
		
		System.out.println(t);
	}
}

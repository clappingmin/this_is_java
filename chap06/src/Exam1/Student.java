package Exam1;

import java.util.Scanner;

public class Student {
	int sid = 0;
	String name = null;
	int kor = 0, eng = 0, math = 0;

	Scanner scanner = new Scanner(System.in);

	public void studentInfor() { // 조회

	}

	public void inputgrade() {
		System.out.println("국어 입력 : ");
		kor = scanner.nextInt(); // 국어
		System.out.println("영어 입력 : ");
		eng = scanner.nextInt(); // 영어
		System.out.println("수학 입력 : ");
		math = scanner.nextInt(); // 수학

	}

	public void inputinfo() {
		System.out.println("id 입력 : ");
		sid = scanner.nextInt();
		System.out.println("이름 입력 : ");
		name = scanner.next();

	}

	public void printall() {
		int sum = kor + eng + math;
		int avg = sum / 3;
		System.out.println("학번 : " + sid + " 이름 : " + name);
		System.out.println("국어 : " + kor + " 영어 : " + eng + " 수학 : " + math);
		System.out.println("총점 : " + sum + " 평균 : " + avg);
	}

}

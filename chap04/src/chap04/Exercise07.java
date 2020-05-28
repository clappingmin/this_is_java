package chap04;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {

		boolean run = true;
		int choice = 0;
		int balance = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------");

			int money;
			choice = scanner.nextInt();

			if (choice == 1) { // 예금
				System.out.println("예금액을 입력하세요.(예금액의 1%가 이자로 적립됩니다.) >>");
				money = scanner.nextInt();
				balance += (money * 1.01);

				System.out.println("예금 완료");

			} else if (choice == 2) { // 출금
				System.out.println("출금액을 입력하세요.(만원 단위) >>");
				money = scanner.nextInt();
				System.out.println(money + "만원");

				money *= 10000;

				if (balance < money)
					System.out.println("잔고가 부족합니다.");
				else {
					balance -= money;
					System.out.println("출금 완료");
				}
			} else if (choice == 3) {
				System.out.println("잔고 >>" + balance);
			} else if (choice == 4)
				break;

		}

		System.out.println("프로그램 종료");

	}

}

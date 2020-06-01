package Exam7;

import java.util.Scanner;

import Exam1.Student;

public class AccountExample {
	private static Account[] accountArry = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	static int cnt = 0;

	public static void main(String[] args) {
		int run = 0;
		while (run != 5) {

			System.out.println("------------토마토 저축은행--------------");
			System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료 ");
			System.out.println("-------------------------------------");
			System.out.println("선택 >> ");
			run = scanner.nextInt();

			if (run == 1) {
				createAccount();
			}

			else if (run == 2) {// 학생 개인 조회
				accountList();

			} else if (run == 3) { // 전체 학생 조회
				deposit();

			} else if (run == 4) {
				withdraw();

			} else if (run == 5)
				break;
		}
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {

		System.out.println("*---*---*");
		System.out.println(" 계좌 생성");
		System.out.println("*---*---*");

		System.out.println("계좌번호: ");
		String ano = scanner.next();
		System.out.println("계좌주: ");
		String name = scanner.next();
		System.out.println("초기입금액: ");
		int input = scanner.nextInt();

		accountArry[cnt] = new Account(ano, name, input);
		cnt++;
	}

	private static void accountList() {

		for (int i = 0; i < cnt; i++) {
			System.out.println("-------------------------------------");
			System.out.println("계좌주: " + accountArry[i].getOwner() + " 계좌번호: " + accountArry[i].getAno() + " 계좌 잔액:"
					+ accountArry[i].getBalance());
		}
	}

	private static void deposit() {
		System.out.println("계좌번호 입력 : ");
		String ano = scanner.next();
		System.out.println("예금액 : ");
		int money = scanner.nextInt();

		for (int i = 0; i < cnt; i++) {
			if (ano.equals(accountArry[i].getAno())) {
				int balance = accountArry[i].getBalance();
				balance += money;
				accountArry[i].setBalance(balance);

				System.out.println("-------------------------------------");
				System.out.println("계좌주: " + accountArry[i].getOwner() + " 계좌번호: " + accountArry[i].getAno() + " 계좌 잔액:"
						+ accountArry[i].getBalance());
			}

		}
	}

	private static void withdraw() {
		System.out.println("계좌번호 입력 : ");
		String ano = scanner.next();
		System.out.println("출금액 : ");
		int money = scanner.nextInt();

		for (int i = 0; i < cnt; i++) {
			if (ano.equals(accountArry[i].getAno())) {
				int balance = accountArry[i].getBalance();

				if (balance < money)
					System.out.println("계좌의 잔액이 부족합니다.");
				else {
					balance -= money;
					accountArry[i].setBalance(balance);

					System.out.println("-------------------------------------");
					System.out.println("계좌주: " + accountArry[i].getOwner() + " 계좌번호: " + accountArry[i].getAno()
							+ " 계좌 잔액:" + accountArry[i].getBalance());
				}
			}

		}
	}

}

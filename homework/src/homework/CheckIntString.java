package homework;

import java.util.Scanner;

public class CheckIntString {

	public static void main(String[] args) {

		char tmp;
		boolean output = true;

		Scanner scanner = new Scanner(System.in);
		System.out.print("판별할 문자열을 입력하세요. ");
		String input = scanner.nextLine();

		for (int i = 0; i < input.length(); i++) {
			tmp = input.charAt(i);

			if (!('0' <= tmp && tmp <= '9')) {
				output = false;
			}
		}
		System.out.print("숫자인가요? " + output);

	}

}

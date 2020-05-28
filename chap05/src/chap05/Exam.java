package chap05;

import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		int[] student = new int[10];

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++)
			student[i] = scanner.nextInt();

		for (int i = 0; i < 10; i++)
			System.out.println(student[i] + " ");

	}

}

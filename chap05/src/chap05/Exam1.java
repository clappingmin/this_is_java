package chap05;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		int[][] student = new int[10][3]; // 10명의 학생 - 국, 영, 수
		Scanner scanner = new Scanner(System.in);
		int run = 0;
		double[] avg = new double[10];

		while (run != 3) {

			System.out.println("----------------------------------");
			System.out.println("1.학생 점수 입력  2. 성적처리결과리스트 3. 종료");
			System.out.println("----------------------------------");

			run = scanner.nextInt();
			if (run == 1) {
				for (int i = 0; i < 10; i++) {// 학생 성적 입력

					System.out.println(i + 1 + "번째 학생의 성적 입력 :");
					for (int j = 0; j < 3; j++) {
						student[i][j] = scanner.nextInt();
						avg[i] += student[i][j];
					}
				}
			}

			else if (run == 2) {
				for (int i = 0; i < 10; i++) {

					System.out.println(i + 1 + "번째 학생의 총점 : " + avg[i]);
					System.out.println(i + 1 + "번째 학생의 평균 : " + String.format("%.2f", avg[i] / 3));
					System.out.println("----------------------------------");
				}

				for (int i = 0; i < 3; i++) {
					double tmp = 0;
					if (i == 0)
						System.out.print("국어 평균 : ");
					else if (i == 1)
						System.out.print("영어 평균 : ");
					else
						System.out.print("수학 평균 : ");

					for (int j = 0; j < 10; j++)
						tmp += student[j][i];

					System.out.println(String.format("%.2f", tmp / 10));
					System.out.println("총점 : " + tmp);
					System.out.println("----------------------------------");

				}
			} else if (run == 3)
				break;
		}
		System.out.println("프로그램 종료");

	}
}

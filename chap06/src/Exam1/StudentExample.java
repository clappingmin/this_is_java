package Exam1;

import java.util.Scanner;

public class StudentExample {
	public static void main(String[] args) {
		
		Student[] Student = new Student[100];//3
		Scanner scanner = new Scanner(System.in);
		
		int run = 0;
		int cnt = 0;

		while (run != 5) {
			

			System.out.println("------------------------------------------------------------");
			System.out.println("1.학생 정보,점수 입력 2.학생 개인 조회 3.전체 학생 조회 4.학생 점수 수정 5.종료 ");
			System.out.println("------------------------------------------------------------");

			run = scanner.nextInt();

			if (run == 1) {
					Student[cnt] = new Student();

					System.out.print("학생 정보 입력 >>");
					Student[cnt].inputinfo();

					System.out.println("학번 : " + Student[cnt].sid + " 학생 성적 입력 >>");
					Student[cnt].inputgrade();
					cnt++;
			}

			else if (run == 2) {// 학생 개인 조회
				System.out.println("----------------------------------");
				System.out.println("학번을 입력하세요.");
				int tmp = scanner.nextInt();

				for (int i = 0; i < cnt; i++) {
					if (Student[i].sid == tmp) {
						Student[i].printall();
						System.out.println("----------------------------------");
					}
				}
			} else if (run == 3) { // 전체 학생 조회

				double korsum = 0;
				double engsum = 0;
				double mathsum = 0;

				for (int j = 0; j < cnt; j++) {
					korsum += Student[j].kor;
					engsum += Student[j].eng;
					mathsum += Student[j].math;
				}

				System.out.println(String.format("국어 평균 :" + "%.2f", korsum / cnt));
				System.out.println("국어 총점 : " + korsum);
				System.out.println("----------------------------------");
				System.out.println(String.format("영어 평균 :" + "%.2f", engsum / cnt));
				System.out.println("영어 총점 : " + engsum);
				System.out.println("----------------------------------");
				System.out.println(String.format("수학 평균 :" + "%.2f", mathsum / cnt));
				System.out.println("수학 총점 : " + mathsum);
				System.out.println("----------------------------------");

			} else if (run == 4) {
				System.out.println("----------------------------------");
				System.out.println("학번을 입력하세요.");
				int tmp = scanner.nextInt();
				for (int i = 0; i < cnt; i++) {
					if (Student[i].sid == tmp) {
						Student[i].inputgrade();
						System.out.println("학생 성적 수정 완료");
						System.out.println("----------------------------------");
					}
				}

			}  else if (run == 5)
				break;
		}
		System.out.println("프로그램 종료");
	}
}

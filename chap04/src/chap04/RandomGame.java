package chap04;

import java.util.Scanner;

public class RandomGame {
public static void main(String[] args) {
		
		int inputnum = 0;
		int cnt = 1;
		long score = 100;
		int flag = 0;

		Scanner scanner = new Scanner(System.in);
		
		
		while (flag != 1) {
			
			int randomnum = (int) (Math.random() * 100) + 1;
			System.out.println(randomnum);
			
			while (randomnum != inputnum) {

				System.out.print((cnt) + "번째 시도\n" + "숫자를 입력해주세요. ");
				inputnum = scanner.nextInt();

				if (inputnum > randomnum) {
					System.out.println("Down");
					score -= 10;
					cnt++;
				} else if (inputnum < randomnum) {
					System.out.println("Up");
					score -= 10;
					cnt++;
				}
				
				
				
				if (score == 0) {
					System.out.println("Gameover!");
					break;
				}
			}
			
			if (score == 100) 
				System.out.println("축하합니다. 당신의 점수는 100000000000000000000000000000000000000점 입니다!");

			else 
				System.out.println("축하합니다. 당신의 점수는 " + score + "점 입니다!");
		
		System.out.println("re?");
		System.out.println("restart : 0 / end : 1");
		
		flag = scanner.nextInt();
		score = 100 ;
		inputnum = 0;
		cnt = 1;
		
		}
	}
}

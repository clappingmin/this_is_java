package homework;

import java.util.Scanner;

public class Check_Game {
	public static void main(String[] args) {

		String inputnum = "0";
		int inputnumInt = Integer.parseInt(inputnum);
		int cnt = 1;
		long score = 100;
		int flag = 0;
		boolean numcheckflag = true;

		Scanner scanner = new Scanner(System.in);

		while (flag != 1) {

			int randomnum = (int) (Math.random() * 100) + 1;
			String numStr = String.valueOf(randomnum);
			System.out.println(randomnum);

			while (!(numStr.equals(inputnum))) {

				System.out.print((cnt) + "번째 시도\n" + "숫자를 입력해주세요. ");
				inputnum = scanner.nextLine();

				for (int i = 0; i < inputnum.length(); i++) {
					char tmp = inputnum.charAt(i);

					if (!('0' <= tmp && tmp <= '9')) {
						numcheckflag = false;
					}
				}
				if (numcheckflag == false)
					System.out.println("숫자가 아닙니다. 숫자를 입력해주세요. ");
				else {
					if (inputnumInt > randomnum) {
						System.out.println("Down");
						score -= 10;
						cnt++;
					} else if (inputnumInt < randomnum) {
						System.out.println("Up");
						score -= 10;
						cnt++;
					}

					if (score == 0) {
						System.out.println("Gameover!");
						break;
					}
				}
				numcheckflag = true;
			}

			if (score == 100)
				System.out.println("축하합니다. 당신의 점수는 100000000000000000000000000000000000000점 입니다!");

			else
				System.out.println("축하합니다. 당신의 점수는 " + score + "점 입니다!");

			System.out.println("re?");
			System.out.println("restart : 0 / end : 1");

			flag = scanner.nextInt();
			score = 100;
			cnt = 1;

		}
	}
}

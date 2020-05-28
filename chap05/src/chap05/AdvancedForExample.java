package chap05;

public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87 };

		int sum = 0;
		for (int score : scores) {
			sum += score;

		}
		System.out.println("점수 총합 : " + sum);

		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 : " + avg);

		int[][] sc = { { 1, 2, 3 }, { 7, 8, 9 }, { 4, 5, 6 } };

		for (int i = 0; i < sc.length; i++)// 행의 수만큼
			for (int j = 0; j < sc[i].length; j++)
				System.out.println(i + "행 " + j + "열 :" + sc[i][j]);

		for (int[] ii : sc) { // 확장된 for문에서는 2차원 받을 때는 1차원으로 받음
			for (int jj : ii)
				System.out.println(jj);		//인덱스는 사용할 수 없음
		}
	}
}

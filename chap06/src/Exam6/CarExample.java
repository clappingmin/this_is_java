package Exam6;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.setSpeed(-50);// 잘못됨

		System.out.println("현재 속도 : " + myCar.getSpeed());

		myCar.setSpeed(60);

		if (!myCar.isStop()) {
			myCar.setStop(true);
		}

		System.out.println("현재 속도 : " + myCar.getSpeed());
	}
}

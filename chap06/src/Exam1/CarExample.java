package Exam1;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car(); // 기본 생성자
		car1.Model = "현대";

		Car car2 = new Car();
		car2.Model = "기아";

		System.out.println(car1);
		System.out.println(car2);
		String s = "Sumin";
		System.out.println(s.toString());

		car2.Maxspeed = 20;
		car2.key = false;
		car2.auto = true;

		car2.checkCar();
		car2.checkMaxspeed();
		car2.Setowner();
		car2.OnOffAuto();
		car2.carOnOff();

		System.out.println(car2.key);
		
		
		
		
	}
}

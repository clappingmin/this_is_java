package Exam1;

import java.util.Scanner;

public class Car { // public은 한파일 당 하나만

	Scanner scanner = new Scanner(System.in);

	String company;
	String Model;
	String owner;
	String color;
	Boolean auto, key;
	int Maxspeed, speed;
	int oil;
	
	int result;
	
	


	public void checkModel() {
		System.out.println("회사 : " + company + "차종 : " + Model);
	}

	public void carOnOff() {
		key = !key;
	}

	public void checkCar() {
		System.out.println("------------------------");
		System.out.println("회사 : " + company + " " + "차종 : " + Model);
		System.out.println("차 색상 : " + color);
		System.out.println((auto == true) ? "자동" : "수동");
		System.out.println("현재 속도 : " + speed);
		System.out.println("oil : " + oil);
		System.out.println("-----------------------");
	}

	public void Setowner() {
		owner = scanner.nextLine();
		System.out.println("차 주인 : " + owner);
	}

	public int Refuel() {
		oil += 100;
		return oil;
	}

	public void OnOffAuto() {
		auto = !auto;

		if (auto == true)
			System.out.println("자동");
		else
			System.out.println("수동");
	}

	public int speedup() {
		speed += 10;
		return speed;
	}

	public int speeddown() {
		speed -= 10;
		return speed;
	}

	public void checkMaxspeed() {
		System.out.println("최대 속도 : " + Maxspeed);
	}

	public void Navigation() {
		System.out.println("주행중~");
	}

}

class Tire {

}

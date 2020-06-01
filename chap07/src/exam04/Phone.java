package exam04;

public abstract class Phone {	//추상클래스 : 완성이 덜 된 클래스>>객체생성 안됨
	public String owner;

	public Phone(String owner) {
		this.owner = owner;
	}
	public void turnOn() {
		System.out.println("전원 On");
	}
	public void turnOff() {
		System.out.println("전원 Off");
	}	
	public abstract void bellOn(); //하나라도 있으면 추상클래스
	
}

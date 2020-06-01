package Exam6;

public class Car {
	private int speed;
	private boolean stop;

	public int getSpeed() { // 메소드 이름 짓기 - 첫번째는 소문자, 두번째는 대문자
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			return;
		} else
			this.speed = speed;
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}

	@Override	//어노테이션
	public String toString() {
		return "Car [speed=" + speed + ", stop=" + stop + "]";
	}
}

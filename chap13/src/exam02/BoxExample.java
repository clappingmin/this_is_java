package exam02;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();// 버전이 높으면 뒤의 <String> 안적어도 된다.
		box.setT("Hello");
		String s = box.getT(); // 앞에 캐스팅 안적어도 된다.

		Box<Integer> box1 = new Box();
		box1.setT(1);
		int i = box1.getT();

	}
}

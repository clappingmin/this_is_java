package exam01;

public class BpoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.setObject("박수민");

//		String name = box.getObject();	:오브젝트형이라서 이렇게 사용 X
		String name = (String) box.getObject();

		Apple apple = new Apple();
		box.setObject(apple);
		Apple a = (Apple) box.getObject();	//Object를 넣을 때는 형태에 맞게 넣어야 한다.

	}
}

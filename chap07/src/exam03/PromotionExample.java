package exam03;

public class PromotionExample {
	public static void main(String[] args) {
		/*
		 * B b = new B(); C c = new C(); D d = new D(); E e = new E();
		 */

		A a = new A();
		A ab = new B();
		A ac = new C();
		A ad = new D();
		A ae = new E();

		B b = (B) ab;
		B bd = new D();

//		ab.bbb : Á¢±Ù ºÒ°¡´É

		ab.method();

		if (ab instanceof B) {			//B
			System.out.println("B");
		} else {
			System.out.println("¾Æ´Ô");
		}
		if (ac instanceof B) {			//¾Æ´Ô
			System.out.println("B");
		} else {
			System.out.println("¾Æ´Ô");
		}

	}
}
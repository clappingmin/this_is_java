package chap03;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z = x / y;

		System.out.println(z);		 // Infinity(¹«ÇÑ´ë)
		System.out.println(z + 1);	 // Infinity
		System.out.println(Double.isInfinite(z));
	}
}

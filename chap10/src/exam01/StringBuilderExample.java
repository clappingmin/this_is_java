package exam01;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("java");
		sb.append(" program study");
		System.out.println(sb.toString());
		System.out.println(sb); // .toString 굳이 안적어도 된다.

		sb.insert(4, "2");
		System.out.println(sb);

		sb.insert(4, "6");
		System.out.println(sb);

	}
}

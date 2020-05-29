package chap05;

public class EnumMethodExample {
	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name); // SUNDAY

		int ordinal = today.ordinal();
		System.out.println(ordinal); // 6

		Week day1 = Week.MONDAY;
		Week day2 = Week.WENNEDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1); // 2
		System.out.println(result2); // -2

		if (args.length == 1) {
			String strday = args[0];
			Week weekDay = Week.valueOf(strday);
			if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY)
				System.out.println("주말 이군요");
			else
				System.out.println("평일 이군요");
		}

		Week[] days = Week.values();
		for (Week day : days)
			System.out.println(day);
	}
}

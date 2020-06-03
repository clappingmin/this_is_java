package exam02;

public class Classmate implements Comparable<Classmate> {
	int stunum;
	String name;

	public Classmate(int stunum, String name) {
		super();
		this.stunum = stunum;
		this.name = name;
	}

	@Override
	public int compareTo(Classmate o) {
		// TODO Auto-generated method stub
//		return stunum - o.stunum;	//학번순
		return name.compareTo(o.name);	//이름순
	}

	@Override
	public String toString() {
		return "ClassMate [stunum=" + stunum + ", name=" + name + "]";
	}

}

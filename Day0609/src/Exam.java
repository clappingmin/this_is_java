
import java.sql.Date;

public class Exam {
	public Subject subject;

	private int seq; // 1
	private String title; // 기말고사
	private Date regDate; // 2020-06-09

	public Exam() {
		subject = new Subject();
	}

	public int getKor() {
		return subject.getKor();
	}

	public void setKor(int kor) {
		subject.setKor(kor);
	}

	public int getEng() {
		return subject.getEng();
	}

	public void setEng(int eng) {
		if (eng < 0 || 100 > eng)
			subject.setEng(eng);
		subject.setEng(eng);
	}

	public int getMath() {
		return subject.getMath();
	}

	public void setMath(int math) {
		if (math < 0 || 100 > math)
			subject.setMath(math);
		subject.setMath(math);
	}

	public int getTotal() {
		return getKor() + getEng() + getMath();
	}

	public float getAvg() {
		return getTotal() / 3.0f;
	}

}

package exam02.package2;
import exam02.package1.A;

public class D extends A {
	public D() {
		super();	//A를 상속
		this.field = "value";	//A의 field
		this.method();
	}

}

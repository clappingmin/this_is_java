package exam03;

public class ProductExample {
	public static void main(String[] args) {
		Product<Tv,String> product1 = new Product<Tv,String>(); //<개체,String>
		product1.setKind(new Tv());
		product1.setModel("스마트 TV");
		Tv tv = product1.getKind();
		
		Product<Car,String> product2 = new Product<Car,String>(); //<개체,String>
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind();
		String carModel = product2.getModel();
	}
}

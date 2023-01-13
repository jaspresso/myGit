package ch07;

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car();//객체 생성
		myCar.changeGear(1);
		myCar.speedUp();
		System.out.println(myCar);
	}

}

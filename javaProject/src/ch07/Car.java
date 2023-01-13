package ch07;

public class Car {
	//멤버변수
	String color;//null
	int speed;//0 => 10
	int gear;//1
	
	//개발자용 메소드
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
	void changeGear(int g) {//g는 지역변수
		gear = g;
	}
	void speedUp() {
		speed = speed + 10;
	}
	void speedDown() {
		speed = speed - 10;
	}

}

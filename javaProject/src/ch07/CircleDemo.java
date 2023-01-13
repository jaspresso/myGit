package ch07;

public class CircleDemo {
	public static void main(String[] args) {
		Circle myCircle = new Circle();//객체 생성
		myCircle.radius = 10.0;
		myCircle.show(myCircle.radius, myCircle.findArea()); //10.0, 
	}
}


class Circle {
	//멤버 변수
	double radius;//10.0
	
	//멤버 메소드
	double findArea() {
		return 3.14 * radius * radius;//3.14*10.0*10.0
	}
	void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
	}
}

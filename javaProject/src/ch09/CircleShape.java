package ch09;

public class CircleShape extends Shape {
	private int radius;//5
	//getter,setter

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public CircleShape(int radius) {//radius=5
		super("Circle");//매개변수가 있는 부모생성자 호출
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return radius * radius * Math.PI; //5*5*3.14
	}
	
	@Override
	public void draw() {
		System.out.print("반지름이 " + radius + "인 원");
		super.draw();
	}
}

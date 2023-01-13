package ch09;

public class Shape {//extends Object
	private String name;//Circle Triangle Rectangle
	public Shape() {
		super();//Object클래스의 기본생성자 호출
	}
	
	public Shape(String name) {//name=Circle, Triangle, Rectangle
		super();
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public double calculateArea() {
		return 0;
	}
	public void draw() {
		System.out.println("도형을 그립니다.");
	}
}

package ch09;

public class TriangleShape extends Shape {
	private int width;//4
	private int height;//6
	//getter,setter
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public TriangleShape(int width, int height) {//4 6
		super("Triangle");
		this.width = width;
		this.height = height;
	}
	@Override
	public double calculateArea() {
		return width * (height*0.5);
	}
	
	@Override
	public void draw() {
		System.out.print("높이가 " + height + ", 밑변이 " + width + "인 삼각형 ");
		super.draw();
	}
}

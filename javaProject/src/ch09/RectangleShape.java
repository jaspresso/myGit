package ch09;

public class RectangleShape extends Shape {
	private int width;//5
	private int height;//8
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
	public RectangleShape(int width, int height) {//5 8
		super("Rectangle");
		this.width = width;
		this.height = height;
	}
	@Override
	public double calculateArea() {
		return width * (double)height;
	}
	@Override
	public void draw() {
		System.out.print("가로가 " + width + ", 세로가 " + height + "인 사각형 ");
		super.draw();
	}
}

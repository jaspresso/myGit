package ch09;

public class Ball extends Circle {
	private String color;//Ball클래스의 멤버변수, "빨강색"
	public Ball(String color) {
		this.color = color;
	}
	public Ball() {

	}
	public void findColor() {//Ball클래스의 멤버메소드
		System.out.println(color + "공이다.");
	}
	public void findVolume() {//Ball클래스의 멤버메소드
		System.out.println("부피 구하기");
	}
}

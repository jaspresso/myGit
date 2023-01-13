package test;

import java.util.Scanner;

public class RectangleTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("직사각형의 가로 길이 : ");
		double h = scan.nextDouble();
		System.out.println("직사각형의 세로 길이 : ");
		double v = scan.nextDouble();
		double area = h*v;
		
		System.out.println("================");
		System.out.println("직사각형의 가로 :" + h);
		System.out.println("직사각형의 세로 :" + v);
		System.out.println("넓이 : " + area);
	}

}

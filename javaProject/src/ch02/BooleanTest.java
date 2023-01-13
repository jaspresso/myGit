package ch02;

public class BooleanTest {
	public static void main(String[] args) {
		boolean b;//1bit, JVM이 1byte잡음
		b = true;//false(거짓)
		System.out.println("b : " + b);
		b = (1>2);//false
		System.out.println("b : " + b);
	}
}

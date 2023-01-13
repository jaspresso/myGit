package ch03;

public class CastEx {
	//자료형변환
	public static void main(String[] args) {
		float f = 1.6f; //4바이트
		System.out.println(f);
		
		f = 100; //자동형변환(정수100을 자동으로 float형 실수 100.0F로 변환)
		System.out.println(f);
		
		f = 100.5F;
		int i = (int)f; //강제형변환,명시적변환
		System.out.println(i);
	}
}

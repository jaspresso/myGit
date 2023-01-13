package ch02;

public class VarScope {//클래스
	static int x;//전역변수(멤버,필드)는 선언만해도 된다. 왜? 자동초기화 되기 때문
	
	public static void main(String[] args) {//메소드
		//main + Ctrl + Space ==> main메소드 자동완성
		int y=4;//지역변수는 반드시 초기화를 해야한다.
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}

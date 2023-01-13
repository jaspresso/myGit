package ch02;

public class StackEx {
	public static void main(String[] args) {
		int a=5; a=4; a=3; a=2;//지역변수를 초기화
		System.out.println(a);
		//Stack은 LIFO(Last In First Out)의 구조를 가지고 있어 맨 마지막에 들어간 변수의 값만 남는다.
	}

}

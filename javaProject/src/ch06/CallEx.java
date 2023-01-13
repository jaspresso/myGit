package ch06;

public class CallEx {
	//메소드의 위치는 main()의 위 아래 상관없다.
	public static void test(int b) {
		System.out.println("test method 호출");
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		System.out.println("시작");
		int a = 10;
		test(a);
		test2(a);
		System.out.println("끝");
	}

	public static void test2(int a) {
		System.out.println(a);
	}

}

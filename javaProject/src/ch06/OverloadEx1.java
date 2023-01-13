package ch06;

public class OverloadEx1 {
	public static void main(String[] args) {
		print(10.5);
		print("hello");
		print(100);
		print("Hi", "Java");
	}
    //메소드 오버로딩 
	//1)메소드의 이름이 같고
	//2)매개변수의 갯수가 다르거나 데이터타입이 달라야 한다.
	static void print(double a) {
		System.out.println(a);
	}
	static void print(String b) {
		System.out.println(b);
	}
	static void print(int c) {
		System.out.println(c);
	}
	
	static void print(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}
}
